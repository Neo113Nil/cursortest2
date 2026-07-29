package com.youappi.sdk.trackers;

import android.media.MediaPlayer;
import android.view.View;
import android.webkit.WebView;
import com.google.gson.j;
import com.youappi.sdk.net.model.AdItem;

/* loaded from: classes2.dex */
public interface a {
    void a(WebView webView);

    void a(j jVar, AdItem adItem);

    void a(AdItem adItem, MediaPlayer mediaPlayer, View view);

    void b();

    void c();
}
