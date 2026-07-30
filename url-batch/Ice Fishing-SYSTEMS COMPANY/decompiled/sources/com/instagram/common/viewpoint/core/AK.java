package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@MetaExoPlayerCustomization("non-final in Fb vs final in Exo since TigonDataSource uses FailoverStreamDryException that extends this exception")
/* loaded from: assets/audience_network/classes2.dex */
public class AK extends C2325p5 {
    public static byte[] A04;
    public final int A00;
    public final String A01;
    public final Map<String, List<String>> A02;
    public final byte[] A03;

    static {
        A02();
    }

    public static String A01(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 101);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{16, 39, 49, 50, 45, 44, 49, 39, 98, 33, 45, 38, 39, 120, 98};
    }

    public AK(int i, String str, IOException iOException, Map<String, List<String>> map, C06595i c06595i, byte[] bArr) {
        super(A01(0, 15, 39) + i, iOException, c06595i, AdError.INTERNAL_ERROR_2004, 1);
        this.A00 = i;
        this.A01 = str;
        this.A02 = map;
        this.A03 = bArr;
    }
}
