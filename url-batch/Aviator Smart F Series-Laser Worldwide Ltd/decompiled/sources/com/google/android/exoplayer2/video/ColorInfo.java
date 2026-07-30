package com.google.android.exoplayer2.video;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Util;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;

@Deprecated
/* loaded from: classes3.dex */
public final class ColorInfo implements Bundleable {
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    private int hashCode;

    @Nullable
    public final byte[] hdrStaticInfo;
    public static final ColorInfo SDR_BT709_LIMITED = new ColorInfo(1, 2, 3, null);
    public static final ColorInfo SRGB_BT709_FULL = new Builder().setColorSpace(1).setColorRange(1).setColorTransfer(2).build();
    private static final String FIELD_COLOR_SPACE = Util.intToStringMaxRadix(0);
    private static final String FIELD_COLOR_RANGE = Util.intToStringMaxRadix(1);
    private static final String FIELD_COLOR_TRANSFER = Util.intToStringMaxRadix(2);
    private static final String FIELD_HDR_STATIC_INFO = Util.intToStringMaxRadix(3);
    public static final Bundleable.Creator<ColorInfo> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.video.a
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            ColorInfo lambda$static$0;
            lambda$static$0 = ColorInfo.lambda$static$0(bundle);
            return lambda$static$0;
        }
    };

    public static final class Builder {
        private int colorRange;
        private int colorSpace;
        private int colorTransfer;

        @Nullable
        private byte[] hdrStaticInfo;

        public ColorInfo build() {
            return new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, this.hdrStaticInfo);
        }

        @CanIgnoreReturnValue
        public Builder setColorRange(int i8) {
            this.colorRange = i8;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setColorSpace(int i8) {
            this.colorSpace = i8;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setColorTransfer(int i8) {
            this.colorTransfer = i8;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHdrStaticInfo(@Nullable byte[] bArr) {
            this.hdrStaticInfo = bArr;
            return this;
        }

        public Builder() {
            this.colorSpace = -1;
            this.colorRange = -1;
            this.colorTransfer = -1;
        }

        private Builder(ColorInfo colorInfo) {
            this.colorSpace = colorInfo.colorSpace;
            this.colorRange = colorInfo.colorRange;
            this.colorTransfer = colorInfo.colorTransfer;
            this.hdrStaticInfo = colorInfo.hdrStaticInfo;
        }
    }

    @Deprecated
    public ColorInfo(int i8, int i9, int i10, @Nullable byte[] bArr) {
        this.colorSpace = i8;
        this.colorRange = i9;
        this.colorTransfer = i10;
        this.hdrStaticInfo = bArr;
    }

    private static String colorRangeToString(int i8) {
        return i8 != -1 ? i8 != 1 ? i8 != 2 ? "Undefined color range" : "Limited range" : "Full range" : "Unset color range";
    }

    private static String colorSpaceToString(int i8) {
        return i8 != -1 ? i8 != 6 ? i8 != 1 ? i8 != 2 ? "Undefined color space" : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    private static String colorTransferToString(int i8) {
        return i8 != -1 ? i8 != 10 ? i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 6 ? i8 != 7 ? "Undefined color transfer" : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static boolean isTransferHdr(@Nullable ColorInfo colorInfo) {
        int i8;
        return colorInfo != null && ((i8 = colorInfo.colorTransfer) == 7 || i8 == 6);
    }

    @Pure
    public static int isoColorPrimariesToColorSpace(int i8) {
        if (i8 == 1) {
            return 1;
        }
        if (i8 != 9) {
            return (i8 == 4 || i8 == 5 || i8 == 6 || i8 == 7) ? 2 : -1;
        }
        return 6;
    }

    @Pure
    public static int isoTransferCharacteristicsToColorTransfer(int i8) {
        if (i8 == 1) {
            return 3;
        }
        if (i8 == 4) {
            return 10;
        }
        if (i8 == 13) {
            return 2;
        }
        if (i8 == 16) {
            return 6;
        }
        if (i8 != 18) {
            return (i8 == 6 || i8 == 7) ? 3 : -1;
        }
        return 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ColorInfo lambda$static$0(Bundle bundle) {
        return new ColorInfo(bundle.getInt(FIELD_COLOR_SPACE, -1), bundle.getInt(FIELD_COLOR_RANGE, -1), bundle.getInt(FIELD_COLOR_TRANSFER, -1), bundle.getByteArray(FIELD_HDR_STATIC_INFO));
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ColorInfo.class != obj.getClass()) {
            return false;
        }
        ColorInfo colorInfo = (ColorInfo) obj;
        return this.colorSpace == colorInfo.colorSpace && this.colorRange == colorInfo.colorRange && this.colorTransfer == colorInfo.colorTransfer && Arrays.equals(this.hdrStaticInfo, colorInfo.hdrStaticInfo);
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = ((((((527 + this.colorSpace) * 31) + this.colorRange) * 31) + this.colorTransfer) * 31) + Arrays.hashCode(this.hdrStaticInfo);
        }
        return this.hashCode;
    }

    public boolean isValid() {
        return (this.colorSpace == -1 || this.colorRange == -1 || this.colorTransfer == -1) ? false : true;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(FIELD_COLOR_SPACE, this.colorSpace);
        bundle.putInt(FIELD_COLOR_RANGE, this.colorRange);
        bundle.putInt(FIELD_COLOR_TRANSFER, this.colorTransfer);
        bundle.putByteArray(FIELD_HDR_STATIC_INFO, this.hdrStaticInfo);
        return bundle;
    }

    public String toLogString() {
        return !isValid() ? "NA" : Util.formatInvariant("%s/%s/%s", colorSpaceToString(this.colorSpace), colorRangeToString(this.colorRange), colorTransferToString(this.colorTransfer));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(colorSpaceToString(this.colorSpace));
        sb.append(", ");
        sb.append(colorRangeToString(this.colorRange));
        sb.append(", ");
        sb.append(colorTransferToString(this.colorTransfer));
        sb.append(", ");
        sb.append(this.hdrStaticInfo != null);
        sb.append(")");
        return sb.toString();
    }
}
