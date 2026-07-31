package com.chartboost.sdk.impl;

import com.iab.omid.library.chartboost.adsession.FriendlyObstructionPurpose;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class gl {
    public static final gl d;
    public static final gl e;
    public static final gl f;
    public static final gl g;
    public static final gl h;
    public static final gl i;
    public static final gl j;
    public static final gl k;
    public static final gl l;
    public static final /* synthetic */ gl[] m;
    public static final /* synthetic */ EnumEntries n;
    public final FriendlyObstructionPurpose b;
    public final String c;

    static {
        FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.VIDEO_CONTROLS;
        d = new gl("VIDEO_CONTROLS", 0, friendlyObstructionPurpose, "Video Controls");
        e = new gl("CLOSE_BUTTON", 1, FriendlyObstructionPurpose.CLOSE_AD, "Close Button");
        FriendlyObstructionPurpose friendlyObstructionPurpose2 = FriendlyObstructionPurpose.OTHER;
        f = new gl("CTA_BUTTON", 2, friendlyObstructionPurpose2, "CTA Button");
        g = new gl("SKIP_BUTTON", 3, friendlyObstructionPurpose, "Skip Button");
        h = new gl("INDUSTRY_ICON", 4, friendlyObstructionPurpose2, "Industry Icon");
        i = new gl("COUNTDOWN_TIMER", 5, friendlyObstructionPurpose2, "Countdown Timer");
        j = new gl("OVERLAY", 6, FriendlyObstructionPurpose.NOT_VISIBLE, "Overlay");
        k = new gl("BLUR", 7, friendlyObstructionPurpose2, "Blur");
        l = new gl("MUTE_BUTTON", 8, friendlyObstructionPurpose, "Mute Button");
        gl[] a = a();
        m = a;
        n = EnumEntriesKt.enumEntries(a);
    }

    public static final /* synthetic */ gl[] a() {
        return new gl[]{d, e, f, g, h, i, j, k, l};
    }

    public static gl valueOf(String str) {
        return (gl) Enum.valueOf(gl.class, str);
    }

    public static gl[] values() {
        return (gl[]) m.clone();
    }

    public gl(String str, int i2, FriendlyObstructionPurpose friendlyObstructionPurpose, String str2) {
        this.b = friendlyObstructionPurpose;
        this.c = str2;
    }

    public final FriendlyObstructionPurpose c() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }
}
