package com.realsil.sdk.dfu.i;

import com.realsil.sdk.dfu.image.wrapper.SocImageWrapper;
import java.util.Locale;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes4.dex */
public abstract class a {
    public static final int FORMAT_TYPE_BIN_ID = 2;
    public static final int FORMAT_TYPE_BIT_NUMBER = 1;
    public static final int FORMAT_TYPE_CUSTOMIZED = 3;
    public static final int FORMAT_TYPE_DEFAULT = 0;
    public static final long INVALID_VERSION_32 = 4294967295L;
    public static final long INVALID_VERSION_64 = -1;

    /* renamed from: a, reason: collision with root package name */
    public int f15775a;

    /* renamed from: b, reason: collision with root package name */
    public long f15776b;

    /* renamed from: c, reason: collision with root package name */
    public int f15777c;

    /* renamed from: d, reason: collision with root package name */
    public int f15778d;

    /* renamed from: e, reason: collision with root package name */
    public int f15779e;

    /* renamed from: f, reason: collision with root package name */
    public int f15780f;

    /* renamed from: g, reason: collision with root package name */
    public String f15781g;

    /* renamed from: h, reason: collision with root package name */
    public String f15782h = "";

    /* renamed from: i, reason: collision with root package name */
    public String f15783i = "";

    public void a(int i8) {
        String valueOf;
        if (i8 == 517) {
            long j8 = this.f15776b;
            int i9 = (int) ((j8 >> 24) & 255);
            this.f15777c = i9;
            this.f15778d = (int) ((j8 >> 16) & 255);
            this.f15779e = (int) ((j8 >> 8) & 255);
            this.f15780f = (int) (255 & j8);
            valueOf = String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf(i9), Integer.valueOf(this.f15778d), Integer.valueOf(this.f15779e), Integer.valueOf(this.f15780f));
        } else if (i8 == 518) {
            long j9 = this.f15776b;
            int i10 = (int) ((j9 >> 56) & 255);
            this.f15777c = i10;
            this.f15778d = (int) (255 & (j9 >> 48));
            this.f15779e = (int) ((j9 >> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
            this.f15780f = (int) (INVALID_VERSION_32 & j9);
            valueOf = String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf(i10), Integer.valueOf(this.f15778d), Integer.valueOf(this.f15779e), Integer.valueOf(this.f15780f));
        } else {
            long j10 = this.f15776b;
            this.f15777c = (int) j10;
            this.f15778d = 0;
            this.f15779e = 0;
            this.f15780f = 0;
            valueOf = String.valueOf(j10);
        }
        this.f15781g = valueOf;
    }

    public void b(boolean z7) {
        String valueOf;
        long j8 = this.f15776b;
        if (z7) {
            int i8 = (int) (j8 & 255);
            this.f15777c = i8;
            this.f15778d = (int) ((j8 >> 8) & 255);
            this.f15779e = (int) ((j8 >> 16) & 255);
            this.f15780f = (int) ((j8 >> 24) & 255);
            valueOf = String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf(i8), Integer.valueOf(this.f15778d), Integer.valueOf(this.f15779e), Integer.valueOf(this.f15780f));
        } else {
            this.f15777c = (int) j8;
            this.f15778d = 0;
            this.f15779e = 0;
            this.f15780f = 0;
            valueOf = String.valueOf(j8);
        }
        this.f15781g = valueOf;
    }

    public int compare(SocImageWrapper socImageWrapper) {
        if (this.f15777c > socImageWrapper.getMajor()) {
            return 1;
        }
        if (this.f15777c < socImageWrapper.getMajor()) {
            return -1;
        }
        if (this.f15778d > socImageWrapper.getMinor()) {
            return 1;
        }
        if (this.f15778d < socImageWrapper.getMinor()) {
            return -1;
        }
        if (this.f15779e > socImageWrapper.getRevision()) {
            return 1;
        }
        if (this.f15779e < socImageWrapper.getRevision()) {
            return -1;
        }
        if (this.f15780f > socImageWrapper.getBuildNumber()) {
            return 1;
        }
        return this.f15780f == socImageWrapper.getBuildNumber() ? 0 : -1;
    }

    public int getBuildNumber() {
        return this.f15780f;
    }

    public String getFlashLayoutName() {
        return this.f15782h;
    }

    public String getFormattedVersion() {
        return this.f15781g;
    }

    public int getIcType() {
        return this.f15775a;
    }

    public String getImageFeature() {
        return this.f15783i;
    }

    public long getImageVersion() {
        return this.f15776b;
    }

    public int getMajor() {
        return this.f15777c;
    }

    public int getMinor() {
        return this.f15778d;
    }

    public int getRevision() {
        return this.f15779e;
    }

    public void a(boolean z7) {
        String valueOf;
        long j8 = this.f15776b;
        if (z7) {
            int i8 = (int) (15 & j8);
            this.f15777c = i8;
            this.f15778d = (int) ((j8 >> 4) & 255);
            this.f15779e = (int) ((j8 >> 12) & 32767);
            this.f15780f = (int) ((j8 >> 27) & 31);
            valueOf = String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf(i8), Integer.valueOf(this.f15778d), Integer.valueOf(this.f15779e), Integer.valueOf(this.f15780f));
        } else {
            this.f15777c = (int) j8;
            this.f15778d = 0;
            this.f15779e = 0;
            this.f15780f = 0;
            valueOf = String.valueOf(j8);
        }
        this.f15781g = valueOf;
    }
}
