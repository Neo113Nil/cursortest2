package v;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: v.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0370i {

    /* renamed from: a, reason: collision with root package name */
    public int f3879a;

    /* renamed from: b, reason: collision with root package name */
    public final l f3880b;

    /* renamed from: c, reason: collision with root package name */
    public final k f3881c;
    public final C0371j d;

    /* renamed from: e, reason: collision with root package name */
    public final m f3882e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f3883f;

    public C0370i() {
        l lVar = new l();
        lVar.f3954a = 0;
        lVar.f3955b = 0;
        lVar.f3956c = 1.0f;
        lVar.d = Float.NaN;
        this.f3880b = lVar;
        k kVar = new k();
        kVar.f3948a = -1;
        kVar.f3949b = 0;
        kVar.f3950c = -1;
        kVar.d = Float.NaN;
        kVar.f3951e = Float.NaN;
        kVar.f3952f = Float.NaN;
        kVar.f3953g = -1;
        kVar.h = null;
        kVar.i = -1;
        this.f3881c = kVar;
        C0371j c0371j = new C0371j();
        c0371j.f3910a = false;
        c0371j.d = -1;
        c0371j.f3917e = -1;
        c0371j.f3919f = -1.0f;
        c0371j.f3921g = true;
        c0371j.h = -1;
        c0371j.i = -1;
        c0371j.f3925j = -1;
        c0371j.f3927k = -1;
        c0371j.f3929l = -1;
        c0371j.f3931m = -1;
        c0371j.f3932n = -1;
        c0371j.f3934o = -1;
        c0371j.f3936p = -1;
        c0371j.f3937q = -1;
        c0371j.f3938r = -1;
        c0371j.f3939s = -1;
        c0371j.f3940t = -1;
        c0371j.f3941u = -1;
        c0371j.f3942v = -1;
        c0371j.f3943w = 0.5f;
        c0371j.f3944x = 0.5f;
        c0371j.f3945y = null;
        c0371j.f3946z = -1;
        c0371j.f3885A = 0;
        c0371j.f3886B = 0.0f;
        c0371j.f3887C = -1;
        c0371j.f3888D = -1;
        c0371j.f3889E = -1;
        c0371j.F = 0;
        c0371j.f3890G = 0;
        c0371j.f3891H = 0;
        c0371j.f3892I = 0;
        c0371j.f3893J = 0;
        c0371j.f3894K = 0;
        c0371j.f3895L = 0;
        c0371j.f3896M = Integer.MIN_VALUE;
        c0371j.f3897N = Integer.MIN_VALUE;
        c0371j.f3898O = Integer.MIN_VALUE;
        c0371j.f3899P = Integer.MIN_VALUE;
        c0371j.f3900Q = Integer.MIN_VALUE;
        c0371j.f3901R = Integer.MIN_VALUE;
        c0371j.f3902S = Integer.MIN_VALUE;
        c0371j.f3903T = -1.0f;
        c0371j.f3904U = -1.0f;
        c0371j.f3905V = 0;
        c0371j.f3906W = 0;
        c0371j.f3907X = 0;
        c0371j.f3908Y = 0;
        c0371j.f3909Z = 0;
        c0371j.f3911a0 = 0;
        c0371j.f3913b0 = 0;
        c0371j.f3915c0 = 0;
        c0371j.f3916d0 = 1.0f;
        c0371j.f3918e0 = 1.0f;
        c0371j.f3920f0 = -1;
        c0371j.f3922g0 = 0;
        c0371j.f3923h0 = -1;
        c0371j.f3930l0 = false;
        c0371j.m0 = false;
        c0371j.f3933n0 = true;
        c0371j.f3935o0 = 0;
        this.d = c0371j;
        m mVar = new m();
        mVar.f3958a = 0.0f;
        mVar.f3959b = 0.0f;
        mVar.f3960c = 0.0f;
        mVar.d = 1.0f;
        mVar.f3961e = 1.0f;
        mVar.f3962f = Float.NaN;
        mVar.f3963g = Float.NaN;
        mVar.h = -1;
        mVar.i = 0.0f;
        mVar.f3964j = 0.0f;
        mVar.f3965k = 0.0f;
        mVar.f3966l = false;
        mVar.f3967m = 0.0f;
        this.f3882e = mVar;
        this.f3883f = new HashMap();
    }

    public final void a(C0366e c0366e) {
        C0371j c0371j = this.d;
        c0366e.f3829e = c0371j.h;
        c0366e.f3831f = c0371j.i;
        c0366e.f3833g = c0371j.f3925j;
        c0366e.h = c0371j.f3927k;
        c0366e.i = c0371j.f3929l;
        c0366e.f3837j = c0371j.f3931m;
        c0366e.f3839k = c0371j.f3932n;
        c0366e.f3841l = c0371j.f3934o;
        c0366e.f3843m = c0371j.f3936p;
        c0366e.f3844n = c0371j.f3937q;
        c0366e.f3846o = c0371j.f3938r;
        c0366e.f3852s = c0371j.f3939s;
        c0366e.f3853t = c0371j.f3940t;
        c0366e.f3854u = c0371j.f3941u;
        c0366e.f3855v = c0371j.f3942v;
        ((ViewGroup.MarginLayoutParams) c0366e).leftMargin = c0371j.F;
        ((ViewGroup.MarginLayoutParams) c0366e).rightMargin = c0371j.f3890G;
        ((ViewGroup.MarginLayoutParams) c0366e).topMargin = c0371j.f3891H;
        ((ViewGroup.MarginLayoutParams) c0366e).bottomMargin = c0371j.f3892I;
        c0366e.f3797A = c0371j.f3901R;
        c0366e.f3798B = c0371j.f3900Q;
        c0366e.f3857x = c0371j.f3897N;
        c0366e.f3859z = c0371j.f3899P;
        c0366e.f3801E = c0371j.f3943w;
        c0366e.F = c0371j.f3944x;
        c0366e.f3848p = c0371j.f3946z;
        c0366e.f3850q = c0371j.f3885A;
        c0366e.f3851r = c0371j.f3886B;
        c0366e.f3802G = c0371j.f3945y;
        c0366e.f3815T = c0371j.f3887C;
        c0366e.f3816U = c0371j.f3888D;
        c0366e.f3804I = c0371j.f3903T;
        c0366e.f3803H = c0371j.f3904U;
        c0366e.f3806K = c0371j.f3906W;
        c0366e.f3805J = c0371j.f3905V;
        c0366e.f3818W = c0371j.f3930l0;
        c0366e.f3819X = c0371j.m0;
        c0366e.f3807L = c0371j.f3907X;
        c0366e.f3808M = c0371j.f3908Y;
        c0366e.f3811P = c0371j.f3909Z;
        c0366e.f3812Q = c0371j.f3911a0;
        c0366e.f3809N = c0371j.f3913b0;
        c0366e.f3810O = c0371j.f3915c0;
        c0366e.f3813R = c0371j.f3916d0;
        c0366e.f3814S = c0371j.f3918e0;
        c0366e.f3817V = c0371j.f3889E;
        c0366e.f3826c = c0371j.f3919f;
        c0366e.f3822a = c0371j.d;
        c0366e.f3824b = c0371j.f3917e;
        ((ViewGroup.MarginLayoutParams) c0366e).width = c0371j.f3912b;
        ((ViewGroup.MarginLayoutParams) c0366e).height = c0371j.f3914c;
        String str = c0371j.f3928k0;
        if (str != null) {
            c0366e.f3820Y = str;
        }
        c0366e.f3821Z = c0371j.f3935o0;
        c0366e.setMarginStart(c0371j.f3894K);
        c0366e.setMarginEnd(c0371j.f3893J);
        c0366e.a();
    }

    public final Object clone() {
        C0370i c0370i = new C0370i();
        C0371j c0371j = c0370i.d;
        c0371j.getClass();
        C0371j c0371j2 = this.d;
        c0371j.f3910a = c0371j2.f3910a;
        c0371j.f3912b = c0371j2.f3912b;
        c0371j.f3914c = c0371j2.f3914c;
        c0371j.d = c0371j2.d;
        c0371j.f3917e = c0371j2.f3917e;
        c0371j.f3919f = c0371j2.f3919f;
        c0371j.f3921g = c0371j2.f3921g;
        c0371j.h = c0371j2.h;
        c0371j.i = c0371j2.i;
        c0371j.f3925j = c0371j2.f3925j;
        c0371j.f3927k = c0371j2.f3927k;
        c0371j.f3929l = c0371j2.f3929l;
        c0371j.f3931m = c0371j2.f3931m;
        c0371j.f3932n = c0371j2.f3932n;
        c0371j.f3934o = c0371j2.f3934o;
        c0371j.f3936p = c0371j2.f3936p;
        c0371j.f3937q = c0371j2.f3937q;
        c0371j.f3938r = c0371j2.f3938r;
        c0371j.f3939s = c0371j2.f3939s;
        c0371j.f3940t = c0371j2.f3940t;
        c0371j.f3941u = c0371j2.f3941u;
        c0371j.f3942v = c0371j2.f3942v;
        c0371j.f3943w = c0371j2.f3943w;
        c0371j.f3944x = c0371j2.f3944x;
        c0371j.f3945y = c0371j2.f3945y;
        c0371j.f3946z = c0371j2.f3946z;
        c0371j.f3885A = c0371j2.f3885A;
        c0371j.f3886B = c0371j2.f3886B;
        c0371j.f3887C = c0371j2.f3887C;
        c0371j.f3888D = c0371j2.f3888D;
        c0371j.f3889E = c0371j2.f3889E;
        c0371j.F = c0371j2.F;
        c0371j.f3890G = c0371j2.f3890G;
        c0371j.f3891H = c0371j2.f3891H;
        c0371j.f3892I = c0371j2.f3892I;
        c0371j.f3893J = c0371j2.f3893J;
        c0371j.f3894K = c0371j2.f3894K;
        c0371j.f3895L = c0371j2.f3895L;
        c0371j.f3896M = c0371j2.f3896M;
        c0371j.f3897N = c0371j2.f3897N;
        c0371j.f3898O = c0371j2.f3898O;
        c0371j.f3899P = c0371j2.f3899P;
        c0371j.f3900Q = c0371j2.f3900Q;
        c0371j.f3901R = c0371j2.f3901R;
        c0371j.f3902S = c0371j2.f3902S;
        c0371j.f3903T = c0371j2.f3903T;
        c0371j.f3904U = c0371j2.f3904U;
        c0371j.f3905V = c0371j2.f3905V;
        c0371j.f3906W = c0371j2.f3906W;
        c0371j.f3907X = c0371j2.f3907X;
        c0371j.f3908Y = c0371j2.f3908Y;
        c0371j.f3909Z = c0371j2.f3909Z;
        c0371j.f3911a0 = c0371j2.f3911a0;
        c0371j.f3913b0 = c0371j2.f3913b0;
        c0371j.f3915c0 = c0371j2.f3915c0;
        c0371j.f3916d0 = c0371j2.f3916d0;
        c0371j.f3918e0 = c0371j2.f3918e0;
        c0371j.f3920f0 = c0371j2.f3920f0;
        c0371j.f3922g0 = c0371j2.f3922g0;
        c0371j.f3923h0 = c0371j2.f3923h0;
        c0371j.f3928k0 = c0371j2.f3928k0;
        int[] iArr = c0371j2.f3924i0;
        if (iArr == null || c0371j2.f3926j0 != null) {
            c0371j.f3924i0 = null;
        } else {
            c0371j.f3924i0 = Arrays.copyOf(iArr, iArr.length);
        }
        c0371j.f3926j0 = c0371j2.f3926j0;
        c0371j.f3930l0 = c0371j2.f3930l0;
        c0371j.m0 = c0371j2.m0;
        c0371j.f3933n0 = c0371j2.f3933n0;
        c0371j.f3935o0 = c0371j2.f3935o0;
        k kVar = c0370i.f3881c;
        kVar.getClass();
        k kVar2 = this.f3881c;
        kVar2.getClass();
        kVar.f3948a = kVar2.f3948a;
        kVar.f3950c = kVar2.f3950c;
        kVar.f3951e = kVar2.f3951e;
        kVar.d = kVar2.d;
        l lVar = c0370i.f3880b;
        l lVar2 = this.f3880b;
        lVar.f3954a = lVar2.f3954a;
        lVar.f3956c = lVar2.f3956c;
        lVar.d = lVar2.d;
        lVar.f3955b = lVar2.f3955b;
        m mVar = c0370i.f3882e;
        mVar.getClass();
        m mVar2 = this.f3882e;
        mVar2.getClass();
        mVar.f3958a = mVar2.f3958a;
        mVar.f3959b = mVar2.f3959b;
        mVar.f3960c = mVar2.f3960c;
        mVar.d = mVar2.d;
        mVar.f3961e = mVar2.f3961e;
        mVar.f3962f = mVar2.f3962f;
        mVar.f3963g = mVar2.f3963g;
        mVar.h = mVar2.h;
        mVar.i = mVar2.i;
        mVar.f3964j = mVar2.f3964j;
        mVar.f3965k = mVar2.f3965k;
        mVar.f3966l = mVar2.f3966l;
        mVar.f3967m = mVar2.f3967m;
        c0370i.f3879a = this.f3879a;
        return c0370i;
    }
}
