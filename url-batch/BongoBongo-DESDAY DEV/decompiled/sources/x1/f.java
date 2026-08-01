package x1;

import java.util.ArrayList;
import s1.l;
import s1.m;
import s1.r;
import w1.j;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final j f4291a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4292b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4293c;
    public final w1.e d;

    /* renamed from: e, reason: collision with root package name */
    public final I.d f4294e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4295f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4296g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4297h;
    public int i;

    public f(j jVar, ArrayList arrayList, int i, w1.e eVar, I.d dVar, int i2, int i3, int i4) {
        h1.d.e(jVar, "call");
        this.f4291a = jVar;
        this.f4292b = arrayList;
        this.f4293c = i;
        this.d = eVar;
        this.f4294e = dVar;
        this.f4295f = i2;
        this.f4296g = i3;
        this.f4297h = i4;
    }

    public static f a(f fVar, int i, w1.e eVar, I.d dVar, int i2) {
        if ((i2 & 1) != 0) {
            i = fVar.f4293c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            eVar = fVar.d;
        }
        w1.e eVar2 = eVar;
        if ((i2 & 4) != 0) {
            dVar = fVar.f4294e;
        }
        I.d dVar2 = dVar;
        int i4 = fVar.f4295f;
        int i5 = fVar.f4296g;
        int i6 = fVar.f4297h;
        fVar.getClass();
        h1.d.e(dVar2, "request");
        return new f(fVar.f4291a, fVar.f4292b, i3, eVar2, dVar2, i4, i5, i6);
    }

    public final r b(I.d dVar) {
        h1.d.e(dVar, "request");
        ArrayList arrayList = this.f4292b;
        int size = arrayList.size();
        int i = this.f4293c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.i++;
        w1.e eVar = this.d;
        if (eVar != null) {
            if (!eVar.f4222b.b((l) dVar.f321c)) {
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
        if (a3.f3707g != null) {
            return a3;
        }
        throw new IllegalStateException(("interceptor " + mVar + " returned a response with no body").toString());
    }
}
