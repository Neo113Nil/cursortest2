package X0;

import android.text.TextUtils;
import android.webkit.URLUtil;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes.dex */
public abstract class a {
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            W0.a.d("UriUtil", "url is null");
            return str;
        }
        try {
            if (URLUtil.isNetworkUrl(str)) {
                return new URL(str.replaceAll("[\\\\#]", "/")).getHost();
            }
            W0.a.c("UriUtil", "url don't starts with http or https");
            return "";
        } catch (MalformedURLException e4) {
            W0.a.c("UriUtil", "getHostByURI error  MalformedURLException : " + e4.getMessage());
            return "";
        }
    }
}
