package com.onevcat.uniwebview;

import android.app.Activity;
import android.webkit.WebViewDatabase;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.onevcat.uniwebview.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0087u {
    public static void a(Activity activity, String host, String realm) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(realm, "realm");
        WebViewDatabase.getInstance(activity).clearHttpAuthUsernamePassword();
    }
}
