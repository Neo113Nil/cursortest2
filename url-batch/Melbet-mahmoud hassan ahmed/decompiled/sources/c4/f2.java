package c4;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
final class f2 {

    /* renamed from: a, reason: collision with root package name */
    private final h2 f1959a;

    /* renamed from: b, reason: collision with root package name */
    private final Activity f1960b;

    /* renamed from: c, reason: collision with root package name */
    private final k4.a f1961c;

    /* renamed from: d, reason: collision with root package name */
    private final k4.d f1962d;

    private f2(h2 h2Var, Activity activity, k4.a aVar, k4.d dVar) {
        this.f1959a = h2Var;
        this.f1960b = activity;
        this.f1961c = aVar;
        this.f1962d = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p0 a() {
        List<u0> arrayList;
        u0 u0Var;
        List<y0> arrayList2;
        String str;
        String valueOf;
        String str2;
        String str3;
        p0 p0Var = new p0();
        p0Var.f2057a = d();
        a a7 = this.f1959a.f1988b.a();
        if (a7 != null) {
            p0Var.f2058b = a7.f1917a;
            p0Var.f2065i = Boolean.valueOf(a7.f1918b);
        }
        if (this.f1961c.b()) {
            arrayList = new ArrayList<>();
            int a8 = this.f1961c.a();
            if (a8 == 1) {
                u0Var = u0.GEO_OVERRIDE_EEA;
            } else if (a8 == 2) {
                u0Var = u0.GEO_OVERRIDE_NON_EEA;
            }
            arrayList.add(u0Var);
        } else {
            arrayList = Collections.emptyList();
        }
        p0Var.f2070n = arrayList;
        Application application = this.f1959a.f1987a;
        Set<String> e7 = this.f1959a.f1989c.e();
        HashMap hashMap = new HashMap();
        for (String str4 : e7) {
            e1 a9 = f1.a(application, str4);
            if (a9 == null) {
                str = "Fetching request info: failed for key: ";
                valueOf = String.valueOf(str4);
                if (valueOf.length() == 0) {
                    str2 = new String("Fetching request info: failed for key: ");
                    Log.d("UserMessagingPlatform", str2);
                }
                str2 = str.concat(valueOf);
                Log.d("UserMessagingPlatform", str2);
            } else {
                Object obj = application.getSharedPreferences(a9.f1954a, 0).getAll().get(a9.f1955b);
                if (obj == null) {
                    str = "Stored info not exists: ";
                    valueOf = String.valueOf(str4);
                    if (valueOf.length() == 0) {
                        str2 = new String("Stored info not exists: ");
                        Log.d("UserMessagingPlatform", str2);
                    }
                    str2 = str.concat(valueOf);
                    Log.d("UserMessagingPlatform", str2);
                } else {
                    if (obj instanceof Boolean) {
                        str3 = ((Boolean) obj).booleanValue() ? "1" : "0";
                    } else if (obj instanceof Number) {
                        str3 = obj.toString();
                    } else if (obj instanceof String) {
                        str3 = (String) obj;
                    } else {
                        str = "Failed to fetch stored info: ";
                        valueOf = String.valueOf(str4);
                        if (valueOf.length() == 0) {
                            str2 = new String("Failed to fetch stored info: ");
                            Log.d("UserMessagingPlatform", str2);
                        }
                        str2 = str.concat(valueOf);
                        Log.d("UserMessagingPlatform", str2);
                    }
                    hashMap.put(str4, str3);
                }
            }
        }
        p0Var.f2066j = hashMap;
        k4.d dVar = this.f1962d;
        p0Var.f2060d = null;
        p0Var.f2063g = null;
        p0Var.f2064h = Boolean.valueOf(dVar.b());
        p0Var.f2062f = null;
        int i7 = Build.VERSION.SDK_INT;
        p0Var.f2061e = i7 >= 21 ? Locale.getDefault().toLanguageTag() : Locale.getDefault().toString();
        t0 t0Var = new t0();
        t0Var.f2105c = Integer.valueOf(i7);
        t0Var.f2104b = Build.MODEL;
        t0Var.f2103a = w0.f2136b;
        p0Var.f2059c = t0Var;
        Configuration configuration = this.f1959a.f1987a.getResources().getConfiguration();
        this.f1959a.f1987a.getResources().getConfiguration();
        v0 v0Var = new v0();
        v0Var.f2131a = Integer.valueOf(configuration.screenWidthDp);
        v0Var.f2132b = Integer.valueOf(configuration.screenHeightDp);
        v0Var.f2133c = Double.valueOf(this.f1959a.f1987a.getResources().getDisplayMetrics().density);
        if (i7 >= 28) {
            Activity activity = this.f1960b;
            Window window = activity == null ? null : activity.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            DisplayCutout displayCutout = rootWindowInsets != null ? rootWindowInsets.getDisplayCutout() : null;
            if (displayCutout != null) {
                displayCutout.getSafeInsetBottom();
                arrayList2 = new ArrayList<>();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    if (rect != null) {
                        y0 y0Var = new y0();
                        y0Var.f2158b = Integer.valueOf(rect.left);
                        y0Var.f2159c = Integer.valueOf(rect.right);
                        y0Var.f2157a = Integer.valueOf(rect.top);
                        y0Var.f2160d = Integer.valueOf(rect.bottom);
                        arrayList2.add(y0Var);
                    }
                }
                v0Var.f2134d = arrayList2;
                p0Var.f2067k = v0Var;
                p0Var.f2068l = c();
                x0 x0Var = new x0();
                x0Var.f2153a = "1.0.0";
                p0Var.f2069m = x0Var;
                return p0Var;
            }
        }
        arrayList2 = Collections.emptyList();
        v0Var.f2134d = arrayList2;
        p0Var.f2067k = v0Var;
        p0Var.f2068l = c();
        x0 x0Var2 = new x0();
        x0Var2.f2153a = "1.0.0";
        p0Var.f2069m = x0Var2;
        return p0Var;
    }

    private final r0 c() {
        PackageInfo packageInfo;
        Application application = this.f1959a.f1987a;
        try {
            packageInfo = this.f1959a.f1987a.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        r0 r0Var = new r0();
        r0Var.f2092a = application.getPackageName();
        CharSequence applicationLabel = this.f1959a.f1987a.getPackageManager().getApplicationLabel(this.f1959a.f1987a.getApplicationInfo());
        r0Var.f2093b = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            r0Var.f2094c = Long.toString(k.a.a(packageInfo));
        }
        return r0Var;
    }

    private final String d() {
        String c7 = this.f1962d.c();
        if (!TextUtils.isEmpty(c7)) {
            return c7;
        }
        Bundle bundle = null;
        try {
            bundle = this.f1959a.f1987a.getPackageManager().getApplicationInfo(this.f1959a.f1987a.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (bundle != null) {
            c7 = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        }
        if (TextUtils.isEmpty(c7)) {
            throw new e2(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
        }
        return c7;
    }
}
