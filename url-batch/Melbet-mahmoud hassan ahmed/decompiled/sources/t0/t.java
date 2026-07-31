package t0;

import java.nio.ByteBuffer;
import r0.s1;
import r0.u2;
import s0.u1;

/* loaded from: classes.dex */
public interface t {

    public static final class a extends Exception {

        /* renamed from: f, reason: collision with root package name */
        public final s1 f21829f;

        public a(String str, s1 s1Var) {
            super(str);
            this.f21829f = s1Var;
        }

        public a(Throwable th, s1 s1Var) {
            super(th);
            this.f21829f = s1Var;
        }
    }

    public static final class b extends Exception {

        /* renamed from: f, reason: collision with root package name */
        public final int f21830f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f21831g;

        /* renamed from: h, reason: collision with root package name */
        public final s1 f21832h;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(int i7, int i8, int i9, int i10, s1 s1Var, boolean z6, Exception exc) {
            super(r0.toString(), exc);
            StringBuilder sb = new StringBuilder();
            sb.append("AudioTrack init failed ");
            sb.append(i7);
            sb.append(" ");
            sb.append("Config(");
            sb.append(i8);
            sb.append(", ");
            sb.append(i9);
            sb.append(", ");
            sb.append(i10);
            sb.append(")");
            sb.append(z6 ? " (recoverable)" : "");
            this.f21830f = i7;
            this.f21831g = z6;
            this.f21832h = s1Var;
        }
    }

    public interface c {
        void a(long j7);

        void b(boolean z6);

        void c(Exception exc);

        void d();

        void e();

        void f();

        void g(int i7, long j7, long j8);
    }

    public static final class d extends Exception {

        /* renamed from: f, reason: collision with root package name */
        public final long f21833f;

        /* renamed from: g, reason: collision with root package name */
        public final long f21834g;

        public d(long j7, long j8) {
            super("Unexpected audio track timestamp discontinuity: expected " + j8 + ", got " + j7);
            this.f21833f = j7;
            this.f21834g = j8;
        }
    }

    public static final class e extends Exception {

        /* renamed from: f, reason: collision with root package name */
        public final int f21835f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f21836g;

        /* renamed from: h, reason: collision with root package name */
        public final s1 f21837h;

        public e(int i7, s1 s1Var, boolean z6) {
            super("AudioTrack write failed: " + i7);
            this.f21836g = z6;
            this.f21835f = i7;
            this.f21837h = s1Var;
        }
    }

    void Z();

    void a();

    boolean b(s1 s1Var);

    boolean c();

    u2 d();

    void e(u2 u2Var);

    void f(boolean z6);

    void flush();

    void g(float f7);

    void h(u1 u1Var);

    int i(s1 s1Var);

    void j();

    void k();

    boolean l();

    void m(t0.e eVar);

    void n(int i7);

    void o(c cVar);

    void p(s1 s1Var, int i7, int[] iArr);

    boolean q(ByteBuffer byteBuffer, long j7, int i7);

    long r(boolean z6);

    void s();

    void t(w wVar);

    void u();

    void v();

    void w0();
}
