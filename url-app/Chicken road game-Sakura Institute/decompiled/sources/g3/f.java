package g3;

import A.AbstractC0017m;
import A1.C0068m;
import A1.C0070n;
import i3.InterfaceC0689j;
import i3.M;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import y2.C1336k;
import y2.InterfaceC1335j;
import z2.C1403G;
import z2.C1405I;
import z2.C1408L;
import z2.C1411O;
import z2.C1412P;
import z2.C1439w;
import z2.C1442z;

/* loaded from: classes.dex */
public final class f implements SerialDescriptor, InterfaceC0689j {

    /* renamed from: a, reason: collision with root package name */
    public final String f6793a;

    /* renamed from: b, reason: collision with root package name */
    public final u3.d f6794b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6795c;

    /* renamed from: d, reason: collision with root package name */
    public final C1405I f6796d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f6797e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f6798f;

    /* renamed from: g, reason: collision with root package name */
    public final SerialDescriptor[] f6799g;

    /* renamed from: h, reason: collision with root package name */
    public final List[] f6800h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f6801i;

    /* renamed from: j, reason: collision with root package name */
    public final Map f6802j;

    /* renamed from: k, reason: collision with root package name */
    public final SerialDescriptor[] f6803k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC1335j f6804l;

    public f(String serialName, u3.d kind, int i2, List typeParameters, a builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f6793a = serialName;
        this.f6794b = kind;
        this.f6795c = i2;
        this.f6796d = builder.f6777b;
        ArrayList arrayList = builder.f6778c;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        HashSet hashSet = new HashSet(C1411O.a(C1442z.h(arrayList, 12)));
        C1403G.F(arrayList, hashSet);
        this.f6797e = hashSet;
        int i4 = 0;
        this.f6798f = (String[]) arrayList.toArray(new String[0]);
        this.f6799g = M.c(builder.f6780e);
        this.f6800h = (List[]) builder.f6781f.toArray(new List[0]);
        ArrayList arrayList2 = builder.f6782g;
        Intrinsics.checkNotNullParameter(arrayList2, "<this>");
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i4] = ((Boolean) it.next()).booleanValue();
            i4++;
        }
        this.f6801i = zArr;
        C1408L B = C1439w.B(this.f6798f);
        ArrayList arrayList3 = new ArrayList(C1442z.h(B, 10));
        Iterator it2 = B.iterator();
        while (true) {
            T2.b bVar = (T2.b) it2;
            if (!bVar.f4036e.hasNext()) {
                this.f6802j = C1412P.h(arrayList3);
                this.f6803k = M.c(typeParameters);
                this.f6804l = C1336k.a(new C0068m(3, this));
                return;
            }
            IndexedValue indexedValue = (IndexedValue) bVar.next();
            arrayList3.add(new Pair(indexedValue.f7489b, Integer.valueOf(indexedValue.f7488a)));
        }
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a(int i2) {
        return this.f6798f[i2];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = (Integer) this.f6802j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d() {
        return this.f6793a;
    }

    @Override // i3.InterfaceC0689j
    public final Set e() {
        return this.f6797e;
    }

    public final boolean equals(Object obj) {
        int i2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (Intrinsics.a(this.f6793a, serialDescriptor.d()) && Arrays.equals(this.f6803k, ((f) obj).f6803k)) {
                int l4 = serialDescriptor.l();
                int i4 = this.f6795c;
                if (i4 == l4) {
                    for (0; i2 < i4; i2 + 1) {
                        SerialDescriptor[] serialDescriptorArr = this.f6799g;
                        i2 = (Intrinsics.a(serialDescriptorArr[i2].d(), serialDescriptor.h(i2).d()) && Intrinsics.a(serialDescriptorArr[i2].i(), serialDescriptor.h(i2).i())) ? i2 + 1 : 0;
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
    public final List g(int i2) {
        return this.f6800h[i2];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i2) {
        return this.f6799g[i2];
    }

    public final int hashCode() {
        return ((Number) this.f6804l.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final u3.d i() {
        return this.f6794b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i2) {
        return this.f6801i[i2];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List k() {
        return this.f6796d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int l() {
        return this.f6795c;
    }

    public final String toString() {
        return C1403G.w(kotlin.ranges.b.h(0, this.f6795c), ", ", AbstractC0017m.m(new StringBuilder(), this.f6793a, '('), ")", new C0070n(4, this), 24);
    }
}
