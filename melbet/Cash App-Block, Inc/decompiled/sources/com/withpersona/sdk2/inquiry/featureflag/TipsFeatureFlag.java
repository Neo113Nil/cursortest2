package com.withpersona.sdk2.inquiry.featureflag;

/* loaded from: classes9.dex */
public final class TipsFeatureFlag {
    public final /* synthetic */ int $r8$classId;
    public static final TipsFeatureFlag INSTANCE$1 = new TipsFeatureFlag(1);
    public static final TipsFeatureFlag INSTANCE$2 = new TipsFeatureFlag(2);
    public static final TipsFeatureFlag INSTANCE$3 = new TipsFeatureFlag(3);
    public static final TipsFeatureFlag INSTANCE$4 = new TipsFeatureFlag(4);
    public static final TipsFeatureFlag INSTANCE = new TipsFeatureFlag(0);
    public static final TipsFeatureFlag INSTANCE$5 = new TipsFeatureFlag(5);
    public static final TipsFeatureFlag INSTANCE$6 = new TipsFeatureFlag(6);
    public static final TipsFeatureFlag INSTANCE$7 = new TipsFeatureFlag(7);

    public /* synthetic */ TipsFeatureFlag(int i) {
        this.$r8$classId = i;
    }

    public final String getKey() {
        switch (this.$r8$classId) {
            case 0:
                return "tips_mobile_sdk";
            case 1:
                return "file_upload_multipart_transition_mobile_sdk";
            case 2:
                return "nfc_redesign_mobile_sdk";
            case 3:
                return "persona_workflows_mobile_sdk";
            case 4:
                return "selfie_redesign_mobile_sdk";
            case 5:
                return "tracking_events_mobile_sdk";
            case 6:
                return "use_camerax_for_video_mobile_sdk";
            default:
                return "use_old_selfie_centered_detector";
        }
    }
}
