package androidx.browser.trusted;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.trusted.ITrustedWebActivityService;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes14.dex */
class ConnectionHolder implements ServiceConnection {
    private Exception mCancellationException;
    private final Runnable mCloseRunnable;
    private List mCompleters;
    private TrustedWebActivityServiceConnection mService;
    private int mState;
    private final WrapperFactory mWrapperFactory;

    static class WrapperFactory {
        TrustedWebActivityServiceConnection create(ComponentName componentName, IBinder iBinder) {
            return new TrustedWebActivityServiceConnection(ITrustedWebActivityService.Stub.asInterface(iBinder), componentName);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.mService = this.mWrapperFactory.create(componentName, iBinder);
        Iterator it = this.mCompleters.iterator();
        while (it.hasNext()) {
            ((CallbackToFutureAdapter.Completer) it.next()).set(this.mService);
        }
        this.mCompleters.clear();
        this.mState = 1;
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.mService = null;
        this.mCloseRunnable.run();
        this.mState = 2;
    }

    public void cancel(Exception exc) {
        Iterator it = this.mCompleters.iterator();
        while (it.hasNext()) {
            ((CallbackToFutureAdapter.Completer) it.next()).setException(exc);
        }
        this.mCompleters.clear();
        this.mCloseRunnable.run();
        this.mState = 3;
        this.mCancellationException = exc;
    }
}
