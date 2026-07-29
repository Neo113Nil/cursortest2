package com.moat.analytics.mobile.cha;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.moat.analytics.mobile.cha.base.functional.Optional;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/* loaded from: classes2.dex */
final class x {

    /* renamed from: ˋ, reason: contains not printable characters */
    private static final LinkedHashSet<String> f1053 = new LinkedHashSet<>();

    x() {
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    static Optional<WebView> m1165(ViewGroup viewGroup, boolean z) {
        try {
            if (viewGroup == null) {
                return Optional.empty();
            }
            if (viewGroup instanceof WebView) {
                return Optional.of((WebView) viewGroup);
            }
            LinkedList linkedList = new LinkedList();
            linkedList.add(viewGroup);
            WebView webView = null;
            int i = 0;
            while (!linkedList.isEmpty() && i < 100) {
                i++;
                ViewGroup viewGroup2 = (ViewGroup) linkedList.poll();
                int childCount = viewGroup2.getChildCount();
                WebView webView2 = webView;
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        webView = webView2;
                        break;
                    }
                    View childAt = viewGroup2.getChildAt(i2);
                    if (childAt instanceof WebView) {
                        a.m994(3, "WebViewHound", childAt, "Found WebView");
                        if (z || m1166(String.valueOf(childAt.hashCode()))) {
                            if (webView2 == null) {
                                webView2 = (WebView) childAt;
                            } else {
                                a.m994(3, "WebViewHound", childAt, "Ambiguous ad container: multiple WebViews reside within it.");
                                a.m991("[ERROR] ", "WebAdTracker not created, ambiguous ad container: multiple WebViews reside within it");
                                webView = null;
                                break;
                            }
                        }
                    }
                    if (childAt instanceof ViewGroup) {
                        linkedList.add((ViewGroup) childAt);
                    }
                    i2++;
                }
            }
            return Optional.ofNullable(webView);
        } catch (Exception unused) {
            return Optional.empty();
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private static boolean m1166(String str) {
        try {
            boolean add = f1053.add(str);
            if (f1053.size() > 50) {
                Iterator<String> it = f1053.iterator();
                for (int i = 0; i < 25 && it.hasNext(); i++) {
                    it.next();
                    it.remove();
                }
            }
            a.m994(3, "WebViewHound", null, add ? "Newly Found WebView" : "Already Found WebView");
            return add;
        } catch (Exception e) {
            o.m1110(e);
            return false;
        }
    }
}
