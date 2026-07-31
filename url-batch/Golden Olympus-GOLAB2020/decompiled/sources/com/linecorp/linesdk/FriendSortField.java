package com.linecorp.linesdk;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public enum FriendSortField {
    NAME("name"),
    RELATION("relation");


    @NonNull
    private final String serverKey;

    FriendSortField(@NonNull String str) {
        this.serverKey = str;
    }

    @NonNull
    public String getServerKey() {
        return this.serverKey;
    }
}
