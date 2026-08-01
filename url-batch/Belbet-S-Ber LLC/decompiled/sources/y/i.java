package y;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f4018a;

    /* renamed from: b, reason: collision with root package name */
    public final l f4019b;

    /* renamed from: c, reason: collision with root package name */
    public final k f4020c;
    public final j d;

    /* renamed from: e, reason: collision with root package name */
    public final m f4021e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f4022f;

    public i() {
        l lVar = new l();
        lVar.f4067a = 0;
        lVar.f4068b = 0;
        lVar.f4069c = 1.0f;
        lVar.d = Float.NaN;
        this.f4019b = lVar;
        k kVar = new k();
        kVar.f4061a = -1;
        kVar.f4062b = 0;
        kVar.f4063c = -1;
        kVar.d = Float.NaN;
        kVar.f4064e = Float.NaN;
        kVar.f4065f = Float.NaN;
        kVar.f4066g = -1;
        kVar.h = null;
        kVar.i = -1;
        this.f4020c = kVar;
        j jVar = new j();
        jVar.f4024a = false;
        jVar.d = -1;
        jVar.f4030e = -1;
        jVar.f4032f = -1.0f;
        jVar.f4034g = true;
        jVar.h = -1;
        jVar.i = -1;
        jVar.f4037j = -1;
        jVar.f4039k = -1;
        jVar.f4041l = -1;
        jVar.f4043m = -1;
        jVar.f4045n = -1;
        jVar.f4047o = -1;
        jVar.f4049p = -1;
        jVar.f4050q = -1;
        jVar.f4051r = -1;
        jVar.f4052s = -1;
        jVar.f4053t = -1;
        jVar.f4054u = -1;
        jVar.f4055v = -1;
        jVar.f4056w = 0.5f;
        jVar.f4057x = 0.5f;
        jVar.f4058y = null;
        jVar.f4059z = -1;
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
        jVar.f4025a0 = 0;
        jVar.f4027b0 = 0;
        jVar.f4029c0 = 0;
        jVar.d0 = 1.0f;
        jVar.f4031e0 = 1.0f;
        jVar.f4033f0 = -1;
        jVar.f4035g0 = 0;
        jVar.f4036h0 = -1;
        jVar.f4042l0 = false;
        jVar.f4044m0 = false;
        jVar.f4046n0 = true;
        jVar.f4048o0 = 0;
        this.d = jVar;
        m mVar = new m();
        mVar.f4071a = 0.0f;
        mVar.f4072b = 0.0f;
        mVar.f4073c = 0.0f;
        mVar.d = 1.0f;
        mVar.f4074e = 1.0f;
        mVar.f4075f = Float.NaN;
        mVar.f4076g = Float.NaN;
        mVar.h = -1;
        mVar.i = 0.0f;
        mVar.f4077j = 0.0f;
        mVar.f4078k = 0.0f;
        mVar.f4079l = false;
        mVar.f4080m = 0.0f;
        this.f4021e = mVar;
        this.f4022f = new HashMap();
    }

    public final void a(e eVar) {
        j jVar = this.d;
        eVar.f3968e = jVar.h;
        eVar.f3970f = jVar.i;
        eVar.f3972g = jVar.f4037j;
        eVar.h = jVar.f4039k;
        eVar.i = jVar.f4041l;
        eVar.f3975j = jVar.f4043m;
        eVar.f3977k = jVar.f4045n;
        eVar.f3979l = jVar.f4047o;
        eVar.f3981m = jVar.f4049p;
        eVar.f3983n = jVar.f4050q;
        eVar.f3985o = jVar.f4051r;
        eVar.f3991s = jVar.f4052s;
        eVar.f3992t = jVar.f4053t;
        eVar.f3993u = jVar.f4054u;
        eVar.f3994v = jVar.f4055v;
        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = jVar.F;
        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = jVar.G;
        ((ViewGroup.MarginLayoutParams) eVar).topMargin = jVar.H;
        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = jVar.I;
        eVar.A = jVar.R;
        eVar.B = jVar.Q;
        eVar.f3996x = jVar.N;
        eVar.f3998z = jVar.P;
        eVar.E = jVar.f4056w;
        eVar.F = jVar.f4057x;
        eVar.f3987p = jVar.f4059z;
        eVar.f3989q = jVar.A;
        eVar.f3990r = jVar.B;
        eVar.G = jVar.f4058y;
        eVar.T = jVar.C;
        eVar.U = jVar.D;
        eVar.I = jVar.T;
        eVar.H = jVar.U;
        eVar.K = jVar.W;
        eVar.J = jVar.V;
        eVar.W = jVar.f4042l0;
        eVar.X = jVar.f4044m0;
        eVar.L = jVar.X;
        eVar.M = jVar.Y;
        eVar.P = jVar.Z;
        eVar.Q = jVar.f4025a0;
        eVar.N = jVar.f4027b0;
        eVar.O = jVar.f4029c0;
        eVar.R = jVar.d0;
        eVar.S = jVar.f4031e0;
        eVar.V = jVar.E;
        eVar.f3966c = jVar.f4032f;
        eVar.f3962a = jVar.d;
        eVar.f3964b = jVar.f4030e;
        ((ViewGroup.MarginLayoutParams) eVar).width = jVar.f4026b;
        ((ViewGroup.MarginLayoutParams) eVar).height = jVar.f4028c;
        String str = jVar.f4040k0;
        if (str != null) {
            eVar.Y = str;
        }
        eVar.Z = jVar.f4048o0;
        eVar.setMarginStart(jVar.K);
        eVar.setMarginEnd(jVar.J);
        eVar.a();
    }

    public final Object clone() {
        i iVar = new i();
        j jVar = iVar.d;
        jVar.getClass();
        j jVar2 = this.d;
        jVar.f4024a = jVar2.f4024a;
        jVar.f4026b = jVar2.f4026b;
        jVar.f4028c = jVar2.f4028c;
        jVar.d = jVar2.d;
        jVar.f4030e = jVar2.f4030e;
        jVar.f4032f = jVar2.f4032f;
        jVar.f4034g = jVar2.f4034g;
        jVar.h = jVar2.h;
        jVar.i = jVar2.i;
        jVar.f4037j = jVar2.f4037j;
        jVar.f4039k = jVar2.f4039k;
        jVar.f4041l = jVar2.f4041l;
        jVar.f4043m = jVar2.f4043m;
        jVar.f4045n = jVar2.f4045n;
        jVar.f4047o = jVar2.f4047o;
        jVar.f4049p = jVar2.f4049p;
        jVar.f4050q = jVar2.f4050q;
        jVar.f4051r = jVar2.f4051r;
        jVar.f4052s = jVar2.f4052s;
        jVar.f4053t = jVar2.f4053t;
        jVar.f4054u = jVar2.f4054u;
        jVar.f4055v = jVar2.f4055v;
        jVar.f4056w = jVar2.f4056w;
        jVar.f4057x = jVar2.f4057x;
        jVar.f4058y = jVar2.f4058y;
        jVar.f4059z = jVar2.f4059z;
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
        jVar.f4025a0 = jVar2.f4025a0;
        jVar.f4027b0 = jVar2.f4027b0;
        jVar.f4029c0 = jVar2.f4029c0;
        jVar.d0 = jVar2.d0;
        jVar.f4031e0 = jVar2.f4031e0;
        jVar.f4033f0 = jVar2.f4033f0;
        jVar.f4035g0 = jVar2.f4035g0;
        jVar.f4036h0 = jVar2.f4036h0;
        jVar.f4040k0 = jVar2.f4040k0;
        int[] iArr = jVar2.i0;
        if (iArr == null || jVar2.f4038j0 != null) {
            jVar.i0 = null;
        } else {
            jVar.i0 = Arrays.copyOf(iArr, iArr.length);
        }
        jVar.f4038j0 = jVar2.f4038j0;
        jVar.f4042l0 = jVar2.f4042l0;
        jVar.f4044m0 = jVar2.f4044m0;
        jVar.f4046n0 = jVar2.f4046n0;
        jVar.f4048o0 = jVar2.f4048o0;
        k kVar = iVar.f4020c;
        kVar.getClass();
        k kVar2 = this.f4020c;
        kVar2.getClass();
        kVar.f4061a = kVar2.f4061a;
        kVar.f4063c = kVar2.f4063c;
        kVar.f4064e = kVar2.f4064e;
        kVar.d = kVar2.d;
        l lVar = this.f4019b;
        int i = lVar.f4067a;
        l lVar2 = iVar.f4019b;
        lVar2.f4067a = i;
        lVar2.f4069c = lVar.f4069c;
        lVar2.d = lVar.d;
        lVar2.f4068b = lVar.f4068b;
        m mVar = iVar.f4021e;
        mVar.getClass();
        m mVar2 = this.f4021e;
        mVar2.getClass();
        mVar.f4071a = mVar2.f4071a;
        mVar.f4072b = mVar2.f4072b;
        mVar.f4073c = mVar2.f4073c;
        mVar.d = mVar2.d;
        mVar.f4074e = mVar2.f4074e;
        mVar.f4075f = mVar2.f4075f;
        mVar.f4076g = mVar2.f4076g;
        mVar.h = mVar2.h;
        mVar.i = mVar2.i;
        mVar.f4077j = mVar2.f4077j;
        mVar.f4078k = mVar2.f4078k;
        mVar.f4079l = mVar2.f4079l;
        mVar.f4080m = mVar2.f4080m;
        iVar.f4018a = this.f4018a;
        return iVar;
    }
}
