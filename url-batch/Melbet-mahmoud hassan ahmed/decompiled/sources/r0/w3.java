package r0;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import r0.i;
import r0.w3;

/* loaded from: classes.dex */
public final class w3 implements i {

    /* renamed from: g, reason: collision with root package name */
    public static final w3 f21084g = new w3(m4.q.x());

    /* renamed from: h, reason: collision with root package name */
    public static final i.a<w3> f21085h = new i.a() { // from class: r0.u3
        @Override // r0.i.a
        public final i a(Bundle bundle) {
            w3 e7;
            e7 = w3.e(bundle);
            return e7;
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private final m4.q<a> f21086f;

    public static final class a implements i {

        /* renamed from: k, reason: collision with root package name */
        public static final i.a<a> f21087k = new i.a() { // from class: r0.v3
            @Override // r0.i.a
            public final i a(Bundle bundle) {
                w3.a g7;
                g7 = w3.a.g(bundle);
                return g7;
            }
        };

        /* renamed from: f, reason: collision with root package name */
        public final int f21088f;

        /* renamed from: g, reason: collision with root package name */
        private final t1.x0 f21089g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f21090h;

        /* renamed from: i, reason: collision with root package name */
        private final int[] f21091i;

        /* renamed from: j, reason: collision with root package name */
        private final boolean[] f21092j;

        public a(t1.x0 x0Var, boolean z6, int[] iArr, boolean[] zArr) {
            int i7 = x0Var.f22259f;
            this.f21088f = i7;
            boolean z7 = false;
            o2.a.a(i7 == iArr.length && i7 == zArr.length);
            this.f21089g = x0Var;
            if (z6 && i7 > 1) {
                z7 = true;
            }
            this.f21090h = z7;
            this.f21091i = (int[]) iArr.clone();
            this.f21092j = (boolean[]) zArr.clone();
        }

        private static String f(int i7) {
            return Integer.toString(i7, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ a g(Bundle bundle) {
            t1.x0 a7 = t1.x0.f22258k.a((Bundle) o2.a.e(bundle.getBundle(f(0))));
            return new a(a7, bundle.getBoolean(f(4), false), (int[]) l4.g.a(bundle.getIntArray(f(1)), new int[a7.f22259f]), (boolean[]) l4.g.a(bundle.getBooleanArray(f(3)), new boolean[a7.f22259f]));
        }

        public s1 b(int i7) {
            return this.f21089g.b(i7);
        }

        public int c() {
            return this.f21089g.f22261h;
        }

        public boolean d() {
            return o4.a.b(this.f21092j, true);
        }

        public boolean e(int i7) {
            return this.f21092j[i7];
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f21090h == aVar.f21090h && this.f21089g.equals(aVar.f21089g) && Arrays.equals(this.f21091i, aVar.f21091i) && Arrays.equals(this.f21092j, aVar.f21092j);
        }

        public int hashCode() {
            return (((((this.f21089g.hashCode() * 31) + (this.f21090h ? 1 : 0)) * 31) + Arrays.hashCode(this.f21091i)) * 31) + Arrays.hashCode(this.f21092j);
        }
    }

    public w3(List<a> list) {
        this.f21086f = m4.q.t(list);
    }

    private static String d(int i7) {
        return Integer.toString(i7, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ w3 e(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(d(0));
        return new w3(parcelableArrayList == null ? m4.q.x() : o2.c.b(a.f21087k, parcelableArrayList));
    }

    public m4.q<a> b() {
        return this.f21086f;
    }

    public boolean c(int i7) {
        for (int i8 = 0; i8 < this.f21086f.size(); i8++) {
            a aVar = this.f21086f.get(i8);
            if (aVar.d() && aVar.c() == i7) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w3.class != obj.getClass()) {
            return false;
        }
        return this.f21086f.equals(((w3) obj).f21086f);
    }

    public int hashCode() {
        return this.f21086f.hashCode();
    }
}
