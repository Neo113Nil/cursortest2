package q3;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import p3.a;
import p3.a.b;

/* loaded from: classes.dex */
public abstract class n<A extends a.b, ResultT> {

    /* renamed from: a, reason: collision with root package name */
    private final o3.d[] f20294a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f20295b;

    /* renamed from: c, reason: collision with root package name */
    private final int f20296c;

    public static class a<A extends a.b, ResultT> {

        /* renamed from: a, reason: collision with root package name */
        private l<A, j4.i<ResultT>> f20297a;

        /* renamed from: c, reason: collision with root package name */
        private o3.d[] f20299c;

        /* renamed from: b, reason: collision with root package name */
        private boolean f20298b = true;

        /* renamed from: d, reason: collision with root package name */
        private int f20300d = 0;

        /* synthetic */ a(p0 p0Var) {
        }

        @RecentlyNonNull
        public n<A, ResultT> a() {
            r3.o.b(this.f20297a != null, "execute parameter required");
            return new q0(this, this.f20299c, this.f20298b, this.f20300d);
        }

        @RecentlyNonNull
        public a<A, ResultT> b(@RecentlyNonNull l<A, j4.i<ResultT>> lVar) {
            this.f20297a = lVar;
            return this;
        }

        @RecentlyNonNull
        public a<A, ResultT> c(boolean z6) {
            this.f20298b = z6;
            return this;
        }

        @RecentlyNonNull
        public a<A, ResultT> d(@RecentlyNonNull o3.d... dVarArr) {
            this.f20299c = dVarArr;
            return this;
        }

        @RecentlyNonNull
        public a<A, ResultT> e(int i7) {
            this.f20300d = i7;
            return this;
        }
    }

    protected n(o3.d[] dVarArr, boolean z6, int i7) {
        this.f20294a = dVarArr;
        boolean z7 = false;
        if (dVarArr != null && z6) {
            z7 = true;
        }
        this.f20295b = z7;
        this.f20296c = i7;
    }

    @RecentlyNonNull
    public static <A extends a.b, ResultT> a<A, ResultT> a() {
        return new a<>(null);
    }

    protected abstract void b(@RecentlyNonNull A a7, @RecentlyNonNull j4.i<ResultT> iVar);

    public boolean c() {
        return this.f20295b;
    }

    @RecentlyNullable
    public final o3.d[] d() {
        return this.f20294a;
    }

    public final int e() {
        return this.f20296c;
    }
}
