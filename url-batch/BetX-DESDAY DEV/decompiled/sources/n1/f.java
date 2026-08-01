package n1;

import i1.q;
import i1.w;
import i1.y;
import java.util.ArrayList;
import m1.j;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final j f3661a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3662b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3663c;

    /* renamed from: d, reason: collision with root package name */
    public final m1.e f3664d;

    /* renamed from: e, reason: collision with root package name */
    public final w f3665e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3666f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3667g;
    public final int h;
    public int i;

    public f(j jVar, ArrayList arrayList, int i, m1.e eVar, w wVar, int i2, int i3, int i4) {
        X0.f.e(jVar, "call");
        this.f3661a = jVar;
        this.f3662b = arrayList;
        this.f3663c = i;
        this.f3664d = eVar;
        this.f3665e = wVar;
        this.f3666f = i2;
        this.f3667g = i3;
        this.h = i4;
    }

    public static f a(f fVar, int i, m1.e eVar, w wVar, int i2) {
        if ((i2 & 1) != 0) {
            i = fVar.f3663c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            eVar = fVar.f3664d;
        }
        m1.e eVar2 = eVar;
        if ((i2 & 4) != 0) {
            wVar = fVar.f3665e;
        }
        w wVar2 = wVar;
        int i4 = fVar.f3666f;
        int i5 = fVar.f3667g;
        int i6 = fVar.h;
        fVar.getClass();
        X0.f.e(wVar2, "request");
        return new f(fVar.f3661a, fVar.f3662b, i3, eVar2, wVar2, i4, i5, i6);
    }

    public final y b(w wVar) {
        X0.f.e(wVar, "request");
        ArrayList arrayList = this.f3662b;
        int size = arrayList.size();
        int i = this.f3663c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.i++;
        m1.e eVar = this.f3664d;
        if (eVar != null) {
            if (!eVar.f3557b.b(wVar.f2780a)) {
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
        if (a3.f2802g != null) {
            return a3;
        }
        throw new IllegalStateException(("interceptor " + qVar + " returned a response with no body").toString());
    }
}
