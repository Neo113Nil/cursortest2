package C0;

import B0.C0031i;
import I.C0079n;
import android.content.Context;
import android.util.Log;
import j.C0239o;
import m0.AbstractActivityC0264d;
import s0.InterfaceC0304a;
import t0.InterfaceC0308a;
import w0.InterfaceC0320f;

/* loaded from: classes.dex */
public final class g implements InterfaceC0304a, InterfaceC0308a {

    /* renamed from: e, reason: collision with root package name */
    public C0031i f228e;

    @Override // t0.InterfaceC0308a
    public final void a(C0239o c0239o) {
        C0031i c0031i = this.f228e;
        if (c0031i == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            c0031i.f156h = (AbstractActivityC0264d) c0239o.f3015a;
        }
    }

    @Override // t0.InterfaceC0308a
    public final void b(C0239o c0239o) {
        a(c0239o);
    }

    @Override // t0.InterfaceC0308a
    public final void c() {
        C0031i c0031i = this.f228e;
        if (c0031i == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            c0031i.f156h = null;
        }
    }

    @Override // t0.InterfaceC0308a
    public final void d() {
        c();
    }

    @Override // s0.InterfaceC0304a
    public final void j(C0079n c0079n) {
        C0031i c0031i = new C0031i((Context) c0079n.f689e);
        this.f228e = c0031i;
        A0.b.m((InterfaceC0320f) c0079n.f690f, c0031i);
    }

    @Override // s0.InterfaceC0304a
    public final void k(C0079n c0079n) {
        if (this.f228e == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
        } else {
            A0.b.m((InterfaceC0320f) c0079n.f690f, null);
            this.f228e = null;
        }
    }
}
