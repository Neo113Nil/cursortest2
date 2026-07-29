package com.applovin.impl.adview;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.impl.a.a;
import com.applovin.impl.adview.h;
import com.youappi.sdk.net.model.VideoEvent;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class p extends k {

    /* renamed from: a, reason: collision with root package name */
    private final Set<com.applovin.impl.a.g> f2620a = new HashSet();

    private void a() {
        if (!isFullyWatched() || this.f2620a.isEmpty()) {
            return;
        }
        this.logger.c("InterstitialActivity", "Firing " + this.f2620a.size() + " un-fired video progress trackers when video was completed.");
        a(this.f2620a);
    }

    private void a(a.c cVar) {
        a(cVar, com.applovin.impl.a.d.UNSPECIFIED);
    }

    private void a(a.c cVar, com.applovin.impl.a.d dVar) {
        a(cVar, "", dVar);
    }

    private void a(a.c cVar, String str) {
        a(cVar, str, com.applovin.impl.a.d.UNSPECIFIED);
    }

    private void a(a.c cVar, String str, com.applovin.impl.a.d dVar) {
        if (isVastAd()) {
            a(((com.applovin.impl.a.a) this.currentAd).a(cVar, str), dVar);
        }
    }

    private void a(Set<com.applovin.impl.a.g> set) {
        a(set, com.applovin.impl.a.d.UNSPECIFIED);
    }

    private void a(Set<com.applovin.impl.a.g> set, com.applovin.impl.a.d dVar) {
        if (!isVastAd() || set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.videoView.getCurrentPosition());
        com.applovin.impl.a.k c2 = b().c();
        Uri a2 = c2 != null ? c2.a() : null;
        this.logger.a("InterstitialActivity", "Firing " + set.size() + " tracker(s): " + set);
        com.applovin.impl.a.i.a(set, seconds, a2, dVar, this.sdk);
    }

    private com.applovin.impl.a.a b() {
        if (this.currentAd instanceof com.applovin.impl.a.a) {
            return (com.applovin.impl.a.a) this.currentAd;
        }
        return null;
    }

    @Override // com.applovin.impl.adview.k
    public void clickThroughFromVideo() {
        super.clickThroughFromVideo();
        a(a.c.VIDEO_CLICK);
    }

    @Override // com.applovin.impl.adview.k, com.applovin.impl.adview.i, android.content.DialogInterface
    public void dismiss() {
        if (isVastAd()) {
            a(a.c.VIDEO, "close");
            a(a.c.COMPANION, "close");
        }
        super.dismiss();
    }

    public void handleCountdownStep() {
        if (isVastAd()) {
            long seconds = this.computedLengthSeconds - TimeUnit.MILLISECONDS.toSeconds(this.videoView.getDuration() - this.videoView.getCurrentPosition());
            HashSet hashSet = new HashSet();
            for (com.applovin.impl.a.g gVar : new HashSet(this.f2620a)) {
                if (gVar.a(seconds, getVideoPercentViewed())) {
                    hashSet.add(gVar);
                    this.f2620a.remove(gVar);
                }
            }
            a(hashSet);
        }
    }

    @Override // com.applovin.impl.adview.k
    public void handleMediaError() {
        a(a.c.ERROR, com.applovin.impl.a.d.MEDIA_FILE_ERROR);
        super.handleMediaError();
    }

    @Override // com.applovin.impl.adview.k, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (isVastAd()) {
            this.f2620a.addAll(b().a(a.c.VIDEO, com.applovin.impl.a.h.f2419a));
            a(a.c.IMPRESSION);
            a(a.c.VIDEO, VideoEvent.EVENT_CREATIVE_VIEW);
        }
    }

    @Override // com.applovin.impl.adview.k
    public void playVideo() {
        this.countdownManager.a("PROGRESS_TRACKING", ((Long) this.sdk.a(com.applovin.impl.sdk.b.b.eM)).longValue(), new h.a() { // from class: com.applovin.impl.adview.p.1
            @Override // com.applovin.impl.adview.h.a
            public void a() {
                p.this.handleCountdownStep();
            }

            @Override // com.applovin.impl.adview.h.a
            public boolean b() {
                return p.this.shouldContinueFullLengthVideoCountdown();
            }
        });
        super.playVideo();
    }

    @Override // com.applovin.impl.adview.k
    public void showPoststitial() {
        if (isVastAd()) {
            a();
            if (!com.applovin.impl.a.i.c(b())) {
                dismiss();
                return;
            } else if (this.poststitialWasDisplayed) {
                return;
            } else {
                a(a.c.COMPANION, VideoEvent.EVENT_CREATIVE_VIEW);
            }
        }
        super.showPoststitial();
    }

    @Override // com.applovin.impl.adview.k
    public void skipVideo() {
        a(a.c.VIDEO, VideoEvent.EVENT_SKIP);
        super.skipVideo();
    }

    @Override // com.applovin.impl.adview.k
    public void toggleMute() {
        a.c cVar;
        String str;
        super.toggleMute();
        if (this.videoMuted) {
            cVar = a.c.VIDEO;
            str = VideoEvent.EVENT_MUTE;
        } else {
            cVar = a.c.VIDEO;
            str = VideoEvent.EVENT_UNMUTE;
        }
        a(cVar, str);
    }
}
