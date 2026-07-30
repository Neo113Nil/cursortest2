package o;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f0 extends j6.i implements q6.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6608g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(int i7, h6.d dVar, int i8) {
        super(i7, dVar);
        this.f6608g = i8;
    }

    @Override // q6.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        switch (this.f6608g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                long j8 = ((y0.c) obj2).f9778a;
                f0 f0Var = new f0(3, (h6.d) obj3, 0);
                d6.z zVar = d6.z.f2639a;
                f0Var.invokeSuspend(zVar);
                return zVar;
            case 1:
                ((Number) obj2).floatValue();
                f0 f0Var2 = new f0(3, (h6.d) obj3, 1);
                d6.z zVar2 = d6.z.f2639a;
                f0Var2.invokeSuspend(zVar2);
                return zVar2;
            default:
                long j9 = ((y0.c) obj2).f9778a;
                f0 f0Var3 = new f0(3, (h6.d) obj3, 2);
                d6.z zVar3 = d6.z.f2639a;
                f0Var3.invokeSuspend(zVar3);
                return zVar3;
        }
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f6608g;
        d6.z zVar = d6.z.f2639a;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                d6.a.e(obj);
                break;
            case 1:
                d6.a.e(obj);
                break;
            default:
                d6.a.e(obj);
                break;
        }
        return zVar;
    }
}
