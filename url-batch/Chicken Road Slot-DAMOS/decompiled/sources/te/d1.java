package te;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class d1 implements re.e, k {

    /* renamed from: a, reason: collision with root package name */
    public final String f9357a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f9358b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9359c;

    /* renamed from: d, reason: collision with root package name */
    public int f9360d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f9361e;

    /* renamed from: f, reason: collision with root package name */
    public final List[] f9362f;
    public final boolean[] g;

    /* renamed from: h, reason: collision with root package name */
    public Object f9363h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f9364i;
    public final Object j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f9365k;

    public d1(String str, b0 b0Var, int i3) {
        str.getClass();
        this.f9357a = str;
        this.f9358b = b0Var;
        this.f9359c = i3;
        this.f9360d = -1;
        String[] strArr = new String[i3];
        for (int i10 = 0; i10 < i3; i10++) {
            strArr[i10] = "[UNINITIALIZED]";
        }
        this.f9361e = strArr;
        int i11 = this.f9359c;
        this.f9362f = new List[i11];
        this.g = new boolean[i11];
        kotlin.collections.k0 k0Var = kotlin.collections.k0.f5575d;
        k0Var.getClass();
        this.f9363h = k0Var;
        hd.i iVar = hd.i.f4507d;
        final int i12 = 0;
        this.f9364i = hd.h.a(iVar, new Function0(this) { // from class: te.c1

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ d1 f9348e;

            {
                this.f9348e = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [hd.g, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        b0 b0Var2 = this.f9348e.f9358b;
                        return b0Var2 != null ? b0Var2.c() : b1.f9339b;
                    case 1:
                        return b1.c(this.f9348e.f9358b != null ? new ArrayList(0) : null);
                    default:
                        d1 d1Var = this.f9348e;
                        return Integer.valueOf(b1.e(d1Var, (re.e[]) d1Var.j.getValue()));
                }
            }
        });
        final int i13 = 1;
        this.j = hd.h.a(iVar, new Function0(this) { // from class: te.c1

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ d1 f9348e;

            {
                this.f9348e = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [hd.g, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        b0 b0Var2 = this.f9348e.f9358b;
                        return b0Var2 != null ? b0Var2.c() : b1.f9339b;
                    case 1:
                        return b1.c(this.f9348e.f9358b != null ? new ArrayList(0) : null);
                    default:
                        d1 d1Var = this.f9348e;
                        return Integer.valueOf(b1.e(d1Var, (re.e[]) d1Var.j.getValue()));
                }
            }
        });
        final int i14 = 2;
        this.f9365k = hd.h.a(iVar, new Function0(this) { // from class: te.c1

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ d1 f9348e;

            {
                this.f9348e = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [hd.g, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        b0 b0Var2 = this.f9348e.f9358b;
                        return b0Var2 != null ? b0Var2.c() : b1.f9339b;
                    case 1:
                        return b1.c(this.f9348e.f9358b != null ? new ArrayList(0) : null);
                    default:
                        d1 d1Var = this.f9348e;
                        return Integer.valueOf(b1.e(d1Var, (re.e[]) d1Var.j.getValue()));
                }
            }
        });
    }

    @Override // re.e
    public final String a() {
        return this.f9357a;
    }

    @Override // re.e
    public i7.a b() {
        return re.h.g;
    }

    @Override // re.e
    public final int c() {
        return this.f9359c;
    }

    @Override // re.e
    public final String d(int i3) {
        return this.f9361e[i3];
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [hd.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [hd.g, java.lang.Object] */
    public boolean equals(Object obj) {
        int i3;
        if (this == obj) {
            return true;
        }
        if (obj instanceof d1) {
            re.e eVar = (re.e) obj;
            if (Intrinsics.a(this.f9357a, eVar.a()) && Arrays.equals((re.e[]) this.j.getValue(), (re.e[]) ((d1) obj).j.getValue())) {
                int c10 = eVar.c();
                int i10 = this.f9359c;
                if (i10 == c10) {
                    for (0; i3 < i10; i3 + 1) {
                        i3 = (Intrinsics.a(h(i3).a(), eVar.h(i3).a()) && Intrinsics.a(h(i3).b(), eVar.h(i3).b())) ? i3 + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // te.k
    public final Set f() {
        return this.f9363h.keySet();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [hd.g, java.lang.Object] */
    @Override // re.e
    public re.e h(int i3) {
        return ((pe.a[]) this.f9364i.getValue())[i3].d();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [hd.g, java.lang.Object] */
    public int hashCode() {
        return ((Number) this.f9365k.getValue()).intValue();
    }

    @Override // re.e
    public final boolean i(int i3) {
        return this.g[i3];
    }

    public final void j(String str) {
        str.getClass();
        int i3 = this.f9360d + 1;
        this.f9360d = i3;
        String[] strArr = this.f9361e;
        strArr[i3] = str;
        this.g[i3] = false;
        this.f9362f[i3] = null;
        if (i3 == this.f9359c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                hashMap.put(strArr[i10], Integer.valueOf(i10));
            }
            this.f9363h = hashMap;
        }
    }

    public String toString() {
        return b1.j(this);
    }
}
