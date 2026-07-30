package j5;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5051a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f5052b;

    public /* synthetic */ f(n nVar, int i7) {
        this.f5051a = i7;
        this.f5052b = nVar;
    }

    @Override // j5.i
    public final void a(Map map) {
        switch (this.f5051a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                n nVar = this.f5052b;
                b1.b bVar = nVar.f5099x;
                String str = (String) map.get("s");
                if (!str.equals("ok")) {
                    nVar.f5091p = null;
                    nVar.f5092q = true;
                    l5.i iVar = nVar.f5076a;
                    iVar.getClass();
                    iVar.g(l5.c.f6010c, Boolean.FALSE);
                    bVar.d("Authentication failed: " + str + " (" + ((String) map.get("d")) + ")", null, new Object[0]);
                    nVar.f5082g.c(2);
                    if (str.equals("invalid_token")) {
                        int i7 = nVar.B + 1;
                        nVar.B = i7;
                        if (i7 >= 3) {
                            k5.a aVar = nVar.f5100y;
                            aVar.f5367i = aVar.f5362d;
                            bVar.I("Provided authentication credentials are invalid. This usually indicates your FirebaseApp instance was not initialized correctly. Make sure your google-services.json file has the correct firebase_url and api_key. You can re-download google-services.json from https://console.firebase.google.com/.");
                            break;
                        }
                    }
                } else {
                    nVar.f5083h = j.f5064j;
                    nVar.B = 0;
                    nVar.i();
                    break;
                }
                break;
            default:
                String str2 = (String) map.get("s");
                if (!str2.equals("ok")) {
                    String str3 = (String) map.get("d");
                    n nVar2 = this.f5052b;
                    if (nVar2.f5099x.v()) {
                        nVar2.f5099x.d("Failed to send stats: " + str2 + " (message: " + str3 + ")", null, new Object[0]);
                        break;
                    }
                }
                break;
        }
    }
}
