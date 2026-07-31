package com.bytedance.sdk.openadsdk.core.rt;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.media.InteractionType;
import com.iab.omid.library.bytedance2.adsession.media.MediaEvents;
import com.iab.omid.library.bytedance2.adsession.media.PlayerState;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;

/* loaded from: classes3.dex */
public class bvs extends nps {

    @NonNull
    private final MediaEvents btk;
    private boolean hhw;

    public bvs(@NonNull AdSession adSession, @NonNull AdEvents adEvents, @NonNull View view, @NonNull MediaEvents mediaEvents) {
        super(adSession, adEvents, view);
        this.btk = mediaEvents;
    }

    @Override // com.bytedance.sdk.openadsdk.core.rt.nps
    public void zmn(boolean z, float f) {
        if (z) {
            this.fb = VastProperties.createVastPropertiesForSkippableMedia(f, true, Position.STANDALONE);
        } else {
            this.fb = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        }
        zmn(2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.rt.nps
    public void zmn(float f, boolean z) {
        if (zmn()) {
            this.btk.start(f, z ? 0.0f : 1.0f);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.rt.nps
    public void zmn(boolean z) {
        this.hhw = z;
        fs(12);
    }

    @Override // com.bytedance.sdk.openadsdk.core.rt.nps
    public void fs(int i) {
        if (zmn()) {
            switch (i) {
                case 0:
                    this.btk.pause();
                    break;
                case 1:
                    this.btk.resume();
                    break;
                case 2:
                case 14:
                    this.btk.skipped();
                    break;
                case 4:
                    this.btk.bufferStart();
                    break;
                case 5:
                    this.btk.bufferFinish();
                    break;
                case 6:
                    this.btk.firstQuartile();
                    break;
                case 7:
                    this.btk.midpoint();
                    break;
                case 8:
                    this.btk.thirdQuartile();
                    break;
                case 9:
                    this.btk.complete();
                    break;
                case 10:
                    this.btk.playerStateChange(PlayerState.FULLSCREEN);
                    break;
                case 11:
                    this.btk.playerStateChange(PlayerState.NORMAL);
                    break;
                case 12:
                    this.btk.volumeChange(this.hhw ? 0.0f : 1.0f);
                    break;
                case 13:
                    this.btk.adUserInteraction(InteractionType.CLICK);
                    break;
            }
        }
    }
}
