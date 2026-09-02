package Q0;

import a.AbstractC0219a;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements k1.a, k1.g {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ d f1974g = new d(0);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ d f1975h = new d(1);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ d f1976i = new d(2);

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1977f;

    public /* synthetic */ d(int i7) {
        this.f1977f = i7;
    }

    @Override // k1.a
    public Object a(k1.n nVar) {
        switch (this.f1977f) {
            case 0:
                if (nVar.h()) {
                    return (Bundle) nVar.f();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(nVar.e())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", nVar.e());
            default:
                Intent intent = (Intent) ((Bundle) nVar.f()).getParcelable("notification_data");
                if (intent != null) {
                    return new a(intent);
                }
                return null;
        }
    }

    @Override // k1.g
    public k1.n b(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i7 = b.f1963h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? AbstractC0219a.p(bundle) : AbstractC0219a.p(null);
    }
}
