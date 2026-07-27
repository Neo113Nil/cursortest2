package i3;

import A.AbstractC0017m;
import A1.C0070n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import y2.C1336k;
import y2.EnumC1337l;
import z2.C1403G;
import z2.C1405I;
import z2.C1412P;

/* loaded from: classes.dex */
public class O implements SerialDescriptor, InterfaceC0689j {

    /* renamed from: a, reason: collision with root package name */
    public final String f7031a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0701w f7032b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7033c;

    /* renamed from: d, reason: collision with root package name */
    public int f7034d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f7035e;

    /* renamed from: f, reason: collision with root package name */
    public final List[] f7036f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f7037g;

    /* renamed from: h, reason: collision with root package name */
    public Object f7038h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f7039i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f7040j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f7041k;

    public O(String serialName, InterfaceC0701w interfaceC0701w, int i2) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.f7031a = serialName;
        this.f7032b = interfaceC0701w;
        this.f7033c = i2;
        this.f7034d = -1;
        String[] strArr = new String[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            strArr[i4] = "[UNINITIALIZED]";
        }
        this.f7035e = strArr;
        int i5 = this.f7033c;
        this.f7036f = new List[i5];
        this.f7037g = new boolean[i5];
        this.f7038h = C1412P.c();
        EnumC1337l enumC1337l = EnumC1337l.f11670d;
        final int i6 = 0;
        this.f7039i = C1336k.b(enumC1337l, new Function0(this) { // from class: i3.N

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ O f7030e;

            {
                this.f7030e = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, y2.j] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KSerializer[] childSerializers;
                ArrayList arrayList;
                KSerializer[] typeParametersSerializers;
                switch (i6) {
                    case 0:
                        InterfaceC0701w interfaceC0701w2 = this.f7030e.f7032b;
                        return (interfaceC0701w2 == null || (childSerializers = interfaceC0701w2.childSerializers()) == null) ? M.f7028b : childSerializers;
                    case 1:
                        InterfaceC0701w interfaceC0701w3 = this.f7030e.f7032b;
                        if (interfaceC0701w3 == null || (typeParametersSerializers = interfaceC0701w3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (KSerializer kSerializer : typeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return M.c(arrayList);
                    default:
                        O o4 = this.f7030e;
                        return Integer.valueOf(M.d(o4, (SerialDescriptor[]) o4.f7040j.getValue()));
                }
            }
        });
        final int i7 = 1;
        this.f7040j = C1336k.b(enumC1337l, new Function0(this) { // from class: i3.N

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ O f7030e;

            {
                this.f7030e = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, y2.j] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KSerializer[] childSerializers;
                ArrayList arrayList;
                KSerializer[] typeParametersSerializers;
                switch (i7) {
                    case 0:
                        InterfaceC0701w interfaceC0701w2 = this.f7030e.f7032b;
                        return (interfaceC0701w2 == null || (childSerializers = interfaceC0701w2.childSerializers()) == null) ? M.f7028b : childSerializers;
                    case 1:
                        InterfaceC0701w interfaceC0701w3 = this.f7030e.f7032b;
                        if (interfaceC0701w3 == null || (typeParametersSerializers = interfaceC0701w3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (KSerializer kSerializer : typeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return M.c(arrayList);
                    default:
                        O o4 = this.f7030e;
                        return Integer.valueOf(M.d(o4, (SerialDescriptor[]) o4.f7040j.getValue()));
                }
            }
        });
        final int i8 = 2;
        this.f7041k = C1336k.b(enumC1337l, new Function0(this) { // from class: i3.N

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ O f7030e;

            {
                this.f7030e = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, y2.j] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KSerializer[] childSerializers;
                ArrayList arrayList;
                KSerializer[] typeParametersSerializers;
                switch (i8) {
                    case 0:
                        InterfaceC0701w interfaceC0701w2 = this.f7030e.f7032b;
                        return (interfaceC0701w2 == null || (childSerializers = interfaceC0701w2.childSerializers()) == null) ? M.f7028b : childSerializers;
                    case 1:
                        InterfaceC0701w interfaceC0701w3 = this.f7030e.f7032b;
                        if (interfaceC0701w3 == null || (typeParametersSerializers = interfaceC0701w3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (KSerializer kSerializer : typeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return M.c(arrayList);
                    default:
                        O o4 = this.f7030e;
                        return Integer.valueOf(M.d(o4, (SerialDescriptor[]) o4.f7040j.getValue()));
                }
            }
        });
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a(int i2) {
        return this.f7035e[i2];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean b() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = (Integer) this.f7038h.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d() {
        return this.f7031a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // i3.InterfaceC0689j
    public final Set e() {
        return this.f7038h.keySet();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, y2.j] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, y2.j] */
    public boolean equals(Object obj) {
        int i2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof O) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (Intrinsics.a(this.f7031a, serialDescriptor.d()) && Arrays.equals((SerialDescriptor[]) this.f7040j.getValue(), (SerialDescriptor[]) ((O) obj).f7040j.getValue())) {
                int l4 = serialDescriptor.l();
                int i4 = this.f7033c;
                if (i4 == l4) {
                    for (0; i2 < i4; i2 + 1) {
                        i2 = (Intrinsics.a(h(i2).d(), serialDescriptor.h(i2).d()) && Intrinsics.a(h(i2).i(), serialDescriptor.h(i2).i())) ? i2 + 1 : 0;
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
        List list = this.f7036f[i2];
        return list == null ? C1405I.f11931d : list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, y2.j] */
    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor h(int i2) {
        return ((KSerializer[]) this.f7039i.getValue())[i2].getDescriptor();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, y2.j] */
    public int hashCode() {
        return ((Number) this.f7041k.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public u3.d i() {
        return g3.i.f6807h;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i2) {
        return this.f7037g[i2];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List k() {
        return C1405I.f11931d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int l() {
        return this.f7033c;
    }

    public final void m(String name, boolean z4) {
        Intrinsics.checkNotNullParameter(name, "name");
        int i2 = this.f7034d + 1;
        this.f7034d = i2;
        String[] strArr = this.f7035e;
        strArr[i2] = name;
        this.f7037g[i2] = z4;
        this.f7036f[i2] = null;
        if (i2 == this.f7033c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i4 = 0; i4 < length; i4++) {
                hashMap.put(strArr[i4], Integer.valueOf(i4));
            }
            this.f7038h = hashMap;
        }
    }

    public String toString() {
        return C1403G.w(kotlin.ranges.b.h(0, this.f7033c), ", ", AbstractC0017m.m(new StringBuilder(), this.f7031a, '('), ")", new C0070n(6, this), 24);
    }
}
