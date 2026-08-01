package E1;

import D1.j;
import java.util.ArrayList;
import z1.l;
import z1.m;
import z1.s;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final j f233a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f234b;

    /* renamed from: c, reason: collision with root package name */
    public final int f235c;
    public final D1.e d;

    /* renamed from: e, reason: collision with root package name */
    public final H.e f236e;

    /* renamed from: f, reason: collision with root package name */
    public final int f237f;

    /* renamed from: g, reason: collision with root package name */
    public final int f238g;
    public final int h;
    public int i;

    public g(j jVar, ArrayList arrayList, int i, D1.e eVar, H.e eVar2, int i2, int i3, int i4) {
        k1.e.e(jVar, "call");
        this.f233a = jVar;
        this.f234b = arrayList;
        this.f235c = i;
        this.d = eVar;
        this.f236e = eVar2;
        this.f237f = i2;
        this.f238g = i3;
        this.h = i4;
    }

    public static g a(g gVar, int i, D1.e eVar, H.e eVar2, int i2) {
        if ((i2 & 1) != 0) {
            i = gVar.f235c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            eVar = gVar.d;
        }
        D1.e eVar3 = eVar;
        if ((i2 & 4) != 0) {
            eVar2 = gVar.f236e;
        }
        H.e eVar4 = eVar2;
        int i4 = gVar.f237f;
        int i5 = gVar.f238g;
        int i6 = gVar.h;
        gVar.getClass();
        k1.e.e(eVar4, "request");
        return new g(gVar.f233a, gVar.f234b, i3, eVar3, eVar4, i4, i5, i6);
    }

    public final s b(H.e eVar) {
        k1.e.e(eVar, "request");
        ArrayList arrayList = this.f234b;
        int size = arrayList.size();
        int i = this.f235c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.i++;
        D1.e eVar2 = this.d;
        if (eVar2 != null) {
            if (!eVar2.f164b.b((l) eVar.f483c)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i2 = i + 1;
        g a2 = a(this, i2, null, eVar, 58);
        m mVar = (m) arrayList.get(i);
        s a3 = mVar.a(a2);
        if (a3 == null) {
            throw new NullPointerException("interceptor " + mVar + " returned null");
        }
        if (eVar2 != null && i2 < arrayList.size() && a2.i != 1) {
            throw new IllegalStateException(("network interceptor " + mVar + " must call proceed() exactly once").toString());
        }
        if (a3.f4764g != null) {
            return a3;
        }
        throw new IllegalStateException(("interceptor " + mVar + " returned a response with no body").toString());
    }
}
