package y3;

import java.util.ArrayList;
import t3.l;
import t3.q;
import t3.s;
import x3.i;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final i f4114a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4115b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4116c;
    public final x3.d d;

    /* renamed from: e, reason: collision with root package name */
    public final q f4117e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4118f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4119g;
    public final int h;
    public int i;

    public f(i iVar, ArrayList arrayList, int i, x3.d dVar, q qVar, int i4, int i5, int i6) {
        this.f4114a = iVar;
        this.f4115b = arrayList;
        this.f4116c = i;
        this.d = dVar;
        this.f4117e = qVar;
        this.f4118f = i4;
        this.f4119g = i5;
        this.h = i6;
    }

    public static f a(f fVar, int i, x3.d dVar, q qVar, int i4) {
        if ((i4 & 1) != 0) {
            i = fVar.f4116c;
        }
        int i5 = i;
        if ((i4 & 2) != 0) {
            dVar = fVar.d;
        }
        x3.d dVar2 = dVar;
        if ((i4 & 4) != 0) {
            qVar = fVar.f4117e;
        }
        q qVar2 = qVar;
        int i6 = fVar.f4118f;
        int i7 = fVar.f4119g;
        int i8 = fVar.h;
        i3.d.e(qVar2, "request");
        return new f(fVar.f4114a, fVar.f4115b, i5, dVar2, qVar2, i6, i7, i8);
    }

    public final s b(q qVar) {
        i3.d.e(qVar, "request");
        ArrayList arrayList = this.f4115b;
        int size = arrayList.size();
        int i = this.f4116c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.i++;
        x3.d dVar = this.d;
        if (dVar != null) {
            if (!dVar.f3900b.b(qVar.f3506a)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i4 = i + 1;
        f a5 = a(this, i4, null, qVar, 58);
        l lVar = (l) arrayList.get(i);
        s a6 = lVar.a(a5);
        if (a6 == null) {
            throw new NullPointerException("interceptor " + lVar + " returned null");
        }
        if (dVar != null && i4 < arrayList.size() && a5.i != 1) {
            throw new IllegalStateException(("network interceptor " + lVar + " must call proceed() exactly once").toString());
        }
        if (a6.f3524l != null) {
            return a6;
        }
        throw new IllegalStateException(("interceptor " + lVar + " returned a response with no body").toString());
    }
}
