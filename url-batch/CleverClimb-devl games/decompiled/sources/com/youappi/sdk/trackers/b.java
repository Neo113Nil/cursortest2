package com.youappi.sdk.trackers;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import com.google.gson.j;
import com.youappi.sdk.net.model.AdItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final b f9477a = new b();

    /* renamed from: b, reason: collision with root package name */
    private static String f9478b = b.class.getSimpleName();

    /* renamed from: c, reason: collision with root package name */
    private List<a> f9479c;

    private b() {
    }

    public static b a() {
        return f9477a;
    }

    public void a(Context context) {
        this.f9479c = new ArrayList();
        if (com.youappi.sdk.net.trackers.a.a()) {
            this.f9479c.add(new com.youappi.sdk.net.trackers.a(context));
            Log.i(f9478b, "MoatViewabilityTracker Added");
        }
    }

    public void a(WebView webView) {
        Iterator<a> it = this.f9479c.iterator();
        while (it.hasNext()) {
            it.next().a(webView);
        }
    }

    public void a(j jVar, AdItem adItem) {
        Iterator<a> it = this.f9479c.iterator();
        while (it.hasNext()) {
            it.next().a(jVar, adItem);
        }
    }

    public void a(AdItem adItem, MediaPlayer mediaPlayer, View view) {
        Iterator<a> it = this.f9479c.iterator();
        while (it.hasNext()) {
            it.next().a(adItem, mediaPlayer, view);
        }
    }

    public void b() {
        Iterator<a> it = this.f9479c.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public void c() {
        Iterator<a> it = this.f9479c.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }
}
