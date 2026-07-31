package j1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import j1.a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import o2.m0;
import r0.f3;
import r0.s1;
import r0.t1;

/* loaded from: classes.dex */
public final class g extends r0.f implements Handler.Callback {
    private long A;
    private a B;

    /* renamed from: s, reason: collision with root package name */
    private final d f18076s;

    /* renamed from: t, reason: collision with root package name */
    private final f f18077t;

    /* renamed from: u, reason: collision with root package name */
    private final Handler f18078u;

    /* renamed from: v, reason: collision with root package name */
    private final e f18079v;

    /* renamed from: w, reason: collision with root package name */
    private c f18080w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f18081x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f18082y;

    /* renamed from: z, reason: collision with root package name */
    private long f18083z;

    public g(f fVar, Looper looper) {
        this(fVar, looper, d.f18074a);
    }

    public g(f fVar, Looper looper, d dVar) {
        super(5);
        this.f18077t = (f) o2.a.e(fVar);
        this.f18078u = looper == null ? null : m0.v(looper, this);
        this.f18076s = (d) o2.a.e(dVar);
        this.f18079v = new e();
        this.A = -9223372036854775807L;
    }

    private void U(a aVar, List<a.b> list) {
        for (int i7 = 0; i7 < aVar.h(); i7++) {
            s1 d7 = aVar.g(i7).d();
            if (d7 == null || !this.f18076s.b(d7)) {
                list.add(aVar.g(i7));
            } else {
                c c7 = this.f18076s.c(d7);
                byte[] bArr = (byte[]) o2.a.e(aVar.g(i7).f());
                this.f18079v.h();
                this.f18079v.r(bArr.length);
                ((ByteBuffer) m0.j(this.f18079v.f22411h)).put(bArr);
                this.f18079v.s();
                a a7 = c7.a(this.f18079v);
                if (a7 != null) {
                    U(a7, list);
                }
            }
        }
    }

    private void V(a aVar) {
        Handler handler = this.f18078u;
        if (handler != null) {
            handler.obtainMessage(0, aVar).sendToTarget();
        } else {
            W(aVar);
        }
    }

    private void W(a aVar) {
        this.f18077t.u(aVar);
    }

    private boolean X(long j7) {
        boolean z6;
        a aVar = this.B;
        if (aVar == null || this.A > j7) {
            z6 = false;
        } else {
            V(aVar);
            this.B = null;
            this.A = -9223372036854775807L;
            z6 = true;
        }
        if (this.f18081x && this.B == null) {
            this.f18082y = true;
        }
        return z6;
    }

    private void Y() {
        if (this.f18081x || this.B != null) {
            return;
        }
        this.f18079v.h();
        t1 F = F();
        int R = R(F, this.f18079v, 0);
        if (R != -4) {
            if (R == -5) {
                this.f18083z = ((s1) o2.a.e(F.f21040b)).f20960u;
                return;
            }
            return;
        }
        if (this.f18079v.m()) {
            this.f18081x = true;
            return;
        }
        e eVar = this.f18079v;
        eVar.f18075n = this.f18083z;
        eVar.s();
        a a7 = ((c) m0.j(this.f18080w)).a(this.f18079v);
        if (a7 != null) {
            ArrayList arrayList = new ArrayList(a7.h());
            U(a7, arrayList);
            if (arrayList.isEmpty()) {
                return;
            }
            this.B = new a(arrayList);
            this.A = this.f18079v.f22413j;
        }
    }

    @Override // r0.f
    protected void K() {
        this.B = null;
        this.A = -9223372036854775807L;
        this.f18080w = null;
    }

    @Override // r0.f
    protected void M(long j7, boolean z6) {
        this.B = null;
        this.A = -9223372036854775807L;
        this.f18081x = false;
        this.f18082y = false;
    }

    @Override // r0.f
    protected void Q(s1[] s1VarArr, long j7, long j8) {
        this.f18080w = this.f18076s.c(s1VarArr[0]);
    }

    @Override // r0.g3
    public int b(s1 s1Var) {
        if (this.f18076s.b(s1Var)) {
            return f3.a(s1Var.J == 0 ? 4 : 2);
        }
        return f3.a(0);
    }

    @Override // r0.e3
    public boolean c() {
        return this.f18082y;
    }

    @Override // r0.e3, r0.g3
    public String h() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        W((a) message.obj);
        return true;
    }

    @Override // r0.e3
    public boolean i() {
        return true;
    }

    @Override // r0.e3
    public void o(long j7, long j8) {
        boolean z6 = true;
        while (z6) {
            Y();
            z6 = X(j7);
        }
    }
}
