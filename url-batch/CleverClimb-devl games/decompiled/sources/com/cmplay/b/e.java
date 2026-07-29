package com.cmplay.b;

import android.net.Uri;
import android.text.TextUtils;
import com.dancingbogo.skyrolline.GameApp;
import com.dancingbogo.skyrolline.R;
import java.util.UUID;

/* compiled from: ShareCommons.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3921a = com.dancingbogo.skyrolline.cloud.a.a().a(3, "section_common", "cloud_key_ip_when_unable_to_resolve_host", "52.23.127.237");

    /* renamed from: b, reason: collision with root package name */
    public static String f3922b;

    /* renamed from: c, reason: collision with root package name */
    public static int f3923c;

    /* renamed from: d, reason: collision with root package name */
    public static int f3924d;
    public static String e;

    public static void a() {
        f3922b = UUID.randomUUID().toString();
    }

    public static String b() {
        if (TextUtils.isEmpty(f3922b)) {
            a();
        }
        return f3922b;
    }

    public static String a(int i, int i2) {
        switch (i2) {
            case 1:
            case 2:
            case 3:
                if (1 == f3924d) {
                    switch (i) {
                        case 2:
                        case 3:
                            return c();
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            return "http://www.cmcm.com/en-us/rolling-sky/";
                        default:
                            return null;
                    }
                }
                if (f3924d != 0 && 3 != f3924d) {
                    return null;
                }
                String b2 = com.dancingbogo.skyrolline.b.d.b("key_share_h5_url", "");
                if (!TextUtils.isEmpty(b2)) {
                    return b2;
                }
                return "http://p2.cmcm.com/statics/share.html?uuid=" + b();
            default:
                return null;
        }
    }

    public static String c() {
        return "http://p2.cmcm.com/transfer_v3?uuid=" + b() + "&title=" + Uri.encode(GameApp.f4485a.getResources().getString(R.string.app_name)) + "&desc=" + Uri.encode(e) + "&image_url=" + Uri.encode(f.a(f3923c));
    }
}
