package o7;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class p0 implements SerialDescriptor, j {

    /* renamed from: a, reason: collision with root package name */
    public final String f6923a;

    /* renamed from: b, reason: collision with root package name */
    public final w f6924b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6925c;

    /* renamed from: d, reason: collision with root package name */
    public int f6926d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f6927e;

    /* renamed from: f, reason: collision with root package name */
    public final List[] f6928f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f6929g;

    /* renamed from: h, reason: collision with root package name */
    public Object f6930h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f6931i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f6932j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f6933k;

    public p0(String str, w wVar, int i7) {
        this.f6923a = str;
        this.f6924b = wVar;
        this.f6925c = i7;
        String[] strArr = new String[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            strArr[i8] = "[UNINITIALIZED]";
        }
        this.f6927e = strArr;
        int i9 = this.f6925c;
        this.f6928f = new List[i9];
        this.f6929g = new boolean[i9];
        this.f6930h = e6.v.f2827f;
        final int i10 = 0;
        q6.a aVar = new q6.a(this) { // from class: o7.o0

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ p0 f6919g;

            {
                this.f6919g = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [d6.g, java.lang.Object] */
            @Override // q6.a
            public final Object a() {
                KSerializer[] childSerializers;
                ArrayList arrayList;
                KSerializer[] typeParametersSerializers;
                switch (i10) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        w wVar2 = this.f6919g.f6924b;
                        return (wVar2 == null || (childSerializers = wVar2.childSerializers()) == null) ? n0.f6913b : childSerializers;
                    case 1:
                        w wVar3 = this.f6919g.f6924b;
                        if (wVar3 == null || (typeParametersSerializers = wVar3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (KSerializer kSerializer : typeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return n0.c(arrayList);
                    default:
                        p0 p0Var = this.f6919g;
                        return Integer.valueOf(n0.d(p0Var, (SerialDescriptor[]) p0Var.f6932j.getValue()));
                }
            }
        };
        d6.h hVar = d6.h.f2615f;
        this.f6931i = d6.a.c(hVar, aVar);
        final int i11 = 1;
        this.f6932j = d6.a.c(hVar, new q6.a(this) { // from class: o7.o0

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ p0 f6919g;

            {
                this.f6919g = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [d6.g, java.lang.Object] */
            @Override // q6.a
            public final Object a() {
                KSerializer[] childSerializers;
                ArrayList arrayList;
                KSerializer[] typeParametersSerializers;
                switch (i11) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        w wVar2 = this.f6919g.f6924b;
                        return (wVar2 == null || (childSerializers = wVar2.childSerializers()) == null) ? n0.f6913b : childSerializers;
                    case 1:
                        w wVar3 = this.f6919g.f6924b;
                        if (wVar3 == null || (typeParametersSerializers = wVar3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (KSerializer kSerializer : typeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return n0.c(arrayList);
                    default:
                        p0 p0Var = this.f6919g;
                        return Integer.valueOf(n0.d(p0Var, (SerialDescriptor[]) p0Var.f6932j.getValue()));
                }
            }
        });
        final int i12 = 2;
        this.f6933k = d6.a.c(hVar, new q6.a(this) { // from class: o7.o0

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ p0 f6919g;

            {
                this.f6919g = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [d6.g, java.lang.Object] */
            @Override // q6.a
            public final Object a() {
                KSerializer[] childSerializers;
                ArrayList arrayList;
                KSerializer[] typeParametersSerializers;
                switch (i12) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        w wVar2 = this.f6919g.f6924b;
                        return (wVar2 == null || (childSerializers = wVar2.childSerializers()) == null) ? n0.f6913b : childSerializers;
                    case 1:
                        w wVar3 = this.f6919g.f6924b;
                        if (wVar3 == null || (typeParametersSerializers = wVar3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (KSerializer kSerializer : typeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return n0.c(arrayList);
                    default:
                        p0 p0Var = this.f6919g;
                        return Integer.valueOf(n0.d(p0Var, (SerialDescriptor[]) p0Var.f6932j.getValue()));
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int a(String str) {
        r6.k.f(str, "name");
        Integer num = (Integer) this.f6930h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String b() {
        return this.f6923a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public a8.m c() {
        return m7.h.f6463g;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d() {
        return this.f6925c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e(int i7) {
        return this.f6927e[i7];
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [d6.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [d6.g, java.lang.Object] */
    public boolean equals(Object obj) {
        int i7;
        if (this == obj) {
            return true;
        }
        if (obj instanceof p0) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.f6923a.equals(serialDescriptor.b()) && Arrays.equals((SerialDescriptor[]) this.f6932j.getValue(), (SerialDescriptor[]) ((p0) obj).f6932j.getValue())) {
                int d8 = serialDescriptor.d();
                int i8 = this.f6925c;
                if (i8 == d8) {
                    for (0; i7 < i8; i7 + 1) {
                        i7 = (r6.k.a(j(i7).b(), serialDescriptor.j(i7).b()) && r6.k.a(j(i7).c(), serialDescriptor.j(i7).c())) ? i7 + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean f() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // o7.j
    public final Set g() {
        return this.f6930h.keySet();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return e6.u.f2826f;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean h() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d6.g, java.lang.Object] */
    public int hashCode() {
        return ((Number) this.f6933k.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i7) {
        List list = this.f6928f[i7];
        return list == null ? e6.u.f2826f : list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d6.g, java.lang.Object] */
    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor j(int i7) {
        return ((KSerializer[]) this.f6931i.getValue())[i7].getDescriptor();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i7) {
        return this.f6929g[i7];
    }

    public final void l(String str, boolean z8) {
        r6.k.f(str, "name");
        int i7 = this.f6926d + 1;
        this.f6926d = i7;
        String[] strArr = this.f6927e;
        strArr[i7] = str;
        this.f6929g[i7] = z8;
        this.f6928f[i7] = null;
        if (i7 == this.f6925c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i8 = 0; i8 < length; i8++) {
                hashMap.put(strArr[i8], Integer.valueOf(i8));
            }
            this.f6930h = hashMap;
        }
    }

    public String toString() {
        return e6.l.m0(v1.g.o(0, this.f6925c), ", ", this.f6923a.concat("("), ")", new g4.b(3, this), 24);
    }
}
