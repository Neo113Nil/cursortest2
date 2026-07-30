package com.ice.fishing.grenza.data.remote;

import defpackage.cs0;
import defpackage.h42;
import defpackage.o0;
import defpackage.pa2;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
@h42
/* loaded from: classes.dex */
public final class AnatoliaTablePayload {
    public static final Companion Companion = new Companion();
    public final int PxuCJdSBwIXG;
    public final String RAsUl2FVSrh6;
    public final int TSizfFm2Yiuu;
    public final boolean Y1f8riQaR6yg;
    public final double a92UlCVFR9N8;
    public final int e9gEMXR7LXtO;
    public final int lS5Rgt96tfkO;

    /* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
    public static final class Companion {
        public final KSerializer serializer() {
            return AnatoliaTablePayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AnatoliaTablePayload(int i, int i2, int i3, int i4, boolean z, int i5, double d, String str) {
        if ((i & 1) == 0) {
            this.PxuCJdSBwIXG = 0;
        } else {
            this.PxuCJdSBwIXG = i2;
        }
        if ((i & 2) == 0) {
            this.lS5Rgt96tfkO = 0;
        } else {
            this.lS5Rgt96tfkO = i3;
        }
        if ((i & 4) == 0) {
            this.TSizfFm2Yiuu = 0;
        } else {
            this.TSizfFm2Yiuu = i4;
        }
        if ((i & 8) == 0) {
            this.Y1f8riQaR6yg = false;
        } else {
            this.Y1f8riQaR6yg = z;
        }
        if ((i & 16) == 0) {
            this.e9gEMXR7LXtO = 0;
        } else {
            this.e9gEMXR7LXtO = i5;
        }
        if ((i & 32) == 0) {
            this.a92UlCVFR9N8 = 0.0d;
        } else {
            this.a92UlCVFR9N8 = d;
        }
        if ((i & 64) == 0) {
            this.RAsUl2FVSrh6 = "";
        } else {
            this.RAsUl2FVSrh6 = str;
        }
    }

    public final String PxuCJdSBwIXG() {
        Object subSequence;
        String str = this.RAsUl2FVSrh6;
        if (pa2.yQRudnv4La6p(str, "http://", false) || pa2.yQRudnv4La6p(str, "https://", false) || !str.equals("{{OFFER_URL}}")) {
            return str;
        }
        char[] cArr = {'/'};
        int i = 37;
        while (true) {
            int i2 = i - 1;
            char charAt = "https://eternalsiegeapplication.space/".charAt(i);
            int i3 = 0;
            while (true) {
                if (i3 >= 1) {
                    i3 = -1;
                    break;
                }
                if (charAt == cArr[i3]) {
                    break;
                }
                i3++;
            }
            if (i3 < 0) {
                subSequence = "https://eternalsiegeapplication.space/".subSequence(0, i + 1);
                break;
            }
            if (i2 < 0) {
                subSequence = "";
                break;
            }
            i = i2;
        }
        return subSequence.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnatoliaTablePayload)) {
            return false;
        }
        AnatoliaTablePayload anatoliaTablePayload = (AnatoliaTablePayload) obj;
        return this.PxuCJdSBwIXG == anatoliaTablePayload.PxuCJdSBwIXG && this.lS5Rgt96tfkO == anatoliaTablePayload.lS5Rgt96tfkO && this.TSizfFm2Yiuu == anatoliaTablePayload.TSizfFm2Yiuu && this.Y1f8riQaR6yg == anatoliaTablePayload.Y1f8riQaR6yg && this.e9gEMXR7LXtO == anatoliaTablePayload.e9gEMXR7LXtO && Double.compare(this.a92UlCVFR9N8, anatoliaTablePayload.a92UlCVFR9N8) == 0 && cs0.wdg6QnbFHrFF(this.RAsUl2FVSrh6, anatoliaTablePayload.RAsUl2FVSrh6);
    }

    public final int hashCode() {
        return this.RAsUl2FVSrh6.hashCode() + ((Double.hashCode(this.a92UlCVFR9N8) + o0.lS5Rgt96tfkO(this.e9gEMXR7LXtO, o0.Y1f8riQaR6yg(o0.lS5Rgt96tfkO(this.TSizfFm2Yiuu, o0.lS5Rgt96tfkO(this.lS5Rgt96tfkO, Integer.hashCode(this.PxuCJdSBwIXG) * 31, 31), 31), 31, this.Y1f8riQaR6yg), 31)) * 31);
    }

    public final boolean lS5Rgt96tfkO() {
        String str = this.RAsUl2FVSrh6;
        return cs0.wdg6QnbFHrFF(str, "{{OFFER_URL}}") || pa2.yQRudnv4La6p(str, "http://", false) || pa2.yQRudnv4La6p(str, "https://", false);
    }

    public final String toString() {
        return "AnatoliaTablePayload(dishCollection=" + this.PxuCJdSBwIXG + ", regionSelection=" + this.lS5Rgt96tfkO + ", nutritionLevel=" + this.TSizfFm2Yiuu + ", scoreVisible=" + this.Y1f8riQaR6yg + ", signatureChoice=" + this.e9gEMXR7LXtO + ", feastHarmony=" + this.a92UlCVFR9N8 + ", tableStory=" + this.RAsUl2FVSrh6 + ")";
    }
}
