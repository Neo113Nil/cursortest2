package com.realsil.sdk.dfu.image.stream;

import com.realsil.sdk.core.bluetooth.connection.le.GattError;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.core.utility.ByteArrayConverter;
import com.realsil.sdk.core.utility.DataConverter;
import com.realsil.sdk.core.utility.StringUtils;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.RtkDfu;
import com.realsil.sdk.dfu.exception.LoadFileException;
import com.realsil.sdk.dfu.g.a;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import y5.u;

/* loaded from: classes4.dex */
public abstract class BaseBinInputStream extends BufferedInputStream {
    public static final int AUTH_HEADER_BUF_SIZE = 304;
    public static final int COMPARE_VERSION_EQUAL = 0;
    public static final int COMPARE_VERSION_HIGH = 1;
    public static final int COMPARE_VERSION_LOW = -1;
    public static final int CTRL_HEADER_BUF_SIZE_16 = 16;
    public static final int DFU_HEADER_BUF_SIZE = 12;
    public static final int HEADER_SIZE = 12;
    public static final int IMAGE_MEM_TYPE_NAND_FLASH = 1;
    public static final int IMAGE_MEM_TYPE_NOR_FLASH = 0;
    public static final int IMAGE_SIZE_MECHANISM_IMAGE_HEADER = 0;
    public static final int IMAGE_SIZE_MECHANISM_MP_HEADER_DATA_LENGTH = 1;
    public static final int IMAGE_SIZE_MECHANISM_MP_HEADER_IMAGE_SIZE = 2;
    public static final int IMAGE_SIZE_MECHANISM_PACK_HEADER = 3;
    public static final int IMAGE_TYPE_COMPRESSED = 27;
    public static final int IMAGE_TYPE_NORMAL = 11;
    public static int MPHEADER_PARSE_FORMAT = 1;
    public static int MPHEADER_PARSE_HEADER = 0;
    public static int MPHEADER_PARSE_MARK = 1;
    public static final int PACKET_SIZE_DEF = 20;
    public static final int SHA256_LENGTH = 32;
    public byte[] A;
    public String B;
    public int C;
    public int D;
    public int E;

    /* renamed from: a, reason: collision with root package name */
    public boolean f15896a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15897b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15898c;
    public int compressMode;
    public boolean compressed;
    public int customizeId;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f15899d;

    /* renamed from: e, reason: collision with root package name */
    public List f15900e;

    /* renamed from: f, reason: collision with root package name */
    public int f15901f;

    /* renamed from: g, reason: collision with root package name */
    public int f15902g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f15903h;

    /* renamed from: i, reason: collision with root package name */
    public int f15904i;
    public byte icType;
    public long imageVersion;
    public boolean isMergeBandFile;

    /* renamed from: j, reason: collision with root package name */
    public int f15905j;

    /* renamed from: k, reason: collision with root package name */
    public int f15906k;

    /* renamed from: l, reason: collision with root package name */
    public int f15907l;

    /* renamed from: m, reason: collision with root package name */
    public int f15908m;
    public Map<Integer, Boolean> mpFieldsMap;

    /* renamed from: n, reason: collision with root package name */
    public String f15909n;
    public int normalUpgradeOrder;

    /* renamed from: o, reason: collision with root package name */
    public int f15910o;
    public int otaVersion;

    /* renamed from: p, reason: collision with root package name */
    public int f15911p;

    /* renamed from: q, reason: collision with root package name */
    public int f15912q;

    /* renamed from: r, reason: collision with root package name */
    public byte[] f15913r;

    /* renamed from: s, reason: collision with root package name */
    public byte[] f15914s;

    /* renamed from: t, reason: collision with root package name */
    public int f15915t;
    public int tempBufferCheckUpgradeOrder;

    /* renamed from: u, reason: collision with root package name */
    public final int f15916u;

    /* renamed from: v, reason: collision with root package name */
    public int f15917v;
    public int versionCheckOrder;

    /* renamed from: w, reason: collision with root package name */
    public int f15918w;

    /* renamed from: x, reason: collision with root package name */
    public int f15919x;

    /* renamed from: y, reason: collision with root package name */
    public int f15920y;

    /* renamed from: z, reason: collision with root package name */
    public int f15921z;

    public BaseBinInputStream(InputStream inputStream, long j8, int i8, int i9, boolean z7) {
        super(new BufferedInputStream(inputStream));
        this.f15896a = true;
        this.f15897b = RtkDfu.VDBG;
        this.f15898c = RtkDfu.TDBG;
        this.mpFieldsMap = new HashMap();
        this.otaVersion = 0;
        this.f15906k = 0;
        this.f15909n = "";
        this.f15912q = 0;
        this.f15915t = 11;
        this.f15918w = 1;
        this.f15919x = 1;
        this.versionCheckOrder = GattError.GATT_PRC_IN_PROGRESS;
        this.normalUpgradeOrder = 0;
        this.tempBufferCheckUpgradeOrder = 1;
        this.f15920y = 0;
        this.f15921z = 0;
        this.B = "";
        this.C = 0;
        this.D = 0;
        this.isMergeBandFile = false;
        this.compressed = false;
        this.compressMode = 1;
        this.f15896a = RtkDfu.DEBUG_ENABLE;
        this.f15912q = i8;
        this.f15916u = i9;
        this.f15899d = new byte[512];
        this.f15903h = new byte[12];
        this.f15913r = new byte[12];
        this.f15917v = 0;
        this.compressed = z7;
        c();
        if (j8 <= 0 || this.f15906k >= 3) {
            return;
        }
        this.f15906k = 3;
        this.f15905j = (int) (j8 - (b() ? 524L : 12L));
    }

    public static int toUnsigned(short s7) {
        return s7 & u.MAX_VALUE;
    }

    public final int a() {
        if (this.f15920y == 1) {
            return this.f15921z;
        }
        byte b8 = this.icType;
        if (b8 == 11 || b8 == 17 || b8 == 19) {
            return DfuException.ERROR_READ_PATCH_INFO_ERROR;
        }
        return 372;
    }

    public boolean b() {
        List list = this.f15900e;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public final void c() {
        if (MPHEADER_PARSE_FORMAT == MPHEADER_PARSE_MARK && markSupported()) {
            g();
        } else {
            h();
        }
    }

    public int checkNAndFlashFeature(boolean z7) {
        if (z7) {
            if (!isNeedCheckNAndFlash() || getImageMemType() == 1) {
                return 4096;
            }
            return LoadFileException.ERROR_NOR_FLASH_NOT_SUPPORTED;
        }
        if (isNeedCheckNAndFlash() && getImageMemType() == 1) {
            return LoadFileException.ERROR_NAND_FLASH_NOT_SUPPORTED;
        }
        return 4096;
    }

    public final void d() {
        if (this.f15897b) {
            ZLogger.v("dfuHeader=" + DataConverter.bytes2Hex(this.f15913r));
        }
        ByteBuffer wrap = ByteBuffer.wrap(this.f15913r, 0, 12);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        a(wrap);
    }

    public final void e() {
        int i8;
        long j8;
        this.f15900e = a.a(this.f15899d);
        this.mpFieldsMap.clear();
        if (this.f15900e.isEmpty()) {
            ZLogger.d(this.f15896a, "not found mp header");
            return;
        }
        for (a aVar : this.f15900e) {
            byte[] a8 = aVar.a();
            if (a8 != null && a8.length > 0) {
                int b8 = aVar.b();
                if (b8 != 27) {
                    if (b8 == 33) {
                        this.C = a8[0] & 255;
                    } else if (b8 != 36) {
                        if (b8 == 256) {
                            this.icType = a8[0];
                        } else if (b8 == 29) {
                            this.A = a8;
                        } else if (b8 == 30) {
                            this.B = a.b(a8);
                        } else if (b8 == 1) {
                            this.f15907l = ByteArrayConverter.toShort(a8, 0, 0) & u.MAX_VALUE;
                        } else if (b8 == 2) {
                            this.f15908m = ByteArrayConverter.toInt(a8, 0, 0);
                        } else if (b8 == 3) {
                            this.f15909n = a.b(a8);
                        } else if (b8 != 4) {
                            switch (b8) {
                                case 17:
                                    this.otaVersion = a8[0] & 255;
                                    break;
                                case 18:
                                    if (a8.length >= 2) {
                                        this.f15904i = ByteArrayConverter.toShort(a8, 0, 0) & u.MAX_VALUE;
                                        break;
                                    } else {
                                        break;
                                    }
                                case 19:
                                    if (a8.length >= 4) {
                                        this.f15910o = ByteArrayConverter.toInt(a8, 0, 0);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 20:
                                    if (a8.length >= 4) {
                                        i8 = ByteArrayConverter.toInt(a8, 0, 0);
                                        this.f15902g = i8;
                                        if (this.f15906k < 2) {
                                            this.f15906k = 2;
                                            this.f15905j = i8 - 12;
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                case 21:
                                    if (a8.length >= 2) {
                                        this.f15911p = ByteArrayConverter.toShort(a8, 0, 0) & u.MAX_VALUE;
                                        break;
                                    } else {
                                        break;
                                    }
                                case 22:
                                    if (a8.length >= 4) {
                                        j8 = ByteArrayConverter.toInt(a8, 0, 0);
                                        this.imageVersion = j8;
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        } else if (a8.length >= 4) {
                            i8 = ByteArrayConverter.toInt(a8, 0, 0);
                            this.f15901f = i8;
                            if (this.f15906k < 1) {
                                this.f15906k = 1;
                                this.f15905j = i8 - 12;
                            }
                        }
                        this.mpFieldsMap.put(Integer.valueOf(aVar.b()), Boolean.TRUE);
                    } else if (a8.length >= 8) {
                        j8 = ByteArrayConverter.toInt64(a8, 0, 0);
                        this.imageVersion = j8;
                    }
                } else if (a8.length >= 4) {
                    this.f15920y = 1;
                    this.f15921z = ByteArrayConverter.toInt(a8, 0, 0);
                }
            }
        }
        if (this.f15896a) {
            Locale locale = Locale.US;
            ZLogger.d(String.format(locale, "MpHeader: binId=0x%04X, binVersion=0x%04X, partNumber=%s, mpDataLength=0x%08X(%d), otaVersion=0x%02X,  mImageSizeMechanism=0x%02X", Integer.valueOf(this.f15907l), Integer.valueOf(this.f15908m), this.f15909n, Integer.valueOf(this.f15901f), Integer.valueOf(this.f15901f), Integer.valueOf(this.otaVersion), Integer.valueOf(this.f15906k)));
            if (this.otaVersion >= 1) {
                ZLogger.d(String.format(locale, "imageId=0x%04x, flashAddr=0x%08X, mpImageSize=0x%08X(%d), secureVersion=0x%04X, imageVersion=0x%08X", Integer.valueOf(this.f15904i), Integer.valueOf(this.f15910o), Integer.valueOf(this.f15902g), Integer.valueOf(this.f15902g), Integer.valueOf(this.f15911p), Long.valueOf(this.imageVersion)));
            }
            ZLogger.v("isCommonImage:" + com.realsil.sdk.dfu.d.a.b(this.f15904i));
        }
    }

    public final void f() {
        if (this.f15897b) {
            ZLogger.v("headBuf=" + DataConverter.bytes2Hex(this.f15903h));
        }
        ByteBuffer wrap = ByteBuffer.wrap(this.f15903h, 0, 12);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        a(wrap);
    }

    public final void g() {
        mark(0);
        read(this.f15899d, 0, 512);
        e();
        if (!b()) {
            ZLogger.v(this.f15897b, "reset to begin");
            reset();
        }
        int available = available();
        ZLogger.v(this.f15897b, String.format(Locale.US, "isNeedReadDfuHeader=%b, available=%d, imageHeaderOffset=%d, icType=0x%02X", Boolean.valueOf(isNeedReadDfuHeader()), Integer.valueOf(available), Integer.valueOf(this.f15912q), Byte.valueOf(this.icType)));
        if (!isNeedReadDfuHeader() || available < this.f15912q + 12) {
            read(this.f15903h, 0, 12);
            byte[] bArr = new byte[getCtrlHeaderLength()];
            this.f15913r = bArr;
            System.arraycopy(this.f15903h, 0, bArr, 0, 12);
            f();
            return;
        }
        mark(0);
        try {
            skip(this.f15912q);
        } catch (IOException unused) {
            ZLogger.w(this.f15896a, "skip error");
        }
        byte[] bArr2 = new byte[getCtrlHeaderLength()];
        this.f15913r = bArr2;
        read(bArr2, 0, getCtrlHeaderLength());
        d();
        reset();
        read(this.f15903h, 0, 12);
    }

    public int getActiveCompareVersionFlag() {
        return this.f15918w;
    }

    public int getBinId() {
        return this.f15907l;
    }

    public int getBinVersion() {
        return this.f15908m;
    }

    public int getCtrlHeaderLength() {
        return this.icType == 19 ? 16 : 12;
    }

    public int getCustomizeId() {
        return this.customizeId;
    }

    public byte[] getDfuHeader() {
        return this.f15913r;
    }

    public int getFlashAddr() {
        return this.f15910o;
    }

    public byte[] getHeaderBuf() {
        return this.f15903h;
    }

    public int getIcType() {
        return this.icType & 255;
    }

    public String getImageFeature() {
        return this.B;
    }

    public int getImageId() {
        return this.f15904i;
    }

    public int getImageMemType() {
        return this.C;
    }

    public int getImageSize() {
        return this.f15905j;
    }

    public long getImageVersion() {
        return this.imageVersion;
    }

    public int getInactiveVersionCompFlag() {
        return this.f15919x;
    }

    public int getOtaVersion() {
        return this.otaVersion;
    }

    public byte[] getPubKeyHash() {
        return this.A;
    }

    public int getSecureVersion() {
        return this.f15911p;
    }

    public byte[] getSha256() {
        return this.f15914s;
    }

    public int getTotalImageSize() {
        return this.f15905j + 12;
    }

    public final void h() {
        read(this.f15903h, 0, 12);
        byte[] bArr = this.f15903h;
        if (bArr[0] == 1 && bArr[1] == 0 && bArr[2] == 2) {
            System.arraycopy(bArr, 0, this.f15899d, 0, 12);
            read(this.f15899d, 12, 500);
            e();
            read(this.f15903h, 0, 12);
        }
        int available = available();
        ZLogger.v(this.f15897b, String.format(Locale.US, "isNeedReadDfuHeader=%b, available=%d, imageHeaderOffset=%d,icType=0x%02X", Boolean.valueOf(isNeedReadDfuHeader()), Integer.valueOf(available), Integer.valueOf(this.f15912q), Byte.valueOf(this.icType)));
        if (isNeedReadDfuHeader()) {
            int i8 = this.f15912q;
            if (available >= i8 + 12) {
                byte[] bArr2 = new byte[i8];
                System.arraycopy(this.f15903h, 0, bArr2, 0, 12);
                read(bArr2, 12, this.f15912q - 12);
                byte[] bArr3 = new byte[getCtrlHeaderLength()];
                this.f15913r = bArr3;
                read(bArr3, 0, getCtrlHeaderLength());
                d();
                return;
            }
        }
        byte[] bArr4 = new byte[getCtrlHeaderLength()];
        this.f15913r = bArr4;
        System.arraycopy(this.f15903h, 0, bArr4, 0, 12);
        f();
    }

    public boolean isMergeBandFile() {
        return this.isMergeBandFile && this.compressMode == 0;
    }

    public boolean isNeedCheckNAndFlash() {
        int i8 = this.f15907l;
        return (i8 == 61441 || i8 == 61442 || i8 == 61443 || i8 == 61444 || i8 == 61445 || i8 == 61446 || i8 == 61447 || i8 == 61448 || i8 == 1040 || i8 == 1280 || i8 == 1538) ? false : true;
    }

    public boolean isNeedReadDfuHeader() {
        return this.f15912q > 0;
    }

    public boolean isTempBufferCheckSupported() {
        return this.tempBufferCheckUpgradeOrder != 0;
    }

    public void parseImageHeaderEx() {
        int i8;
        int i9;
        try {
            int a8 = a();
            int i10 = a8 - 12;
            int i11 = a8 + 20;
            if (this.f15904i == 10148) {
                i8 = 1014;
                i9 = 1016;
            } else {
                i8 = 0;
                i9 = 0;
            }
            int max = Math.max(i11, i9);
            ZLogger.v(this.f15896a, String.format("buf1=%d, vpIdBuf=%d, bufferSize=%d", Integer.valueOf(i11), Integer.valueOf(i9), Integer.valueOf(max)));
            byte[] bArr = new byte[max];
            if (i11 <= i9) {
                int read = read(bArr, 0, i11);
                ZLogger.v(this.f15896a, String.format("readOffset=%d, buffer1=%s", Integer.valueOf(read), DataConverter.bytes2Hex(bArr)));
                if (read > 0) {
                    byte[] bArr2 = new byte[32];
                    this.f15914s = bArr2;
                    System.arraycopy(bArr, i10, bArr2, 0, 32);
                    ZLogger.v(this.f15897b, "sha256=" + DataConverter.bytes2Hex(this.f15914s));
                }
                int read2 = read(bArr, i11, max - i11);
                ZLogger.v(this.f15896a, String.format("readOffset=%d, buffer1=%s", Integer.valueOf(read2), DataConverter.bytes2Hex(bArr)));
                if (read2 > 0) {
                    byte[] bArr3 = new byte[2];
                    System.arraycopy(bArr, i8, bArr3, 0, 2);
                    short s7 = ByteArrayConverter.toShort(bArr3, 0, 0);
                    this.customizeId = s7;
                    ZLogger.v(this.f15897b, String.format("customizeId=%04X", Integer.valueOf(s7)));
                    return;
                }
                return;
            }
            if (i9 > 0) {
                int read3 = read(bArr, 0, i9);
                ZLogger.v(String.format("readOffset=%d, buffer1=%s", Integer.valueOf(read3), DataConverter.bytes2Hex(bArr)));
                if (read3 > 0) {
                    byte[] bArr4 = new byte[2];
                    System.arraycopy(bArr, i8, bArr4, 0, 2);
                    short s8 = ByteArrayConverter.toShort(bArr4, 0, 0);
                    this.customizeId = s8;
                    ZLogger.v(this.f15897b, String.format("customizeId=%04X", Integer.valueOf(s8)));
                }
            }
            int read4 = read(bArr, i9, max - i9);
            ZLogger.v(String.format("readOffset=%d, buffer1=%s", Integer.valueOf(read4), DataConverter.bytes2Hex(bArr)));
            if (read4 > 0) {
                byte[] bArr5 = new byte[32];
                this.f15914s = bArr5;
                System.arraycopy(bArr, i10, bArr5, 0, 32);
                ZLogger.v(this.f15897b, "sha256=" + DataConverter.bytes2Hex(this.f15914s));
            }
        } catch (Exception e8) {
            ZLogger.w(e8.toString());
        }
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() {
        throw new UnsupportedOperationException("Use readPacket() method instead");
    }

    public int readPacket(byte[] bArr) {
        return read(bArr, this.f15916u);
    }

    public int remainNumInPackets(int i8) {
        int remainSizeInBytes = remainSizeInBytes();
        return (remainSizeInBytes / i8) + (remainSizeInBytes % i8 > 0 ? 1 : 0);
    }

    public int remainSizeInBytes() {
        return this.f15905j - this.f15917v;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        super.reset();
        this.f15917v = 0;
    }

    public void setActiveCompareVersionFlag(int i8) {
        this.f15918w = i8;
    }

    public void setCustomizeId(int i8) {
        this.customizeId = i8;
    }

    public void setInactiveVersionCompFlag(int i8) {
        this.f15919x = i8;
    }

    public void setSha256(byte[] bArr) {
        this.f15914s = bArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Locale locale = Locale.US;
        sb.append(String.format(locale, "BinInputStream { otaVersion=0x%02X, icType=0x%02X, imageId=0x%04X,binId=0x%04X", Integer.valueOf(this.otaVersion), Byte.valueOf(this.icType), Integer.valueOf(this.f15904i), Integer.valueOf(this.f15907l)));
        sb.append(String.format(locale, "\n\timageVersion=0x%08X, imageSize(%d)=0x%08X(%d),imageMemType=%d", Long.valueOf(this.imageVersion), Integer.valueOf(this.f15906k), Integer.valueOf(this.f15905j), Integer.valueOf(this.f15905j), Integer.valueOf(this.C)));
        sb.append(String.format(locale, "\n\tactiveCompareVersionFlag=%d, inactiveVersionCompFlag=%d,upgradeOrder=(%d-%d)", Integer.valueOf(this.f15918w), Integer.valueOf(this.f15919x), Integer.valueOf(this.normalUpgradeOrder), Integer.valueOf(this.tempBufferCheckUpgradeOrder)));
        byte[] bArr = this.A;
        if (bArr != null && bArr.length > 0) {
            sb.append(String.format("\n\tpubKeyHash=%s", DataConverter.bytes2Hex(bArr)));
        }
        sb.append(String.format("\n\tsha256, src=%d, offset=%d, value=%s", Integer.valueOf(this.f15920y), Integer.valueOf(this.f15921z), DataConverter.bytes2Hex(this.f15914s)));
        if (!StringUtils.isEmpty(this.B)) {
            sb.append(String.format("\n\timageFeature=%s", this.B));
        }
        sb.append("\n}");
        return sb.toString();
    }

    public void a(ByteBuffer byteBuffer) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, bArr.length);
    }

    public boolean a(int i8) {
        Boolean bool = this.mpFieldsMap.get(Integer.valueOf(i8));
        if (bool == null) {
            return false;
        }
        return Boolean.TRUE.equals(bool);
    }

    public int read(byte[] bArr, int i8) {
        int read = read(bArr, 0, i8);
        if (read > 0) {
            this.f15917v += read;
        }
        return read;
    }
}
