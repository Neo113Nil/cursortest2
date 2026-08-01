package v;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: v.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0327i {

    /* renamed from: a, reason: collision with root package name */
    public int f3932a;

    /* renamed from: b, reason: collision with root package name */
    public final l f3933b;

    /* renamed from: c, reason: collision with root package name */
    public final k f3934c;
    public final C0328j d;

    /* renamed from: e, reason: collision with root package name */
    public final m f3935e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f3936f;

    public C0327i() {
        l lVar = new l();
        lVar.f4007a = 0;
        lVar.f4008b = 0;
        lVar.f4009c = 1.0f;
        lVar.d = Float.NaN;
        this.f3933b = lVar;
        k kVar = new k();
        kVar.f4001a = -1;
        kVar.f4002b = 0;
        kVar.f4003c = -1;
        kVar.d = Float.NaN;
        kVar.f4004e = Float.NaN;
        kVar.f4005f = Float.NaN;
        kVar.f4006g = -1;
        kVar.h = null;
        kVar.i = -1;
        this.f3934c = kVar;
        C0328j c0328j = new C0328j();
        c0328j.f3963a = false;
        c0328j.d = -1;
        c0328j.f3970e = -1;
        c0328j.f3972f = -1.0f;
        c0328j.f3974g = true;
        c0328j.h = -1;
        c0328j.i = -1;
        c0328j.f3978j = -1;
        c0328j.f3979k = -1;
        c0328j.f3981l = -1;
        c0328j.f3983m = -1;
        c0328j.f3985n = -1;
        c0328j.f3987o = -1;
        c0328j.f3989p = -1;
        c0328j.f3990q = -1;
        c0328j.f3991r = -1;
        c0328j.f3992s = -1;
        c0328j.f3993t = -1;
        c0328j.f3994u = -1;
        c0328j.f3995v = -1;
        c0328j.f3996w = 0.5f;
        c0328j.f3997x = 0.5f;
        c0328j.f3998y = null;
        c0328j.f3999z = -1;
        c0328j.f3938A = 0;
        c0328j.f3939B = 0.0f;
        c0328j.f3940C = -1;
        c0328j.f3941D = -1;
        c0328j.f3942E = -1;
        c0328j.F = 0;
        c0328j.f3943G = 0;
        c0328j.f3944H = 0;
        c0328j.f3945I = 0;
        c0328j.f3946J = 0;
        c0328j.f3947K = 0;
        c0328j.f3948L = 0;
        c0328j.f3949M = Integer.MIN_VALUE;
        c0328j.f3950N = Integer.MIN_VALUE;
        c0328j.f3951O = Integer.MIN_VALUE;
        c0328j.f3952P = Integer.MIN_VALUE;
        c0328j.f3953Q = Integer.MIN_VALUE;
        c0328j.f3954R = Integer.MIN_VALUE;
        c0328j.f3955S = Integer.MIN_VALUE;
        c0328j.f3956T = -1.0f;
        c0328j.f3957U = -1.0f;
        c0328j.f3958V = 0;
        c0328j.f3959W = 0;
        c0328j.f3960X = 0;
        c0328j.f3961Y = 0;
        c0328j.f3962Z = 0;
        c0328j.f3964a0 = 0;
        c0328j.f3966b0 = 0;
        c0328j.f3968c0 = 0;
        c0328j.f3969d0 = 1.0f;
        c0328j.f3971e0 = 1.0f;
        c0328j.f3973f0 = -1;
        c0328j.f3975g0 = 0;
        c0328j.f3976h0 = -1;
        c0328j.f3982l0 = false;
        c0328j.f3984m0 = false;
        c0328j.f3986n0 = true;
        c0328j.f3988o0 = 0;
        this.d = c0328j;
        m mVar = new m();
        mVar.f4011a = 0.0f;
        mVar.f4012b = 0.0f;
        mVar.f4013c = 0.0f;
        mVar.d = 1.0f;
        mVar.f4014e = 1.0f;
        mVar.f4015f = Float.NaN;
        mVar.f4016g = Float.NaN;
        mVar.h = -1;
        mVar.i = 0.0f;
        mVar.f4017j = 0.0f;
        mVar.f4018k = 0.0f;
        mVar.f4019l = false;
        mVar.f4020m = 0.0f;
        this.f3935e = mVar;
        this.f3936f = new HashMap();
    }

    public final void a(C0323e c0323e) {
        C0328j c0328j = this.d;
        c0323e.f3882e = c0328j.h;
        c0323e.f3884f = c0328j.i;
        c0323e.f3886g = c0328j.f3978j;
        c0323e.h = c0328j.f3979k;
        c0323e.i = c0328j.f3981l;
        c0323e.f3890j = c0328j.f3983m;
        c0323e.f3891k = c0328j.f3985n;
        c0323e.f3893l = c0328j.f3987o;
        c0323e.f3895m = c0328j.f3989p;
        c0323e.f3897n = c0328j.f3990q;
        c0323e.f3899o = c0328j.f3991r;
        c0323e.f3905s = c0328j.f3992s;
        c0323e.f3906t = c0328j.f3993t;
        c0323e.f3907u = c0328j.f3994u;
        c0323e.f3908v = c0328j.f3995v;
        ((ViewGroup.MarginLayoutParams) c0323e).leftMargin = c0328j.F;
        ((ViewGroup.MarginLayoutParams) c0323e).rightMargin = c0328j.f3943G;
        ((ViewGroup.MarginLayoutParams) c0323e).topMargin = c0328j.f3944H;
        ((ViewGroup.MarginLayoutParams) c0323e).bottomMargin = c0328j.f3945I;
        c0323e.f3850A = c0328j.f3954R;
        c0323e.f3851B = c0328j.f3953Q;
        c0323e.f3910x = c0328j.f3950N;
        c0323e.f3912z = c0328j.f3952P;
        c0323e.f3854E = c0328j.f3996w;
        c0323e.F = c0328j.f3997x;
        c0323e.f3901p = c0328j.f3999z;
        c0323e.f3903q = c0328j.f3938A;
        c0323e.f3904r = c0328j.f3939B;
        c0323e.f3855G = c0328j.f3998y;
        c0323e.f3868T = c0328j.f3940C;
        c0323e.f3869U = c0328j.f3941D;
        c0323e.f3857I = c0328j.f3956T;
        c0323e.f3856H = c0328j.f3957U;
        c0323e.f3859K = c0328j.f3959W;
        c0323e.f3858J = c0328j.f3958V;
        c0323e.f3871W = c0328j.f3982l0;
        c0323e.f3872X = c0328j.f3984m0;
        c0323e.f3860L = c0328j.f3960X;
        c0323e.f3861M = c0328j.f3961Y;
        c0323e.f3864P = c0328j.f3962Z;
        c0323e.f3865Q = c0328j.f3964a0;
        c0323e.f3862N = c0328j.f3966b0;
        c0323e.f3863O = c0328j.f3968c0;
        c0323e.f3866R = c0328j.f3969d0;
        c0323e.f3867S = c0328j.f3971e0;
        c0323e.f3870V = c0328j.f3942E;
        c0323e.f3879c = c0328j.f3972f;
        c0323e.f3875a = c0328j.d;
        c0323e.f3877b = c0328j.f3970e;
        ((ViewGroup.MarginLayoutParams) c0323e).width = c0328j.f3965b;
        ((ViewGroup.MarginLayoutParams) c0323e).height = c0328j.f3967c;
        String str = c0328j.f3980k0;
        if (str != null) {
            c0323e.f3873Y = str;
        }
        c0323e.f3874Z = c0328j.f3988o0;
        c0323e.setMarginStart(c0328j.f3947K);
        c0323e.setMarginEnd(c0328j.f3946J);
        c0323e.a();
    }

    public final Object clone() {
        C0327i c0327i = new C0327i();
        C0328j c0328j = c0327i.d;
        c0328j.getClass();
        C0328j c0328j2 = this.d;
        c0328j.f3963a = c0328j2.f3963a;
        c0328j.f3965b = c0328j2.f3965b;
        c0328j.f3967c = c0328j2.f3967c;
        c0328j.d = c0328j2.d;
        c0328j.f3970e = c0328j2.f3970e;
        c0328j.f3972f = c0328j2.f3972f;
        c0328j.f3974g = c0328j2.f3974g;
        c0328j.h = c0328j2.h;
        c0328j.i = c0328j2.i;
        c0328j.f3978j = c0328j2.f3978j;
        c0328j.f3979k = c0328j2.f3979k;
        c0328j.f3981l = c0328j2.f3981l;
        c0328j.f3983m = c0328j2.f3983m;
        c0328j.f3985n = c0328j2.f3985n;
        c0328j.f3987o = c0328j2.f3987o;
        c0328j.f3989p = c0328j2.f3989p;
        c0328j.f3990q = c0328j2.f3990q;
        c0328j.f3991r = c0328j2.f3991r;
        c0328j.f3992s = c0328j2.f3992s;
        c0328j.f3993t = c0328j2.f3993t;
        c0328j.f3994u = c0328j2.f3994u;
        c0328j.f3995v = c0328j2.f3995v;
        c0328j.f3996w = c0328j2.f3996w;
        c0328j.f3997x = c0328j2.f3997x;
        c0328j.f3998y = c0328j2.f3998y;
        c0328j.f3999z = c0328j2.f3999z;
        c0328j.f3938A = c0328j2.f3938A;
        c0328j.f3939B = c0328j2.f3939B;
        c0328j.f3940C = c0328j2.f3940C;
        c0328j.f3941D = c0328j2.f3941D;
        c0328j.f3942E = c0328j2.f3942E;
        c0328j.F = c0328j2.F;
        c0328j.f3943G = c0328j2.f3943G;
        c0328j.f3944H = c0328j2.f3944H;
        c0328j.f3945I = c0328j2.f3945I;
        c0328j.f3946J = c0328j2.f3946J;
        c0328j.f3947K = c0328j2.f3947K;
        c0328j.f3948L = c0328j2.f3948L;
        c0328j.f3949M = c0328j2.f3949M;
        c0328j.f3950N = c0328j2.f3950N;
        c0328j.f3951O = c0328j2.f3951O;
        c0328j.f3952P = c0328j2.f3952P;
        c0328j.f3953Q = c0328j2.f3953Q;
        c0328j.f3954R = c0328j2.f3954R;
        c0328j.f3955S = c0328j2.f3955S;
        c0328j.f3956T = c0328j2.f3956T;
        c0328j.f3957U = c0328j2.f3957U;
        c0328j.f3958V = c0328j2.f3958V;
        c0328j.f3959W = c0328j2.f3959W;
        c0328j.f3960X = c0328j2.f3960X;
        c0328j.f3961Y = c0328j2.f3961Y;
        c0328j.f3962Z = c0328j2.f3962Z;
        c0328j.f3964a0 = c0328j2.f3964a0;
        c0328j.f3966b0 = c0328j2.f3966b0;
        c0328j.f3968c0 = c0328j2.f3968c0;
        c0328j.f3969d0 = c0328j2.f3969d0;
        c0328j.f3971e0 = c0328j2.f3971e0;
        c0328j.f3973f0 = c0328j2.f3973f0;
        c0328j.f3975g0 = c0328j2.f3975g0;
        c0328j.f3976h0 = c0328j2.f3976h0;
        c0328j.f3980k0 = c0328j2.f3980k0;
        int[] iArr = c0328j2.f3977i0;
        if (iArr == null || c0328j2.j0 != null) {
            c0328j.f3977i0 = null;
        } else {
            c0328j.f3977i0 = Arrays.copyOf(iArr, iArr.length);
        }
        c0328j.j0 = c0328j2.j0;
        c0328j.f3982l0 = c0328j2.f3982l0;
        c0328j.f3984m0 = c0328j2.f3984m0;
        c0328j.f3986n0 = c0328j2.f3986n0;
        c0328j.f3988o0 = c0328j2.f3988o0;
        k kVar = c0327i.f3934c;
        kVar.getClass();
        k kVar2 = this.f3934c;
        kVar2.getClass();
        kVar.f4001a = kVar2.f4001a;
        kVar.f4003c = kVar2.f4003c;
        kVar.f4004e = kVar2.f4004e;
        kVar.d = kVar2.d;
        l lVar = c0327i.f3933b;
        l lVar2 = this.f3933b;
        lVar.f4007a = lVar2.f4007a;
        lVar.f4009c = lVar2.f4009c;
        lVar.d = lVar2.d;
        lVar.f4008b = lVar2.f4008b;
        m mVar = c0327i.f3935e;
        mVar.getClass();
        m mVar2 = this.f3935e;
        mVar2.getClass();
        mVar.f4011a = mVar2.f4011a;
        mVar.f4012b = mVar2.f4012b;
        mVar.f4013c = mVar2.f4013c;
        mVar.d = mVar2.d;
        mVar.f4014e = mVar2.f4014e;
        mVar.f4015f = mVar2.f4015f;
        mVar.f4016g = mVar2.f4016g;
        mVar.h = mVar2.h;
        mVar.i = mVar2.i;
        mVar.f4017j = mVar2.f4017j;
        mVar.f4018k = mVar2.f4018k;
        mVar.f4019l = mVar2.f4019l;
        mVar.f4020m = mVar2.f4020m;
        c0327i.f3932a = this.f3932a;
        return c0327i;
    }
}
