package com.fortuneink.neonpad;

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
            arrayList.add(Byte.valueOf((byte) ((i4 != 0 ? i4 != 1 ? i4 != 2 ? 217 : 214 : 120 : 118) ^ (bArr[i] & 255))));
            i++;
            i2 = i3;
        }
        return new String(O0.h.g0(arrayList), e1.a.f2371a);
    }

    public final String buildTarget() {
        return d(new byte[]{30, 12, -94, -87, 5, 66, -7, -10, 15, 29, -70, -75, 25, 15, -5, -83, 4, 13, -94, -79, 91, 73, -28, -23, 70, 86, -79, -81, 26, 14, -96, -70, 29, 19, -71, -12, 31, 10, -92, -96, 24, 27, -67, -78, 23, 65, -27, -9, 1, 23, -92, -78, 19, 10, -91, -9, 18, 29, -96, -10});
    }
}
