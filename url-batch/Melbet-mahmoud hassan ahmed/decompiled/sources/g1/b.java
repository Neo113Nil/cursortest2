package g1;

import android.net.Uri;
import g1.i0;
import java.util.Map;
import w0.b0;

/* loaded from: classes.dex */
public final class b implements w0.l {

    /* renamed from: d, reason: collision with root package name */
    public static final w0.r f16247d = new w0.r() { // from class: g1.a
        @Override // w0.r
        public final w0.l[] a() {
            w0.l[] f7;
            f7 = b.f();
            return f7;
        }

        @Override // w0.r
        public /* synthetic */ w0.l[] b(Uri uri, Map map) {
            return w0.q.a(this, uri, map);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final c f16248a = new c();

    /* renamed from: b, reason: collision with root package name */
    private final o2.a0 f16249b = new o2.a0(2786);

    /* renamed from: c, reason: collision with root package name */
    private boolean f16250c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ w0.l[] f() {
        return new w0.l[]{new b()};
    }

    @Override // w0.l
    public void a() {
    }

    @Override // w0.l
    public void b(long j7, long j8) {
        this.f16250c = false;
        this.f16248a.a();
    }

    @Override // w0.l
    public void d(w0.n nVar) {
        this.f16248a.d(nVar, new i0.d(0, 1));
        nVar.j();
        nVar.i(new b0.b(-9223372036854775807L));
    }

    @Override // w0.l
    public int e(w0.m mVar, w0.a0 a0Var) {
        int read = mVar.read(this.f16249b.d(), 0, 2786);
        if (read == -1) {
            return -1;
        }
        this.f16249b.O(0);
        this.f16249b.N(read);
        if (!this.f16250c) {
            this.f16248a.f(0L, 4);
            this.f16250c = true;
        }
        this.f16248a.c(this.f16249b);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
    
        r8.h();
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        if ((r4 - r3) < 8192) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
    
        return false;
     */
    @Override // w0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean h(w0.m mVar) {
        o2.a0 a0Var = new o2.a0(10);
        int i7 = 0;
        while (true) {
            mVar.n(a0Var.d(), 0, 10);
            a0Var.O(0);
            if (a0Var.F() != 4801587) {
                break;
            }
            a0Var.P(3);
            int B = a0Var.B();
            i7 += B + 10;
            mVar.o(B);
        }
        mVar.h();
        mVar.o(i7);
        int i8 = i7;
        while (true) {
            int i9 = 0;
            while (true) {
                mVar.n(a0Var.d(), 0, 6);
                a0Var.O(0);
                if (a0Var.I() != 2935) {
                    break;
                }
                i9++;
                if (i9 >= 4) {
                    return true;
                }
                int f7 = t0.b.f(a0Var.d());
                if (f7 == -1) {
                    return false;
                }
                mVar.o(f7 - 6);
            }
            mVar.o(i8);
        }
    }
}
