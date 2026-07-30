package com.facebook.gamingservices.model;

import defpackage.in1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class CustomUpdateMediaInfo {
    private final String url;

    public CustomUpdateMediaInfo(String str) {
        str.getClass();
        this.url = str;
    }

    public static /* synthetic */ CustomUpdateMediaInfo copy$default(CustomUpdateMediaInfo customUpdateMediaInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customUpdateMediaInfo.url;
        }
        return customUpdateMediaInfo.copy(str);
    }

    public final String component1() {
        return this.url;
    }

    public final CustomUpdateMediaInfo copy(String str) {
        str.getClass();
        return new CustomUpdateMediaInfo(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CustomUpdateMediaInfo) && Intrinsics.b(this.url, ((CustomUpdateMediaInfo) obj).url);
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public String toString() {
        return in1.m(new StringBuilder("CustomUpdateMediaInfo(url="), this.url, ')');
    }
}
