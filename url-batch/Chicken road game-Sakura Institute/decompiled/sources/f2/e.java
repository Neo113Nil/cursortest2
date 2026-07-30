package f2;

import android.graphics.Typeface;
import c7.a0;
import c7.n1;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final j4.i f3268a;

    /* renamed from: b, reason: collision with root package name */
    public final a f3269b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.room.c f3270c;

    /* renamed from: d, reason: collision with root package name */
    public final h f3271d;

    /* renamed from: e, reason: collision with root package name */
    public final b6.c f3272e;

    public e(j4.i iVar, a aVar) {
        androidx.room.c cVar = f.f3273a;
        androidx.room.c cVar2 = f.f3273a;
        h hVar = new h();
        g gVar = h.f3274a;
        d7.e eVar = i2.h.f4882a;
        gVar.getClass();
        a0.a(t6.a.I(gVar, eVar).z(h6.j.f4661f).z(new n1(null)));
        b6.c cVar3 = new b6.c(11);
        this.f3268a = iVar;
        this.f3269b = aVar;
        this.f3270c = cVar;
        this.f3271d = hVar;
        this.f3272e = cVar3;
        new c1.a(5, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0099 A[Catch: Exception -> 0x00a1, TRY_ENTER, TryCatch #3 {Exception -> 0x00a1, blocks: (B:25:0x0047, B:29:0x0060, B:30:0x006f, B:45:0x0099, B:46:0x00a0, B:48:0x0065, B:50:0x0069, B:52:0x005c), top: B:24:0x0047 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s a(r rVar) {
        s sVar;
        Typeface b9;
        Object remove;
        androidx.room.c cVar = this.f3270c;
        synchronized (((m4.f) cVar.f1069g)) {
            try {
                s sVar2 = (s) ((e2.b) cVar.f1070h).a(rVar);
                if (sVar2 != null) {
                    if (sVar2.f3291g) {
                        return sVar2;
                    }
                    e2.b bVar = (e2.b) cVar.f1070h;
                    synchronized (((m4.f) bVar.f2740e)) {
                        remove = ((HashMap) bVar.f2741f).remove(rVar);
                        ((LinkedHashSet) bVar.f2742g).remove(rVar);
                        if (remove != null) {
                            bVar.f2737b = bVar.e() - 1;
                        }
                    }
                }
                try {
                    this.f3271d.getClass();
                    q qVar = rVar.f3285a;
                    p pVar = (p) this.f3272e.f1394g;
                    int i7 = rVar.f3287c;
                    k kVar = rVar.f3286b;
                    if (qVar == null ? true : qVar instanceof b) {
                        b9 = pVar.a(kVar, i7);
                    } else {
                        if (!(qVar instanceof m)) {
                            sVar = null;
                            if (sVar != null) {
                                throw new IllegalStateException("Could not load font");
                            }
                            synchronized (((m4.f) cVar.f1069g)) {
                                if (((e2.b) cVar.f1070h).a(rVar) == null && sVar.f3291g) {
                                    ((e2.b) cVar.f1070h).b(rVar, sVar);
                                }
                            }
                            return sVar;
                        }
                        b9 = pVar.b((m) qVar, kVar, i7);
                    }
                    sVar = new s(b9);
                    if (sVar != null) {
                    }
                } catch (Exception e9) {
                    throw new IllegalStateException("Could not load font", e9);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final s b(q qVar, k kVar, int i7, int i8) {
        a aVar = this.f3269b;
        aVar.getClass();
        int i9 = aVar.f3267f;
        k kVar2 = (i9 == 0 || i9 == Integer.MAX_VALUE) ? kVar : new k(v1.g.e(kVar.f3280f + i9, 1, 1000));
        this.f3268a.getClass();
        return a(new r(qVar, kVar2, i7, i8, null));
    }
}
