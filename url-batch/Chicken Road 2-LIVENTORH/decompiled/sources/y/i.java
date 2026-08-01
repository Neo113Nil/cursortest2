package y;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f3695a;

    /* renamed from: b, reason: collision with root package name */
    public final l f3696b;

    /* renamed from: c, reason: collision with root package name */
    public final k f3697c;
    public final j d;

    /* renamed from: e, reason: collision with root package name */
    public final m f3698e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f3699f;

    public i() {
        l lVar = new l();
        lVar.f3746a = 0;
        lVar.f3747b = 0;
        lVar.f3748c = 1.0f;
        lVar.d = Float.NaN;
        this.f3696b = lVar;
        k kVar = new k();
        kVar.f3739a = -1;
        kVar.f3740b = 0;
        kVar.f3741c = -1;
        kVar.d = Float.NaN;
        kVar.f3742e = Float.NaN;
        kVar.f3743f = Float.NaN;
        kVar.f3744g = -1;
        kVar.f3745h = null;
        kVar.i = -1;
        this.f3697c = kVar;
        j jVar = new j();
        jVar.f3701a = false;
        jVar.d = -1;
        jVar.f3707e = -1;
        jVar.f3709f = -1.0f;
        jVar.f3711g = true;
        jVar.f3713h = -1;
        jVar.i = -1;
        jVar.f3715j = -1;
        jVar.f3717k = -1;
        jVar.f3719l = -1;
        jVar.f3721m = -1;
        jVar.f3723n = -1;
        jVar.f3725o = -1;
        jVar.f3727p = -1;
        jVar.f3728q = -1;
        jVar.f3729r = -1;
        jVar.f3730s = -1;
        jVar.f3731t = -1;
        jVar.f3732u = -1;
        jVar.f3733v = -1;
        jVar.f3734w = 0.5f;
        jVar.f3735x = 0.5f;
        jVar.f3736y = null;
        jVar.f3737z = -1;
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
        jVar.f3702a0 = 0;
        jVar.f3704b0 = 0;
        jVar.f3706c0 = 0;
        jVar.d0 = 1.0f;
        jVar.f3708e0 = 1.0f;
        jVar.f3710f0 = -1;
        jVar.f3712g0 = 0;
        jVar.f3714h0 = -1;
        jVar.f3720l0 = false;
        jVar.f3722m0 = false;
        jVar.f3724n0 = true;
        jVar.f3726o0 = 0;
        this.d = jVar;
        m mVar = new m();
        mVar.f3750a = 0.0f;
        mVar.f3751b = 0.0f;
        mVar.f3752c = 0.0f;
        mVar.d = 1.0f;
        mVar.f3753e = 1.0f;
        mVar.f3754f = Float.NaN;
        mVar.f3755g = Float.NaN;
        mVar.f3756h = -1;
        mVar.i = 0.0f;
        mVar.f3757j = 0.0f;
        mVar.f3758k = 0.0f;
        mVar.f3759l = false;
        mVar.f3760m = 0.0f;
        this.f3698e = mVar;
        this.f3699f = new HashMap();
    }

    public final void a(e eVar) {
        j jVar = this.d;
        eVar.f3642e = jVar.f3713h;
        eVar.f3644f = jVar.i;
        eVar.f3646g = jVar.f3715j;
        eVar.f3648h = jVar.f3717k;
        eVar.i = jVar.f3719l;
        eVar.f3650j = jVar.f3721m;
        eVar.f3652k = jVar.f3723n;
        eVar.f3654l = jVar.f3725o;
        eVar.f3656m = jVar.f3727p;
        eVar.f3658n = jVar.f3728q;
        eVar.f3660o = jVar.f3729r;
        eVar.f3666s = jVar.f3730s;
        eVar.f3667t = jVar.f3731t;
        eVar.f3668u = jVar.f3732u;
        eVar.f3669v = jVar.f3733v;
        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = jVar.F;
        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = jVar.G;
        ((ViewGroup.MarginLayoutParams) eVar).topMargin = jVar.H;
        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = jVar.I;
        eVar.A = jVar.R;
        eVar.B = jVar.Q;
        eVar.f3671x = jVar.N;
        eVar.f3673z = jVar.P;
        eVar.E = jVar.f3734w;
        eVar.F = jVar.f3735x;
        eVar.f3662p = jVar.f3737z;
        eVar.f3664q = jVar.A;
        eVar.f3665r = jVar.B;
        eVar.G = jVar.f3736y;
        eVar.T = jVar.C;
        eVar.U = jVar.D;
        eVar.I = jVar.T;
        eVar.H = jVar.U;
        eVar.K = jVar.W;
        eVar.J = jVar.V;
        eVar.W = jVar.f3720l0;
        eVar.X = jVar.f3722m0;
        eVar.L = jVar.X;
        eVar.M = jVar.Y;
        eVar.P = jVar.Z;
        eVar.Q = jVar.f3702a0;
        eVar.N = jVar.f3704b0;
        eVar.O = jVar.f3706c0;
        eVar.R = jVar.d0;
        eVar.S = jVar.f3708e0;
        eVar.V = jVar.E;
        eVar.f3640c = jVar.f3709f;
        eVar.f3636a = jVar.d;
        eVar.f3638b = jVar.f3707e;
        ((ViewGroup.MarginLayoutParams) eVar).width = jVar.f3703b;
        ((ViewGroup.MarginLayoutParams) eVar).height = jVar.f3705c;
        String str = jVar.f3718k0;
        if (str != null) {
            eVar.Y = str;
        }
        eVar.Z = jVar.f3726o0;
        eVar.setMarginStart(jVar.K);
        eVar.setMarginEnd(jVar.J);
        eVar.a();
    }

    public final Object clone() {
        i iVar = new i();
        j jVar = iVar.d;
        jVar.getClass();
        j jVar2 = this.d;
        jVar.f3701a = jVar2.f3701a;
        jVar.f3703b = jVar2.f3703b;
        jVar.f3705c = jVar2.f3705c;
        jVar.d = jVar2.d;
        jVar.f3707e = jVar2.f3707e;
        jVar.f3709f = jVar2.f3709f;
        jVar.f3711g = jVar2.f3711g;
        jVar.f3713h = jVar2.f3713h;
        jVar.i = jVar2.i;
        jVar.f3715j = jVar2.f3715j;
        jVar.f3717k = jVar2.f3717k;
        jVar.f3719l = jVar2.f3719l;
        jVar.f3721m = jVar2.f3721m;
        jVar.f3723n = jVar2.f3723n;
        jVar.f3725o = jVar2.f3725o;
        jVar.f3727p = jVar2.f3727p;
        jVar.f3728q = jVar2.f3728q;
        jVar.f3729r = jVar2.f3729r;
        jVar.f3730s = jVar2.f3730s;
        jVar.f3731t = jVar2.f3731t;
        jVar.f3732u = jVar2.f3732u;
        jVar.f3733v = jVar2.f3733v;
        jVar.f3734w = jVar2.f3734w;
        jVar.f3735x = jVar2.f3735x;
        jVar.f3736y = jVar2.f3736y;
        jVar.f3737z = jVar2.f3737z;
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
        jVar.f3702a0 = jVar2.f3702a0;
        jVar.f3704b0 = jVar2.f3704b0;
        jVar.f3706c0 = jVar2.f3706c0;
        jVar.d0 = jVar2.d0;
        jVar.f3708e0 = jVar2.f3708e0;
        jVar.f3710f0 = jVar2.f3710f0;
        jVar.f3712g0 = jVar2.f3712g0;
        jVar.f3714h0 = jVar2.f3714h0;
        jVar.f3718k0 = jVar2.f3718k0;
        int[] iArr = jVar2.i0;
        if (iArr == null || jVar2.f3716j0 != null) {
            jVar.i0 = null;
        } else {
            jVar.i0 = Arrays.copyOf(iArr, iArr.length);
        }
        jVar.f3716j0 = jVar2.f3716j0;
        jVar.f3720l0 = jVar2.f3720l0;
        jVar.f3722m0 = jVar2.f3722m0;
        jVar.f3724n0 = jVar2.f3724n0;
        jVar.f3726o0 = jVar2.f3726o0;
        k kVar = iVar.f3697c;
        kVar.getClass();
        k kVar2 = this.f3697c;
        kVar2.getClass();
        kVar.f3739a = kVar2.f3739a;
        kVar.f3741c = kVar2.f3741c;
        kVar.f3742e = kVar2.f3742e;
        kVar.d = kVar2.d;
        l lVar = this.f3696b;
        int i = lVar.f3746a;
        l lVar2 = iVar.f3696b;
        lVar2.f3746a = i;
        lVar2.f3748c = lVar.f3748c;
        lVar2.d = lVar.d;
        lVar2.f3747b = lVar.f3747b;
        m mVar = iVar.f3698e;
        mVar.getClass();
        m mVar2 = this.f3698e;
        mVar2.getClass();
        mVar.f3750a = mVar2.f3750a;
        mVar.f3751b = mVar2.f3751b;
        mVar.f3752c = mVar2.f3752c;
        mVar.d = mVar2.d;
        mVar.f3753e = mVar2.f3753e;
        mVar.f3754f = mVar2.f3754f;
        mVar.f3755g = mVar2.f3755g;
        mVar.f3756h = mVar2.f3756h;
        mVar.i = mVar2.i;
        mVar.f3757j = mVar2.f3757j;
        mVar.f3758k = mVar2.f3758k;
        mVar.f3759l = mVar2.f3759l;
        mVar.f3760m = mVar2.f3760m;
        iVar.f3695a = this.f3695a;
        return iVar;
    }
}
