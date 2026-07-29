package com.moat.analytics.mobile.tjy;

import android.media.MediaPlayer;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
class ah extends i implements NativeVideoTracker {
    public ah(String str, a aVar, ap apVar) {
        super(str, aVar, apVar);
    }

    @Override // com.moat.analytics.mobile.tjy.f
    protected Map a() {
        MediaPlayer mediaPlayer = (MediaPlayer) this.f.get();
        HashMap hashMap = new HashMap();
        hashMap.put("width", Integer.valueOf(mediaPlayer.getVideoWidth()));
        hashMap.put("height", Integer.valueOf(mediaPlayer.getVideoHeight()));
        hashMap.put("duration", Integer.valueOf(mediaPlayer.getDuration()));
        return hashMap;
    }

    @Override // com.moat.analytics.mobile.tjy.f, com.moat.analytics.mobile.tjy.NativeVideoTracker
    public void changeTargetView(View view) {
        super.changeTargetView(view);
    }

    @Override // com.moat.analytics.mobile.tjy.i
    protected Integer f() {
        return Integer.valueOf(((MediaPlayer) this.f.get()).getCurrentPosition());
    }

    @Override // com.moat.analytics.mobile.tjy.i
    protected boolean g() {
        return ((MediaPlayer) this.f.get()).isPlaying();
    }

    @Override // com.moat.analytics.mobile.tjy.i
    protected Integer h() {
        return Integer.valueOf(((MediaPlayer) this.f.get()).getDuration());
    }

    @Override // com.moat.analytics.mobile.tjy.f
    /* renamed from: trackVideoAd, reason: merged with bridge method [inline-methods] */
    public boolean a(Map map, MediaPlayer mediaPlayer, View view) {
        if (mediaPlayer == null) {
            a("Null player instance. Not tracking.");
        }
        try {
            mediaPlayer.getCurrentPosition();
            return super.a(map, mediaPlayer, view);
        } catch (IllegalStateException unused) {
            a("Playback has already completed. Not tracking.");
            return false;
        }
    }
}
