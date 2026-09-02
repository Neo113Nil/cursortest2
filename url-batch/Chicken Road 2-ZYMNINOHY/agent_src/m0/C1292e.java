package m0;

import W.J;
import android.os.Handler;
import d2.C0389g;
import i2.AbstractC0457a;

/* renamed from: m0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1292e implements u0.k {

    /* renamed from: a, reason: collision with root package name */
    public final int f14351a;

    /* renamed from: b, reason: collision with root package name */
    public final v f14352b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.flutter.pigeon.a f14353c;

    /* renamed from: d, reason: collision with root package name */
    public final C0389g f14354d;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1290c f14356f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC1291d f14357g;

    /* renamed from: h, reason: collision with root package name */
    public C1293f f14358h;

    /* renamed from: i, reason: collision with root package name */
    public y0.k f14359i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f14360j;

    /* renamed from: l, reason: collision with root package name */
    public volatile long f14362l;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f14355e = J.o(null);

    /* renamed from: k, reason: collision with root package name */
    public volatile long f14361k = -9223372036854775807L;

    public C1292e(int i4, v vVar, io.appmetrica.analytics.flutter.pigeon.a aVar, C0389g c0389g, InterfaceC1290c interfaceC1290c) {
        this.f14351a = i4;
        this.f14352b = vVar;
        this.f14353c = aVar;
        this.f14354d = c0389g;
        this.f14356f = interfaceC1290c;
    }

    @Override // u0.k
    public final void c() {
        if (this.f14360j) {
            this.f14360j = false;
        }
        try {
            if (this.f14357g == null) {
                InterfaceC1291d a3 = this.f14356f.a(this.f14351a);
                this.f14357g = a3;
                this.f14355e.post(new Q1.a(this, a3.c(), this.f14357g, 14));
                InterfaceC1291d interfaceC1291d = this.f14357g;
                interfaceC1291d.getClass();
                this.f14359i = new y0.k(interfaceC1291d, 0L, -1L);
                C1293f c1293f = new C1293f(this.f14352b.f14461a, this.f14351a);
                this.f14358h = c1293f;
                c1293f.e(this.f14354d);
            }
            while (!this.f14360j) {
                if (this.f14361k != -9223372036854775807L) {
                    C1293f c1293f2 = this.f14358h;
                    c1293f2.getClass();
                    c1293f2.a(this.f14362l, this.f14361k);
                    this.f14361k = -9223372036854775807L;
                }
                C1293f c1293f3 = this.f14358h;
                c1293f3.getClass();
                y0.k kVar = this.f14359i;
                kVar.getClass();
                if (c1293f3.c(kVar, new T.r()) == -1) {
                    break;
                }
            }
            this.f14360j = false;
            InterfaceC1291d interfaceC1291d2 = this.f14357g;
            interfaceC1291d2.getClass();
            if (interfaceC1291d2.j()) {
                AbstractC0457a.f(this.f14357g);
                this.f14357g = null;
            }
        } catch (Throwable th) {
            InterfaceC1291d interfaceC1291d3 = this.f14357g;
            interfaceC1291d3.getClass();
            if (interfaceC1291d3.j()) {
                AbstractC0457a.f(this.f14357g);
                this.f14357g = null;
            }
            throw th;
        }
    }

    @Override // u0.k
    public final void d() {
        this.f14360j = true;
    }
}
