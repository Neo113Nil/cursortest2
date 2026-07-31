package com.onevcat.uniwebview;

import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsCallback;
import com.imaginationoverflow.unity.referrer.BuildConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e5 extends CustomTabsCallback {
    public final /* synthetic */ f5 a;

    public e5(f5 f5Var) {
        this.a = f5Var;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int i, Bundle bundle) {
        o oVar = o.b;
        o oVar2 = o.b;
        String message = "onNavigationEvent: " + i;
        oVar2.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar2.a(n.INFO, message);
        if (i == 6) {
            f5 f5Var = this.a;
            f5Var.getClass();
            t tVar = t.b;
            String name = f5Var.b;
            tVar.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            String message2 = "Removing safe browsing from manager: " + name;
            oVar2.getClass();
            Intrinsics.checkNotNullParameter(message2, "message");
            oVar2.a(n.DEBUG, message2);
            tVar.a.remove(name);
            f5 f5Var2 = this.a;
            f5Var2.d.a(f5Var2.b, h5.SafeBrowsingFinished, BuildConfig.FLAVOR);
        }
    }
}
