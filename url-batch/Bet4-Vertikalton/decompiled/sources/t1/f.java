package t1;

import java.util.ArrayList;
import o1.l;
import o1.m;
import o1.s;
import s1.j;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final j f3806a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3807b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3808c;
    public final s1.e d;

    /* renamed from: e, reason: collision with root package name */
    public final H.e f3809e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3810f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3811g;
    public final int h;
    public int i;

    public f(j jVar, ArrayList arrayList, int i, s1.e eVar, H.e eVar2, int i2, int i3, int i4) {
        d1.d.e(jVar, "call");
        this.f3806a = jVar;
        this.f3807b = arrayList;
        this.f3808c = i;
        this.d = eVar;
        this.f3809e = eVar2;
        this.f3810f = i2;
        this.f3811g = i3;
        this.h = i4;
    }

    public static f a(f fVar, int i, s1.e eVar, H.e eVar2, int i2) {
        if ((i2 & 1) != 0) {
            i = fVar.f3808c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            eVar = fVar.d;
        }
        s1.e eVar3 = eVar;
        if ((i2 & 4) != 0) {
            eVar2 = fVar.f3809e;
        }
        H.e eVar4 = eVar2;
        int i4 = fVar.f3810f;
        int i5 = fVar.f3811g;
        int i6 = fVar.h;
        fVar.getClass();
        d1.d.e(eVar4, "request");
        return new f(fVar.f3806a, fVar.f3807b, i3, eVar3, eVar4, i4, i5, i6);
    }

    public final s b(H.e eVar) {
        d1.d.e(eVar, "request");
        ArrayList arrayList = this.f3807b;
        int size = arrayList.size();
        int i = this.f3808c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.i++;
        s1.e eVar2 = this.d;
        if (eVar2 != null) {
            if (!eVar2.f3706b.b((l) eVar.f261c)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i2 = i + 1;
        f a2 = a(this, i2, null, eVar, 58);
        m mVar = (m) arrayList.get(i);
        s a3 = mVar.a(a2);
        if (a3 == null) {
            throw new NullPointerException("interceptor " + mVar + " returned null");
        }
        if (eVar2 != null && i2 < arrayList.size() && a2.i != 1) {
            throw new IllegalStateException(("network interceptor " + mVar + " must call proceed() exactly once").toString());
        }
        if (a3.f3388g != null) {
            return a3;
        }
        throw new IllegalStateException(("interceptor " + mVar + " returned a response with no body").toString());
    }
}
