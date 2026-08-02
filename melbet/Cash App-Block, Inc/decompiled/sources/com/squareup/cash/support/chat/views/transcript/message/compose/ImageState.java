package com.squareup.cash.support.chat.views.transcript.message.compose;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ImageState {
    public static final /* synthetic */ ImageState[] $VALUES;
    public static final ImageState ERROR;
    public static final ImageState LOADING;
    public static final ImageState SUCCESS;

    static {
        ImageState imageState = new ImageState("LOADING", 0);
        LOADING = imageState;
        ImageState imageState2 = new ImageState("ERROR", 1);
        ERROR = imageState2;
        ImageState imageState3 = new ImageState("SUCCESS", 2);
        SUCCESS = imageState3;
        $VALUES = new ImageState[]{imageState, imageState2, imageState3};
    }

    public static ImageState valueOf(String str) {
        return (ImageState) Enum.valueOf(ImageState.class, str);
    }

    public static ImageState[] values() {
        return (ImageState[]) $VALUES.clone();
    }
}
