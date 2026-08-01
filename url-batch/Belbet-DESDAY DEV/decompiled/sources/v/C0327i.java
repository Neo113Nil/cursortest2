package v;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: v.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0327i {

    /* renamed from: a, reason: collision with root package name */
    public int f3933a;

    /* renamed from: b, reason: collision with root package name */
    public final l f3934b;

    /* renamed from: c, reason: collision with root package name */
    public final k f3935c;
    public final C0328j d;

    /* renamed from: e, reason: collision with root package name */
    public final m f3936e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f3937f;

    public C0327i() {
        l lVar = new l();
        lVar.f4008a = 0;
        lVar.f4009b = 0;
        lVar.f4010c = 1.0f;
        lVar.d = Float.NaN;
        this.f3934b = lVar;
        k kVar = new k();
        kVar.f4002a = -1;
        kVar.f4003b = 0;
        kVar.f4004c = -1;
        kVar.d = Float.NaN;
        kVar.f4005e = Float.NaN;
        kVar.f4006f = Float.NaN;
        kVar.f4007g = -1;
        kVar.h = null;
        kVar.i = -1;
        this.f3935c = kVar;
        C0328j c0328j = new C0328j();
        c0328j.f3964a = false;
        c0328j.d = -1;
        c0328j.f3971e = -1;
        c0328j.f3973f = -1.0f;
        c0328j.f3975g = true;
        c0328j.h = -1;
        c0328j.i = -1;
        c0328j.f3979j = -1;
        c0328j.f3980k = -1;
        c0328j.f3982l = -1;
        c0328j.f3984m = -1;
        c0328j.f3986n = -1;
        c0328j.f3988o = -1;
        c0328j.f3990p = -1;
        c0328j.f3991q = -1;
        c0328j.f3992r = -1;
        c0328j.f3993s = -1;
        c0328j.f3994t = -1;
        c0328j.f3995u = -1;
        c0328j.f3996v = -1;
        c0328j.f3997w = 0.5f;
        c0328j.f3998x = 0.5f;
        c0328j.f3999y = null;
        c0328j.f4000z = -1;
        c0328j.f3939A = 0;
        c0328j.f3940B = 0.0f;
        c0328j.f3941C = -1;
        c0328j.f3942D = -1;
        c0328j.f3943E = -1;
        c0328j.F = 0;
        c0328j.f3944G = 0;
        c0328j.f3945H = 0;
        c0328j.f3946I = 0;
        c0328j.f3947J = 0;
        c0328j.f3948K = 0;
        c0328j.f3949L = 0;
        c0328j.f3950M = Integer.MIN_VALUE;
        c0328j.f3951N = Integer.MIN_VALUE;
        c0328j.f3952O = Integer.MIN_VALUE;
        c0328j.f3953P = Integer.MIN_VALUE;
        c0328j.f3954Q = Integer.MIN_VALUE;
        c0328j.f3955R = Integer.MIN_VALUE;
        c0328j.f3956S = Integer.MIN_VALUE;
        c0328j.f3957T = -1.0f;
        c0328j.f3958U = -1.0f;
        c0328j.f3959V = 0;
        c0328j.f3960W = 0;
        c0328j.f3961X = 0;
        c0328j.f3962Y = 0;
        c0328j.f3963Z = 0;
        c0328j.f3965a0 = 0;
        c0328j.f3967b0 = 0;
        c0328j.f3969c0 = 0;
        c0328j.f3970d0 = 1.0f;
        c0328j.f3972e0 = 1.0f;
        c0328j.f3974f0 = -1;
        c0328j.f3976g0 = 0;
        c0328j.f3977h0 = -1;
        c0328j.f3983l0 = false;
        c0328j.f3985m0 = false;
        c0328j.f3987n0 = true;
        c0328j.f3989o0 = 0;
        this.d = c0328j;
        m mVar = new m();
        mVar.f4012a = 0.0f;
        mVar.f4013b = 0.0f;
        mVar.f4014c = 0.0f;
        mVar.d = 1.0f;
        mVar.f4015e = 1.0f;
        mVar.f4016f = Float.NaN;
        mVar.f4017g = Float.NaN;
        mVar.h = -1;
        mVar.i = 0.0f;
        mVar.f4018j = 0.0f;
        mVar.f4019k = 0.0f;
        mVar.f4020l = false;
        mVar.f4021m = 0.0f;
        this.f3936e = mVar;
        this.f3937f = new HashMap();
    }

    public final void a(C0323e c0323e) {
        C0328j c0328j = this.d;
        c0323e.f3883e = c0328j.h;
        c0323e.f3885f = c0328j.i;
        c0323e.f3887g = c0328j.f3979j;
        c0323e.h = c0328j.f3980k;
        c0323e.i = c0328j.f3982l;
        c0323e.f3891j = c0328j.f3984m;
        c0323e.f3892k = c0328j.f3986n;
        c0323e.f3894l = c0328j.f3988o;
        c0323e.f3896m = c0328j.f3990p;
        c0323e.f3898n = c0328j.f3991q;
        c0323e.f3900o = c0328j.f3992r;
        c0323e.f3906s = c0328j.f3993s;
        c0323e.f3907t = c0328j.f3994t;
        c0323e.f3908u = c0328j.f3995u;
        c0323e.f3909v = c0328j.f3996v;
        ((ViewGroup.MarginLayoutParams) c0323e).leftMargin = c0328j.F;
        ((ViewGroup.MarginLayoutParams) c0323e).rightMargin = c0328j.f3944G;
        ((ViewGroup.MarginLayoutParams) c0323e).topMargin = c0328j.f3945H;
        ((ViewGroup.MarginLayoutParams) c0323e).bottomMargin = c0328j.f3946I;
        c0323e.f3851A = c0328j.f3955R;
        c0323e.f3852B = c0328j.f3954Q;
        c0323e.f3911x = c0328j.f3951N;
        c0323e.f3913z = c0328j.f3953P;
        c0323e.f3855E = c0328j.f3997w;
        c0323e.F = c0328j.f3998x;
        c0323e.f3902p = c0328j.f4000z;
        c0323e.f3904q = c0328j.f3939A;
        c0323e.f3905r = c0328j.f3940B;
        c0323e.f3856G = c0328j.f3999y;
        c0323e.f3869T = c0328j.f3941C;
        c0323e.f3870U = c0328j.f3942D;
        c0323e.f3858I = c0328j.f3957T;
        c0323e.f3857H = c0328j.f3958U;
        c0323e.f3860K = c0328j.f3960W;
        c0323e.f3859J = c0328j.f3959V;
        c0323e.f3872W = c0328j.f3983l0;
        c0323e.f3873X = c0328j.f3985m0;
        c0323e.f3861L = c0328j.f3961X;
        c0323e.f3862M = c0328j.f3962Y;
        c0323e.f3865P = c0328j.f3963Z;
        c0323e.f3866Q = c0328j.f3965a0;
        c0323e.f3863N = c0328j.f3967b0;
        c0323e.f3864O = c0328j.f3969c0;
        c0323e.f3867R = c0328j.f3970d0;
        c0323e.f3868S = c0328j.f3972e0;
        c0323e.f3871V = c0328j.f3943E;
        c0323e.f3880c = c0328j.f3973f;
        c0323e.f3876a = c0328j.d;
        c0323e.f3878b = c0328j.f3971e;
        ((ViewGroup.MarginLayoutParams) c0323e).width = c0328j.f3966b;
        ((ViewGroup.MarginLayoutParams) c0323e).height = c0328j.f3968c;
        String str = c0328j.f3981k0;
        if (str != null) {
            c0323e.f3874Y = str;
        }
        c0323e.f3875Z = c0328j.f3989o0;
        c0323e.setMarginStart(c0328j.f3948K);
        c0323e.setMarginEnd(c0328j.f3947J);
        c0323e.a();
    }

    public final Object clone() {
        C0327i c0327i = new C0327i();
        C0328j c0328j = c0327i.d;
        c0328j.getClass();
        C0328j c0328j2 = this.d;
        c0328j.f3964a = c0328j2.f3964a;
        c0328j.f3966b = c0328j2.f3966b;
        c0328j.f3968c = c0328j2.f3968c;
        c0328j.d = c0328j2.d;
        c0328j.f3971e = c0328j2.f3971e;
        c0328j.f3973f = c0328j2.f3973f;
        c0328j.f3975g = c0328j2.f3975g;
        c0328j.h = c0328j2.h;
        c0328j.i = c0328j2.i;
        c0328j.f3979j = c0328j2.f3979j;
        c0328j.f3980k = c0328j2.f3980k;
        c0328j.f3982l = c0328j2.f3982l;
        c0328j.f3984m = c0328j2.f3984m;
        c0328j.f3986n = c0328j2.f3986n;
        c0328j.f3988o = c0328j2.f3988o;
        c0328j.f3990p = c0328j2.f3990p;
        c0328j.f3991q = c0328j2.f3991q;
        c0328j.f3992r = c0328j2.f3992r;
        c0328j.f3993s = c0328j2.f3993s;
        c0328j.f3994t = c0328j2.f3994t;
        c0328j.f3995u = c0328j2.f3995u;
        c0328j.f3996v = c0328j2.f3996v;
        c0328j.f3997w = c0328j2.f3997w;
        c0328j.f3998x = c0328j2.f3998x;
        c0328j.f3999y = c0328j2.f3999y;
        c0328j.f4000z = c0328j2.f4000z;
        c0328j.f3939A = c0328j2.f3939A;
        c0328j.f3940B = c0328j2.f3940B;
        c0328j.f3941C = c0328j2.f3941C;
        c0328j.f3942D = c0328j2.f3942D;
        c0328j.f3943E = c0328j2.f3943E;
        c0328j.F = c0328j2.F;
        c0328j.f3944G = c0328j2.f3944G;
        c0328j.f3945H = c0328j2.f3945H;
        c0328j.f3946I = c0328j2.f3946I;
        c0328j.f3947J = c0328j2.f3947J;
        c0328j.f3948K = c0328j2.f3948K;
        c0328j.f3949L = c0328j2.f3949L;
        c0328j.f3950M = c0328j2.f3950M;
        c0328j.f3951N = c0328j2.f3951N;
        c0328j.f3952O = c0328j2.f3952O;
        c0328j.f3953P = c0328j2.f3953P;
        c0328j.f3954Q = c0328j2.f3954Q;
        c0328j.f3955R = c0328j2.f3955R;
        c0328j.f3956S = c0328j2.f3956S;
        c0328j.f3957T = c0328j2.f3957T;
        c0328j.f3958U = c0328j2.f3958U;
        c0328j.f3959V = c0328j2.f3959V;
        c0328j.f3960W = c0328j2.f3960W;
        c0328j.f3961X = c0328j2.f3961X;
        c0328j.f3962Y = c0328j2.f3962Y;
        c0328j.f3963Z = c0328j2.f3963Z;
        c0328j.f3965a0 = c0328j2.f3965a0;
        c0328j.f3967b0 = c0328j2.f3967b0;
        c0328j.f3969c0 = c0328j2.f3969c0;
        c0328j.f3970d0 = c0328j2.f3970d0;
        c0328j.f3972e0 = c0328j2.f3972e0;
        c0328j.f3974f0 = c0328j2.f3974f0;
        c0328j.f3976g0 = c0328j2.f3976g0;
        c0328j.f3977h0 = c0328j2.f3977h0;
        c0328j.f3981k0 = c0328j2.f3981k0;
        int[] iArr = c0328j2.f3978i0;
        if (iArr == null || c0328j2.j0 != null) {
            c0328j.f3978i0 = null;
        } else {
            c0328j.f3978i0 = Arrays.copyOf(iArr, iArr.length);
        }
        c0328j.j0 = c0328j2.j0;
        c0328j.f3983l0 = c0328j2.f3983l0;
        c0328j.f3985m0 = c0328j2.f3985m0;
        c0328j.f3987n0 = c0328j2.f3987n0;
        c0328j.f3989o0 = c0328j2.f3989o0;
        k kVar = c0327i.f3935c;
        kVar.getClass();
        k kVar2 = this.f3935c;
        kVar2.getClass();
        kVar.f4002a = kVar2.f4002a;
        kVar.f4004c = kVar2.f4004c;
        kVar.f4005e = kVar2.f4005e;
        kVar.d = kVar2.d;
        l lVar = c0327i.f3934b;
        l lVar2 = this.f3934b;
        lVar.f4008a = lVar2.f4008a;
        lVar.f4010c = lVar2.f4010c;
        lVar.d = lVar2.d;
        lVar.f4009b = lVar2.f4009b;
        m mVar = c0327i.f3936e;
        mVar.getClass();
        m mVar2 = this.f3936e;
        mVar2.getClass();
        mVar.f4012a = mVar2.f4012a;
        mVar.f4013b = mVar2.f4013b;
        mVar.f4014c = mVar2.f4014c;
        mVar.d = mVar2.d;
        mVar.f4015e = mVar2.f4015e;
        mVar.f4016f = mVar2.f4016f;
        mVar.f4017g = mVar2.f4017g;
        mVar.h = mVar2.h;
        mVar.i = mVar2.i;
        mVar.f4018j = mVar2.f4018j;
        mVar.f4019k = mVar2.f4019k;
        mVar.f4020l = mVar2.f4020l;
        mVar.f4021m = mVar2.f4021m;
        c0327i.f3933a = this.f3933a;
        return c0327i;
    }
}
