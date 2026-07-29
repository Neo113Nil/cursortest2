package com.moat.analytics.mobile.cha;

import android.media.MediaPlayer;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class s extends i implements NativeVideoTracker {

    /* renamed from: ॱˊ, reason: contains not printable characters */
    private WeakReference<MediaPlayer> f1003;

    @Override // com.moat.analytics.mobile.cha.d
    /* renamed from: ˋ */
    final String mo1024() {
        return "NativeVideoTracker";
    }

    s(String str) {
        super(str);
        a.m994(3, "NativeVideoTracker", this, "In initialization method.");
        if (str == null || str.isEmpty()) {
            StringBuilder sb = new StringBuilder("PartnerCode is ");
            sb.append(str == null ? "null" : "empty");
            String sb2 = sb.toString();
            String str2 = "NativeDisplayTracker creation problem, " + sb2;
            a.m994(3, "NativeVideoTracker", this, str2);
            a.m991("[ERROR] ", str2);
            this.f879 = new o(sb2);
        }
        a.m991("[SUCCESS] ", "NativeVideoTracker created");
    }

    @Override // com.moat.analytics.mobile.cha.i
    /* renamed from: ͺ */
    final boolean mo1054() {
        return (this.f1003 == null || this.f1003.get() == null) ? false : true;
    }

    @Override // com.moat.analytics.mobile.cha.NativeVideoTracker
    public final boolean trackVideoAd(Map<String, String> map, MediaPlayer mediaPlayer, View view) {
        try {
            m1025();
            m1026();
            if (mediaPlayer == null) {
                throw new o("Null player instance");
            }
            try {
                mediaPlayer.getCurrentPosition();
                this.f1003 = new WeakReference<>(mediaPlayer);
                return super.mo1009(map, view);
            } catch (Exception unused) {
                throw new o("Playback has already completed");
            }
        } catch (Exception e) {
            o.m1110(e);
            String m1109 = o.m1109("trackVideoAd", e);
            if (this.f873 != null) {
                this.f873.onTrackingFailedToStart(m1109);
            }
            a.m994(3, "NativeVideoTracker", this, m1109);
            a.m991("[ERROR] ", "NativeVideoTracker " + m1109);
            return false;
        }
    }

    @Override // com.moat.analytics.mobile.cha.i
    /* renamed from: ॱˋ */
    final Integer mo1055() {
        return Integer.valueOf(this.f1003.get().getCurrentPosition());
    }

    @Override // com.moat.analytics.mobile.cha.i
    /* renamed from: ॱˎ */
    final boolean mo1056() {
        return this.f1003.get().isPlaying();
    }

    @Override // com.moat.analytics.mobile.cha.i
    /* renamed from: ॱᐝ */
    final Integer mo1057() {
        return Integer.valueOf(this.f1003.get().getDuration());
    }

    @Override // com.moat.analytics.mobile.cha.b
    /* renamed from: ᐝ */
    final Map<String, Object> mo1011() throws o {
        MediaPlayer mediaPlayer = this.f1003.get();
        HashMap hashMap = new HashMap();
        hashMap.put("width", Integer.valueOf(mediaPlayer.getVideoWidth()));
        hashMap.put("height", Integer.valueOf(mediaPlayer.getVideoHeight()));
        hashMap.put("duration", Integer.valueOf(mediaPlayer.getDuration()));
        return hashMap;
    }

    @Override // com.moat.analytics.mobile.cha.b, com.moat.analytics.mobile.cha.d
    /* renamed from: ˋ */
    final void mo1004(List<String> list) throws o {
        if (!((this.f1003 == null || this.f1003.get() == null) ? false : true)) {
            list.add("Player is null");
        }
        super.mo1004(list);
    }
}
