package v;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: v.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0314i {

    /* renamed from: a, reason: collision with root package name */
    public int f4063a;

    /* renamed from: b, reason: collision with root package name */
    public final l f4064b;

    /* renamed from: c, reason: collision with root package name */
    public final k f4065c;
    public final C0315j d;

    /* renamed from: e, reason: collision with root package name */
    public final m f4066e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f4067f;

    public C0314i() {
        l lVar = new l();
        lVar.f4137a = 0;
        lVar.f4138b = 0;
        lVar.f4139c = 1.0f;
        lVar.d = Float.NaN;
        this.f4064b = lVar;
        k kVar = new k();
        kVar.f4131a = -1;
        kVar.f4132b = 0;
        kVar.f4133c = -1;
        kVar.d = Float.NaN;
        kVar.f4134e = Float.NaN;
        kVar.f4135f = Float.NaN;
        kVar.f4136g = -1;
        kVar.h = null;
        kVar.i = -1;
        this.f4065c = kVar;
        C0315j c0315j = new C0315j();
        c0315j.f4094a = false;
        c0315j.d = -1;
        c0315j.f4101e = -1;
        c0315j.f4103f = -1.0f;
        c0315j.f4105g = true;
        c0315j.h = -1;
        c0315j.i = -1;
        c0315j.f4109j = -1;
        c0315j.f4110k = -1;
        c0315j.f4112l = -1;
        c0315j.f4114m = -1;
        c0315j.f4116n = -1;
        c0315j.f4117o = -1;
        c0315j.f4119p = -1;
        c0315j.f4120q = -1;
        c0315j.f4121r = -1;
        c0315j.f4122s = -1;
        c0315j.f4123t = -1;
        c0315j.f4124u = -1;
        c0315j.f4125v = -1;
        c0315j.f4126w = 0.5f;
        c0315j.f4127x = 0.5f;
        c0315j.f4128y = null;
        c0315j.f4129z = -1;
        c0315j.f4069A = 0;
        c0315j.f4070B = 0.0f;
        c0315j.f4071C = -1;
        c0315j.f4072D = -1;
        c0315j.f4073E = -1;
        c0315j.F = 0;
        c0315j.f4074G = 0;
        c0315j.f4075H = 0;
        c0315j.f4076I = 0;
        c0315j.f4077J = 0;
        c0315j.f4078K = 0;
        c0315j.f4079L = 0;
        c0315j.f4080M = Integer.MIN_VALUE;
        c0315j.f4081N = Integer.MIN_VALUE;
        c0315j.f4082O = Integer.MIN_VALUE;
        c0315j.f4083P = Integer.MIN_VALUE;
        c0315j.f4084Q = Integer.MIN_VALUE;
        c0315j.f4085R = Integer.MIN_VALUE;
        c0315j.f4086S = Integer.MIN_VALUE;
        c0315j.f4087T = -1.0f;
        c0315j.f4088U = -1.0f;
        c0315j.f4089V = 0;
        c0315j.f4090W = 0;
        c0315j.f4091X = 0;
        c0315j.f4092Y = 0;
        c0315j.f4093Z = 0;
        c0315j.f4095a0 = 0;
        c0315j.f4097b0 = 0;
        c0315j.f4099c0 = 0;
        c0315j.f4100d0 = 1.0f;
        c0315j.f4102e0 = 1.0f;
        c0315j.f4104f0 = -1;
        c0315j.f4106g0 = 0;
        c0315j.f4107h0 = -1;
        c0315j.f4113l0 = false;
        c0315j.f4115m0 = false;
        c0315j.n0 = true;
        c0315j.f4118o0 = 0;
        this.d = c0315j;
        m mVar = new m();
        mVar.f4141a = 0.0f;
        mVar.f4142b = 0.0f;
        mVar.f4143c = 0.0f;
        mVar.d = 1.0f;
        mVar.f4144e = 1.0f;
        mVar.f4145f = Float.NaN;
        mVar.f4146g = Float.NaN;
        mVar.h = -1;
        mVar.i = 0.0f;
        mVar.f4147j = 0.0f;
        mVar.f4148k = 0.0f;
        mVar.f4149l = false;
        mVar.f4150m = 0.0f;
        this.f4066e = mVar;
        this.f4067f = new HashMap();
    }

    public final void a(C0310e c0310e) {
        C0315j c0315j = this.d;
        c0310e.f4014e = c0315j.h;
        c0310e.f4016f = c0315j.i;
        c0310e.f4018g = c0315j.f4109j;
        c0310e.h = c0315j.f4110k;
        c0310e.i = c0315j.f4112l;
        c0310e.f4022j = c0315j.f4114m;
        c0310e.f4023k = c0315j.f4116n;
        c0310e.f4025l = c0315j.f4117o;
        c0310e.f4027m = c0315j.f4119p;
        c0310e.f4029n = c0315j.f4120q;
        c0310e.f4030o = c0315j.f4121r;
        c0310e.f4036s = c0315j.f4122s;
        c0310e.f4037t = c0315j.f4123t;
        c0310e.f4038u = c0315j.f4124u;
        c0310e.f4039v = c0315j.f4125v;
        ((ViewGroup.MarginLayoutParams) c0310e).leftMargin = c0315j.F;
        ((ViewGroup.MarginLayoutParams) c0310e).rightMargin = c0315j.f4074G;
        ((ViewGroup.MarginLayoutParams) c0310e).topMargin = c0315j.f4075H;
        ((ViewGroup.MarginLayoutParams) c0310e).bottomMargin = c0315j.f4076I;
        c0310e.f3982A = c0315j.f4085R;
        c0310e.f3983B = c0315j.f4084Q;
        c0310e.f4041x = c0315j.f4081N;
        c0310e.f4043z = c0315j.f4083P;
        c0310e.f3986E = c0315j.f4126w;
        c0310e.F = c0315j.f4127x;
        c0310e.f4032p = c0315j.f4129z;
        c0310e.f4034q = c0315j.f4069A;
        c0310e.f4035r = c0315j.f4070B;
        c0310e.f3987G = c0315j.f4128y;
        c0310e.f4000T = c0315j.f4071C;
        c0310e.f4001U = c0315j.f4072D;
        c0310e.f3989I = c0315j.f4087T;
        c0310e.f3988H = c0315j.f4088U;
        c0310e.f3991K = c0315j.f4090W;
        c0310e.f3990J = c0315j.f4089V;
        c0310e.f4003W = c0315j.f4113l0;
        c0310e.f4004X = c0315j.f4115m0;
        c0310e.f3992L = c0315j.f4091X;
        c0310e.f3993M = c0315j.f4092Y;
        c0310e.f3996P = c0315j.f4093Z;
        c0310e.f3997Q = c0315j.f4095a0;
        c0310e.f3994N = c0315j.f4097b0;
        c0310e.f3995O = c0315j.f4099c0;
        c0310e.f3998R = c0315j.f4100d0;
        c0310e.f3999S = c0315j.f4102e0;
        c0310e.f4002V = c0315j.f4073E;
        c0310e.f4011c = c0315j.f4103f;
        c0310e.f4007a = c0315j.d;
        c0310e.f4009b = c0315j.f4101e;
        ((ViewGroup.MarginLayoutParams) c0310e).width = c0315j.f4096b;
        ((ViewGroup.MarginLayoutParams) c0310e).height = c0315j.f4098c;
        String str = c0315j.f4111k0;
        if (str != null) {
            c0310e.f4005Y = str;
        }
        c0310e.f4006Z = c0315j.f4118o0;
        c0310e.setMarginStart(c0315j.f4078K);
        c0310e.setMarginEnd(c0315j.f4077J);
        c0310e.a();
    }

    public final Object clone() {
        C0314i c0314i = new C0314i();
        C0315j c0315j = c0314i.d;
        c0315j.getClass();
        C0315j c0315j2 = this.d;
        c0315j.f4094a = c0315j2.f4094a;
        c0315j.f4096b = c0315j2.f4096b;
        c0315j.f4098c = c0315j2.f4098c;
        c0315j.d = c0315j2.d;
        c0315j.f4101e = c0315j2.f4101e;
        c0315j.f4103f = c0315j2.f4103f;
        c0315j.f4105g = c0315j2.f4105g;
        c0315j.h = c0315j2.h;
        c0315j.i = c0315j2.i;
        c0315j.f4109j = c0315j2.f4109j;
        c0315j.f4110k = c0315j2.f4110k;
        c0315j.f4112l = c0315j2.f4112l;
        c0315j.f4114m = c0315j2.f4114m;
        c0315j.f4116n = c0315j2.f4116n;
        c0315j.f4117o = c0315j2.f4117o;
        c0315j.f4119p = c0315j2.f4119p;
        c0315j.f4120q = c0315j2.f4120q;
        c0315j.f4121r = c0315j2.f4121r;
        c0315j.f4122s = c0315j2.f4122s;
        c0315j.f4123t = c0315j2.f4123t;
        c0315j.f4124u = c0315j2.f4124u;
        c0315j.f4125v = c0315j2.f4125v;
        c0315j.f4126w = c0315j2.f4126w;
        c0315j.f4127x = c0315j2.f4127x;
        c0315j.f4128y = c0315j2.f4128y;
        c0315j.f4129z = c0315j2.f4129z;
        c0315j.f4069A = c0315j2.f4069A;
        c0315j.f4070B = c0315j2.f4070B;
        c0315j.f4071C = c0315j2.f4071C;
        c0315j.f4072D = c0315j2.f4072D;
        c0315j.f4073E = c0315j2.f4073E;
        c0315j.F = c0315j2.F;
        c0315j.f4074G = c0315j2.f4074G;
        c0315j.f4075H = c0315j2.f4075H;
        c0315j.f4076I = c0315j2.f4076I;
        c0315j.f4077J = c0315j2.f4077J;
        c0315j.f4078K = c0315j2.f4078K;
        c0315j.f4079L = c0315j2.f4079L;
        c0315j.f4080M = c0315j2.f4080M;
        c0315j.f4081N = c0315j2.f4081N;
        c0315j.f4082O = c0315j2.f4082O;
        c0315j.f4083P = c0315j2.f4083P;
        c0315j.f4084Q = c0315j2.f4084Q;
        c0315j.f4085R = c0315j2.f4085R;
        c0315j.f4086S = c0315j2.f4086S;
        c0315j.f4087T = c0315j2.f4087T;
        c0315j.f4088U = c0315j2.f4088U;
        c0315j.f4089V = c0315j2.f4089V;
        c0315j.f4090W = c0315j2.f4090W;
        c0315j.f4091X = c0315j2.f4091X;
        c0315j.f4092Y = c0315j2.f4092Y;
        c0315j.f4093Z = c0315j2.f4093Z;
        c0315j.f4095a0 = c0315j2.f4095a0;
        c0315j.f4097b0 = c0315j2.f4097b0;
        c0315j.f4099c0 = c0315j2.f4099c0;
        c0315j.f4100d0 = c0315j2.f4100d0;
        c0315j.f4102e0 = c0315j2.f4102e0;
        c0315j.f4104f0 = c0315j2.f4104f0;
        c0315j.f4106g0 = c0315j2.f4106g0;
        c0315j.f4107h0 = c0315j2.f4107h0;
        c0315j.f4111k0 = c0315j2.f4111k0;
        int[] iArr = c0315j2.f4108i0;
        if (iArr == null || c0315j2.j0 != null) {
            c0315j.f4108i0 = null;
        } else {
            c0315j.f4108i0 = Arrays.copyOf(iArr, iArr.length);
        }
        c0315j.j0 = c0315j2.j0;
        c0315j.f4113l0 = c0315j2.f4113l0;
        c0315j.f4115m0 = c0315j2.f4115m0;
        c0315j.n0 = c0315j2.n0;
        c0315j.f4118o0 = c0315j2.f4118o0;
        k kVar = c0314i.f4065c;
        kVar.getClass();
        k kVar2 = this.f4065c;
        kVar2.getClass();
        kVar.f4131a = kVar2.f4131a;
        kVar.f4133c = kVar2.f4133c;
        kVar.f4134e = kVar2.f4134e;
        kVar.d = kVar2.d;
        l lVar = c0314i.f4064b;
        l lVar2 = this.f4064b;
        lVar.f4137a = lVar2.f4137a;
        lVar.f4139c = lVar2.f4139c;
        lVar.d = lVar2.d;
        lVar.f4138b = lVar2.f4138b;
        m mVar = c0314i.f4066e;
        mVar.getClass();
        m mVar2 = this.f4066e;
        mVar2.getClass();
        mVar.f4141a = mVar2.f4141a;
        mVar.f4142b = mVar2.f4142b;
        mVar.f4143c = mVar2.f4143c;
        mVar.d = mVar2.d;
        mVar.f4144e = mVar2.f4144e;
        mVar.f4145f = mVar2.f4145f;
        mVar.f4146g = mVar2.f4146g;
        mVar.h = mVar2.h;
        mVar.i = mVar2.i;
        mVar.f4147j = mVar2.f4147j;
        mVar.f4148k = mVar2.f4148k;
        mVar.f4149l = mVar2.f4149l;
        mVar.f4150m = mVar2.f4150m;
        c0314i.f4063a = this.f4063a;
        return c0314i;
    }
}
