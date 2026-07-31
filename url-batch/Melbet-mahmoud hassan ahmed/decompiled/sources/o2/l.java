package o2;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f19743a;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final SparseBooleanArray f19744a = new SparseBooleanArray();

        /* renamed from: b, reason: collision with root package name */
        private boolean f19745b;

        public b a(int i7) {
            o2.a.f(!this.f19745b);
            this.f19744a.append(i7, true);
            return this;
        }

        public b b(l lVar) {
            for (int i7 = 0; i7 < lVar.c(); i7++) {
                a(lVar.b(i7));
            }
            return this;
        }

        public b c(int... iArr) {
            for (int i7 : iArr) {
                a(i7);
            }
            return this;
        }

        public b d(int i7, boolean z6) {
            return z6 ? a(i7) : this;
        }

        public l e() {
            o2.a.f(!this.f19745b);
            this.f19745b = true;
            return new l(this.f19744a);
        }
    }

    private l(SparseBooleanArray sparseBooleanArray) {
        this.f19743a = sparseBooleanArray;
    }

    public boolean a(int i7) {
        return this.f19743a.get(i7);
    }

    public int b(int i7) {
        o2.a.c(i7, 0, c());
        return this.f19743a.keyAt(i7);
    }

    public int c() {
        return this.f19743a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (m0.f19752a >= 24) {
            return this.f19743a.equals(lVar.f19743a);
        }
        if (c() != lVar.c()) {
            return false;
        }
        for (int i7 = 0; i7 < c(); i7++) {
            if (b(i7) != lVar.b(i7)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (m0.f19752a >= 24) {
            return this.f19743a.hashCode();
        }
        int c7 = c();
        for (int i7 = 0; i7 < c(); i7++) {
            c7 = (c7 * 31) + b(i7);
        }
        return c7;
    }
}
