package u2;

import e2.InterfaceC0426e;
import java.util.ArrayList;
import q2.AbstractC0837y;
import q2.EnumC0836x;
import q2.InterfaceC0835w;
import s2.EnumC0967a;
import t2.InterfaceC1053f;
import t2.InterfaceC1054g;

/* renamed from: u2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1155g implements v {

    /* renamed from: d, reason: collision with root package name */
    public final V1.i f9691d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9692e;

    /* renamed from: f, reason: collision with root package name */
    public final EnumC0967a f9693f;

    public AbstractC1155g(V1.i iVar, int i3, EnumC0967a enumC0967a) {
        this.f9691d = iVar;
        this.f9692e = i3;
        this.f9693f = enumC0967a;
    }

    @Override // u2.v
    public final InterfaceC1053f b(V1.i iVar, int i3, EnumC0967a enumC0967a) {
        V1.i iVar2 = this.f9691d;
        V1.i d3 = iVar.d(iVar2);
        EnumC0967a enumC0967a2 = EnumC0967a.f8359d;
        EnumC0967a enumC0967a3 = this.f9693f;
        int i4 = this.f9692e;
        if (enumC0967a == enumC0967a2) {
            if (i4 != -3) {
                if (i3 != -3) {
                    if (i4 != -2) {
                        if (i3 != -2) {
                            i3 += i4;
                            if (i3 < 0) {
                                i3 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i3 = i4;
            }
            enumC0967a = enumC0967a3;
        }
        return (f2.j.a(d3, iVar2) && i3 == i4 && enumC0967a == enumC0967a3) ? this : g(d3, i3, enumC0967a);
    }

    @Override // t2.InterfaceC1053f
    public Object d(InterfaceC1054g interfaceC1054g, V1.d dVar) {
        Object e3 = AbstractC0837y.e(new C1153e(interfaceC1054g, this, null), dVar);
        return e3 == W1.a.f4608d ? e3 : R1.y.f4171a;
    }

    public String e() {
        return null;
    }

    public abstract Object f(s2.t tVar, C1154f c1154f);

    public abstract AbstractC1155g g(V1.i iVar, int i3, EnumC0967a enumC0967a);

    public InterfaceC1053f h() {
        return null;
    }

    public s2.v i(InterfaceC0835w interfaceC0835w) {
        int i3 = this.f9692e;
        if (i3 == -3) {
            i3 = -2;
        }
        EnumC0836x enumC0836x = EnumC0836x.f7936f;
        InterfaceC0426e c1154f = new C1154f(this, null);
        s2.g a3 = n.r.a(i3, 4, this.f9693f);
        V1.i h3 = AbstractC0837y.h(interfaceC0835w.q(), this.f9691d, true);
        x2.e eVar = q2.E.f7851a;
        if (h3 != eVar && h3.v(V1.e.f4557d) == null) {
            h3 = h3.d(eVar);
        }
        s2.s sVar = new s2.s(h3, a3);
        sVar.k0(enumC0836x, sVar, c1154f);
        return sVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String e3 = e();
        if (e3 != null) {
            arrayList.add(e3);
        }
        V1.j jVar = V1.j.f4558d;
        V1.i iVar = this.f9691d;
        if (iVar != jVar) {
            arrayList.add("context=" + iVar);
        }
        int i3 = this.f9692e;
        if (i3 != -3) {
            arrayList.add("capacity=" + i3);
        }
        EnumC0967a enumC0967a = EnumC0967a.f8359d;
        EnumC0967a enumC0967a2 = this.f9693f;
        if (enumC0967a2 != enumC0967a) {
            arrayList.add("onBufferOverflow=" + enumC0967a2);
        }
        return getClass().getSimpleName() + '[' + S1.l.P0(arrayList, ", ", null, null, null, 62) + ']';
    }
}
