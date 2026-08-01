package w1;

import java.util.ArrayList;
import r1.m;
import r1.n;
import r1.t;
import v1.j;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final j f4098a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4099b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4100c;
    public final v1.e d;

    /* renamed from: e, reason: collision with root package name */
    public final H.e f4101e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4102f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4103g;
    public final int h;
    public int i;

    public f(j jVar, ArrayList arrayList, int i, v1.e eVar, H.e eVar2, int i2, int i3, int i4) {
        g1.d.e(jVar, "call");
        this.f4098a = jVar;
        this.f4099b = arrayList;
        this.f4100c = i;
        this.d = eVar;
        this.f4101e = eVar2;
        this.f4102f = i2;
        this.f4103g = i3;
        this.h = i4;
    }

    public static f a(f fVar, int i, v1.e eVar, H.e eVar2, int i2) {
        if ((i2 & 1) != 0) {
            i = fVar.f4100c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            eVar = fVar.d;
        }
        v1.e eVar3 = eVar;
        if ((i2 & 4) != 0) {
            eVar2 = fVar.f4101e;
        }
        H.e eVar4 = eVar2;
        int i4 = fVar.f4102f;
        int i5 = fVar.f4103g;
        int i6 = fVar.h;
        fVar.getClass();
        g1.d.e(eVar4, "request");
        return new f(fVar.f4098a, fVar.f4099b, i3, eVar3, eVar4, i4, i5, i6);
    }

    public final t b(H.e eVar) {
        g1.d.e(eVar, "request");
        ArrayList arrayList = this.f4099b;
        int size = arrayList.size();
        int i = this.f4100c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.i++;
        v1.e eVar2 = this.d;
        if (eVar2 != null) {
            if (!eVar2.f4032b.b((m) eVar.f278c)) {
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
        if (a3.f3534g != null) {
            return a3;
        }
        throw new IllegalStateException(("interceptor " + nVar + " returned a response with no body").toString());
    }
}
