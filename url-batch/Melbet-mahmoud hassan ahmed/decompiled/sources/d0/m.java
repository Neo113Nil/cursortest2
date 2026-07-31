package d0;

import android.annotation.SuppressLint;

/* loaded from: classes.dex */
public interface m {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"SyntheticAccessor"})
    public static final b.c f15489a;

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"SyntheticAccessor"})
    public static final b.C0051b f15490b;

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final Throwable f15491a;

            public a(Throwable th) {
                this.f15491a = th;
            }

            public Throwable a() {
                return this.f15491a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.f15491a.getMessage());
            }
        }

        /* renamed from: d0.m$b$b, reason: collision with other inner class name */
        public static final class C0051b extends b {
            private C0051b() {
            }

            public String toString() {
                return "IN_PROGRESS";
            }
        }

        public static final class c extends b {
            private c() {
            }

            public String toString() {
                return "SUCCESS";
            }
        }

        b() {
        }
    }

    static {
        f15489a = new b.c();
        f15490b = new b.C0051b();
    }
}
