package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class pj2 implements ij2<nj2> {

    /* renamed from: a, reason: collision with root package name */
    private final dc3 f10244a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f10245b;

    public pj2(dc3 dc3Var, Context context) {
        this.f10244a = dc3Var;
        this.f10245b = context;
    }

    private static ResolveInfo c(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<nj2> a() {
        return this.f10244a.E(new Callable() { // from class: com.google.android.gms.internal.ads.oj2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return pj2.this.b();
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:0|1|(1:3)(1:54)|4|(1:6)(1:53)|7|(3:9|(2:12|10)|13)|14|(3:46|47|(12:49|50|17|18|19|(7:21|22|23|(2:29|(3:32|(3:35|(2:38|39)(1:37)|33)|40))|25|26|27)|42|23|(0)|25|26|27))|16|17|18|19|(0)|42|23|(0)|25|26|27) */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b6 A[Catch: Exception -> 0x00d9, TRY_LEAVE, TryCatch #0 {Exception -> 0x00d9, blocks: (B:19:0x00a8, B:21:0x00b6), top: B:18:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ nj2 b() {
        ActivityInfo activityInfo;
        PackageInfo f7;
        String sb;
        String str;
        boolean equals;
        PackageInfo f8;
        PackageManager packageManager = this.f10245b.getPackageManager();
        Locale locale = Locale.getDefault();
        boolean z6 = c(packageManager, "geo:0,0?q=donuts") != null;
        boolean z7 = c(packageManager, "http://www.google.com") != null;
        String country = locale.getCountry();
        y2.t.q();
        qw.b();
        boolean m7 = bo0.m();
        boolean c7 = v3.h.c(this.f10245b);
        boolean d7 = v3.h.d(this.f10245b);
        String language = locale.getLanguage();
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList localeList = LocaleList.getDefault();
            for (int i7 = 0; i7 < localeList.size(); i7++) {
                arrayList.add(localeList.get(i7).getLanguage());
            }
        }
        Context context = this.f10245b;
        ResolveInfo c8 = c(packageManager, "market://details?id=com.google.android.gms.ads");
        if (c8 != null && (activityInfo = c8.activityInfo) != null) {
            try {
                f7 = w3.c.a(context).f(activityInfo.packageName, 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (f7 != null) {
                int i8 = f7.versionCode;
                String str2 = activityInfo.packageName;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 12);
                sb2.append(i8);
                sb2.append(".");
                sb2.append(str2);
                sb = sb2.toString();
                f8 = w3.c.a(this.f10245b).f("com.android.vending", 128);
                if (f8 != null) {
                    int i9 = f8.versionCode;
                    String str3 = f8.packageName;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 12);
                    sb3.append(i9);
                    sb3.append(".");
                    sb3.append(str3);
                    str = sb3.toString();
                    String str4 = Build.FINGERPRINT;
                    Context context2 = this.f10245b;
                    if (packageManager != null) {
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
                        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
                        if (queryIntentActivities != null && resolveActivity != null) {
                            for (int i10 = 0; i10 < queryIntentActivities.size(); i10++) {
                                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i10).activityInfo.name)) {
                                    equals = resolveActivity.activityInfo.packageName.equals(zv3.a(context2));
                                    break;
                                }
                            }
                        }
                    }
                    equals = false;
                    return new nj2(z6, z7, country, m7, c7, d7, language, arrayList, sb, str, str4, equals, Build.MODEL, y2.t.r().h());
                }
                str = null;
                String str42 = Build.FINGERPRINT;
                Context context22 = this.f10245b;
                if (packageManager != null) {
                }
                equals = false;
                return new nj2(z6, z7, country, m7, c7, d7, language, arrayList, sb, str, str42, equals, Build.MODEL, y2.t.r().h());
            }
        }
        sb = null;
        f8 = w3.c.a(this.f10245b).f("com.android.vending", 128);
        if (f8 != null) {
        }
        str = null;
        String str422 = Build.FINGERPRINT;
        Context context222 = this.f10245b;
        if (packageManager != null) {
        }
        equals = false;
        return new nj2(z6, z7, country, m7, c7, d7, language, arrayList, sb, str, str422, equals, Build.MODEL, y2.t.r().h());
    }
}
