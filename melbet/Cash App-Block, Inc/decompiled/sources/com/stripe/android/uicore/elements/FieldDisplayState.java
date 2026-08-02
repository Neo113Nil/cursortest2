package com.stripe.android.uicore.elements;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class FieldDisplayState {
    public static final /* synthetic */ FieldDisplayState[] $VALUES;
    public static final FieldDisplayState ERROR;
    public static final FieldDisplayState NORMAL;

    static {
        FieldDisplayState fieldDisplayState = new FieldDisplayState("NORMAL", 0);
        NORMAL = fieldDisplayState;
        FieldDisplayState fieldDisplayState2 = new FieldDisplayState("ERROR", 1);
        ERROR = fieldDisplayState2;
        $VALUES = new FieldDisplayState[]{fieldDisplayState, fieldDisplayState2, new FieldDisplayState("WARNING", 2)};
    }

    public static FieldDisplayState valueOf(String str) {
        return (FieldDisplayState) Enum.valueOf(FieldDisplayState.class, str);
    }

    public static FieldDisplayState[] values() {
        return (FieldDisplayState[]) $VALUES.clone();
    }
}
