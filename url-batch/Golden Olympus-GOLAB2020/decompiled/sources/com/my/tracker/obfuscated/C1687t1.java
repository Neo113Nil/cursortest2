package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.t1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1687t1 {

    /* renamed from: a, reason: collision with root package name */
    final Context f21532a;

    /* renamed from: b, reason: collision with root package name */
    final C1667o0 f21533b;

    /* renamed from: c, reason: collision with root package name */
    final C1626e f21534c;

    private C1687t1(C1631f0 c1631f0, Context context) {
        this.f21533b = C1667o0.a(c1631f0, context);
        this.f21534c = C1626e.a(c1631f0, C1676q1.a(context), context);
        this.f21532a = context.getApplicationContext();
    }

    void a(int i4, Intent intent) {
        C1626e c1626e = this.f21534c;
        if (c1626e == null) {
            AbstractC1708y2.a("PurchaseHandler: can't do appGalleryPurchaseHandler.onActivityResult(), appGallery purchases dependency not implemented");
        } else {
            c1626e.a(i4, intent);
        }
    }

    public void b(int i4, Intent intent) {
        String str;
        InstallSourceInfo installSourceInfo;
        PackageManager packageManager = this.f21532a.getPackageManager();
        try {
            String packageName = this.f21532a.getPackageName();
            if (Build.VERSION.SDK_INT >= 30) {
                installSourceInfo = packageManager.getInstallSourceInfo(packageName);
                str = installSourceInfo.getInstallingPackageName();
            } else {
                str = packageManager.getInstallerPackageName(packageName);
            }
        } catch (Throwable th) {
            AbstractC1708y2.a("PurchaseHandler: can't detect installer package –" + th.getMessage());
            str = "";
        }
        AbstractC1708y2.a("PurchaseHandler: installer package is " + str);
        str.getClass();
        if (str.equals("com.huawei.appmarket")) {
            AbstractC1708y2.a("PurchaseHandler: appGalleryMarket detected");
        } else if (str.equals("com.android.vending")) {
            AbstractC1708y2.a("PurchaseHandler: googleStore detected");
            this.f21533b.a(i4, intent);
            return;
        } else {
            AbstractC1708y2.a("PurchaseHandler: store not detected");
            this.f21533b.a(i4, intent);
        }
        a(i4, intent);
    }

    public void a() {
        this.f21533b.a();
        C1626e c1626e = this.f21534c;
        if (c1626e == null) {
            AbstractC1708y2.a("PurchaseHandler: can't init appGalleryPurchaseHandler, appGallery purchases dependency not implemented");
        } else {
            c1626e.a();
        }
    }

    public static C1687t1 a(C1631f0 c1631f0, Context context) {
        return new C1687t1(c1631f0, context);
    }

    public void a(int i4, List list) {
        this.f21533b.a(i4, list);
    }

    public void a(Object obj, String str, String str2, String str3, Map map) {
        C1626e c1626e = this.f21534c;
        if (c1626e == null) {
            AbstractC1708y2.a("PurchaseHandler: can't trackAppGalleryPurchase, appGallery purchases dependency not implemented");
        } else {
            c1626e.b(obj, str, str2, str3, map);
        }
    }

    public void a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map map) {
        this.f21533b.a(jSONObject, jSONObject2, str, map);
    }
}
