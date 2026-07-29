package com.moat.analytics.mobile.iro;

import android.media.MediaPlayer;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class q extends g implements NativeVideoTracker {

    /* renamed from: ͺ, reason: contains not printable characters */
    private WeakReference<MediaPlayer> f1211;

    @Override // com.moat.analytics.mobile.iro.c
    /* renamed from: ˊ */
    final String mo1190() {
        return "NativeVideoTracker";
    }

    q(String str) {
        super(str);
        b.m1182(3, "NativeVideoTracker", this, "In initialization method.");
        if (str == null || str.isEmpty()) {
            StringBuilder sb = new StringBuilder("PartnerCode is ");
            sb.append(str == null ? "null" : "empty");
            String sb2 = sb.toString();
            String str2 = "NativeDisplayTracker creation problem, " + sb2;
            b.m1182(3, "NativeVideoTracker", this, str2);
            b.m1180("[ERROR] ", str2);
            this.f1088 = new o(sb2);
        }
        b.m1180("[SUCCESS] ", "NativeVideoTracker created");
    }

    @Override // com.moat.analytics.mobile.iro.g
    /* renamed from: ॱˊ */
    final boolean mo1241() {
        return (this.f1211 == null || this.f1211.get() == null) ? false : true;
    }

    @Override // com.moat.analytics.mobile.iro.NativeVideoTracker
    public final boolean trackVideoAd(Map<String, String> map, MediaPlayer mediaPlayer, View view) {
        try {
            m1191();
            m1194();
            if (mediaPlayer == null) {
                throw new o("Null player instance");
            }
            try {
                mediaPlayer.getCurrentPosition();
                this.f1211 = new WeakReference<>(mediaPlayer);
                return super.mo1203(map, view);
            } catch (Exception unused) {
                throw new o("Playback has already completed");
            }
        } catch (Exception e) {
            o.m1290(e);
            String m1289 = o.m1289("trackVideoAd", e);
            if (this.f1086 != null) {
                this.f1086.onTrackingFailedToStart(m1289);
            }
            b.m1182(3, "NativeVideoTracker", this, m1289);
            b.m1180("[ERROR] ", "NativeVideoTracker " + m1289);
            return false;
        }
    }

    @Override // com.moat.analytics.mobile.iro.g
    /* renamed from: ˋॱ */
    final Integer mo1240() {
        return Integer.valueOf(this.f1211.get().getCurrentPosition());
    }

    @Override // com.moat.analytics.mobile.iro.g
    /* renamed from: ॱˎ */
    final boolean mo1242() {
        return this.f1211.get().isPlaying();
    }

    @Override // com.moat.analytics.mobile.iro.g
    /* renamed from: ʻॱ */
    final Integer mo1238() {
        return Integer.valueOf(this.f1211.get().getDuration());
    }

    @Override // com.moat.analytics.mobile.iro.d
    /* renamed from: ˊॱ */
    final Map<String, Object> mo1201() throws o {
        MediaPlayer mediaPlayer = this.f1211.get();
        HashMap hashMap = new HashMap();
        hashMap.put("width", Integer.valueOf(mediaPlayer.getVideoWidth()));
        hashMap.put("height", Integer.valueOf(mediaPlayer.getVideoHeight()));
        hashMap.put("duration", Integer.valueOf(mediaPlayer.getDuration()));
        return hashMap;
    }

    @Override // com.moat.analytics.mobile.iro.d, com.moat.analytics.mobile.iro.c
    /* renamed from: ˏ */
    final void mo1195(List<String> list) throws o {
        if (!((this.f1211 == null || this.f1211.get() == null) ? false : true)) {
            list.add("Player is null");
        }
        super.mo1195(list);
    }
}
