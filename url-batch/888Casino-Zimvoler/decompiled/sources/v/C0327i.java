package v;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: v.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0327i {

    /* renamed from: a, reason: collision with root package name */
    public int f3911a;

    /* renamed from: b, reason: collision with root package name */
    public final l f3912b;

    /* renamed from: c, reason: collision with root package name */
    public final k f3913c;
    public final C0328j d;

    /* renamed from: e, reason: collision with root package name */
    public final m f3914e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f3915f;

    public C0327i() {
        l lVar = new l();
        lVar.f3986a = 0;
        lVar.f3987b = 0;
        lVar.f3988c = 1.0f;
        lVar.d = Float.NaN;
        this.f3912b = lVar;
        k kVar = new k();
        kVar.f3980a = -1;
        kVar.f3981b = 0;
        kVar.f3982c = -1;
        kVar.d = Float.NaN;
        kVar.f3983e = Float.NaN;
        kVar.f3984f = Float.NaN;
        kVar.f3985g = -1;
        kVar.h = null;
        kVar.i = -1;
        this.f3913c = kVar;
        C0328j c0328j = new C0328j();
        c0328j.f3942a = false;
        c0328j.d = -1;
        c0328j.f3949e = -1;
        c0328j.f3951f = -1.0f;
        c0328j.f3953g = true;
        c0328j.h = -1;
        c0328j.i = -1;
        c0328j.f3957j = -1;
        c0328j.f3958k = -1;
        c0328j.f3960l = -1;
        c0328j.f3962m = -1;
        c0328j.f3964n = -1;
        c0328j.f3966o = -1;
        c0328j.f3968p = -1;
        c0328j.f3969q = -1;
        c0328j.f3970r = -1;
        c0328j.f3971s = -1;
        c0328j.f3972t = -1;
        c0328j.f3973u = -1;
        c0328j.f3974v = -1;
        c0328j.f3975w = 0.5f;
        c0328j.f3976x = 0.5f;
        c0328j.f3977y = null;
        c0328j.f3978z = -1;
        c0328j.f3917A = 0;
        c0328j.f3918B = 0.0f;
        c0328j.f3919C = -1;
        c0328j.f3920D = -1;
        c0328j.f3921E = -1;
        c0328j.F = 0;
        c0328j.f3922G = 0;
        c0328j.f3923H = 0;
        c0328j.f3924I = 0;
        c0328j.f3925J = 0;
        c0328j.f3926K = 0;
        c0328j.f3927L = 0;
        c0328j.f3928M = Integer.MIN_VALUE;
        c0328j.f3929N = Integer.MIN_VALUE;
        c0328j.f3930O = Integer.MIN_VALUE;
        c0328j.f3931P = Integer.MIN_VALUE;
        c0328j.f3932Q = Integer.MIN_VALUE;
        c0328j.f3933R = Integer.MIN_VALUE;
        c0328j.f3934S = Integer.MIN_VALUE;
        c0328j.f3935T = -1.0f;
        c0328j.f3936U = -1.0f;
        c0328j.f3937V = 0;
        c0328j.f3938W = 0;
        c0328j.f3939X = 0;
        c0328j.f3940Y = 0;
        c0328j.f3941Z = 0;
        c0328j.f3943a0 = 0;
        c0328j.f3945b0 = 0;
        c0328j.f3947c0 = 0;
        c0328j.f3948d0 = 1.0f;
        c0328j.f3950e0 = 1.0f;
        c0328j.f3952f0 = -1;
        c0328j.f3954g0 = 0;
        c0328j.f3955h0 = -1;
        c0328j.f3961l0 = false;
        c0328j.f3963m0 = false;
        c0328j.f3965n0 = true;
        c0328j.f3967o0 = 0;
        this.d = c0328j;
        m mVar = new m();
        mVar.f3990a = 0.0f;
        mVar.f3991b = 0.0f;
        mVar.f3992c = 0.0f;
        mVar.d = 1.0f;
        mVar.f3993e = 1.0f;
        mVar.f3994f = Float.NaN;
        mVar.f3995g = Float.NaN;
        mVar.h = -1;
        mVar.i = 0.0f;
        mVar.f3996j = 0.0f;
        mVar.f3997k = 0.0f;
        mVar.f3998l = false;
        mVar.f3999m = 0.0f;
        this.f3914e = mVar;
        this.f3915f = new HashMap();
    }

    public final void a(C0323e c0323e) {
        C0328j c0328j = this.d;
        c0323e.f3861e = c0328j.h;
        c0323e.f3863f = c0328j.i;
        c0323e.f3865g = c0328j.f3957j;
        c0323e.h = c0328j.f3958k;
        c0323e.i = c0328j.f3960l;
        c0323e.f3869j = c0328j.f3962m;
        c0323e.f3870k = c0328j.f3964n;
        c0323e.f3872l = c0328j.f3966o;
        c0323e.f3874m = c0328j.f3968p;
        c0323e.f3876n = c0328j.f3969q;
        c0323e.f3878o = c0328j.f3970r;
        c0323e.f3884s = c0328j.f3971s;
        c0323e.f3885t = c0328j.f3972t;
        c0323e.f3886u = c0328j.f3973u;
        c0323e.f3887v = c0328j.f3974v;
        ((ViewGroup.MarginLayoutParams) c0323e).leftMargin = c0328j.F;
        ((ViewGroup.MarginLayoutParams) c0323e).rightMargin = c0328j.f3922G;
        ((ViewGroup.MarginLayoutParams) c0323e).topMargin = c0328j.f3923H;
        ((ViewGroup.MarginLayoutParams) c0323e).bottomMargin = c0328j.f3924I;
        c0323e.f3829A = c0328j.f3933R;
        c0323e.f3830B = c0328j.f3932Q;
        c0323e.f3889x = c0328j.f3929N;
        c0323e.f3891z = c0328j.f3931P;
        c0323e.f3833E = c0328j.f3975w;
        c0323e.F = c0328j.f3976x;
        c0323e.f3880p = c0328j.f3978z;
        c0323e.f3882q = c0328j.f3917A;
        c0323e.f3883r = c0328j.f3918B;
        c0323e.f3834G = c0328j.f3977y;
        c0323e.f3847T = c0328j.f3919C;
        c0323e.f3848U = c0328j.f3920D;
        c0323e.f3836I = c0328j.f3935T;
        c0323e.f3835H = c0328j.f3936U;
        c0323e.f3838K = c0328j.f3938W;
        c0323e.f3837J = c0328j.f3937V;
        c0323e.f3850W = c0328j.f3961l0;
        c0323e.f3851X = c0328j.f3963m0;
        c0323e.f3839L = c0328j.f3939X;
        c0323e.f3840M = c0328j.f3940Y;
        c0323e.f3843P = c0328j.f3941Z;
        c0323e.f3844Q = c0328j.f3943a0;
        c0323e.f3841N = c0328j.f3945b0;
        c0323e.f3842O = c0328j.f3947c0;
        c0323e.f3845R = c0328j.f3948d0;
        c0323e.f3846S = c0328j.f3950e0;
        c0323e.f3849V = c0328j.f3921E;
        c0323e.f3858c = c0328j.f3951f;
        c0323e.f3854a = c0328j.d;
        c0323e.f3856b = c0328j.f3949e;
        ((ViewGroup.MarginLayoutParams) c0323e).width = c0328j.f3944b;
        ((ViewGroup.MarginLayoutParams) c0323e).height = c0328j.f3946c;
        String str = c0328j.f3959k0;
        if (str != null) {
            c0323e.f3852Y = str;
        }
        c0323e.f3853Z = c0328j.f3967o0;
        c0323e.setMarginStart(c0328j.f3926K);
        c0323e.setMarginEnd(c0328j.f3925J);
        c0323e.a();
    }

    public final Object clone() {
        C0327i c0327i = new C0327i();
        C0328j c0328j = c0327i.d;
        c0328j.getClass();
        C0328j c0328j2 = this.d;
        c0328j.f3942a = c0328j2.f3942a;
        c0328j.f3944b = c0328j2.f3944b;
        c0328j.f3946c = c0328j2.f3946c;
        c0328j.d = c0328j2.d;
        c0328j.f3949e = c0328j2.f3949e;
        c0328j.f3951f = c0328j2.f3951f;
        c0328j.f3953g = c0328j2.f3953g;
        c0328j.h = c0328j2.h;
        c0328j.i = c0328j2.i;
        c0328j.f3957j = c0328j2.f3957j;
        c0328j.f3958k = c0328j2.f3958k;
        c0328j.f3960l = c0328j2.f3960l;
        c0328j.f3962m = c0328j2.f3962m;
        c0328j.f3964n = c0328j2.f3964n;
        c0328j.f3966o = c0328j2.f3966o;
        c0328j.f3968p = c0328j2.f3968p;
        c0328j.f3969q = c0328j2.f3969q;
        c0328j.f3970r = c0328j2.f3970r;
        c0328j.f3971s = c0328j2.f3971s;
        c0328j.f3972t = c0328j2.f3972t;
        c0328j.f3973u = c0328j2.f3973u;
        c0328j.f3974v = c0328j2.f3974v;
        c0328j.f3975w = c0328j2.f3975w;
        c0328j.f3976x = c0328j2.f3976x;
        c0328j.f3977y = c0328j2.f3977y;
        c0328j.f3978z = c0328j2.f3978z;
        c0328j.f3917A = c0328j2.f3917A;
        c0328j.f3918B = c0328j2.f3918B;
        c0328j.f3919C = c0328j2.f3919C;
        c0328j.f3920D = c0328j2.f3920D;
        c0328j.f3921E = c0328j2.f3921E;
        c0328j.F = c0328j2.F;
        c0328j.f3922G = c0328j2.f3922G;
        c0328j.f3923H = c0328j2.f3923H;
        c0328j.f3924I = c0328j2.f3924I;
        c0328j.f3925J = c0328j2.f3925J;
        c0328j.f3926K = c0328j2.f3926K;
        c0328j.f3927L = c0328j2.f3927L;
        c0328j.f3928M = c0328j2.f3928M;
        c0328j.f3929N = c0328j2.f3929N;
        c0328j.f3930O = c0328j2.f3930O;
        c0328j.f3931P = c0328j2.f3931P;
        c0328j.f3932Q = c0328j2.f3932Q;
        c0328j.f3933R = c0328j2.f3933R;
        c0328j.f3934S = c0328j2.f3934S;
        c0328j.f3935T = c0328j2.f3935T;
        c0328j.f3936U = c0328j2.f3936U;
        c0328j.f3937V = c0328j2.f3937V;
        c0328j.f3938W = c0328j2.f3938W;
        c0328j.f3939X = c0328j2.f3939X;
        c0328j.f3940Y = c0328j2.f3940Y;
        c0328j.f3941Z = c0328j2.f3941Z;
        c0328j.f3943a0 = c0328j2.f3943a0;
        c0328j.f3945b0 = c0328j2.f3945b0;
        c0328j.f3947c0 = c0328j2.f3947c0;
        c0328j.f3948d0 = c0328j2.f3948d0;
        c0328j.f3950e0 = c0328j2.f3950e0;
        c0328j.f3952f0 = c0328j2.f3952f0;
        c0328j.f3954g0 = c0328j2.f3954g0;
        c0328j.f3955h0 = c0328j2.f3955h0;
        c0328j.f3959k0 = c0328j2.f3959k0;
        int[] iArr = c0328j2.f3956i0;
        if (iArr == null || c0328j2.j0 != null) {
            c0328j.f3956i0 = null;
        } else {
            c0328j.f3956i0 = Arrays.copyOf(iArr, iArr.length);
        }
        c0328j.j0 = c0328j2.j0;
        c0328j.f3961l0 = c0328j2.f3961l0;
        c0328j.f3963m0 = c0328j2.f3963m0;
        c0328j.f3965n0 = c0328j2.f3965n0;
        c0328j.f3967o0 = c0328j2.f3967o0;
        k kVar = c0327i.f3913c;
        kVar.getClass();
        k kVar2 = this.f3913c;
        kVar2.getClass();
        kVar.f3980a = kVar2.f3980a;
        kVar.f3982c = kVar2.f3982c;
        kVar.f3983e = kVar2.f3983e;
        kVar.d = kVar2.d;
        l lVar = c0327i.f3912b;
        l lVar2 = this.f3912b;
        lVar.f3986a = lVar2.f3986a;
        lVar.f3988c = lVar2.f3988c;
        lVar.d = lVar2.d;
        lVar.f3987b = lVar2.f3987b;
        m mVar = c0327i.f3914e;
        mVar.getClass();
        m mVar2 = this.f3914e;
        mVar2.getClass();
        mVar.f3990a = mVar2.f3990a;
        mVar.f3991b = mVar2.f3991b;
        mVar.f3992c = mVar2.f3992c;
        mVar.d = mVar2.d;
        mVar.f3993e = mVar2.f3993e;
        mVar.f3994f = mVar2.f3994f;
        mVar.f3995g = mVar2.f3995g;
        mVar.h = mVar2.h;
        mVar.i = mVar2.i;
        mVar.f3996j = mVar2.f3996j;
        mVar.f3997k = mVar2.f3997k;
        mVar.f3998l = mVar2.f3998l;
        mVar.f3999m = mVar2.f3999m;
        c0327i.f3911a = this.f3911a;
        return c0327i;
    }
}
