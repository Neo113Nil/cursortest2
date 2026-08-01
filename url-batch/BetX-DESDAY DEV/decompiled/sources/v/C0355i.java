package v;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: v.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0355i {

    /* renamed from: a, reason: collision with root package name */
    public int f4341a;

    /* renamed from: b, reason: collision with root package name */
    public final l f4342b;

    /* renamed from: c, reason: collision with root package name */
    public final k f4343c;

    /* renamed from: d, reason: collision with root package name */
    public final C0356j f4344d;

    /* renamed from: e, reason: collision with root package name */
    public final m f4345e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f4346f;

    public C0355i() {
        l lVar = new l();
        lVar.f4418a = 0;
        lVar.f4419b = 0;
        lVar.f4420c = 1.0f;
        lVar.f4421d = Float.NaN;
        this.f4342b = lVar;
        k kVar = new k();
        kVar.f4411a = -1;
        kVar.f4412b = 0;
        kVar.f4413c = -1;
        kVar.f4414d = Float.NaN;
        kVar.f4415e = Float.NaN;
        kVar.f4416f = Float.NaN;
        kVar.f4417g = -1;
        kVar.h = null;
        kVar.i = -1;
        this.f4343c = kVar;
        C0356j c0356j = new C0356j();
        c0356j.f4373a = false;
        c0356j.f4379d = -1;
        c0356j.f4381e = -1;
        c0356j.f4383f = -1.0f;
        c0356j.f4385g = true;
        c0356j.h = -1;
        c0356j.i = -1;
        c0356j.f4388j = -1;
        c0356j.f4390k = -1;
        c0356j.f4392l = -1;
        c0356j.f4394m = -1;
        c0356j.f4395n = -1;
        c0356j.f4397o = -1;
        c0356j.f4399p = -1;
        c0356j.f4400q = -1;
        c0356j.f4401r = -1;
        c0356j.f4402s = -1;
        c0356j.f4403t = -1;
        c0356j.f4404u = -1;
        c0356j.f4405v = -1;
        c0356j.f4406w = 0.5f;
        c0356j.f4407x = 0.5f;
        c0356j.f4408y = null;
        c0356j.f4409z = -1;
        c0356j.f4348A = 0;
        c0356j.f4349B = 0.0f;
        c0356j.f4350C = -1;
        c0356j.f4351D = -1;
        c0356j.f4352E = -1;
        c0356j.F = 0;
        c0356j.f4353G = 0;
        c0356j.f4354H = 0;
        c0356j.f4355I = 0;
        c0356j.f4356J = 0;
        c0356j.f4357K = 0;
        c0356j.f4358L = 0;
        c0356j.f4359M = Integer.MIN_VALUE;
        c0356j.f4360N = Integer.MIN_VALUE;
        c0356j.f4361O = Integer.MIN_VALUE;
        c0356j.f4362P = Integer.MIN_VALUE;
        c0356j.f4363Q = Integer.MIN_VALUE;
        c0356j.f4364R = Integer.MIN_VALUE;
        c0356j.f4365S = Integer.MIN_VALUE;
        c0356j.f4366T = -1.0f;
        c0356j.f4367U = -1.0f;
        c0356j.f4368V = 0;
        c0356j.f4369W = 0;
        c0356j.f4370X = 0;
        c0356j.f4371Y = 0;
        c0356j.f4372Z = 0;
        c0356j.f4374a0 = 0;
        c0356j.f4376b0 = 0;
        c0356j.f4378c0 = 0;
        c0356j.f4380d0 = 1.0f;
        c0356j.f4382e0 = 1.0f;
        c0356j.f4384f0 = -1;
        c0356j.f4386g0 = 0;
        c0356j.f4387h0 = -1;
        c0356j.f4393l0 = false;
        c0356j.m0 = false;
        c0356j.f4396n0 = true;
        c0356j.f4398o0 = 0;
        this.f4344d = c0356j;
        m mVar = new m();
        mVar.f4423a = 0.0f;
        mVar.f4424b = 0.0f;
        mVar.f4425c = 0.0f;
        mVar.f4426d = 1.0f;
        mVar.f4427e = 1.0f;
        mVar.f4428f = Float.NaN;
        mVar.f4429g = Float.NaN;
        mVar.h = -1;
        mVar.i = 0.0f;
        mVar.f4430j = 0.0f;
        mVar.f4431k = 0.0f;
        mVar.f4432l = false;
        mVar.f4433m = 0.0f;
        this.f4345e = mVar;
        this.f4346f = new HashMap();
    }

    public final void a(C0351e c0351e) {
        C0356j c0356j = this.f4344d;
        c0351e.f4289e = c0356j.h;
        c0351e.f4291f = c0356j.i;
        c0351e.f4293g = c0356j.f4388j;
        c0351e.h = c0356j.f4390k;
        c0351e.i = c0356j.f4392l;
        c0351e.f4296j = c0356j.f4394m;
        c0351e.f4298k = c0356j.f4395n;
        c0351e.f4300l = c0356j.f4397o;
        c0351e.f4302m = c0356j.f4399p;
        c0351e.f4303n = c0356j.f4400q;
        c0351e.f4305o = c0356j.f4401r;
        c0351e.f4311s = c0356j.f4402s;
        c0351e.f4312t = c0356j.f4403t;
        c0351e.f4313u = c0356j.f4404u;
        c0351e.f4314v = c0356j.f4405v;
        ((ViewGroup.MarginLayoutParams) c0351e).leftMargin = c0356j.F;
        ((ViewGroup.MarginLayoutParams) c0351e).rightMargin = c0356j.f4353G;
        ((ViewGroup.MarginLayoutParams) c0351e).topMargin = c0356j.f4354H;
        ((ViewGroup.MarginLayoutParams) c0351e).bottomMargin = c0356j.f4355I;
        c0351e.f4256A = c0356j.f4364R;
        c0351e.f4257B = c0356j.f4363Q;
        c0351e.f4316x = c0356j.f4360N;
        c0351e.f4318z = c0356j.f4362P;
        c0351e.f4260E = c0356j.f4406w;
        c0351e.F = c0356j.f4407x;
        c0351e.f4307p = c0356j.f4409z;
        c0351e.f4309q = c0356j.f4348A;
        c0351e.f4310r = c0356j.f4349B;
        c0351e.f4261G = c0356j.f4408y;
        c0351e.f4274T = c0356j.f4350C;
        c0351e.f4275U = c0356j.f4351D;
        c0351e.f4263I = c0356j.f4366T;
        c0351e.f4262H = c0356j.f4367U;
        c0351e.f4265K = c0356j.f4369W;
        c0351e.f4264J = c0356j.f4368V;
        c0351e.f4277W = c0356j.f4393l0;
        c0351e.f4278X = c0356j.m0;
        c0351e.f4266L = c0356j.f4370X;
        c0351e.f4267M = c0356j.f4371Y;
        c0351e.f4270P = c0356j.f4372Z;
        c0351e.f4271Q = c0356j.f4374a0;
        c0351e.f4268N = c0356j.f4376b0;
        c0351e.f4269O = c0356j.f4378c0;
        c0351e.f4272R = c0356j.f4380d0;
        c0351e.f4273S = c0356j.f4382e0;
        c0351e.f4276V = c0356j.f4352E;
        c0351e.f4285c = c0356j.f4383f;
        c0351e.f4281a = c0356j.f4379d;
        c0351e.f4283b = c0356j.f4381e;
        ((ViewGroup.MarginLayoutParams) c0351e).width = c0356j.f4375b;
        ((ViewGroup.MarginLayoutParams) c0351e).height = c0356j.f4377c;
        String str = c0356j.f4391k0;
        if (str != null) {
            c0351e.f4279Y = str;
        }
        c0351e.f4280Z = c0356j.f4398o0;
        c0351e.setMarginStart(c0356j.f4357K);
        c0351e.setMarginEnd(c0356j.f4356J);
        c0351e.a();
    }

    public final Object clone() {
        C0355i c0355i = new C0355i();
        C0356j c0356j = c0355i.f4344d;
        c0356j.getClass();
        C0356j c0356j2 = this.f4344d;
        c0356j.f4373a = c0356j2.f4373a;
        c0356j.f4375b = c0356j2.f4375b;
        c0356j.f4377c = c0356j2.f4377c;
        c0356j.f4379d = c0356j2.f4379d;
        c0356j.f4381e = c0356j2.f4381e;
        c0356j.f4383f = c0356j2.f4383f;
        c0356j.f4385g = c0356j2.f4385g;
        c0356j.h = c0356j2.h;
        c0356j.i = c0356j2.i;
        c0356j.f4388j = c0356j2.f4388j;
        c0356j.f4390k = c0356j2.f4390k;
        c0356j.f4392l = c0356j2.f4392l;
        c0356j.f4394m = c0356j2.f4394m;
        c0356j.f4395n = c0356j2.f4395n;
        c0356j.f4397o = c0356j2.f4397o;
        c0356j.f4399p = c0356j2.f4399p;
        c0356j.f4400q = c0356j2.f4400q;
        c0356j.f4401r = c0356j2.f4401r;
        c0356j.f4402s = c0356j2.f4402s;
        c0356j.f4403t = c0356j2.f4403t;
        c0356j.f4404u = c0356j2.f4404u;
        c0356j.f4405v = c0356j2.f4405v;
        c0356j.f4406w = c0356j2.f4406w;
        c0356j.f4407x = c0356j2.f4407x;
        c0356j.f4408y = c0356j2.f4408y;
        c0356j.f4409z = c0356j2.f4409z;
        c0356j.f4348A = c0356j2.f4348A;
        c0356j.f4349B = c0356j2.f4349B;
        c0356j.f4350C = c0356j2.f4350C;
        c0356j.f4351D = c0356j2.f4351D;
        c0356j.f4352E = c0356j2.f4352E;
        c0356j.F = c0356j2.F;
        c0356j.f4353G = c0356j2.f4353G;
        c0356j.f4354H = c0356j2.f4354H;
        c0356j.f4355I = c0356j2.f4355I;
        c0356j.f4356J = c0356j2.f4356J;
        c0356j.f4357K = c0356j2.f4357K;
        c0356j.f4358L = c0356j2.f4358L;
        c0356j.f4359M = c0356j2.f4359M;
        c0356j.f4360N = c0356j2.f4360N;
        c0356j.f4361O = c0356j2.f4361O;
        c0356j.f4362P = c0356j2.f4362P;
        c0356j.f4363Q = c0356j2.f4363Q;
        c0356j.f4364R = c0356j2.f4364R;
        c0356j.f4365S = c0356j2.f4365S;
        c0356j.f4366T = c0356j2.f4366T;
        c0356j.f4367U = c0356j2.f4367U;
        c0356j.f4368V = c0356j2.f4368V;
        c0356j.f4369W = c0356j2.f4369W;
        c0356j.f4370X = c0356j2.f4370X;
        c0356j.f4371Y = c0356j2.f4371Y;
        c0356j.f4372Z = c0356j2.f4372Z;
        c0356j.f4374a0 = c0356j2.f4374a0;
        c0356j.f4376b0 = c0356j2.f4376b0;
        c0356j.f4378c0 = c0356j2.f4378c0;
        c0356j.f4380d0 = c0356j2.f4380d0;
        c0356j.f4382e0 = c0356j2.f4382e0;
        c0356j.f4384f0 = c0356j2.f4384f0;
        c0356j.f4386g0 = c0356j2.f4386g0;
        c0356j.f4387h0 = c0356j2.f4387h0;
        c0356j.f4391k0 = c0356j2.f4391k0;
        int[] iArr = c0356j2.i0;
        if (iArr == null || c0356j2.f4389j0 != null) {
            c0356j.i0 = null;
        } else {
            c0356j.i0 = Arrays.copyOf(iArr, iArr.length);
        }
        c0356j.f4389j0 = c0356j2.f4389j0;
        c0356j.f4393l0 = c0356j2.f4393l0;
        c0356j.m0 = c0356j2.m0;
        c0356j.f4396n0 = c0356j2.f4396n0;
        c0356j.f4398o0 = c0356j2.f4398o0;
        k kVar = c0355i.f4343c;
        kVar.getClass();
        k kVar2 = this.f4343c;
        kVar2.getClass();
        kVar.f4411a = kVar2.f4411a;
        kVar.f4413c = kVar2.f4413c;
        kVar.f4415e = kVar2.f4415e;
        kVar.f4414d = kVar2.f4414d;
        l lVar = c0355i.f4342b;
        l lVar2 = this.f4342b;
        lVar.f4418a = lVar2.f4418a;
        lVar.f4420c = lVar2.f4420c;
        lVar.f4421d = lVar2.f4421d;
        lVar.f4419b = lVar2.f4419b;
        m mVar = c0355i.f4345e;
        mVar.getClass();
        m mVar2 = this.f4345e;
        mVar2.getClass();
        mVar.f4423a = mVar2.f4423a;
        mVar.f4424b = mVar2.f4424b;
        mVar.f4425c = mVar2.f4425c;
        mVar.f4426d = mVar2.f4426d;
        mVar.f4427e = mVar2.f4427e;
        mVar.f4428f = mVar2.f4428f;
        mVar.f4429g = mVar2.f4429g;
        mVar.h = mVar2.h;
        mVar.i = mVar2.i;
        mVar.f4430j = mVar2.f4430j;
        mVar.f4431k = mVar2.f4431k;
        mVar.f4432l = mVar2.f4432l;
        mVar.f4433m = mVar2.f4433m;
        c0355i.f4341a = this.f4341a;
        return c0355i;
    }
}
