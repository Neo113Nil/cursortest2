package t0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import i1.l;
import java.nio.ByteBuffer;
import java.util.List;
import o2.m0;
import r0.e3;
import r0.f3;
import r0.s1;
import r0.t1;
import r0.u2;
import t0.s;
import t0.t;

/* loaded from: classes.dex */
public class d0 extends i1.o implements o2.t {
    private final Context L0;
    private final s.a M0;
    private final t N0;
    private int O0;
    private boolean P0;
    private s1 Q0;
    private long R0;
    private boolean S0;
    private boolean T0;
    private boolean U0;
    private boolean V0;
    private e3.a W0;

    private final class b implements t.c {
        private b() {
        }

        @Override // t0.t.c
        public void a(long j7) {
            d0.this.M0.B(j7);
        }

        @Override // t0.t.c
        public void b(boolean z6) {
            d0.this.M0.C(z6);
        }

        @Override // t0.t.c
        public void c(Exception exc) {
            o2.r.d("MediaCodecAudioRenderer", "Audio sink error", exc);
            d0.this.M0.l(exc);
        }

        @Override // t0.t.c
        public void d() {
            d0.this.A1();
        }

        @Override // t0.t.c
        public void e() {
            if (d0.this.W0 != null) {
                d0.this.W0.a();
            }
        }

        @Override // t0.t.c
        public void f() {
            if (d0.this.W0 != null) {
                d0.this.W0.b();
            }
        }

        @Override // t0.t.c
        public void g(int i7, long j7, long j8) {
            d0.this.M0.D(i7, j7, j8);
        }
    }

    public d0(Context context, l.b bVar, i1.q qVar, boolean z6, Handler handler, s sVar, t tVar) {
        super(1, bVar, qVar, z6, 44100.0f);
        this.L0 = context.getApplicationContext();
        this.N0 = tVar;
        this.M0 = new s.a(handler, sVar);
        tVar.o(new b());
    }

    private void B1() {
        long r7 = this.N0.r(c());
        if (r7 != Long.MIN_VALUE) {
            if (!this.T0) {
                r7 = Math.max(this.R0, r7);
            }
            this.R0 = r7;
            this.T0 = false;
        }
    }

    private static boolean u1(String str) {
        if (m0.f19752a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(m0.f19754c)) {
            String str2 = m0.f19753b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    private static boolean v1() {
        if (m0.f19752a == 23) {
            String str = m0.f19755d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private int w1(i1.n nVar, s1 s1Var) {
        int i7;
        if (!"OMX.google.raw.decoder".equals(nVar.f16949a) || (i7 = m0.f19752a) >= 24 || (i7 == 23 && m0.w0(this.L0))) {
            return s1Var.f20957r;
        }
        return -1;
    }

    private static List<i1.n> y1(i1.q qVar, s1 s1Var, boolean z6, t tVar) {
        i1.n v6;
        String str = s1Var.f20956q;
        if (str == null) {
            return m4.q.x();
        }
        if (tVar.b(s1Var) && (v6 = i1.v.v()) != null) {
            return m4.q.y(v6);
        }
        List<i1.n> a7 = qVar.a(str, z6, false);
        String m7 = i1.v.m(s1Var);
        return m7 == null ? m4.q.t(a7) : m4.q.r().g(a7).g(qVar.a(m7, z6, false)).h();
    }

    protected void A1() {
        this.T0 = true;
    }

    @Override // i1.o, r0.f
    protected void K() {
        this.U0 = true;
        try {
            this.N0.flush();
            try {
                super.K();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.K();
                throw th;
            } finally {
            }
        }
    }

    @Override // i1.o, r0.f
    protected void L(boolean z6, boolean z7) {
        super.L(z6, z7);
        this.M0.p(this.G0);
        if (E().f20677a) {
            this.N0.j();
        } else {
            this.N0.s();
        }
        this.N0.h(H());
    }

    @Override // i1.o, r0.f
    protected void M(long j7, boolean z6) {
        super.M(j7, z6);
        if (this.V0) {
            this.N0.u();
        } else {
            this.N0.flush();
        }
        this.R0 = j7;
        this.S0 = true;
        this.T0 = true;
    }

    @Override // i1.o
    protected void M0(Exception exc) {
        o2.r.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.M0.k(exc);
    }

    @Override // i1.o, r0.f
    protected void N() {
        try {
            super.N();
        } finally {
            if (this.U0) {
                this.U0 = false;
                this.N0.a();
            }
        }
    }

    @Override // i1.o
    protected void N0(String str, l.a aVar, long j7, long j8) {
        this.M0.m(str, j7, j8);
    }

    @Override // i1.o, r0.f
    protected void O() {
        super.O();
        this.N0.w0();
    }

    @Override // i1.o
    protected void O0(String str) {
        this.M0.n(str);
    }

    @Override // i1.o, r0.f
    protected void P() {
        B1();
        this.N0.Z();
        super.P();
    }

    @Override // i1.o
    protected u0.i P0(t1 t1Var) {
        u0.i P0 = super.P0(t1Var);
        this.M0.q(t1Var.f21040b, P0);
        return P0;
    }

    @Override // i1.o
    protected void Q0(s1 s1Var, MediaFormat mediaFormat) {
        int i7;
        s1 s1Var2 = this.Q0;
        int[] iArr = null;
        if (s1Var2 != null) {
            s1Var = s1Var2;
        } else if (s0() != null) {
            s1 E = new s1.b().e0("audio/raw").Y("audio/raw".equals(s1Var.f20956q) ? s1Var.F : (m0.f19752a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? m0.b0(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding")).N(s1Var.G).O(s1Var.H).H(mediaFormat.getInteger("channel-count")).f0(mediaFormat.getInteger("sample-rate")).E();
            if (this.P0 && E.D == 6 && (i7 = s1Var.D) < 6) {
                iArr = new int[i7];
                for (int i8 = 0; i8 < s1Var.D; i8++) {
                    iArr[i8] = i8;
                }
            }
            s1Var = E;
        }
        try {
            this.N0.p(s1Var, 0, iArr);
        } catch (t.a e7) {
            throw C(e7, e7.f21829f, 5001);
        }
    }

    @Override // i1.o
    protected void S0() {
        super.S0();
        this.N0.v();
    }

    @Override // i1.o
    protected void T0(u0.g gVar) {
        if (!this.S0 || gVar.l()) {
            return;
        }
        if (Math.abs(gVar.f22413j - this.R0) > 500000) {
            this.R0 = gVar.f22413j;
        }
        this.S0 = false;
    }

    @Override // i1.o
    protected boolean V0(long j7, long j8, i1.l lVar, ByteBuffer byteBuffer, int i7, int i8, int i9, long j9, boolean z6, boolean z7, s1 s1Var) {
        o2.a.e(byteBuffer);
        if (this.Q0 != null && (i8 & 2) != 0) {
            ((i1.l) o2.a.e(lVar)).d(i7, false);
            return true;
        }
        if (z6) {
            if (lVar != null) {
                lVar.d(i7, false);
            }
            this.G0.f22403f += i9;
            this.N0.v();
            return true;
        }
        try {
            if (!this.N0.q(byteBuffer, j9, i9)) {
                return false;
            }
            if (lVar != null) {
                lVar.d(i7, false);
            }
            this.G0.f22402e += i9;
            return true;
        } catch (t.b e7) {
            throw D(e7, e7.f21832h, e7.f21831g, 5001);
        } catch (t.e e8) {
            throw D(e8, s1Var, e8.f21836g, 5002);
        }
    }

    @Override // i1.o
    protected u0.i W(i1.n nVar, s1 s1Var, s1 s1Var2) {
        u0.i e7 = nVar.e(s1Var, s1Var2);
        int i7 = e7.f22425e;
        if (w1(nVar, s1Var2) > this.O0) {
            i7 |= 64;
        }
        int i8 = i7;
        return new u0.i(nVar.f16949a, s1Var, s1Var2, i8 != 0 ? 0 : e7.f22424d, i8);
    }

    @Override // i1.o
    protected void a1() {
        try {
            this.N0.k();
        } catch (t.e e7) {
            throw D(e7, e7.f21837h, e7.f21836g, 5002);
        }
    }

    @Override // i1.o, r0.e3
    public boolean c() {
        return super.c() && this.N0.c();
    }

    @Override // o2.t
    public u2 d() {
        return this.N0.d();
    }

    @Override // o2.t
    public void e(u2 u2Var) {
        this.N0.e(u2Var);
    }

    @Override // r0.e3, r0.g3
    public String h() {
        return "MediaCodecAudioRenderer";
    }

    @Override // i1.o, r0.e3
    public boolean i() {
        return this.N0.l() || super.i();
    }

    @Override // i1.o
    protected boolean m1(s1 s1Var) {
        return this.N0.b(s1Var);
    }

    @Override // i1.o
    protected int n1(i1.q qVar, s1 s1Var) {
        boolean z6;
        if (!o2.v.o(s1Var.f20956q)) {
            return f3.a(0);
        }
        int i7 = m0.f19752a >= 21 ? 32 : 0;
        boolean z7 = true;
        boolean z8 = s1Var.J != 0;
        boolean o12 = i1.o.o1(s1Var);
        int i8 = 8;
        if (o12 && this.N0.b(s1Var) && (!z8 || i1.v.v() != null)) {
            return f3.b(4, 8, i7);
        }
        if ((!"audio/raw".equals(s1Var.f20956q) || this.N0.b(s1Var)) && this.N0.b(m0.c0(2, s1Var.D, s1Var.E))) {
            List<i1.n> y12 = y1(qVar, s1Var, false, this.N0);
            if (y12.isEmpty()) {
                return f3.a(1);
            }
            if (!o12) {
                return f3.a(2);
            }
            i1.n nVar = y12.get(0);
            boolean m7 = nVar.m(s1Var);
            if (!m7) {
                for (int i9 = 1; i9 < y12.size(); i9++) {
                    i1.n nVar2 = y12.get(i9);
                    if (nVar2.m(s1Var)) {
                        nVar = nVar2;
                        z6 = false;
                        break;
                    }
                }
            }
            z7 = m7;
            z6 = true;
            int i10 = z7 ? 4 : 3;
            if (z7 && nVar.p(s1Var)) {
                i8 = 16;
            }
            return f3.c(i10, i8, i7, nVar.f16956h ? 64 : 0, z6 ? 128 : 0);
        }
        return f3.a(1);
    }

    @Override // r0.f, r0.z2.b
    public void p(int i7, Object obj) {
        if (i7 == 2) {
            this.N0.g(((Float) obj).floatValue());
        }
        if (i7 == 3) {
            this.N0.m((e) obj);
            return;
        }
        if (i7 == 6) {
            this.N0.t((w) obj);
            return;
        }
        switch (i7) {
            case 9:
                this.N0.f(((Boolean) obj).booleanValue());
                break;
            case 10:
                this.N0.n(((Integer) obj).intValue());
                break;
            case 11:
                this.W0 = (e3.a) obj;
                break;
            default:
                super.p(i7, obj);
                break;
        }
    }

    @Override // i1.o
    protected float v0(float f7, s1 s1Var, s1[] s1VarArr) {
        int i7 = -1;
        for (s1 s1Var2 : s1VarArr) {
            int i8 = s1Var2.E;
            if (i8 != -1) {
                i7 = Math.max(i7, i8);
            }
        }
        if (i7 == -1) {
            return -1.0f;
        }
        return f7 * i7;
    }

    @Override // r0.f, r0.e3
    public o2.t w() {
        return this;
    }

    @Override // i1.o
    protected List<i1.n> x0(i1.q qVar, s1 s1Var, boolean z6) {
        return i1.v.u(y1(qVar, s1Var, z6, this.N0), s1Var);
    }

    protected int x1(i1.n nVar, s1 s1Var, s1[] s1VarArr) {
        int w12 = w1(nVar, s1Var);
        if (s1VarArr.length == 1) {
            return w12;
        }
        for (s1 s1Var2 : s1VarArr) {
            if (nVar.e(s1Var, s1Var2).f22424d != 0) {
                w12 = Math.max(w12, w1(nVar, s1Var2));
            }
        }
        return w12;
    }

    @Override // o2.t
    public long z() {
        if (getState() == 2) {
            B1();
        }
        return this.R0;
    }

    @Override // i1.o
    protected l.a z0(i1.n nVar, s1 s1Var, MediaCrypto mediaCrypto, float f7) {
        this.O0 = x1(nVar, s1Var, I());
        this.P0 = u1(nVar.f16949a);
        MediaFormat z12 = z1(s1Var, nVar.f16951c, this.O0, f7);
        this.Q0 = "audio/raw".equals(nVar.f16950b) && !"audio/raw".equals(s1Var.f20956q) ? s1Var : null;
        return l.a.a(nVar, z12, s1Var, mediaCrypto);
    }

    @SuppressLint({"InlinedApi"})
    protected MediaFormat z1(s1 s1Var, String str, int i7, float f7) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", s1Var.D);
        mediaFormat.setInteger("sample-rate", s1Var.E);
        o2.u.e(mediaFormat, s1Var.f20958s);
        o2.u.d(mediaFormat, "max-input-size", i7);
        int i8 = m0.f19752a;
        if (i8 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f7 != -1.0f && !v1()) {
                mediaFormat.setFloat("operating-rate", f7);
            }
        }
        if (i8 <= 28 && "audio/ac4".equals(s1Var.f20956q)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i8 >= 24 && this.N0.i(m0.c0(4, s1Var.D, s1Var.E)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i8 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        return mediaFormat;
    }
}
