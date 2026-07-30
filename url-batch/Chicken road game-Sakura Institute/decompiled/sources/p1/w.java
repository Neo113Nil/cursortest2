package p1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class w implements w0 {

    /* renamed from: f, reason: collision with root package name */
    public m2.k f7102f = m2.k.f6323g;

    /* renamed from: g, reason: collision with root package name */
    public float f7103g;

    /* renamed from: h, reason: collision with root package name */
    public float f7104h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b0 f7105i;

    public w(b0 b0Var) {
        this.f7105i = b0Var;
    }

    @Override // p1.w0
    public final List D(Object obj, q6.e eVar) {
        b0 b0Var = this.f7105i;
        b0Var.e();
        r1.d0 d0Var = b0Var.f7018f;
        int i7 = d0Var.B.f7833c;
        Object obj2 = null;
        if (i7 != 1 && i7 != 3 && i7 != 2 && i7 != 4) {
            a.a.M("subcompose can only be used inside the measure or layout blocks");
            throw null;
        }
        HashMap hashMap = b0Var.f7024l;
        Object obj3 = hashMap.get(obj);
        if (obj3 == null) {
            obj3 = (r1.d0) b0Var.f7027o.remove(obj);
            if (obj3 != null) {
                int i8 = b0Var.f7032t;
                if (i8 <= 0) {
                    a.a.M("Check failed.");
                    throw null;
                }
                b0Var.f7032t = i8 - 1;
            } else {
                obj3 = b0Var.j(obj);
                if (obj3 == null) {
                    int i9 = b0Var.f7021i;
                    r1.d0 d0Var2 = new r1.d0(2);
                    d0Var.f7729p = true;
                    d0Var.x(i9, d0Var2);
                    d0Var.f7729p = false;
                    obj3 = d0Var2;
                }
            }
            hashMap.put(obj, obj3);
        }
        r1.d0 d0Var3 = (r1.d0) obj3;
        List p6 = d0Var.p();
        int i10 = b0Var.f7021i;
        if (i10 >= 0) {
            i0.a aVar = (i0.a) p6;
            if (i10 < aVar.f4834f.f4842h) {
                obj2 = aVar.get(i10);
            }
        }
        if (obj2 != d0Var3) {
            int k8 = ((i0.a) d0Var.p()).f4834f.k(d0Var3);
            int i11 = b0Var.f7021i;
            if (k8 < i11) {
                throw new IllegalArgumentException(("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
            }
            if (i11 != k8) {
                d0Var.f7729p = true;
                d0Var.I(k8, i11, 1);
                d0Var.f7729p = false;
            }
        }
        b0Var.f7021i++;
        b0Var.h(d0Var3, obj, eVar);
        return (i7 == 1 || i7 == 3) ? d0Var3.m() : d0Var3.l();
    }

    @Override // m2.b
    public final float a() {
        return this.f7103g;
    }

    @Override // p1.m
    public final m2.k getLayoutDirection() {
        return this.f7102f;
    }

    @Override // m2.b
    public final float m() {
        return this.f7104h;
    }

    @Override // p1.h0
    public final g0 q(int i7, int i8, Map map, q6.c cVar) {
        if ((i7 & (-16777216)) == 0 && ((-16777216) & i8) == 0) {
            return new v(i7, i8, map, this, this.f7105i, cVar);
        }
        a.a.M("Size(" + i7 + " x " + i8 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    @Override // p1.m
    public final boolean v() {
        int i7 = this.f7105i.f7018f.B.f7833c;
        return i7 == 4 || i7 == 2;
    }
}
