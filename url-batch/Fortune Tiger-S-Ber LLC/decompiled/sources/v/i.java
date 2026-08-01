package v;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f3500a;

    /* renamed from: b, reason: collision with root package name */
    public final l f3501b;
    public final k c;

    /* renamed from: d, reason: collision with root package name */
    public final j f3502d;

    /* renamed from: e, reason: collision with root package name */
    public final m f3503e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f3504f;

    public i() {
        l lVar = new l();
        lVar.f3549a = 0;
        lVar.f3550b = 0;
        lVar.c = 1.0f;
        lVar.f3551d = Float.NaN;
        this.f3501b = lVar;
        k kVar = new k();
        kVar.f3543a = -1;
        kVar.f3544b = 0;
        kVar.c = -1;
        kVar.f3545d = Float.NaN;
        kVar.f3546e = Float.NaN;
        kVar.f3547f = Float.NaN;
        kVar.g = -1;
        kVar.h = null;
        kVar.f3548i = -1;
        this.c = kVar;
        j jVar = new j();
        jVar.f3506a = false;
        jVar.f3510d = -1;
        jVar.f3512e = -1;
        jVar.f3514f = -1.0f;
        jVar.g = true;
        jVar.h = -1;
        jVar.f3517i = -1;
        jVar.f3519j = -1;
        jVar.f3521k = -1;
        jVar.f3523l = -1;
        jVar.f3525m = -1;
        jVar.f3527n = -1;
        jVar.f3529o = -1;
        jVar.f3531p = -1;
        jVar.f3532q = -1;
        jVar.f3533r = -1;
        jVar.f3534s = -1;
        jVar.f3535t = -1;
        jVar.f3536u = -1;
        jVar.f3537v = -1;
        jVar.f3538w = 0.5f;
        jVar.f3539x = 0.5f;
        jVar.f3540y = null;
        jVar.f3541z = -1;
        jVar.A = 0;
        jVar.B = 0.0f;
        jVar.C = -1;
        jVar.D = -1;
        jVar.E = -1;
        jVar.F = 0;
        jVar.G = 0;
        jVar.H = 0;
        jVar.I = 0;
        jVar.J = 0;
        jVar.K = 0;
        jVar.L = 0;
        jVar.M = Integer.MIN_VALUE;
        jVar.N = Integer.MIN_VALUE;
        jVar.O = Integer.MIN_VALUE;
        jVar.P = Integer.MIN_VALUE;
        jVar.Q = Integer.MIN_VALUE;
        jVar.R = Integer.MIN_VALUE;
        jVar.S = Integer.MIN_VALUE;
        jVar.T = -1.0f;
        jVar.U = -1.0f;
        jVar.V = 0;
        jVar.W = 0;
        jVar.X = 0;
        jVar.Y = 0;
        jVar.Z = 0;
        jVar.a0 = 0;
        jVar.f3508b0 = 0;
        jVar.f3509c0 = 0;
        jVar.f3511d0 = 1.0f;
        jVar.f3513e0 = 1.0f;
        jVar.f0 = -1;
        jVar.f3515g0 = 0;
        jVar.f3516h0 = -1;
        jVar.f3524l0 = false;
        jVar.f3526m0 = false;
        jVar.f3528n0 = true;
        jVar.f3530o0 = 0;
        this.f3502d = jVar;
        m mVar = new m();
        mVar.f3553a = 0.0f;
        mVar.f3554b = 0.0f;
        mVar.c = 0.0f;
        mVar.f3555d = 1.0f;
        mVar.f3556e = 1.0f;
        mVar.f3557f = Float.NaN;
        mVar.g = Float.NaN;
        mVar.h = -1;
        mVar.f3558i = 0.0f;
        mVar.f3559j = 0.0f;
        mVar.f3560k = 0.0f;
        mVar.f3561l = false;
        mVar.f3562m = 0.0f;
        this.f3503e = mVar;
        this.f3504f = new HashMap();
    }

    public final void a(e eVar) {
        j jVar = this.f3502d;
        eVar.f3451e = jVar.h;
        eVar.f3453f = jVar.f3517i;
        eVar.g = jVar.f3519j;
        eVar.h = jVar.f3521k;
        eVar.f3456i = jVar.f3523l;
        eVar.f3458j = jVar.f3525m;
        eVar.f3460k = jVar.f3527n;
        eVar.f3462l = jVar.f3529o;
        eVar.f3464m = jVar.f3531p;
        eVar.f3466n = jVar.f3532q;
        eVar.f3468o = jVar.f3533r;
        eVar.f3474s = jVar.f3534s;
        eVar.f3475t = jVar.f3535t;
        eVar.f3476u = jVar.f3536u;
        eVar.f3477v = jVar.f3537v;
        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = jVar.F;
        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = jVar.G;
        ((ViewGroup.MarginLayoutParams) eVar).topMargin = jVar.H;
        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = jVar.I;
        eVar.A = jVar.R;
        eVar.B = jVar.Q;
        eVar.f3479x = jVar.N;
        eVar.f3481z = jVar.P;
        eVar.E = jVar.f3538w;
        eVar.F = jVar.f3539x;
        eVar.f3470p = jVar.f3541z;
        eVar.f3472q = jVar.A;
        eVar.f3473r = jVar.B;
        eVar.G = jVar.f3540y;
        eVar.T = jVar.C;
        eVar.U = jVar.D;
        eVar.I = jVar.T;
        eVar.H = jVar.U;
        eVar.K = jVar.W;
        eVar.J = jVar.V;
        eVar.W = jVar.f3524l0;
        eVar.X = jVar.f3526m0;
        eVar.L = jVar.X;
        eVar.M = jVar.Y;
        eVar.P = jVar.Z;
        eVar.Q = jVar.a0;
        eVar.N = jVar.f3508b0;
        eVar.O = jVar.f3509c0;
        eVar.R = jVar.f3511d0;
        eVar.S = jVar.f3513e0;
        eVar.V = jVar.E;
        eVar.c = jVar.f3514f;
        eVar.f3445a = jVar.f3510d;
        eVar.f3446b = jVar.f3512e;
        ((ViewGroup.MarginLayoutParams) eVar).width = jVar.f3507b;
        ((ViewGroup.MarginLayoutParams) eVar).height = jVar.c;
        String str = jVar.f3522k0;
        if (str != null) {
            eVar.Y = str;
        }
        eVar.Z = jVar.f3530o0;
        eVar.setMarginStart(jVar.K);
        eVar.setMarginEnd(jVar.J);
        eVar.a();
    }

    public final Object clone() {
        i iVar = new i();
        j jVar = iVar.f3502d;
        jVar.getClass();
        j jVar2 = this.f3502d;
        jVar.f3506a = jVar2.f3506a;
        jVar.f3507b = jVar2.f3507b;
        jVar.c = jVar2.c;
        jVar.f3510d = jVar2.f3510d;
        jVar.f3512e = jVar2.f3512e;
        jVar.f3514f = jVar2.f3514f;
        jVar.g = jVar2.g;
        jVar.h = jVar2.h;
        jVar.f3517i = jVar2.f3517i;
        jVar.f3519j = jVar2.f3519j;
        jVar.f3521k = jVar2.f3521k;
        jVar.f3523l = jVar2.f3523l;
        jVar.f3525m = jVar2.f3525m;
        jVar.f3527n = jVar2.f3527n;
        jVar.f3529o = jVar2.f3529o;
        jVar.f3531p = jVar2.f3531p;
        jVar.f3532q = jVar2.f3532q;
        jVar.f3533r = jVar2.f3533r;
        jVar.f3534s = jVar2.f3534s;
        jVar.f3535t = jVar2.f3535t;
        jVar.f3536u = jVar2.f3536u;
        jVar.f3537v = jVar2.f3537v;
        jVar.f3538w = jVar2.f3538w;
        jVar.f3539x = jVar2.f3539x;
        jVar.f3540y = jVar2.f3540y;
        jVar.f3541z = jVar2.f3541z;
        jVar.A = jVar2.A;
        jVar.B = jVar2.B;
        jVar.C = jVar2.C;
        jVar.D = jVar2.D;
        jVar.E = jVar2.E;
        jVar.F = jVar2.F;
        jVar.G = jVar2.G;
        jVar.H = jVar2.H;
        jVar.I = jVar2.I;
        jVar.J = jVar2.J;
        jVar.K = jVar2.K;
        jVar.L = jVar2.L;
        jVar.M = jVar2.M;
        jVar.N = jVar2.N;
        jVar.O = jVar2.O;
        jVar.P = jVar2.P;
        jVar.Q = jVar2.Q;
        jVar.R = jVar2.R;
        jVar.S = jVar2.S;
        jVar.T = jVar2.T;
        jVar.U = jVar2.U;
        jVar.V = jVar2.V;
        jVar.W = jVar2.W;
        jVar.X = jVar2.X;
        jVar.Y = jVar2.Y;
        jVar.Z = jVar2.Z;
        jVar.a0 = jVar2.a0;
        jVar.f3508b0 = jVar2.f3508b0;
        jVar.f3509c0 = jVar2.f3509c0;
        jVar.f3511d0 = jVar2.f3511d0;
        jVar.f3513e0 = jVar2.f3513e0;
        jVar.f0 = jVar2.f0;
        jVar.f3515g0 = jVar2.f3515g0;
        jVar.f3516h0 = jVar2.f3516h0;
        jVar.f3522k0 = jVar2.f3522k0;
        int[] iArr = jVar2.f3518i0;
        if (iArr == null || jVar2.f3520j0 != null) {
            jVar.f3518i0 = null;
        } else {
            jVar.f3518i0 = Arrays.copyOf(iArr, iArr.length);
        }
        jVar.f3520j0 = jVar2.f3520j0;
        jVar.f3524l0 = jVar2.f3524l0;
        jVar.f3526m0 = jVar2.f3526m0;
        jVar.f3528n0 = jVar2.f3528n0;
        jVar.f3530o0 = jVar2.f3530o0;
        k kVar = iVar.c;
        kVar.getClass();
        k kVar2 = this.c;
        kVar2.getClass();
        kVar.f3543a = kVar2.f3543a;
        kVar.c = kVar2.c;
        kVar.f3546e = kVar2.f3546e;
        kVar.f3545d = kVar2.f3545d;
        l lVar = this.f3501b;
        int i4 = lVar.f3549a;
        l lVar2 = iVar.f3501b;
        lVar2.f3549a = i4;
        lVar2.c = lVar.c;
        lVar2.f3551d = lVar.f3551d;
        lVar2.f3550b = lVar.f3550b;
        m mVar = iVar.f3503e;
        mVar.getClass();
        m mVar2 = this.f3503e;
        mVar2.getClass();
        mVar.f3553a = mVar2.f3553a;
        mVar.f3554b = mVar2.f3554b;
        mVar.c = mVar2.c;
        mVar.f3555d = mVar2.f3555d;
        mVar.f3556e = mVar2.f3556e;
        mVar.f3557f = mVar2.f3557f;
        mVar.g = mVar2.g;
        mVar.h = mVar2.h;
        mVar.f3558i = mVar2.f3558i;
        mVar.f3559j = mVar2.f3559j;
        mVar.f3560k = mVar2.f3560k;
        mVar.f3561l = mVar2.f3561l;
        mVar.f3562m = mVar2.f3562m;
        iVar.f3500a = this.f3500a;
        return iVar;
    }
}
