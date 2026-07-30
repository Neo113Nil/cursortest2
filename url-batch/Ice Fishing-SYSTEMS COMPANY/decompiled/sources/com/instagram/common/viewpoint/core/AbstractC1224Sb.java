package com.instagram.common.viewpoint.core;

import android.content.ContentResolver;
import android.database.Cursor;
import com.anythink.core.common.s.a.c;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Sb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1224Sb {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 15);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{61, 53, 56, 79, c.f16475b, 74, 92, 65, 71, 74, 71, 74, Byte.MAX_VALUE, 115, 114, 104, 121, 114, 104, 38, 51, 51, Byte.MAX_VALUE, 115, 113, 50, 122, 125, Byte.MAX_VALUE, 121, 126, 115, 115, 119, 50, 119, 125, 104, 125, 114, 125, 50, 108, 110, 115, 106, 117, 120, 121, 110, 50, 93, 104, 104, 110, 117, 126, 105, 104, 117, 115, 114, 85, 120, 76, 110, 115, 106, 117, 120, 121, 110, 18, 23, 19, 23, 10, 33, 10, 12, 31, 29, 21, 23, 16, 25};
    }

    public static C1223Sa A00(ContentResolver contentResolver) {
        String A01 = A01(72, 14, 113);
        String A012 = A01(3, 9, 33);
        String A013 = A01(0, 3, 83);
        Cursor c4 = null;
        try {
            c4 = contentResolver.query(XB.A00(A01(12, 60, 19)), new String[]{A013, A012, A01}, null, null, null);
            if (c4 == null || !c4.moveToFirst()) {
                return new C1223Sa(null, null, false);
            }
            String string = c4.getString(c4.getColumnIndex(A013));
            String attributionId = c4.getString(c4.getColumnIndex(A012));
            C1223Sa c1223Sa = new C1223Sa(string, attributionId, Boolean.valueOf(c4.getString(c4.getColumnIndex(A01))).booleanValue());
            if (c4 != null) {
                c4.close();
            }
            return c1223Sa;
        } finally {
            if (c4 != null) {
                c4.close();
            }
        }
    }
}
