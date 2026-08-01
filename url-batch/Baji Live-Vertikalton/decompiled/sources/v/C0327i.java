package v;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: v.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0327i {

    /* renamed from: a, reason: collision with root package name */
    public int f3910a;

    /* renamed from: b, reason: collision with root package name */
    public final l f3911b;

    /* renamed from: c, reason: collision with root package name */
    public final k f3912c;
    public final C0328j d;

    /* renamed from: e, reason: collision with root package name */
    public final m f3913e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f3914f;

    public C0327i() {
        l lVar = new l();
        lVar.f3985a = 0;
        lVar.f3986b = 0;
        lVar.f3987c = 1.0f;
        lVar.d = Float.NaN;
        this.f3911b = lVar;
        k kVar = new k();
        kVar.f3979a = -1;
        kVar.f3980b = 0;
        kVar.f3981c = -1;
        kVar.d = Float.NaN;
        kVar.f3982e = Float.NaN;
        kVar.f3983f = Float.NaN;
        kVar.f3984g = -1;
        kVar.h = null;
        kVar.i = -1;
        this.f3912c = kVar;
        C0328j c0328j = new C0328j();
        c0328j.f3941a = false;
        c0328j.d = -1;
        c0328j.f3948e = -1;
        c0328j.f3950f = -1.0f;
        c0328j.f3952g = true;
        c0328j.h = -1;
        c0328j.i = -1;
        c0328j.f3956j = -1;
        c0328j.f3957k = -1;
        c0328j.f3959l = -1;
        c0328j.f3961m = -1;
        c0328j.f3963n = -1;
        c0328j.f3965o = -1;
        c0328j.f3967p = -1;
        c0328j.f3968q = -1;
        c0328j.f3969r = -1;
        c0328j.f3970s = -1;
        c0328j.f3971t = -1;
        c0328j.f3972u = -1;
        c0328j.f3973v = -1;
        c0328j.f3974w = 0.5f;
        c0328j.f3975x = 0.5f;
        c0328j.f3976y = null;
        c0328j.f3977z = -1;
        c0328j.f3916A = 0;
        c0328j.f3917B = 0.0f;
        c0328j.f3918C = -1;
        c0328j.f3919D = -1;
        c0328j.f3920E = -1;
        c0328j.F = 0;
        c0328j.f3921G = 0;
        c0328j.f3922H = 0;
        c0328j.f3923I = 0;
        c0328j.f3924J = 0;
        c0328j.f3925K = 0;
        c0328j.f3926L = 0;
        c0328j.f3927M = Integer.MIN_VALUE;
        c0328j.f3928N = Integer.MIN_VALUE;
        c0328j.f3929O = Integer.MIN_VALUE;
        c0328j.f3930P = Integer.MIN_VALUE;
        c0328j.f3931Q = Integer.MIN_VALUE;
        c0328j.f3932R = Integer.MIN_VALUE;
        c0328j.f3933S = Integer.MIN_VALUE;
        c0328j.f3934T = -1.0f;
        c0328j.f3935U = -1.0f;
        c0328j.f3936V = 0;
        c0328j.f3937W = 0;
        c0328j.f3938X = 0;
        c0328j.f3939Y = 0;
        c0328j.f3940Z = 0;
        c0328j.f3942a0 = 0;
        c0328j.f3944b0 = 0;
        c0328j.f3946c0 = 0;
        c0328j.f3947d0 = 1.0f;
        c0328j.f3949e0 = 1.0f;
        c0328j.f3951f0 = -1;
        c0328j.f3953g0 = 0;
        c0328j.f3954h0 = -1;
        c0328j.f3960l0 = false;
        c0328j.f3962m0 = false;
        c0328j.f3964n0 = true;
        c0328j.f3966o0 = 0;
        this.d = c0328j;
        m mVar = new m();
        mVar.f3989a = 0.0f;
        mVar.f3990b = 0.0f;
        mVar.f3991c = 0.0f;
        mVar.d = 1.0f;
        mVar.f3992e = 1.0f;
        mVar.f3993f = Float.NaN;
        mVar.f3994g = Float.NaN;
        mVar.h = -1;
        mVar.i = 0.0f;
        mVar.f3995j = 0.0f;
        mVar.f3996k = 0.0f;
        mVar.f3997l = false;
        mVar.f3998m = 0.0f;
        this.f3913e = mVar;
        this.f3914f = new HashMap();
    }

    public final void a(C0323e c0323e) {
        C0328j c0328j = this.d;
        c0323e.f3860e = c0328j.h;
        c0323e.f3862f = c0328j.i;
        c0323e.f3864g = c0328j.f3956j;
        c0323e.h = c0328j.f3957k;
        c0323e.i = c0328j.f3959l;
        c0323e.f3868j = c0328j.f3961m;
        c0323e.f3869k = c0328j.f3963n;
        c0323e.f3871l = c0328j.f3965o;
        c0323e.f3873m = c0328j.f3967p;
        c0323e.f3875n = c0328j.f3968q;
        c0323e.f3877o = c0328j.f3969r;
        c0323e.f3883s = c0328j.f3970s;
        c0323e.f3884t = c0328j.f3971t;
        c0323e.f3885u = c0328j.f3972u;
        c0323e.f3886v = c0328j.f3973v;
        ((ViewGroup.MarginLayoutParams) c0323e).leftMargin = c0328j.F;
        ((ViewGroup.MarginLayoutParams) c0323e).rightMargin = c0328j.f3921G;
        ((ViewGroup.MarginLayoutParams) c0323e).topMargin = c0328j.f3922H;
        ((ViewGroup.MarginLayoutParams) c0323e).bottomMargin = c0328j.f3923I;
        c0323e.f3828A = c0328j.f3932R;
        c0323e.f3829B = c0328j.f3931Q;
        c0323e.f3888x = c0328j.f3928N;
        c0323e.f3890z = c0328j.f3930P;
        c0323e.f3832E = c0328j.f3974w;
        c0323e.F = c0328j.f3975x;
        c0323e.f3879p = c0328j.f3977z;
        c0323e.f3881q = c0328j.f3916A;
        c0323e.f3882r = c0328j.f3917B;
        c0323e.f3833G = c0328j.f3976y;
        c0323e.f3846T = c0328j.f3918C;
        c0323e.f3847U = c0328j.f3919D;
        c0323e.f3835I = c0328j.f3934T;
        c0323e.f3834H = c0328j.f3935U;
        c0323e.f3837K = c0328j.f3937W;
        c0323e.f3836J = c0328j.f3936V;
        c0323e.f3849W = c0328j.f3960l0;
        c0323e.f3850X = c0328j.f3962m0;
        c0323e.f3838L = c0328j.f3938X;
        c0323e.f3839M = c0328j.f3939Y;
        c0323e.f3842P = c0328j.f3940Z;
        c0323e.f3843Q = c0328j.f3942a0;
        c0323e.f3840N = c0328j.f3944b0;
        c0323e.f3841O = c0328j.f3946c0;
        c0323e.f3844R = c0328j.f3947d0;
        c0323e.f3845S = c0328j.f3949e0;
        c0323e.f3848V = c0328j.f3920E;
        c0323e.f3857c = c0328j.f3950f;
        c0323e.f3853a = c0328j.d;
        c0323e.f3855b = c0328j.f3948e;
        ((ViewGroup.MarginLayoutParams) c0323e).width = c0328j.f3943b;
        ((ViewGroup.MarginLayoutParams) c0323e).height = c0328j.f3945c;
        String str = c0328j.f3958k0;
        if (str != null) {
            c0323e.f3851Y = str;
        }
        c0323e.f3852Z = c0328j.f3966o0;
        c0323e.setMarginStart(c0328j.f3925K);
        c0323e.setMarginEnd(c0328j.f3924J);
        c0323e.a();
    }

    public final Object clone() {
        C0327i c0327i = new C0327i();
        C0328j c0328j = c0327i.d;
        c0328j.getClass();
        C0328j c0328j2 = this.d;
        c0328j.f3941a = c0328j2.f3941a;
        c0328j.f3943b = c0328j2.f3943b;
        c0328j.f3945c = c0328j2.f3945c;
        c0328j.d = c0328j2.d;
        c0328j.f3948e = c0328j2.f3948e;
        c0328j.f3950f = c0328j2.f3950f;
        c0328j.f3952g = c0328j2.f3952g;
        c0328j.h = c0328j2.h;
        c0328j.i = c0328j2.i;
        c0328j.f3956j = c0328j2.f3956j;
        c0328j.f3957k = c0328j2.f3957k;
        c0328j.f3959l = c0328j2.f3959l;
        c0328j.f3961m = c0328j2.f3961m;
        c0328j.f3963n = c0328j2.f3963n;
        c0328j.f3965o = c0328j2.f3965o;
        c0328j.f3967p = c0328j2.f3967p;
        c0328j.f3968q = c0328j2.f3968q;
        c0328j.f3969r = c0328j2.f3969r;
        c0328j.f3970s = c0328j2.f3970s;
        c0328j.f3971t = c0328j2.f3971t;
        c0328j.f3972u = c0328j2.f3972u;
        c0328j.f3973v = c0328j2.f3973v;
        c0328j.f3974w = c0328j2.f3974w;
        c0328j.f3975x = c0328j2.f3975x;
        c0328j.f3976y = c0328j2.f3976y;
        c0328j.f3977z = c0328j2.f3977z;
        c0328j.f3916A = c0328j2.f3916A;
        c0328j.f3917B = c0328j2.f3917B;
        c0328j.f3918C = c0328j2.f3918C;
        c0328j.f3919D = c0328j2.f3919D;
        c0328j.f3920E = c0328j2.f3920E;
        c0328j.F = c0328j2.F;
        c0328j.f3921G = c0328j2.f3921G;
        c0328j.f3922H = c0328j2.f3922H;
        c0328j.f3923I = c0328j2.f3923I;
        c0328j.f3924J = c0328j2.f3924J;
        c0328j.f3925K = c0328j2.f3925K;
        c0328j.f3926L = c0328j2.f3926L;
        c0328j.f3927M = c0328j2.f3927M;
        c0328j.f3928N = c0328j2.f3928N;
        c0328j.f3929O = c0328j2.f3929O;
        c0328j.f3930P = c0328j2.f3930P;
        c0328j.f3931Q = c0328j2.f3931Q;
        c0328j.f3932R = c0328j2.f3932R;
        c0328j.f3933S = c0328j2.f3933S;
        c0328j.f3934T = c0328j2.f3934T;
        c0328j.f3935U = c0328j2.f3935U;
        c0328j.f3936V = c0328j2.f3936V;
        c0328j.f3937W = c0328j2.f3937W;
        c0328j.f3938X = c0328j2.f3938X;
        c0328j.f3939Y = c0328j2.f3939Y;
        c0328j.f3940Z = c0328j2.f3940Z;
        c0328j.f3942a0 = c0328j2.f3942a0;
        c0328j.f3944b0 = c0328j2.f3944b0;
        c0328j.f3946c0 = c0328j2.f3946c0;
        c0328j.f3947d0 = c0328j2.f3947d0;
        c0328j.f3949e0 = c0328j2.f3949e0;
        c0328j.f3951f0 = c0328j2.f3951f0;
        c0328j.f3953g0 = c0328j2.f3953g0;
        c0328j.f3954h0 = c0328j2.f3954h0;
        c0328j.f3958k0 = c0328j2.f3958k0;
        int[] iArr = c0328j2.f3955i0;
        if (iArr == null || c0328j2.j0 != null) {
            c0328j.f3955i0 = null;
        } else {
            c0328j.f3955i0 = Arrays.copyOf(iArr, iArr.length);
        }
        c0328j.j0 = c0328j2.j0;
        c0328j.f3960l0 = c0328j2.f3960l0;
        c0328j.f3962m0 = c0328j2.f3962m0;
        c0328j.f3964n0 = c0328j2.f3964n0;
        c0328j.f3966o0 = c0328j2.f3966o0;
        k kVar = c0327i.f3912c;
        kVar.getClass();
        k kVar2 = this.f3912c;
        kVar2.getClass();
        kVar.f3979a = kVar2.f3979a;
        kVar.f3981c = kVar2.f3981c;
        kVar.f3982e = kVar2.f3982e;
        kVar.d = kVar2.d;
        l lVar = c0327i.f3911b;
        l lVar2 = this.f3911b;
        lVar.f3985a = lVar2.f3985a;
        lVar.f3987c = lVar2.f3987c;
        lVar.d = lVar2.d;
        lVar.f3986b = lVar2.f3986b;
        m mVar = c0327i.f3913e;
        mVar.getClass();
        m mVar2 = this.f3913e;
        mVar2.getClass();
        mVar.f3989a = mVar2.f3989a;
        mVar.f3990b = mVar2.f3990b;
        mVar.f3991c = mVar2.f3991c;
        mVar.d = mVar2.d;
        mVar.f3992e = mVar2.f3992e;
        mVar.f3993f = mVar2.f3993f;
        mVar.f3994g = mVar2.f3994g;
        mVar.h = mVar2.h;
        mVar.i = mVar2.i;
        mVar.f3995j = mVar2.f3995j;
        mVar.f3996k = mVar2.f3996k;
        mVar.f3997l = mVar2.f3997l;
        mVar.f3998m = mVar2.f3998m;
        c0327i.f3910a = this.f3910a;
        return c0327i;
    }
}
