package e2;

import B1.C0097d;
import f2.C0632a;
import java.util.Map;

/* renamed from: e2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0564f implements InterfaceC0567i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6182a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f6183b;

    public /* synthetic */ C0564f(n nVar, int i2) {
        this.f6182a = i2;
        this.f6183b = nVar;
    }

    @Override // e2.InterfaceC0567i
    public final void a(Map map) {
        switch (this.f6182a) {
            case 0:
                String str = (String) map.get("s");
                boolean equals = str.equals("ok");
                n nVar = this.f6183b;
                if (!equals) {
                    nVar.f6227p = null;
                    nVar.f6228q = true;
                    g2.h hVar = nVar.f6212a;
                    hVar.getClass();
                    hVar.g(g2.c.f6681c, Boolean.FALSE);
                    String str2 = (String) map.get("d");
                    C0097d c0097d = nVar.f6235x;
                    c0097d.d("Authentication failed: " + str + " (" + str2 + ")", null, new Object[0]);
                    nVar.f6218g.c(2);
                    if (str.equals("invalid_token")) {
                        int i2 = nVar.B + 1;
                        nVar.B = i2;
                        if (i2 >= 3) {
                            C0632a c0632a = nVar.f6236y;
                            c0632a.f6653i = c0632a.f6648d;
                            c0097d.M("Provided authentication credentials are invalid. This usually indicates your FirebaseApp instance was not initialized correctly. Make sure your google-services.json file has the correct firebase_url and api_key. You can re-download google-services.json from https://console.firebase.google.com/.");
                            break;
                        }
                    }
                } else {
                    nVar.f6219h = EnumC0568j.f6195k;
                    nVar.B = 0;
                    nVar.i();
                    break;
                }
                break;
            default:
                String str3 = (String) map.get("s");
                if (!str3.equals("ok")) {
                    String str4 = (String) map.get("d");
                    n nVar2 = this.f6183b;
                    if (nVar2.f6235x.y()) {
                        nVar2.f6235x.d("Failed to send stats: " + str3 + " (message: " + str4 + ")", null, new Object[0]);
                        break;
                    }
                }
                break;
        }
    }
}
