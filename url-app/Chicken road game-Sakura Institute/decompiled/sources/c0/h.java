package c0;

import com.android.installreferrer.api.InstallReferrerClient;
import d6.z;
import l.v1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1462g;

    /* renamed from: h, reason: collision with root package name */
    public int f1463h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f1464i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j jVar, h6.d dVar, int i7) {
        super(2, dVar);
        this.f1462g = i7;
        this.f1464i = jVar;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f1462g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new h(this.f1464i, dVar, 0);
            case 1:
                return new h(this.f1464i, dVar, 1);
            case 2:
                return new h(this.f1464i, dVar, 2);
            default:
                return new h(this.f1464i, dVar, 3);
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        c7.x xVar = (c7.x) obj;
        h6.d dVar = (h6.d) obj2;
        switch (this.f1462g) {
        }
        return ((h) create(xVar, dVar)).invokeSuspend(z.f2639a);
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f1462g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i7 = this.f1463h;
                if (i7 == 0) {
                    d6.a.e(obj);
                    l.d dVar = this.f1464i.f1473f;
                    Float f9 = new Float(1.0f);
                    v1 l8 = l.e.l(75, 2, l.z.f5734c);
                    this.f1463h = 1;
                    Object c4 = l.d.c(dVar, f9, l8, null, this, 12);
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
                return z.f2639a;
            case 1:
                int i8 = this.f1463h;
                if (i8 == 0) {
                    d6.a.e(obj);
                    l.d dVar2 = this.f1464i.f1474g;
                    Float f10 = new Float(1.0f);
                    v1 l9 = l.e.l(225, 2, l.z.f5732a);
                    this.f1463h = 1;
                    Object c6 = l.d.c(dVar2, f10, l9, null, this, 12);
                    i6.a aVar2 = i6.a.f4956f;
                    if (c6 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return z.f2639a;
            case 2:
                int i9 = this.f1463h;
                if (i9 == 0) {
                    d6.a.e(obj);
                    l.d dVar3 = this.f1464i.f1475h;
                    Float f11 = new Float(1.0f);
                    v1 l10 = l.e.l(225, 2, l.z.f5734c);
                    this.f1463h = 1;
                    Object c9 = l.d.c(dVar3, f11, l10, null, this, 12);
                    i6.a aVar3 = i6.a.f4956f;
                    if (c9 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return z.f2639a;
            default:
                int i10 = this.f1463h;
                if (i10 == 0) {
                    d6.a.e(obj);
                    l.d dVar4 = this.f1464i.f1473f;
                    Float f12 = new Float(0.0f);
                    v1 l11 = l.e.l(150, 2, l.z.f5734c);
                    this.f1463h = 1;
                    Object c10 = l.d.c(dVar4, f12, l11, null, this, 12);
                    i6.a aVar4 = i6.a.f4956f;
                    if (c10 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                }
                return z.f2639a;
        }
    }
}
