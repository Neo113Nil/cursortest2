package t0;

import android.media.AudioAttributes;
import android.os.Bundle;
import o2.m0;
import r0.i;

/* loaded from: classes.dex */
public final class e implements r0.i {

    /* renamed from: l, reason: collision with root package name */
    public static final e f21706l = new C0138e().a();

    /* renamed from: m, reason: collision with root package name */
    public static final i.a<e> f21707m = new i.a() { // from class: t0.d
        @Override // r0.i.a
        public final r0.i a(Bundle bundle) {
            e d7;
            d7 = e.d(bundle);
            return d7;
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public final int f21708f;

    /* renamed from: g, reason: collision with root package name */
    public final int f21709g;

    /* renamed from: h, reason: collision with root package name */
    public final int f21710h;

    /* renamed from: i, reason: collision with root package name */
    public final int f21711i;

    /* renamed from: j, reason: collision with root package name */
    public final int f21712j;

    /* renamed from: k, reason: collision with root package name */
    private d f21713k;

    private static final class b {
        public static void a(AudioAttributes.Builder builder, int i7) {
            builder.setAllowedCapturePolicy(i7);
        }
    }

    private static final class c {
        public static void a(AudioAttributes.Builder builder, int i7) {
            builder.setSpatializationBehavior(i7);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final AudioAttributes f21714a;

        private d(e eVar) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(eVar.f21708f).setFlags(eVar.f21709g).setUsage(eVar.f21710h);
            int i7 = m0.f19752a;
            if (i7 >= 29) {
                b.a(usage, eVar.f21711i);
            }
            if (i7 >= 32) {
                c.a(usage, eVar.f21712j);
            }
            this.f21714a = usage.build();
        }
    }

    /* renamed from: t0.e$e, reason: collision with other inner class name */
    public static final class C0138e {

        /* renamed from: a, reason: collision with root package name */
        private int f21715a = 0;

        /* renamed from: b, reason: collision with root package name */
        private int f21716b = 0;

        /* renamed from: c, reason: collision with root package name */
        private int f21717c = 1;

        /* renamed from: d, reason: collision with root package name */
        private int f21718d = 1;

        /* renamed from: e, reason: collision with root package name */
        private int f21719e = 0;

        public e a() {
            return new e(this.f21715a, this.f21716b, this.f21717c, this.f21718d, this.f21719e);
        }

        public C0138e b(int i7) {
            this.f21718d = i7;
            return this;
        }

        public C0138e c(int i7) {
            this.f21715a = i7;
            return this;
        }

        public C0138e d(int i7) {
            this.f21716b = i7;
            return this;
        }

        public C0138e e(int i7) {
            this.f21719e = i7;
            return this;
        }

        public C0138e f(int i7) {
            this.f21717c = i7;
            return this;
        }
    }

    private e(int i7, int i8, int i9, int i10, int i11) {
        this.f21708f = i7;
        this.f21709g = i8;
        this.f21710h = i9;
        this.f21711i = i10;
        this.f21712j = i11;
    }

    private static String c(int i7) {
        return Integer.toString(i7, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e d(Bundle bundle) {
        C0138e c0138e = new C0138e();
        if (bundle.containsKey(c(0))) {
            c0138e.c(bundle.getInt(c(0)));
        }
        if (bundle.containsKey(c(1))) {
            c0138e.d(bundle.getInt(c(1)));
        }
        if (bundle.containsKey(c(2))) {
            c0138e.f(bundle.getInt(c(2)));
        }
        if (bundle.containsKey(c(3))) {
            c0138e.b(bundle.getInt(c(3)));
        }
        if (bundle.containsKey(c(4))) {
            c0138e.e(bundle.getInt(c(4)));
        }
        return c0138e.a();
    }

    public d b() {
        if (this.f21713k == null) {
            this.f21713k = new d();
        }
        return this.f21713k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f21708f == eVar.f21708f && this.f21709g == eVar.f21709g && this.f21710h == eVar.f21710h && this.f21711i == eVar.f21711i && this.f21712j == eVar.f21712j;
    }

    public int hashCode() {
        return ((((((((527 + this.f21708f) * 31) + this.f21709g) * 31) + this.f21710h) * 31) + this.f21711i) * 31) + this.f21712j;
    }
}
