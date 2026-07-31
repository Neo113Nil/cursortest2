package k2;

import H5.F;
import M5.o;
import N3.j;
import com.onesignal.flutter.OneSignalNotifications;
import k5.C0478h;
import o5.InterfaceC0564d;
import o5.InterfaceC0569i;

/* loaded from: classes.dex */
public final class e implements InterfaceC0564d {

    /* renamed from: f, reason: collision with root package name */
    public final j f5187f;

    public e(OneSignalNotifications oneSignalNotifications, j jVar) {
        this.f5187f = jVar;
    }

    @Override // o5.InterfaceC0564d
    public final InterfaceC0569i getContext() {
        O5.d dVar = F.f1027a;
        return o.f1618a;
    }

    @Override // o5.InterfaceC0564d
    public final void resumeWith(Object obj) {
        boolean z5 = obj instanceof C0478h;
        j jVar = this.f5187f;
        if (!z5) {
            AbstractC0467a.f(jVar, obj);
            return;
        }
        Throwable th = ((C0478h) obj).f5200f;
        AbstractC0467a.d(jVar, "requestPermission failed with error: " + th.getMessage() + "\n" + th.getStackTrace());
    }
}
