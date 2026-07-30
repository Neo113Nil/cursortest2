package r;

import c0.w;
import c7.x;
import com.android.installreferrer.api.InstallReferrerClient;
import d6.z;
import g0.d1;
import l.a1;
import o.n0;
import r1.d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7670g;

    /* renamed from: h, reason: collision with root package name */
    public int f7671h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s f7672i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, int i7, h6.d dVar) {
        super(2, dVar);
        this.f7670g = 0;
        this.f7672i = sVar;
        this.f7671h = i7;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f7670g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new r(this.f7672i, this.f7671h, dVar);
            case 1:
                return new r(this.f7672i, dVar, 1);
            default:
                return new r(this.f7672i, dVar, 2);
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f7670g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                r rVar = (r) create((n0) obj, (h6.d) obj2);
                z zVar = z.f2639a;
                rVar.invokeSuspend(zVar);
                break;
        }
        return ((r) create((x) obj, (h6.d) obj2)).invokeSuspend(z.f2639a);
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f7670g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                d6.a.e(obj);
                int i7 = this.f7671h;
                s sVar = this.f7672i;
                w wVar = sVar.f7677d;
                if (((d1) wVar.f1514b).e() != i7 || ((d1) wVar.f1515c).e() != 0) {
                    sVar.f7686m.c();
                }
                wVar.g(i7, 0);
                wVar.f1516d = null;
                d0 d0Var = sVar.f7683j;
                if (d0Var != null) {
                    d0Var.k();
                }
                return z.f2639a;
            case 1:
                int i8 = this.f7671h;
                if (i8 == 0) {
                    d6.a.e(obj);
                    l.l lVar = this.f7672i.f7695v;
                    Float f9 = new Float(0.0f);
                    a1 k8 = l.e.k(1, new Float(0.5f));
                    this.f7671h = 1;
                    Object e9 = l.e.e(lVar, f9, k8, this);
                    i6.a aVar = i6.a.f4956f;
                    if (e9 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return z.f2639a;
            default:
                int i9 = this.f7671h;
                if (i9 == 0) {
                    d6.a.e(obj);
                    l.l lVar2 = this.f7672i.f7695v;
                    Float f10 = new Float(0.0f);
                    a1 k9 = l.e.k(1, new Float(0.5f));
                    this.f7671h = 1;
                    Object e10 = l.e.e(lVar2, f10, k9, this);
                    i6.a aVar2 = i6.a.f4956f;
                    if (e10 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return z.f2639a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(s sVar, h6.d dVar, int i7) {
        super(2, dVar);
        this.f7670g = i7;
        this.f7672i = sVar;
    }
}
