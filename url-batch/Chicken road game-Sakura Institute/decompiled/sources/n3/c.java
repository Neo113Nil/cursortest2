package n3;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f6512f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f6513g;

    public /* synthetic */ c(g gVar, int i7) {
        this.f6512f = i7;
        this.f6513g = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6512f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.f6513g.f6528p.onDismiss(null);
                break;
            default:
                g gVar = this.f6513g;
                if (gVar.f6522j != null) {
                    if (gVar.f6522j == null) {
                        b1.b bVar = new b1.b(14, false);
                        Object obj = g.f6517u;
                        bVar.f1230g = obj;
                        bVar.f1231h = obj;
                        bVar.f1232i = obj;
                        gVar.f6522j = bVar;
                    }
                    gVar.f6522j.getClass();
                    break;
                }
                break;
        }
    }
}
