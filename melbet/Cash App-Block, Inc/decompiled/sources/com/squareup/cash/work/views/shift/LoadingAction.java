package com.squareup.cash.work.views.shift;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class LoadingAction {
    public static final /* synthetic */ LoadingAction[] $VALUES;
    public static final LoadingAction DELETE;
    public static final LoadingAction SAVE;

    static {
        LoadingAction loadingAction = new LoadingAction("SAVE", 0);
        SAVE = loadingAction;
        LoadingAction loadingAction2 = new LoadingAction("DELETE", 1);
        DELETE = loadingAction2;
        $VALUES = new LoadingAction[]{loadingAction, loadingAction2};
    }

    public static LoadingAction valueOf(String str) {
        return (LoadingAction) Enum.valueOf(LoadingAction.class, str);
    }

    public static LoadingAction[] values() {
        return (LoadingAction[]) $VALUES.clone();
    }
}
