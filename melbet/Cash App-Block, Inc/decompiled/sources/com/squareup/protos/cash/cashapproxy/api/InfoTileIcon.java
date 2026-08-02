package com.squareup.protos.cash.cashapproxy.api;

import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class InfoTileIcon implements WireEnum {
    public static final /* synthetic */ InfoTileIcon[] $VALUES;
    public static final InfoTileIcon$Companion$ADAPTER$1 ADAPTER;
    public static final CardProduct.Companion Companion;
    public static final InfoTileIcon INFO_TILE_ICON_WARNING;

    static {
        InfoTileIcon infoTileIcon = new InfoTileIcon("INFO_TILE_ICON_WARNING", 0);
        INFO_TILE_ICON_WARNING = infoTileIcon;
        $VALUES = new InfoTileIcon[]{infoTileIcon};
        Companion = new CardProduct.Companion(20);
        ADAPTER = new InfoTileIcon$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(InfoTileIcon.class), Syntax.PROTO_2, null);
    }

    public static final InfoTileIcon fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return INFO_TILE_ICON_WARNING;
        }
        return null;
    }

    public static InfoTileIcon valueOf(String str) {
        return (InfoTileIcon) Enum.valueOf(InfoTileIcon.class, str);
    }

    public static InfoTileIcon[] values() {
        return (InfoTileIcon[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return 1;
    }
}
