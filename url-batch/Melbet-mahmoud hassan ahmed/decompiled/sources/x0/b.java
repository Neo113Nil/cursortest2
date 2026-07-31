package x0;

import android.net.Uri;
import java.io.EOFException;
import java.util.Arrays;
import java.util.Map;
import o2.m0;
import r0.n2;
import r0.s1;
import w0.a0;
import w0.b0;
import w0.e;
import w0.e0;
import w0.l;
import w0.m;
import w0.n;
import w0.q;
import w0.r;

/* loaded from: classes.dex */
public final class b implements l {

    /* renamed from: r, reason: collision with root package name */
    private static final int[] f23062r;

    /* renamed from: u, reason: collision with root package name */
    private static final int f23065u;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f23066a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23067b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f23068c;

    /* renamed from: d, reason: collision with root package name */
    private long f23069d;

    /* renamed from: e, reason: collision with root package name */
    private int f23070e;

    /* renamed from: f, reason: collision with root package name */
    private int f23071f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f23072g;

    /* renamed from: h, reason: collision with root package name */
    private long f23073h;

    /* renamed from: i, reason: collision with root package name */
    private int f23074i;

    /* renamed from: j, reason: collision with root package name */
    private int f23075j;

    /* renamed from: k, reason: collision with root package name */
    private long f23076k;

    /* renamed from: l, reason: collision with root package name */
    private n f23077l;

    /* renamed from: m, reason: collision with root package name */
    private e0 f23078m;

    /* renamed from: n, reason: collision with root package name */
    private b0 f23079n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f23080o;

    /* renamed from: p, reason: collision with root package name */
    public static final r f23060p = new r() { // from class: x0.a
        @Override // w0.r
        public final l[] a() {
            l[] n7;
            n7 = b.n();
            return n7;
        }

        @Override // w0.r
        public /* synthetic */ l[] b(Uri uri, Map map) {
            return q.a(this, uri, map);
        }
    };

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f23061q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: s, reason: collision with root package name */
    private static final byte[] f23063s = m0.m0("#!AMR\n");

    /* renamed from: t, reason: collision with root package name */
    private static final byte[] f23064t = m0.m0("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f23062r = iArr;
        f23065u = iArr[8];
    }

    public b() {
        this(0);
    }

    public b(int i7) {
        this.f23067b = (i7 & 2) != 0 ? i7 | 1 : i7;
        this.f23066a = new byte[1];
        this.f23074i = -1;
    }

    private void f() {
        o2.a.h(this.f23078m);
        m0.j(this.f23077l);
    }

    private static int g(int i7, long j7) {
        return (int) (((i7 * 8) * 1000000) / j7);
    }

    private b0 i(long j7, boolean z6) {
        return new e(j7, this.f23073h, g(this.f23074i, 20000L), this.f23074i, z6);
    }

    private int j(int i7) {
        if (l(i7)) {
            return this.f23068c ? f23062r[i7] : f23061q[i7];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal AMR ");
        sb.append(this.f23068c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i7);
        throw n2.a(sb.toString(), null);
    }

    private boolean k(int i7) {
        return !this.f23068c && (i7 < 12 || i7 > 14);
    }

    private boolean l(int i7) {
        return i7 >= 0 && i7 <= 15 && (m(i7) || k(i7));
    }

    private boolean m(int i7) {
        return this.f23068c && (i7 < 10 || i7 > 13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l[] n() {
        return new l[]{new b()};
    }

    private void o() {
        if (this.f23080o) {
            return;
        }
        this.f23080o = true;
        boolean z6 = this.f23068c;
        this.f23078m.e(new s1.b().e0(z6 ? "audio/amr-wb" : "audio/3gpp").W(f23065u).H(1).f0(z6 ? 16000 : 8000).E());
    }

    private void p(long j7, int i7) {
        b0 bVar;
        int i8;
        if (this.f23072g) {
            return;
        }
        int i9 = this.f23067b;
        if ((i9 & 1) == 0 || j7 == -1 || !((i8 = this.f23074i) == -1 || i8 == this.f23070e)) {
            bVar = new b0.b(-9223372036854775807L);
        } else if (this.f23075j < 20 && i7 != -1) {
            return;
        } else {
            bVar = i(j7, (i9 & 2) != 0);
        }
        this.f23079n = bVar;
        this.f23077l.i(bVar);
        this.f23072g = true;
    }

    private static boolean q(m mVar, byte[] bArr) {
        mVar.h();
        byte[] bArr2 = new byte[bArr.length];
        mVar.n(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private int r(m mVar) {
        mVar.h();
        mVar.n(this.f23066a, 0, 1);
        byte b7 = this.f23066a[0];
        if ((b7 & 131) <= 0) {
            return j((b7 >> 3) & 15);
        }
        throw n2.a("Invalid padding bits for frame header " + ((int) b7), null);
    }

    private boolean s(m mVar) {
        int length;
        byte[] bArr = f23063s;
        if (q(mVar, bArr)) {
            this.f23068c = false;
            length = bArr.length;
        } else {
            byte[] bArr2 = f23064t;
            if (!q(mVar, bArr2)) {
                return false;
            }
            this.f23068c = true;
            length = bArr2.length;
        }
        mVar.i(length);
        return true;
    }

    private int t(m mVar) {
        if (this.f23071f == 0) {
            try {
                int r7 = r(mVar);
                this.f23070e = r7;
                this.f23071f = r7;
                if (this.f23074i == -1) {
                    this.f23073h = mVar.p();
                    this.f23074i = this.f23070e;
                }
                if (this.f23074i == this.f23070e) {
                    this.f23075j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int a7 = this.f23078m.a(mVar, this.f23071f, true);
        if (a7 == -1) {
            return -1;
        }
        int i7 = this.f23071f - a7;
        this.f23071f = i7;
        if (i7 > 0) {
            return 0;
        }
        this.f23078m.b(this.f23076k + this.f23069d, 1, this.f23070e, 0, null);
        this.f23069d += 20000;
        return 0;
    }

    @Override // w0.l
    public void a() {
    }

    @Override // w0.l
    public void b(long j7, long j8) {
        this.f23069d = 0L;
        this.f23070e = 0;
        this.f23071f = 0;
        if (j7 != 0) {
            b0 b0Var = this.f23079n;
            if (b0Var instanceof e) {
                this.f23076k = ((e) b0Var).b(j7);
                return;
            }
        }
        this.f23076k = 0L;
    }

    @Override // w0.l
    public void d(n nVar) {
        this.f23077l = nVar;
        this.f23078m = nVar.d(0, 1);
        nVar.j();
    }

    @Override // w0.l
    public int e(m mVar, a0 a0Var) {
        f();
        if (mVar.p() == 0 && !s(mVar)) {
            throw n2.a("Could not find AMR header.", null);
        }
        o();
        int t6 = t(mVar);
        p(mVar.a(), t6);
        return t6;
    }

    @Override // w0.l
    public boolean h(m mVar) {
        return s(mVar);
    }
}
