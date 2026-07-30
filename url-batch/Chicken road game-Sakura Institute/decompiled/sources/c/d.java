package c;

import c7.m1;
import com.android.installreferrer.api.InstallReferrerClient;
import d6.z;
import r6.r;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d extends j6.i implements q6.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1422g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1423h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, h6.d dVar, int i7) {
        super(3, dVar);
        this.f1422g = i7;
        this.f1423h = obj;
    }

    @Override // q6.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        h6.d dVar = (h6.d) obj3;
        switch (this.f1422g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                d dVar2 = new d((r) this.f1423h, dVar, 0);
                z zVar = z.f2639a;
                dVar2.invokeSuspend(zVar);
                return zVar;
            default:
                d dVar3 = new d((m1) this.f1423h, dVar, 1);
                z zVar2 = z.f2639a;
                dVar3.invokeSuspend(zVar2);
                return zVar2;
        }
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f1422g;
        z zVar = z.f2639a;
        Object obj2 = this.f1423h;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                d6.a.e(obj);
                ((r) obj2).f7964f = true;
                break;
            default:
                d6.a.e(obj);
                ((m1) obj2).c(null);
                break;
        }
        return zVar;
    }
}
