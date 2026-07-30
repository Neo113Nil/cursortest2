package com.realsil.sdk.dfu.image;

import android.content.Context;
import android.text.TextUtils;
import com.realsil.sdk.core.utility.DataConverter;
import com.realsil.sdk.dfu.model.BinParameters;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class LoadParams {
    public boolean A;
    public int B;
    public boolean C;

    /* renamed from: a, reason: collision with root package name */
    public Context f15793a;

    /* renamed from: b, reason: collision with root package name */
    public int f15794b;

    /* renamed from: c, reason: collision with root package name */
    public int f15795c;

    /* renamed from: d, reason: collision with root package name */
    public int f15796d;

    /* renamed from: e, reason: collision with root package name */
    public int f15797e;

    /* renamed from: f, reason: collision with root package name */
    public int f15798f;

    /* renamed from: g, reason: collision with root package name */
    public int f15799g;

    /* renamed from: h, reason: collision with root package name */
    public String f15800h;

    /* renamed from: i, reason: collision with root package name */
    public String f15801i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f15802j;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f15803k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f15804l;

    /* renamed from: m, reason: collision with root package name */
    public int[] f15805m;

    /* renamed from: n, reason: collision with root package name */
    public OtaDeviceInfo f15806n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f15807o;

    /* renamed from: p, reason: collision with root package name */
    public int f15808p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f15809q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f15810r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f15811s;

    /* renamed from: t, reason: collision with root package name */
    public int f15812t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f15813u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f15814v;

    /* renamed from: w, reason: collision with root package name */
    public int f15815w;

    /* renamed from: x, reason: collision with root package name */
    public int f15816x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f15817y;

    /* renamed from: z, reason: collision with root package name */
    public int f15818z;

    public static final class Builder {
        public int B;

        /* renamed from: a, reason: collision with root package name */
        public Context f15819a;

        /* renamed from: c, reason: collision with root package name */
        public String f15821c;

        /* renamed from: d, reason: collision with root package name */
        public String f15822d;

        /* renamed from: m, reason: collision with root package name */
        public int[] f15831m;

        /* renamed from: n, reason: collision with root package name */
        public OtaDeviceInfo f15832n;

        /* renamed from: t, reason: collision with root package name */
        public int f15838t;

        /* renamed from: b, reason: collision with root package name */
        public int f15820b = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f15823e = 3;

        /* renamed from: f, reason: collision with root package name */
        public int f15824f = 0;

        /* renamed from: g, reason: collision with root package name */
        public int f15825g = 0;

        /* renamed from: h, reason: collision with root package name */
        public int f15826h = 0;

        /* renamed from: i, reason: collision with root package name */
        public int f15827i = 1;

        /* renamed from: j, reason: collision with root package name */
        public boolean f15828j = false;

        /* renamed from: k, reason: collision with root package name */
        public byte[] f15829k = BinParameters.FILTER_INDICATOR_ALL;

        /* renamed from: l, reason: collision with root package name */
        public boolean f15830l = false;

        /* renamed from: o, reason: collision with root package name */
        public boolean f15833o = false;

        /* renamed from: p, reason: collision with root package name */
        public int f15834p = 0;

        /* renamed from: q, reason: collision with root package name */
        public boolean f15835q = false;

        /* renamed from: r, reason: collision with root package name */
        public boolean f15836r = true;

        /* renamed from: s, reason: collision with root package name */
        public boolean f15837s = false;

        /* renamed from: u, reason: collision with root package name */
        public boolean f15839u = false;

        /* renamed from: v, reason: collision with root package name */
        public boolean f15840v = false;

        /* renamed from: w, reason: collision with root package name */
        public int f15841w = 15;

        /* renamed from: x, reason: collision with root package name */
        public int f15842x = -1;

        /* renamed from: y, reason: collision with root package name */
        public boolean f15843y = true;

        /* renamed from: z, reason: collision with root package name */
        public int f15844z = 0;
        public boolean A = false;
        public boolean C = false;
        public boolean D = false;
        public int E = 0;

        public final void a() {
            int i8 = this.f15832n.icType;
            if (i8 <= 3 && this.f15838t == 0) {
                this.f15840v = false;
            }
            if (!this.f15840v) {
                this.f15826h = 3;
            } else if (i8 == 5 || i8 == 9 || i8 == 12) {
                this.f15826h = 2;
            } else {
                this.f15826h = 2;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
        
            if (r6.C != false) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x006b, code lost:
        
            if (r6.C != false) goto L27;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void b() {
            int i8;
            if (this.f15840v) {
                this.f15836r = false;
            }
            if (this.f15832n.getRwsMode() == 2) {
                this.f15826h = 4;
                if (this.f15832n.getBudRole() == 1) {
                    this.f15827i = 1;
                } else if (this.f15832n.getBudRole() == 2) {
                    this.f15827i = 0;
                }
            } else if (this.f15832n.getRwsMode() == 1) {
                this.f15826h = 4;
                if (this.f15832n.getBudRole() == 1) {
                    this.f15827i = 1;
                } else if (this.f15832n.getBudRole() == 2) {
                    this.f15827i = 0;
                }
                if (this.f15840v) {
                    i8 = this.f15826h;
                    this.f15826h = i8 | 2;
                } else {
                    i8 = this.f15826h;
                }
                this.f15826h = i8 | 3;
            } else if (this.f15840v) {
                i8 = this.f15826h;
                this.f15826h = i8 | 2;
            } else {
                this.f15826h = 3;
            }
            if (this.f15838t == 19) {
                this.f15826h |= 3;
                if (this.f15840v) {
                    this.f15841w = this.f15832n.getActiveBank();
                }
            }
        }

        public Builder binParameters(BinParameters binParameters) {
            this.f15820b = binParameters.getStorageType();
            this.f15821c = binParameters.getFilePath();
            this.f15822d = binParameters.getSuffix();
            this.f15828j = binParameters.isFilterEnabled();
            this.f15829k = binParameters.getFilterIndicator();
            this.f15830l = binParameters.isSortEnabled();
            this.f15831m = binParameters.getSortReference();
            return this;
        }

        public LoadParams build() {
            OtaDeviceInfo otaDeviceInfo = this.f15832n;
            if (otaDeviceInfo != null) {
                this.f15823e = otaDeviceInfo.icType;
                this.f15824f = otaDeviceInfo.protocolType;
                this.f15825g = otaDeviceInfo.specVersion;
                this.f15841w = otaDeviceInfo.getUpdateBank();
                this.f15840v = this.f15832n.isBankEnabled();
                this.f15842x = this.f15832n.getImageHeaderOffset();
                OtaDeviceInfo otaDeviceInfo2 = this.f15832n;
                this.f15843y = otaDeviceInfo2.compressSupported;
                this.f15844z = otaDeviceInfo2.getCompressedImageHeaderOffset();
                OtaDeviceInfo otaDeviceInfo3 = this.f15832n;
                this.D = otaDeviceInfo3.nandFlashSupported;
                int i8 = otaDeviceInfo3.protocolType;
                if (i8 == 16) {
                    this.C = true;
                    b();
                } else if (i8 == 21) {
                    d();
                } else if (i8 == 17) {
                    c();
                } else {
                    a();
                }
                if (this.E == 3) {
                    this.f15826h = 3;
                }
            } else {
                this.f15835q = false;
                this.f15833o = false;
                this.f15836r = false;
                this.f15826h = 7;
            }
            if (this.f15823e == 11) {
                BinIndicator.move(this.f15831m, com.realsil.sdk.dfu.d.a.f15724f.bitNumber, 0);
                this.f15830l = true;
            }
            return new LoadParams(this.f15819a, this.f15823e, this.f15824f, this.f15825g, this.f15826h, this.f15820b, this.f15821c, this.f15822d, this.f15828j, this.f15829k, this.f15830l, this.f15831m, this.f15840v, this.f15841w, this.f15832n, this.f15833o, this.f15834p, this.f15835q, this.f15836r, this.f15837s, this.f15827i, this.f15838t, this.f15839u, this.f15842x, this.f15843y, this.f15844z, this.A, this.B, this.D);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
        
            r4.f15827i = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0051, code lost:
        
            if (r4.f15832n.getBudRole() == 2) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
        
            if (r4.f15832n.getBudRole() == 2) goto L25;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void c() {
            this.C = true;
            if (this.f15840v) {
                this.f15836r = false;
            }
            this.A = true;
            if (this.f15832n.getRwsMode() == 2) {
                this.f15826h = 4;
                if (this.f15832n.getBudRole() != 1) {
                }
                this.f15827i = 1;
            } else if (this.f15832n.getRwsMode() == 1) {
                this.f15826h = 6;
                if (!this.f15840v || this.C) {
                    this.f15826h = 7;
                }
                if (this.f15832n.getBudRole() != 1) {
                }
                this.f15827i = 1;
            } else {
                int i8 = this.f15826h;
                this.f15826h = i8 | 2;
                if (!this.f15840v || this.C) {
                    this.f15826h = i8 | 3;
                }
            }
            if (this.f15838t == 19) {
                this.f15826h |= 3;
                if (this.f15840v) {
                    this.f15841w = this.f15832n.getActiveBank();
                }
            }
        }

        public Builder channelType(int i8) {
            this.E = i8;
            return this;
        }

        public final void d() {
            if (this.f15840v) {
                this.f15836r = false;
            }
            OtaDeviceInfo otaDeviceInfo = this.f15832n;
            if (otaDeviceInfo.specVersion == 0) {
                this.f15833o = false;
            }
            if (otaDeviceInfo.getRwsMode() == 2) {
                this.f15826h = 4;
                if (this.f15832n.getBudRole() == 1) {
                    this.f15827i = 1;
                } else if (this.f15832n.getBudRole() == 2) {
                    this.f15827i = 0;
                }
            } else if (this.f15832n.getRwsMode() == 1) {
                this.f15826h = 4;
                if (this.f15832n.getBudRole() == 1) {
                    this.f15827i = 1;
                } else if (this.f15832n.getBudRole() == 2) {
                    this.f15827i = 0;
                }
                if (this.f15840v) {
                    this.f15826h |= 2;
                }
                this.f15826h = 3;
            } else {
                if (this.f15840v) {
                    this.f15826h = 2;
                }
                this.f15826h = 3;
            }
            if (this.f15838t == 19) {
                this.f15826h = 3;
                if (this.f15840v) {
                    this.f15841w = this.f15832n.getActiveBank();
                }
            }
            if (this.f15832n.isMergeBankEnabled()) {
                this.f15826h = 8;
            }
        }

        public Builder dataImageValidateEnabled(boolean z7) {
            this.f15839u = z7;
            return this;
        }

        public Builder dualBankSingleBinSupported(boolean z7) {
            this.C = z7;
            return this;
        }

        public Builder fileLocation(int i8) {
            this.f15820b = i8;
            return this;
        }

        public Builder filter(boolean z7, byte[] bArr) {
            this.f15828j = z7;
            this.f15829k = bArr;
            return this;
        }

        public Builder preferredFileType(int i8) {
            this.f15826h = i8;
            return this;
        }

        public Builder preferredIcType(int i8) {
            this.f15823e = i8;
            return this;
        }

        @Deprecated
        public Builder primaryBudRole(int i8) {
            this.f15827i = i8;
            return this;
        }

        @Deprecated
        public Builder setFileIndicator(int i8) {
            return filter(true, BinParameters.FILTER_INDICATOR_ALL);
        }

        public Builder setFilePath(String str) {
            this.f15821c = str;
            return this;
        }

        public Builder setFileSuffix(String str) {
            this.f15822d = str;
            return this;
        }

        public Builder setIcCheckEnabled(boolean z7) {
            this.f15835q = z7;
            return this;
        }

        public Builder setIgnoreException(boolean z7) {
            this.f15837s = z7;
            return this;
        }

        public Builder setOtaDeviceInfo(OtaDeviceInfo otaDeviceInfo) {
            this.f15832n = otaDeviceInfo;
            return this;
        }

        public Builder setPreferredBudRole(int i8) {
            this.f15827i = i8;
            return this;
        }

        @Deprecated
        public Builder setPreferredIcType(int i8) {
            this.f15823e = i8;
            return this;
        }

        @Deprecated
        public Builder setPrimaryIcType(int i8) {
            this.f15823e = i8;
            return this;
        }

        public Builder setSectionSizeCheckEnabled(boolean z7) {
            this.f15836r = z7;
            return this;
        }

        public Builder setVersionCheckEnabled(boolean z7) {
            return versionCheckEnabled(z7);
        }

        public Builder setWorkMode(int i8) {
            this.f15838t = i8;
            return this;
        }

        public Builder sort(boolean z7) {
            return sort(z7, BinParameters.SORT_REFERENCE_ALL);
        }

        public Builder versionCheckEnabled(boolean z7) {
            this.f15833o = z7;
            return this;
        }

        public Builder vpId(int i8) {
            this.B = i8;
            return this;
        }

        public Builder with(Context context) {
            this.f15819a = context;
            return this;
        }

        public Builder sort(boolean z7, int[] iArr) {
            this.f15830l = z7;
            this.f15831m = iArr;
            return this;
        }

        public Builder versionCheckEnabled(boolean z7, int i8) {
            this.f15833o = z7;
            this.f15834p = i8;
            return this;
        }
    }

    public LoadParams(Context context, int i8, int i9, int i10, int i11, int i12, String str, String str2, boolean z7, byte[] bArr, boolean z8, int[] iArr, boolean z9, int i13, OtaDeviceInfo otaDeviceInfo, boolean z10, int i14, boolean z11, boolean z12, boolean z13, int i15, int i16, boolean z14, int i17, boolean z15, int i18, boolean z16, int i19, boolean z17) {
        this.f15793a = context;
        this.f15794b = i8;
        this.f15795c = i9;
        this.f15796d = i10;
        this.f15797e = i11;
        this.f15799g = i12;
        this.f15800h = str;
        this.f15801i = str2;
        this.f15802j = z7;
        this.f15803k = bArr;
        this.f15804l = z8;
        this.f15805m = iArr;
        this.f15814v = z9;
        this.f15815w = i13;
        this.f15806n = otaDeviceInfo;
        this.f15807o = z10;
        this.f15808p = i14;
        this.f15809q = z11;
        this.f15810r = z12;
        this.f15811s = z13;
        this.f15798f = i15;
        this.f15812t = i16;
        this.f15813u = z14;
        this.f15816x = i17;
        this.f15817y = z15;
        this.f15818z = i18;
        this.A = z16;
        this.B = i19;
        this.C = z17;
    }

    public boolean A() {
        return this.A;
    }

    public boolean B() {
        return this.f15804l;
    }

    public boolean C() {
        OtaDeviceInfo otaDeviceInfo = this.f15806n;
        return otaDeviceInfo != null && otaDeviceInfo.getUpdateMechanism() == 3;
    }

    public boolean D() {
        return this.f15807o;
    }

    public int a(int i8) {
        int[] iArr = this.f15805m;
        if (iArr == null || iArr.length <= 0 || i8 <= 0 || i8 > iArr.length - 1) {
            return 255;
        }
        return iArr[i8];
    }

    public int b() {
        return this.f15799g;
    }

    public String c() {
        return this.f15800h;
    }

    public String d() {
        return TextUtils.isEmpty(this.f15801i) ? com.realsil.sdk.dfu.k.a.FILE_SUFFIX : this.f15801i;
    }

    public byte[] e() {
        return this.f15803k;
    }

    public OtaDeviceInfo f() {
        return this.f15806n;
    }

    public int g() {
        OtaDeviceInfo otaDeviceInfo = this.f15806n;
        if (otaDeviceInfo == null) {
            return 0;
        }
        return otaDeviceInfo.specVersion;
    }

    public int h() {
        return this.f15798f;
    }

    public int i() {
        return this.f15794b;
    }

    public int j() {
        return this.f15795c;
    }

    public int k() {
        return this.f15796d;
    }

    public int l() {
        return this.f15815w;
    }

    public int m() {
        return this.f15808p;
    }

    public int n() {
        return this.B;
    }

    public int o() {
        return this.f15812t;
    }

    public boolean p() {
        return (this.f15797e & 4) == 4;
    }

    public boolean q() {
        return this.f15813u;
    }

    public boolean r() {
        return this.f15817y;
    }

    public boolean s() {
        return this.f15814v;
    }

    public boolean t() {
        return this.f15802j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LoadParams {");
        sb.append(String.format("\n\ticType=0x%02X, protocolType=0x%04X, specVersion=0x%02X", Integer.valueOf(this.f15794b), Integer.valueOf(this.f15795c), Integer.valueOf(this.f15796d)));
        sb.append(String.format("\n\tNAndFlash=%b, compress=%b, dualBank=%b, updateBank=0x%02X,singleVpPackAllowedAtDualBank=%b", Boolean.valueOf(this.C), Boolean.valueOf(this.f15817y), Boolean.valueOf(this.f15814v), Integer.valueOf(this.f15815w), Boolean.valueOf(this.A)));
        sb.append(String.format("\n\tworkMode=0x%02X, preferredFileType=0x%02X, preferredBudRole=0x%02X", Integer.valueOf(this.f15812t), Integer.valueOf(this.f15797e), Integer.valueOf(this.f15798f)));
        sb.append(String.format("\n\tlocation=0x%02X, path=%s", Integer.valueOf(this.f15799g), this.f15800h));
        if (this.f15802j) {
            sb.append(String.format("\n\tfilterIndicator=%s", DataConverter.bytes2Hex(this.f15803k)));
        }
        if (this.f15804l) {
            sb.append(String.format("\n\tsortReference=%s", Arrays.toString(this.f15805m)));
        }
        sb.append(String.format(Locale.US, "\n\tvalidate: versionCheck=%b(%d), icCheck=%b, sectionSizeCheck=%b,ignoreException=%b, dataImageValidate=%b", Boolean.valueOf(this.f15807o), Integer.valueOf(this.f15808p), Boolean.valueOf(this.f15809q), Boolean.valueOf(this.f15810r), Boolean.valueOf(this.f15811s), Boolean.valueOf(this.f15813u)));
        if (this.f15812t == 24) {
            sb.append(String.format("\n\tvpId=0x%04X", Integer.valueOf(this.B)));
        }
        sb.append("\n}");
        return sb.toString();
    }

    public boolean u() {
        return this.f15809q;
    }

    public boolean v() {
        return (this.f15797e & 8) == 8;
    }

    public boolean w() {
        return this.C;
    }

    public boolean x() {
        return (this.f15797e & 2) == 2;
    }

    public boolean y() {
        return this.f15810r;
    }

    public boolean z() {
        return (this.f15797e & 1) == 1;
    }

    public static int a(int i8, int i9) {
        return i9 >= 0 ? i9 : (i8 == 11 || i8 == 17 || i8 == 19 || i8 == 10 || i8 == 13) ? 304 : 0;
    }

    public boolean b(int i8) {
        OtaDeviceInfo otaDeviceInfo = this.f15806n;
        if (otaDeviceInfo == null) {
            return true;
        }
        int i9 = this.f15795c;
        if (i9 == 20) {
            if (this.f15796d < 2 || i8 != 2561 || !otaDeviceInfo.bootBankInfo.isBankSupported()) {
                return true;
            }
            int i10 = this.f15794b;
            if (i10 == 17 || i10 == 19) {
                return false;
            }
        } else if (i9 == 22) {
            if (i8 != 2561 || !otaDeviceInfo.bootBankInfo.isBankSupported()) {
                return true;
            }
            int i11 = this.f15794b;
            if (i11 == 17 || i11 == 19) {
                return false;
            }
        } else if (i9 == 21 && this.f15796d >= 1 && i8 == 2561 && otaDeviceInfo.bootBankInfo.isBankSupported() && this.f15794b == 15) {
            return false;
        }
        return true;
    }

    public int a(boolean z7) {
        return z7 ? this.f15818z : this.f15816x;
    }

    public Context a() {
        return this.f15793a;
    }
}
