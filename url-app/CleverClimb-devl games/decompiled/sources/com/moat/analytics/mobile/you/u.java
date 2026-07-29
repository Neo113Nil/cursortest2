package com.moat.analytics.mobile.you;

import android.media.MediaPlayer;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
class u extends h implements NativeVideoTracker {
    private WeakReference<MediaPlayer> m;

    u(String str) {
        super(str);
        p.a(3, "NativeVideoTracker", this, "In initialization method.");
        if (str == null || str.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("PartnerCode is ");
            sb.append(str == null ? "null" : "empty");
            String sb2 = sb.toString();
            p.a("[ERROR] ", 3, "NativeVideoTracker", this, "NativeDisplayTracker creation problem, " + sb2);
            this.f7457a = new m(sb2);
        }
        p.a("[SUCCESS] ", a() + " created");
    }

    private void a(MediaPlayer mediaPlayer) {
        if (mediaPlayer == null) {
            throw new m("Null player instance");
        }
        try {
            mediaPlayer.getCurrentPosition();
        } catch (Exception unused) {
            throw new m("Playback has already completed");
        }
    }

    @Override // com.moat.analytics.mobile.you.b
    String a() {
        return "NativeVideoTracker";
    }

    @Override // com.moat.analytics.mobile.you.c, com.moat.analytics.mobile.you.b
    void a(List<String> list) {
        if (!n()) {
            list.add("Player is null");
        }
        super.a(list);
    }

    @Override // com.moat.analytics.mobile.you.c
    Map<String, Object> i() {
        MediaPlayer mediaPlayer = this.m.get();
        HashMap hashMap = new HashMap();
        hashMap.put("width", Integer.valueOf(mediaPlayer.getVideoWidth()));
        hashMap.put("height", Integer.valueOf(mediaPlayer.getVideoHeight()));
        hashMap.put("duration", Integer.valueOf(mediaPlayer.getDuration()));
        return hashMap;
    }

    @Override // com.moat.analytics.mobile.you.h
    boolean n() {
        return (this.m == null || this.m.get() == null) ? false : true;
    }

    @Override // com.moat.analytics.mobile.you.h
    Integer o() {
        return Integer.valueOf(this.m.get().getCurrentPosition());
    }

    @Override // com.moat.analytics.mobile.you.h
    boolean q() {
        return this.m.get().isPlaying();
    }

    @Override // com.moat.analytics.mobile.you.h
    Integer r() {
        return Integer.valueOf(this.m.get().getDuration());
    }

    @Override // com.moat.analytics.mobile.you.NativeVideoTracker
    public boolean trackVideoAd(Map<String, String> map, MediaPlayer mediaPlayer, View view) {
        try {
            c();
            d();
            a(mediaPlayer);
            this.m = new WeakReference<>(mediaPlayer);
            return super.a(map, view);
        } catch (Exception e) {
            m.a(e);
            String a2 = m.a("trackVideoAd", e);
            if (this.f7460d != null) {
                this.f7460d.onTrackingFailedToStart(a2);
            }
            p.a(3, "NativeVideoTracker", this, a2);
            p.a("[ERROR] ", a() + " " + a2);
            return false;
        }
    }
}
