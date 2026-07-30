package j5;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5105f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r f5106g;

    public /* synthetic */ p(r rVar, int i7) {
        this.f5105f = i7;
        this.f5106g = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5105f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                r rVar = this.f5106g;
                b1.b bVar = rVar.f5119j;
                if (!rVar.f5111b && !rVar.f5112c) {
                    if (bVar.v()) {
                        bVar.d("timed out on connect", null, new Object[0]);
                    }
                    ((u5.d) rVar.f5110a.f1069g).a();
                    break;
                }
                break;
            default:
                r rVar2 = this.f5106g;
                androidx.room.c cVar = rVar2.f5110a;
                if (cVar != null) {
                    cVar.y("0");
                    rVar2.e();
                    break;
                }
                break;
        }
    }
}
