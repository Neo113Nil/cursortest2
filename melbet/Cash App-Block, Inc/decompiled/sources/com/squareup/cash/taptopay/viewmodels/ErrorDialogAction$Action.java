package com.squareup.cash.taptopay.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ErrorDialogAction$Action {
    public static final /* synthetic */ ErrorDialogAction$Action[] $VALUES;
    public static final ErrorDialogAction$Action CLOSE;
    public static final ErrorDialogAction$Action OPEN_SETTINGS;
    public static final ErrorDialogAction$Action SUPPORT;
    public static final ErrorDialogAction$Action TRY_AGAIN;

    static {
        ErrorDialogAction$Action errorDialogAction$Action = new ErrorDialogAction$Action("SUPPORT", 0);
        SUPPORT = errorDialogAction$Action;
        ErrorDialogAction$Action errorDialogAction$Action2 = new ErrorDialogAction$Action("TRY_AGAIN", 1);
        TRY_AGAIN = errorDialogAction$Action2;
        ErrorDialogAction$Action errorDialogAction$Action3 = new ErrorDialogAction$Action("CLOSE", 2);
        CLOSE = errorDialogAction$Action3;
        ErrorDialogAction$Action errorDialogAction$Action4 = new ErrorDialogAction$Action("OPEN_SETTINGS", 3);
        OPEN_SETTINGS = errorDialogAction$Action4;
        $VALUES = new ErrorDialogAction$Action[]{errorDialogAction$Action, errorDialogAction$Action2, errorDialogAction$Action3, errorDialogAction$Action4};
    }

    public static ErrorDialogAction$Action valueOf(String str) {
        return (ErrorDialogAction$Action) Enum.valueOf(ErrorDialogAction$Action.class, str);
    }

    public static ErrorDialogAction$Action[] values() {
        return (ErrorDialogAction$Action[]) $VALUES.clone();
    }
}
