package r0;

import e2.AbstractC0381e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class r implements Q {

    /* renamed from: d, reason: collision with root package name */
    public M0.j f7165d = M0.j.f2776e;

    /* renamed from: e, reason: collision with root package name */
    public float f7166e;

    /* renamed from: f, reason: collision with root package name */
    public float f7167f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w f7168g;

    public r(w wVar) {
        this.f7168g = wVar;
    }

    @Override // r0.C
    public final boolean B() {
        int i3 = this.f7168g.f7178d.f7736y.f7799c;
        return i3 == 4 || i3 == 2;
    }

    @Override // r0.C
    public final B I(int i3, int i4, Map map, Y1.c cVar) {
        if ((i3 & (-16777216)) == 0 && ((-16777216) & i4) == 0) {
            return new C0844q(i3, i4, map, this, this.f7168g, cVar);
        }
        AbstractC0381e.N("Size(" + i3 + " x " + i4 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    @Override // r0.Q
    public final List X(Object obj, Y1.e eVar) {
        w wVar = this.f7168g;
        wVar.e();
        t0.D d3 = wVar.f7178d;
        int i3 = d3.f7736y.f7799c;
        Object obj2 = null;
        if (!(i3 == 1 || i3 == 3 || i3 == 2 || i3 == 4)) {
            AbstractC0381e.N("subcompose can only be used inside the measure or layout blocks");
            throw null;
        }
        HashMap hashMap = wVar.f7184j;
        Object obj3 = hashMap.get(obj);
        if (obj3 == null) {
            obj3 = (t0.D) wVar.f7187m.remove(obj);
            if (obj3 != null) {
                int i4 = wVar.f7191r;
                if (i4 <= 0) {
                    AbstractC0381e.N("Check failed.");
                    throw null;
                }
                wVar.f7191r = i4 - 1;
            } else {
                obj3 = wVar.j(obj);
                if (obj3 == null) {
                    int i5 = wVar.f7181g;
                    t0.D d4 = new t0.D(2, 0, true);
                    d3.f7726n = true;
                    d3.v(i5, d4);
                    d3.f7726n = false;
                    obj3 = d4;
                }
            }
            hashMap.put(obj, obj3);
        }
        t0.D d5 = (t0.D) obj3;
        List o3 = d3.o();
        int i6 = wVar.f7181g;
        if (i6 >= 0) {
            K.a aVar = (K.a) o3;
            if (i6 < aVar.size()) {
                obj2 = aVar.get(i6);
            }
        }
        if (obj2 != d5) {
            int k3 = ((K.a) d3.o()).f2634d.k(d5);
            int i7 = wVar.f7181g;
            if (k3 < i7) {
                throw new IllegalArgumentException(("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
            }
            if (i7 != k3) {
                d3.f7726n = true;
                d3.F(k3, i7, 1);
                d3.f7726n = false;
            }
        }
        wVar.f7181g++;
        wVar.h(d5, obj, eVar);
        return (i3 == 1 || i3 == 3) ? d5.f7736y.f7813r.W() : d5.l();
    }

    @Override // M0.b
    public final float a() {
        return this.f7166e;
    }

    @Override // r0.C
    public final M0.j getLayoutDirection() {
        return this.f7165d;
    }

    @Override // M0.b
    public final float p() {
        return this.f7167f;
    }
}
