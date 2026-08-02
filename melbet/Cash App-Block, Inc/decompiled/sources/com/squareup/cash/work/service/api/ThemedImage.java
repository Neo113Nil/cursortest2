package com.squareup.cash.work.service.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ThemedImage {
    public final String darkUrl;
    public final Integer height;
    public final String lightUrl;
    public final Integer width;

    public ThemedImage(String str, String str2, Integer num, Integer num2) {
        this.lightUrl = str;
        this.darkUrl = str2;
        this.width = num;
        this.height = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThemedImage)) {
            return false;
        }
        ThemedImage themedImage = (ThemedImage) obj;
        return Intrinsics.areEqual(this.lightUrl, themedImage.lightUrl) && Intrinsics.areEqual(this.darkUrl, themedImage.darkUrl) && Intrinsics.areEqual(this.width, themedImage.width) && Intrinsics.areEqual(this.height, themedImage.height);
    }

    public final int hashCode() {
        String str = this.lightUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.darkUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.width;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ThemedImage(lightUrl=", this.lightUrl, ", darkUrl=", this.darkUrl, ", width=");
        m.append(this.width);
        m.append(", height=");
        m.append(this.height);
        m.append(")");
        return m.toString();
    }
}
