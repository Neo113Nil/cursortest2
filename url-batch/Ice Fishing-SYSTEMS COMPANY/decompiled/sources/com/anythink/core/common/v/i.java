package com.anythink.core.common.v;

import android.util.Log;
import com.anythink.core.api.ATAdInfo;

/* loaded from: classes.dex */
public class i {
    public static void a(String str, String str2, ATAdInfo aTAdInfo, boolean z8) {
        if (aTAdInfo != null) {
            return;
        }
        try {
            com.anythink.core.common.u.e.b("ATAdInfo is null", "An exception occurred for placementId (" + str + ") in the method " + str2 + ". External adInfo is null: " + z8, com.anythink.core.common.d.t.b().r());
        } catch (Throwable th) {
            Log.e("i", "sendATAdInfoNullPointException error: " + th.getMessage());
        }
    }
}
