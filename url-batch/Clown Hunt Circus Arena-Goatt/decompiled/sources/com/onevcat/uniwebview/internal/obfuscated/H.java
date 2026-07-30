package com.onevcat.uniwebview.internal.obfuscated;

import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsCallback;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class H extends CustomTabsCallback {
    public final WeakReference a;

    public H(B3 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.a = new WeakReference(owner);
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int i, Bundle bundle) {
        B3 b3 = (B3) this.a.get();
        if (b3 != null) {
            if (b3.i) {
                B b = B.b;
                String message = "Navigation event received after dispose: " + i;
                b.getClass();
                Intrinsics.checkNotNullParameter(message, "message");
                b.a(A.DEBUG, message);
                return;
            }
            B b2 = B.b;
            String message2 = "onNavigationEvent: " + i;
            b2.getClass();
            Intrinsics.checkNotNullParameter(message2, "message");
            A a = A.INFO;
            b2.a(a, message2);
            if (i == 1) {
                Intrinsics.checkNotNullParameter("onNavigationEvent: Navigation Started", "message");
                b2.a(a, "onNavigationEvent: Navigation Started");
                C0069j c0069j = b3.d;
                H3 method = H3.SafeBrowsingEvent;
                String parameters = B3.a("navigation_started");
                Intrinsics.checkNotNullParameter(method, "method");
                Intrinsics.checkNotNullParameter(parameters, "parameters");
                c0069j.b.a(c0069j.a, method, parameters);
                return;
            }
            if (i == 2) {
                Intrinsics.checkNotNullParameter("onNavigationEvent: Navigation Finished", "message");
                b2.a(a, "onNavigationEvent: Navigation Finished");
                C0069j c0069j2 = b3.d;
                H3 method2 = H3.SafeBrowsingEvent;
                String parameters2 = B3.a("navigation_finished");
                Intrinsics.checkNotNullParameter(method2, "method");
                Intrinsics.checkNotNullParameter(parameters2, "parameters");
                c0069j2.b.a(c0069j2.a, method2, parameters2);
                return;
            }
            if (i == 3) {
                Intrinsics.checkNotNullParameter("onNavigationEvent: Navigation Failed", "message");
                b2.a(a, "onNavigationEvent: Navigation Failed");
                C0069j c0069j3 = b3.d;
                H3 method3 = H3.SafeBrowsingEvent;
                String parameters3 = B3.a("navigation_failed");
                Intrinsics.checkNotNullParameter(method3, "method");
                Intrinsics.checkNotNullParameter(parameters3, "parameters");
                c0069j3.b.a(c0069j3.a, method3, parameters3);
                return;
            }
            if (i == 4) {
                Intrinsics.checkNotNullParameter("onNavigationEvent: Navigation Aborted", "message");
                b2.a(a, "onNavigationEvent: Navigation Aborted");
                return;
            }
            if (i != 6) {
                return;
            }
            if (b3.j) {
                Intrinsics.checkNotNullParameter("onNavigationEvent: TAB_HIDDEN already handled, ignoring duplicate event.", "message");
                b2.a(a, "onNavigationEvent: TAB_HIDDEN already handled, ignoring duplicate event.");
                return;
            }
            b3.j = true;
            String parameters4 = B3.a("tab_hidden");
            C0069j c0069j4 = b3.d;
            H3 method4 = H3.SafeBrowsingEvent;
            Intrinsics.checkNotNullParameter(method4, "method");
            Intrinsics.checkNotNullParameter(parameters4, "parameters");
            c0069j4.b.a(c0069j4.a, method4, parameters4);
            b3.b("tab_hidden");
        }
    }
}
