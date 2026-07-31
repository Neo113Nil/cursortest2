package g1;

import android.net.Uri;
import g1.i0;
import java.util.Map;
import w0.b0;

/* loaded from: classes.dex */
public final class e implements w0.l {

    /* renamed from: d, reason: collision with root package name */
    public static final w0.r f16272d = new w0.r() { // from class: g1.d
        @Override // w0.r
        public final w0.l[] a() {
            w0.l[] f7;
            f7 = e.f();
            return f7;
        }

        @Override // w0.r
        public /* synthetic */ w0.l[] b(Uri uri, Map map) {
            return w0.q.a(this, uri, map);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final f f16273a = new f();

    /* renamed from: b, reason: collision with root package name */
    private final o2.a0 f16274b = new o2.a0(16384);

    /* renamed from: c, reason: collision with root package name */
    private boolean f16275c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ w0.l[] f() {
        return new w0.l[]{new e()};
    }

    @Override // w0.l
    public void a() {
    }

    @Override // w0.l
    public void b(long j7, long j8) {
        this.f16275c = false;
        this.f16273a.a();
    }

    @Override // w0.l
    public void d(w0.n nVar) {
        this.f16273a.d(nVar, new i0.d(0, 1));
        nVar.j();
        nVar.i(new b0.b(-9223372036854775807L));
    }

    @Override // w0.l
    public int e(w0.m mVar, w0.a0 a0Var) {
        int read = mVar.read(this.f16274b.d(), 0, 16384);
        if (read == -1) {
            return -1;
        }
        this.f16274b.O(0);
        this.f16274b.N(read);
        if (!this.f16275c) {
            this.f16273a.f(0L, 4);
            this.f16275c = true;
        }
        this.f16273a.c(this.f16274b);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        r9.h();
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if ((r4 - r3) < 8192) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
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
                mVar.n(a0Var.d(), 0, 7);
                a0Var.O(0);
                int I = a0Var.I();
                if (I != 44096 && I != 44097) {
                    break;
                }
                i9++;
                if (i9 >= 4) {
                    return true;
                }
                int e7 = t0.c.e(a0Var.d(), I);
                if (e7 == -1) {
                    return false;
                }
                mVar.o(e7 - 7);
            }
            mVar.o(i8);
        }
    }
}
