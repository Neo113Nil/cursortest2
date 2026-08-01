package com.bytedance.sdk.openadsdk.core.yiw;

import android.util.Pair;
import android.view.View;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;
import java.util.Set;

/* compiled from: ViewabilityTracker.java */
/* loaded from: classes2.dex */
public class yiw {
    protected VastProperties Jd;
    private final AdSession NB;
    private final AdEvents sUS;
    protected String vG;
    private boolean yiw = false;
    protected boolean pvs = false;
    protected int icD = 0;

    void icD(int i) {
    }

    void pvs(float f, boolean z) {
    }

    public void pvs(boolean z) {
    }

    public void pvs(boolean z, float f) {
    }

    public yiw(AdSession adSession, AdEvents adEvents, View view) {
        this.NB = adSession;
        this.sUS = adEvents;
        this.vG = adSession.getAdSessionId();
        pvs(view);
    }

    void pvs(View view) {
        AdSession adSession;
        if (view == null || (adSession = this.NB) == null) {
            return;
        }
        adSession.registerAdView(view);
    }

    public void pvs(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession = this.NB;
        if (adSession != null) {
            adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
        }
    }

    boolean pvs() {
        return this.pvs;
    }

    public void pvs(int i) {
        int i2;
        int i3;
        if (this.NB == null || this.sUS == null) {
            return;
        }
        boolean z = false;
        if (NB.vG()) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4 && (i3 = this.icD) != 0 && i3 != 4) {
                            this.NB.finish();
                            this.pvs = false;
                            z = true;
                        }
                    } else if (!this.yiw && ((i2 = this.icD) == 1 || i2 == 2)) {
                        this.sUS.impressionOccurred();
                        this.yiw = true;
                        z = true;
                    }
                } else if (this.icD == 0) {
                    this.NB.start();
                    if (this.Jd == null) {
                        this.Jd = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                    }
                    this.sUS.loaded(this.Jd);
                    this.pvs = true;
                    this.Jd = null;
                    z = true;
                }
            } else if (this.icD == 0) {
                this.NB.start();
                this.sUS.loaded();
                this.pvs = true;
                z = true;
            }
        }
        if (z) {
            this.icD = i;
        }
    }

    void icD() {
        pvs(1);
    }

    void vG() {
        pvs(4);
    }

    public void Jd() {
        pvs(3);
    }

    public void pvs(Set<Pair<View, FriendlyObstructionPurpose>> set) {
        for (Pair<View, FriendlyObstructionPurpose> pair : set) {
            pvs((View) pair.first, (FriendlyObstructionPurpose) pair.second);
        }
    }
}
