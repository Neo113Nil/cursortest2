package com.realsil.sdk.dfu.image;

import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.model.BinParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class BinIndicator {
    public static final int INDICATOR_FULL = -1;
    public static final int INDICATOR_MASK = 1;
    public static boolean VDBG = false;
    public boolean bankSupported;
    public int bitNumber;
    public String description;
    public String flashLayoutName;
    public int imageId;
    public boolean isConfigEnabled;
    public boolean otaSupported;
    public int subBinId;
    public boolean versionCheckSupported;
    public int versionFormat;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public int f15784a;

        /* renamed from: b, reason: collision with root package name */
        public String f15785b;
        public boolean bankSupported;

        /* renamed from: c, reason: collision with root package name */
        public String f15786c;

        /* renamed from: d, reason: collision with root package name */
        public int f15787d;

        /* renamed from: e, reason: collision with root package name */
        public int f15788e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f15789f;

        /* renamed from: g, reason: collision with root package name */
        public int f15790g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f15791h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f15792i;

        public Builder() {
            this.f15787d = -1;
            this.f15789f = true;
            this.f15790g = 1;
            this.f15792i = true;
            this.bankSupported = true;
        }

        public Builder bankSupported(boolean z7) {
            this.bankSupported = z7;
            return this;
        }

        public BinIndicator build() {
            return new BinIndicator(this.f15784a, this.f15785b, this.f15786c, this.f15787d, this.f15788e, this.f15789f, this.f15790g, this.f15791h, this.f15792i, this.bankSupported);
        }

        public Builder commonImage(boolean z7) {
            return this;
        }

        public Builder otaSupported(boolean z7) {
            this.f15792i = z7;
            return this;
        }

        public Builder version(boolean z7, int i8) {
            this.f15789f = z7;
            this.f15790g = i8;
            return this;
        }

        public Builder(int i8, String str, String str2, int i9, int i10, boolean z7) {
            this.f15789f = true;
            this.f15790g = 1;
            this.bankSupported = true;
            this.f15784a = i8;
            this.f15785b = str;
            this.f15786c = str2;
            this.f15787d = i9;
            this.f15788e = i10;
            this.f15791h = z7;
            this.f15792i = true;
        }
    }

    public BinIndicator(int i8, String str, String str2, int i9, int i10, boolean z7) {
        this.imageId = -1;
        this.bankSupported = true;
        this.bitNumber = i8;
        this.flashLayoutName = str;
        this.description = str2;
        this.subBinId = i9;
        this.versionFormat = i10;
        this.isConfigEnabled = z7;
        this.otaSupported = false;
        this.versionCheckSupported = false;
    }

    public static BinIndicator getBinIndicatorByBinId(int i8, int i9, int i10) {
        return i8 == 14 ? e.a(i9) : i8 == 15 ? f.a(i9) : i8 == 16 ? com.realsil.sdk.dfu.c.c.a(i9) : (i8 == 5 || i8 == 9 || i8 == 12) ? com.realsil.sdk.dfu.c.b.a(i9) : (i8 == 4 || i8 == 6 || i8 == 7 || i8 == 8 || i8 == 13 || i8 == 10) ? d.d(i9) : i8 == 11 ? a.d(i9) : (i8 == 17 || i8 == 19) ? b.d(i9) : i8 == 3 ? com.realsil.sdk.dfu.c.a.a(i10) : d.d(i9);
    }

    public static BinIndicator getBinIndicatorByBitNumber(int i8, int i9) {
        if (i8 <= 3) {
            return com.realsil.sdk.dfu.c.a.a(i9);
        }
        if (i8 == 5 || i8 == 9 || i8 == 12) {
            return com.realsil.sdk.dfu.c.b.b(i9);
        }
        if (i8 == 16) {
            return com.realsil.sdk.dfu.c.c.b(i9);
        }
        if (i8 == 10) {
            return e.b(i9);
        }
        if (i8 == 15) {
            return f.b(i9);
        }
        if (i8 == 4 || i8 == 6 || i8 == 7 || i8 == 13 || i8 == 8 || i8 == 11 || i8 == 14) {
            return d.e(i9);
        }
        if (i8 == 17 || i8 == 19) {
            return b.e(i9);
        }
        return null;
    }

    public static BinIndicator getBinIndicatorByImageId(int i8, int i9, int i10) {
        return i8 == 14 ? e.c(i9) : i8 == 15 ? f.c(i9) : i8 == 16 ? com.realsil.sdk.dfu.c.c.c(i9) : (i8 == 5 || i8 == 9 || i8 == 12) ? com.realsil.sdk.dfu.c.b.c(i9) : (i8 == 4 || i8 == 6 || i8 == 7 || i8 == 8 || i8 == 13 || i8 == 10) ? d.f(i9) : i8 == 11 ? a.e(i9) : (i8 == 17 || i8 == 19) ? b.f(i9) : i8 == 3 ? com.realsil.sdk.dfu.c.a.a(i10) : d.f(i9);
    }

    public static BinIndicator getByBitNumber(ArrayList<BinIndicator> arrayList, int i8) {
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            BinIndicator binIndicator = arrayList.get(i9);
            i9++;
            BinIndicator binIndicator2 = binIndicator;
            if (binIndicator2.bitNumber == i8) {
                return binIndicator2;
            }
        }
        ZLogger.v("undefined indicator, bitNumber=" + i8);
        return null;
    }

    public static BinIndicator getIndByBinId(int i8, int i9) {
        if (i8 == 14) {
            return e.a(i9);
        }
        if (i8 == 15) {
            return f.a(i9);
        }
        if (i8 == 16) {
            return com.realsil.sdk.dfu.c.c.a(i9);
        }
        if (i8 == 5 || i8 == 9 || i8 == 12) {
            return com.realsil.sdk.dfu.c.b.a(i9);
        }
        if (i8 == 4 || i8 == 6 || i8 == 7 || i8 == 8 || i8 == 13 || i8 == 10) {
            return d.d(i9);
        }
        if (i8 == 11) {
            return a.d(i9);
        }
        if (i8 == 17 || i8 == 19) {
            return b.d(i9);
        }
        return null;
    }

    public static BinIndicator getIndByImageId(int i8, int i9) {
        if (i8 == 14) {
            return e.c(i9);
        }
        if (i8 == 15) {
            return f.c(i9);
        }
        if (i8 == 16) {
            return com.realsil.sdk.dfu.c.c.c(i9);
        }
        if (i8 == 5 || i8 == 9 || i8 == 12) {
            return com.realsil.sdk.dfu.c.b.c(i9);
        }
        if (i8 == 4 || i8 == 6 || i8 == 7 || i8 == 8 || i8 == 13 || i8 == 10) {
            return d.f(i9);
        }
        if (i8 == 11) {
            return a.e(i9);
        }
        if (i8 == 17 || i8 == 19) {
            return b.f(i9);
        }
        if (i8 == 3) {
            return com.realsil.sdk.dfu.c.a.b(i9);
        }
        return null;
    }

    public static boolean isIndicatorEnabled(byte[] bArr, int i8) {
        if (bArr == null || bArr.length <= 0) {
            return false;
        }
        if (Arrays.equals(BinParameters.FILTER_INDICATOR_ALL, bArr)) {
            return true;
        }
        int i9 = 0;
        for (byte b8 : bArr) {
            for (int i10 = 0; i10 < 8; i10++) {
                if (i9 == i8) {
                    return ((b8 >> i10) & 1) != 0;
                }
                i9++;
            }
        }
        return true;
    }

    public static boolean move(int[] iArr, int i8, int i9) {
        if (iArr == null || iArr.length == 0 || i8 < 0 || i8 >= iArr.length || i9 < 0 || i9 >= iArr.length) {
            return false;
        }
        int i10 = iArr[i9];
        if (i8 > i9) {
            while (i9 < i8) {
                int i11 = i9 + 1;
                iArr[i9] = iArr[i11];
                i9 = i11;
            }
        } else {
            while (i9 > i8) {
                iArr[i9] = iArr[i9 - 1];
                i9--;
            }
        }
        iArr[i8] = i10;
        return true;
    }

    public static boolean updateFilterIndicator(byte[] bArr, int i8, boolean z7) {
        if (bArr == null || bArr.length <= 0) {
            return false;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < bArr.length; i10++) {
            for (int i11 = 0; i11 < 8; i11++) {
                if (i9 == i8) {
                    byte b8 = bArr[i10];
                    int i12 = 1 << i11;
                    bArr[i10] = (byte) (z7 ? b8 | i12 : b8 & (~i12));
                }
                i9++;
            }
        }
        return true;
    }

    public static boolean updateSortReference(int[] iArr, int i8, int i9) {
        if (iArr == null || iArr.length == 0 || iArr.length < i8 + 1) {
            return false;
        }
        iArr[i8] = i9;
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Locale locale = Locale.US;
        sb.append(String.format(locale, "bitNumber=%d, flashLayoutName=%s, ota=%b, bank=%b", Integer.valueOf(this.bitNumber), this.flashLayoutName, Boolean.valueOf(this.otaSupported), Boolean.valueOf(this.bankSupported)));
        sb.append(this.otaSupported ? String.format(locale, ", imageId=0x%04X", Integer.valueOf(this.imageId)) : String.format(locale, ", imageId=0x%04X, subBinId=0x%04X", Integer.valueOf(this.imageId), Integer.valueOf(this.subBinId)));
        sb.append(String.format(locale, ", versionCheckSupported=%b, format=0x%04X, configEnabled=%b", Boolean.valueOf(this.versionCheckSupported), Integer.valueOf(this.versionFormat), Boolean.valueOf(this.isConfigEnabled)));
        return sb.toString();
    }

    public BinIndicator(int i8, String str, String str2, int i9, int i10, boolean z7, int i11, boolean z8) {
        this.bankSupported = true;
        this.bitNumber = i8;
        this.flashLayoutName = str;
        this.description = str2;
        this.imageId = i9;
        this.subBinId = i10;
        this.versionCheckSupported = z7;
        this.versionFormat = i11;
        this.isConfigEnabled = z8;
        this.otaSupported = true;
    }

    public BinIndicator(int i8, String str, String str2, int i9, int i10, boolean z7, int i11, boolean z8, boolean z9, boolean z10) {
        this.bitNumber = i8;
        this.flashLayoutName = str;
        this.description = str2;
        this.imageId = i9;
        this.subBinId = i10;
        this.versionCheckSupported = z7;
        this.versionFormat = i11;
        this.isConfigEnabled = z8;
        this.otaSupported = z9;
        this.bankSupported = z10;
    }

    public BinIndicator(int i8, String str, String str2, int i9, boolean z7, int i10) {
        this(i8, str, str2, 0, i9, z7, i10, false);
    }
}
