package p2;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7171f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q6.a f7172g;

    public /* synthetic */ t(q6.a aVar, int i7) {
        this.f7171f = i7;
        this.f7172g = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7171f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.f7172g.a();
                break;
            default:
                this.f7172g.a();
                break;
        }
    }
}
