package j0;

import I.C0079n;
import P.O;
import Q0.h;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import s0.InterfaceC0304a;
import w0.InterfaceC0320f;

/* renamed from: j0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0250a implements InterfaceC0304a {

    /* renamed from: e, reason: collision with root package name */
    public C0079n f3102e;

    @Override // s0.InterfaceC0304a
    public final void j(C0079n c0079n) {
        h.e(c0079n, "binding");
        InterfaceC0320f interfaceC0320f = (InterfaceC0320f) c0079n.f690f;
        h.d(interfaceC0320f, "binding.binaryMessenger");
        Context context = (Context) c0079n.f689e;
        h.d(context, "binding.applicationContext");
        this.f3102e = new C0079n(interfaceC0320f, "dev.fluttercommunity.plus/device_info");
        PackageManager packageManager = context.getPackageManager();
        h.d(packageManager, "context.packageManager");
        Object systemService = context.getSystemService("activity");
        h.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        O o2 = new O(10, packageManager, (ActivityManager) systemService);
        C0079n c0079n2 = this.f3102e;
        if (c0079n2 != null) {
            c0079n2.j(o2);
        } else {
            h.g("methodChannel");
            throw null;
        }
    }

    @Override // s0.InterfaceC0304a
    public final void k(C0079n c0079n) {
        h.e(c0079n, "binding");
        C0079n c0079n2 = this.f3102e;
        if (c0079n2 != null) {
            c0079n2.j(null);
        } else {
            h.g("methodChannel");
            throw null;
        }
    }
}
