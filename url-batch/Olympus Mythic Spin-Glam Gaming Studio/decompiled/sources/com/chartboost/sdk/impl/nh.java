package com.chartboost.sdk.impl;

import io.bidmachine.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class nh {
    public static final nh b = new nh(HlsMediaPlaylist.Interstitial.NAVIGATION_RESTRICTION_SKIP, 0);
    public static final nh c = new nh("CLOSE", 1);
    public static final nh d = new nh("AUTO_ADVANCE", 2);
    public static final nh e = new nh("AD_COMPLETE", 3);
    public static final nh f = new nh("FAILURE", 4);
    public static final nh g = new nh("UNLOAD", 5);
    public static final /* synthetic */ nh[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        nh[] a = a();
        h = a;
        i = EnumEntriesKt.enumEntries(a);
    }

    public static final /* synthetic */ nh[] a() {
        return new nh[]{b, c, d, e, f, g};
    }

    public static nh valueOf(String str) {
        return (nh) Enum.valueOf(nh.class, str);
    }

    public static nh[] values() {
        return (nh[]) h.clone();
    }

    public nh(String str, int i2) {
    }
}
