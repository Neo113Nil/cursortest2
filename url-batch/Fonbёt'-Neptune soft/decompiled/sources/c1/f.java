package c1;

import a.AbstractC0132a;
import d1.u;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class f implements j {

    /* renamed from: e, reason: collision with root package name */
    public final H0.i f2009e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2010f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2011g;

    public f(H0.i iVar, int i2, int i3) {
        this.f2009e = iVar;
        this.f2010f = i2;
        this.f2011g = i3;
    }

    public abstract Object a(a1.p pVar, H0.d dVar);

    public abstract f b(H0.i iVar, int i2, int i3);

    @Override // c1.j
    public final b1.d j(H0.i iVar, int i2, int i3) {
        H0.i iVar2 = this.f2009e;
        H0.i i4 = iVar.i(iVar2);
        int i5 = this.f2011g;
        int i6 = this.f2010f;
        if (i3 == 1) {
            if (i6 != -3) {
                if (i2 != -3) {
                    if (i6 != -2) {
                        if (i2 != -2) {
                            i2 += i6;
                            if (i2 < 0) {
                                i2 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i2 = i6;
            }
            i3 = i5;
        }
        return (Q0.h.a(i4, iVar2) && i2 == i6 && i3 == i5) ? this : b(i4, i2, i3);
    }

    @Override // b1.d
    public Object k(b1.e eVar, H0.d dVar) {
        d dVar2 = new d(eVar, this, null);
        u uVar = new u(dVar, dVar.f());
        Object N2 = AbstractC0132a.N(uVar, uVar, dVar2);
        return N2 == I0.a.f733e ? N2 : F0.h.f469a;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        H0.j jVar = H0.j.f503e;
        H0.i iVar = this.f2009e;
        if (iVar != jVar) {
            arrayList.add("context=" + iVar);
        }
        int i2 = this.f2010f;
        if (i2 != -3) {
            arrayList.add("capacity=" + i2);
        }
        int i3 = this.f2011g;
        if (i3 != 1) {
            arrayList.add("onBufferOverflow=".concat(i3 != 1 ? i3 != 2 ? i3 != 3 ? "null" : "DROP_LATEST" : "DROP_OLDEST" : "SUSPEND"));
        }
        return getClass().getSimpleName() + '[' + G0.d.Q(arrayList, ", ", null, null, null, 62) + ']';
    }
}
