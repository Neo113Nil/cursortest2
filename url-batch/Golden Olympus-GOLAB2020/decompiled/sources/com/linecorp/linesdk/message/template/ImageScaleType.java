package com.linecorp.linesdk.message.template;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
enum ImageScaleType {
    COVER("cover"),
    CONTAIN("contain");


    @NonNull
    private String serverKey;

    ImageScaleType(@NonNull String str) {
        this.serverKey = str;
    }

    @NonNull
    public String getServerKey() {
        return this.serverKey;
    }
}
