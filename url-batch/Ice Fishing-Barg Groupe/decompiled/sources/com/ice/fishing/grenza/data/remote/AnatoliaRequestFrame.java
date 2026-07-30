package com.ice.fishing.grenza.data.remote;

import defpackage.cs0;
import defpackage.h42;
import defpackage.o0;
import defpackage.th0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
@h42
/* loaded from: classes.dex */
public final class AnatoliaRequestFrame {
    public static final Companion Companion = new Companion();
    public final String PxuCJdSBwIXG;
    public final String TSizfFm2Yiuu;
    public final String lS5Rgt96tfkO;

    /* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
    public static final class Companion {
        public final KSerializer serializer() {
            return AnatoliaRequestFrame$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AnatoliaRequestFrame(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            th0.ryVscX7ZL4Ux(i, 7, AnatoliaRequestFrame$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.PxuCJdSBwIXG = str;
        this.lS5Rgt96tfkO = str2;
        this.TSizfFm2Yiuu = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnatoliaRequestFrame)) {
            return false;
        }
        AnatoliaRequestFrame anatoliaRequestFrame = (AnatoliaRequestFrame) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, anatoliaRequestFrame.PxuCJdSBwIXG) && cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, anatoliaRequestFrame.lS5Rgt96tfkO) && cs0.wdg6QnbFHrFF(this.TSizfFm2Yiuu, anatoliaRequestFrame.TSizfFm2Yiuu);
    }

    public final int hashCode() {
        return this.TSizfFm2Yiuu.hashCode() + ((this.lS5Rgt96tfkO.hashCode() + (this.PxuCJdSBwIXG.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnatoliaRequestFrame(spiceLantern=");
        sb.append(this.PxuCJdSBwIXG);
        sb.append(", bazaarSaffron=");
        sb.append(this.lS5Rgt96tfkO);
        sb.append(", copperPlatter=");
        return o0.gPXPFXrUH4XX(sb, this.TSizfFm2Yiuu, ")");
    }

    public AnatoliaRequestFrame(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.PxuCJdSBwIXG = str;
        this.lS5Rgt96tfkO = str2;
        this.TSizfFm2Yiuu = str3;
    }
}
