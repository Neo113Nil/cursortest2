package v;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: v.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0353i {

    /* renamed from: a, reason: collision with root package name */
    public int f4337a;

    /* renamed from: b, reason: collision with root package name */
    public final l f4338b;

    /* renamed from: c, reason: collision with root package name */
    public final k f4339c;

    /* renamed from: d, reason: collision with root package name */
    public final C0354j f4340d;

    /* renamed from: e, reason: collision with root package name */
    public final m f4341e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f4342f;

    public C0353i() {
        l lVar = new l();
        lVar.f4414a = 0;
        lVar.f4415b = 0;
        lVar.f4416c = 1.0f;
        lVar.f4417d = Float.NaN;
        this.f4338b = lVar;
        k kVar = new k();
        kVar.f4407a = -1;
        kVar.f4408b = 0;
        kVar.f4409c = -1;
        kVar.f4410d = Float.NaN;
        kVar.f4411e = Float.NaN;
        kVar.f4412f = Float.NaN;
        kVar.f4413g = -1;
        kVar.h = null;
        kVar.i = -1;
        this.f4339c = kVar;
        C0354j c0354j = new C0354j();
        c0354j.f4369a = false;
        c0354j.f4375d = -1;
        c0354j.f4377e = -1;
        c0354j.f4379f = -1.0f;
        c0354j.f4381g = true;
        c0354j.h = -1;
        c0354j.i = -1;
        c0354j.f4384j = -1;
        c0354j.f4386k = -1;
        c0354j.f4388l = -1;
        c0354j.f4390m = -1;
        c0354j.f4391n = -1;
        c0354j.f4393o = -1;
        c0354j.f4395p = -1;
        c0354j.f4396q = -1;
        c0354j.f4397r = -1;
        c0354j.f4398s = -1;
        c0354j.f4399t = -1;
        c0354j.f4400u = -1;
        c0354j.f4401v = -1;
        c0354j.f4402w = 0.5f;
        c0354j.f4403x = 0.5f;
        c0354j.f4404y = null;
        c0354j.f4405z = -1;
        c0354j.f4344A = 0;
        c0354j.f4345B = 0.0f;
        c0354j.f4346C = -1;
        c0354j.f4347D = -1;
        c0354j.f4348E = -1;
        c0354j.F = 0;
        c0354j.f4349G = 0;
        c0354j.f4350H = 0;
        c0354j.f4351I = 0;
        c0354j.f4352J = 0;
        c0354j.f4353K = 0;
        c0354j.f4354L = 0;
        c0354j.f4355M = Integer.MIN_VALUE;
        c0354j.f4356N = Integer.MIN_VALUE;
        c0354j.f4357O = Integer.MIN_VALUE;
        c0354j.f4358P = Integer.MIN_VALUE;
        c0354j.f4359Q = Integer.MIN_VALUE;
        c0354j.f4360R = Integer.MIN_VALUE;
        c0354j.f4361S = Integer.MIN_VALUE;
        c0354j.f4362T = -1.0f;
        c0354j.f4363U = -1.0f;
        c0354j.f4364V = 0;
        c0354j.f4365W = 0;
        c0354j.f4366X = 0;
        c0354j.f4367Y = 0;
        c0354j.f4368Z = 0;
        c0354j.f4370a0 = 0;
        c0354j.f4372b0 = 0;
        c0354j.f4374c0 = 0;
        c0354j.f4376d0 = 1.0f;
        c0354j.f4378e0 = 1.0f;
        c0354j.f4380f0 = -1;
        c0354j.f4382g0 = 0;
        c0354j.f4383h0 = -1;
        c0354j.f4389l0 = false;
        c0354j.m0 = false;
        c0354j.f4392n0 = true;
        c0354j.f4394o0 = 0;
        this.f4340d = c0354j;
        m mVar = new m();
        mVar.f4419a = 0.0f;
        mVar.f4420b = 0.0f;
        mVar.f4421c = 0.0f;
        mVar.f4422d = 1.0f;
        mVar.f4423e = 1.0f;
        mVar.f4424f = Float.NaN;
        mVar.f4425g = Float.NaN;
        mVar.h = -1;
        mVar.i = 0.0f;
        mVar.f4426j = 0.0f;
        mVar.f4427k = 0.0f;
        mVar.f4428l = false;
        mVar.f4429m = 0.0f;
        this.f4341e = mVar;
        this.f4342f = new HashMap();
    }

    public final void a(C0349e c0349e) {
        C0354j c0354j = this.f4340d;
        c0349e.f4285e = c0354j.h;
        c0349e.f4287f = c0354j.i;
        c0349e.f4289g = c0354j.f4384j;
        c0349e.h = c0354j.f4386k;
        c0349e.i = c0354j.f4388l;
        c0349e.f4292j = c0354j.f4390m;
        c0349e.f4294k = c0354j.f4391n;
        c0349e.f4296l = c0354j.f4393o;
        c0349e.f4298m = c0354j.f4395p;
        c0349e.f4299n = c0354j.f4396q;
        c0349e.f4301o = c0354j.f4397r;
        c0349e.f4307s = c0354j.f4398s;
        c0349e.f4308t = c0354j.f4399t;
        c0349e.f4309u = c0354j.f4400u;
        c0349e.f4310v = c0354j.f4401v;
        ((ViewGroup.MarginLayoutParams) c0349e).leftMargin = c0354j.F;
        ((ViewGroup.MarginLayoutParams) c0349e).rightMargin = c0354j.f4349G;
        ((ViewGroup.MarginLayoutParams) c0349e).topMargin = c0354j.f4350H;
        ((ViewGroup.MarginLayoutParams) c0349e).bottomMargin = c0354j.f4351I;
        c0349e.f4252A = c0354j.f4360R;
        c0349e.f4253B = c0354j.f4359Q;
        c0349e.f4312x = c0354j.f4356N;
        c0349e.f4314z = c0354j.f4358P;
        c0349e.f4256E = c0354j.f4402w;
        c0349e.F = c0354j.f4403x;
        c0349e.f4303p = c0354j.f4405z;
        c0349e.f4305q = c0354j.f4344A;
        c0349e.f4306r = c0354j.f4345B;
        c0349e.f4257G = c0354j.f4404y;
        c0349e.f4270T = c0354j.f4346C;
        c0349e.f4271U = c0354j.f4347D;
        c0349e.f4259I = c0354j.f4362T;
        c0349e.f4258H = c0354j.f4363U;
        c0349e.f4261K = c0354j.f4365W;
        c0349e.f4260J = c0354j.f4364V;
        c0349e.f4273W = c0354j.f4389l0;
        c0349e.f4274X = c0354j.m0;
        c0349e.f4262L = c0354j.f4366X;
        c0349e.f4263M = c0354j.f4367Y;
        c0349e.f4266P = c0354j.f4368Z;
        c0349e.f4267Q = c0354j.f4370a0;
        c0349e.f4264N = c0354j.f4372b0;
        c0349e.f4265O = c0354j.f4374c0;
        c0349e.f4268R = c0354j.f4376d0;
        c0349e.f4269S = c0354j.f4378e0;
        c0349e.f4272V = c0354j.f4348E;
        c0349e.f4281c = c0354j.f4379f;
        c0349e.f4277a = c0354j.f4375d;
        c0349e.f4279b = c0354j.f4377e;
        ((ViewGroup.MarginLayoutParams) c0349e).width = c0354j.f4371b;
        ((ViewGroup.MarginLayoutParams) c0349e).height = c0354j.f4373c;
        String str = c0354j.f4387k0;
        if (str != null) {
            c0349e.f4275Y = str;
        }
        c0349e.f4276Z = c0354j.f4394o0;
        c0349e.setMarginStart(c0354j.f4353K);
        c0349e.setMarginEnd(c0354j.f4352J);
        c0349e.a();
    }

    public final Object clone() {
        C0353i c0353i = new C0353i();
        C0354j c0354j = c0353i.f4340d;
        c0354j.getClass();
        C0354j c0354j2 = this.f4340d;
        c0354j.f4369a = c0354j2.f4369a;
        c0354j.f4371b = c0354j2.f4371b;
        c0354j.f4373c = c0354j2.f4373c;
        c0354j.f4375d = c0354j2.f4375d;
        c0354j.f4377e = c0354j2.f4377e;
        c0354j.f4379f = c0354j2.f4379f;
        c0354j.f4381g = c0354j2.f4381g;
        c0354j.h = c0354j2.h;
        c0354j.i = c0354j2.i;
        c0354j.f4384j = c0354j2.f4384j;
        c0354j.f4386k = c0354j2.f4386k;
        c0354j.f4388l = c0354j2.f4388l;
        c0354j.f4390m = c0354j2.f4390m;
        c0354j.f4391n = c0354j2.f4391n;
        c0354j.f4393o = c0354j2.f4393o;
        c0354j.f4395p = c0354j2.f4395p;
        c0354j.f4396q = c0354j2.f4396q;
        c0354j.f4397r = c0354j2.f4397r;
        c0354j.f4398s = c0354j2.f4398s;
        c0354j.f4399t = c0354j2.f4399t;
        c0354j.f4400u = c0354j2.f4400u;
        c0354j.f4401v = c0354j2.f4401v;
        c0354j.f4402w = c0354j2.f4402w;
        c0354j.f4403x = c0354j2.f4403x;
        c0354j.f4404y = c0354j2.f4404y;
        c0354j.f4405z = c0354j2.f4405z;
        c0354j.f4344A = c0354j2.f4344A;
        c0354j.f4345B = c0354j2.f4345B;
        c0354j.f4346C = c0354j2.f4346C;
        c0354j.f4347D = c0354j2.f4347D;
        c0354j.f4348E = c0354j2.f4348E;
        c0354j.F = c0354j2.F;
        c0354j.f4349G = c0354j2.f4349G;
        c0354j.f4350H = c0354j2.f4350H;
        c0354j.f4351I = c0354j2.f4351I;
        c0354j.f4352J = c0354j2.f4352J;
        c0354j.f4353K = c0354j2.f4353K;
        c0354j.f4354L = c0354j2.f4354L;
        c0354j.f4355M = c0354j2.f4355M;
        c0354j.f4356N = c0354j2.f4356N;
        c0354j.f4357O = c0354j2.f4357O;
        c0354j.f4358P = c0354j2.f4358P;
        c0354j.f4359Q = c0354j2.f4359Q;
        c0354j.f4360R = c0354j2.f4360R;
        c0354j.f4361S = c0354j2.f4361S;
        c0354j.f4362T = c0354j2.f4362T;
        c0354j.f4363U = c0354j2.f4363U;
        c0354j.f4364V = c0354j2.f4364V;
        c0354j.f4365W = c0354j2.f4365W;
        c0354j.f4366X = c0354j2.f4366X;
        c0354j.f4367Y = c0354j2.f4367Y;
        c0354j.f4368Z = c0354j2.f4368Z;
        c0354j.f4370a0 = c0354j2.f4370a0;
        c0354j.f4372b0 = c0354j2.f4372b0;
        c0354j.f4374c0 = c0354j2.f4374c0;
        c0354j.f4376d0 = c0354j2.f4376d0;
        c0354j.f4378e0 = c0354j2.f4378e0;
        c0354j.f4380f0 = c0354j2.f4380f0;
        c0354j.f4382g0 = c0354j2.f4382g0;
        c0354j.f4383h0 = c0354j2.f4383h0;
        c0354j.f4387k0 = c0354j2.f4387k0;
        int[] iArr = c0354j2.i0;
        if (iArr == null || c0354j2.f4385j0 != null) {
            c0354j.i0 = null;
        } else {
            c0354j.i0 = Arrays.copyOf(iArr, iArr.length);
        }
        c0354j.f4385j0 = c0354j2.f4385j0;
        c0354j.f4389l0 = c0354j2.f4389l0;
        c0354j.m0 = c0354j2.m0;
        c0354j.f4392n0 = c0354j2.f4392n0;
        c0354j.f4394o0 = c0354j2.f4394o0;
        k kVar = c0353i.f4339c;
        kVar.getClass();
        k kVar2 = this.f4339c;
        kVar2.getClass();
        kVar.f4407a = kVar2.f4407a;
        kVar.f4409c = kVar2.f4409c;
        kVar.f4411e = kVar2.f4411e;
        kVar.f4410d = kVar2.f4410d;
        l lVar = c0353i.f4338b;
        l lVar2 = this.f4338b;
        lVar.f4414a = lVar2.f4414a;
        lVar.f4416c = lVar2.f4416c;
        lVar.f4417d = lVar2.f4417d;
        lVar.f4415b = lVar2.f4415b;
        m mVar = c0353i.f4341e;
        mVar.getClass();
        m mVar2 = this.f4341e;
        mVar2.getClass();
        mVar.f4419a = mVar2.f4419a;
        mVar.f4420b = mVar2.f4420b;
        mVar.f4421c = mVar2.f4421c;
        mVar.f4422d = mVar2.f4422d;
        mVar.f4423e = mVar2.f4423e;
        mVar.f4424f = mVar2.f4424f;
        mVar.f4425g = mVar2.f4425g;
        mVar.h = mVar2.h;
        mVar.i = mVar2.i;
        mVar.f4426j = mVar2.f4426j;
        mVar.f4427k = mVar2.f4427k;
        mVar.f4428l = mVar2.f4428l;
        mVar.f4429m = mVar2.f4429m;
        c0353i.f4337a = this.f4337a;
        return c0353i;
    }
}
