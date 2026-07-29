package android.support.constraint.a;

/* compiled from: Pools.java */
/* loaded from: classes.dex */
final class f {

    /* compiled from: Pools.java */
    interface a<T> {
        T a();

        void a(T[] tArr, int i);

        boolean a(T t);
    }

    /* compiled from: Pools.java */
    static class b<T> implements a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Object[] f1442a;

        /* renamed from: b, reason: collision with root package name */
        private int f1443b;

        b(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f1442a = new Object[i];
        }

        @Override // android.support.constraint.a.f.a
        public T a() {
            if (this.f1443b <= 0) {
                return null;
            }
            int i = this.f1443b - 1;
            T t = (T) this.f1442a[i];
            this.f1442a[i] = null;
            this.f1443b--;
            return t;
        }

        @Override // android.support.constraint.a.f.a
        public boolean a(T t) {
            if (this.f1443b >= this.f1442a.length) {
                return false;
            }
            this.f1442a[this.f1443b] = t;
            this.f1443b++;
            return true;
        }

        @Override // android.support.constraint.a.f.a
        public void a(T[] tArr, int i) {
            if (i > tArr.length) {
                i = tArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                T t = tArr[i2];
                if (this.f1443b < this.f1442a.length) {
                    this.f1442a[this.f1443b] = t;
                    this.f1443b++;
                }
            }
        }
    }
}
