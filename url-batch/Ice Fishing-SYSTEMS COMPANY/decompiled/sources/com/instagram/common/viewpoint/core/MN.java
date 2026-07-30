package com.instagram.common.viewpoint.core;

import com.anythink.basead.ui.f.d;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;

@MetaExoPlayerCustomization
/* loaded from: assets/audience_network/classes2.dex */
public enum MN {
    A05,
    A04,
    A06,
    A03;

    public static byte[] A00;
    public static String[] A01 = {"YGvusjMOvw", "XxhXqbssDzTPx8cD", "v5f5FK7FNpA1cfN1ohQEtzmA1XlLSzXE", "dOnhpxcme8C8DMHJdbJ1zsQXlaw", "o8NFvW23E6YML82dyv2qOnj4D0AhAt32", "sFvB7Juf2T", "FilLqBnJ3Dc1fTgDAzXDzQr78D6tohNx", "1sAmBYm9v"};

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            byte b9 = copyOfRange[i10];
            String[] strArr = A01;
            if (strArr[7].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A01[1] = "k0Ctdizy0CSYjdQTYuro";
            copyOfRange[i10] = (byte) ((b9 - i9) + d.f10958c);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{11, 16, 11, 22, 33, 21, 7, 9, 15, 7, 16, 22, -27, -31, -42, -18, -41, -42, -40, -32, -39, -37, -50, -49, -50, -35, -52, -47, -10, -17, -20, -17, -16, -8, -17};
    }

    static {
        A01();
    }
}
