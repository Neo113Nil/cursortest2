package com.moat.analytics.mobile.vng;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes2.dex */
class ab {

    private static class a implements Iterable<View> {

        /* renamed from: a, reason: collision with root package name */
        private final ViewGroup f7334a;

        /* renamed from: com.moat.analytics.mobile.vng.ab$a$a, reason: collision with other inner class name */
        private class C0380a implements Iterator<View> {

            /* renamed from: b, reason: collision with root package name */
            private int f7336b;

            private C0380a() {
                this.f7336b = -1;
            }

            @Override // java.util.Iterator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public View next() {
                this.f7336b++;
                return a.this.f7334a.getChildAt(this.f7336b);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f7336b + 1 < a.this.f7334a.getChildCount();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Not implemented. Under development.");
            }
        }

        private a(ViewGroup viewGroup) {
            this.f7334a = viewGroup;
        }

        @Override // java.lang.Iterable
        public Iterator<View> iterator() {
            return new C0380a();
        }
    }

    ab() {
    }

    static com.moat.analytics.mobile.vng.a.b.a<WebView> a(ViewGroup viewGroup) {
        WebView webView;
        View next;
        if (viewGroup instanceof WebView) {
            return com.moat.analytics.mobile.vng.a.b.a.a((WebView) viewGroup);
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(viewGroup);
        HashSet hashSet = new HashSet();
        int i = 0;
        loop0: while (true) {
            webView = null;
            while (!linkedList.isEmpty() && i < 100) {
                i++;
                Iterator<View> it = new a((ViewGroup) linkedList.poll()).iterator();
                while (it.hasNext()) {
                    next = it.next();
                    if (next instanceof WebView) {
                        if (webView == null) {
                            webView = (WebView) next;
                        }
                    }
                    if (next instanceof ViewGroup) {
                        ViewGroup viewGroup2 = (ViewGroup) next;
                        if (!hashSet.contains(viewGroup2)) {
                            hashSet.add(viewGroup2);
                            linkedList.add(viewGroup2);
                        }
                    }
                }
            }
            p.a(3, "WebViewHound", next, "Ambiguous ad container: multiple WebViews reside within it.");
            p.a("[ERROR] ", "WebAdTracker not created, ambiguous ad container: multiple WebViews reside within it");
        }
        return com.moat.analytics.mobile.vng.a.b.a.b(webView);
    }
}
