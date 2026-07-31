package w2;

import e2.AbstractC0381e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public class O implements SerialDescriptor, InterfaceC1031j {

    /* renamed from: a, reason: collision with root package name */
    public final String f8622a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1043w f8623b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8624c;

    /* renamed from: d, reason: collision with root package name */
    public int f8625d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f8626e;

    /* renamed from: f, reason: collision with root package name */
    public final List[] f8627f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f8628g;

    /* renamed from: h, reason: collision with root package name */
    public Object f8629h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f8630i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f8631j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f8632k;

    public O(String str, InterfaceC1043w interfaceC1043w, int i3) {
        this.f8622a = str;
        this.f8623b = interfaceC1043w;
        this.f8624c = i3;
        String[] strArr = new String[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            strArr[i4] = "[UNINITIALIZED]";
        }
        this.f8626e = strArr;
        int i5 = this.f8624c;
        this.f8627f = new List[i5];
        this.f8628g = new boolean[i5];
        this.f8629h = M1.v.f2804d;
        L1.h hVar = L1.h.f2705d;
        final int i6 = 0;
        this.f8630i = I2.d.E(hVar, new Y1.a(this) { // from class: w2.N

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ O f8621e;

            {
                this.f8621e = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [L1.g, java.lang.Object] */
            @Override // Y1.a
            public final Object b() {
                KSerializer[] childSerializers;
                ArrayList arrayList;
                KSerializer[] typeParametersSerializers;
                switch (i6) {
                    case 0:
                        InterfaceC1043w interfaceC1043w2 = this.f8621e.f8623b;
                        return (interfaceC1043w2 == null || (childSerializers = interfaceC1043w2.childSerializers()) == null) ? M.f8619b : childSerializers;
                    case 1:
                        InterfaceC1043w interfaceC1043w3 = this.f8621e.f8623b;
                        if (interfaceC1043w3 == null || (typeParametersSerializers = interfaceC1043w3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (KSerializer kSerializer : typeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return M.c(arrayList);
                    default:
                        O o3 = this.f8621e;
                        return Integer.valueOf(M.d(o3, (SerialDescriptor[]) o3.f8631j.getValue()));
                }
            }
        });
        final int i7 = 1;
        this.f8631j = I2.d.E(hVar, new Y1.a(this) { // from class: w2.N

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ O f8621e;

            {
                this.f8621e = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [L1.g, java.lang.Object] */
            @Override // Y1.a
            public final Object b() {
                KSerializer[] childSerializers;
                ArrayList arrayList;
                KSerializer[] typeParametersSerializers;
                switch (i7) {
                    case 0:
                        InterfaceC1043w interfaceC1043w2 = this.f8621e.f8623b;
                        return (interfaceC1043w2 == null || (childSerializers = interfaceC1043w2.childSerializers()) == null) ? M.f8619b : childSerializers;
                    case 1:
                        InterfaceC1043w interfaceC1043w3 = this.f8621e.f8623b;
                        if (interfaceC1043w3 == null || (typeParametersSerializers = interfaceC1043w3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (KSerializer kSerializer : typeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return M.c(arrayList);
                    default:
                        O o3 = this.f8621e;
                        return Integer.valueOf(M.d(o3, (SerialDescriptor[]) o3.f8631j.getValue()));
                }
            }
        });
        final int i8 = 2;
        this.f8632k = I2.d.E(hVar, new Y1.a(this) { // from class: w2.N

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ O f8621e;

            {
                this.f8621e = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [L1.g, java.lang.Object] */
            @Override // Y1.a
            public final Object b() {
                KSerializer[] childSerializers;
                ArrayList arrayList;
                KSerializer[] typeParametersSerializers;
                switch (i8) {
                    case 0:
                        InterfaceC1043w interfaceC1043w2 = this.f8621e.f8623b;
                        return (interfaceC1043w2 == null || (childSerializers = interfaceC1043w2.childSerializers()) == null) ? M.f8619b : childSerializers;
                    case 1:
                        InterfaceC1043w interfaceC1043w3 = this.f8621e.f8623b;
                        if (interfaceC1043w3 == null || (typeParametersSerializers = interfaceC1043w3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (KSerializer kSerializer : typeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return M.c(arrayList);
                    default:
                        O o3 = this.f8621e;
                        return Integer.valueOf(M.d(o3, (SerialDescriptor[]) o3.f8631j.getValue()));
                }
            }
        });
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a(int i3) {
        return this.f8626e[i3];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean b() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        Z1.i.f(str, "name");
        Integer num = (Integer) this.f8629h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d() {
        return this.f8622a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // w2.InterfaceC1031j
    public final Set e() {
        return this.f8629h.keySet();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [L1.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [L1.g, java.lang.Object] */
    public boolean equals(Object obj) {
        int i3;
        if (this == obj) {
            return true;
        }
        if (obj instanceof O) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.f8622a.equals(serialDescriptor.d()) && Arrays.equals((SerialDescriptor[]) this.f8631j.getValue(), (SerialDescriptor[]) ((O) obj).f8631j.getValue())) {
                int l3 = serialDescriptor.l();
                int i4 = this.f8624c;
                if (i4 == l3) {
                    for (0; i3 < i4; i3 + 1) {
                        i3 = (Z1.i.a(h(i3).d(), serialDescriptor.h(i3).d()) && Z1.i.a(h(i3).i(), serialDescriptor.h(i3).i())) ? i3 + 1 : 0;
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
        List list = this.f8627f[i3];
        return list == null ? M1.u.f2803d : list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [L1.g, java.lang.Object] */
    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor h(int i3) {
        return ((KSerializer[]) this.f8630i.getValue())[i3].getDescriptor();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [L1.g, java.lang.Object] */
    public int hashCode() {
        return ((Number) this.f8632k.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public AbstractC0381e i() {
        return u2.h.f8550b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i3) {
        return this.f8628g[i3];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List k() {
        return M1.u.f2803d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int l() {
        return this.f8624c;
    }

    public final void m(String str, boolean z3) {
        Z1.i.f(str, "name");
        int i3 = this.f8625d + 1;
        this.f8625d = i3;
        String[] strArr = this.f8626e;
        strArr[i3] = str;
        this.f8628g[i3] = z3;
        this.f8627f[i3] = null;
        if (i3 == this.f8624c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i4 = 0; i4 < length; i4++) {
                hashMap.put(strArr[i4], Integer.valueOf(i4));
            }
            this.f8629h = hashMap;
        }
    }

    public String toString() {
        return M1.l.r0(AbstractC0381e.Q(0, this.f8624c), ", ", this.f8622a.concat("("), ")", new E1.k(3, this), 24);
    }
}
