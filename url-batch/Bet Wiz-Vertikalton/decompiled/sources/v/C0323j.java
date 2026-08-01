package v;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: v.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0323j {

    /* renamed from: a, reason: collision with root package name */
    public int f3930a;

    /* renamed from: b, reason: collision with root package name */
    public final m f3931b;

    /* renamed from: c, reason: collision with root package name */
    public final l f3932c;
    public final k d;

    /* renamed from: e, reason: collision with root package name */
    public final n f3933e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f3934f;

    public C0323j() {
        m mVar = new m();
        mVar.f4005a = 0;
        mVar.f4006b = 0;
        mVar.f4007c = 1.0f;
        mVar.d = Float.NaN;
        this.f3931b = mVar;
        l lVar = new l();
        lVar.f3999a = -1;
        lVar.f4000b = 0;
        lVar.f4001c = -1;
        lVar.d = Float.NaN;
        lVar.f4002e = Float.NaN;
        lVar.f4003f = Float.NaN;
        lVar.f4004g = -1;
        lVar.h = null;
        lVar.i = -1;
        this.f3932c = lVar;
        k kVar = new k();
        kVar.f3961a = false;
        kVar.d = -1;
        kVar.f3968e = -1;
        kVar.f3970f = -1.0f;
        kVar.f3972g = true;
        kVar.h = -1;
        kVar.i = -1;
        kVar.f3976j = -1;
        kVar.f3978k = -1;
        kVar.f3980l = -1;
        kVar.f3982m = -1;
        kVar.f3984n = -1;
        kVar.f3985o = -1;
        kVar.f3987p = -1;
        kVar.f3988q = -1;
        kVar.f3989r = -1;
        kVar.f3990s = -1;
        kVar.f3991t = -1;
        kVar.f3992u = -1;
        kVar.f3993v = -1;
        kVar.f3994w = 0.5f;
        kVar.f3995x = 0.5f;
        kVar.f3996y = null;
        kVar.f3997z = -1;
        kVar.f3936A = 0;
        kVar.f3937B = 0.0f;
        kVar.f3938C = -1;
        kVar.f3939D = -1;
        kVar.f3940E = -1;
        kVar.F = 0;
        kVar.f3941G = 0;
        kVar.f3942H = 0;
        kVar.f3943I = 0;
        kVar.f3944J = 0;
        kVar.f3945K = 0;
        kVar.f3946L = 0;
        kVar.f3947M = Integer.MIN_VALUE;
        kVar.f3948N = Integer.MIN_VALUE;
        kVar.f3949O = Integer.MIN_VALUE;
        kVar.f3950P = Integer.MIN_VALUE;
        kVar.f3951Q = Integer.MIN_VALUE;
        kVar.f3952R = Integer.MIN_VALUE;
        kVar.f3953S = Integer.MIN_VALUE;
        kVar.f3954T = -1.0f;
        kVar.f3955U = -1.0f;
        kVar.f3956V = 0;
        kVar.f3957W = 0;
        kVar.f3958X = 0;
        kVar.f3959Y = 0;
        kVar.f3960Z = 0;
        kVar.f3962a0 = 0;
        kVar.f3964b0 = 0;
        kVar.f3966c0 = 0;
        kVar.f3967d0 = 1.0f;
        kVar.f3969e0 = 1.0f;
        kVar.f3971f0 = -1;
        kVar.f3973g0 = 0;
        kVar.f3974h0 = -1;
        kVar.f3981l0 = false;
        kVar.f3983m0 = false;
        kVar.n0 = true;
        kVar.f3986o0 = 0;
        this.d = kVar;
        n nVar = new n();
        nVar.f4009a = 0.0f;
        nVar.f4010b = 0.0f;
        nVar.f4011c = 0.0f;
        nVar.d = 1.0f;
        nVar.f4012e = 1.0f;
        nVar.f4013f = Float.NaN;
        nVar.f4014g = Float.NaN;
        nVar.h = -1;
        nVar.i = 0.0f;
        nVar.f4015j = 0.0f;
        nVar.f4016k = 0.0f;
        nVar.f4017l = false;
        nVar.f4018m = 0.0f;
        this.f3933e = nVar;
        this.f3934f = new HashMap();
    }

    public final void a(C0318e c0318e) {
        k kVar = this.d;
        c0318e.f3877e = kVar.h;
        c0318e.f3879f = kVar.i;
        c0318e.f3881g = kVar.f3976j;
        c0318e.h = kVar.f3978k;
        c0318e.i = kVar.f3980l;
        c0318e.f3885j = kVar.f3982m;
        c0318e.f3887k = kVar.f3984n;
        c0318e.f3889l = kVar.f3985o;
        c0318e.f3891m = kVar.f3987p;
        c0318e.f3893n = kVar.f3988q;
        c0318e.f3894o = kVar.f3989r;
        c0318e.f3900s = kVar.f3990s;
        c0318e.f3901t = kVar.f3991t;
        c0318e.f3902u = kVar.f3992u;
        c0318e.f3903v = kVar.f3993v;
        ((ViewGroup.MarginLayoutParams) c0318e).leftMargin = kVar.F;
        ((ViewGroup.MarginLayoutParams) c0318e).rightMargin = kVar.f3941G;
        ((ViewGroup.MarginLayoutParams) c0318e).topMargin = kVar.f3942H;
        ((ViewGroup.MarginLayoutParams) c0318e).bottomMargin = kVar.f3943I;
        c0318e.f3845A = kVar.f3952R;
        c0318e.f3846B = kVar.f3951Q;
        c0318e.f3905x = kVar.f3948N;
        c0318e.f3907z = kVar.f3950P;
        c0318e.f3849E = kVar.f3994w;
        c0318e.F = kVar.f3995x;
        c0318e.f3896p = kVar.f3997z;
        c0318e.f3898q = kVar.f3936A;
        c0318e.f3899r = kVar.f3937B;
        c0318e.f3850G = kVar.f3996y;
        c0318e.f3863T = kVar.f3938C;
        c0318e.f3864U = kVar.f3939D;
        c0318e.f3852I = kVar.f3954T;
        c0318e.f3851H = kVar.f3955U;
        c0318e.f3854K = kVar.f3957W;
        c0318e.f3853J = kVar.f3956V;
        c0318e.f3866W = kVar.f3981l0;
        c0318e.f3867X = kVar.f3983m0;
        c0318e.f3855L = kVar.f3958X;
        c0318e.f3856M = kVar.f3959Y;
        c0318e.f3859P = kVar.f3960Z;
        c0318e.f3860Q = kVar.f3962a0;
        c0318e.f3857N = kVar.f3964b0;
        c0318e.f3858O = kVar.f3966c0;
        c0318e.f3861R = kVar.f3967d0;
        c0318e.f3862S = kVar.f3969e0;
        c0318e.f3865V = kVar.f3940E;
        c0318e.f3874c = kVar.f3970f;
        c0318e.f3870a = kVar.d;
        c0318e.f3872b = kVar.f3968e;
        ((ViewGroup.MarginLayoutParams) c0318e).width = kVar.f3963b;
        ((ViewGroup.MarginLayoutParams) c0318e).height = kVar.f3965c;
        String str = kVar.f3979k0;
        if (str != null) {
            c0318e.f3868Y = str;
        }
        c0318e.f3869Z = kVar.f3986o0;
        c0318e.setMarginStart(kVar.f3945K);
        c0318e.setMarginEnd(kVar.f3944J);
        c0318e.a();
    }

    public final Object clone() {
        C0323j c0323j = new C0323j();
        k kVar = c0323j.d;
        kVar.getClass();
        k kVar2 = this.d;
        kVar.f3961a = kVar2.f3961a;
        kVar.f3963b = kVar2.f3963b;
        kVar.f3965c = kVar2.f3965c;
        kVar.d = kVar2.d;
        kVar.f3968e = kVar2.f3968e;
        kVar.f3970f = kVar2.f3970f;
        kVar.f3972g = kVar2.f3972g;
        kVar.h = kVar2.h;
        kVar.i = kVar2.i;
        kVar.f3976j = kVar2.f3976j;
        kVar.f3978k = kVar2.f3978k;
        kVar.f3980l = kVar2.f3980l;
        kVar.f3982m = kVar2.f3982m;
        kVar.f3984n = kVar2.f3984n;
        kVar.f3985o = kVar2.f3985o;
        kVar.f3987p = kVar2.f3987p;
        kVar.f3988q = kVar2.f3988q;
        kVar.f3989r = kVar2.f3989r;
        kVar.f3990s = kVar2.f3990s;
        kVar.f3991t = kVar2.f3991t;
        kVar.f3992u = kVar2.f3992u;
        kVar.f3993v = kVar2.f3993v;
        kVar.f3994w = kVar2.f3994w;
        kVar.f3995x = kVar2.f3995x;
        kVar.f3996y = kVar2.f3996y;
        kVar.f3997z = kVar2.f3997z;
        kVar.f3936A = kVar2.f3936A;
        kVar.f3937B = kVar2.f3937B;
        kVar.f3938C = kVar2.f3938C;
        kVar.f3939D = kVar2.f3939D;
        kVar.f3940E = kVar2.f3940E;
        kVar.F = kVar2.F;
        kVar.f3941G = kVar2.f3941G;
        kVar.f3942H = kVar2.f3942H;
        kVar.f3943I = kVar2.f3943I;
        kVar.f3944J = kVar2.f3944J;
        kVar.f3945K = kVar2.f3945K;
        kVar.f3946L = kVar2.f3946L;
        kVar.f3947M = kVar2.f3947M;
        kVar.f3948N = kVar2.f3948N;
        kVar.f3949O = kVar2.f3949O;
        kVar.f3950P = kVar2.f3950P;
        kVar.f3951Q = kVar2.f3951Q;
        kVar.f3952R = kVar2.f3952R;
        kVar.f3953S = kVar2.f3953S;
        kVar.f3954T = kVar2.f3954T;
        kVar.f3955U = kVar2.f3955U;
        kVar.f3956V = kVar2.f3956V;
        kVar.f3957W = kVar2.f3957W;
        kVar.f3958X = kVar2.f3958X;
        kVar.f3959Y = kVar2.f3959Y;
        kVar.f3960Z = kVar2.f3960Z;
        kVar.f3962a0 = kVar2.f3962a0;
        kVar.f3964b0 = kVar2.f3964b0;
        kVar.f3966c0 = kVar2.f3966c0;
        kVar.f3967d0 = kVar2.f3967d0;
        kVar.f3969e0 = kVar2.f3969e0;
        kVar.f3971f0 = kVar2.f3971f0;
        kVar.f3973g0 = kVar2.f3973g0;
        kVar.f3974h0 = kVar2.f3974h0;
        kVar.f3979k0 = kVar2.f3979k0;
        int[] iArr = kVar2.f3975i0;
        if (iArr == null || kVar2.f3977j0 != null) {
            kVar.f3975i0 = null;
        } else {
            kVar.f3975i0 = Arrays.copyOf(iArr, iArr.length);
        }
        kVar.f3977j0 = kVar2.f3977j0;
        kVar.f3981l0 = kVar2.f3981l0;
        kVar.f3983m0 = kVar2.f3983m0;
        kVar.n0 = kVar2.n0;
        kVar.f3986o0 = kVar2.f3986o0;
        l lVar = c0323j.f3932c;
        lVar.getClass();
        l lVar2 = this.f3932c;
        lVar2.getClass();
        lVar.f3999a = lVar2.f3999a;
        lVar.f4001c = lVar2.f4001c;
        lVar.f4002e = lVar2.f4002e;
        lVar.d = lVar2.d;
        m mVar = c0323j.f3931b;
        m mVar2 = this.f3931b;
        mVar.f4005a = mVar2.f4005a;
        mVar.f4007c = mVar2.f4007c;
        mVar.d = mVar2.d;
        mVar.f4006b = mVar2.f4006b;
        n nVar = c0323j.f3933e;
        nVar.getClass();
        n nVar2 = this.f3933e;
        nVar2.getClass();
        nVar.f4009a = nVar2.f4009a;
        nVar.f4010b = nVar2.f4010b;
        nVar.f4011c = nVar2.f4011c;
        nVar.d = nVar2.d;
        nVar.f4012e = nVar2.f4012e;
        nVar.f4013f = nVar2.f4013f;
        nVar.f4014g = nVar2.f4014g;
        nVar.h = nVar2.h;
        nVar.i = nVar2.i;
        nVar.f4015j = nVar2.f4015j;
        nVar.f4016k = nVar2.f4016k;
        nVar.f4017l = nVar2.f4017l;
        nVar.f4018m = nVar2.f4018m;
        c0323j.f3930a = this.f3930a;
        return c0323j;
    }
}
