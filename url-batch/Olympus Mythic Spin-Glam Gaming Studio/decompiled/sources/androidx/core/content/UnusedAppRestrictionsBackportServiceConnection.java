package androidx.core.content;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService;

/* loaded from: classes10.dex */
class UnusedAppRestrictionsBackportServiceConnection implements ServiceConnection {
    ResolvableFuture mResultFuture;
    IUnusedAppRestrictionsBackportService mUnusedAppRestrictionsService;

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IUnusedAppRestrictionsBackportService asInterface = IUnusedAppRestrictionsBackportService.Stub.asInterface(iBinder);
        this.mUnusedAppRestrictionsService = asInterface;
        try {
            asInterface.isPermissionRevocationEnabledForApp(getBackportCallback());
        } catch (RemoteException unused) {
            this.mResultFuture.set(0);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.mUnusedAppRestrictionsService = null;
    }

    private IUnusedAppRestrictionsBackportCallback getBackportCallback() {
        return new IUnusedAppRestrictionsBackportCallback.Stub() { // from class: androidx.core.content.UnusedAppRestrictionsBackportServiceConnection.1
            @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
            public void onIsPermissionRevocationEnabledForAppResult(boolean z, boolean z2) {
                if (!z) {
                    UnusedAppRestrictionsBackportServiceConnection.this.mResultFuture.set(0);
                    Log.e("PackageManagerCompat", "Unable to retrieve the permission revocation setting from the backport");
                } else if (z2) {
                    UnusedAppRestrictionsBackportServiceConnection.this.mResultFuture.set(3);
                } else {
                    UnusedAppRestrictionsBackportServiceConnection.this.mResultFuture.set(2);
                }
            }
        };
    }
}
