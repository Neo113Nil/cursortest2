package com.facebook.ads.redexgen.X;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Ez, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0483Ez extends AbstractC1045aS {
    public static byte[] A00 = null;
    public static String[] A01 = {"jMc", "F9KJU5nWCxEJfH1MtrJPQ98rlg2xhqhb", "7jNlYgKw34wypv3TsOCVRM97qni1IFkS", "W5gvHzH3tQhCbbf1Q7sr07NWbFeRHxz0", "QDsxhdyObZs2LD8uuSUlwesP8VUImdt4", "RqkZZA1TQwwc7Sj8gFRGBwQRvCLKOG1p", ExifInterface.GPS_MEASUREMENT_3D, "FXFS7BhAGvbRYPXLgdilxhgSLH2Ol13Z"};
    public static final long serialVersionUID = 5751287062553772012L;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[0].length() == 16) {
                throw new RuntimeException();
            }
            A01[0] = "basKOcZiobbMvO07tra14WeVIAzrAzDF";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 105);
            i4++;
        }
    }

    public static void A04() {
        A00 = new byte[]{5, -8, Ascii.VT, 0, Ascii.CR, -4};
    }

    static {
        A04();
    }

    public C0483Ez(List<C1D> list) {
        super(list);
    }

    public static C0483Ez A02(JSONObject jSONObject, YA ya) {
        C0483Ez c0483Ez = new C0483Ez(AbstractC1045aS.A08(jSONObject, ya, new C1041aO()));
        c0483Ez.A15(jSONObject);
        c0483Ez.A0Z(A03(0, 6, 46));
        return c0483Ez;
    }

    @Override // com.facebook.ads.redexgen.X.C1C
    public final int A0F() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.C1C
    public final int A0G() {
        return 0;
    }
}
