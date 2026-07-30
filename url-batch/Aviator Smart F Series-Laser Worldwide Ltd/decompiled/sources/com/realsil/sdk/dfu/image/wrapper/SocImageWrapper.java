package com.realsil.sdk.dfu.image.wrapper;

import android.os.Parcel;
import android.os.Parcelable;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.i.a;
import com.realsil.sdk.dfu.image.BinIndicator;
import com.realsil.sdk.dfu.model.DeviceInfo;
import com.realsil.sdk.dfu.model.ImageVersionInfo;
import java.util.Locale;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes4.dex */
public final class SocImageWrapper extends a implements Parcelable {
    public static final Parcelable.Creator<SocImageWrapper> CREATOR = new Parcelable.Creator<SocImageWrapper>() { // from class: com.realsil.sdk.dfu.image.wrapper.SocImageWrapper.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SocImageWrapper createFromParcel(Parcel parcel) {
            return new SocImageWrapper(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SocImageWrapper[] newArray(int i8) {
            return new SocImageWrapper[i8];
        }
    };
    public static boolean VDBG = false;

    /* renamed from: j, reason: collision with root package name */
    public int f15936j;

    /* renamed from: k, reason: collision with root package name */
    public int f15937k;

    /* renamed from: l, reason: collision with root package name */
    public int f15938l;

    /* renamed from: m, reason: collision with root package name */
    public int f15939m;

    /* renamed from: n, reason: collision with root package name */
    public int f15940n;

    /* renamed from: o, reason: collision with root package name */
    public int f15941o;

    /* renamed from: p, reason: collision with root package name */
    public int f15942p;

    /* renamed from: q, reason: collision with root package name */
    public int f15943q;

    /* renamed from: r, reason: collision with root package name */
    public int f15944r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f15945s;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public int f15946a;

        /* renamed from: b, reason: collision with root package name */
        public int f15947b;

        /* renamed from: c, reason: collision with root package name */
        public int f15948c;

        /* renamed from: e, reason: collision with root package name */
        public int f15950e;

        /* renamed from: f, reason: collision with root package name */
        public int f15951f;

        /* renamed from: h, reason: collision with root package name */
        public DeviceInfo f15953h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f15954i;

        /* renamed from: j, reason: collision with root package name */
        public int f15955j;

        /* renamed from: k, reason: collision with root package name */
        public int f15956k;

        /* renamed from: d, reason: collision with root package name */
        public long f15949d = a.INVALID_VERSION_32;

        /* renamed from: g, reason: collision with root package name */
        public int f15952g = 15;

        /* renamed from: l, reason: collision with root package name */
        public String f15957l = "";

        public SocImageWrapper build() {
            DeviceInfo deviceInfo = this.f15953h;
            if (deviceInfo != null) {
                this.f15946a = deviceInfo.getProtocolType();
                DeviceInfo deviceInfo2 = this.f15953h;
                this.f15947b = deviceInfo2.specVersion;
                this.f15948c = deviceInfo2.icType;
                this.f15952g = deviceInfo2.getActiveBank();
                this.f15954i = this.f15953h.longImageVersionSupported;
            }
            return new SocImageWrapper(this.f15946a, this.f15947b, this.f15948c, this.f15949d, this.f15950e, this.f15951f, this.f15952g, this.f15955j, this.f15956k, this.f15957l, this.f15954i);
        }

        public Builder imageFeature(String str) {
            this.f15957l = str;
            return this;
        }

        public Builder imageVersionInfo(ImageVersionInfo imageVersionInfo) {
            this.f15951f = imageVersionInfo.getImageId();
            this.f15949d = imageVersionInfo.getVersion();
            this.f15950e = imageVersionInfo.getBitNumber();
            this.f15955j = imageVersionInfo.getIndication();
            this.f15956k = imageVersionInfo.getSectionSize();
            return this;
        }

        public Builder setBankIndicator(int i8) {
            this.f15952g = i8;
            return this;
        }

        public Builder setBitNumber(int i8) {
            this.f15950e = i8;
            return this;
        }

        public Builder setDeviceInfo(DeviceInfo deviceInfo) {
            this.f15953h = deviceInfo;
            return this;
        }

        public Builder setIcType(int i8) {
            this.f15948c = i8;
            return this;
        }

        public Builder setImageId(int i8) {
            this.f15951f = i8;
            return this;
        }

        public Builder setImageVersion(long j8) {
            this.f15949d = j8;
            return this;
        }

        public Builder setProtocolType(int i8) {
            this.f15946a = i8;
            return this;
        }

        public Builder setSpecVersion(int i8) {
            this.f15947b = i8;
            return this;
        }
    }

    public SocImageWrapper(int i8, int i9, int i10, long j8, int i11, int i12, int i13, int i14, int i15, String str, boolean z7) {
        this.f15936j = i8;
        this.f15937k = i9;
        this.f15775a = i10;
        this.f15776b = j8;
        this.f15938l = i11;
        this.f15939m = i12;
        this.f15940n = i13;
        this.f15941o = i14;
        this.f15942p = i15;
        this.f15783i = str;
        this.f15945s = z7;
        d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        if (r11.f15940n != 15) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0081, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005b, code lost:
    
        if (r11.f15940n != 15) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006d, code lost:
    
        if (r11.f15940n != 15) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007d, code lost:
    
        if (r11.f15940n != 15) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d3, code lost:
    
        if (r0 != null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void d() {
        BinIndicator indByImageId;
        int i8;
        int i9;
        boolean z7;
        if (VDBG) {
            ZLogger.v(String.format("protocolType=%04X,specVersion=%02X, icType=%02X,imageId=0x%02X", Integer.valueOf(this.f15936j), Integer.valueOf(this.f15937k), Integer.valueOf(this.f15775a), Integer.valueOf(this.f15939m)));
        }
        int i10 = this.f15775a;
        if (i10 == 14 || i10 == 15) {
            indByImageId = BinIndicator.getIndByImageId(i10, this.f15939m);
        } else {
            int i11 = this.f15936j;
            if (i11 == 20) {
                i8 = this.f15937k;
                i9 = this.f15939m;
            } else if (i11 == 22) {
                i8 = this.f15937k;
                i9 = this.f15939m;
            } else if (i11 == 16) {
                int i12 = this.f15937k;
                if (i12 >= 3) {
                    i9 = this.f15939m;
                    i8 = i12;
                }
                this.f15944r = getImageVersionFormatWithBitNumber(i10, this.f15938l);
                indByImageId = BinIndicator.getBinIndicatorByBitNumber(this.f15775a, this.f15938l);
            } else {
                if (i11 == 17) {
                    i8 = this.f15937k;
                    if (i8 >= 6) {
                        i9 = this.f15939m;
                    }
                } else if (i11 == 18 && i10 == 16) {
                    indByImageId = BinIndicator.getBinIndicatorByBitNumber(i10, this.f15938l);
                    if (indByImageId == null) {
                        ZLogger.w(String.format("icType=0x%02X, imageId=0x%04X not supported", Integer.valueOf(this.f15775a), Integer.valueOf(this.f15939m)));
                    }
                    this.f15944r = indByImageId.versionFormat;
                }
                this.f15944r = getImageVersionFormatWithBitNumber(i10, this.f15938l);
                indByImageId = BinIndicator.getBinIndicatorByBitNumber(this.f15775a, this.f15938l);
            }
            this.f15944r = getImageVersionFormatWithImageId(i10, i11, i8, i9, z7);
            indByImageId = BinIndicator.getBinIndicatorByImageId(this.f15775a, this.f15939m, this.f15938l);
        }
        if (indByImageId != null) {
            ZLogger.v(indByImageId.toString());
            this.f15782h = indByImageId.flashLayoutName;
        } else {
            ZLogger.w(String.format("icType=0x%02X, imageId=0x%04X not supported", Integer.valueOf(this.f15775a), Integer.valueOf(this.f15939m)));
        }
        if (this.f15945s) {
            this.f15944r = 518;
        }
        long j8 = this.f15776b;
        if (a.INVALID_VERSION_32 != j8 && -1 != j8) {
            a();
            return;
        }
        this.f15940n = 0;
        this.f15777c = 0;
        this.f15778d = 0;
        this.f15779e = 0;
        this.f15780f = 0;
        this.f15781g = "";
    }

    public static int getImageVersionFormatWithBitNumber(int i8, int i9) {
        if (i8 <= 3) {
            return 7;
        }
        if (i8 == 5 || i8 == 9 || i8 == 12) {
            return i9 != 2 ? 3 : 2;
        }
        switch (i9) {
            case 0:
            case 1:
            case 2:
                return 2;
            case 3:
            case 4:
                return 3;
            case 5:
                return 5;
            case 6:
            case 7:
                return 515;
            case 8:
                return 514;
            case 9:
                return 2;
            default:
                return 1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int getImageVersionFormatWithImageId(int i8, int i9, int i10, int i11, boolean z7) {
        if (i8 <= 3) {
            return 7;
        }
        if (i8 == 5 || i8 == 9 || i8 == 12) {
            return 2;
        }
        if (i11 != 10140 && i11 != 10141 && i11 != 10145 && i11 != 10147) {
            if (i11 != 10148) {
                switch (i11) {
                    case 10127:
                    case 10129:
                    case 10130:
                        break;
                    case 10128:
                        if (i9 != 20 && i9 != 21 && i9 != 22) {
                            return i9 == 16 ? (i10 < 3 || !z7) ? 2 : 1 : (i9 == 17 && i10 >= 6 && z7) ? 1 : 2;
                        }
                        if (z7) {
                            return 1;
                        }
                        break;
                    case 10131:
                        return 5;
                    case 10132:
                    case 10133:
                        return 515;
                    case 10134:
                        break;
                    case 10135:
                        return (i8 == 11 || i8 == 17 || i8 == 19 || i8 == 13 || i8 == 10 || i8 == 14 || i8 == 15) ? 516 : 514;
                    default:
                        return 1;
                }
            }
            return 2;
        }
        return 3;
    }

    public final void a() {
        int i8 = this.f15936j;
        if (i8 == 20 || i8 == 21 || i8 == 22) {
            c();
        } else {
            b();
        }
    }

    public final void b() {
        String format;
        int i8 = this.f15937k;
        boolean z7 = i8 > 0;
        int i9 = this.f15944r;
        if (i9 == 1) {
            b(z7);
            return;
        }
        if (i9 == 2) {
            if (i8 > 0) {
                long j8 = this.f15776b;
                int i10 = (int) ((j8 >> 24) & 255);
                this.f15777c = i10;
                this.f15778d = (int) ((j8 >> 16) & 255);
                this.f15779e = (int) ((j8 >> 8) & 255);
                this.f15780f = (int) (j8 & 255);
                format = String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf(i10), Integer.valueOf(this.f15778d), Integer.valueOf(this.f15779e), Integer.valueOf(this.f15780f));
                this.f15781g = format;
            }
            long j9 = this.f15776b;
            this.f15777c = (int) j9;
            this.f15778d = 0;
            this.f15779e = 0;
            this.f15780f = 0;
            format = String.valueOf(j9);
            this.f15781g = format;
        }
        if (i9 == 3) {
            a(z7);
            return;
        }
        if (i9 == 5) {
            if (i8 > 0) {
                long j10 = this.f15776b;
                int i11 = (int) (15 & j10);
                this.f15777c = i11;
                this.f15778d = (int) ((j10 >> 4) & 255);
                this.f15779e = (int) ((j10 >> 12) & 511);
                this.f15780f = (int) ((j10 >> 21) & 2047);
                format = String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf(i11), Integer.valueOf(this.f15778d), Integer.valueOf(this.f15779e), Integer.valueOf(this.f15780f));
                this.f15781g = format;
            }
            long j92 = this.f15776b;
            this.f15777c = (int) j92;
            this.f15778d = 0;
            this.f15779e = 0;
            this.f15780f = 0;
            format = String.valueOf(j92);
            this.f15781g = format;
        }
        if (i9 == 515) {
            if (i8 > 0) {
                long j11 = this.f15776b;
                int i12 = (int) ((j11 >> 24) & 255);
                this.f15777c = i12;
                this.f15778d = (int) ((j11 >> 16) & 255);
                this.f15779e = (int) ((j11 >> 8) & 255);
                this.f15780f = (int) (j11 & 255);
                format = String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf(i12), Integer.valueOf(this.f15778d), Integer.valueOf(this.f15779e), Integer.valueOf(this.f15780f));
                this.f15781g = format;
            }
            long j922 = this.f15776b;
            this.f15777c = (int) j922;
            this.f15778d = 0;
            this.f15779e = 0;
            this.f15780f = 0;
            format = String.valueOf(j922);
            this.f15781g = format;
        }
        if (i9 != 4 && i9 != 7) {
            if (i9 == 514) {
                if (i8 > 0) {
                    long j12 = this.f15776b;
                    int i13 = (int) ((j12 >> 8) & 255);
                    this.f15777c = i13;
                    this.f15778d = (int) (j12 & 255);
                    this.f15779e = (int) ((j12 >> 24) & 255);
                    this.f15780f = (int) ((j12 >> 16) & 255);
                    format = String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf(i13), Integer.valueOf(this.f15778d), Integer.valueOf(this.f15779e), Integer.valueOf(this.f15780f));
                }
            } else {
                if (i9 != 516) {
                    a(i9);
                    return;
                }
                long j13 = this.f15776b;
                int i14 = (int) ((j13 >> 24) & 255);
                this.f15777c = i14;
                this.f15778d = (int) ((j13 >> 16) & 255);
                this.f15779e = (int) ((j13 >> 8) & 255);
                this.f15780f = (int) (j13 & 255);
                format = String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf(i14), Integer.valueOf(this.f15778d), Integer.valueOf(this.f15779e), Integer.valueOf(this.f15780f));
            }
            this.f15781g = format;
        }
        long j9222 = this.f15776b;
        this.f15777c = (int) j9222;
        this.f15778d = 0;
        this.f15779e = 0;
        this.f15780f = 0;
        format = String.valueOf(j9222);
        this.f15781g = format;
    }

    public final void c() {
        String format;
        int i8 = this.f15944r;
        if (i8 == 518) {
            long j8 = this.f15776b;
            int i9 = (int) ((j8 >> 56) & 255);
            this.f15777c = i9;
            this.f15778d = (int) (255 & (j8 >> 48));
            this.f15779e = (int) ((j8 >> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
            this.f15780f = (int) (j8 & a.INVALID_VERSION_32);
            format = String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf(i9), Integer.valueOf(this.f15778d), Integer.valueOf(this.f15779e), Integer.valueOf(this.f15780f));
        } else {
            if (i8 == 1) {
                b(true);
                return;
            }
            if (i8 == 2) {
                long j9 = this.f15776b;
                int i10 = (int) ((j9 >> 24) & 255);
                this.f15777c = i10;
                this.f15778d = (int) ((j9 >> 16) & 255);
                this.f15779e = (int) ((j9 >> 8) & 255);
                this.f15780f = (int) (j9 & 255);
                format = String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf(i10), Integer.valueOf(this.f15778d), Integer.valueOf(this.f15779e), Integer.valueOf(this.f15780f));
            } else {
                if (i8 == 3) {
                    a(true);
                    return;
                }
                if (i8 == 5) {
                    long j10 = this.f15776b;
                    int i11 = (int) (15 & j10);
                    this.f15777c = i11;
                    this.f15778d = (int) (255 & (j10 >> 4));
                    this.f15779e = (int) ((j10 >> 12) & 511);
                    this.f15780f = (int) ((j10 >> 21) & 2047);
                    format = String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf(i11), Integer.valueOf(this.f15778d), Integer.valueOf(this.f15779e), Integer.valueOf(this.f15780f));
                } else if (i8 == 515) {
                    long j11 = this.f15776b;
                    int i12 = (int) ((j11 >> 24) & 255);
                    this.f15777c = i12;
                    this.f15778d = (int) ((j11 >> 16) & 255);
                    this.f15779e = (int) ((j11 >> 8) & 255);
                    this.f15780f = (int) (j11 & 255);
                    format = String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf(i12), Integer.valueOf(this.f15778d), Integer.valueOf(this.f15779e), Integer.valueOf(this.f15780f));
                } else if (i8 == 4 || i8 == 7) {
                    long j12 = this.f15776b;
                    this.f15777c = (int) j12;
                    this.f15778d = 0;
                    this.f15779e = 0;
                    this.f15780f = 0;
                    format = String.valueOf(j12);
                } else if (i8 == 514) {
                    long j13 = this.f15776b;
                    int i13 = (int) ((j13 >> 8) & 255);
                    this.f15777c = i13;
                    this.f15778d = (int) (j13 & 255);
                    this.f15779e = (int) ((j13 >> 24) & 255);
                    this.f15780f = (int) ((j13 >> 16) & 255);
                    format = String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf(i13), Integer.valueOf(this.f15778d), Integer.valueOf(this.f15779e), Integer.valueOf(this.f15780f));
                } else {
                    if (i8 != 516) {
                        a(i8);
                        return;
                    }
                    long j14 = this.f15776b;
                    int i14 = (int) ((j14 >> 24) & 255);
                    this.f15777c = i14;
                    this.f15778d = (int) ((j14 >> 16) & 255);
                    this.f15779e = (int) ((j14 >> 8) & 255);
                    this.f15780f = (int) (j14 & 255);
                    format = String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf(i14), Integer.valueOf(this.f15778d), Integer.valueOf(this.f15779e), Integer.valueOf(this.f15780f));
                }
            }
        }
        this.f15781g = format;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getBankIndicator() {
        return this.f15940n;
    }

    public int getBitNumber() {
        return this.f15938l;
    }

    public int getFormat() {
        return this.f15944r;
    }

    public int getImageId() {
        return this.f15939m;
    }

    public int getIndication() {
        return this.f15941o;
    }

    public int getProtocolType() {
        return this.f15936j;
    }

    public int getSectionSize() {
        return this.f15942p;
    }

    public int getSpecVersion() {
        return this.f15937k;
    }

    public String toString() {
        return String.format(Locale.US, "0x%04X(%s-%s), I%02XPT%04XSV%02X, imageVersion=[%08X], format=[%d]\nformattedVersion=(%d.%d.%d.%d)->[%s]", Integer.valueOf(this.f15939m), this.f15782h, this.f15783i, Integer.valueOf(this.f15775a), Integer.valueOf(this.f15936j), Integer.valueOf(this.f15937k), Long.valueOf(this.f15776b), Integer.valueOf(this.f15944r), Integer.valueOf(this.f15777c), Integer.valueOf(this.f15778d), Integer.valueOf(this.f15779e), Integer.valueOf(this.f15780f), this.f15781g);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f15936j);
        parcel.writeInt(this.f15937k);
        parcel.writeInt(this.f15775a);
        parcel.writeLong(this.f15776b);
        parcel.writeInt(this.f15938l);
        parcel.writeInt(this.f15939m);
        parcel.writeInt(this.f15940n);
        parcel.writeInt(this.f15941o);
        parcel.writeInt(this.f15942p);
        parcel.writeInt(this.f15943q);
        parcel.writeInt(this.f15944r);
        parcel.writeInt(this.f15777c);
        parcel.writeInt(this.f15778d);
        parcel.writeInt(this.f15779e);
        parcel.writeInt(this.f15780f);
        parcel.writeString(this.f15781g);
        parcel.writeString(this.f15782h);
        parcel.writeString(this.f15783i);
    }

    public SocImageWrapper(Parcel parcel) {
        this.f15940n = 15;
        this.f15936j = parcel.readInt();
        this.f15937k = parcel.readInt();
        this.f15775a = parcel.readInt();
        this.f15776b = parcel.readLong();
        this.f15938l = parcel.readInt();
        this.f15939m = parcel.readInt();
        this.f15940n = parcel.readInt();
        this.f15941o = parcel.readInt();
        this.f15942p = parcel.readInt();
        this.f15943q = parcel.readInt();
        this.f15944r = parcel.readInt();
        this.f15777c = parcel.readInt();
        this.f15778d = parcel.readInt();
        this.f15779e = parcel.readInt();
        this.f15780f = parcel.readInt();
        this.f15781g = parcel.readString();
        this.f15782h = parcel.readString();
        this.f15783i = parcel.readString();
    }
}
