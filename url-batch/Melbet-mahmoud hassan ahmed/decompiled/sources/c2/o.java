package c2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Collections;
import java.util.List;
import o2.m0;
import o2.r;
import o2.v;
import r0.f3;
import r0.s1;
import r0.t1;

/* loaded from: classes.dex */
public final class o extends r0.f implements Handler.Callback {
    private s1 A;
    private i B;
    private l C;
    private m D;
    private m E;
    private int F;
    private long G;

    /* renamed from: s, reason: collision with root package name */
    private final Handler f1876s;

    /* renamed from: t, reason: collision with root package name */
    private final n f1877t;

    /* renamed from: u, reason: collision with root package name */
    private final k f1878u;

    /* renamed from: v, reason: collision with root package name */
    private final t1 f1879v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f1880w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f1881x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f1882y;

    /* renamed from: z, reason: collision with root package name */
    private int f1883z;

    public o(n nVar, Looper looper) {
        this(nVar, looper, k.f1872a);
    }

    public o(n nVar, Looper looper, k kVar) {
        super(3);
        this.f1877t = (n) o2.a.e(nVar);
        this.f1876s = looper == null ? null : m0.v(looper, this);
        this.f1878u = kVar;
        this.f1879v = new t1();
        this.G = -9223372036854775807L;
    }

    private void U() {
        d0(Collections.emptyList());
    }

    private long V() {
        if (this.F == -1) {
            return Long.MAX_VALUE;
        }
        o2.a.e(this.D);
        if (this.F >= this.D.f()) {
            return Long.MAX_VALUE;
        }
        return this.D.d(this.F);
    }

    private void W(j jVar) {
        r.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.A, jVar);
        U();
        b0();
    }

    private void X() {
        this.f1882y = true;
        this.B = this.f1878u.c((s1) o2.a.e(this.A));
    }

    private void Y(List<b> list) {
        this.f1877t.i(list);
        this.f1877t.s(new e(list));
    }

    private void Z() {
        this.C = null;
        this.F = -1;
        m mVar = this.D;
        if (mVar != null) {
            mVar.q();
            this.D = null;
        }
        m mVar2 = this.E;
        if (mVar2 != null) {
            mVar2.q();
            this.E = null;
        }
    }

    private void a0() {
        Z();
        ((i) o2.a.e(this.B)).a();
        this.B = null;
        this.f1883z = 0;
    }

    private void b0() {
        a0();
        X();
    }

    private void d0(List<b> list) {
        Handler handler = this.f1876s;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            Y(list);
        }
    }

    @Override // r0.f
    protected void K() {
        this.A = null;
        this.G = -9223372036854775807L;
        U();
        a0();
    }

    @Override // r0.f
    protected void M(long j7, boolean z6) {
        U();
        this.f1880w = false;
        this.f1881x = false;
        this.G = -9223372036854775807L;
        if (this.f1883z != 0) {
            b0();
        } else {
            Z();
            ((i) o2.a.e(this.B)).flush();
        }
    }

    @Override // r0.f
    protected void Q(s1[] s1VarArr, long j7, long j8) {
        this.A = s1VarArr[0];
        if (this.B != null) {
            this.f1883z = 1;
        } else {
            X();
        }
    }

    @Override // r0.g3
    public int b(s1 s1Var) {
        if (this.f1878u.b(s1Var)) {
            return f3.a(s1Var.J == 0 ? 4 : 2);
        }
        return f3.a(v.r(s1Var.f20956q) ? 1 : 0);
    }

    @Override // r0.e3
    public boolean c() {
        return this.f1881x;
    }

    public void c0(long j7) {
        o2.a.f(v());
        this.G = j7;
    }

    @Override // r0.e3, r0.g3
    public String h() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        Y((List) message.obj);
        return true;
    }

    @Override // r0.e3
    public boolean i() {
        return true;
    }

    @Override // r0.e3
    public void o(long j7, long j8) {
        boolean z6;
        if (v()) {
            long j9 = this.G;
            if (j9 != -9223372036854775807L && j7 >= j9) {
                Z();
                this.f1881x = true;
            }
        }
        if (this.f1881x) {
            return;
        }
        if (this.E == null) {
            ((i) o2.a.e(this.B)).b(j7);
            try {
                this.E = ((i) o2.a.e(this.B)).d();
            } catch (j e7) {
                W(e7);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.D != null) {
            long V = V();
            z6 = false;
            while (V <= j7) {
                this.F++;
                V = V();
                z6 = true;
            }
        } else {
            z6 = false;
        }
        m mVar = this.E;
        if (mVar != null) {
            if (mVar.m()) {
                if (!z6 && V() == Long.MAX_VALUE) {
                    if (this.f1883z == 2) {
                        b0();
                    } else {
                        Z();
                        this.f1881x = true;
                    }
                }
            } else if (mVar.f22419g <= j7) {
                m mVar2 = this.D;
                if (mVar2 != null) {
                    mVar2.q();
                }
                this.F = mVar.b(j7);
                this.D = mVar;
                this.E = null;
                z6 = true;
            }
        }
        if (z6) {
            o2.a.e(this.D);
            d0(this.D.e(j7));
        }
        if (this.f1883z == 2) {
            return;
        }
        while (!this.f1880w) {
            try {
                l lVar = this.C;
                if (lVar == null) {
                    lVar = ((i) o2.a.e(this.B)).e();
                    if (lVar == null) {
                        return;
                    } else {
                        this.C = lVar;
                    }
                }
                if (this.f1883z == 1) {
                    lVar.p(4);
                    ((i) o2.a.e(this.B)).c(lVar);
                    this.C = null;
                    this.f1883z = 2;
                    return;
                }
                int R = R(this.f1879v, lVar, 0);
                if (R == -4) {
                    if (lVar.m()) {
                        this.f1880w = true;
                        this.f1882y = false;
                    } else {
                        s1 s1Var = this.f1879v.f21040b;
                        if (s1Var == null) {
                            return;
                        }
                        lVar.f1873n = s1Var.f20960u;
                        lVar.s();
                        this.f1882y &= !lVar.o();
                    }
                    if (!this.f1882y) {
                        ((i) o2.a.e(this.B)).c(lVar);
                        this.C = null;
                    }
                } else if (R == -3) {
                    return;
                }
            } catch (j e8) {
                W(e8);
                return;
            }
        }
    }
}
