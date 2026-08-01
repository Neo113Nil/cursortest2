package v;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: v.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0327i {

    /* renamed from: a, reason: collision with root package name */
    public int f4002a;

    /* renamed from: b, reason: collision with root package name */
    public final l f4003b;

    /* renamed from: c, reason: collision with root package name */
    public final k f4004c;
    public final C0328j d;

    /* renamed from: e, reason: collision with root package name */
    public final m f4005e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f4006f;

    public C0327i() {
        l lVar = new l();
        lVar.f4077a = 0;
        lVar.f4078b = 0;
        lVar.f4079c = 1.0f;
        lVar.d = Float.NaN;
        this.f4003b = lVar;
        k kVar = new k();
        kVar.f4071a = -1;
        kVar.f4072b = 0;
        kVar.f4073c = -1;
        kVar.d = Float.NaN;
        kVar.f4074e = Float.NaN;
        kVar.f4075f = Float.NaN;
        kVar.f4076g = -1;
        kVar.h = null;
        kVar.i = -1;
        this.f4004c = kVar;
        C0328j c0328j = new C0328j();
        c0328j.f4033a = false;
        c0328j.d = -1;
        c0328j.f4040e = -1;
        c0328j.f4042f = -1.0f;
        c0328j.f4044g = true;
        c0328j.h = -1;
        c0328j.i = -1;
        c0328j.f4048j = -1;
        c0328j.f4050k = -1;
        c0328j.f4052l = -1;
        c0328j.f4054m = -1;
        c0328j.f4056n = -1;
        c0328j.f4057o = -1;
        c0328j.f4059p = -1;
        c0328j.f4060q = -1;
        c0328j.f4061r = -1;
        c0328j.f4062s = -1;
        c0328j.f4063t = -1;
        c0328j.f4064u = -1;
        c0328j.f4065v = -1;
        c0328j.f4066w = 0.5f;
        c0328j.f4067x = 0.5f;
        c0328j.f4068y = null;
        c0328j.f4069z = -1;
        c0328j.f4008A = 0;
        c0328j.f4009B = 0.0f;
        c0328j.f4010C = -1;
        c0328j.f4011D = -1;
        c0328j.f4012E = -1;
        c0328j.F = 0;
        c0328j.f4013G = 0;
        c0328j.f4014H = 0;
        c0328j.f4015I = 0;
        c0328j.f4016J = 0;
        c0328j.f4017K = 0;
        c0328j.f4018L = 0;
        c0328j.f4019M = Integer.MIN_VALUE;
        c0328j.f4020N = Integer.MIN_VALUE;
        c0328j.f4021O = Integer.MIN_VALUE;
        c0328j.f4022P = Integer.MIN_VALUE;
        c0328j.f4023Q = Integer.MIN_VALUE;
        c0328j.f4024R = Integer.MIN_VALUE;
        c0328j.f4025S = Integer.MIN_VALUE;
        c0328j.f4026T = -1.0f;
        c0328j.f4027U = -1.0f;
        c0328j.f4028V = 0;
        c0328j.f4029W = 0;
        c0328j.f4030X = 0;
        c0328j.f4031Y = 0;
        c0328j.f4032Z = 0;
        c0328j.f4034a0 = 0;
        c0328j.f4036b0 = 0;
        c0328j.f4038c0 = 0;
        c0328j.f4039d0 = 1.0f;
        c0328j.f4041e0 = 1.0f;
        c0328j.f4043f0 = -1;
        c0328j.f4045g0 = 0;
        c0328j.f4046h0 = -1;
        c0328j.f4053l0 = false;
        c0328j.f4055m0 = false;
        c0328j.n0 = true;
        c0328j.f4058o0 = 0;
        this.d = c0328j;
        m mVar = new m();
        mVar.f4081a = 0.0f;
        mVar.f4082b = 0.0f;
        mVar.f4083c = 0.0f;
        mVar.d = 1.0f;
        mVar.f4084e = 1.0f;
        mVar.f4085f = Float.NaN;
        mVar.f4086g = Float.NaN;
        mVar.h = -1;
        mVar.i = 0.0f;
        mVar.f4087j = 0.0f;
        mVar.f4088k = 0.0f;
        mVar.f4089l = false;
        mVar.f4090m = 0.0f;
        this.f4005e = mVar;
        this.f4006f = new HashMap();
    }

    public final void a(C0323e c0323e) {
        C0328j c0328j = this.d;
        c0323e.f3952e = c0328j.h;
        c0323e.f3954f = c0328j.i;
        c0323e.f3956g = c0328j.f4048j;
        c0323e.h = c0328j.f4050k;
        c0323e.i = c0328j.f4052l;
        c0323e.f3960j = c0328j.f4054m;
        c0323e.f3962k = c0328j.f4056n;
        c0323e.f3964l = c0328j.f4057o;
        c0323e.f3966m = c0328j.f4059p;
        c0323e.f3968n = c0328j.f4060q;
        c0323e.f3969o = c0328j.f4061r;
        c0323e.f3975s = c0328j.f4062s;
        c0323e.f3976t = c0328j.f4063t;
        c0323e.f3977u = c0328j.f4064u;
        c0323e.f3978v = c0328j.f4065v;
        ((ViewGroup.MarginLayoutParams) c0323e).leftMargin = c0328j.F;
        ((ViewGroup.MarginLayoutParams) c0323e).rightMargin = c0328j.f4013G;
        ((ViewGroup.MarginLayoutParams) c0323e).topMargin = c0328j.f4014H;
        ((ViewGroup.MarginLayoutParams) c0323e).bottomMargin = c0328j.f4015I;
        c0323e.f3920A = c0328j.f4024R;
        c0323e.f3921B = c0328j.f4023Q;
        c0323e.f3980x = c0328j.f4020N;
        c0323e.f3982z = c0328j.f4022P;
        c0323e.f3924E = c0328j.f4066w;
        c0323e.F = c0328j.f4067x;
        c0323e.f3971p = c0328j.f4069z;
        c0323e.f3973q = c0328j.f4008A;
        c0323e.f3974r = c0328j.f4009B;
        c0323e.f3925G = c0328j.f4068y;
        c0323e.f3938T = c0328j.f4010C;
        c0323e.f3939U = c0328j.f4011D;
        c0323e.f3927I = c0328j.f4026T;
        c0323e.f3926H = c0328j.f4027U;
        c0323e.f3929K = c0328j.f4029W;
        c0323e.f3928J = c0328j.f4028V;
        c0323e.f3941W = c0328j.f4053l0;
        c0323e.f3942X = c0328j.f4055m0;
        c0323e.f3930L = c0328j.f4030X;
        c0323e.f3931M = c0328j.f4031Y;
        c0323e.f3934P = c0328j.f4032Z;
        c0323e.f3935Q = c0328j.f4034a0;
        c0323e.f3932N = c0328j.f4036b0;
        c0323e.f3933O = c0328j.f4038c0;
        c0323e.f3936R = c0328j.f4039d0;
        c0323e.f3937S = c0328j.f4041e0;
        c0323e.f3940V = c0328j.f4012E;
        c0323e.f3949c = c0328j.f4042f;
        c0323e.f3945a = c0328j.d;
        c0323e.f3947b = c0328j.f4040e;
        ((ViewGroup.MarginLayoutParams) c0323e).width = c0328j.f4035b;
        ((ViewGroup.MarginLayoutParams) c0323e).height = c0328j.f4037c;
        String str = c0328j.f4051k0;
        if (str != null) {
            c0323e.f3943Y = str;
        }
        c0323e.f3944Z = c0328j.f4058o0;
        c0323e.setMarginStart(c0328j.f4017K);
        c0323e.setMarginEnd(c0328j.f4016J);
        c0323e.a();
    }

    public final Object clone() {
        C0327i c0327i = new C0327i();
        C0328j c0328j = c0327i.d;
        c0328j.getClass();
        C0328j c0328j2 = this.d;
        c0328j.f4033a = c0328j2.f4033a;
        c0328j.f4035b = c0328j2.f4035b;
        c0328j.f4037c = c0328j2.f4037c;
        c0328j.d = c0328j2.d;
        c0328j.f4040e = c0328j2.f4040e;
        c0328j.f4042f = c0328j2.f4042f;
        c0328j.f4044g = c0328j2.f4044g;
        c0328j.h = c0328j2.h;
        c0328j.i = c0328j2.i;
        c0328j.f4048j = c0328j2.f4048j;
        c0328j.f4050k = c0328j2.f4050k;
        c0328j.f4052l = c0328j2.f4052l;
        c0328j.f4054m = c0328j2.f4054m;
        c0328j.f4056n = c0328j2.f4056n;
        c0328j.f4057o = c0328j2.f4057o;
        c0328j.f4059p = c0328j2.f4059p;
        c0328j.f4060q = c0328j2.f4060q;
        c0328j.f4061r = c0328j2.f4061r;
        c0328j.f4062s = c0328j2.f4062s;
        c0328j.f4063t = c0328j2.f4063t;
        c0328j.f4064u = c0328j2.f4064u;
        c0328j.f4065v = c0328j2.f4065v;
        c0328j.f4066w = c0328j2.f4066w;
        c0328j.f4067x = c0328j2.f4067x;
        c0328j.f4068y = c0328j2.f4068y;
        c0328j.f4069z = c0328j2.f4069z;
        c0328j.f4008A = c0328j2.f4008A;
        c0328j.f4009B = c0328j2.f4009B;
        c0328j.f4010C = c0328j2.f4010C;
        c0328j.f4011D = c0328j2.f4011D;
        c0328j.f4012E = c0328j2.f4012E;
        c0328j.F = c0328j2.F;
        c0328j.f4013G = c0328j2.f4013G;
        c0328j.f4014H = c0328j2.f4014H;
        c0328j.f4015I = c0328j2.f4015I;
        c0328j.f4016J = c0328j2.f4016J;
        c0328j.f4017K = c0328j2.f4017K;
        c0328j.f4018L = c0328j2.f4018L;
        c0328j.f4019M = c0328j2.f4019M;
        c0328j.f4020N = c0328j2.f4020N;
        c0328j.f4021O = c0328j2.f4021O;
        c0328j.f4022P = c0328j2.f4022P;
        c0328j.f4023Q = c0328j2.f4023Q;
        c0328j.f4024R = c0328j2.f4024R;
        c0328j.f4025S = c0328j2.f4025S;
        c0328j.f4026T = c0328j2.f4026T;
        c0328j.f4027U = c0328j2.f4027U;
        c0328j.f4028V = c0328j2.f4028V;
        c0328j.f4029W = c0328j2.f4029W;
        c0328j.f4030X = c0328j2.f4030X;
        c0328j.f4031Y = c0328j2.f4031Y;
        c0328j.f4032Z = c0328j2.f4032Z;
        c0328j.f4034a0 = c0328j2.f4034a0;
        c0328j.f4036b0 = c0328j2.f4036b0;
        c0328j.f4038c0 = c0328j2.f4038c0;
        c0328j.f4039d0 = c0328j2.f4039d0;
        c0328j.f4041e0 = c0328j2.f4041e0;
        c0328j.f4043f0 = c0328j2.f4043f0;
        c0328j.f4045g0 = c0328j2.f4045g0;
        c0328j.f4046h0 = c0328j2.f4046h0;
        c0328j.f4051k0 = c0328j2.f4051k0;
        int[] iArr = c0328j2.f4047i0;
        if (iArr == null || c0328j2.f4049j0 != null) {
            c0328j.f4047i0 = null;
        } else {
            c0328j.f4047i0 = Arrays.copyOf(iArr, iArr.length);
        }
        c0328j.f4049j0 = c0328j2.f4049j0;
        c0328j.f4053l0 = c0328j2.f4053l0;
        c0328j.f4055m0 = c0328j2.f4055m0;
        c0328j.n0 = c0328j2.n0;
        c0328j.f4058o0 = c0328j2.f4058o0;
        k kVar = c0327i.f4004c;
        kVar.getClass();
        k kVar2 = this.f4004c;
        kVar2.getClass();
        kVar.f4071a = kVar2.f4071a;
        kVar.f4073c = kVar2.f4073c;
        kVar.f4074e = kVar2.f4074e;
        kVar.d = kVar2.d;
        l lVar = c0327i.f4003b;
        l lVar2 = this.f4003b;
        lVar.f4077a = lVar2.f4077a;
        lVar.f4079c = lVar2.f4079c;
        lVar.d = lVar2.d;
        lVar.f4078b = lVar2.f4078b;
        m mVar = c0327i.f4005e;
        mVar.getClass();
        m mVar2 = this.f4005e;
        mVar2.getClass();
        mVar.f4081a = mVar2.f4081a;
        mVar.f4082b = mVar2.f4082b;
        mVar.f4083c = mVar2.f4083c;
        mVar.d = mVar2.d;
        mVar.f4084e = mVar2.f4084e;
        mVar.f4085f = mVar2.f4085f;
        mVar.f4086g = mVar2.f4086g;
        mVar.h = mVar2.h;
        mVar.i = mVar2.i;
        mVar.f4087j = mVar2.f4087j;
        mVar.f4088k = mVar2.f4088k;
        mVar.f4089l = mVar2.f4089l;
        mVar.f4090m = mVar2.f4090m;
        c0327i.f4002a = this.f4002a;
        return c0327i;
    }
}
