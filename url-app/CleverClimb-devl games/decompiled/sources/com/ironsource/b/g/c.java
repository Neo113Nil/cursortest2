package com.ironsource.b.g;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.ads.AudienceNetworkActivity;
import com.ironsource.b.h.f;
import com.ironsource.b.h.g;
import com.tapjoy.TapjoyConstants;
import com.youappi.sdk.net.model.VideoEvent;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Vector;

/* compiled from: ServerURL.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static String f6920a = "https://init.supersonicads.com/sdk/v";

    /* renamed from: b, reason: collision with root package name */
    private static String f6921b = "?request=";

    public static String a(Context context, String str, String str2, String str3, String str4, Vector<Pair<String, String>> vector) throws UnsupportedEncodingException {
        Vector vector2 = new Vector();
        vector2.add(new Pair(TapjoyConstants.TJC_PLATFORM, TapjoyConstants.TJC_DEVICE_PLATFORM_TYPE));
        vector2.add(new Pair("applicationKey", str));
        vector2.add(new Pair("applicationUserId", str2));
        vector2.add(new Pair("sdkVersion", g.d()));
        if (g.a() == 0) {
            vector2.add(new Pair("serr", String.valueOf(g.a())));
        }
        if (!TextUtils.isEmpty(com.ironsource.b.a.a.a().b())) {
            vector2.add(new Pair("pluginType", com.ironsource.b.a.a.a().b()));
        }
        if (!TextUtils.isEmpty(com.ironsource.b.a.a.a().c())) {
            vector2.add(new Pair("pluginVersion", com.ironsource.b.a.a.a().c()));
        }
        if (!TextUtils.isEmpty(com.ironsource.b.a.a.a().d())) {
            vector2.add(new Pair("plugin_fw_v", com.ironsource.b.a.a.a().d()));
        }
        if (!TextUtils.isEmpty(str3)) {
            vector2.add(new Pair("advId", str3));
        }
        if (!TextUtils.isEmpty(str4)) {
            vector2.add(new Pair("mt", str4));
        }
        String c2 = com.ironsource.environment.a.c(context, context.getPackageName());
        if (!TextUtils.isEmpty(c2)) {
            vector2.add(new Pair("appVer", c2));
        }
        vector2.add(new Pair("osVer", Build.VERSION.SDK_INT + ""));
        vector2.add(new Pair("devMake", Build.MANUFACTURER));
        vector2.add(new Pair("devModel", Build.MODEL));
        String a2 = g.a(context);
        if (!TextUtils.isEmpty(a2)) {
            vector2.add(new Pair("connType", a2));
        }
        if (vector != null) {
            vector2.addAll(vector);
        }
        return a(g.d()) + URLEncoder.encode(f.a("C38FB23A402222A0C17D34A92F971D1F", a((Vector<Pair<String, String>>) vector2)), "UTF-8");
    }

    public static String a(String str, boolean z, int i) throws UnsupportedEncodingException {
        Vector vector = new Vector();
        vector.add(new Pair(VideoEvent.EVENT_IMPRESSION, Boolean.toString(z)));
        vector.add(new Pair(AudienceNetworkActivity.PLACEMENT_ID, Integer.toString(i)));
        return str + "&" + a((Vector<Pair<String, String>>) vector);
    }

    private static String a(Vector<Pair<String, String>> vector) throws UnsupportedEncodingException {
        String str = "";
        Iterator<Pair<String, String>> it = vector.iterator();
        while (it.hasNext()) {
            Pair<String, String> next = it.next();
            if (str.length() > 0) {
                str = str + "&";
            }
            str = str + ((String) next.first) + "=" + URLEncoder.encode((String) next.second, "UTF-8");
        }
        return str;
    }

    private static String a(String str) {
        return f6920a + str + f6921b;
    }
}
