package E1;

import D1.j;
import java.util.ArrayList;
import z1.o;
import z1.p;
import z1.v;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final j f305a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f306b;

    /* renamed from: c, reason: collision with root package name */
    public final int f307c;

    /* renamed from: d, reason: collision with root package name */
    public final D1.e f308d;
    public final J.d e;

    /* renamed from: f, reason: collision with root package name */
    public final int f309f;

    /* renamed from: g, reason: collision with root package name */
    public final int f310g;

    /* renamed from: h, reason: collision with root package name */
    public final int f311h;
    public int i;

    public g(j jVar, ArrayList arrayList, int i, D1.e eVar, J.d dVar, int i2, int i3, int i4) {
        j1.h.e(jVar, "call");
        this.f305a = jVar;
        this.f306b = arrayList;
        this.f307c = i;
        this.f308d = eVar;
        this.e = dVar;
        this.f309f = i2;
        this.f310g = i3;
        this.f311h = i4;
    }

    public static g a(g gVar, int i, D1.e eVar, J.d dVar, int i2) {
        if ((i2 & 1) != 0) {
            i = gVar.f307c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            eVar = gVar.f308d;
        }
        D1.e eVar2 = eVar;
        if ((i2 & 4) != 0) {
            dVar = gVar.e;
        }
        J.d dVar2 = dVar;
        int i4 = gVar.f309f;
        int i5 = gVar.f310g;
        int i6 = gVar.f311h;
        gVar.getClass();
        j1.h.e(dVar2, "request");
        return new g(gVar.f305a, gVar.f306b, i3, eVar2, dVar2, i4, i5, i6);
    }

    public final v b(J.d dVar) {
        j1.h.e(dVar, "request");
        ArrayList arrayList = this.f306b;
        int size = arrayList.size();
        int i = this.f307c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.i++;
        D1.e eVar = this.f308d;
        if (eVar != null) {
            if (!eVar.f220b.b((o) dVar.f626c)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i2 = i + 1;
        g a2 = a(this, i2, null, dVar, 58);
        p pVar = (p) arrayList.get(i);
        v a3 = pVar.a(a2);
        if (a3 == null) {
            throw new NullPointerException("interceptor " + pVar + " returned null");
        }
        if (eVar != null && i2 < arrayList.size() && a2.i != 1) {
            throw new IllegalStateException(("network interceptor " + pVar + " must call proceed() exactly once").toString());
        }
        if (a3.f4949g != null) {
            return a3;
        }
        throw new IllegalStateException(("interceptor " + pVar + " returned a response with no body").toString());
    }
}
