package v0;

import android.os.Looper;
import r0.s1;
import s0.u1;
import v0.o;
import v0.w;

/* loaded from: classes.dex */
public interface y {

    /* renamed from: a, reason: collision with root package name */
    public static final y f22715a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final y f22716b;

    class a implements y {
        a() {
        }

        @Override // v0.y
        public /* synthetic */ void W() {
            x.b(this);
        }

        @Override // v0.y
        public /* synthetic */ void a() {
            x.c(this);
        }

        @Override // v0.y
        public /* synthetic */ b b(w.a aVar, s1 s1Var) {
            return x.a(this, aVar, s1Var);
        }

        @Override // v0.y
        public void c(Looper looper, u1 u1Var) {
        }

        @Override // v0.y
        public o d(w.a aVar, s1 s1Var) {
            if (s1Var.f20959t == null) {
                return null;
            }
            return new e0(new o.a(new p0(1), 6001));
        }

        @Override // v0.y
        public int e(s1 s1Var) {
            return s1Var.f20959t != null ? 1 : 0;
        }
    }

    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f22717a = new b() { // from class: v0.z
            @Override // v0.y.b
            public final void a() {
                a0.b();
            }
        };

        void a();
    }

    static {
        a aVar = new a();
        f22715a = aVar;
        f22716b = aVar;
    }

    void W();

    void a();

    b b(w.a aVar, s1 s1Var);

    void c(Looper looper, u1 u1Var);

    o d(w.a aVar, s1 s1Var);

    int e(s1 s1Var);
}
