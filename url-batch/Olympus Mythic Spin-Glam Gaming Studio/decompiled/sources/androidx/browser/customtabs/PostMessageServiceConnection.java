package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.IPostMessageService;

/* loaded from: classes10.dex */
public abstract class PostMessageServiceConnection implements PostMessageBackend, ServiceConnection {
    private final Object mLock;
    private boolean mMessageChannelCreated;
    private IPostMessageService mService;
    private final ICustomTabsCallback mSessionBinder;

    public void onPostMessageServiceDisconnected() {
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.mService = IPostMessageService.Stub.asInterface(iBinder);
        onPostMessageServiceConnected();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.mService = null;
        onPostMessageServiceDisconnected();
    }

    private boolean notifyMessageChannelReadyInternal(Bundle bundle) {
        if (this.mService == null) {
            return false;
        }
        synchronized (this.mLock) {
            try {
                try {
                    this.mService.onMessageChannelReady(this.mSessionBinder, bundle);
                } catch (RemoteException unused) {
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public void onPostMessageServiceConnected() {
        if (this.mMessageChannelCreated) {
            notifyMessageChannelReadyInternal(null);
        }
    }
}
