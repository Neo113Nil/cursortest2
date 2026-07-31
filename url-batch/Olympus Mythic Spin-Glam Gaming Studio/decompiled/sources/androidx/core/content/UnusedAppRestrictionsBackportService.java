package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService;

/* loaded from: classes14.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {
    private IUnusedAppRestrictionsBackportService.Stub mBinder;

    protected abstract void isPermissionRevocationEnabled(UnusedAppRestrictionsBackportCallback unusedAppRestrictionsBackportCallback);

    /* renamed from: androidx.core.content.UnusedAppRestrictionsBackportService$1, reason: invalid class name */
    class AnonymousClass1 extends IUnusedAppRestrictionsBackportService.Stub {
        final /* synthetic */ UnusedAppRestrictionsBackportService this$0;

        @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
        public void isPermissionRevocationEnabledForApp(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) {
            if (iUnusedAppRestrictionsBackportCallback == null) {
                return;
            }
            this.this$0.isPermissionRevocationEnabled(new UnusedAppRestrictionsBackportCallback(iUnusedAppRestrictionsBackportCallback));
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.mBinder;
    }
}
