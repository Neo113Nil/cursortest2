package d0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class h2 extends r6.q implements x6.c {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2009m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h2(Object obj, Class cls, String str, String str2, int i7, int i8) {
        super(obj, cls, str, str2, i7);
        this.f2009m = i8;
    }

    @Override // q6.a
    public final Object a() {
        return get();
    }

    @Override // r6.b
    public final x6.a g() {
        r6.w.f7969a.getClass();
        return this;
    }

    @Override // x6.c
    public final Object get() {
        switch (this.f2009m) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((g0.m2) this.f7949g).getValue();
            case 1:
                return this.f7949g.getClass().getSimpleName();
            default:
                return ((g0.m2) this.f7949g).getValue();
        }
    }
}
