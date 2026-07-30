package Q0;

import R0.u;
import a.AbstractC0069a;
import java.util.ArrayList;
import u0.C0247g;

/* loaded from: classes.dex */
public abstract class f implements j {

    /* renamed from: e, reason: collision with root package name */
    public final w0.i f842e;

    /* renamed from: f, reason: collision with root package name */
    public final int f843f;

    /* renamed from: g, reason: collision with root package name */
    public final int f844g;

    public f(w0.i iVar, int i2, int i3) {
        this.f842e = iVar;
        this.f843f = i2;
        this.f844g = i3;
    }

    public abstract Object a(O0.p pVar, w0.d dVar);

    public abstract f b(w0.i iVar, int i2, int i3);

    @Override // P0.d
    public Object d(P0.e eVar, w0.d dVar) {
        d dVar2 = new d(eVar, this, null);
        u uVar = new u(dVar, dVar.getContext());
        Object I2 = AbstractC0069a.I(uVar, uVar, dVar2);
        return I2 == x0.a.f3094e ? I2 : C0247g.f3005a;
    }

    @Override // Q0.j
    public final P0.d k(w0.i iVar, int i2, int i3) {
        w0.i iVar2 = this.f842e;
        w0.i k2 = iVar.k(iVar2);
        int i4 = this.f844g;
        int i5 = this.f843f;
        if (i3 == 1) {
            if (i5 != -3) {
                if (i2 != -3) {
                    if (i5 != -2) {
                        if (i2 != -2) {
                            i2 += i5;
                            if (i2 < 0) {
                                i2 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i2 = i5;
            }
            i3 = i4;
        }
        return (F0.i.a(k2, iVar2) && i2 == i5 && i3 == i4) ? this : b(k2, i2, i3);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        w0.j jVar = w0.j.f3082e;
        w0.i iVar = this.f842e;
        if (iVar != jVar) {
            arrayList.add("context=" + iVar);
        }
        int i2 = this.f843f;
        if (i2 != -3) {
            arrayList.add("capacity=" + i2);
        }
        int i3 = this.f844g;
        if (i3 != 1) {
            arrayList.add("onBufferOverflow=".concat(i3 != 1 ? i3 != 2 ? i3 != 3 ? "null" : "DROP_LATEST" : "DROP_OLDEST" : "SUSPEND"));
        }
        return getClass().getSimpleName() + '[' + v0.d.D(arrayList, ", ", null, null, null, 62) + ']';
    }
}
