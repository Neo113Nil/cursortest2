package c0;

import c7.a0;
import com.android.installreferrer.api.InstallReferrerClient;
import d6.z;
import l.o0;
import l.p1;
import l.r0;
import l.x0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1508g = 2;

    /* renamed from: h, reason: collision with root package name */
    public float f1509h;

    /* renamed from: i, reason: collision with root package name */
    public int f1510i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f1511j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1512k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(float f9, x0 x0Var, t3.h hVar, h6.d dVar) {
        super(2, dVar);
        this.f1509h = f9;
        this.f1511j = x0Var;
        this.f1512k = hVar;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f1508g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new v((w) this.f1511j, this.f1509h, (l.k) this.f1512k, dVar);
            case 1:
                v vVar = new v((p1) this.f1512k, dVar);
                vVar.f1511j = obj;
                return vVar;
            default:
                return new v(this.f1509h, (x0) this.f1511j, (t3.h) this.f1512k, dVar);
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        c7.x xVar = (c7.x) obj;
        h6.d dVar = (h6.d) obj2;
        switch (this.f1508g) {
        }
        return ((v) create(xVar, dVar)).invokeSuspend(z.f2639a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x003d, code lost:
    
        if (r0.m(r1, r0.f5706b.getValue(), r8) == r7) goto L30;
     */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        float i7;
        c7.x xVar;
        Object a3;
        switch (this.f1508g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i8 = this.f1510i;
                if (i8 == 0) {
                    d6.a.e(obj);
                    l.d dVar = (l.d) ((w) this.f1511j).f1515c;
                    Float f9 = new Float(this.f1509h);
                    l.k kVar = (l.k) this.f1512k;
                    this.f1510i = 1;
                    Object c4 = l.d.c(dVar, f9, kVar, null, this, 12);
                    i6.a aVar = i6.a.f4956f;
                    if (c4 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return z.f2639a;
            case 1:
                int i9 = this.f1510i;
                if (i9 == 0) {
                    d6.a.e(obj);
                    c7.x xVar2 = (c7.x) this.f1511j;
                    i7 = l.e.i(xVar2.k());
                    xVar = xVar2;
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i7 = this.f1509h;
                    xVar = (c7.x) this.f1511j;
                    d6.a.e(obj);
                }
                while (a0.n(xVar)) {
                    e0.i iVar = new e0.i((p1) this.f1512k, i7);
                    this.f1511j = xVar;
                    this.f1509h = i7;
                    this.f1510i = 1;
                    Object t2 = g0.d.E(getContext()).t(iVar, this);
                    i6.a aVar2 = i6.a.f4956f;
                    if (t2 == aVar2) {
                        return aVar2;
                    }
                }
                return z.f2639a;
            default:
                x0 x0Var = (x0) this.f1511j;
                float f10 = this.f1509h;
                int i10 = this.f1510i;
                z zVar = z.f2639a;
                i6.a aVar3 = i6.a.f4956f;
                if (i10 == 0) {
                    d6.a.e(obj);
                    if (f10 > 0.0f) {
                        this.f1510i = 1;
                        break;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        d6.a.e(obj);
                        return zVar;
                    }
                    d6.a.e(obj);
                }
                if (f10 != 0.0f) {
                    return zVar;
                }
                t3.h hVar = (t3.h) this.f1512k;
                this.f1510i = 2;
                p1 p1Var = x0Var.f5709e;
                if (p1Var == null || ((r6.k.a(x0Var.f5707c.getValue(), hVar) && r6.k.a(x0Var.f5706b.getValue(), hVar)) || (a3 = o0.a(x0Var.f5715k, new r0(x0Var, hVar, p1Var, (h6.d) null), this)) != aVar3)) {
                    a3 = zVar;
                }
                if (a3 != aVar3) {
                    return zVar;
                }
                return aVar3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, float f9, l.k kVar, h6.d dVar) {
        super(2, dVar);
        this.f1511j = wVar;
        this.f1509h = f9;
        this.f1512k = kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(p1 p1Var, h6.d dVar) {
        super(2, dVar);
        this.f1512k = p1Var;
    }
}
