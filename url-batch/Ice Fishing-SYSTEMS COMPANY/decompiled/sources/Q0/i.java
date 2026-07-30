package Q0;

import J0.s;
import android.content.Context;
import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public final class i extends f {

    /* renamed from: f, reason: collision with root package name */
    public final ConnectivityManager f2709f;

    /* renamed from: g, reason: collision with root package name */
    public final h f2710g;

    public i(Context context, Y2.e eVar) {
        super(context, eVar);
        Object systemService = this.f2702b.getSystemService("connectivity");
        kotlin.jvm.internal.h.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f2709f = (ConnectivityManager) systemService;
        this.f2710g = new h(0, this);
    }

    @Override // Q0.f
    public final Object a() {
        return j.a(this.f2709f);
    }

    @Override // Q0.f
    public final void d() {
        try {
            s.d().a(j.f2711a, "Registering network callback");
            T0.i.a(this.f2709f, this.f2710g);
        } catch (IllegalArgumentException e6) {
            s.d().c(j.f2711a, "Received exception while registering network callback", e6);
        } catch (SecurityException e9) {
            s.d().c(j.f2711a, "Received exception while registering network callback", e9);
        }
    }

    @Override // Q0.f
    public final void e() {
        try {
            s.d().a(j.f2711a, "Unregistering network callback");
            T0.g.c(this.f2709f, this.f2710g);
        } catch (IllegalArgumentException e6) {
            s.d().c(j.f2711a, "Received exception while unregistering network callback", e6);
        } catch (SecurityException e9) {
            s.d().c(j.f2711a, "Received exception while unregistering network callback", e9);
        }
    }
}
