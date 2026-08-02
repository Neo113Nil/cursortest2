package com.withpersona.sdk2.inquiry.governmentid.video_capture;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class WebRtcState {
    public static final /* synthetic */ WebRtcState[] $VALUES;
    public static final WebRtcState Connected;
    public static final WebRtcState Connecting;
    public static final WebRtcState Disconnected;

    static {
        WebRtcState webRtcState = new WebRtcState("Connecting", 0);
        Connecting = webRtcState;
        WebRtcState webRtcState2 = new WebRtcState("Connected", 1);
        Connected = webRtcState2;
        WebRtcState webRtcState3 = new WebRtcState("Disconnected", 2);
        Disconnected = webRtcState3;
        $VALUES = new WebRtcState[]{webRtcState, webRtcState2, webRtcState3};
    }

    public static WebRtcState valueOf(String str) {
        return (WebRtcState) Enum.valueOf(WebRtcState.class, str);
    }

    public static WebRtcState[] values() {
        return (WebRtcState[]) $VALUES.clone();
    }
}
