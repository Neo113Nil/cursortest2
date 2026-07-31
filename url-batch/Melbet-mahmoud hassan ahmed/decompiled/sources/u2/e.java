package u2;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import r2.x;

@Deprecated
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f22463a;

    /* renamed from: b, reason: collision with root package name */
    private final int f22464b;

    /* renamed from: c, reason: collision with root package name */
    private final int f22465c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f22466d;

    /* renamed from: e, reason: collision with root package name */
    private final int f22467e;

    /* renamed from: f, reason: collision with root package name */
    private final x f22468f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f22469g;

    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        private x f22474e;

        /* renamed from: a, reason: collision with root package name */
        private boolean f22470a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f22471b = -1;

        /* renamed from: c, reason: collision with root package name */
        private int f22472c = 0;

        /* renamed from: d, reason: collision with root package name */
        private boolean f22473d = false;

        /* renamed from: f, reason: collision with root package name */
        private int f22475f = 1;

        /* renamed from: g, reason: collision with root package name */
        private boolean f22476g = false;

        @RecentlyNonNull
        public e a() {
            return new e(this, null);
        }

        @RecentlyNonNull
        public a b(int i7) {
            this.f22475f = i7;
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public a c(int i7) {
            this.f22471b = i7;
            return this;
        }

        @RecentlyNonNull
        public a d(int i7) {
            this.f22472c = i7;
            return this;
        }

        @RecentlyNonNull
        public a e(boolean z6) {
            this.f22476g = z6;
            return this;
        }

        @RecentlyNonNull
        public a f(boolean z6) {
            this.f22473d = z6;
            return this;
        }

        @RecentlyNonNull
        public a g(boolean z6) {
            this.f22470a = z6;
            return this;
        }

        @RecentlyNonNull
        public a h(@RecentlyNonNull x xVar) {
            this.f22474e = xVar;
            return this;
        }
    }

    /* synthetic */ e(a aVar, k kVar) {
        this.f22463a = aVar.f22470a;
        this.f22464b = aVar.f22471b;
        this.f22465c = aVar.f22472c;
        this.f22466d = aVar.f22473d;
        this.f22467e = aVar.f22475f;
        this.f22468f = aVar.f22474e;
        this.f22469g = aVar.f22476g;
    }

    public int a() {
        return this.f22467e;
    }

    @Deprecated
    public int b() {
        return this.f22464b;
    }

    public int c() {
        return this.f22465c;
    }

    @RecentlyNullable
    public x d() {
        return this.f22468f;
    }

    public boolean e() {
        return this.f22466d;
    }

    public boolean f() {
        return this.f22463a;
    }

    public final boolean g() {
        return this.f22469g;
    }
}
