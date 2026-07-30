package K2;

import a.AbstractC0415a;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import h3.InterfaceC4567a;
import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements InterfaceC4567a, h3.g {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ d f1576u = new d(0);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ d f1577v = new d(1);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ d f1578w = new d(2);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1579n;

    public /* synthetic */ d(int i) {
        this.f1579n = i;
    }

    @Override // h3.g
    public h3.n a(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = b.f1566h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? AbstractC0415a.r(bundle) : AbstractC0415a.r(null);
    }

    @Override // h3.InterfaceC4567a
    public Object s(h3.n nVar) {
        switch (this.f1579n) {
            case 0:
                if (nVar.i()) {
                    return (Bundle) nVar.g();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(nVar.f())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", nVar.f());
            default:
                Intent intent = (Intent) ((Bundle) nVar.g()).getParcelable("notification_data");
                if (intent != null) {
                    return new a(intent);
                }
                return null;
        }
    }
}
