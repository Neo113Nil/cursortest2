package d0;

import android.view.Choreographer;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p3 extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2292g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p3(int i7, h6.d dVar, int i8) {
        super(i7, dVar);
        this.f2292g = i8;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f2292g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new p3(2, dVar, 0);
            case 1:
                return new p3(2, dVar, 1);
            case 2:
                return new p3(2, dVar, 2);
            default:
                return new p3(2, dVar, 3);
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f2292g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                p3 p3Var = (p3) create((l1.d0) obj, (h6.d) obj2);
                d6.z zVar = d6.z.f2639a;
                p3Var.invokeSuspend(zVar);
                return zVar;
            case 1:
                return ((p3) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
            case 2:
                p3 p3Var2 = (p3) create((f7.g) obj, (h6.d) obj2);
                d6.z zVar2 = d6.z.f2639a;
                p3Var2.invokeSuspend(zVar2);
                return zVar2;
            default:
                return ((p3) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
        }
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f2292g;
        d6.z zVar = d6.z.f2639a;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                d6.a.e(obj);
                return zVar;
            case 1:
                d6.a.e(obj);
                return Choreographer.getInstance();
            case 2:
                d6.a.e(obj);
                return zVar;
            default:
                d6.a.e(obj);
                return Choreographer.getInstance();
        }
    }
}
