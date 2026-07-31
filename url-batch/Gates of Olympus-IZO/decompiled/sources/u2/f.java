package u2;

import E1.k;
import L1.j;
import L1.o;
import M1.B;
import M1.l;
import M1.n;
import M1.u;
import M1.x;
import M1.y;
import M1.z;
import e2.AbstractC0381e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;
import w2.InterfaceC1031j;
import w2.M;

/* loaded from: classes.dex */
public final class f implements SerialDescriptor, InterfaceC1031j {

    /* renamed from: a, reason: collision with root package name */
    public final String f8537a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0381e f8538b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8539c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f8540d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f8541e;

    /* renamed from: f, reason: collision with root package name */
    public final SerialDescriptor[] f8542f;

    /* renamed from: g, reason: collision with root package name */
    public final List[] f8543g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f8544h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f8545i;

    /* renamed from: j, reason: collision with root package name */
    public final SerialDescriptor[] f8546j;

    /* renamed from: k, reason: collision with root package name */
    public final o f8547k;

    public f(String str, AbstractC0381e abstractC0381e, int i3, List list, a aVar) {
        Z1.i.f(str, "serialName");
        this.f8537a = str;
        this.f8538b = abstractC0381e;
        this.f8539c = i3;
        ArrayList arrayList = aVar.f8522b;
        Z1.i.f(arrayList, "<this>");
        HashSet hashSet = new HashSet(B.I(n.g0(arrayList, 12)));
        l.A0(arrayList, hashSet);
        this.f8540d = hashSet;
        int i4 = 0;
        this.f8541e = (String[]) arrayList.toArray(new String[0]);
        this.f8542f = M.c(aVar.f8524d);
        this.f8543g = (List[]) aVar.f8525e.toArray(new List[0]);
        ArrayList arrayList2 = aVar.f8526f;
        Z1.i.f(arrayList2, "<this>");
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i4] = ((Boolean) it.next()).booleanValue();
            i4++;
        }
        this.f8544h = zArr;
        String[] strArr = this.f8541e;
        Z1.i.f(strArr, "<this>");
        y yVar = new y(0, new A2.l(12, strArr));
        ArrayList arrayList3 = new ArrayList(n.g0(yVar, 10));
        Iterator it2 = yVar.iterator();
        while (true) {
            z zVar = (z) it2;
            if (!zVar.f2811e.hasNext()) {
                this.f8545i = B.P(arrayList3);
                this.f8546j = M.c(list);
                this.f8547k = I2.d.F(new D1.g(5, this));
                return;
            }
            x xVar = (x) zVar.next();
            arrayList3.add(new j(xVar.f2807b, Integer.valueOf(xVar.f2806a)));
        }
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a(int i3) {
        return this.f8541e[i3];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        Z1.i.f(str, "name");
        Integer num = (Integer) this.f8545i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d() {
        return this.f8537a;
    }

    @Override // w2.InterfaceC1031j
    public final Set e() {
        return this.f8540d;
    }

    public final boolean equals(Object obj) {
        int i3;
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (Z1.i.a(this.f8537a, serialDescriptor.d()) && Arrays.equals(this.f8546j, ((f) obj).f8546j)) {
                int l3 = serialDescriptor.l();
                int i4 = this.f8539c;
                if (i4 == l3) {
                    for (0; i3 < i4; i3 + 1) {
                        SerialDescriptor[] serialDescriptorArr = this.f8542f;
                        i3 = (Z1.i.a(serialDescriptorArr[i3].d(), serialDescriptor.h(i3).d()) && Z1.i.a(serialDescriptorArr[i3].i(), serialDescriptor.h(i3).i())) ? i3 + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean f() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i3) {
        return this.f8543g[i3];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i3) {
        return this.f8542f[i3];
    }

    public final int hashCode() {
        return ((Number) this.f8547k.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC0381e i() {
        return this.f8538b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i3) {
        return this.f8544h[i3];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List k() {
        return u.f2803d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int l() {
        return this.f8539c;
    }

    public final String toString() {
        return l.r0(AbstractC0381e.Q(0, this.f8539c), ", ", this.f8537a + '(', ")", new k(1, this), 24);
    }
}
