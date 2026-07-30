package p2;

import android.os.Handler;
import android.os.Looper;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7143g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v f7144h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(v vVar, int i7) {
        super(1);
        this.f7143g = i7;
        this.f7144h = vVar;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f7143g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                p1.p i7 = ((p1.p) obj).i();
                r6.k.c(i7);
                this.f7144h.k(i7);
                break;
            case 1:
                m2.j jVar = new m2.j(((m2.j) obj).f6321a);
                v vVar = this.f7144h;
                vVar.m7setPopupContentSizefhxjrPA(jVar);
                vVar.l();
                break;
            default:
                q6.a aVar = (q6.a) obj;
                v vVar2 = this.f7144h;
                Handler handler = vVar2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar.a();
                } else {
                    Handler handler2 = vVar2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new t(aVar, 0));
                    }
                }
                break;
        }
        return d6.z.f2639a;
    }
}
