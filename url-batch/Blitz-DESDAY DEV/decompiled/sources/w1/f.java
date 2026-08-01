package w1;

import java.util.ArrayList;
import r1.l;
import r1.m;
import r1.r;
import v1.j;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final j f3942a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3943b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3944c;
    public final v1.e d;

    /* renamed from: e, reason: collision with root package name */
    public final J.d f3945e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3946f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3947g;
    public final int h;
    public int i;

    public f(j jVar, ArrayList arrayList, int i, v1.e eVar, J.d dVar, int i2, int i3, int i4) {
        g1.d.e(jVar, "call");
        this.f3942a = jVar;
        this.f3943b = arrayList;
        this.f3944c = i;
        this.d = eVar;
        this.f3945e = dVar;
        this.f3946f = i2;
        this.f3947g = i3;
        this.h = i4;
    }

    public static f a(f fVar, int i, v1.e eVar, J.d dVar, int i2) {
        if ((i2 & 1) != 0) {
            i = fVar.f3944c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            eVar = fVar.d;
        }
        v1.e eVar2 = eVar;
        if ((i2 & 4) != 0) {
            dVar = fVar.f3945e;
        }
        J.d dVar2 = dVar;
        int i4 = fVar.f3946f;
        int i5 = fVar.f3947g;
        int i6 = fVar.h;
        fVar.getClass();
        g1.d.e(dVar2, "request");
        return new f(fVar.f3942a, fVar.f3943b, i3, eVar2, dVar2, i4, i5, i6);
    }

    public final r b(J.d dVar) {
        g1.d.e(dVar, "request");
        ArrayList arrayList = this.f3943b;
        int size = arrayList.size();
        int i = this.f3944c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.i++;
        v1.e eVar = this.d;
        if (eVar != null) {
            if (!eVar.f3862b.b((l) dVar.f359c)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i2 = i + 1;
        f a2 = a(this, i2, null, dVar, 58);
        m mVar = (m) arrayList.get(i);
        r a3 = mVar.a(a2);
        if (a3 == null) {
            throw new NullPointerException("interceptor " + mVar + " returned null");
        }
        if (eVar != null && i2 < arrayList.size() && a2.i != 1) {
            throw new IllegalStateException(("network interceptor " + mVar + " must call proceed() exactly once").toString());
        }
        if (a3.f3550g != null) {
            return a3;
        }
        throw new IllegalStateException(("interceptor " + mVar + " returned a response with no body").toString());
    }
}
