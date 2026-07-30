package com.realsil.sdk.dfu.image.wrapper;

import android.os.Parcel;
import android.os.Parcelable;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.i.a;
import com.realsil.sdk.dfu.image.BinIndicator;
import com.realsil.sdk.dfu.utils.DfuUtils;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class BinImageWrapper extends a implements Parcelable {
    public static final Parcelable.Creator<BinImageWrapper> CREATOR = new Parcelable.Creator<BinImageWrapper>() { // from class: com.realsil.sdk.dfu.image.wrapper.BinImageWrapper.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BinImageWrapper createFromParcel(Parcel parcel) {
            return new BinImageWrapper(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BinImageWrapper[] newArray(int i8) {
            return new BinImageWrapper[i8];
        }
    };

    /* renamed from: j, reason: collision with root package name */
    public int f15922j;

    /* renamed from: k, reason: collision with root package name */
    public int f15923k;

    /* renamed from: l, reason: collision with root package name */
    public int f15924l;

    /* renamed from: m, reason: collision with root package name */
    public int f15925m;

    /* renamed from: n, reason: collision with root package name */
    public int f15926n;

    /* renamed from: o, reason: collision with root package name */
    public int f15927o;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public int f15928a;

        /* renamed from: b, reason: collision with root package name */
        public int f15929b;

        /* renamed from: c, reason: collision with root package name */
        public long f15930c;

        /* renamed from: d, reason: collision with root package name */
        public int f15931d;

        /* renamed from: e, reason: collision with root package name */
        public int f15932e;

        /* renamed from: f, reason: collision with root package name */
        public int f15933f;

        /* renamed from: g, reason: collision with root package name */
        public int f15934g = 0;

        /* renamed from: h, reason: collision with root package name */
        public String f15935h = "";

        public Builder binId(int i8) {
            this.f15932e = i8;
            return this;
        }

        public Builder bitNumber(int i8) {
            this.f15931d = i8;
            return this;
        }

        public BinImageWrapper build() {
            return new BinImageWrapper(this.f15928a, this.f15929b, this.f15931d, this.f15932e, this.f15930c, this.f15933f, this.f15934g, this.f15935h);
        }

        public Builder icType(int i8) {
            this.f15929b = i8;
            return this;
        }

        public Builder imageFeature(String str) {
            this.f15935h = str;
            return this;
        }

        public Builder imageVersion(long j8) {
            return imageVersion(j8, 0);
        }

        public Builder setOtaVersion(int i8) {
            this.f15928a = i8;
            return this;
        }

        public Builder imageVersion(long j8, int i8) {
            this.f15930c = j8;
            this.f15934g = i8;
            return this;
        }

        public Builder imageVersion(long j8, int i8, int i9) {
            this.f15930c = j8;
            this.f15934g = 3;
            this.f15933f = i9;
            return this;
        }
    }

    public BinImageWrapper(int i8, int i9, int i10, int i11, long j8, int i12, int i13, String str) {
        this.f15927o = 0;
        this.f15922j = i8;
        this.f15775a = i9;
        this.f15923k = i10;
        this.f15924l = i11;
        this.f15776b = j8;
        this.f15926n = i12;
        this.f15925m = i13;
        this.f15783i = str;
        b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x005c, code lost:
    
        if (r8 == 2048) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int getImageVersionFormatWithBinId(int i8, int i9, int i10) {
        int i11;
        if (i10 >= 3) {
            return 518;
        }
        if (i8 <= 3) {
            i11 = 7;
        } else if (i8 == 5 || i8 == 9 || i8 == 12) {
            if (i9 != 512) {
                if (i9 != 768) {
                    if (i9 != 1792) {
                    }
                }
            }
            i11 = 3;
        } else {
            if (i9 != 519) {
                if (i9 != 520) {
                    if (i9 == 768) {
                        i11 = 5;
                    } else if (i9 != 1024) {
                        if (i9 == 1040) {
                            if (i10 < 2) {
                                i11 = 514;
                            }
                            i11 = 516;
                        } else if (i9 != 1280 && i9 != 1538) {
                            if (i9 != 1792 && i9 != 2560 && i9 != 2561) {
                                switch (i9) {
                                    case 512:
                                    case 513:
                                    case 514:
                                        break;
                                    default:
                                        i11 = 1;
                                        break;
                                }
                            }
                        } else {
                            i11 = 515;
                        }
                    }
                }
                i11 = 2;
            }
            i11 = 3;
        }
        ZLogger.v(String.format(Locale.US, "icType=0x%02X, binId=0x%04X, format=%d", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i11)));
        return i11;
    }

    public final void a() {
        String format;
        int i8 = this.f15922j;
        boolean z7 = i8 > 0;
        int i9 = this.f15926n;
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

    public final void b() {
        BinIndicator indByBinId;
        int i8 = this.f15775a;
        if (i8 == 14 || i8 == 15 || i8 == 16) {
            indByBinId = BinIndicator.getIndByBinId(i8, this.f15924l);
            if (indByBinId != null) {
                this.f15926n = indByBinId.versionFormat;
                this.f15782h = indByBinId.flashLayoutName;
            }
        } else {
            int i9 = this.f15925m;
            if (i9 == 1) {
                this.f15926n = DfuUtils.getImageVersionFormatWithBitNumber(i8, this.f15923k);
                indByBinId = BinIndicator.getBinIndicatorByBitNumber(this.f15775a, this.f15923k);
            } else {
                if (i9 == 2 || i9 == 0) {
                    this.f15926n = getImageVersionFormatWithBinId(i8, this.f15924l, this.f15922j);
                    i8 = this.f15775a;
                } else if (i9 != 3) {
                    indByBinId = null;
                }
                indByBinId = BinIndicator.getBinIndicatorByBinId(i8, this.f15924l, this.f15923k);
            }
        }
        if (indByBinId != null) {
            ZLogger.v(indByBinId.toString());
            this.f15782h = indByBinId.flashLayoutName;
        } else {
            ZLogger.w(String.format("icType=0x%02X, binId=0x%04X not supported", Integer.valueOf(this.f15775a), Integer.valueOf(this.f15924l)));
        }
        long j8 = this.f15776b;
        if (a.INVALID_VERSION_32 != j8 && -1 != j8) {
            this.f15927o = 1;
            a();
            return;
        }
        this.f15927o = 0;
        this.f15777c = 0;
        this.f15778d = 0;
        this.f15779e = 0;
        this.f15780f = 0;
        this.f15781g = String.format(Locale.US, "%d.%d.%d.%d", 0, Integer.valueOf(this.f15778d), Integer.valueOf(this.f15779e), Integer.valueOf(this.f15780f));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getFormat() {
        return this.f15926n;
    }

    public int getOtaVersion() {
        return this.f15922j;
    }

    public String toString() {
        return String.format(Locale.US, "%s, otaVersion=[%d], icType=[%02X], imageVersion=[%08X], \nformat=[%d], formattedVersion=(%d.%d.%d.%d)->[%s]", this.f15782h, Integer.valueOf(this.f15922j), Integer.valueOf(this.f15775a), Long.valueOf(this.f15776b), Integer.valueOf(this.f15926n), Integer.valueOf(this.f15777c), Integer.valueOf(this.f15778d), Integer.valueOf(this.f15779e), Integer.valueOf(this.f15780f), this.f15781g);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f15922j);
        parcel.writeInt(this.f15775a);
        parcel.writeInt(this.f15923k);
        parcel.writeInt(this.f15924l);
        parcel.writeLong(this.f15776b);
        parcel.writeInt(this.f15925m);
        parcel.writeInt(this.f15926n);
        parcel.writeInt(this.f15777c);
        parcel.writeInt(this.f15778d);
        parcel.writeInt(this.f15779e);
        parcel.writeInt(this.f15780f);
        parcel.writeInt(this.f15927o);
        parcel.writeString(this.f15781g);
        parcel.writeString(this.f15782h);
        parcel.writeString(this.f15783i);
    }

    public BinImageWrapper(Parcel parcel) {
        this.f15927o = 0;
        this.f15922j = parcel.readInt();
        this.f15775a = parcel.readInt();
        this.f15923k = parcel.readInt();
        this.f15924l = parcel.readInt();
        this.f15776b = parcel.readLong();
        this.f15925m = parcel.readInt();
        this.f15926n = parcel.readInt();
        this.f15777c = parcel.readInt();
        this.f15778d = parcel.readInt();
        this.f15779e = parcel.readInt();
        this.f15780f = parcel.readInt();
        this.f15927o = parcel.readInt();
        this.f15781g = parcel.readString();
        this.f15782h = parcel.readString();
        this.f15783i = parcel.readString();
    }
}
