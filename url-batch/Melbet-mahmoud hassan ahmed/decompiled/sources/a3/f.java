package a3;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.google.android.gms.internal.ads.ar;
import com.google.android.gms.internal.ads.eu0;
import com.google.android.gms.internal.ads.hv0;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.lu0;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.sw;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.Callable;

@TargetApi(16)
/* loaded from: classes.dex */
public class f {
    private f() {
    }

    /* synthetic */ f(e eVar) {
    }

    public static f r(int i7) {
        return i7 >= 28 ? new d() : i7 >= 26 ? new b() : i7 >= 24 ? new m2() : i7 >= 21 ? new l2() : i7 >= 19 ? new k2() : i7 >= 18 ? new j2() : i7 >= 17 ? new i2() : new f();
    }

    public static final boolean s() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    public int a(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "airplane_mode_on", 0);
    }

    public int b(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "wifi_on", 0);
    }

    public Drawable c(Context context, Bitmap bitmap, boolean z6, float f7) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public String d(Context context) {
        return "";
    }

    public void e(Context context) {
    }

    public boolean f(final Context context, final WebSettings webSettings) {
        i1.a(context, new Callable() { // from class: a3.h2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = context;
                WebSettings webSettings2 = webSettings;
                if (context2.getCacheDir() != null) {
                    webSettings2.setAppCachePath(context2.getCacheDir().getAbsolutePath());
                    webSettings2.setAppCacheMaxSize(0L);
                    webSettings2.setAppCacheEnabled(true);
                }
                webSettings2.setDatabasePath(context2.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                webSettings2.setDatabaseEnabled(true);
                webSettings2.setDomStorageEnabled(true);
                webSettings2.setDisplayZoomControls(false);
                webSettings2.setBuiltInZoomControls(true);
                webSettings2.setSupportZoom(true);
                if (((Boolean) sw.c().b(m10.f8347z0)).booleanValue()) {
                    webSettings2.setTextZoom(100);
                }
                webSettings2.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        return true;
    }

    public int g() {
        return 5;
    }

    public long h() {
        return -1L;
    }

    public boolean i(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    public ViewGroup.LayoutParams j() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    public int k() {
        return 1;
    }

    public CookieManager l(Context context) {
        if (s()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            io0.e("Failed to obtain CookieManager.", th);
            y2.t.p().s(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public WebResourceResponse m(String str, String str2, int i7, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    public lu0 n(eu0 eu0Var, ar arVar, boolean z6) {
        return new hv0(eu0Var, arVar, z6);
    }

    public boolean o(Activity activity, Configuration configuration) {
        return false;
    }

    public int p(Context context, TelephonyManager telephonyManager) {
        return 1001;
    }

    public void q(Activity activity) {
    }
}
