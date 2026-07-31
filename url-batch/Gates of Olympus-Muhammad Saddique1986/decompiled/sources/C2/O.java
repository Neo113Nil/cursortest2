package C2;

import a.AbstractC0235a;
import e2.InterfaceC0422a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public class O implements SerialDescriptor, InterfaceC0047j {

    /* renamed from: a, reason: collision with root package name */
    public final String f709a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0059w f710b;

    /* renamed from: c, reason: collision with root package name */
    public final int f711c;

    /* renamed from: d, reason: collision with root package name */
    public int f712d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f713e;

    /* renamed from: f, reason: collision with root package name */
    public final List[] f714f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f715g;

    /* renamed from: h, reason: collision with root package name */
    public Object f716h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f717i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f718j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f719k;

    public O(String str, InterfaceC0059w interfaceC0059w, int i3) {
        this.f709a = str;
        this.f710b = interfaceC0059w;
        this.f711c = i3;
        String[] strArr = new String[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            strArr[i4] = "[UNINITIALIZED]";
        }
        this.f713e = strArr;
        int i5 = this.f711c;
        this.f714f = new List[i5];
        this.f715g = new boolean[i5];
        this.f716h = S1.v.f4321d;
        R1.g gVar = R1.g.f4147d;
        final int i6 = 0;
        this.f717i = R1.a.c(gVar, new InterfaceC0422a(this) { // from class: C2.N

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ O f708e;

            {
                this.f708e = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [R1.f, java.lang.Object] */
            @Override // e2.InterfaceC0422a
            public final Object b() {
                KSerializer[] childSerializers;
                ArrayList arrayList;
                KSerializer[] typeParametersSerializers;
                switch (i6) {
                    case 0:
                        InterfaceC0059w interfaceC0059w2 = this.f708e.f710b;
                        return (interfaceC0059w2 == null || (childSerializers = interfaceC0059w2.childSerializers()) == null) ? M.f706b : childSerializers;
                    case 1:
                        InterfaceC0059w interfaceC0059w3 = this.f708e.f710b;
                        if (interfaceC0059w3 == null || (typeParametersSerializers = interfaceC0059w3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (KSerializer kSerializer : typeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return M.c(arrayList);
                    default:
                        O o3 = this.f708e;
                        return Integer.valueOf(M.d(o3, (SerialDescriptor[]) o3.f718j.getValue()));
                }
            }
        });
        final int i7 = 1;
        this.f718j = R1.a.c(gVar, new InterfaceC0422a(this) { // from class: C2.N

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ O f708e;

            {
                this.f708e = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [R1.f, java.lang.Object] */
            @Override // e2.InterfaceC0422a
            public final Object b() {
                KSerializer[] childSerializers;
                ArrayList arrayList;
                KSerializer[] typeParametersSerializers;
                switch (i7) {
                    case 0:
                        InterfaceC0059w interfaceC0059w2 = this.f708e.f710b;
                        return (interfaceC0059w2 == null || (childSerializers = interfaceC0059w2.childSerializers()) == null) ? M.f706b : childSerializers;
                    case 1:
                        InterfaceC0059w interfaceC0059w3 = this.f708e.f710b;
                        if (interfaceC0059w3 == null || (typeParametersSerializers = interfaceC0059w3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (KSerializer kSerializer : typeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return M.c(arrayList);
                    default:
                        O o3 = this.f708e;
                        return Integer.valueOf(M.d(o3, (SerialDescriptor[]) o3.f718j.getValue()));
                }
            }
        });
        final int i8 = 2;
        this.f719k = R1.a.c(gVar, new InterfaceC0422a(this) { // from class: C2.N

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ O f708e;

            {
                this.f708e = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [R1.f, java.lang.Object] */
            @Override // e2.InterfaceC0422a
            public final Object b() {
                KSerializer[] childSerializers;
                ArrayList arrayList;
                KSerializer[] typeParametersSerializers;
                switch (i8) {
                    case 0:
                        InterfaceC0059w interfaceC0059w2 = this.f708e.f710b;
                        return (interfaceC0059w2 == null || (childSerializers = interfaceC0059w2.childSerializers()) == null) ? M.f706b : childSerializers;
                    case 1:
                        InterfaceC0059w interfaceC0059w3 = this.f708e.f710b;
                        if (interfaceC0059w3 == null || (typeParametersSerializers = interfaceC0059w3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (KSerializer kSerializer : typeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return M.c(arrayList);
                    default:
                        O o3 = this.f708e;
                        return Integer.valueOf(M.d(o3, (SerialDescriptor[]) o3.f718j.getValue()));
                }
            }
        });
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a(int i3) {
        return this.f713e[i3];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean b() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        f2.j.f(str, "name");
        Integer num = (Integer) this.f716h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d() {
        return this.f709a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // C2.InterfaceC0047j
    public final Set e() {
        return this.f716h.keySet();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [R1.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [R1.f, java.lang.Object] */
    public boolean equals(Object obj) {
        int i3;
        if (this == obj) {
            return true;
        }
        if (obj instanceof O) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.f709a.equals(serialDescriptor.d()) && Arrays.equals((SerialDescriptor[]) this.f718j.getValue(), (SerialDescriptor[]) ((O) obj).f718j.getValue())) {
                int l3 = serialDescriptor.l();
                int i4 = this.f711c;
                if (i4 == l3) {
                    for (0; i3 < i4; i3 + 1) {
                        i3 = (f2.j.a(h(i3).d(), serialDescriptor.h(i3).d()) && f2.j.a(h(i3).i(), serialDescriptor.h(i3).i())) ? i3 + 1 : 0;
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
        List list = this.f714f[i3];
        return list == null ? S1.u.f4320d : list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [R1.f, java.lang.Object] */
    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor h(int i3) {
        return ((KSerializer[]) this.f717i.getValue())[i3].getDescriptor();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [R1.f, java.lang.Object] */
    public int hashCode() {
        return ((Number) this.f719k.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public AbstractC0235a i() {
        return A2.k.f257c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i3) {
        return this.f715g[i3];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List k() {
        return S1.u.f4320d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int l() {
        return this.f711c;
    }

    public final void m(String str, boolean z3) {
        f2.j.f(str, "name");
        int i3 = this.f712d + 1;
        this.f712d = i3;
        String[] strArr = this.f713e;
        strArr[i3] = str;
        this.f715g[i3] = z3;
        this.f714f[i3] = null;
        if (i3 == this.f711c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i4 = 0; i4 < length; i4++) {
                hashMap.put(strArr[i4], Integer.valueOf(i4));
            }
            this.f716h = hashMap;
        }
    }

    public String toString() {
        return S1.l.P0(O2.d.g0(0, this.f711c), ", ", this.f709a.concat("("), ")", new A2.g(2, this), 24);
    }
}
