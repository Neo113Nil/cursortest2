package com.cmplay.b;

import android.os.Bundle;
import android.text.TextUtils;
import com.dancingbogo.skyrolline.GameApp;
import com.facebook.l;
import java.util.Locale;

/* compiled from: FBInfocClient.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private com.facebook.appevents.f f3915a;

    public static int a(int i, int i2) {
        switch (i) {
            case 1:
            case 2:
            case 3:
                switch (i2) {
                    case 1:
                    case 2:
                    case 3:
                    case 9:
                        return 1;
                    case 5:
                        return 2;
                }
            default:
                return 0;
        }
    }

    public static String a(int i) {
        switch (i) {
            case 1:
                return "_result";
            case 2:
                return "_result_pl";
            case 3:
                return "_top_rank";
            default:
                return "";
        }
    }

    public static int b(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            default:
                return 0;
        }
    }

    /* compiled from: FBInfocClient.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static b f3917a = new b();
    }

    private b() {
        this.f3915a = null;
        l.a(GameApp.f4485a);
        this.f3915a = com.facebook.appevents.f.c(GameApp.f4485a);
    }

    public static b a() {
        return a.f3917a;
    }

    public com.facebook.appevents.f b() {
        return this.f3915a;
    }

    public void a(String str) {
        a(str, (Bundle) null);
    }

    public void a(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        b().a("PT2_" + str, bundle);
    }

    public void c() {
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        if (TextUtils.isEmpty(language)) {
            return;
        }
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            language = String.format(Locale.US, "%s-%s", language, country);
        }
        Bundle bundle = new Bundle();
        bundle.putString("locale", language);
        bundle.putInt("app_version", com.dancingbogo.skyrolline.util.d.a(GameApp.f4485a, GameApp.f4485a.getPackageName()));
        a("app_Launch_Lan", bundle);
        com.dancingbogo.skyrolline.util.g.a(new Runnable() { // from class: com.cmplay.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                Bundle bundle2 = new Bundle();
                bundle2.putString("login_state", String.valueOf(false));
                b.this.a("login_state", bundle2);
            }
        });
    }

    public static int d() {
        switch (e.f3924d) {
            case 0:
            case 3:
                return 6300;
            case 1:
                return 6200;
            case 2:
                return 6100;
            case 4:
                return 6356;
            default:
                return 0;
        }
    }
}
