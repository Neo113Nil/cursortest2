package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: com.yandex.mobile.ads.impl.he, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1973he extends hy1 {
    @Override // com.yandex.mobile.ads.impl.hy1
    protected final wz0 a(zz0 zz0Var, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            rf1 rf1Var = new rf1(byteBuffer.limit(), byteBuffer.array());
            rf1Var.d(12);
            int d4 = (rf1Var.d() + rf1Var.b(12)) - 4;
            rf1Var.d(44);
            rf1Var.e(rf1Var.b(12));
            rf1Var.d(16);
            ArrayList arrayList = new ArrayList();
            while (rf1Var.d() < d4) {
                rf1Var.d(48);
                int b4 = rf1Var.b(8);
                rf1Var.d(4);
                int d5 = rf1Var.d() + rf1Var.b(12);
                String str = null;
                String str2 = null;
                while (rf1Var.d() < d5) {
                    int b5 = rf1Var.b(8);
                    int b6 = rf1Var.b(8);
                    int d6 = rf1Var.d() + b6;
                    if (b5 == 2) {
                        int b7 = rf1Var.b(16);
                        rf1Var.d(8);
                        if (b7 == 3) {
                            while (rf1Var.d() < d6) {
                                str = rf1Var.a(rf1Var.b(8), un.f33181a);
                                int b8 = rf1Var.b(8);
                                for (int i4 = 0; i4 < b8; i4++) {
                                    rf1Var.e(rf1Var.b(8));
                                }
                            }
                        }
                    } else if (b5 == 21) {
                        str2 = rf1Var.a(b6, un.f33181a);
                    }
                    rf1Var.c(d6 * 8);
                }
                rf1Var.c(d5 * 8);
                if (str != null && str2 != null) {
                    arrayList.add(new C1949ge(b4, str.concat(str2)));
                }
            }
            if (!arrayList.isEmpty()) {
                return new wz0(arrayList);
            }
        }
        return null;
    }
}
