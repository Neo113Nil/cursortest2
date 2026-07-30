package f7;

import com.android.installreferrer.api.InstallReferrerClient;
import g0.q1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m0 extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3516g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f3517h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(int i7, h6.d dVar, int i8) {
        super(i7, dVar);
        this.f3516g = i8;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f3516g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                m0 m0Var = new m0(2, dVar, 0);
                m0Var.f3517h = obj;
                return m0Var;
            case 1:
                m0 m0Var2 = new m0(2, dVar, 1);
                m0Var2.f3517h = obj;
                return m0Var2;
            default:
                m0 m0Var3 = new m0(2, dVar, 2);
                m0Var3.f3517h = obj;
                return m0Var3;
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f3516g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((m0) create((h0) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 1:
                return ((m0) create((q1) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            default:
                return ((m0) create((g3.i0) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
        }
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f3516g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                d6.a.e(obj);
                return Boolean.valueOf(((h0) this.f3517h) != h0.f3480f);
            case 1:
                d6.a.e(obj);
                return Boolean.valueOf(((q1) this.f3517h) == q1.f3860f);
            default:
                d6.a.e(obj);
                return Boolean.valueOf(!(((g3.i0) this.f3517h) instanceof g3.b0));
        }
    }
}
