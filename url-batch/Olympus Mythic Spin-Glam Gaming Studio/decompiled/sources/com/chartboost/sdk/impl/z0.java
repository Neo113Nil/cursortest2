package com.chartboost.sdk.impl;

import io.bidmachine.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class z0 {
    public static final z0 b = new z0("INFO", 0);
    public static final z0 c = new z0("VOLUME", 1);
    public static final z0 d = new z0("CLOSE", 2);
    public static final z0 e = new z0(HlsMediaPlaylist.Interstitial.NAVIGATION_RESTRICTION_SKIP, 3);
    public static final z0 f = new z0("TIMER", 4);
    public static final z0 g = new z0("CTA", 5);
    public static final z0 h = new z0("REWARD", 6);
    public static final /* synthetic */ z0[] i;
    public static final /* synthetic */ EnumEntries j;

    static {
        z0[] a = a();
        i = a;
        j = EnumEntriesKt.enumEntries(a);
    }

    public static final /* synthetic */ z0[] a() {
        return new z0[]{b, c, d, e, f, g, h};
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) i.clone();
    }

    public z0(String str, int i2) {
    }
}
