package x;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: x.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0309j {

    /* renamed from: a, reason: collision with root package name */
    public int f4047a;

    /* renamed from: b, reason: collision with root package name */
    public final m f4048b;

    /* renamed from: c, reason: collision with root package name */
    public final l f4049c;
    public final k d;

    /* renamed from: e, reason: collision with root package name */
    public final n f4050e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f4051f;

    public C0309j() {
        m mVar = new m();
        mVar.f4122a = 0;
        mVar.f4123b = 0;
        mVar.f4124c = 1.0f;
        mVar.d = Float.NaN;
        this.f4048b = mVar;
        l lVar = new l();
        lVar.f4116a = -1;
        lVar.f4117b = 0;
        lVar.f4118c = -1;
        lVar.d = Float.NaN;
        lVar.f4119e = Float.NaN;
        lVar.f4120f = Float.NaN;
        lVar.f4121g = -1;
        lVar.h = null;
        lVar.i = -1;
        this.f4049c = lVar;
        k kVar = new k();
        kVar.f4077a = false;
        kVar.d = -1;
        kVar.f4084e = -1;
        kVar.f4086f = -1.0f;
        kVar.f4088g = true;
        kVar.h = -1;
        kVar.i = -1;
        kVar.f4092j = -1;
        kVar.f4094k = -1;
        kVar.f4096l = -1;
        kVar.f4098m = -1;
        kVar.f4100n = -1;
        kVar.f4102o = -1;
        kVar.f4104p = -1;
        kVar.f4105q = -1;
        kVar.f4106r = -1;
        kVar.f4107s = -1;
        kVar.f4108t = -1;
        kVar.f4109u = -1;
        kVar.f4110v = -1;
        kVar.f4111w = 0.5f;
        kVar.f4112x = 0.5f;
        kVar.f4113y = null;
        kVar.f4114z = -1;
        kVar.f4052A = 0;
        kVar.f4053B = 0.0f;
        kVar.f4054C = -1;
        kVar.f4055D = -1;
        kVar.f4056E = -1;
        kVar.f4057F = 0;
        kVar.f4058G = 0;
        kVar.H = 0;
        kVar.f4059I = 0;
        kVar.f4060J = 0;
        kVar.f4061K = 0;
        kVar.f4062L = 0;
        kVar.f4063M = Integer.MIN_VALUE;
        kVar.f4064N = Integer.MIN_VALUE;
        kVar.f4065O = Integer.MIN_VALUE;
        kVar.f4066P = Integer.MIN_VALUE;
        kVar.f4067Q = Integer.MIN_VALUE;
        kVar.f4068R = Integer.MIN_VALUE;
        kVar.f4069S = Integer.MIN_VALUE;
        kVar.f4070T = -1.0f;
        kVar.f4071U = -1.0f;
        kVar.f4072V = 0;
        kVar.f4073W = 0;
        kVar.f4074X = 0;
        kVar.f4075Y = 0;
        kVar.f4076Z = 0;
        kVar.f4078a0 = 0;
        kVar.f4080b0 = 0;
        kVar.f4082c0 = 0;
        kVar.f4083d0 = 1.0f;
        kVar.f4085e0 = 1.0f;
        kVar.f4087f0 = -1;
        kVar.f4089g0 = 0;
        kVar.f4090h0 = -1;
        kVar.f4097l0 = false;
        kVar.f4099m0 = false;
        kVar.f4101n0 = true;
        kVar.f4103o0 = 0;
        this.d = kVar;
        n nVar = new n();
        nVar.f4126a = 0.0f;
        nVar.f4127b = 0.0f;
        nVar.f4128c = 0.0f;
        nVar.d = 1.0f;
        nVar.f4129e = 1.0f;
        nVar.f4130f = Float.NaN;
        nVar.f4131g = Float.NaN;
        nVar.h = -1;
        nVar.i = 0.0f;
        nVar.f4132j = 0.0f;
        nVar.f4133k = 0.0f;
        nVar.f4134l = false;
        nVar.f4135m = 0.0f;
        this.f4050e = nVar;
        this.f4051f = new HashMap();
    }

    public final void a(C0304e c0304e) {
        k kVar = this.d;
        c0304e.f3994e = kVar.h;
        c0304e.f3996f = kVar.i;
        c0304e.f3998g = kVar.f4092j;
        c0304e.h = kVar.f4094k;
        c0304e.i = kVar.f4096l;
        c0304e.f4002j = kVar.f4098m;
        c0304e.f4004k = kVar.f4100n;
        c0304e.f4006l = kVar.f4102o;
        c0304e.f4008m = kVar.f4104p;
        c0304e.f4010n = kVar.f4105q;
        c0304e.f4012o = kVar.f4106r;
        c0304e.f4017s = kVar.f4107s;
        c0304e.f4018t = kVar.f4108t;
        c0304e.f4019u = kVar.f4109u;
        c0304e.f4020v = kVar.f4110v;
        ((ViewGroup.MarginLayoutParams) c0304e).leftMargin = kVar.f4057F;
        ((ViewGroup.MarginLayoutParams) c0304e).rightMargin = kVar.f4058G;
        ((ViewGroup.MarginLayoutParams) c0304e).topMargin = kVar.H;
        ((ViewGroup.MarginLayoutParams) c0304e).bottomMargin = kVar.f4059I;
        c0304e.f3962A = kVar.f4068R;
        c0304e.f3963B = kVar.f4067Q;
        c0304e.f4022x = kVar.f4064N;
        c0304e.f4024z = kVar.f4066P;
        c0304e.f3966E = kVar.f4111w;
        c0304e.f3967F = kVar.f4112x;
        c0304e.f4014p = kVar.f4114z;
        c0304e.f4015q = kVar.f4052A;
        c0304e.f4016r = kVar.f4053B;
        c0304e.f3968G = kVar.f4113y;
        c0304e.f3980T = kVar.f4054C;
        c0304e.f3981U = kVar.f4055D;
        c0304e.f3969I = kVar.f4070T;
        c0304e.H = kVar.f4071U;
        c0304e.f3971K = kVar.f4073W;
        c0304e.f3970J = kVar.f4072V;
        c0304e.f3983W = kVar.f4097l0;
        c0304e.f3984X = kVar.f4099m0;
        c0304e.f3972L = kVar.f4074X;
        c0304e.f3973M = kVar.f4075Y;
        c0304e.f3976P = kVar.f4076Z;
        c0304e.f3977Q = kVar.f4078a0;
        c0304e.f3974N = kVar.f4080b0;
        c0304e.f3975O = kVar.f4082c0;
        c0304e.f3978R = kVar.f4083d0;
        c0304e.f3979S = kVar.f4085e0;
        c0304e.f3982V = kVar.f4056E;
        c0304e.f3991c = kVar.f4086f;
        c0304e.f3987a = kVar.d;
        c0304e.f3989b = kVar.f4084e;
        ((ViewGroup.MarginLayoutParams) c0304e).width = kVar.f4079b;
        ((ViewGroup.MarginLayoutParams) c0304e).height = kVar.f4081c;
        String str = kVar.f4095k0;
        if (str != null) {
            c0304e.f3985Y = str;
        }
        c0304e.f3986Z = kVar.f4103o0;
        c0304e.setMarginStart(kVar.f4061K);
        c0304e.setMarginEnd(kVar.f4060J);
        c0304e.a();
    }

    public final Object clone() {
        C0309j c0309j = new C0309j();
        k kVar = c0309j.d;
        kVar.getClass();
        k kVar2 = this.d;
        kVar.f4077a = kVar2.f4077a;
        kVar.f4079b = kVar2.f4079b;
        kVar.f4081c = kVar2.f4081c;
        kVar.d = kVar2.d;
        kVar.f4084e = kVar2.f4084e;
        kVar.f4086f = kVar2.f4086f;
        kVar.f4088g = kVar2.f4088g;
        kVar.h = kVar2.h;
        kVar.i = kVar2.i;
        kVar.f4092j = kVar2.f4092j;
        kVar.f4094k = kVar2.f4094k;
        kVar.f4096l = kVar2.f4096l;
        kVar.f4098m = kVar2.f4098m;
        kVar.f4100n = kVar2.f4100n;
        kVar.f4102o = kVar2.f4102o;
        kVar.f4104p = kVar2.f4104p;
        kVar.f4105q = kVar2.f4105q;
        kVar.f4106r = kVar2.f4106r;
        kVar.f4107s = kVar2.f4107s;
        kVar.f4108t = kVar2.f4108t;
        kVar.f4109u = kVar2.f4109u;
        kVar.f4110v = kVar2.f4110v;
        kVar.f4111w = kVar2.f4111w;
        kVar.f4112x = kVar2.f4112x;
        kVar.f4113y = kVar2.f4113y;
        kVar.f4114z = kVar2.f4114z;
        kVar.f4052A = kVar2.f4052A;
        kVar.f4053B = kVar2.f4053B;
        kVar.f4054C = kVar2.f4054C;
        kVar.f4055D = kVar2.f4055D;
        kVar.f4056E = kVar2.f4056E;
        kVar.f4057F = kVar2.f4057F;
        kVar.f4058G = kVar2.f4058G;
        kVar.H = kVar2.H;
        kVar.f4059I = kVar2.f4059I;
        kVar.f4060J = kVar2.f4060J;
        kVar.f4061K = kVar2.f4061K;
        kVar.f4062L = kVar2.f4062L;
        kVar.f4063M = kVar2.f4063M;
        kVar.f4064N = kVar2.f4064N;
        kVar.f4065O = kVar2.f4065O;
        kVar.f4066P = kVar2.f4066P;
        kVar.f4067Q = kVar2.f4067Q;
        kVar.f4068R = kVar2.f4068R;
        kVar.f4069S = kVar2.f4069S;
        kVar.f4070T = kVar2.f4070T;
        kVar.f4071U = kVar2.f4071U;
        kVar.f4072V = kVar2.f4072V;
        kVar.f4073W = kVar2.f4073W;
        kVar.f4074X = kVar2.f4074X;
        kVar.f4075Y = kVar2.f4075Y;
        kVar.f4076Z = kVar2.f4076Z;
        kVar.f4078a0 = kVar2.f4078a0;
        kVar.f4080b0 = kVar2.f4080b0;
        kVar.f4082c0 = kVar2.f4082c0;
        kVar.f4083d0 = kVar2.f4083d0;
        kVar.f4085e0 = kVar2.f4085e0;
        kVar.f4087f0 = kVar2.f4087f0;
        kVar.f4089g0 = kVar2.f4089g0;
        kVar.f4090h0 = kVar2.f4090h0;
        kVar.f4095k0 = kVar2.f4095k0;
        int[] iArr = kVar2.f4091i0;
        if (iArr == null || kVar2.f4093j0 != null) {
            kVar.f4091i0 = null;
        } else {
            kVar.f4091i0 = Arrays.copyOf(iArr, iArr.length);
        }
        kVar.f4093j0 = kVar2.f4093j0;
        kVar.f4097l0 = kVar2.f4097l0;
        kVar.f4099m0 = kVar2.f4099m0;
        kVar.f4101n0 = kVar2.f4101n0;
        kVar.f4103o0 = kVar2.f4103o0;
        l lVar = c0309j.f4049c;
        lVar.getClass();
        l lVar2 = this.f4049c;
        lVar2.getClass();
        lVar.f4116a = lVar2.f4116a;
        lVar.f4118c = lVar2.f4118c;
        lVar.f4119e = lVar2.f4119e;
        lVar.d = lVar2.d;
        m mVar = c0309j.f4048b;
        m mVar2 = this.f4048b;
        mVar.f4122a = mVar2.f4122a;
        mVar.f4124c = mVar2.f4124c;
        mVar.d = mVar2.d;
        mVar.f4123b = mVar2.f4123b;
        n nVar = c0309j.f4050e;
        nVar.getClass();
        n nVar2 = this.f4050e;
        nVar2.getClass();
        nVar.f4126a = nVar2.f4126a;
        nVar.f4127b = nVar2.f4127b;
        nVar.f4128c = nVar2.f4128c;
        nVar.d = nVar2.d;
        nVar.f4129e = nVar2.f4129e;
        nVar.f4130f = nVar2.f4130f;
        nVar.f4131g = nVar2.f4131g;
        nVar.h = nVar2.h;
        nVar.i = nVar2.i;
        nVar.f4132j = nVar2.f4132j;
        nVar.f4133k = nVar2.f4133k;
        nVar.f4134l = nVar2.f4134l;
        nVar.f4135m = nVar2.f4135m;
        c0309j.f4047a = this.f4047a;
        return c0309j;
    }
}
