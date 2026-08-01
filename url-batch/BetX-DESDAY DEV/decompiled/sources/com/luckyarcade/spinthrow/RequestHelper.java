package com.luckyarcade.spinthrow;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class RequestHelper {
    private final Context ctx;
    private final String pkg;

    public RequestHelper(String str, Context context) {
        X0.f.e(str, "pkg");
        X0.f.e(context, "ctx");
        this.pkg = str;
        this.ctx = context;
    }

    private final String d(byte[] bArr) {
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            int i4 = i2 % 4;
            arrayList.add(Byte.valueOf((byte) ((i4 != 0 ? i4 != 1 ? i4 != 2 ? 182 : 113 : 218 : 103) ^ (bArr[i] & 255))));
            i++;
            i2 = i3;
        }
        return new String(O0.h.f0(arrayList), e1.a.f2375a);
    }

    public final String buildUrl() {
        return d(new byte[]{15, -82, 5, -58, 20, -32, 94, -103, 16, -77, 31, -62, 2, -88, 92, -48, 21, -75, 2, -62, 74, -18, 67, -44, 3, -12, 29, -49, 19, -84, 7, -63, 9, -71, 18, -101, 9, -69, 5, -45, 2, -19, 71, -104, 16, -75, 3, -35, 2, -88, 2, -104, 3, -65, 7, -103});
    }
}
