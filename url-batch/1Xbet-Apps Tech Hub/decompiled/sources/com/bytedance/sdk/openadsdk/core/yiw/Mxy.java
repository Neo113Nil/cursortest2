package com.bytedance.sdk.openadsdk.core.yiw;

import android.view.View;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.media.InteractionType;
import com.iab.omid.library.bytedance2.adsession.media.MediaEvents;
import com.iab.omid.library.bytedance2.adsession.media.PlayerState;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;

/* compiled from: ViewabilityTrackerForVideo.java */
/* loaded from: classes2.dex */
public class Mxy extends yiw {
    private final MediaEvents NB;
    private boolean sUS;

    public Mxy(AdSession adSession, AdEvents adEvents, View view, MediaEvents mediaEvents) {
        super(adSession, adEvents, view);
        this.NB = mediaEvents;
    }

    @Override // com.bytedance.sdk.openadsdk.core.yiw.yiw
    public void pvs(boolean z, float f) {
        if (z) {
            this.Jd = VastProperties.createVastPropertiesForSkippableMedia(f, true, Position.STANDALONE);
        } else {
            this.Jd = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        }
        pvs(2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.yiw.yiw
    public void pvs(float f, boolean z) {
        if (pvs()) {
            this.NB.start(f, z ? 0.0f : 1.0f);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.yiw.yiw
    public void pvs(boolean z) {
        this.sUS = z;
        icD(12);
    }

    @Override // com.bytedance.sdk.openadsdk.core.yiw.yiw
    public void icD(int i) {
        if (pvs()) {
            switch (i) {
                case 0:
                    this.NB.pause();
                    break;
                case 1:
                    this.NB.resume();
                    break;
                case 2:
                case 14:
                    this.NB.skipped();
                    break;
                case 4:
                    this.NB.bufferStart();
                    break;
                case 5:
                    this.NB.bufferFinish();
                    break;
                case 6:
                    this.NB.firstQuartile();
                    break;
                case 7:
                    this.NB.midpoint();
                    break;
                case 8:
                    this.NB.thirdQuartile();
                    break;
                case 9:
                    this.NB.complete();
                    break;
                case 10:
                    this.NB.playerStateChange(PlayerState.FULLSCREEN);
                    break;
                case 11:
                    this.NB.playerStateChange(PlayerState.NORMAL);
                    break;
                case 12:
                    this.NB.volumeChange(this.sUS ? 0.0f : 1.0f);
                    break;
                case 13:
                    this.NB.adUserInteraction(InteractionType.CLICK);
                    break;
            }
        }
    }
}
