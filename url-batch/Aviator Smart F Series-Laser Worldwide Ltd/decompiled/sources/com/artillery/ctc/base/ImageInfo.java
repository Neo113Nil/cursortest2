package com.artillery.ctc.base;

import androidx.annotation.Keep;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class ImageInfo {
    private final String src;

    public ImageInfo(String src) {
        s.checkNotNullParameter(src, "src");
        this.src = src;
    }

    public static /* synthetic */ ImageInfo copy$default(ImageInfo imageInfo, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = imageInfo.src;
        }
        return imageInfo.copy(str);
    }

    public final String component1() {
        return this.src;
    }

    public final ImageInfo copy(String src) {
        s.checkNotNullParameter(src, "src");
        return new ImageInfo(src);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImageInfo) && s.areEqual(this.src, ((ImageInfo) obj).src);
    }

    public final String getSrc() {
        return this.src;
    }

    public int hashCode() {
        return this.src.hashCode();
    }

    public String toString() {
        return "ImageInfo(src=" + this.src + ')';
    }
}
