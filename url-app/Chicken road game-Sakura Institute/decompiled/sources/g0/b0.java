package g0;

import android.view.Choreographer;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b0 implements Choreographer.FrameCallback {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3690f = 1;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c7.h f3691g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q6.c f3692h;

    public b0(c7.h hVar, i1 i1Var, q6.c cVar) {
        this.f3691g = hVar;
        this.f3692h = cVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j8) {
        Object b9;
        Object b10;
        int i7 = this.f3690f;
        q6.c cVar = this.f3692h;
        c7.h hVar = this.f3691g;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                c0 c0Var = c0.f3696f;
                try {
                    b10 = cVar.f(Long.valueOf(j8));
                } catch (Throwable th) {
                    b10 = d6.a.b(th);
                }
                hVar.resumeWith(b10);
                break;
            default:
                try {
                    b9 = cVar.f(Long.valueOf(j8));
                } catch (Throwable th2) {
                    b9 = d6.a.b(th2);
                }
                hVar.resumeWith(b9);
                break;
        }
    }

    public b0(c7.h hVar, q6.c cVar) {
        this.f3691g = hVar;
        this.f3692h = cVar;
    }
}
