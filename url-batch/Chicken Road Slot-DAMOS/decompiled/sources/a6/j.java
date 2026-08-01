package a6;

import a1.n;
import android.content.Context;
import android.net.ConnectivityManager;
import t5.o;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j extends g {

    /* renamed from: f, reason: collision with root package name */
    public final ConnectivityManager f309f;
    public final i g;

    public j(Context context, n nVar) {
        super(context, nVar);
        Object systemService = this.f303b.getSystemService("connectivity");
        systemService.getClass();
        this.f309f = (ConnectivityManager) systemService;
        this.g = new i(this);
    }

    @Override // a6.g
    public final Object a() {
        return k.a(this.f309f);
    }

    @Override // a6.g
    public final void d() {
        try {
            o.d().a(k.f310a, "Registering network callback");
            d6.i.a(this.f309f, this.g);
        } catch (IllegalArgumentException e2) {
            o.d().c(k.f310a, "Received exception while registering network callback", e2);
        } catch (SecurityException e9) {
            o.d().c(k.f310a, "Received exception while registering network callback", e9);
        }
    }

    @Override // a6.g
    public final void e() {
        try {
            o.d().a(k.f310a, "Unregistering network callback");
            d6.g.c(this.f309f, this.g);
        } catch (IllegalArgumentException e2) {
            o.d().c(k.f310a, "Received exception while unregistering network callback", e2);
        } catch (SecurityException e9) {
            o.d().c(k.f310a, "Received exception while unregistering network callback", e9);
        }
    }
}
