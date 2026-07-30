package o;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j1 extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6660g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m0 f6661h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(m0 m0Var, h6.d dVar, int i7) {
        super(2, dVar);
        this.f6660g = i7;
        this.f6661h = m0Var;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f6660g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new j1(this.f6661h, dVar, 0);
            case 1:
                return new j1(this.f6661h, dVar, 1);
            case 2:
                return new j1(this.f6661h, dVar, 2);
            case 3:
                return new j1(this.f6661h, dVar, 3);
            case 4:
                return new j1(this.f6661h, dVar, 4);
            case 5:
                return new j1(this.f6661h, dVar, 5);
            case 6:
                return new j1(this.f6661h, dVar, 6);
            default:
                return new j1(this.f6661h, dVar, 7);
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        c7.x xVar = (c7.x) obj;
        h6.d dVar = (h6.d) obj2;
        switch (this.f6660g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                j1 j1Var = (j1) create(xVar, dVar);
                d6.z zVar = d6.z.f2639a;
                j1Var.invokeSuspend(zVar);
                return zVar;
            case 1:
                j1 j1Var2 = (j1) create(xVar, dVar);
                d6.z zVar2 = d6.z.f2639a;
                j1Var2.invokeSuspend(zVar2);
                return zVar2;
            case 2:
                j1 j1Var3 = (j1) create(xVar, dVar);
                d6.z zVar3 = d6.z.f2639a;
                j1Var3.invokeSuspend(zVar3);
                return zVar3;
            case 3:
                j1 j1Var4 = (j1) create(xVar, dVar);
                d6.z zVar4 = d6.z.f2639a;
                j1Var4.invokeSuspend(zVar4);
                return zVar4;
            case 4:
                j1 j1Var5 = (j1) create(xVar, dVar);
                d6.z zVar5 = d6.z.f2639a;
                j1Var5.invokeSuspend(zVar5);
                return zVar5;
            case 5:
                j1 j1Var6 = (j1) create(xVar, dVar);
                d6.z zVar6 = d6.z.f2639a;
                j1Var6.invokeSuspend(zVar6);
                return zVar6;
            case 6:
                j1 j1Var7 = (j1) create(xVar, dVar);
                d6.z zVar7 = d6.z.f2639a;
                j1Var7.invokeSuspend(zVar7);
                return zVar7;
            default:
                j1 j1Var8 = (j1) create(xVar, dVar);
                d6.z zVar8 = d6.z.f2639a;
                j1Var8.invokeSuspend(zVar8);
                return zVar8;
        }
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f6660g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                d6.a.e(obj);
                m0 m0Var = this.f6661h;
                m0Var.f6693h = true;
                m0Var.f6694i.e(null);
                break;
            case 1:
                d6.a.e(obj);
                m0 m0Var2 = this.f6661h;
                m0Var2.f6692g = true;
                m0Var2.f6694i.e(null);
                break;
            case 2:
                d6.a.e(obj);
                m0 m0Var3 = this.f6661h;
                m0Var3.f6692g = true;
                m0Var3.f6694i.e(null);
                break;
            case 3:
                d6.a.e(obj);
                m0 m0Var4 = this.f6661h;
                m0Var4.f6693h = true;
                m0Var4.f6694i.e(null);
                break;
            case 4:
                d6.a.e(obj);
                m0 m0Var5 = this.f6661h;
                m0Var5.f6692g = true;
                m0Var5.f6694i.e(null);
                break;
            case 5:
                d6.a.e(obj);
                m0 m0Var6 = this.f6661h;
                m0Var6.f6692g = true;
                m0Var6.f6694i.e(null);
                break;
            case 6:
                d6.a.e(obj);
                m0 m0Var7 = this.f6661h;
                m0Var7.f6692g = true;
                m0Var7.f6694i.e(null);
                break;
            default:
                d6.a.e(obj);
                m0 m0Var8 = this.f6661h;
                m0Var8.f6693h = true;
                m0Var8.f6694i.e(null);
                break;
        }
        return d6.z.f2639a;
    }
}
