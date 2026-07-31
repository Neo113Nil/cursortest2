package com.yandex.mobile.ads.impl;

import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class j11 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static va2 a() {
        int i4;
        int i5;
        int i6 = 0;
        String[] strArr = (String[]) StringsKt.split$default("7.15.0", new String[]{"."}, false, 0, 6, null).toArray(new String[0]);
        if (strArr.length > 0) {
            String str = strArr[0];
            int i7 = C2362y9.f34935b;
            if (str != null) {
                try {
                    i4 = Integer.parseInt(str);
                } catch (NumberFormatException unused) {
                }
                if (strArr.length > 1) {
                    String str2 = strArr[1];
                    int i8 = C2362y9.f34935b;
                    if (str2 != null) {
                        try {
                            i5 = Integer.parseInt(str2);
                        } catch (NumberFormatException unused2) {
                        }
                        if (strArr.length > 2) {
                            String str3 = strArr[2];
                            int i9 = C2362y9.f34935b;
                            if (str3 != null) {
                                try {
                                    i6 = Integer.parseInt(str3);
                                } catch (NumberFormatException unused3) {
                                }
                            }
                        }
                        return new va2(i4, i5, i6);
                    }
                }
                i5 = 0;
                if (strArr.length > 2) {
                }
                return new va2(i4, i5, i6);
            }
        }
        i4 = 0;
        if (strArr.length > 1) {
        }
        i5 = 0;
        if (strArr.length > 2) {
        }
        return new va2(i4, i5, i6);
    }
}
