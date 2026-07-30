package M2;

import R5.m;
import com.onesignal.flutter.OneSignalNotifications;
import kotlin.coroutines.CoroutineContext;
import n6.F;
import r4.l;
import s6.n;
import u6.C0953e;

/* loaded from: classes.dex */
public final class e implements V5.b {

    /* renamed from: d, reason: collision with root package name */
    public final l f1740d;

    public e(OneSignalNotifications oneSignalNotifications, l lVar) {
        this.f1740d = lVar;
    }

    @Override // V5.b
    public final CoroutineContext getContext() {
        C0953e c0953e = F.f7011a;
        return n.f7850a;
    }

    @Override // V5.b
    public final void resumeWith(Object obj) {
        boolean z7 = obj instanceof m;
        l lVar = this.f1740d;
        if (!z7) {
            a.f(obj, lVar);
            return;
        }
        Throwable th = ((m) obj).f2420d;
        a.d("requestPermission failed with error: " + th.getMessage() + "\n" + th.getStackTrace(), lVar);
    }
}
