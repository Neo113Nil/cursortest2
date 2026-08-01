package v;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: v.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0327i {

    /* renamed from: a, reason: collision with root package name */
    public int f3928a;

    /* renamed from: b, reason: collision with root package name */
    public final l f3929b;

    /* renamed from: c, reason: collision with root package name */
    public final k f3930c;
    public final C0328j d;

    /* renamed from: e, reason: collision with root package name */
    public final m f3931e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f3932f;

    public C0327i() {
        l lVar = new l();
        lVar.f4003a = 0;
        lVar.f4004b = 0;
        lVar.f4005c = 1.0f;
        lVar.d = Float.NaN;
        this.f3929b = lVar;
        k kVar = new k();
        kVar.f3997a = -1;
        kVar.f3998b = 0;
        kVar.f3999c = -1;
        kVar.d = Float.NaN;
        kVar.f4000e = Float.NaN;
        kVar.f4001f = Float.NaN;
        kVar.f4002g = -1;
        kVar.h = null;
        kVar.i = -1;
        this.f3930c = kVar;
        C0328j c0328j = new C0328j();
        c0328j.f3959a = false;
        c0328j.d = -1;
        c0328j.f3966e = -1;
        c0328j.f3968f = -1.0f;
        c0328j.f3970g = true;
        c0328j.h = -1;
        c0328j.i = -1;
        c0328j.f3974j = -1;
        c0328j.f3975k = -1;
        c0328j.f3977l = -1;
        c0328j.f3979m = -1;
        c0328j.f3981n = -1;
        c0328j.f3983o = -1;
        c0328j.f3985p = -1;
        c0328j.f3986q = -1;
        c0328j.f3987r = -1;
        c0328j.f3988s = -1;
        c0328j.f3989t = -1;
        c0328j.f3990u = -1;
        c0328j.f3991v = -1;
        c0328j.f3992w = 0.5f;
        c0328j.f3993x = 0.5f;
        c0328j.f3994y = null;
        c0328j.f3995z = -1;
        c0328j.f3934A = 0;
        c0328j.f3935B = 0.0f;
        c0328j.f3936C = -1;
        c0328j.f3937D = -1;
        c0328j.f3938E = -1;
        c0328j.F = 0;
        c0328j.f3939G = 0;
        c0328j.f3940H = 0;
        c0328j.f3941I = 0;
        c0328j.f3942J = 0;
        c0328j.f3943K = 0;
        c0328j.f3944L = 0;
        c0328j.f3945M = Integer.MIN_VALUE;
        c0328j.f3946N = Integer.MIN_VALUE;
        c0328j.f3947O = Integer.MIN_VALUE;
        c0328j.f3948P = Integer.MIN_VALUE;
        c0328j.f3949Q = Integer.MIN_VALUE;
        c0328j.f3950R = Integer.MIN_VALUE;
        c0328j.f3951S = Integer.MIN_VALUE;
        c0328j.f3952T = -1.0f;
        c0328j.f3953U = -1.0f;
        c0328j.f3954V = 0;
        c0328j.f3955W = 0;
        c0328j.f3956X = 0;
        c0328j.f3957Y = 0;
        c0328j.f3958Z = 0;
        c0328j.f3960a0 = 0;
        c0328j.f3962b0 = 0;
        c0328j.f3964c0 = 0;
        c0328j.f3965d0 = 1.0f;
        c0328j.f3967e0 = 1.0f;
        c0328j.f3969f0 = -1;
        c0328j.f3971g0 = 0;
        c0328j.f3972h0 = -1;
        c0328j.f3978l0 = false;
        c0328j.f3980m0 = false;
        c0328j.f3982n0 = true;
        c0328j.f3984o0 = 0;
        this.d = c0328j;
        m mVar = new m();
        mVar.f4007a = 0.0f;
        mVar.f4008b = 0.0f;
        mVar.f4009c = 0.0f;
        mVar.d = 1.0f;
        mVar.f4010e = 1.0f;
        mVar.f4011f = Float.NaN;
        mVar.f4012g = Float.NaN;
        mVar.h = -1;
        mVar.i = 0.0f;
        mVar.f4013j = 0.0f;
        mVar.f4014k = 0.0f;
        mVar.f4015l = false;
        mVar.f4016m = 0.0f;
        this.f3931e = mVar;
        this.f3932f = new HashMap();
    }

    public final void a(C0323e c0323e) {
        C0328j c0328j = this.d;
        c0323e.f3878e = c0328j.h;
        c0323e.f3880f = c0328j.i;
        c0323e.f3882g = c0328j.f3974j;
        c0323e.h = c0328j.f3975k;
        c0323e.i = c0328j.f3977l;
        c0323e.f3886j = c0328j.f3979m;
        c0323e.f3887k = c0328j.f3981n;
        c0323e.f3889l = c0328j.f3983o;
        c0323e.f3891m = c0328j.f3985p;
        c0323e.f3893n = c0328j.f3986q;
        c0323e.f3895o = c0328j.f3987r;
        c0323e.f3901s = c0328j.f3988s;
        c0323e.f3902t = c0328j.f3989t;
        c0323e.f3903u = c0328j.f3990u;
        c0323e.f3904v = c0328j.f3991v;
        ((ViewGroup.MarginLayoutParams) c0323e).leftMargin = c0328j.F;
        ((ViewGroup.MarginLayoutParams) c0323e).rightMargin = c0328j.f3939G;
        ((ViewGroup.MarginLayoutParams) c0323e).topMargin = c0328j.f3940H;
        ((ViewGroup.MarginLayoutParams) c0323e).bottomMargin = c0328j.f3941I;
        c0323e.f3846A = c0328j.f3950R;
        c0323e.f3847B = c0328j.f3949Q;
        c0323e.f3906x = c0328j.f3946N;
        c0323e.f3908z = c0328j.f3948P;
        c0323e.f3850E = c0328j.f3992w;
        c0323e.F = c0328j.f3993x;
        c0323e.f3897p = c0328j.f3995z;
        c0323e.f3899q = c0328j.f3934A;
        c0323e.f3900r = c0328j.f3935B;
        c0323e.f3851G = c0328j.f3994y;
        c0323e.f3864T = c0328j.f3936C;
        c0323e.f3865U = c0328j.f3937D;
        c0323e.f3853I = c0328j.f3952T;
        c0323e.f3852H = c0328j.f3953U;
        c0323e.f3855K = c0328j.f3955W;
        c0323e.f3854J = c0328j.f3954V;
        c0323e.f3867W = c0328j.f3978l0;
        c0323e.f3868X = c0328j.f3980m0;
        c0323e.f3856L = c0328j.f3956X;
        c0323e.f3857M = c0328j.f3957Y;
        c0323e.f3860P = c0328j.f3958Z;
        c0323e.f3861Q = c0328j.f3960a0;
        c0323e.f3858N = c0328j.f3962b0;
        c0323e.f3859O = c0328j.f3964c0;
        c0323e.f3862R = c0328j.f3965d0;
        c0323e.f3863S = c0328j.f3967e0;
        c0323e.f3866V = c0328j.f3938E;
        c0323e.f3875c = c0328j.f3968f;
        c0323e.f3871a = c0328j.d;
        c0323e.f3873b = c0328j.f3966e;
        ((ViewGroup.MarginLayoutParams) c0323e).width = c0328j.f3961b;
        ((ViewGroup.MarginLayoutParams) c0323e).height = c0328j.f3963c;
        String str = c0328j.f3976k0;
        if (str != null) {
            c0323e.f3869Y = str;
        }
        c0323e.f3870Z = c0328j.f3984o0;
        c0323e.setMarginStart(c0328j.f3943K);
        c0323e.setMarginEnd(c0328j.f3942J);
        c0323e.a();
    }

    public final Object clone() {
        C0327i c0327i = new C0327i();
        C0328j c0328j = c0327i.d;
        c0328j.getClass();
        C0328j c0328j2 = this.d;
        c0328j.f3959a = c0328j2.f3959a;
        c0328j.f3961b = c0328j2.f3961b;
        c0328j.f3963c = c0328j2.f3963c;
        c0328j.d = c0328j2.d;
        c0328j.f3966e = c0328j2.f3966e;
        c0328j.f3968f = c0328j2.f3968f;
        c0328j.f3970g = c0328j2.f3970g;
        c0328j.h = c0328j2.h;
        c0328j.i = c0328j2.i;
        c0328j.f3974j = c0328j2.f3974j;
        c0328j.f3975k = c0328j2.f3975k;
        c0328j.f3977l = c0328j2.f3977l;
        c0328j.f3979m = c0328j2.f3979m;
        c0328j.f3981n = c0328j2.f3981n;
        c0328j.f3983o = c0328j2.f3983o;
        c0328j.f3985p = c0328j2.f3985p;
        c0328j.f3986q = c0328j2.f3986q;
        c0328j.f3987r = c0328j2.f3987r;
        c0328j.f3988s = c0328j2.f3988s;
        c0328j.f3989t = c0328j2.f3989t;
        c0328j.f3990u = c0328j2.f3990u;
        c0328j.f3991v = c0328j2.f3991v;
        c0328j.f3992w = c0328j2.f3992w;
        c0328j.f3993x = c0328j2.f3993x;
        c0328j.f3994y = c0328j2.f3994y;
        c0328j.f3995z = c0328j2.f3995z;
        c0328j.f3934A = c0328j2.f3934A;
        c0328j.f3935B = c0328j2.f3935B;
        c0328j.f3936C = c0328j2.f3936C;
        c0328j.f3937D = c0328j2.f3937D;
        c0328j.f3938E = c0328j2.f3938E;
        c0328j.F = c0328j2.F;
        c0328j.f3939G = c0328j2.f3939G;
        c0328j.f3940H = c0328j2.f3940H;
        c0328j.f3941I = c0328j2.f3941I;
        c0328j.f3942J = c0328j2.f3942J;
        c0328j.f3943K = c0328j2.f3943K;
        c0328j.f3944L = c0328j2.f3944L;
        c0328j.f3945M = c0328j2.f3945M;
        c0328j.f3946N = c0328j2.f3946N;
        c0328j.f3947O = c0328j2.f3947O;
        c0328j.f3948P = c0328j2.f3948P;
        c0328j.f3949Q = c0328j2.f3949Q;
        c0328j.f3950R = c0328j2.f3950R;
        c0328j.f3951S = c0328j2.f3951S;
        c0328j.f3952T = c0328j2.f3952T;
        c0328j.f3953U = c0328j2.f3953U;
        c0328j.f3954V = c0328j2.f3954V;
        c0328j.f3955W = c0328j2.f3955W;
        c0328j.f3956X = c0328j2.f3956X;
        c0328j.f3957Y = c0328j2.f3957Y;
        c0328j.f3958Z = c0328j2.f3958Z;
        c0328j.f3960a0 = c0328j2.f3960a0;
        c0328j.f3962b0 = c0328j2.f3962b0;
        c0328j.f3964c0 = c0328j2.f3964c0;
        c0328j.f3965d0 = c0328j2.f3965d0;
        c0328j.f3967e0 = c0328j2.f3967e0;
        c0328j.f3969f0 = c0328j2.f3969f0;
        c0328j.f3971g0 = c0328j2.f3971g0;
        c0328j.f3972h0 = c0328j2.f3972h0;
        c0328j.f3976k0 = c0328j2.f3976k0;
        int[] iArr = c0328j2.f3973i0;
        if (iArr == null || c0328j2.j0 != null) {
            c0328j.f3973i0 = null;
        } else {
            c0328j.f3973i0 = Arrays.copyOf(iArr, iArr.length);
        }
        c0328j.j0 = c0328j2.j0;
        c0328j.f3978l0 = c0328j2.f3978l0;
        c0328j.f3980m0 = c0328j2.f3980m0;
        c0328j.f3982n0 = c0328j2.f3982n0;
        c0328j.f3984o0 = c0328j2.f3984o0;
        k kVar = c0327i.f3930c;
        kVar.getClass();
        k kVar2 = this.f3930c;
        kVar2.getClass();
        kVar.f3997a = kVar2.f3997a;
        kVar.f3999c = kVar2.f3999c;
        kVar.f4000e = kVar2.f4000e;
        kVar.d = kVar2.d;
        l lVar = c0327i.f3929b;
        l lVar2 = this.f3929b;
        lVar.f4003a = lVar2.f4003a;
        lVar.f4005c = lVar2.f4005c;
        lVar.d = lVar2.d;
        lVar.f4004b = lVar2.f4004b;
        m mVar = c0327i.f3931e;
        mVar.getClass();
        m mVar2 = this.f3931e;
        mVar2.getClass();
        mVar.f4007a = mVar2.f4007a;
        mVar.f4008b = mVar2.f4008b;
        mVar.f4009c = mVar2.f4009c;
        mVar.d = mVar2.d;
        mVar.f4010e = mVar2.f4010e;
        mVar.f4011f = mVar2.f4011f;
        mVar.f4012g = mVar2.f4012g;
        mVar.h = mVar2.h;
        mVar.i = mVar2.i;
        mVar.f4013j = mVar2.f4013j;
        mVar.f4014k = mVar2.f4014k;
        mVar.f4015l = mVar2.f4015l;
        mVar.f4016m = mVar2.f4016m;
        c0327i.f3928a = this.f3928a;
        return c0327i;
    }
}
