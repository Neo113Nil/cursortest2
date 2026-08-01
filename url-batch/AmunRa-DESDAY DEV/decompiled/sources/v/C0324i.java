package v;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: v.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0324i {

    /* renamed from: a, reason: collision with root package name */
    public int f4007a;

    /* renamed from: b, reason: collision with root package name */
    public final l f4008b;

    /* renamed from: c, reason: collision with root package name */
    public final k f4009c;
    public final C0325j d;

    /* renamed from: e, reason: collision with root package name */
    public final m f4010e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f4011f;

    public C0324i() {
        l lVar = new l();
        lVar.f4081a = 0;
        lVar.f4082b = 0;
        lVar.f4083c = 1.0f;
        lVar.d = Float.NaN;
        this.f4008b = lVar;
        k kVar = new k();
        kVar.f4075a = -1;
        kVar.f4076b = 0;
        kVar.f4077c = -1;
        kVar.d = Float.NaN;
        kVar.f4078e = Float.NaN;
        kVar.f4079f = Float.NaN;
        kVar.f4080g = -1;
        kVar.h = null;
        kVar.i = -1;
        this.f4009c = kVar;
        C0325j c0325j = new C0325j();
        c0325j.f4038a = false;
        c0325j.d = -1;
        c0325j.f4045e = -1;
        c0325j.f4047f = -1.0f;
        c0325j.f4049g = true;
        c0325j.h = -1;
        c0325j.i = -1;
        c0325j.f4053j = -1;
        c0325j.f4054k = -1;
        c0325j.f4056l = -1;
        c0325j.f4058m = -1;
        c0325j.f4060n = -1;
        c0325j.f4061o = -1;
        c0325j.f4063p = -1;
        c0325j.f4064q = -1;
        c0325j.f4065r = -1;
        c0325j.f4066s = -1;
        c0325j.f4067t = -1;
        c0325j.f4068u = -1;
        c0325j.f4069v = -1;
        c0325j.f4070w = 0.5f;
        c0325j.f4071x = 0.5f;
        c0325j.f4072y = null;
        c0325j.f4073z = -1;
        c0325j.f4013A = 0;
        c0325j.f4014B = 0.0f;
        c0325j.f4015C = -1;
        c0325j.f4016D = -1;
        c0325j.f4017E = -1;
        c0325j.F = 0;
        c0325j.f4018G = 0;
        c0325j.f4019H = 0;
        c0325j.f4020I = 0;
        c0325j.f4021J = 0;
        c0325j.f4022K = 0;
        c0325j.f4023L = 0;
        c0325j.f4024M = Integer.MIN_VALUE;
        c0325j.f4025N = Integer.MIN_VALUE;
        c0325j.f4026O = Integer.MIN_VALUE;
        c0325j.f4027P = Integer.MIN_VALUE;
        c0325j.f4028Q = Integer.MIN_VALUE;
        c0325j.f4029R = Integer.MIN_VALUE;
        c0325j.f4030S = Integer.MIN_VALUE;
        c0325j.f4031T = -1.0f;
        c0325j.f4032U = -1.0f;
        c0325j.f4033V = 0;
        c0325j.f4034W = 0;
        c0325j.f4035X = 0;
        c0325j.f4036Y = 0;
        c0325j.f4037Z = 0;
        c0325j.f4039a0 = 0;
        c0325j.f4041b0 = 0;
        c0325j.f4043c0 = 0;
        c0325j.f4044d0 = 1.0f;
        c0325j.f4046e0 = 1.0f;
        c0325j.f4048f0 = -1;
        c0325j.f4050g0 = 0;
        c0325j.f4051h0 = -1;
        c0325j.f4057l0 = false;
        c0325j.f4059m0 = false;
        c0325j.n0 = true;
        c0325j.f4062o0 = 0;
        this.d = c0325j;
        m mVar = new m();
        mVar.f4085a = 0.0f;
        mVar.f4086b = 0.0f;
        mVar.f4087c = 0.0f;
        mVar.d = 1.0f;
        mVar.f4088e = 1.0f;
        mVar.f4089f = Float.NaN;
        mVar.f4090g = Float.NaN;
        mVar.h = -1;
        mVar.i = 0.0f;
        mVar.f4091j = 0.0f;
        mVar.f4092k = 0.0f;
        mVar.f4093l = false;
        mVar.f4094m = 0.0f;
        this.f4010e = mVar;
        this.f4011f = new HashMap();
    }

    public final void a(C0320e c0320e) {
        C0325j c0325j = this.d;
        c0320e.f3958e = c0325j.h;
        c0320e.f3960f = c0325j.i;
        c0320e.f3962g = c0325j.f4053j;
        c0320e.h = c0325j.f4054k;
        c0320e.i = c0325j.f4056l;
        c0320e.f3966j = c0325j.f4058m;
        c0320e.f3967k = c0325j.f4060n;
        c0320e.f3969l = c0325j.f4061o;
        c0320e.f3971m = c0325j.f4063p;
        c0320e.f3973n = c0325j.f4064q;
        c0320e.f3974o = c0325j.f4065r;
        c0320e.f3980s = c0325j.f4066s;
        c0320e.f3981t = c0325j.f4067t;
        c0320e.f3982u = c0325j.f4068u;
        c0320e.f3983v = c0325j.f4069v;
        ((ViewGroup.MarginLayoutParams) c0320e).leftMargin = c0325j.F;
        ((ViewGroup.MarginLayoutParams) c0320e).rightMargin = c0325j.f4018G;
        ((ViewGroup.MarginLayoutParams) c0320e).topMargin = c0325j.f4019H;
        ((ViewGroup.MarginLayoutParams) c0320e).bottomMargin = c0325j.f4020I;
        c0320e.f3926A = c0325j.f4029R;
        c0320e.f3927B = c0325j.f4028Q;
        c0320e.f3985x = c0325j.f4025N;
        c0320e.f3987z = c0325j.f4027P;
        c0320e.f3930E = c0325j.f4070w;
        c0320e.F = c0325j.f4071x;
        c0320e.f3976p = c0325j.f4073z;
        c0320e.f3978q = c0325j.f4013A;
        c0320e.f3979r = c0325j.f4014B;
        c0320e.f3931G = c0325j.f4072y;
        c0320e.f3944T = c0325j.f4015C;
        c0320e.f3945U = c0325j.f4016D;
        c0320e.f3933I = c0325j.f4031T;
        c0320e.f3932H = c0325j.f4032U;
        c0320e.f3935K = c0325j.f4034W;
        c0320e.f3934J = c0325j.f4033V;
        c0320e.f3947W = c0325j.f4057l0;
        c0320e.f3948X = c0325j.f4059m0;
        c0320e.f3936L = c0325j.f4035X;
        c0320e.f3937M = c0325j.f4036Y;
        c0320e.f3940P = c0325j.f4037Z;
        c0320e.f3941Q = c0325j.f4039a0;
        c0320e.f3938N = c0325j.f4041b0;
        c0320e.f3939O = c0325j.f4043c0;
        c0320e.f3942R = c0325j.f4044d0;
        c0320e.f3943S = c0325j.f4046e0;
        c0320e.f3946V = c0325j.f4017E;
        c0320e.f3955c = c0325j.f4047f;
        c0320e.f3951a = c0325j.d;
        c0320e.f3953b = c0325j.f4045e;
        ((ViewGroup.MarginLayoutParams) c0320e).width = c0325j.f4040b;
        ((ViewGroup.MarginLayoutParams) c0320e).height = c0325j.f4042c;
        String str = c0325j.f4055k0;
        if (str != null) {
            c0320e.f3949Y = str;
        }
        c0320e.f3950Z = c0325j.f4062o0;
        c0320e.setMarginStart(c0325j.f4022K);
        c0320e.setMarginEnd(c0325j.f4021J);
        c0320e.a();
    }

    public final Object clone() {
        C0324i c0324i = new C0324i();
        C0325j c0325j = c0324i.d;
        c0325j.getClass();
        C0325j c0325j2 = this.d;
        c0325j.f4038a = c0325j2.f4038a;
        c0325j.f4040b = c0325j2.f4040b;
        c0325j.f4042c = c0325j2.f4042c;
        c0325j.d = c0325j2.d;
        c0325j.f4045e = c0325j2.f4045e;
        c0325j.f4047f = c0325j2.f4047f;
        c0325j.f4049g = c0325j2.f4049g;
        c0325j.h = c0325j2.h;
        c0325j.i = c0325j2.i;
        c0325j.f4053j = c0325j2.f4053j;
        c0325j.f4054k = c0325j2.f4054k;
        c0325j.f4056l = c0325j2.f4056l;
        c0325j.f4058m = c0325j2.f4058m;
        c0325j.f4060n = c0325j2.f4060n;
        c0325j.f4061o = c0325j2.f4061o;
        c0325j.f4063p = c0325j2.f4063p;
        c0325j.f4064q = c0325j2.f4064q;
        c0325j.f4065r = c0325j2.f4065r;
        c0325j.f4066s = c0325j2.f4066s;
        c0325j.f4067t = c0325j2.f4067t;
        c0325j.f4068u = c0325j2.f4068u;
        c0325j.f4069v = c0325j2.f4069v;
        c0325j.f4070w = c0325j2.f4070w;
        c0325j.f4071x = c0325j2.f4071x;
        c0325j.f4072y = c0325j2.f4072y;
        c0325j.f4073z = c0325j2.f4073z;
        c0325j.f4013A = c0325j2.f4013A;
        c0325j.f4014B = c0325j2.f4014B;
        c0325j.f4015C = c0325j2.f4015C;
        c0325j.f4016D = c0325j2.f4016D;
        c0325j.f4017E = c0325j2.f4017E;
        c0325j.F = c0325j2.F;
        c0325j.f4018G = c0325j2.f4018G;
        c0325j.f4019H = c0325j2.f4019H;
        c0325j.f4020I = c0325j2.f4020I;
        c0325j.f4021J = c0325j2.f4021J;
        c0325j.f4022K = c0325j2.f4022K;
        c0325j.f4023L = c0325j2.f4023L;
        c0325j.f4024M = c0325j2.f4024M;
        c0325j.f4025N = c0325j2.f4025N;
        c0325j.f4026O = c0325j2.f4026O;
        c0325j.f4027P = c0325j2.f4027P;
        c0325j.f4028Q = c0325j2.f4028Q;
        c0325j.f4029R = c0325j2.f4029R;
        c0325j.f4030S = c0325j2.f4030S;
        c0325j.f4031T = c0325j2.f4031T;
        c0325j.f4032U = c0325j2.f4032U;
        c0325j.f4033V = c0325j2.f4033V;
        c0325j.f4034W = c0325j2.f4034W;
        c0325j.f4035X = c0325j2.f4035X;
        c0325j.f4036Y = c0325j2.f4036Y;
        c0325j.f4037Z = c0325j2.f4037Z;
        c0325j.f4039a0 = c0325j2.f4039a0;
        c0325j.f4041b0 = c0325j2.f4041b0;
        c0325j.f4043c0 = c0325j2.f4043c0;
        c0325j.f4044d0 = c0325j2.f4044d0;
        c0325j.f4046e0 = c0325j2.f4046e0;
        c0325j.f4048f0 = c0325j2.f4048f0;
        c0325j.f4050g0 = c0325j2.f4050g0;
        c0325j.f4051h0 = c0325j2.f4051h0;
        c0325j.f4055k0 = c0325j2.f4055k0;
        int[] iArr = c0325j2.f4052i0;
        if (iArr == null || c0325j2.j0 != null) {
            c0325j.f4052i0 = null;
        } else {
            c0325j.f4052i0 = Arrays.copyOf(iArr, iArr.length);
        }
        c0325j.j0 = c0325j2.j0;
        c0325j.f4057l0 = c0325j2.f4057l0;
        c0325j.f4059m0 = c0325j2.f4059m0;
        c0325j.n0 = c0325j2.n0;
        c0325j.f4062o0 = c0325j2.f4062o0;
        k kVar = c0324i.f4009c;
        kVar.getClass();
        k kVar2 = this.f4009c;
        kVar2.getClass();
        kVar.f4075a = kVar2.f4075a;
        kVar.f4077c = kVar2.f4077c;
        kVar.f4078e = kVar2.f4078e;
        kVar.d = kVar2.d;
        l lVar = c0324i.f4008b;
        l lVar2 = this.f4008b;
        lVar.f4081a = lVar2.f4081a;
        lVar.f4083c = lVar2.f4083c;
        lVar.d = lVar2.d;
        lVar.f4082b = lVar2.f4082b;
        m mVar = c0324i.f4010e;
        mVar.getClass();
        m mVar2 = this.f4010e;
        mVar2.getClass();
        mVar.f4085a = mVar2.f4085a;
        mVar.f4086b = mVar2.f4086b;
        mVar.f4087c = mVar2.f4087c;
        mVar.d = mVar2.d;
        mVar.f4088e = mVar2.f4088e;
        mVar.f4089f = mVar2.f4089f;
        mVar.f4090g = mVar2.f4090g;
        mVar.h = mVar2.h;
        mVar.i = mVar2.i;
        mVar.f4091j = mVar2.f4091j;
        mVar.f4092k = mVar2.f4092k;
        mVar.f4093l = mVar2.f4093l;
        mVar.f4094m = mVar2.f4094m;
        c0324i.f4007a = this.f4007a;
        return c0324i;
    }
}
