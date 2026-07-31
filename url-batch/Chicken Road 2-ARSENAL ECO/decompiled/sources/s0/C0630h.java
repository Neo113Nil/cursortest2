package s0;

import android.content.Context;
import android.net.ConnectivityManager;
import l0.q;

/* renamed from: s0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0630h extends AbstractC0627e {

    /* renamed from: f, reason: collision with root package name */
    public final ConnectivityManager f5876f;

    /* renamed from: g, reason: collision with root package name */
    public final C0629g f5877g;

    public C0630h(Context context, B0.c cVar) {
        super(context, cVar);
        Object systemService = this.f5870b.getSystemService("connectivity");
        kotlin.jvm.internal.i.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f5876f = (ConnectivityManager) systemService;
        this.f5877g = new C0629g(this);
    }

    @Override // s0.AbstractC0627e
    public final Object a() {
        return i.a(this.f5876f);
    }

    @Override // s0.AbstractC0627e
    public final void d() {
        try {
            q.d().a(i.f5878a, "Registering network callback");
            v0.h.a(this.f5876f, this.f5877g);
        } catch (IllegalArgumentException e4) {
            q.d().c(i.f5878a, "Received exception while registering network callback", e4);
        } catch (SecurityException e7) {
            q.d().c(i.f5878a, "Received exception while registering network callback", e7);
        }
    }

    @Override // s0.AbstractC0627e
    public final void e() {
        try {
            q.d().a(i.f5878a, "Unregistering network callback");
            v0.f.c(this.f5876f, this.f5877g);
        } catch (IllegalArgumentException e4) {
            q.d().c(i.f5878a, "Received exception while unregistering network callback", e4);
        } catch (SecurityException e7) {
            q.d().c(i.f5878a, "Received exception while unregistering network callback", e7);
        }
    }
}
