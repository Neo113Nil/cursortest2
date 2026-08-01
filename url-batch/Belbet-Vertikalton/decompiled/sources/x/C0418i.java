package x;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: x.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0418i {

    /* renamed from: a, reason: collision with root package name */
    public int f4606a;

    /* renamed from: b, reason: collision with root package name */
    public final l f4607b;

    /* renamed from: c, reason: collision with root package name */
    public final k f4608c;

    /* renamed from: d, reason: collision with root package name */
    public final C0419j f4609d;
    public final m e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f4610f;

    public C0418i() {
        l lVar = new l();
        lVar.f4681a = 0;
        lVar.f4682b = 0;
        lVar.f4683c = 1.0f;
        lVar.f4684d = Float.NaN;
        this.f4607b = lVar;
        k kVar = new k();
        kVar.f4674a = -1;
        kVar.f4675b = 0;
        kVar.f4676c = -1;
        kVar.f4677d = Float.NaN;
        kVar.e = Float.NaN;
        kVar.f4678f = Float.NaN;
        kVar.f4679g = -1;
        kVar.f4680h = null;
        kVar.i = -1;
        this.f4608c = kVar;
        C0419j c0419j = new C0419j();
        c0419j.f4637a = false;
        c0419j.f4643d = -1;
        c0419j.e = -1;
        c0419j.f4646f = -1.0f;
        c0419j.f4648g = true;
        c0419j.f4650h = -1;
        c0419j.i = -1;
        c0419j.j = -1;
        c0419j.f4654k = -1;
        c0419j.f4656l = -1;
        c0419j.f4658m = -1;
        c0419j.f4660n = -1;
        c0419j.f4662o = -1;
        c0419j.f4663p = -1;
        c0419j.f4664q = -1;
        c0419j.f4665r = -1;
        c0419j.f4666s = -1;
        c0419j.f4667t = -1;
        c0419j.f4668u = -1;
        c0419j.f4669v = -1;
        c0419j.f4670w = 0.5f;
        c0419j.f4671x = 0.5f;
        c0419j.f4672y = null;
        c0419j.f4673z = -1;
        c0419j.f4612A = 0;
        c0419j.f4613B = 0.0f;
        c0419j.f4614C = -1;
        c0419j.f4615D = -1;
        c0419j.f4616E = -1;
        c0419j.f4617F = 0;
        c0419j.f4618G = 0;
        c0419j.H = 0;
        c0419j.f4619I = 0;
        c0419j.f4620J = 0;
        c0419j.f4621K = 0;
        c0419j.f4622L = 0;
        c0419j.f4623M = Integer.MIN_VALUE;
        c0419j.f4624N = Integer.MIN_VALUE;
        c0419j.f4625O = Integer.MIN_VALUE;
        c0419j.f4626P = Integer.MIN_VALUE;
        c0419j.f4627Q = Integer.MIN_VALUE;
        c0419j.f4628R = Integer.MIN_VALUE;
        c0419j.f4629S = Integer.MIN_VALUE;
        c0419j.f4630T = -1.0f;
        c0419j.f4631U = -1.0f;
        c0419j.f4632V = 0;
        c0419j.f4633W = 0;
        c0419j.f4634X = 0;
        c0419j.f4635Y = 0;
        c0419j.f4636Z = 0;
        c0419j.f4638a0 = 0;
        c0419j.f4640b0 = 0;
        c0419j.f4642c0 = 0;
        c0419j.f4644d0 = 1.0f;
        c0419j.f4645e0 = 1.0f;
        c0419j.f4647f0 = -1;
        c0419j.f4649g0 = 0;
        c0419j.f4651h0 = -1;
        c0419j.f4657l0 = false;
        c0419j.f4659m0 = false;
        c0419j.f4661n0 = true;
        c0419j.o0 = 0;
        this.f4609d = c0419j;
        m mVar = new m();
        mVar.f4686a = 0.0f;
        mVar.f4687b = 0.0f;
        mVar.f4688c = 0.0f;
        mVar.f4689d = 1.0f;
        mVar.e = 1.0f;
        mVar.f4690f = Float.NaN;
        mVar.f4691g = Float.NaN;
        mVar.f4692h = -1;
        mVar.i = 0.0f;
        mVar.j = 0.0f;
        mVar.f4693k = 0.0f;
        mVar.f4694l = false;
        mVar.f4695m = 0.0f;
        this.e = mVar;
        this.f4610f = new HashMap();
    }

    public final void a(C0414e c0414e) {
        C0419j c0419j = this.f4609d;
        c0414e.e = c0419j.f4650h;
        c0414e.f4557f = c0419j.i;
        c0414e.f4559g = c0419j.j;
        c0414e.f4561h = c0419j.f4654k;
        c0414e.i = c0419j.f4656l;
        c0414e.j = c0419j.f4658m;
        c0414e.f4565k = c0419j.f4660n;
        c0414e.f4567l = c0419j.f4662o;
        c0414e.f4569m = c0419j.f4663p;
        c0414e.f4571n = c0419j.f4664q;
        c0414e.f4573o = c0419j.f4665r;
        c0414e.f4578s = c0419j.f4666s;
        c0414e.f4579t = c0419j.f4667t;
        c0414e.f4580u = c0419j.f4668u;
        c0414e.f4581v = c0419j.f4669v;
        ((ViewGroup.MarginLayoutParams) c0414e).leftMargin = c0419j.f4617F;
        ((ViewGroup.MarginLayoutParams) c0414e).rightMargin = c0419j.f4618G;
        ((ViewGroup.MarginLayoutParams) c0414e).topMargin = c0419j.H;
        ((ViewGroup.MarginLayoutParams) c0414e).bottomMargin = c0419j.f4619I;
        c0414e.f4523A = c0419j.f4628R;
        c0414e.f4524B = c0419j.f4627Q;
        c0414e.f4583x = c0419j.f4624N;
        c0414e.f4585z = c0419j.f4626P;
        c0414e.f4527E = c0419j.f4670w;
        c0414e.f4528F = c0419j.f4671x;
        c0414e.f4574p = c0419j.f4673z;
        c0414e.f4576q = c0419j.f4612A;
        c0414e.f4577r = c0419j.f4613B;
        c0414e.f4529G = c0419j.f4672y;
        c0414e.f4541T = c0419j.f4614C;
        c0414e.f4542U = c0419j.f4615D;
        c0414e.f4530I = c0419j.f4630T;
        c0414e.H = c0419j.f4631U;
        c0414e.f4532K = c0419j.f4633W;
        c0414e.f4531J = c0419j.f4632V;
        c0414e.f4544W = c0419j.f4657l0;
        c0414e.f4545X = c0419j.f4659m0;
        c0414e.f4533L = c0419j.f4634X;
        c0414e.f4534M = c0419j.f4635Y;
        c0414e.f4537P = c0419j.f4636Z;
        c0414e.f4538Q = c0419j.f4638a0;
        c0414e.f4535N = c0419j.f4640b0;
        c0414e.f4536O = c0419j.f4642c0;
        c0414e.f4539R = c0419j.f4644d0;
        c0414e.f4540S = c0419j.f4645e0;
        c0414e.f4543V = c0419j.f4616E;
        c0414e.f4552c = c0419j.f4646f;
        c0414e.f4548a = c0419j.f4643d;
        c0414e.f4550b = c0419j.e;
        ((ViewGroup.MarginLayoutParams) c0414e).width = c0419j.f4639b;
        ((ViewGroup.MarginLayoutParams) c0414e).height = c0419j.f4641c;
        String str = c0419j.f4655k0;
        if (str != null) {
            c0414e.f4546Y = str;
        }
        c0414e.f4547Z = c0419j.o0;
        c0414e.setMarginStart(c0419j.f4621K);
        c0414e.setMarginEnd(c0419j.f4620J);
        c0414e.a();
    }

    public final Object clone() {
        C0418i c0418i = new C0418i();
        C0419j c0419j = c0418i.f4609d;
        c0419j.getClass();
        C0419j c0419j2 = this.f4609d;
        c0419j.f4637a = c0419j2.f4637a;
        c0419j.f4639b = c0419j2.f4639b;
        c0419j.f4641c = c0419j2.f4641c;
        c0419j.f4643d = c0419j2.f4643d;
        c0419j.e = c0419j2.e;
        c0419j.f4646f = c0419j2.f4646f;
        c0419j.f4648g = c0419j2.f4648g;
        c0419j.f4650h = c0419j2.f4650h;
        c0419j.i = c0419j2.i;
        c0419j.j = c0419j2.j;
        c0419j.f4654k = c0419j2.f4654k;
        c0419j.f4656l = c0419j2.f4656l;
        c0419j.f4658m = c0419j2.f4658m;
        c0419j.f4660n = c0419j2.f4660n;
        c0419j.f4662o = c0419j2.f4662o;
        c0419j.f4663p = c0419j2.f4663p;
        c0419j.f4664q = c0419j2.f4664q;
        c0419j.f4665r = c0419j2.f4665r;
        c0419j.f4666s = c0419j2.f4666s;
        c0419j.f4667t = c0419j2.f4667t;
        c0419j.f4668u = c0419j2.f4668u;
        c0419j.f4669v = c0419j2.f4669v;
        c0419j.f4670w = c0419j2.f4670w;
        c0419j.f4671x = c0419j2.f4671x;
        c0419j.f4672y = c0419j2.f4672y;
        c0419j.f4673z = c0419j2.f4673z;
        c0419j.f4612A = c0419j2.f4612A;
        c0419j.f4613B = c0419j2.f4613B;
        c0419j.f4614C = c0419j2.f4614C;
        c0419j.f4615D = c0419j2.f4615D;
        c0419j.f4616E = c0419j2.f4616E;
        c0419j.f4617F = c0419j2.f4617F;
        c0419j.f4618G = c0419j2.f4618G;
        c0419j.H = c0419j2.H;
        c0419j.f4619I = c0419j2.f4619I;
        c0419j.f4620J = c0419j2.f4620J;
        c0419j.f4621K = c0419j2.f4621K;
        c0419j.f4622L = c0419j2.f4622L;
        c0419j.f4623M = c0419j2.f4623M;
        c0419j.f4624N = c0419j2.f4624N;
        c0419j.f4625O = c0419j2.f4625O;
        c0419j.f4626P = c0419j2.f4626P;
        c0419j.f4627Q = c0419j2.f4627Q;
        c0419j.f4628R = c0419j2.f4628R;
        c0419j.f4629S = c0419j2.f4629S;
        c0419j.f4630T = c0419j2.f4630T;
        c0419j.f4631U = c0419j2.f4631U;
        c0419j.f4632V = c0419j2.f4632V;
        c0419j.f4633W = c0419j2.f4633W;
        c0419j.f4634X = c0419j2.f4634X;
        c0419j.f4635Y = c0419j2.f4635Y;
        c0419j.f4636Z = c0419j2.f4636Z;
        c0419j.f4638a0 = c0419j2.f4638a0;
        c0419j.f4640b0 = c0419j2.f4640b0;
        c0419j.f4642c0 = c0419j2.f4642c0;
        c0419j.f4644d0 = c0419j2.f4644d0;
        c0419j.f4645e0 = c0419j2.f4645e0;
        c0419j.f4647f0 = c0419j2.f4647f0;
        c0419j.f4649g0 = c0419j2.f4649g0;
        c0419j.f4651h0 = c0419j2.f4651h0;
        c0419j.f4655k0 = c0419j2.f4655k0;
        int[] iArr = c0419j2.f4652i0;
        if (iArr == null || c0419j2.f4653j0 != null) {
            c0419j.f4652i0 = null;
        } else {
            c0419j.f4652i0 = Arrays.copyOf(iArr, iArr.length);
        }
        c0419j.f4653j0 = c0419j2.f4653j0;
        c0419j.f4657l0 = c0419j2.f4657l0;
        c0419j.f4659m0 = c0419j2.f4659m0;
        c0419j.f4661n0 = c0419j2.f4661n0;
        c0419j.o0 = c0419j2.o0;
        k kVar = c0418i.f4608c;
        kVar.getClass();
        k kVar2 = this.f4608c;
        kVar2.getClass();
        kVar.f4674a = kVar2.f4674a;
        kVar.f4676c = kVar2.f4676c;
        kVar.e = kVar2.e;
        kVar.f4677d = kVar2.f4677d;
        l lVar = c0418i.f4607b;
        l lVar2 = this.f4607b;
        lVar.f4681a = lVar2.f4681a;
        lVar.f4683c = lVar2.f4683c;
        lVar.f4684d = lVar2.f4684d;
        lVar.f4682b = lVar2.f4682b;
        m mVar = c0418i.e;
        mVar.getClass();
        m mVar2 = this.e;
        mVar2.getClass();
        mVar.f4686a = mVar2.f4686a;
        mVar.f4687b = mVar2.f4687b;
        mVar.f4688c = mVar2.f4688c;
        mVar.f4689d = mVar2.f4689d;
        mVar.e = mVar2.e;
        mVar.f4690f = mVar2.f4690f;
        mVar.f4691g = mVar2.f4691g;
        mVar.f4692h = mVar2.f4692h;
        mVar.i = mVar2.i;
        mVar.j = mVar2.j;
        mVar.f4693k = mVar2.f4693k;
        mVar.f4694l = mVar2.f4694l;
        mVar.f4695m = mVar2.f4695m;
        c0418i.f4606a = this.f4606a;
        return c0418i;
    }
}
