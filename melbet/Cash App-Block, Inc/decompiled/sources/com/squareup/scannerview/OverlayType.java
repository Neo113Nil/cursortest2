package com.squareup.scannerview;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class OverlayType {
    public static final /* synthetic */ OverlayType[] $VALUES;
    public static final OverlayType CARD;
    public static final OverlayType SQUARE;

    static {
        OverlayType overlayType = new OverlayType("CARD", 0);
        CARD = overlayType;
        OverlayType overlayType2 = new OverlayType("SQUARE", 1);
        SQUARE = overlayType2;
        $VALUES = new OverlayType[]{overlayType, overlayType2};
    }

    public static OverlayType valueOf(String str) {
        return (OverlayType) Enum.valueOf(OverlayType.class, str);
    }

    public static OverlayType[] values() {
        return (OverlayType[]) $VALUES.clone();
    }
}
