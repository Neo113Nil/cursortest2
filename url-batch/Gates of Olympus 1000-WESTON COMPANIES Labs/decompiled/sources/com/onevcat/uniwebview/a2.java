package com.onevcat.uniwebview;

import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsCallback;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a2 extends CustomTabsCallback {
    public final /* synthetic */ b2 a;

    public a2(b2 b2Var) {
        this.a = b2Var;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int i, Bundle bundle) {
        C0060l c0060l = C0060l.b;
        String message = "onNavigationEvent: " + i;
        c0060l.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0060l.a(EnumC0057k.INFO, message);
        if (i == 6) {
            b2 b2Var = this.a;
            b2Var.getClass();
            C0069o c0069o = C0069o.b;
            String name = b2Var.b;
            c0069o.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            String message2 = "Removing safe browsing from manager: " + name;
            Intrinsics.checkNotNullParameter(message2, "message");
            c0060l.a(EnumC0057k.DEBUG, message2);
            c0069o.a.remove(name);
            b2 b2Var2 = this.a;
            b2Var2.d.a(b2Var2.b, d2.SafeBrowsingFinished, "");
        }
    }
}
