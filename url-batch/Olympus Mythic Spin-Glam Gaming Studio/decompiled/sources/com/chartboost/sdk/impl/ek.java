package com.chartboost.sdk.impl;

import com.pubmatic.sdk.omsdk.POBOMSDKLogConstants;
import io.bidmachine.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class ek {
    public static final ek b = new ek(POBOMSDKLogConstants.MSG_OMSDK_START_EVENT, 0);
    public static final ek c = new ek("RESUME", 1);
    public static final ek d = new ek("PAUSE", 2);
    public static final ek e = new ek("BUFFER_START", 3);
    public static final ek f = new ek("BUFFER_END", 4);
    public static final ek g = new ek("QUARTILE1", 5);
    public static final ek h = new ek("MIDPOINT", 6);
    public static final ek i = new ek("QUARTILE3", 7);
    public static final ek j = new ek("COMPLETED", 8);
    public static final ek k = new ek(HlsMediaPlaylist.Interstitial.NAVIGATION_RESTRICTION_SKIP, 9);
    public static final ek l = new ek("VOLUME_CHANGE", 10);
    public static final /* synthetic */ ek[] m;
    public static final /* synthetic */ EnumEntries n;

    static {
        ek[] a = a();
        m = a;
        n = EnumEntriesKt.enumEntries(a);
    }

    public static final /* synthetic */ ek[] a() {
        return new ek[]{b, c, d, e, f, g, h, i, j, k, l};
    }

    public static ek valueOf(String str) {
        return (ek) Enum.valueOf(ek.class, str);
    }

    public static ek[] values() {
        return (ek[]) m.clone();
    }

    public ek(String str, int i2) {
    }
}
