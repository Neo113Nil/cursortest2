package io.noties.markwon.image;

import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public class f {
    public final a height;
    public final a width;

    public static class a {
        public final String unit;
        public final float value;

        public a(float f8, @Nullable String str) {
            this.value = f8;
            this.unit = str;
        }

        public String toString() {
            return "Dimension{value=" + this.value + ", unit='" + this.unit + "'}";
        }
    }

    public f(@Nullable a aVar, @Nullable a aVar2) {
        this.width = aVar;
        this.height = aVar2;
    }

    public String toString() {
        return "ImageSize{width=" + this.width + ", height=" + this.height + '}';
    }
}
