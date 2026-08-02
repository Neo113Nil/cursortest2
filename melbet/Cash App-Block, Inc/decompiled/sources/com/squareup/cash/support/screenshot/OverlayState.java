package com.squareup.cash.support.screenshot;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class OverlayState {
    public static final /* synthetic */ OverlayState[] $VALUES;
    public static final OverlayState OVERLAY_HIDDEN;
    public static final OverlayState SCREENSHOT_CONTROLS_DISPLAYED;
    public static final OverlayState SHOW_SCREENSHOT_RESULT;

    static {
        OverlayState overlayState = new OverlayState("SCREENSHOT_CONTROLS_DISPLAYED", 0);
        SCREENSHOT_CONTROLS_DISPLAYED = overlayState;
        OverlayState overlayState2 = new OverlayState("SHOW_SCREENSHOT_RESULT", 1);
        SHOW_SCREENSHOT_RESULT = overlayState2;
        OverlayState overlayState3 = new OverlayState("OVERLAY_HIDDEN", 2);
        OVERLAY_HIDDEN = overlayState3;
        $VALUES = new OverlayState[]{overlayState, overlayState2, overlayState3};
    }

    public static OverlayState valueOf(String str) {
        return (OverlayState) Enum.valueOf(OverlayState.class, str);
    }

    public static OverlayState[] values() {
        return (OverlayState[]) $VALUES.clone();
    }
}
