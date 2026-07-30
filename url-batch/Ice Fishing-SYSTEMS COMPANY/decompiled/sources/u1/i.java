package u1;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import m.Q0;
import s1.InterfaceC4992e;
import u.AbstractC5088e;
import y1.C5243r;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Class f41122a;

    /* renamed from: b, reason: collision with root package name */
    public final List f41123b;

    /* renamed from: c, reason: collision with root package name */
    public final G1.c f41124c;

    /* renamed from: d, reason: collision with root package name */
    public final Y2.e f41125d;

    /* renamed from: e, reason: collision with root package name */
    public final String f41126e;

    public i(Class cls, Class cls2, Class cls3, List list, G1.c cVar, Y2.e eVar) {
        this.f41122a = cls;
        this.f41123b = list;
        this.f41124c = cVar;
        this.f41125d = eVar;
        this.f41126e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b8, code lost:
    
        if (r0 == 3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bd, code lost:
    
        if (r2 != 2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ba, code lost:
    
        if (r0 == 1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final x a(int i, int i4, G1.a aVar, com.bumptech.glide.load.data.f fVar, s1.h hVar) {
        x xVar;
        s1.l lVar;
        int i9;
        boolean z8;
        boolean z9;
        boolean z10;
        InterfaceC4992e c5104d;
        Y2.e eVar = this.f41125d;
        List list = (List) eVar.l();
        try {
            x b9 = b(fVar, i, i4, hVar, list);
            eVar.G(list);
            h hVar2 = (h) aVar.f1195v;
            hVar2.getClass();
            Class<?> cls = b9.get().getClass();
            int i10 = aVar.f1194u;
            g gVar = hVar2.f41115n;
            s1.k kVar = null;
            if (i10 != 4) {
                s1.l e6 = gVar.e(cls);
                lVar = e6;
                xVar = e6.b(hVar2.f41091A, b9, hVar2.f41095E, hVar2.f41096F);
            } else {
                xVar = b9;
                lVar = null;
            }
            if (!b9.equals(xVar)) {
                b9.a();
            }
            if (gVar.f41075c.a().f23565d.c(xVar.d()) != null) {
                com.bumptech.glide.l a9 = gVar.f41075c.a();
                a9.getClass();
                kVar = a9.f23565d.c(xVar.d());
                if (kVar == null) {
                    throw new com.bumptech.glide.k(xVar.d());
                }
                i9 = kVar.q(hVar2.f41098H);
            } else {
                i9 = 3;
            }
            s1.k kVar2 = kVar;
            InterfaceC4992e interfaceC4992e = hVar2.f41105P;
            ArrayList b10 = gVar.b();
            int size = b10.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    z8 = false;
                    break;
                }
                if (((C5243r) b10.get(i11)).f41857a.equals(interfaceC4992e)) {
                    z8 = true;
                    break;
                }
                i11++;
            }
            switch (hVar2.f41097G.f41130a) {
                default:
                    z9 = true;
                    if (!z8) {
                        break;
                    }
                    break;
                case 0:
                case 1:
                    z9 = false;
                    break;
            }
            if (z9) {
                if (kVar2 == null) {
                    throw new com.bumptech.glide.k(xVar.get().getClass());
                }
                int d2 = AbstractC5088e.d(i9);
                if (d2 == 0) {
                    z10 = true;
                    c5104d = new C5104d(hVar2.f41105P, hVar2.f41092B);
                } else {
                    if (d2 != 1) {
                        throw new IllegalArgumentException("Unknown strategy: ".concat(i9 != 1 ? i9 != 2 ? i9 != 3 ? "null" : "NONE" : "TRANSFORMED" : "SOURCE"));
                    }
                    z10 = true;
                    c5104d = new z(gVar.f41075c.f23548a, hVar2.f41105P, hVar2.f41092B, hVar2.f41095E, hVar2.f41096F, lVar, cls, hVar2.f41098H);
                }
                w wVar = (w) w.f41194x.l();
                wVar.f41198w = false;
                wVar.f41197v = z10;
                wVar.f41196u = xVar;
                Q0 q02 = hVar2.f41120y;
                q02.f39325b = c5104d;
                q02.f39326c = kVar2;
                q02.f39327d = wVar;
                xVar = wVar;
            }
            return this.f41124c.g(xVar, hVar);
        } catch (Throwable th) {
            eVar.G(list);
            throw th;
        }
    }

    public final x b(com.bumptech.glide.load.data.f fVar, int i, int i4, s1.h hVar, List list) {
        List list2 = this.f41123b;
        int size = list2.size();
        x xVar = null;
        for (int i9 = 0; i9 < size; i9++) {
            s1.j jVar = (s1.j) list2.get(i9);
            try {
                if (jVar.b(fVar.n(), hVar)) {
                    xVar = jVar.a(fVar.n(), i, i4, hVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e6) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + jVar, e6);
                }
                list.add(e6);
            }
            if (xVar != null) {
                break;
            }
        }
        if (xVar != null) {
            return xVar;
        }
        throw new s(this.f41126e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f41122a + ", decoders=" + this.f41123b + ", transcoder=" + this.f41124c + '}';
    }
}
