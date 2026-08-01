package r1;

import java.util.ArrayList;
import m1.m;
import m1.n;
import m1.t;
import q1.j;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final j f3573a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3574b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3575c;
    public final q1.e d;

    /* renamed from: e, reason: collision with root package name */
    public final H.e f3576e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3577f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3578g;
    public final int h;
    public int i;

    public f(j jVar, ArrayList arrayList, int i, q1.e eVar, H.e eVar2, int i2, int i3, int i4) {
        b1.d.e(jVar, "call");
        this.f3573a = jVar;
        this.f3574b = arrayList;
        this.f3575c = i;
        this.d = eVar;
        this.f3576e = eVar2;
        this.f3577f = i2;
        this.f3578g = i3;
        this.h = i4;
    }

    public static f a(f fVar, int i, q1.e eVar, H.e eVar2, int i2) {
        if ((i2 & 1) != 0) {
            i = fVar.f3575c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            eVar = fVar.d;
        }
        q1.e eVar3 = eVar;
        if ((i2 & 4) != 0) {
            eVar2 = fVar.f3576e;
        }
        H.e eVar4 = eVar2;
        int i4 = fVar.f3577f;
        int i5 = fVar.f3578g;
        int i6 = fVar.h;
        fVar.getClass();
        b1.d.e(eVar4, "request");
        return new f(fVar.f3573a, fVar.f3574b, i3, eVar3, eVar4, i4, i5, i6);
    }

    public final t b(H.e eVar) {
        b1.d.e(eVar, "request");
        ArrayList arrayList = this.f3574b;
        int size = arrayList.size();
        int i = this.f3575c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.i++;
        q1.e eVar2 = this.d;
        if (eVar2 != null) {
            if (!eVar2.f3512b.b((m) eVar.f275c)) {
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
        if (a3.f3287g != null) {
            return a3;
        }
        throw new IllegalStateException(("interceptor " + nVar + " returned a response with no body").toString());
    }
}
