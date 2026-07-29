package com.mopub.volley.toolbox;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.http.AndroidHttpClient;
import android.os.Build;
import com.mopub.volley.Network;
import com.mopub.volley.RequestQueue;
import java.io.File;

/* loaded from: classes2.dex */
public class Volley {
    private static final String DEFAULT_CACHE_DIR = "volley";

    /* JADX WARN: Type inference failed for: r4v4, types: [android.net.http.AndroidHttpClient, org.apache.a.b.g] */
    public static RequestQueue newRequestQueue(Context context, BaseHttpStack baseHttpStack) {
        BasicNetwork basicNetwork;
        if (baseHttpStack == null) {
            if (Build.VERSION.SDK_INT >= 9) {
                basicNetwork = new BasicNetwork((BaseHttpStack) new HurlStack());
            } else {
                String str = "volley/0";
                try {
                    String packageName = context.getPackageName();
                    str = packageName + "/" + context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
                } catch (PackageManager.NameNotFoundException unused) {
                }
                basicNetwork = new BasicNetwork(new HttpClientStack(AndroidHttpClient.newInstance(str)));
            }
        } else {
            basicNetwork = new BasicNetwork(baseHttpStack);
        }
        return newRequestQueue(context, basicNetwork);
    }

    @Deprecated
    public static RequestQueue newRequestQueue(Context context, HttpStack httpStack) {
        if (httpStack == null) {
            return newRequestQueue(context, (BaseHttpStack) null);
        }
        return newRequestQueue(context, new BasicNetwork(httpStack));
    }

    private static RequestQueue newRequestQueue(Context context, Network network) {
        RequestQueue requestQueue = new RequestQueue(new DiskBasedCache(new File(context.getCacheDir(), DEFAULT_CACHE_DIR)), network);
        requestQueue.start();
        return requestQueue;
    }

    public static RequestQueue newRequestQueue(Context context) {
        return newRequestQueue(context, (BaseHttpStack) null);
    }
}
