package com.moat.analytics.mobile.tjy;

import android.content.Context;
import android.os.Build;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.facebook.ads.AudienceNetworkActivity;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class ad {

    /* renamed from: a, reason: collision with root package name */
    protected final a f7216a;

    /* renamed from: b, reason: collision with root package name */
    protected final ap f7217b;

    /* renamed from: c, reason: collision with root package name */
    protected bh f7218c;

    /* renamed from: d, reason: collision with root package name */
    private final String f7219d;
    private WeakReference f;
    private WeakReference g;
    private WebView h;
    private boolean j;
    private final String e = String.format("_moatTracker%d", Integer.valueOf((int) (Math.random() * 1.0E8d)));
    private final LinkedList k = new LinkedList();
    private boolean i = false;

    ad(String str, ap apVar, a aVar) {
        this.f7219d = str;
        this.f7217b = apVar;
        this.f7216a = aVar;
        this.f = new WeakReference(aVar.c());
    }

    void a() {
        if (this.k.size() >= 200) {
            LinkedList linkedList = new LinkedList();
            for (int i = 0; i < 10; i++) {
                linkedList.addFirst((String) this.k.removeFirst());
            }
            int min = Math.min(Math.min(this.k.size() / ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION, 10) + ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION, this.k.size());
            for (int i2 = 0; i2 < min; i2++) {
                this.k.removeFirst();
            }
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                this.k.addFirst((String) it.next());
            }
        }
        int i3 = 0;
        while (!this.k.isEmpty() && i3 < 200) {
            i3++;
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            while (!this.k.isEmpty() && i3 < 200) {
                i3++;
                String str = (String) this.k.getFirst();
                if (sb.length() + str.length() <= 2000) {
                    this.k.removeFirst();
                    if (z) {
                        z = false;
                    } else {
                        sb.append(",");
                    }
                    sb.append(str);
                }
            }
            a(String.format("javascript:%s.dispatchMany([%s])", this.e, sb.toString()));
        }
        this.k.clear();
    }

    public void a(View view) {
        this.g = new WeakReference(view);
        if (this.f7218c != null) {
            this.f7218c.a(view);
        }
    }

    public void a(View view, Map map, Integer num, Integer num2, Integer num3) {
        this.g = new WeakReference(view);
        this.h = new WebView((Context) this.f.get());
        WebSettings settings = this.h.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccess(false);
        settings.setDatabaseEnabled(false);
        settings.setDomStorageEnabled(false);
        settings.setGeolocationEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setSaveFormData(false);
        if (Build.VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(1);
        }
        this.h.setWebViewClient(new ae(this));
        this.h.loadData(String.format("<html><head></head><body><div id=\"%s\" style=\"width: %dpx; height: %dpx;\"></div><script>(function initMoatTracking(apiname, pcode, ids, duration) {var events = [];window[pcode + '_moatElToTrack'] = document.getElementById('%s');var moatapi = {'dropTime':%d,'adData': {'ids': ids, 'duration': duration, 'url': 'n/a'},'dispatchEvent': function(ev) {if (this.sendEvent) {if (events) { events.push(ev); ev = events; events = false; }this.sendEvent(ev);} else {events.push(ev);}},'dispatchMany': function(evs){for (var i=0, l=evs.length; i<l; i++) {this.dispatchEvent(evs[i]);}}};Object.defineProperty(window, apiname, {'value': moatapi});var s = document.createElement('script');s.src = 'https://z.moatads.com/' + pcode + '/moatvideo.js?' + apiname + '#' + apiname;document.body.appendChild(s);})('%s', '%s', %s, %s);</script></body></html>", "mianahwvc", num, num2, "mianahwvc", Long.valueOf(System.currentTimeMillis()), this.e, this.f7219d, new JSONObject(map).toString(), num3), AudienceNetworkActivity.WEBVIEW_MIME_TYPE, null);
    }

    void a(String str) {
        this.h.loadUrl(str);
    }

    public void a(JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        if (!this.i || this.h == null) {
            this.k.add(jSONObject2);
        } else {
            this.h.loadUrl(String.format("javascript:%s.dispatchEvent(%s);", this.e, jSONObject2));
        }
    }

    public void b() {
        if (this.j) {
            return;
        }
        if (this.f7218c != null) {
            this.f7218c.d();
            this.f7218c = null;
        }
        if (this.h != null) {
            this.h.loadUrl("about:blank");
            this.h.destroy();
            this.h = null;
        }
        this.j = true;
    }
}
