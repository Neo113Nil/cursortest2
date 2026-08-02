package com.squareup.cash.wallet.views;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class CardAppletTileRenderMode {
    public static final /* synthetic */ CardAppletTileRenderMode[] $VALUES;
    public static final CardAppletTileRenderMode CardStackOverlay;
    public static final CardAppletTileRenderMode Tile;

    static {
        CardAppletTileRenderMode cardAppletTileRenderMode = new CardAppletTileRenderMode("Tile", 0);
        Tile = cardAppletTileRenderMode;
        CardAppletTileRenderMode cardAppletTileRenderMode2 = new CardAppletTileRenderMode("CardStackOverlay", 1);
        CardStackOverlay = cardAppletTileRenderMode2;
        $VALUES = new CardAppletTileRenderMode[]{cardAppletTileRenderMode, cardAppletTileRenderMode2};
    }

    public static CardAppletTileRenderMode valueOf(String str) {
        return (CardAppletTileRenderMode) Enum.valueOf(CardAppletTileRenderMode.class, str);
    }

    public static CardAppletTileRenderMode[] values() {
        return (CardAppletTileRenderMode[]) $VALUES.clone();
    }
}
