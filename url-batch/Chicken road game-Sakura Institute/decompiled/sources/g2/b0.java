package g2;

import android.view.Choreographer;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements Choreographer.FrameCallback {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3999f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Runnable f4000g;

    public /* synthetic */ b0(Runnable runnable, int i7) {
        this.f3999f = i7;
        this.f4000g = runnable;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j8) {
        switch (this.f3999f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.f4000g.run();
                break;
            default:
                this.f4000g.run();
                break;
        }
    }
}
