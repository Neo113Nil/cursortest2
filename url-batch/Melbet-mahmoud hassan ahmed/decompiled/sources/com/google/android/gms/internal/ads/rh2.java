package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class rh2 implements ij2, hj2 {

    /* renamed from: a, reason: collision with root package name */
    private final ApplicationInfo f11163a;

    /* renamed from: b, reason: collision with root package name */
    private final PackageInfo f11164b;

    rh2(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        this.f11163a = applicationInfo;
        this.f11164b = packageInfo;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<hj2<Bundle>> a() {
        return rb3.i(this);
    }

    @Override // com.google.android.gms.internal.ads.hj2
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f11163a.packageName;
        PackageInfo packageInfo = this.f11164b;
        Integer valueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        bundle.putString("pn", str);
        if (valueOf != null) {
            bundle.putInt("vc", valueOf.intValue());
        }
        PackageInfo packageInfo2 = this.f11164b;
        String str2 = packageInfo2 != null ? packageInfo2.versionName : null;
        if (str2 != null) {
            bundle.putString("vnm", str2);
        }
    }
}
