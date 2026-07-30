package com.realsil.sdk.dfu.image.pack;

import android.content.Context;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.core.utility.ByteArrayConverter;
import com.realsil.sdk.core.utility.DataConverter;
import com.realsil.sdk.dfu.image.BinIndicator;
import com.realsil.sdk.dfu.image.LoadParams;
import com.realsil.sdk.dfu.image.f;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import com.realsil.sdk.dfu.image.wrapper.BinImageWrapper;
import java.nio.BufferUnderflowException;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class SubFileInfo {
    public static final int HEADER_SIZE = 12;
    public static final int HEADER_SIZE_V5 = 20;

    /* renamed from: a, reason: collision with root package name */
    public int f15859a;

    /* renamed from: b, reason: collision with root package name */
    public int f15860b;
    public int binId;
    public int bitNumber;

    /* renamed from: c, reason: collision with root package name */
    public long f15861c;
    public boolean compressed;
    public int customizeId;

    /* renamed from: d, reason: collision with root package name */
    public long f15862d;
    public int fileLocation;
    public String filePath;
    public int icType;
    public String imageFeature;
    public int imageId;
    public long imageVersion;
    public boolean isMergeBankBin;
    public byte[] sha256;
    public long size;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Context f15863a;

        /* renamed from: b, reason: collision with root package name */
        public int f15864b;

        /* renamed from: c, reason: collision with root package name */
        public int f15865c;

        /* renamed from: d, reason: collision with root package name */
        public String f15866d;

        /* renamed from: e, reason: collision with root package name */
        public int f15867e;

        /* renamed from: f, reason: collision with root package name */
        public int f15868f;

        /* renamed from: g, reason: collision with root package name */
        public long f15869g;

        /* renamed from: h, reason: collision with root package name */
        public c f15870h;

        public b(int i8, int i9, int i10, long j8, c cVar) {
            this.f15864b = i8;
            this.f15867e = i9;
            this.f15868f = i10;
            this.f15869g = j8;
            this.f15870h = cVar;
        }

        public b a(d dVar) {
            this.f15865c = dVar.f15874a;
            this.f15866d = dVar.f15875b;
            this.f15863a = dVar.f15876c;
            return this;
        }

        public SubFileInfo a() {
            SubFileInfo subFileInfo;
            BaseBinInputStream binInputStream;
            int i8 = this.f15864b;
            int i9 = this.f15865c;
            String str = this.f15866d;
            int i10 = this.f15867e;
            int i11 = this.f15868f;
            long j8 = this.f15869g;
            long j9 = this.f15870h.f15871a;
            c cVar = this.f15870h;
            SubFileInfo subFileInfo2 = new SubFileInfo(i8, i9, str, i10, i10, i11, j8, j9, cVar.f15872b, cVar.f15873c);
            if (this.f15865c == 1) {
                subFileInfo = subFileInfo2;
                binInputStream = subFileInfo.getAssetsBinInputStream(this.f15863a, this.f15864b, 0);
            } else {
                subFileInfo = subFileInfo2;
                binInputStream = subFileInfo.getBinInputStream(this.f15864b, 0);
            }
            if (binInputStream != null) {
                subFileInfo.a(binInputStream);
            }
            ZLogger.v(subFileInfo.toString());
            return subFileInfo;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public long f15871a;

        /* renamed from: b, reason: collision with root package name */
        public long f15872b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f15873c;

        public c(byte[] bArr, boolean z7) {
            this.f15873c = false;
            ZLogger.v(String.format("SubFileHeader: useLongAddrSize=%b,value=%s", Boolean.valueOf(z7), DataConverter.bytes2Hex(bArr)));
            char c8 = '\b';
            if (z7) {
                this.f15871a = ByteArrayConverter.toInt64(bArr, 0, 0);
                this.f15872b = ByteArrayConverter.toInt64(bArr, 8, 0);
                c8 = 16;
            } else {
                this.f15871a = ByteArrayConverter.toInt(bArr, 0, 0);
                this.f15872b = ByteArrayConverter.toInt32(bArr, 4, 0);
            }
            ZLogger.v(String.format("downloadAddr=0x%x(%d), size=0x%x(%d)", Long.valueOf(this.f15871a), Long.valueOf(this.f15871a), Long.valueOf(this.f15872b), Long.valueOf(this.f15872b)));
            this.f15873c = (bArr[c8] & 1) == 1;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public int f15874a;

        /* renamed from: b, reason: collision with root package name */
        public String f15875b;

        /* renamed from: c, reason: collision with root package name */
        public Context f15876c;

        public d(int i8, String str, Context context) {
            this.f15874a = i8;
            this.f15875b = str;
            this.f15876c = context;
        }
    }

    public SubFileInfo(int i8, int i9, String str, int i10, int i11, int i12, long j8, long j9, long j10, boolean z7) {
        this.imageVersion = -1L;
        this.binId = -1;
        this.imageFeature = "";
        this.customizeId = -1;
        this.isMergeBankBin = false;
        this.icType = i8;
        this.fileLocation = i9;
        this.filePath = str;
        this.bitNumber = i10;
        this.f15859a = i11;
        this.f15860b = i12;
        this.f15861c = j8;
        this.f15862d = j9;
        this.size = j10;
        this.compressed = z7;
    }

    public BaseBinInputStream getAssetsBinInputStream(Context context, int i8, int i9) {
        try {
            BaseBinInputStream openAssetsInputStream = com.realsil.sdk.dfu.k.a.openAssetsInputStream(context, i8, this.filePath, this.f15861c, this.size, i9, this.compressed);
            if (openAssetsInputStream == null) {
                return openAssetsInputStream;
            }
            openAssetsInputStream.setSha256(this.sha256);
            openAssetsInputStream.setCustomizeId(this.customizeId);
            openAssetsInputStream.normalUpgradeOrder = this.f15859a;
            return openAssetsInputStream;
        } catch (Exception e8) {
            ZLogger.w(e8.toString());
            return null;
        }
    }

    public int getBankNumber() {
        return this.bitNumber / this.f15860b;
    }

    public BinImageWrapper getBinImageWrapper(Context context) {
        BinImageWrapper.Builder builder = new BinImageWrapper.Builder();
        builder.icType(this.icType);
        builder.imageFeature(this.imageFeature);
        builder.bitNumber(wrapperBitNumber());
        builder.binId(this.binId);
        builder.imageVersion(this.imageVersion, 2);
        BaseBinInputStream binInputStreamCompat = getBinInputStreamCompat(context);
        if (binInputStreamCompat != null) {
            builder.setOtaVersion(binInputStreamCompat.otaVersion);
        }
        return builder.build();
    }

    public BinIndicator getBinIndicator() {
        int wrapperBitNumber = wrapperBitNumber();
        int i8 = this.icType;
        if (i8 <= 3) {
            return BinIndicator.getBinIndicatorByBitNumber(i8, wrapperBitNumber);
        }
        int i9 = this.binId;
        return i9 != -1 ? BinIndicator.getBinIndicatorByBinId(i8, i9, wrapperBitNumber) : BinIndicator.getIndByImageId(i8, this.imageId);
    }

    public BaseBinInputStream getBinInputStream(int i8, int i9) {
        try {
            BaseBinInputStream openFileInputStream = com.realsil.sdk.dfu.k.a.openFileInputStream(i8, this.filePath, this.f15861c, this.size, i9, this.compressed);
            if (openFileInputStream == null) {
                return openFileInputStream;
            }
            openFileInputStream.setSha256(this.sha256);
            openFileInputStream.setCustomizeId(this.customizeId);
            openFileInputStream.normalUpgradeOrder = this.f15859a;
            return openFileInputStream;
        } catch (Exception e8) {
            ZLogger.w(e8.toString());
            return null;
        }
    }

    public BaseBinInputStream getBinInputStreamCompat(Context context) {
        return this.fileLocation == 1 ? getAssetsBinInputStream(context, this.icType, 0) : getBinInputStream(this.icType, 0);
    }

    public int getSortNumber() {
        return this.f15859a;
    }

    public boolean isNeedCopyToBank(LoadParams loadParams) {
        int i8 = this.icType;
        if (i8 == 11) {
            return com.realsil.sdk.dfu.image.a.f(this.bitNumber);
        }
        if (i8 == 10) {
            return com.realsil.sdk.dfu.image.c.e(this.bitNumber);
        }
        if (i8 == 15) {
            return f.d(this.bitNumber);
        }
        if (i8 == 5 || i8 == 9 || i8 == 12) {
            int i9 = this.bitNumber;
            if (i9 == 14 || i9 == 15) {
                return true;
            }
        } else if (i8 == 17) {
            if (com.realsil.sdk.dfu.image.b.g(this.bitNumber)) {
                return true;
            }
            int j8 = loadParams != null ? loadParams.j() : 0;
            if ((j8 == 20 || j8 == 22) && this.bitNumber != 14) {
                return true;
            }
        } else if (i8 == 19) {
            int j9 = loadParams != null ? loadParams.j() : 0;
            if ((j9 == 20 || j9 == 22) && this.bitNumber != 14) {
                return true;
            }
        }
        return false;
    }

    public void setSortNumber(int i8) {
        this.f15859a = i8;
    }

    public String toString() {
        return String.format(Locale.US, "SubFileInfo: icType=0x%02X, bitNumber=%d/%d, bank=%d, sort=%d, binId=0x%04X, imageId=0x%04X, startAddr=%d, downloadAddr=(0x%016X)%d, size=(0x%016X)%d, compressed=%b", Integer.valueOf(this.icType), Integer.valueOf(this.bitNumber), Integer.valueOf(this.f15860b), Integer.valueOf(getBankNumber()), Integer.valueOf(this.f15859a), Integer.valueOf(this.binId), Integer.valueOf(this.imageId), Long.valueOf(this.f15861c), Long.valueOf(this.f15862d), Long.valueOf(this.f15862d), Long.valueOf(this.size), Long.valueOf(this.size), Boolean.valueOf(this.compressed));
    }

    public int wrapperBitNumber() {
        int i8 = this.f15860b;
        return i8 == 0 ? this.bitNumber : this.bitNumber % i8;
    }

    public final void a(BaseBinInputStream baseBinInputStream) {
        try {
            baseBinInputStream.parseImageHeaderEx();
            this.imageVersion = baseBinInputStream.getImageVersion();
            this.binId = baseBinInputStream.getBinId();
            this.imageId = baseBinInputStream.getImageId();
            this.sha256 = baseBinInputStream.getSha256();
            this.customizeId = baseBinInputStream.getCustomizeId();
            this.imageFeature = baseBinInputStream.getImageFeature();
            this.isMergeBankBin = baseBinInputStream.isMergeBandFile();
            try {
                baseBinInputStream.close();
            } catch (Exception unused) {
            }
        } catch (BufferUnderflowException e8) {
            ZLogger.w(e8.toString());
        }
    }

    public BaseBinInputStream getBinInputStreamCompat(LoadParams loadParams) {
        if (loadParams.b() != 1) {
            int i8 = this.icType;
            return getBinInputStream(i8, LoadParams.a(i8, loadParams.a(this.compressed)));
        }
        Context a8 = loadParams.a();
        int i9 = this.icType;
        return getAssetsBinInputStream(a8, i9, LoadParams.a(i9, loadParams.a(this.compressed)));
    }
}
