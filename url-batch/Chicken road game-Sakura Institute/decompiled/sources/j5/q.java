package j5;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5107f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.room.c f5108g;

    public /* synthetic */ q(androidx.room.c cVar, int i7) {
        this.f5107f = i7;
        this.f5108g = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5107f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                androidx.room.c cVar = this.f5108g;
                ((r) cVar.f1070h).f5117h.cancel(false);
                r rVar = (r) cVar.f1070h;
                rVar.f5111b = true;
                if (rVar.f5119j.v()) {
                    ((r) cVar.f1070h).f5119j.d("websocket opened", null, new Object[0]);
                }
                ((r) cVar.f1070h).e();
                break;
            default:
                androidx.room.c cVar2 = this.f5108g;
                if (((r) cVar2.f1070h).f5119j.v()) {
                    ((r) cVar2.f1070h).f5119j.d("closed", null, new Object[0]);
                }
                r.a((r) cVar2.f1070h);
                break;
        }
    }
}
