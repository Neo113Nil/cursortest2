package n1;

import i1.q;
import i1.w;
import i1.y;
import java.util.ArrayList;
import m1.j;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final j f3657a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3658b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3659c;

    /* renamed from: d, reason: collision with root package name */
    public final m1.e f3660d;

    /* renamed from: e, reason: collision with root package name */
    public final w f3661e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3662f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3663g;
    public final int h;
    public int i;

    public f(j jVar, ArrayList arrayList, int i, m1.e eVar, w wVar, int i2, int i3, int i4) {
        X0.f.e(jVar, "call");
        this.f3657a = jVar;
        this.f3658b = arrayList;
        this.f3659c = i;
        this.f3660d = eVar;
        this.f3661e = wVar;
        this.f3662f = i2;
        this.f3663g = i3;
        this.h = i4;
    }

    public static f a(f fVar, int i, m1.e eVar, w wVar, int i2) {
        if ((i2 & 1) != 0) {
            i = fVar.f3659c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            eVar = fVar.f3660d;
        }
        m1.e eVar2 = eVar;
        if ((i2 & 4) != 0) {
            wVar = fVar.f3661e;
        }
        w wVar2 = wVar;
        int i4 = fVar.f3662f;
        int i5 = fVar.f3663g;
        int i6 = fVar.h;
        fVar.getClass();
        X0.f.e(wVar2, "request");
        return new f(fVar.f3657a, fVar.f3658b, i3, eVar2, wVar2, i4, i5, i6);
    }

    public final y b(w wVar) {
        X0.f.e(wVar, "request");
        ArrayList arrayList = this.f3658b;
        int size = arrayList.size();
        int i = this.f3659c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.i++;
        m1.e eVar = this.f3660d;
        if (eVar != null) {
            if (!eVar.f3553b.b(wVar.f2776a)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i2 = i + 1;
        f a2 = a(this, i2, null, wVar, 58);
        q qVar = (q) arrayList.get(i);
        y a3 = qVar.a(a2);
        if (a3 == null) {
            throw new NullPointerException("interceptor " + qVar + " returned null");
        }
        if (eVar != null && i2 < arrayList.size() && a2.i != 1) {
            throw new IllegalStateException(("network interceptor " + qVar + " must call proceed() exactly once").toString());
        }
        if (a3.f2798g != null) {
            return a3;
        }
        throw new IllegalStateException(("interceptor " + qVar + " returned a response with no body").toString());
    }
}
