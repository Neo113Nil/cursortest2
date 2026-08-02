package s0;

import E.AbstractC0005f;
import G3.m;
import T.C0097o;
import T.F;
import V0.l;
import W.AbstractC0108a;
import Z.f;
import a.AbstractC0124a;
import a0.AbstractC0135a;
import a0.SurfaceHolderCallbackC0125A;
import a2.i;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import e0.t;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import q0.C1353B;
import q0.b0;
import v2.I;
import v2.a0;

/* renamed from: s0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1409e extends AbstractC0135a implements Handler.Callback {

    /* renamed from: A, reason: collision with root package name */
    public V0.c f15210A;

    /* renamed from: B, reason: collision with root package name */
    public V0.c f15211B;

    /* renamed from: C, reason: collision with root package name */
    public int f15212C;

    /* renamed from: D, reason: collision with root package name */
    public final Handler f15213D;

    /* renamed from: E, reason: collision with root package name */
    public final SurfaceHolderCallbackC0125A f15214E;

    /* renamed from: F, reason: collision with root package name */
    public final l2.e f15215F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f15216G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f15217H;

    /* renamed from: I, reason: collision with root package name */
    public C0097o f15218I;

    /* renamed from: J, reason: collision with root package name */
    public long f15219J;

    /* renamed from: K, reason: collision with root package name */
    public long f15220K;

    /* renamed from: s, reason: collision with root package name */
    public final i f15221s;

    /* renamed from: t, reason: collision with root package name */
    public final f f15222t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC1405a f15223u;
    public final InterfaceC1408d v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f15224w;

    /* renamed from: x, reason: collision with root package name */
    public int f15225x;

    /* renamed from: y, reason: collision with root package name */
    public V0.e f15226y;
    public V0.i z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1409e(SurfaceHolderCallbackC0125A surfaceHolderCallbackC0125A, Looper looper) {
        super(3);
        t tVar = InterfaceC1408d.f15209x0;
        this.f15214E = surfaceHolderCallbackC0125A;
        this.f15213D = looper == null ? null : new Handler(looper, this);
        this.v = tVar;
        this.f15221s = new i(26);
        this.f15222t = new f(1);
        this.f15215F = new l2.e(24, false);
        this.f15220K = -9223372036854775807L;
        this.f15219J = -9223372036854775807L;
    }

    @Override // a0.AbstractC0135a
    public final int D(C0097o c0097o) {
        boolean equals = Objects.equals(c0097o.n, "application/x-media3-cues");
        String str = c0097o.n;
        if (!equals) {
            t tVar = (t) this.v;
            tVar.getClass();
            if (!((i) tVar.f8416a).f(c0097o) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return F.l(str) ? AbstractC0135a.f(1, 0, 0, 0) : AbstractC0135a.f(0, 0, 0, 0);
            }
        }
        return AbstractC0135a.f(c0097o.f2854O == 0 ? 4 : 2, 0, 0, 0);
    }

    public final void G() {
        boolean z = Objects.equals(this.f15218I.n, "application/cea-608") || Objects.equals(this.f15218I.n, "application/x-mp4-cea-608") || Objects.equals(this.f15218I.n, "application/cea-708");
        String str = this.f15218I.n;
        if (!z) {
            throw new IllegalStateException(AbstractC0347t0.n("Legacy decoding is disabled, can't handle %s samples (expected %s).", str, "application/x-media3-cues"));
        }
    }

    public final long H() {
        if (this.f15212C == -1) {
            return Long.MAX_VALUE;
        }
        this.f15210A.getClass();
        if (this.f15212C >= this.f15210A.f()) {
            return Long.MAX_VALUE;
        }
        return this.f15210A.c(this.f15212C);
    }

    public final long I(long j4) {
        AbstractC0124a.t(j4 != -9223372036854775807L);
        return j4 - this.f4047k;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r3.equals("application/cea-608") == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J() {
        V0.e c1406b;
        char c4 = 1;
        this.f15224w = true;
        C0097o c0097o = this.f15218I;
        c0097o.getClass();
        i iVar = (i) ((t) this.v).f8416a;
        String str = c0097o.n;
        int i4 = c0097o.f2851K;
        if (str != null) {
            switch (str.hashCode()) {
                case 930165504:
                    if (str.equals("application/x-mp4-cea-608")) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1566015601:
                    break;
                case 1566016562:
                    if (str.equals("application/cea-708")) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            switch (c4) {
                case 0:
                case 1:
                    c1406b = new W0.c(str, i4);
                    break;
                case 2:
                    c1406b = new W0.f(i4, c0097o.f2870q);
                    break;
            }
            this.f15226y = c1406b;
            c1406b.a(this.f4048l);
        }
        if (!iVar.f(c0097o)) {
            throw new IllegalArgumentException(AbstractC0005f.n("Attempted to create decoder for unsupported MIME type: ", str));
        }
        l a3 = iVar.a(c0097o);
        a3.getClass().getSimpleName().concat("Decoder");
        c1406b = new C1406b(a3);
        this.f15226y = c1406b;
        c1406b.a(this.f4048l);
    }

    public final void K(V.c cVar) {
        a0 a0Var = cVar.f3164a;
        SurfaceHolderCallbackC0125A surfaceHolderCallbackC0125A = this.f15214E;
        surfaceHolderCallbackC0125A.f3838a.n.e(27, new D0.a(15, a0Var));
        surfaceHolderCallbackC0125A.f3838a.n.e(27, new D0.a(12, cVar));
    }

    public final void L() {
        this.z = null;
        this.f15212C = -1;
        V0.c cVar = this.f15210A;
        if (cVar != null) {
            cVar.i();
            this.f15210A = null;
        }
        V0.c cVar2 = this.f15211B;
        if (cVar2 != null) {
            cVar2.i();
            this.f15211B = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        K((V.c) message.obj);
        return true;
    }

    @Override // a0.AbstractC0135a
    public final String k() {
        return "TextRenderer";
    }

    @Override // a0.AbstractC0135a
    public final boolean m() {
        return this.f15217H;
    }

    @Override // a0.AbstractC0135a
    public final boolean o() {
        C0097o c0097o = this.f15218I;
        if (c0097o != null) {
            if (Objects.equals(c0097o.n, "application/x-media3-cues")) {
                InterfaceC1405a interfaceC1405a = this.f15223u;
                interfaceC1405a.getClass();
                if (interfaceC1405a.a(this.f15219J) == Long.MIN_VALUE) {
                    try {
                        b0 b0Var = this.f4045i;
                        b0Var.getClass();
                        b0Var.a();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else {
                if (this.f15217H) {
                    return false;
                }
                if (this.f15216G) {
                    V0.c cVar = this.f15210A;
                    long j4 = this.f15219J;
                    if (cVar == null || cVar.f() <= 0 || cVar.c(cVar.f() - 1) <= j4) {
                        V0.c cVar2 = this.f15211B;
                        long j5 = this.f15219J;
                        if ((cVar2 == null || cVar2.f() <= 0 || cVar2.c(cVar2.f() - 1) <= j5) && this.z != null) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // a0.AbstractC0135a
    public final void p() {
        this.f15218I = null;
        this.f15220K = -9223372036854775807L;
        a0 a0Var = a0.f15605e;
        I(this.f15219J);
        V.c cVar = new V.c(a0Var);
        Handler handler = this.f15213D;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            K(cVar);
        }
        this.f15219J = -9223372036854775807L;
        if (this.f15226y != null) {
            L();
            V0.e eVar = this.f15226y;
            eVar.getClass();
            eVar.release();
            this.f15226y = null;
            this.f15225x = 0;
        }
    }

    @Override // a0.AbstractC0135a
    public final void r(long j4, boolean z, boolean z4) {
        this.f15219J = j4;
        InterfaceC1405a interfaceC1405a = this.f15223u;
        if (interfaceC1405a != null) {
            interfaceC1405a.clear();
        }
        a0 a0Var = a0.f15605e;
        I(this.f15219J);
        V.c cVar = new V.c(a0Var);
        Handler handler = this.f15213D;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            K(cVar);
        }
        this.f15216G = false;
        this.f15217H = false;
        this.f15220K = -9223372036854775807L;
        C0097o c0097o = this.f15218I;
        if (c0097o == null || Objects.equals(c0097o.n, "application/x-media3-cues")) {
            return;
        }
        if (this.f15225x == 0) {
            L();
            V0.e eVar = this.f15226y;
            eVar.getClass();
            eVar.flush();
            eVar.a(this.f4048l);
            return;
        }
        L();
        V0.e eVar2 = this.f15226y;
        eVar2.getClass();
        eVar2.release();
        this.f15226y = null;
        this.f15225x = 0;
        J();
    }

    @Override // a0.AbstractC0135a
    public final void w(C0097o[] c0097oArr, long j4, long j5, C1353B c1353b) {
        C0097o c0097o = c0097oArr[0];
        this.f15218I = c0097o;
        if (Objects.equals(c0097o.n, "application/x-media3-cues")) {
            this.f15223u = this.f15218I.L == 1 ? new C1407c() : new m(2);
            return;
        }
        G();
        if (this.f15226y != null) {
            this.f15225x = 1;
        } else {
            J();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023d A[EXC_TOP_SPLITTER, LOOP:2: B:99:0x023d->B:120:0x023d, LOOP_START, SYNTHETIC] */
    @Override // a0.AbstractC0135a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(long j4, long j5) {
        boolean z;
        l2.e eVar;
        boolean z4;
        long j6;
        if (this.n) {
            long j7 = this.f15220K;
            if (j7 != -9223372036854775807L && j4 >= j7) {
                L();
                this.f15217H = true;
            }
        }
        if (this.f15217H) {
            return;
        }
        C0097o c0097o = this.f15218I;
        c0097o.getClass();
        boolean equals = Objects.equals(c0097o.n, "application/x-media3-cues");
        Handler handler = this.f15213D;
        l2.e eVar2 = this.f15215F;
        boolean z5 = false;
        z5 = false;
        z5 = false;
        if (equals) {
            this.f15223u.getClass();
            if (!this.f15216G) {
                f fVar = this.f15222t;
                if (y(eVar2, fVar, 0) == -4) {
                    if (fVar.g(4)) {
                        this.f15216G = true;
                    } else {
                        fVar.k();
                        ByteBuffer byteBuffer = fVar.f3781e;
                        byteBuffer.getClass();
                        long j8 = fVar.f3783g;
                        byte[] array = byteBuffer.array();
                        int arrayOffset = byteBuffer.arrayOffset();
                        int limit = byteBuffer.limit();
                        this.f15221s.getClass();
                        Parcel obtain = Parcel.obtain();
                        obtain.unmarshall(array, arrayOffset, limit);
                        obtain.setDataPosition(0);
                        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
                        obtain.recycle();
                        ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        D0.d dVar = new D0.d(14);
                        v2.F j9 = I.j();
                        for (int i4 = 0; i4 < parcelableArrayList.size(); i4++) {
                            Bundle bundle = (Bundle) parcelableArrayList.get(i4);
                            bundle.getClass();
                            j9.b(dVar.apply(bundle));
                        }
                        V0.a aVar = new V0.a(j8, readBundle.getLong("d"), j9.f());
                        fVar.h();
                        z5 = this.f15223u.d(aVar, j4);
                    }
                }
            }
            long a3 = this.f15223u.a(this.f15219J);
            if (a3 == Long.MIN_VALUE && this.f15216G && !z5) {
                this.f15217H = true;
            }
            if (a3 != Long.MIN_VALUE && a3 <= j4) {
                z5 = true;
            }
            if (z5) {
                I b4 = this.f15223u.b(j4);
                long c4 = this.f15223u.c(j4);
                I(c4);
                V.c cVar = new V.c(b4);
                if (handler != null) {
                    handler.obtainMessage(1, cVar).sendToTarget();
                } else {
                    K(cVar);
                }
                this.f15223u.e(c4);
            }
            this.f15219J = j4;
            return;
        }
        G();
        this.f15219J = j4;
        if (this.f15211B == null) {
            V0.e eVar3 = this.f15226y;
            eVar3.getClass();
            eVar3.b(j4);
            try {
                V0.e eVar4 = this.f15226y;
                eVar4.getClass();
                this.f15211B = (V0.c) eVar4.c();
            } catch (V0.f e4) {
                AbstractC0108a.f("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f15218I, e4);
                a0 a0Var = a0.f15605e;
                I(this.f15219J);
                V.c cVar2 = new V.c(a0Var);
                if (handler != null) {
                    handler.obtainMessage(1, cVar2).sendToTarget();
                } else {
                    K(cVar2);
                }
                L();
                V0.e eVar5 = this.f15226y;
                eVar5.getClass();
                eVar5.release();
                this.f15226y = null;
                this.f15225x = 0;
                J();
                return;
            }
        }
        if (this.f4044h != 2) {
            return;
        }
        if (this.f15210A != null) {
            long H4 = H();
            z = false;
            while (H4 <= j4) {
                this.f15212C++;
                H4 = H();
                z = true;
            }
        } else {
            z = false;
        }
        V0.c cVar3 = this.f15211B;
        if (cVar3 != null) {
            if (!cVar3.g(4)) {
                eVar = eVar2;
                z4 = z;
                if (cVar3.f3786c <= j4) {
                    V0.c cVar4 = this.f15210A;
                    if (cVar4 != null) {
                        cVar4.i();
                    }
                    this.f15212C = cVar3.b(j4);
                    this.f15210A = cVar3;
                    this.f15211B = null;
                    z4 = true;
                }
                if (z4) {
                    this.f15210A.getClass();
                    int b5 = this.f15210A.b(j4);
                    if (b5 == 0 || this.f15210A.f() == 0) {
                        j6 = this.f15210A.f3786c;
                    } else if (b5 == -1) {
                        V0.c cVar5 = this.f15210A;
                        j6 = cVar5.c(cVar5.f() - 1);
                    } else {
                        j6 = this.f15210A.c(b5 - 1);
                    }
                    I(j6);
                    V.c cVar6 = new V.c(this.f15210A.e(j4));
                    if (handler != null) {
                        handler.obtainMessage(1, cVar6).sendToTarget();
                    } else {
                        K(cVar6);
                    }
                }
                if (this.f15225x != 2) {
                    return;
                }
                while (!this.f15216G) {
                    try {
                        V0.i iVar = this.z;
                        if (iVar == null) {
                            V0.e eVar6 = this.f15226y;
                            eVar6.getClass();
                            iVar = (V0.i) eVar6.d();
                            if (iVar == null) {
                                return;
                            } else {
                                this.z = iVar;
                            }
                        }
                        if (this.f15225x == 1) {
                            iVar.f3496b = 4;
                            V0.e eVar7 = this.f15226y;
                            eVar7.getClass();
                            eVar7.e(iVar);
                            this.z = null;
                            this.f15225x = 2;
                            return;
                        }
                        int y4 = y(eVar, iVar, 0);
                        if (y4 == -4) {
                            if (iVar.g(4)) {
                                this.f15216G = true;
                                this.f15224w = false;
                            } else {
                                C0097o c0097o2 = (C0097o) eVar.f14271c;
                                if (c0097o2 == null) {
                                    return;
                                }
                                iVar.f3205j = c0097o2.f2872s;
                                iVar.k();
                                this.f15224w &= !iVar.g(1);
                            }
                            if (!this.f15224w) {
                                V0.e eVar8 = this.f15226y;
                                eVar8.getClass();
                                eVar8.e(iVar);
                                this.z = null;
                            }
                        } else if (y4 == -3) {
                            return;
                        }
                    } catch (V0.f e5) {
                        AbstractC0108a.f("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f15218I, e5);
                        a0 a0Var2 = a0.f15605e;
                        I(this.f15219J);
                        V.c cVar7 = new V.c(a0Var2);
                        if (handler != null) {
                            handler.obtainMessage(1, cVar7).sendToTarget();
                        } else {
                            K(cVar7);
                        }
                        L();
                        V0.e eVar9 = this.f15226y;
                        eVar9.getClass();
                        eVar9.release();
                        this.f15226y = null;
                        this.f15225x = 0;
                        J();
                        return;
                    }
                }
                return;
            }
            if (!z && H() == Long.MAX_VALUE) {
                if (this.f15225x == 2) {
                    L();
                    V0.e eVar10 = this.f15226y;
                    eVar10.getClass();
                    eVar10.release();
                    this.f15226y = null;
                    this.f15225x = 0;
                    J();
                } else {
                    L();
                    this.f15217H = true;
                }
            }
        }
        eVar = eVar2;
        z4 = z;
        if (z4) {
        }
        if (this.f15225x != 2) {
        }
    }
}
