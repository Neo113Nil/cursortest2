package com.mopub.mobileads;

/* loaded from: classes2.dex */
enum VideoTrackingEvent {
    START("start"),
    FIRST_QUARTILE("firstQuartile"),
    MIDPOINT("midpoint"),
    THIRD_QUARTILE("thirdQuartile"),
    COMPLETE("complete"),
    COMPANION_AD_VIEW("companionAdView"),
    COMPANION_AD_CLICK("companionAdClick"),
    UNKNOWN("");

    private final String name;

    VideoTrackingEvent(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    public static VideoTrackingEvent fromString(String str) {
        if (str == null) {
            return UNKNOWN;
        }
        for (VideoTrackingEvent videoTrackingEvent : values()) {
            if (str.equals(videoTrackingEvent.getName())) {
                return videoTrackingEvent;
            }
        }
        return UNKNOWN;
    }
}
