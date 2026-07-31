package j2;

import a0.a0;
import a0.t;
import a7.j1;
import a7.x;
import android.graphics.Typeface;
import o.s;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final w5.f f3985a;

    /* renamed from: b, reason: collision with root package name */
    public final a f3986b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f3987c;

    /* renamed from: d, reason: collision with root package name */
    public final h f3988d;

    /* renamed from: e, reason: collision with root package name */
    public final b1.b f3989e;

    public e(w5.f fVar, a aVar) {
        a0 a0Var = f.f3990a;
        a0 a0Var2 = f.f3990a;
        h hVar = new h();
        g gVar = h.f3991a;
        b7.e eVar = n2.h.f5330a;
        gVar.getClass();
        x.a(a.a.v(gVar, eVar).c(g6.i.f3046d).c(new j1(null)));
        b1.b bVar = new b1.b(17);
        this.f3985a = fVar;
        this.f3986b = aVar;
        this.f3987c = a0Var;
        this.f3988d = hVar;
        this.f3989e = bVar;
        new t(12, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a2 A[Catch: Exception -> 0x00aa, TRY_ENTER, TryCatch #0 {Exception -> 0x00aa, blocks: (B:25:0x0044, B:27:0x0057, B:30:0x005c, B:32:0x0060, B:33:0x0079, B:49:0x00a2, B:50:0x00a9, B:53:0x0069, B:54:0x006b, B:55:0x006e, B:56:0x0074), top: B:24:0x0044 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r a(q qVar) {
        Typeface d8;
        r rVar;
        Object remove;
        a0 a0Var = this.f3987c;
        synchronized (((w5.f) a0Var.f11e)) {
            try {
                r rVar2 = (r) ((s) a0Var.f12f).c(qVar);
                if (rVar2 != null) {
                    if (rVar2.f4009e) {
                        return rVar2;
                    }
                    s sVar = (s) a0Var.f12f;
                    synchronized (((p.b) sVar.f5535g)) {
                        l4.d dVar = (l4.d) sVar.f5534f;
                        dVar.getClass();
                        remove = dVar.f4831a.remove(qVar);
                        if (remove != null) {
                            sVar.f5531c--;
                        }
                    }
                }
                try {
                    this.f3988d.getClass();
                    p pVar = qVar.f4003a;
                    w5.f fVar = (w5.f) this.f3989e.f1050e;
                    int i = qVar.f4005c;
                    k kVar = qVar.f4004b;
                    if (pVar != null && !(pVar instanceof b)) {
                        if (pVar instanceof m) {
                            d8 = fVar.f((m) pVar, kVar, i);
                            rVar = new r(d8);
                            if (rVar == null) {
                                throw new IllegalStateException("Could not load font");
                            }
                            synchronized (((w5.f) a0Var.f11e)) {
                                if (((s) a0Var.f12f).c(qVar) == null && rVar.f4009e) {
                                    ((s) a0Var.f12f).f(qVar, rVar);
                                }
                            }
                            return rVar;
                        }
                        rVar = null;
                        if (rVar == null) {
                        }
                    }
                    switch (fVar.f8085d) {
                        case 24:
                            d8 = w5.f.d(null, kVar, i);
                            break;
                        default:
                            d8 = w5.f.e(null, kVar, i);
                            break;
                    }
                    rVar = new r(d8);
                    if (rVar == null) {
                    }
                } catch (Exception e8) {
                    throw new IllegalStateException("Could not load font", e8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final r b(p pVar, k kVar, int i, int i8) {
        a aVar = this.f3986b;
        aVar.getClass();
        int i9 = aVar.f3984d;
        k kVar2 = (i9 == 0 || i9 == Integer.MAX_VALUE) ? kVar : new k(r2.o.t(kVar.f3998d + i9, 1, 1000));
        this.f3985a.getClass();
        return a(new q(pVar, kVar2, i, i8, null));
    }
}
