package com.onevcat.uniwebview.internal.obfuscated;

import android.app.Activity;
import android.webkit.WebViewDatabase;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class N {
    public static void a(Activity activity, String host, String realm) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(realm, "realm");
        WebViewDatabase.getInstance(activity).clearHttpAuthUsernamePassword();
    }
}
