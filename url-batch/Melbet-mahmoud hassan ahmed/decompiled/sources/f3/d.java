package f3;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import r2.x;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f16185a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16186b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f16187c;

    /* renamed from: d, reason: collision with root package name */
    private final int f16188d;

    /* renamed from: e, reason: collision with root package name */
    private final x f16189e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f16190f;

    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        private x f16194d;

        /* renamed from: a, reason: collision with root package name */
        private boolean f16191a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f16192b = 0;

        /* renamed from: c, reason: collision with root package name */
        private boolean f16193c = false;

        /* renamed from: e, reason: collision with root package name */
        private int f16195e = 1;

        /* renamed from: f, reason: collision with root package name */
        private boolean f16196f = false;

        @RecentlyNonNull
        public d a() {
            return new d(this, null);
        }

        @RecentlyNonNull
        public a b(int i7) {
            this.f16195e = i7;
            return this;
        }

        @RecentlyNonNull
        public a c(int i7) {
            this.f16192b = i7;
            return this;
        }

        @RecentlyNonNull
        public a d(boolean z6) {
            this.f16196f = z6;
            return this;
        }

        @RecentlyNonNull
        public a e(boolean z6) {
            this.f16193c = z6;
            return this;
        }

        @RecentlyNonNull
        public a f(boolean z6) {
            this.f16191a = z6;
            return this;
        }

        @RecentlyNonNull
        public a g(@RecentlyNonNull x xVar) {
            this.f16194d = xVar;
            return this;
        }
    }

    /* synthetic */ d(a aVar, f fVar) {
        this.f16185a = aVar.f16191a;
        this.f16186b = aVar.f16192b;
        this.f16187c = aVar.f16193c;
        this.f16188d = aVar.f16195e;
        this.f16189e = aVar.f16194d;
        this.f16190f = aVar.f16196f;
    }

    public int a() {
        return this.f16188d;
    }

    public int b() {
        return this.f16186b;
    }

    @RecentlyNullable
    public x c() {
        return this.f16189e;
    }

    public boolean d() {
        return this.f16187c;
    }

    public boolean e() {
        return this.f16185a;
    }

    public final boolean f() {
        return this.f16190f;
    }
}
