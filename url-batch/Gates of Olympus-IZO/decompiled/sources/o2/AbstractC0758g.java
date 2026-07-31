package o2;

import java.util.ArrayList;
import k2.AbstractC0552y;
import k2.E;
import k2.EnumC0551x;
import k2.InterfaceC0550w;
import m2.EnumC0626a;
import n2.InterfaceC0700f;
import n2.InterfaceC0701g;

/* renamed from: o2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0758g implements p {

    /* renamed from: d, reason: collision with root package name */
    public final P1.i f6707d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6708e;

    /* renamed from: f, reason: collision with root package name */
    public final EnumC0626a f6709f;

    public AbstractC0758g(P1.i iVar, int i3, EnumC0626a enumC0626a) {
        this.f6707d = iVar;
        this.f6708e = i3;
        this.f6709f = enumC0626a;
    }

    @Override // o2.p
    public final InterfaceC0700f b(P1.i iVar, int i3, EnumC0626a enumC0626a) {
        P1.i iVar2 = this.f6707d;
        P1.i o3 = iVar.o(iVar2);
        EnumC0626a enumC0626a2 = EnumC0626a.f5929d;
        EnumC0626a enumC0626a3 = this.f6709f;
        int i4 = this.f6708e;
        if (enumC0626a == enumC0626a2) {
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
            enumC0626a = enumC0626a3;
        }
        return (Z1.i.a(o3, iVar2) && i3 == i4 && enumC0626a == enumC0626a3) ? this : f(o3, i3, enumC0626a);
    }

    @Override // n2.InterfaceC0700f
    public Object collect(InterfaceC0701g interfaceC0701g, P1.d dVar) {
        Object d3 = AbstractC0552y.d(new C0756e(interfaceC0701g, this, null), dVar);
        return d3 == Q1.a.f3113d ? d3 : L1.z.f2729a;
    }

    public String d() {
        return null;
    }

    public abstract Object e(m2.r rVar, C0757f c0757f);

    public abstract AbstractC0758g f(P1.i iVar, int i3, EnumC0626a enumC0626a);

    public InterfaceC0700f g() {
        return null;
    }

    public m2.s h(InterfaceC0550w interfaceC0550w) {
        int i3 = this.f6708e;
        if (i3 == -3) {
            i3 = -2;
        }
        EnumC0551x enumC0551x = EnumC0551x.f5397f;
        Y1.e c0757f = new C0757f(this, null);
        m2.e a3 = m2.l.a(i3, 4, this.f6709f);
        P1.i g3 = AbstractC0552y.g(interfaceC0550w.u(), this.f6707d, true);
        r2.e eVar = E.f5312a;
        if (g3 != eVar && g3.k(P1.e.f3072d) == null) {
            g3 = g3.o(eVar);
        }
        m2.q qVar = new m2.q(g3, a3);
        qVar.g0(enumC0551x, qVar, c0757f);
        return qVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String d3 = d();
        if (d3 != null) {
            arrayList.add(d3);
        }
        P1.j jVar = P1.j.f3073d;
        P1.i iVar = this.f6707d;
        if (iVar != jVar) {
            arrayList.add("context=" + iVar);
        }
        int i3 = this.f6708e;
        if (i3 != -3) {
            arrayList.add("capacity=" + i3);
        }
        EnumC0626a enumC0626a = EnumC0626a.f5929d;
        EnumC0626a enumC0626a2 = this.f6709f;
        if (enumC0626a2 != enumC0626a) {
            arrayList.add("onBufferOverflow=" + enumC0626a2);
        }
        return getClass().getSimpleName() + '[' + M1.l.r0(arrayList, ", ", null, null, null, 62) + ']';
    }
}
