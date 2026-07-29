package com.facebook.internal;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.c;

/* compiled from: CustomTab.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private Uri f6114a;

    public f(String str, Bundle bundle) {
        bundle = bundle == null ? new Bundle() : bundle;
        this.f6114a = ab.a(z.a(), z.d() + "/dialog/" + str, bundle);
    }

    public void a(Activity activity) {
        android.support.customtabs.c a2 = new c.a().a();
        a2.f1479a.setPackage("com.android.chrome");
        a2.launchUrl(activity, this.f6114a);
    }
}
