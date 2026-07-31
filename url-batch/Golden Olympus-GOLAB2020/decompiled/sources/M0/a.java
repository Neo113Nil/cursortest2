package M0;

import T0.c;
import T0.e;
import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsApp;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final HostnameVerifier f906a = new U0.a();

    public static HostnameVerifier a() {
        return f906a;
    }

    public static SSLSocketFactory b(Context context) {
        try {
            return new c(new e(context.getAssets().open(GrsApp.getInstance().getBrand("/") + "grs_sp.bks"), ""), S0.a.c());
        } catch (IOException | KeyManagementException | NoSuchAlgorithmException e4) {
            throw new AssertionError(e4);
        }
    }
}
