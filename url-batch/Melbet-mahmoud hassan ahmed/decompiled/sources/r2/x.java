package r2;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.s00;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f21186a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f21187b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f21188c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f21189a = true;

        /* renamed from: b, reason: collision with root package name */
        private boolean f21190b = false;

        /* renamed from: c, reason: collision with root package name */
        private boolean f21191c = false;

        @RecentlyNonNull
        public x a() {
            return new x(this, null);
        }

        @RecentlyNonNull
        public a b(boolean z6) {
            this.f21191c = z6;
            return this;
        }

        @RecentlyNonNull
        public a c(boolean z6) {
            this.f21190b = z6;
            return this;
        }

        @RecentlyNonNull
        public a d(boolean z6) {
            this.f21189a = z6;
            return this;
        }
    }

    public x(s00 s00Var) {
        this.f21186a = s00Var.f11592f;
        this.f21187b = s00Var.f11593g;
        this.f21188c = s00Var.f11594h;
    }

    /* synthetic */ x(a aVar, b0 b0Var) {
        this.f21186a = aVar.f21189a;
        this.f21187b = aVar.f21190b;
        this.f21188c = aVar.f21191c;
    }

    public boolean a() {
        return this.f21188c;
    }

    public boolean b() {
        return this.f21187b;
    }

    public boolean c() {
        return this.f21186a;
    }
}
