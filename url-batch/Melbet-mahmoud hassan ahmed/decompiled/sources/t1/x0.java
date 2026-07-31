package t1;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import r0.i;
import r0.s1;

/* loaded from: classes.dex */
public final class x0 implements r0.i {

    /* renamed from: k, reason: collision with root package name */
    public static final i.a<x0> f22258k = new i.a() { // from class: t1.w0
        @Override // r0.i.a
        public final r0.i a(Bundle bundle) {
            x0 e7;
            e7 = x0.e(bundle);
            return e7;
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public final int f22259f;

    /* renamed from: g, reason: collision with root package name */
    public final String f22260g;

    /* renamed from: h, reason: collision with root package name */
    public final int f22261h;

    /* renamed from: i, reason: collision with root package name */
    private final s1[] f22262i;

    /* renamed from: j, reason: collision with root package name */
    private int f22263j;

    public x0(String str, s1... s1VarArr) {
        o2.a.a(s1VarArr.length > 0);
        this.f22260g = str;
        this.f22262i = s1VarArr;
        this.f22259f = s1VarArr.length;
        int k7 = o2.v.k(s1VarArr[0].f20956q);
        this.f22261h = k7 == -1 ? o2.v.k(s1VarArr[0].f20955p) : k7;
        i();
    }

    public x0(s1... s1VarArr) {
        this("", s1VarArr);
    }

    private static String d(int i7) {
        return Integer.toString(i7, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ x0 e(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(d(0));
        return new x0(bundle.getString(d(1), ""), (s1[]) (parcelableArrayList == null ? m4.q.x() : o2.c.b(s1.M, parcelableArrayList)).toArray(new s1[0]));
    }

    private static void f(String str, String str2, String str3, int i7) {
        o2.r.d("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i7 + ")"));
    }

    private static String g(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static int h(int i7) {
        return i7 | 16384;
    }

    private void i() {
        String g7 = g(this.f22262i[0].f20947h);
        int h7 = h(this.f22262i[0].f20949j);
        int i7 = 1;
        while (true) {
            s1[] s1VarArr = this.f22262i;
            if (i7 >= s1VarArr.length) {
                return;
            }
            if (!g7.equals(g(s1VarArr[i7].f20947h))) {
                s1[] s1VarArr2 = this.f22262i;
                f("languages", s1VarArr2[0].f20947h, s1VarArr2[i7].f20947h, i7);
                return;
            } else {
                if (h7 != h(this.f22262i[i7].f20949j)) {
                    f("role flags", Integer.toBinaryString(this.f22262i[0].f20949j), Integer.toBinaryString(this.f22262i[i7].f20949j), i7);
                    return;
                }
                i7++;
            }
        }
    }

    public s1 b(int i7) {
        return this.f22262i[i7];
    }

    public int c(s1 s1Var) {
        int i7 = 0;
        while (true) {
            s1[] s1VarArr = this.f22262i;
            if (i7 >= s1VarArr.length) {
                return -1;
            }
            if (s1Var == s1VarArr[i7]) {
                return i7;
            }
            i7++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x0.class != obj.getClass()) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return this.f22260g.equals(x0Var.f22260g) && Arrays.equals(this.f22262i, x0Var.f22262i);
    }

    public int hashCode() {
        if (this.f22263j == 0) {
            this.f22263j = ((527 + this.f22260g.hashCode()) * 31) + Arrays.hashCode(this.f22262i);
        }
        return this.f22263j;
    }
}
