package v;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: v.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0328i {

    /* renamed from: a, reason: collision with root package name */
    public int f3916a;

    /* renamed from: b, reason: collision with root package name */
    public final l f3917b;

    /* renamed from: c, reason: collision with root package name */
    public final k f3918c;
    public final C0329j d;

    /* renamed from: e, reason: collision with root package name */
    public final m f3919e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f3920f;

    public C0328i() {
        l lVar = new l();
        lVar.f3991a = 0;
        lVar.f3992b = 0;
        lVar.f3993c = 1.0f;
        lVar.d = Float.NaN;
        this.f3917b = lVar;
        k kVar = new k();
        kVar.f3985a = -1;
        kVar.f3986b = 0;
        kVar.f3987c = -1;
        kVar.d = Float.NaN;
        kVar.f3988e = Float.NaN;
        kVar.f3989f = Float.NaN;
        kVar.f3990g = -1;
        kVar.h = null;
        kVar.i = -1;
        this.f3918c = kVar;
        C0329j c0329j = new C0329j();
        c0329j.f3947a = false;
        c0329j.d = -1;
        c0329j.f3954e = -1;
        c0329j.f3956f = -1.0f;
        c0329j.f3958g = true;
        c0329j.h = -1;
        c0329j.i = -1;
        c0329j.f3962j = -1;
        c0329j.f3963k = -1;
        c0329j.f3965l = -1;
        c0329j.f3967m = -1;
        c0329j.f3969n = -1;
        c0329j.f3971o = -1;
        c0329j.f3973p = -1;
        c0329j.f3974q = -1;
        c0329j.f3975r = -1;
        c0329j.f3976s = -1;
        c0329j.f3977t = -1;
        c0329j.f3978u = -1;
        c0329j.f3979v = -1;
        c0329j.f3980w = 0.5f;
        c0329j.f3981x = 0.5f;
        c0329j.f3982y = null;
        c0329j.f3983z = -1;
        c0329j.f3922A = 0;
        c0329j.f3923B = 0.0f;
        c0329j.f3924C = -1;
        c0329j.f3925D = -1;
        c0329j.f3926E = -1;
        c0329j.F = 0;
        c0329j.f3927G = 0;
        c0329j.f3928H = 0;
        c0329j.f3929I = 0;
        c0329j.f3930J = 0;
        c0329j.f3931K = 0;
        c0329j.f3932L = 0;
        c0329j.f3933M = Integer.MIN_VALUE;
        c0329j.f3934N = Integer.MIN_VALUE;
        c0329j.f3935O = Integer.MIN_VALUE;
        c0329j.f3936P = Integer.MIN_VALUE;
        c0329j.f3937Q = Integer.MIN_VALUE;
        c0329j.f3938R = Integer.MIN_VALUE;
        c0329j.f3939S = Integer.MIN_VALUE;
        c0329j.f3940T = -1.0f;
        c0329j.f3941U = -1.0f;
        c0329j.f3942V = 0;
        c0329j.f3943W = 0;
        c0329j.f3944X = 0;
        c0329j.f3945Y = 0;
        c0329j.f3946Z = 0;
        c0329j.f3948a0 = 0;
        c0329j.f3950b0 = 0;
        c0329j.f3952c0 = 0;
        c0329j.f3953d0 = 1.0f;
        c0329j.f3955e0 = 1.0f;
        c0329j.f3957f0 = -1;
        c0329j.f3959g0 = 0;
        c0329j.f3960h0 = -1;
        c0329j.f3966l0 = false;
        c0329j.f3968m0 = false;
        c0329j.f3970n0 = true;
        c0329j.f3972o0 = 0;
        this.d = c0329j;
        m mVar = new m();
        mVar.f3995a = 0.0f;
        mVar.f3996b = 0.0f;
        mVar.f3997c = 0.0f;
        mVar.d = 1.0f;
        mVar.f3998e = 1.0f;
        mVar.f3999f = Float.NaN;
        mVar.f4000g = Float.NaN;
        mVar.h = -1;
        mVar.i = 0.0f;
        mVar.f4001j = 0.0f;
        mVar.f4002k = 0.0f;
        mVar.f4003l = false;
        mVar.f4004m = 0.0f;
        this.f3919e = mVar;
        this.f3920f = new HashMap();
    }

    public final void a(C0324e c0324e) {
        C0329j c0329j = this.d;
        c0324e.f3866e = c0329j.h;
        c0324e.f3868f = c0329j.i;
        c0324e.f3870g = c0329j.f3962j;
        c0324e.h = c0329j.f3963k;
        c0324e.i = c0329j.f3965l;
        c0324e.f3874j = c0329j.f3967m;
        c0324e.f3875k = c0329j.f3969n;
        c0324e.f3877l = c0329j.f3971o;
        c0324e.f3879m = c0329j.f3973p;
        c0324e.f3881n = c0329j.f3974q;
        c0324e.f3883o = c0329j.f3975r;
        c0324e.f3889s = c0329j.f3976s;
        c0324e.f3890t = c0329j.f3977t;
        c0324e.f3891u = c0329j.f3978u;
        c0324e.f3892v = c0329j.f3979v;
        ((ViewGroup.MarginLayoutParams) c0324e).leftMargin = c0329j.F;
        ((ViewGroup.MarginLayoutParams) c0324e).rightMargin = c0329j.f3927G;
        ((ViewGroup.MarginLayoutParams) c0324e).topMargin = c0329j.f3928H;
        ((ViewGroup.MarginLayoutParams) c0324e).bottomMargin = c0329j.f3929I;
        c0324e.f3834A = c0329j.f3938R;
        c0324e.f3835B = c0329j.f3937Q;
        c0324e.f3894x = c0329j.f3934N;
        c0324e.f3896z = c0329j.f3936P;
        c0324e.f3838E = c0329j.f3980w;
        c0324e.F = c0329j.f3981x;
        c0324e.f3885p = c0329j.f3983z;
        c0324e.f3887q = c0329j.f3922A;
        c0324e.f3888r = c0329j.f3923B;
        c0324e.f3839G = c0329j.f3982y;
        c0324e.f3852T = c0329j.f3924C;
        c0324e.f3853U = c0329j.f3925D;
        c0324e.f3841I = c0329j.f3940T;
        c0324e.f3840H = c0329j.f3941U;
        c0324e.f3843K = c0329j.f3943W;
        c0324e.f3842J = c0329j.f3942V;
        c0324e.f3855W = c0329j.f3966l0;
        c0324e.f3856X = c0329j.f3968m0;
        c0324e.f3844L = c0329j.f3944X;
        c0324e.f3845M = c0329j.f3945Y;
        c0324e.f3848P = c0329j.f3946Z;
        c0324e.f3849Q = c0329j.f3948a0;
        c0324e.f3846N = c0329j.f3950b0;
        c0324e.f3847O = c0329j.f3952c0;
        c0324e.f3850R = c0329j.f3953d0;
        c0324e.f3851S = c0329j.f3955e0;
        c0324e.f3854V = c0329j.f3926E;
        c0324e.f3863c = c0329j.f3956f;
        c0324e.f3859a = c0329j.d;
        c0324e.f3861b = c0329j.f3954e;
        ((ViewGroup.MarginLayoutParams) c0324e).width = c0329j.f3949b;
        ((ViewGroup.MarginLayoutParams) c0324e).height = c0329j.f3951c;
        String str = c0329j.f3964k0;
        if (str != null) {
            c0324e.f3857Y = str;
        }
        c0324e.f3858Z = c0329j.f3972o0;
        c0324e.setMarginStart(c0329j.f3931K);
        c0324e.setMarginEnd(c0329j.f3930J);
        c0324e.a();
    }

    public final Object clone() {
        C0328i c0328i = new C0328i();
        C0329j c0329j = c0328i.d;
        c0329j.getClass();
        C0329j c0329j2 = this.d;
        c0329j.f3947a = c0329j2.f3947a;
        c0329j.f3949b = c0329j2.f3949b;
        c0329j.f3951c = c0329j2.f3951c;
        c0329j.d = c0329j2.d;
        c0329j.f3954e = c0329j2.f3954e;
        c0329j.f3956f = c0329j2.f3956f;
        c0329j.f3958g = c0329j2.f3958g;
        c0329j.h = c0329j2.h;
        c0329j.i = c0329j2.i;
        c0329j.f3962j = c0329j2.f3962j;
        c0329j.f3963k = c0329j2.f3963k;
        c0329j.f3965l = c0329j2.f3965l;
        c0329j.f3967m = c0329j2.f3967m;
        c0329j.f3969n = c0329j2.f3969n;
        c0329j.f3971o = c0329j2.f3971o;
        c0329j.f3973p = c0329j2.f3973p;
        c0329j.f3974q = c0329j2.f3974q;
        c0329j.f3975r = c0329j2.f3975r;
        c0329j.f3976s = c0329j2.f3976s;
        c0329j.f3977t = c0329j2.f3977t;
        c0329j.f3978u = c0329j2.f3978u;
        c0329j.f3979v = c0329j2.f3979v;
        c0329j.f3980w = c0329j2.f3980w;
        c0329j.f3981x = c0329j2.f3981x;
        c0329j.f3982y = c0329j2.f3982y;
        c0329j.f3983z = c0329j2.f3983z;
        c0329j.f3922A = c0329j2.f3922A;
        c0329j.f3923B = c0329j2.f3923B;
        c0329j.f3924C = c0329j2.f3924C;
        c0329j.f3925D = c0329j2.f3925D;
        c0329j.f3926E = c0329j2.f3926E;
        c0329j.F = c0329j2.F;
        c0329j.f3927G = c0329j2.f3927G;
        c0329j.f3928H = c0329j2.f3928H;
        c0329j.f3929I = c0329j2.f3929I;
        c0329j.f3930J = c0329j2.f3930J;
        c0329j.f3931K = c0329j2.f3931K;
        c0329j.f3932L = c0329j2.f3932L;
        c0329j.f3933M = c0329j2.f3933M;
        c0329j.f3934N = c0329j2.f3934N;
        c0329j.f3935O = c0329j2.f3935O;
        c0329j.f3936P = c0329j2.f3936P;
        c0329j.f3937Q = c0329j2.f3937Q;
        c0329j.f3938R = c0329j2.f3938R;
        c0329j.f3939S = c0329j2.f3939S;
        c0329j.f3940T = c0329j2.f3940T;
        c0329j.f3941U = c0329j2.f3941U;
        c0329j.f3942V = c0329j2.f3942V;
        c0329j.f3943W = c0329j2.f3943W;
        c0329j.f3944X = c0329j2.f3944X;
        c0329j.f3945Y = c0329j2.f3945Y;
        c0329j.f3946Z = c0329j2.f3946Z;
        c0329j.f3948a0 = c0329j2.f3948a0;
        c0329j.f3950b0 = c0329j2.f3950b0;
        c0329j.f3952c0 = c0329j2.f3952c0;
        c0329j.f3953d0 = c0329j2.f3953d0;
        c0329j.f3955e0 = c0329j2.f3955e0;
        c0329j.f3957f0 = c0329j2.f3957f0;
        c0329j.f3959g0 = c0329j2.f3959g0;
        c0329j.f3960h0 = c0329j2.f3960h0;
        c0329j.f3964k0 = c0329j2.f3964k0;
        int[] iArr = c0329j2.f3961i0;
        if (iArr == null || c0329j2.j0 != null) {
            c0329j.f3961i0 = null;
        } else {
            c0329j.f3961i0 = Arrays.copyOf(iArr, iArr.length);
        }
        c0329j.j0 = c0329j2.j0;
        c0329j.f3966l0 = c0329j2.f3966l0;
        c0329j.f3968m0 = c0329j2.f3968m0;
        c0329j.f3970n0 = c0329j2.f3970n0;
        c0329j.f3972o0 = c0329j2.f3972o0;
        k kVar = c0328i.f3918c;
        kVar.getClass();
        k kVar2 = this.f3918c;
        kVar2.getClass();
        kVar.f3985a = kVar2.f3985a;
        kVar.f3987c = kVar2.f3987c;
        kVar.f3988e = kVar2.f3988e;
        kVar.d = kVar2.d;
        l lVar = c0328i.f3917b;
        l lVar2 = this.f3917b;
        lVar.f3991a = lVar2.f3991a;
        lVar.f3993c = lVar2.f3993c;
        lVar.d = lVar2.d;
        lVar.f3992b = lVar2.f3992b;
        m mVar = c0328i.f3919e;
        mVar.getClass();
        m mVar2 = this.f3919e;
        mVar2.getClass();
        mVar.f3995a = mVar2.f3995a;
        mVar.f3996b = mVar2.f3996b;
        mVar.f3997c = mVar2.f3997c;
        mVar.d = mVar2.d;
        mVar.f3998e = mVar2.f3998e;
        mVar.f3999f = mVar2.f3999f;
        mVar.f4000g = mVar2.f4000g;
        mVar.h = mVar2.h;
        mVar.i = mVar2.i;
        mVar.f4001j = mVar2.f4001j;
        mVar.f4002k = mVar2.f4002k;
        mVar.f4003l = mVar2.f4003l;
        mVar.f4004m = mVar2.f4004m;
        c0328i.f3916a = this.f3916a;
        return c0328i;
    }
}
