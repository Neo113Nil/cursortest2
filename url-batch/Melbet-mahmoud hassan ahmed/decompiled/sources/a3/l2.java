package a3;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.ar;
import com.google.android.gms.internal.ads.eu0;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.jv0;
import com.google.android.gms.internal.ads.lu0;
import java.io.InputStream;
import java.util.Map;

@TargetApi(21)
/* loaded from: classes.dex */
public class l2 extends k2 {
    @Override // a3.f
    public final int k() {
        return R.style.Theme.Material.Dialog.Alert;
    }

    @Override // a3.f
    public final CookieManager l(Context context) {
        if (f.s()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            io0.e("Failed to obtain CookieManager.", th);
            y2.t.p().s(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // a3.f
    public final WebResourceResponse m(String str, String str2, int i7, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i7, str3, map, inputStream);
    }

    @Override // a3.f
    public final lu0 n(eu0 eu0Var, ar arVar, boolean z6) {
        return new jv0(eu0Var, arVar, z6);
    }
}
