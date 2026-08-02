package com.stripe.android.stripe3ds2.transactions;

import kotlin.enums.EnumEntriesList;
import kotlin.reflect.full.KClasses$$Lambda$1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class UiType {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ UiType[] $VALUES;
    public static final KClasses$$Lambda$1 Companion;
    public static final UiType Html;
    public static final UiType MultiSelect;
    public static final UiType OutOfBand;
    public static final UiType SingleSelect;
    public static final UiType Text;
    public final String code;
    public final boolean requiresSubmitButton;

    static {
        UiType uiType = new UiType("Text", "01", 0, true);
        Text = uiType;
        UiType uiType2 = new UiType("SingleSelect", "02", 1, true);
        SingleSelect = uiType2;
        UiType uiType3 = new UiType("MultiSelect", "03", 2, true);
        MultiSelect = uiType3;
        UiType uiType4 = new UiType("OutOfBand", "04", 3, false);
        OutOfBand = uiType4;
        UiType uiType5 = new UiType("Html", "05", 4, false);
        Html = uiType5;
        UiType[] uiTypeArr = {uiType, uiType2, uiType3, uiType4, uiType5};
        $VALUES = uiTypeArr;
        $ENTRIES = new EnumEntriesList(uiTypeArr);
        Companion = new KClasses$$Lambda$1(17);
    }

    public UiType(String str, String str2, int i, boolean z) {
        this.code = str2;
        this.requiresSubmitButton = z;
    }

    public static UiType valueOf(String str) {
        return (UiType) Enum.valueOf(UiType.class, str);
    }

    public static UiType[] values() {
        return (UiType[]) $VALUES.clone();
    }
}
