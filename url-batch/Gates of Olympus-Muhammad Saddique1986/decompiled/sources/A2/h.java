package A2;

import C2.InterfaceC0047j;
import C2.M;
import R1.n;
import S1.B;
import S1.u;
import S1.x;
import S1.y;
import S1.z;
import a.AbstractC0235a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class h implements SerialDescriptor, InterfaceC0047j {

    /* renamed from: a, reason: collision with root package name */
    public final String f243a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0235a f244b;

    /* renamed from: c, reason: collision with root package name */
    public final int f245c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f246d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f247e;

    /* renamed from: f, reason: collision with root package name */
    public final SerialDescriptor[] f248f;

    /* renamed from: g, reason: collision with root package name */
    public final List[] f249g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f250h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f251i;

    /* renamed from: j, reason: collision with root package name */
    public final SerialDescriptor[] f252j;

    /* renamed from: k, reason: collision with root package name */
    public final n f253k;

    public h(String str, AbstractC0235a abstractC0235a, int i3, List list, a aVar) {
        f2.j.f(str, "serialName");
        this.f243a = str;
        this.f244b = abstractC0235a;
        this.f245c = i3;
        ArrayList arrayList = aVar.f224b;
        f2.j.f(arrayList, "<this>");
        HashSet hashSet = new HashSet(B.J(S1.n.E0(arrayList, 12)));
        S1.l.Y0(arrayList, hashSet);
        this.f246d = hashSet;
        int i4 = 0;
        this.f247e = (String[]) arrayList.toArray(new String[0]);
        this.f248f = M.c(aVar.f226d);
        this.f249g = (List[]) aVar.f227e.toArray(new List[0]);
        ArrayList arrayList2 = aVar.f228f;
        f2.j.f(arrayList2, "<this>");
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i4] = ((Boolean) it.next()).booleanValue();
            i4++;
        }
        this.f250h = zArr;
        String[] strArr = this.f247e;
        f2.j.f(strArr, "<this>");
        y yVar = new y(0, new A.h(16, strArr));
        ArrayList arrayList3 = new ArrayList(S1.n.E0(yVar, 10));
        Iterator it2 = yVar.iterator();
        while (true) {
            z zVar = (z) it2;
            if (!zVar.f4328e.hasNext()) {
                this.f251i = B.L(arrayList3);
                this.f252j = M.c(list);
                this.f253k = R1.a.d(new f(0, this));
                return;
            }
            x xVar = (x) zVar.next();
            arrayList3.add(new R1.i(xVar.f4324b, Integer.valueOf(xVar.f4323a)));
        }
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a(int i3) {
        return this.f247e[i3];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        f2.j.f(str, "name");
        Integer num = (Integer) this.f251i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d() {
        return this.f243a;
    }

    @Override // C2.InterfaceC0047j
    public final Set e() {
        return this.f246d;
    }

    public final boolean equals(Object obj) {
        int i3;
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (f2.j.a(this.f243a, serialDescriptor.d()) && Arrays.equals(this.f252j, ((h) obj).f252j)) {
                int l3 = serialDescriptor.l();
                int i4 = this.f245c;
                if (i4 == l3) {
                    for (0; i3 < i4; i3 + 1) {
                        SerialDescriptor[] serialDescriptorArr = this.f248f;
                        i3 = (f2.j.a(serialDescriptorArr[i3].d(), serialDescriptor.h(i3).d()) && f2.j.a(serialDescriptorArr[i3].i(), serialDescriptor.h(i3).i())) ? i3 + 1 : 0;
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
        return this.f249g[i3];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i3) {
        return this.f248f[i3];
    }

    public final int hashCode() {
        return ((Number) this.f253k.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC0235a i() {
        return this.f244b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i3) {
        return this.f250h[i3];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List k() {
        return u.f4320d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int l() {
        return this.f245c;
    }

    public final String toString() {
        return S1.l.P0(O2.d.g0(0, this.f245c), ", ", this.f243a + '(', ")", new g(0, this), 24);
    }
}
