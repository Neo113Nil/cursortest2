package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.CancellationSignal;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class a3 extends pc0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(s40 s40Var, ft ftVar, v11 v11Var) {
        super(1);
        this.d = 10;
        this.e = v11Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        dn dnVar = null;
        int i = 1;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                b3 b3Var = (b3) obj;
                kd0 kd0Var = (kd0) this.e;
                if (b3Var.O() != Integer.MAX_VALUE) {
                    if (b3Var.a().b) {
                        b3Var.B();
                    }
                    for (Map.Entry entry : b3Var.a().g.entrySet()) {
                        kd0.a(kd0Var, (m60) entry.getKey(), ((Number) entry.getValue()).intValue(), b3Var.y());
                    }
                    qp0 qp0Var = b3Var.y().u;
                    qp0Var.getClass();
                    while (!qp0Var.equals(kd0Var.a.y())) {
                        for (m60 m60Var : kd0Var.b(qp0Var).keySet()) {
                            kd0.a(kd0Var, m60Var, kd0Var.c(qp0Var, m60Var), qp0Var);
                        }
                        qp0Var = qp0Var.u;
                        qp0Var.getClass();
                    }
                }
                return Unit.a;
            case 1:
                return Boolean.valueOf(((o10) obj).G0(((s00) this.e).a));
            case 2:
                bj0 bj0Var = (bj0) obj;
                d4 d4Var = ((r3) this.e).t;
                if (d4Var.getInsetsListener().j.h() > 0) {
                    en0 en0Var = op1.a;
                    bj0Var.d = true;
                    ej0 ej0Var = bj0Var.h;
                    uc0 o0 = ej0Var.o0();
                    if (s90.a(bj0Var.e, 9223372034707292159L)) {
                        bj0Var.e = t90.C(o0.b(0L));
                        bj0Var.g = o0.K();
                    }
                    ej0Var.q0().K.b();
                    long K = o0.K();
                    vn0 vn0Var = d4Var.getInsetsListener().i;
                    int i2 = (int) (K >> 32);
                    int i3 = (int) (4294967295L & K);
                    for (mp1 mp1Var : op1.b) {
                        Object g = vn0Var.g(mp1Var);
                        g.getClass();
                        wp1 wp1Var = (wp1) g;
                        op1.a(bj0Var, ((np1) mp1Var).c, wp1Var.h, i2, i3);
                        if (((Boolean) wp1Var.b.getValue()).booleanValue()) {
                            op1.a(bj0Var, wp1Var.f, wp1Var.j, i2, i3);
                            op1.a(bj0Var, wp1Var.g, wp1Var.k, i2, i3);
                        }
                        op1.a(bj0Var, ((np1) mp1Var).d, wp1Var.i, i2, i3);
                    }
                    mn0 mn0Var = d4Var.getInsetsListener().k;
                    if (mn0Var.i()) {
                        ac1 ac1Var = d4Var.getInsetsListener().l;
                        Object[] objArr = mn0Var.a;
                        int i4 = mn0Var.b;
                        for (int i5 = 0; i5 < i4; i5++) {
                            ao0 ao0Var = (ao0) objArr[i5];
                            w80 w80Var = (w80) ac1Var.get(i5);
                            Rect rect = (Rect) ao0Var.getValue();
                            bj0Var.a(w80Var.b(), rect.left);
                            bj0Var.a(w80Var.d(), rect.top);
                            bj0Var.a(w80Var.c(), rect.right);
                            bj0Var.a(w80Var.a(), rect.bottom);
                        }
                    }
                }
                return Unit.a;
            case 3:
                return Boolean.valueOf(((q90) this.e).a(((l81) obj).g));
            case 4:
                return Boolean.valueOf(la0.s((l81) obj, (Resources) this.e));
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                return new n2(i, (ss) this.e);
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                ((jd0) this.e).X((nr) obj);
                return Unit.a;
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                s11 s11Var = (s11) obj;
                de deVar = (de) this.e;
                if (deVar.r) {
                    uq1.N(deVar.n0(), null, new d(deVar, s11Var, dnVar, 3), 3);
                }
                return Unit.a;
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) this.e).cancel();
                }
                return Unit.a;
            case 9:
                Throwable th = (Throwable) obj;
                mp mpVar = (mp) this.e;
                if (th != null) {
                    mpVar.l.B(new zy(th));
                }
                if (mpVar.n.e != lk1.a) {
                    ((gy) mpVar.n.getValue()).close();
                }
                return Unit.a;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                ft ftVar = (ft) obj;
                if (!ftVar.r) {
                    return jj1.e;
                }
                if (ftVar.t != null) {
                    o80.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                ftVar.t = null;
                v11 v11Var = (v11) this.e;
                v11Var.d = v11Var.d;
                return jj1.d;
            case RequestError.STOP_TRACKING /* 11 */:
                ft ftVar2 = (ft) obj;
                if (!ftVar2.d.r) {
                    return jj1.e;
                }
                ft ftVar3 = ftVar2.t;
                if (ftVar3 != null) {
                    a3 a3Var = new a3(11, (s40) this.e);
                    if (a3Var.invoke(ftVar3) == jj1.d) {
                        ka0.J(ftVar3, a3Var);
                    }
                }
                ftVar2.t = null;
                ftVar2.s = null;
                return jj1.d;
            case 12:
                if (y40.b.compareAndSet(false, true)) {
                    ((we) this.e).s(Unit.a);
                }
                return Unit.a;
            case 13:
                hu huVar = (hu) obj;
                l50 l50Var = (l50) this.e;
                c6 c6Var = l50Var.l;
                if (l50Var.n && l50Var.w && c6Var != null) {
                    i8 v = huVar.v();
                    long i6 = v.i();
                    v.g().k();
                    try {
                        ((i8) ((s40) v.e).e).g().q(c6Var);
                        l50Var.c(huVar);
                    } finally {
                        qy0.s(v, i6);
                    }
                } else {
                    l50Var.c(huVar);
                }
                return Unit.a;
            case 14:
                hu huVar2 = (hu) obj;
                n50 n50Var = (n50) this.e;
                xf g2 = huVar2.v().g();
                Function2 function2 = n50Var.h;
                if (function2 != null) {
                    function2.b(g2, (l50) huVar2.v().g);
                }
                return Unit.a;
            case 15:
                dm1 dm1Var = (dm1) obj;
                q50 q50Var = (q50) this.e;
                q50Var.g(dm1Var);
                Function1 function1 = q50Var.i;
                if (function1 != null) {
                    function1.invoke(dm1Var);
                }
                return Unit.a;
            case 16:
                ((eo0) this.e).b((yl0) obj);
                return Boolean.TRUE;
            case 17:
                return obj == ((mn0) this.e) ? "(this)" : String.valueOf(obj);
            case 18:
                return obj == ((nn0) this.e) ? "(this)" : String.valueOf(obj);
            case 19:
                yw0 yw0Var = (yw0) obj;
                ArrayList arrayList = (ArrayList) this.e;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    yw0.r(yw0Var, (zw0) arrayList.get(i7), 0, 0);
                }
                return Unit.a;
            case 20:
                return obj == ((wn0) this.e) ? "(this)" : String.valueOf(obj);
            case 21:
                String str = (String) this.e;
                dc0[] dc0VarArr = s81.a;
                ((u81) obj).a(p81.a, yh.b(str));
                return Unit.a;
            case 22:
                ((List) obj).add((Float) ((gf0) this.e).invoke());
                return true;
            case 23:
                o31 o31Var = (o31) obj;
                ra1 ra1Var = (ra1) this.e;
                float f = ra1Var.s;
                if (o31Var.e != f) {
                    o31Var.d |= 1;
                    o31Var.e = f;
                }
                float f2 = ra1Var.t;
                if (o31Var.g != f2) {
                    o31Var.d |= 2;
                    o31Var.g = f2;
                }
                float f3 = ra1Var.u;
                if (o31Var.h != f3) {
                    o31Var.d |= 4;
                    o31Var.h = f3;
                }
                float f4 = ra1Var.v;
                if (o31Var.i != f4) {
                    o31Var.d = 32 | o31Var.d;
                    o31Var.i = f4;
                }
                float f5 = ra1Var.w;
                if (o31Var.l != f5) {
                    o31Var.d |= 2048;
                    o31Var.l = f5;
                }
                long j = ra1Var.x;
                long j2 = o31Var.m;
                int i8 = aj1.b;
                if (j2 != j) {
                    o31Var.d |= 4096;
                    o31Var.m = j;
                }
                u91 u91Var = ra1Var.y;
                if (!Intrinsics.a(o31Var.n, u91Var)) {
                    o31Var.d |= 8192;
                    o31Var.n = u91Var;
                }
                boolean z = ra1Var.z;
                if (o31Var.o != z) {
                    o31Var.d |= 16384;
                    o31Var.o = z;
                }
                long j3 = ra1Var.A;
                if (!hi.c(o31Var.j, j3)) {
                    o31Var.d |= 64;
                    o31Var.j = j3;
                }
                long j4 = ra1Var.B;
                if (!hi.c(o31Var.k, j4)) {
                    o31Var.d |= 128;
                    o31Var.k = j4;
                }
                int i9 = ra1Var.C;
                if (o31Var.s != i9) {
                    o31Var.d |= 524288;
                    o31Var.s = i9;
                }
                return Unit.a;
            default:
                Throwable th2 = (Throwable) obj;
                vf1 vf1Var = (vf1) this.e;
                tf tfVar = vf1Var.g;
                if (tfVar != null) {
                    tfVar.t(th2);
                }
                vf1Var.g = null;
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3(int i, Object obj) {
        super(1);
        this.d = i;
        this.e = obj;
    }
}
