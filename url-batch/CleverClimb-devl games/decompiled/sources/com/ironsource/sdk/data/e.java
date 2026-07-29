package com.ironsource.sdk.data;

/* compiled from: SSAEnums.java */
/* loaded from: classes2.dex */
public class e {

    /* compiled from: SSAEnums.java */
    public enum a {
        None,
        Device,
        Controller
    }

    /* compiled from: SSAEnums.java */
    public enum b {
        None,
        FailedToDownload,
        FailedToLoad,
        Loaded,
        Ready,
        Failed
    }

    /* compiled from: SSAEnums.java */
    public enum d {
        OfferWall,
        Interstitial,
        OfferWallCredits,
        RewardedVideo
    }

    /* compiled from: SSAEnums.java */
    public enum c {
        MODE_0(0),
        MODE_1(1),
        MODE_2(2),
        MODE_3(3);

        private int e;

        c(int i) {
            this.e = i;
        }

        public int a() {
            return this.e;
        }
    }
}
