package r1;

import java.util.ArrayList;
import m1.l;
import m1.m;
import m1.s;
import q1.j;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final j f3519a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3520b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3521c;
    public final q1.e d;

    /* renamed from: e, reason: collision with root package name */
    public final H.e f3522e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3523f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3524g;
    public final int h;
    public int i;

    public f(j jVar, ArrayList arrayList, int i, q1.e eVar, H.e eVar2, int i2, int i3, int i4) {
        b1.d.e(jVar, "call");
        this.f3519a = jVar;
        this.f3520b = arrayList;
        this.f3521c = i;
        this.d = eVar;
        this.f3522e = eVar2;
        this.f3523f = i2;
        this.f3524g = i3;
        this.h = i4;
    }

    public static f a(f fVar, int i, q1.e eVar, H.e eVar2, int i2) {
        if ((i2 & 1) != 0) {
            i = fVar.f3521c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            eVar = fVar.d;
        }
        q1.e eVar3 = eVar;
        if ((i2 & 4) != 0) {
            eVar2 = fVar.f3522e;
        }
        H.e eVar4 = eVar2;
        int i4 = fVar.f3523f;
        int i5 = fVar.f3524g;
        int i6 = fVar.h;
        fVar.getClass();
        b1.d.e(eVar4, "request");
        return new f(fVar.f3519a, fVar.f3520b, i3, eVar3, eVar4, i4, i5, i6);
    }

    public final s b(H.e eVar) {
        b1.d.e(eVar, "request");
        ArrayList arrayList = this.f3520b;
        int size = arrayList.size();
        int i = this.f3521c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.i++;
        q1.e eVar2 = this.d;
        if (eVar2 != null) {
            if (!eVar2.f3459b.b((l) eVar.f206c)) {
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
        if (a3.f3254g != null) {
            return a3;
        }
        throw new IllegalStateException(("interceptor " + mVar + " returned a response with no body").toString());
    }
}
