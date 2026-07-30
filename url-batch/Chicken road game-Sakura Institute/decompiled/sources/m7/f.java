package m7;

import a8.m;
import androidx.lifecycle.r0;
import d6.o;
import e6.a0;
import e6.c0;
import e6.d0;
import e6.l;
import e6.n;
import e6.u;
import e6.y;
import e6.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o7.j;
import o7.n0;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f implements SerialDescriptor, j {

    /* renamed from: a, reason: collision with root package name */
    public final String f6450a;

    /* renamed from: b, reason: collision with root package name */
    public final m f6451b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6452c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f6453d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f6454e;

    /* renamed from: f, reason: collision with root package name */
    public final SerialDescriptor[] f6455f;

    /* renamed from: g, reason: collision with root package name */
    public final List[] f6456g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f6457h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f6458i;

    /* renamed from: j, reason: collision with root package name */
    public final SerialDescriptor[] f6459j;

    /* renamed from: k, reason: collision with root package name */
    public final o f6460k;

    public f(String str, m mVar, int i7, List list, a aVar) {
        k.f(str, "serialName");
        this.f6450a = str;
        this.f6451b = mVar;
        this.f6452c = i7;
        ArrayList arrayList = aVar.f6435b;
        k.f(arrayList, "<this>");
        HashSet hashSet = new HashSet(d0.h0(n.a0(arrayList, 12)));
        l.u0(arrayList, hashSet);
        this.f6453d = hashSet;
        int i8 = 0;
        this.f6454e = (String[]) arrayList.toArray(new String[0]);
        this.f6455f = n0.c(aVar.f6437d);
        this.f6456g = (List[]) aVar.f6438e.toArray(new List[0]);
        ArrayList arrayList2 = aVar.f6439f;
        k.f(arrayList2, "<this>");
        boolean[] zArr = new boolean[arrayList2.size()];
        int size = arrayList2.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList2.get(i9);
            i9++;
            zArr[i8] = ((Boolean) obj).booleanValue();
            i8++;
        }
        this.f6457h = zArr;
        String[] strArr = this.f6454e;
        k.f(strArr, "<this>");
        z zVar = new z(0, new r0(5, strArr));
        ArrayList arrayList3 = new ArrayList(n.a0(zVar, 10));
        Iterator it = zVar.iterator();
        while (true) {
            a0 a0Var = (a0) it;
            if (!a0Var.f2807g.hasNext()) {
                this.f6458i = c0.l0(arrayList3);
                this.f6459j = n0.c(list);
                this.f6460k = d6.a.d(new f4.i(1, this));
                return;
            }
            y yVar = (y) a0Var.next();
            arrayList3.add(new d6.j(yVar.f2830b, Integer.valueOf(yVar.f2829a)));
        }
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int a(String str) {
        k.f(str, "name");
        Integer num = (Integer) this.f6458i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String b() {
        return this.f6450a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final m c() {
        return this.f6451b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d() {
        return this.f6452c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e(int i7) {
        return this.f6454e[i7];
    }

    public final boolean equals(Object obj) {
        int i7;
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (k.a(this.f6450a, serialDescriptor.b()) && Arrays.equals(this.f6459j, ((f) obj).f6459j)) {
                int d8 = serialDescriptor.d();
                int i8 = this.f6452c;
                if (i8 == d8) {
                    for (0; i7 < i8; i7 + 1) {
                        SerialDescriptor[] serialDescriptorArr = this.f6455f;
                        i7 = (k.a(serialDescriptorArr[i7].b(), serialDescriptor.j(i7).b()) && k.a(serialDescriptorArr[i7].c(), serialDescriptor.j(i7).c())) ? i7 + 1 : 0;
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

    @Override // o7.j
    public final Set g() {
        return this.f6453d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return u.f2826f;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return ((Number) this.f6460k.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i7) {
        return this.f6456g[i7];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i7) {
        return this.f6455f[i7];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i7) {
        return this.f6457h[i7];
    }

    public final String toString() {
        return l.m0(v1.g.o(0, this.f6452c), ", ", this.f6450a + '(', ")", new g4.b(2, this), 24);
    }
}
