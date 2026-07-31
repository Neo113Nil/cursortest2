package com.linecorp.linesdk.message.template;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public enum ImageAspectRatio {
    RECTANGLE("rectangle"),
    SQUARE("square");


    @NonNull
    private String serverKey;

    ImageAspectRatio(@NonNull String str) {
        this.serverKey = str;
    }

    @NonNull
    public String getServerKey() {
        return this.serverKey;
    }
}
