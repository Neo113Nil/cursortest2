package com.squareup.cash.work.service.api;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ThemedColor {
    public final String darkHex;
    public final String lightHex;

    public ThemedColor(String str, String str2) {
        this.lightHex = str;
        this.darkHex = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThemedColor)) {
            return false;
        }
        ThemedColor themedColor = (ThemedColor) obj;
        return Intrinsics.areEqual(this.lightHex, themedColor.lightHex) && Intrinsics.areEqual(this.darkHex, themedColor.darkHex);
    }

    public final int hashCode() {
        String str = this.lightHex;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.darkHex;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("ThemedColor(lightHex=", this.lightHex, ", darkHex=", this.darkHex, ")");
    }
}
