package x7;

import a2.q;
import c0.w;
import java.util.ArrayList;
import r6.k;
import s7.l;
import s7.m;
import s7.s;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final w7.g f9688a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9689b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9690c;

    /* renamed from: d, reason: collision with root package name */
    public final w f9691d;

    /* renamed from: e, reason: collision with root package name */
    public final q f9692e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9693f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9694g;

    /* renamed from: h, reason: collision with root package name */
    public final int f9695h;

    /* renamed from: i, reason: collision with root package name */
    public int f9696i;

    public f(w7.g gVar, ArrayList arrayList, int i7, w wVar, q qVar, int i8, int i9, int i10) {
        this.f9688a = gVar;
        this.f9689b = arrayList;
        this.f9690c = i7;
        this.f9691d = wVar;
        this.f9692e = qVar;
        this.f9693f = i8;
        this.f9694g = i9;
        this.f9695h = i10;
    }

    public static f a(f fVar, int i7, w wVar, q qVar, int i8) {
        if ((i8 & 1) != 0) {
            i7 = fVar.f9690c;
        }
        int i9 = i7;
        if ((i8 & 2) != 0) {
            wVar = fVar.f9691d;
        }
        w wVar2 = wVar;
        if ((i8 & 4) != 0) {
            qVar = fVar.f9692e;
        }
        q qVar2 = qVar;
        int i10 = fVar.f9693f;
        int i11 = fVar.f9694g;
        int i12 = fVar.f9695h;
        k.f(qVar2, "request");
        return new f(fVar.f9688a, fVar.f9689b, i9, wVar2, qVar2, i10, i11, i12);
    }

    public final s b(q qVar) {
        k.f(qVar, "request");
        ArrayList arrayList = this.f9689b;
        int size = arrayList.size();
        int i7 = this.f9690c;
        if (i7 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f9696i++;
        w wVar = this.f9691d;
        if (wVar != null) {
            if (!((w7.d) wVar.f1515c).b((l) qVar.f436c)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i7 - 1) + " must retain the same host and port").toString());
            }
            if (this.f9696i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i7 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i8 = i7 + 1;
        f a3 = a(this, i8, null, qVar, 58);
        m mVar = (m) arrayList.get(i7);
        s a9 = mVar.a(a3);
        if (a9 == null) {
            throw new NullPointerException("interceptor " + mVar + " returned null");
        }
        if (wVar != null && i8 < arrayList.size() && a3.f9696i != 1) {
            throw new IllegalStateException(("network interceptor " + mVar + " must call proceed() exactly once").toString());
        }
        if (a9.f8689l != null) {
            return a9;
        }
        throw new IllegalStateException(("interceptor " + mVar + " returned a response with no body").toString());
    }
}
