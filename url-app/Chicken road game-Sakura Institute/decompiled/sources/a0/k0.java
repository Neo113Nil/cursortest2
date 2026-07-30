package a0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k0 extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f95g = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f96h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f97i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f98j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(long j8, l1.c0 c0Var, h6.d dVar) {
        super(2, dVar);
        this.f97i = j8;
        this.f98j = c0Var;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f95g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new k0((l.d) this.f98j, this.f97i, dVar);
            default:
                return new k0(this.f97i, (l1.c0) this.f98j, dVar);
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        c7.x xVar = (c7.x) obj;
        h6.d dVar = (h6.d) obj2;
        switch (this.f95g) {
        }
        return ((k0) create(xVar, dVar)).invokeSuspend(d6.z.f2639a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c7.h hVar;
        switch (this.f95g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i7 = this.f96h;
                if (i7 == 0) {
                    d6.a.e(obj);
                    l.d dVar = (l.d) this.f98j;
                    y0.c cVar = new y0.c(this.f97i);
                    l.a1 a1Var = m0.f109d;
                    this.f96h = 1;
                    Object c4 = l.d.c(dVar, cVar, a1Var, null, this, 12);
                    i6.a aVar = i6.a.f4956f;
                    if (c4 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return d6.z.f2639a;
            default:
                int i8 = this.f96h;
                long j8 = this.f97i;
                i6.a aVar2 = i6.a.f4956f;
                if (i8 == 0) {
                    d6.a.e(obj);
                    this.f96h = 1;
                    if (c7.a0.e(j8 - 1, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        d6.a.e(obj);
                        hVar = ((l1.c0) this.f98j).f5782h;
                        if (hVar != null) {
                            hVar.resumeWith(d6.a.b(new l1.l(j8)));
                        }
                        return d6.z.f2639a;
                    }
                    d6.a.e(obj);
                }
                this.f96h = 2;
                if (c7.a0.e(1L, this) == aVar2) {
                    return aVar2;
                }
                hVar = ((l1.c0) this.f98j).f5782h;
                if (hVar != null) {
                }
                return d6.z.f2639a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(l.d dVar, long j8, h6.d dVar2) {
        super(2, dVar2);
        this.f98j = dVar;
        this.f97i = j8;
    }
}
