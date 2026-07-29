package com.facebook.ads.internal.q.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.IOException;
import java.util.concurrent.Executors;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static volatile a f5400a = a.NOT_INITIALIZED;

    /* renamed from: b, reason: collision with root package name */
    private static int f5401b = -1;

    enum a {
        NOT_INITIALIZED,
        INITIALIZING,
        INITIALIZED
    }

    public static int a(XmlPullParser xmlPullParser) {
        while (true) {
            if (xmlPullParser.next() == 1) {
                return 0;
            }
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("uses-sdk")) {
                for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                    if (xmlPullParser.getAttributeName(i).equals("minSdkVersion")) {
                        return Integer.parseInt(xmlPullParser.getAttributeValue(i));
                    }
                }
            }
        }
    }

    public static void a(Context context) {
        if (a()) {
            return;
        }
        e(context);
    }

    public static boolean a() {
        return f5400a == a.INITIALIZED;
    }

    public static int b(Context context) {
        if (f5400a == a.NOT_INITIALIZED) {
            a(context);
        }
        return f5401b;
    }

    public static int c(Context context) {
        try {
            return a(context.getAssets().openXmlResourceParser("AndroidManifest.xml"));
        } catch (IOException | XmlPullParserException unused) {
            return 0;
        }
    }

    private static void e(final Context context) {
        if (f5400a != a.NOT_INITIALIZED) {
            return;
        }
        f5400a = a.INITIALIZING;
        Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: com.facebook.ads.internal.q.a.e.1
            @Override // java.lang.Runnable
            public void run() {
                if (e.f5400a == a.INITIALIZED) {
                    return;
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("FBAdPrefs", 0);
                int i = sharedPreferences.getInt("AppMinSdkVersion", -1);
                if (i != -1) {
                    int unused = e.f5401b = i;
                } else {
                    int f = Build.VERSION.SDK_INT >= 24 ? e.f(context) : e.c(context);
                    int unused2 = e.f5401b = f;
                    sharedPreferences.edit().putInt("AppMinSdkVersion", f).commit();
                }
                e.f5400a = a.INITIALIZED;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int f(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).minSdkVersion;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }
}
