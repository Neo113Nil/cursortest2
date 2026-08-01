package n1;

import i1.m;
import i1.n;
import i1.t;
import java.util.ArrayList;
import m1.j;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final j f3292a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3293b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3294c;
    public final m1.e d;

    /* renamed from: e, reason: collision with root package name */
    public final H.e f3295e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3296f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3297g;
    public final int h;
    public int i;

    public f(j jVar, ArrayList arrayList, int i, m1.e eVar, H.e eVar2, int i2, int i3, int i4) {
        X0.d.e(jVar, "call");
        this.f3292a = jVar;
        this.f3293b = arrayList;
        this.f3294c = i;
        this.d = eVar;
        this.f3295e = eVar2;
        this.f3296f = i2;
        this.f3297g = i3;
        this.h = i4;
    }

    public static f a(f fVar, int i, m1.e eVar, H.e eVar2, int i2) {
        if ((i2 & 1) != 0) {
            i = fVar.f3294c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            eVar = fVar.d;
        }
        m1.e eVar3 = eVar;
        if ((i2 & 4) != 0) {
            eVar2 = fVar.f3295e;
        }
        H.e eVar4 = eVar2;
        int i4 = fVar.f3296f;
        int i5 = fVar.f3297g;
        int i6 = fVar.h;
        fVar.getClass();
        X0.d.e(eVar4, "request");
        return new f(fVar.f3292a, fVar.f3293b, i3, eVar3, eVar4, i4, i5, i6);
    }

    public final t b(H.e eVar) {
        X0.d.e(eVar, "request");
        ArrayList arrayList = this.f3293b;
        int size = arrayList.size();
        int i = this.f3294c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.i++;
        m1.e eVar2 = this.d;
        if (eVar2 != null) {
            if (!eVar2.f3198b.b((m) eVar.f213c)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i2 = i + 1;
        f a2 = a(this, i2, null, eVar, 58);
        n nVar = (n) arrayList.get(i);
        t a3 = nVar.a(a2);
        if (a3 == null) {
            throw new NullPointerException("interceptor " + nVar + " returned null");
        }
        if (eVar2 != null && i2 < arrayList.size() && a2.i != 1) {
            throw new IllegalStateException(("network interceptor " + nVar + " must call proceed() exactly once").toString());
        }
        if (a3.f2511g != null) {
            return a3;
        }
        throw new IllegalStateException(("interceptor " + nVar + " returned a response with no body").toString());
    }
}
