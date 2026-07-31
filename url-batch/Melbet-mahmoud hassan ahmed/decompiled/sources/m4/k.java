package m4;

import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    private static final k f19157a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final k f19158b = new b(-1);

    /* renamed from: c, reason: collision with root package name */
    private static final k f19159c = new b(1);

    class a extends k {
        a() {
            super(null);
        }

        @Override // m4.k
        public k d(int i7, int i8) {
            return k(o4.d.e(i7, i8));
        }

        @Override // m4.k
        public k e(long j7, long j8) {
            return k(o4.f.a(j7, j8));
        }

        @Override // m4.k
        public <T> k f(T t6, T t7, Comparator<T> comparator) {
            return k(comparator.compare(t6, t7));
        }

        @Override // m4.k
        public k g(boolean z6, boolean z7) {
            return k(o4.a.a(z6, z7));
        }

        @Override // m4.k
        public k h(boolean z6, boolean z7) {
            return k(o4.a.a(z7, z6));
        }

        @Override // m4.k
        public int i() {
            return 0;
        }

        k k(int i7) {
            return i7 < 0 ? k.f19158b : i7 > 0 ? k.f19159c : k.f19157a;
        }
    }

    private static final class b extends k {

        /* renamed from: d, reason: collision with root package name */
        final int f19160d;

        b(int i7) {
            super(null);
            this.f19160d = i7;
        }

        @Override // m4.k
        public k d(int i7, int i8) {
            return this;
        }

        @Override // m4.k
        public k e(long j7, long j8) {
            return this;
        }

        @Override // m4.k
        public <T> k f(T t6, T t7, Comparator<T> comparator) {
            return this;
        }

        @Override // m4.k
        public k g(boolean z6, boolean z7) {
            return this;
        }

        @Override // m4.k
        public k h(boolean z6, boolean z7) {
            return this;
        }

        @Override // m4.k
        public int i() {
            return this.f19160d;
        }
    }

    private k() {
    }

    /* synthetic */ k(a aVar) {
        this();
    }

    public static k j() {
        return f19157a;
    }

    public abstract k d(int i7, int i8);

    public abstract k e(long j7, long j8);

    public abstract <T> k f(T t6, T t7, Comparator<T> comparator);

    public abstract k g(boolean z6, boolean z7);

    public abstract k h(boolean z6, boolean z7);

    public abstract int i();
}
