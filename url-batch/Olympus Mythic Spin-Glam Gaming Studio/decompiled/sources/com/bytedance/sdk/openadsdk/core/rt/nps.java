package com.bytedance.sdk.openadsdk.core.rt;

import android.util.Pair;
import android.view.View;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;
import java.util.Set;

/* loaded from: classes5.dex */
public class nps {
    private final AdSession btk;
    protected VastProperties fb;
    private final AdEvents hhw;
    protected String zn;
    private boolean nps = false;
    protected boolean zmn = false;
    protected int fs = 0;

    void fs(int i) {
    }

    void zmn(float f, boolean z) {
    }

    public void zmn(boolean z) {
    }

    public void zmn(boolean z, float f) {
    }

    public nps(AdSession adSession, AdEvents adEvents, View view) {
        this.btk = adSession;
        this.hhw = adEvents;
        this.zn = adSession.getAdSessionId();
        zmn(view);
    }

    void zmn(View view) {
        AdSession adSession;
        if (view == null || (adSession = this.btk) == null) {
            return;
        }
        adSession.registerAdView(view);
    }

    public void zmn(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession = this.btk;
        if (adSession != null) {
            adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
        }
    }

    boolean zmn() {
        return this.zmn;
    }

    public void zmn(int i) {
        int i2;
        if (this.btk == null || this.hhw == null || !btk.zn()) {
            return;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 || (i2 = this.fs) == 0 || i2 == 4) {
                        return;
                    }
                    this.btk.finish();
                    this.zmn = false;
                } else {
                    if (this.nps) {
                        return;
                    }
                    int i3 = this.fs;
                    if (i3 != 1 && i3 != 2) {
                        return;
                    }
                    this.hhw.impressionOccurred();
                    this.nps = true;
                }
            } else {
                if (this.fs != 0) {
                    return;
                }
                this.btk.start();
                if (this.fb == null) {
                    this.fb = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                }
                this.hhw.loaded(this.fb);
                this.zmn = true;
                this.fb = null;
            }
        } else {
            if (this.fs != 0) {
                return;
            }
            this.btk.start();
            this.hhw.loaded();
            this.zmn = true;
        }
        this.fs = i;
    }

    void fs() {
        zmn(1);
    }

    void zn() {
        zmn(4);
    }

    public void fb() {
        zmn(3);
    }

    public void zmn(Set<Pair<View, FriendlyObstructionPurpose>> set) {
        for (Pair<View, FriendlyObstructionPurpose> pair : set) {
            zmn((View) pair.first, (FriendlyObstructionPurpose) pair.second);
        }
    }
}
