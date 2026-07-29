package com.aiming.mdt.a;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.aiming.mdt.a.ʼʿˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class RejectedExecutionHandlerC0141 implements RejectedExecutionHandler {

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static int f460 = 284;

    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    private static int f461 = 1;

    /* renamed from: ʻʾ, reason: contains not printable characters */
    private static int f463 = 0;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static boolean f465 = true;

    /* renamed from: ʻ, reason: contains not printable characters */
    private /* synthetic */ C0057 f466;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static char[] f462 = {353, 404, 385, 383, 401, 400, 395, 398, 316, 366, 390, 384};

    /* renamed from: ʼ, reason: contains not printable characters */
    private static boolean f464 = true;

    RejectedExecutionHandlerC0141(C0057 c0057) {
        this.f466 = c0057;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static String m537(String str, int[] iArr, int i, String str2) {
        int length;
        char[] cArr;
        int length2;
        char[] cArr2;
        int i2 = f461 + 89;
        f463 = i2 % 128;
        char[] cArr3 = null;
        if (i2 % 2 != 0) {
            super.hashCode();
        }
        byte[] bytes = str2.getBytes("ISO-8859-1");
        char[] cArr4 = f462;
        int i3 = f460;
        int i4 = 0;
        if (!f464) {
            if (!(f465)) {
                int length3 = cArr3.length;
                char[] cArr5 = new char[length3];
                while (i4 < length3) {
                    int i5 = f461 + 125;
                    f463 = i5 % 128;
                    int i6 = i5 % 2;
                    cArr5[i4] = (char) (cArr4[cArr3[(length3 - 1) - i4] - i] - i3);
                    i4++;
                }
                return new String(cArr5);
            }
            int i7 = f463 + 39;
            f461 = i7 % 128;
            if ((i7 % 2 == 0 ? 'X' : 'B') != 'X') {
                length = cArr3.length;
                cArr = new char[length];
            } else {
                length = cArr3.length;
                cArr = new char[length];
                i4 = 1;
            }
            while (i4 < length) {
                cArr[i4] = (char) (cArr4[cArr3[(length - 1) - i4] - i] - i3);
                i4++;
            }
            String str3 = new String(cArr);
            int i8 = f463 + 113;
            f461 = i8 % 128;
            if (i8 % 2 == 0) {
            }
            return str3;
        }
        int i9 = f463 + 59;
        f461 = i9 % 128;
        if (i9 % 2 == 0) {
            length2 = bytes.length;
            cArr2 = new char[length2];
            i4 = 1;
        } else {
            length2 = bytes.length;
            cArr2 = new char[length2];
        }
        while (true) {
            if ((i4 < length2 ? 'Z' : 'a') == 'a') {
                return new String(cArr2);
            }
            int i10 = f463 + 87;
            f461 = i10 % 128;
            if ((i10 % 2 == 0 ? '4' : 'Z') != 'Z') {
                cArr2[i4] = (char) (cArr4[bytes[(length2 - 1) + i4] << i] + i3);
                i4 += 42;
            } else {
                cArr2[i4] = (char) (cArr4[bytes[(length2 - 1) - i4] + i] - i3);
                i4++;
            }
        }
    }

    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        int i = f463 + 121;
        f461 = i % 128;
        m537(null, null, (i % 2 == 0 ? '&' : (char) 7) != 7 ? 46 : 127, "\u008c\u0083\u0086\u0084\u0083\u008b\u0083\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        C0044.m104();
        C0057.m176(this.f466).rejectedExecution(runnable, threadPoolExecutor);
    }
}
