package com.stripe.android.stripe3ds2.init.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class UiCustomization$ButtonType {
    public static final /* synthetic */ UiCustomization$ButtonType[] $VALUES;
    public static final UiCustomization$ButtonType CANCEL;
    public static final UiCustomization$ButtonType CONTINUE;
    public static final UiCustomization$ButtonType NEXT;
    public static final UiCustomization$ButtonType RESEND;
    public static final UiCustomization$ButtonType SELECT;
    public static final UiCustomization$ButtonType SUBMIT;

    static {
        UiCustomization$ButtonType uiCustomization$ButtonType = new UiCustomization$ButtonType("SUBMIT", 0);
        SUBMIT = uiCustomization$ButtonType;
        UiCustomization$ButtonType uiCustomization$ButtonType2 = new UiCustomization$ButtonType("CONTINUE", 1);
        CONTINUE = uiCustomization$ButtonType2;
        UiCustomization$ButtonType uiCustomization$ButtonType3 = new UiCustomization$ButtonType("NEXT", 2);
        NEXT = uiCustomization$ButtonType3;
        UiCustomization$ButtonType uiCustomization$ButtonType4 = new UiCustomization$ButtonType("CANCEL", 3);
        CANCEL = uiCustomization$ButtonType4;
        UiCustomization$ButtonType uiCustomization$ButtonType5 = new UiCustomization$ButtonType("RESEND", 4);
        RESEND = uiCustomization$ButtonType5;
        UiCustomization$ButtonType uiCustomization$ButtonType6 = new UiCustomization$ButtonType("SELECT", 5);
        SELECT = uiCustomization$ButtonType6;
        $VALUES = new UiCustomization$ButtonType[]{uiCustomization$ButtonType, uiCustomization$ButtonType2, uiCustomization$ButtonType3, uiCustomization$ButtonType4, uiCustomization$ButtonType5, uiCustomization$ButtonType6};
    }

    public static UiCustomization$ButtonType valueOf(String str) {
        return (UiCustomization$ButtonType) Enum.valueOf(UiCustomization$ButtonType.class, str);
    }

    public static UiCustomization$ButtonType[] values() {
        return (UiCustomization$ButtonType[]) $VALUES.clone();
    }
}
