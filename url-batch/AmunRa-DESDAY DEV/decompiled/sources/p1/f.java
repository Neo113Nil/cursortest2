package p1;

import java.util.ArrayList;
import k1.n;
import k1.o;
import k1.u;
import o1.j;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final j f3467a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3468b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3469c;
    public final o1.e d;

    /* renamed from: e, reason: collision with root package name */
    public final H.e f3470e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3471f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3472g;
    public final int h;
    public int i;

    public f(j jVar, ArrayList arrayList, int i, o1.e eVar, H.e eVar2, int i2, int i3, int i4) {
        Z0.d.e(jVar, "call");
        this.f3467a = jVar;
        this.f3468b = arrayList;
        this.f3469c = i;
        this.d = eVar;
        this.f3470e = eVar2;
        this.f3471f = i2;
        this.f3472g = i3;
        this.h = i4;
    }

    public static f a(f fVar, int i, o1.e eVar, H.e eVar2, int i2) {
        if ((i2 & 1) != 0) {
            i = fVar.f3469c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            eVar = fVar.d;
        }
        o1.e eVar3 = eVar;
        if ((i2 & 4) != 0) {
            eVar2 = fVar.f3470e;
        }
        H.e eVar4 = eVar2;
        int i4 = fVar.f3471f;
        int i5 = fVar.f3472g;
        int i6 = fVar.h;
        fVar.getClass();
        Z0.d.e(eVar4, "request");
        return new f(fVar.f3467a, fVar.f3468b, i3, eVar3, eVar4, i4, i5, i6);
    }

    public final u b(H.e eVar) {
        Z0.d.e(eVar, "request");
        ArrayList arrayList = this.f3468b;
        int size = arrayList.size();
        int i = this.f3469c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.i++;
        o1.e eVar2 = this.d;
        if (eVar2 != null) {
            if (!eVar2.f3378b.b((n) eVar.f199c)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i2 = i + 1;
        f a2 = a(this, i2, null, eVar, 58);
        o oVar = (o) arrayList.get(i);
        u a3 = oVar.a(a2);
        if (a3 == null) {
            throw new NullPointerException("interceptor " + oVar + " returned null");
        }
        if (eVar2 != null && i2 < arrayList.size() && a2.i != 1) {
            throw new IllegalStateException(("network interceptor " + oVar + " must call proceed() exactly once").toString());
        }
        if (a3.f2902g != null) {
            return a3;
        }
        throw new IllegalStateException(("interceptor " + oVar + " returned a response with no body").toString());
    }
}
