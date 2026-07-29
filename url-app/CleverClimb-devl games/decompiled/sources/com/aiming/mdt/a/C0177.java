package com.aiming.mdt.a;

import android.content.Context;

/* renamed from: com.aiming.mdt.a.ʾʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0177 {

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static int f609 = 283;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static boolean f610 = true;

    /* renamed from: ʻʾ, reason: contains not printable characters */
    private static int f611 = 1;

    /* renamed from: ʼʾ, reason: contains not printable characters */
    private static int f613;

    /* renamed from: ʻ, reason: contains not printable characters */
    private static char[] f608 = {348, 350, 354, 315, 388, 393, 399, 398, 400, 382, 384, 394, 403, 391, 385, 386, 349, 361, 316, 356, 367};

    /* renamed from: ʽ, reason: contains not printable characters */
    private static boolean f614 = true;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static boolean f612 = false;

    /* renamed from: com.aiming.mdt.a.ʾʿ$ʽ, reason: contains not printable characters */
    public static abstract class AbstractC0178 {
        /* renamed from: ʻʽ */
        public abstract void mo591(String str);
    }

    static {
        int i = f611 + 103;
        f613 = i % 128;
        if (i % 2 == 0) {
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static String m673(int i, String str, int[] iArr, String str2) {
        int i2 = f613 + 83;
        f611 = i2 % 128;
        int i3 = i2 % 2;
        byte[] bytes = str2.getBytes("ISO-8859-1");
        char[] cArr = f608;
        int i4 = f609;
        int i5 = 0;
        if (f614) {
            int length = bytes.length;
            char[] cArr2 = new char[length];
            while (i5 < length) {
                cArr2[i5] = (char) (cArr[bytes[(length - 1) - i5] + i] - i4);
                i5++;
            }
            return new String(cArr2);
        }
        char[] cArr3 = null;
        if ((f610 ? 'A' : (char) 16) != 16) {
            int i6 = f611 + 19;
            f613 = i6 % 128;
            int i7 = i6 % 2;
            int length2 = cArr3.length;
            char[] cArr4 = new char[length2];
            int i8 = f613 + 59;
            f611 = i8 % 128;
            int i9 = i8 % 2;
            while (i5 < length2) {
                cArr4[i5] = (char) (cArr[cArr3[(length2 - 1) - i5] - i] - i4);
                i5++;
            }
            return new String(cArr4);
        }
        int length3 = cArr3.length;
        char[] cArr5 = new char[length3];
        while (true) {
            if ((i5 < length3 ? '@' : '9') != '@') {
                return new String(cArr5);
            }
            cArr5[i5] = (char) (cArr[cArr3[(length3 - 1) - i5] - i] - i4);
            i5++;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static String m674(String str, int i) {
        int i2 = f613 + 109;
        f611 = i2 % 128;
        if (i2 % 2 == 0) {
        }
        C0075.m224();
        return C0075.m223(str, i);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static synchronized void m675(Context context, int i, String str, int i2, Object obj, AbstractC0178 abstractC0178) {
        synchronized (C0177.class) {
            int i3 = f613 + 57;
            f611 = i3 % 128;
            int i4 = i3 % 2;
            C0075.m224().m229(context, i, str, i2, obj, abstractC0178);
            int i5 = f613 + 105;
            f611 = i5 % 128;
            if (i5 % 2 == 0) {
            }
        }
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static synchronized void m676(int i, String str, int i2, Object obj, AbstractC0178 abstractC0178) {
        synchronized (C0177.class) {
            int i3 = f611 + 27;
            f613 = i3 % 128;
            if (i3 % 2 != 0) {
                C0075.m224();
                C0075.m228(i, str, i2, obj, abstractC0178);
            } else {
                C0075.m224();
                C0075.m228(i, str, i2, obj, abstractC0178);
            }
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static synchronized void m677(String str, int i, String str2, int i2) {
        synchronized (C0177.class) {
            int i3 = f613 + 51;
            f611 = i3 % 128;
            int i4 = i3 % 2;
            C0075.m224();
            C0075.m226(str, i, str2, i2);
            int i5 = f613 + 93;
            f611 = i5 % 128;
            if (!(i5 % 2 != 0)) {
            }
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static boolean m678() {
        int i = f611 + 17;
        f613 = i % 128;
        int i2 = i % 2;
        boolean z = f612;
        int i3 = f613 + 95;
        f611 = i3 % 128;
        if (i3 % 2 == 0) {
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if ((r6.m499() == 0) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
    
        if (r6 == 0) goto L38;
     */
    /* renamed from: ʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m679(C0131 c0131) {
        Object obj = null;
        if (f612) {
            m673(127, null, null, "\u0088\u0088\u008b\u008a\u008a\u0089\u0088\u0084\u0087\u0085\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            C0044.m104();
            return;
        }
        if (C0195.m731().m738() == null) {
            m673(127, null, null, "\u008e\u008e\u0089\u0086\u0084\u0088\u0085\u0084\u0087\u008d\u008b\u0087\u0086\u008c\u008a\u0084\u0087\u0085\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            C0044.m104();
            return;
        }
        if ((c0131 != null ? (char) 6 : 'Z') == 'Z') {
            int i = f611 + 61;
            f613 = i % 128;
            if (i % 2 == 0) {
                m673(127, null, null, "\u008e\u008e\u0089\u0086\u0084\u0088\u0085\u0084\u0090\u0085\u008f\u0086\u008c\u008a\u0084\u0087\u0085\u0086\u0085\u0084\u0083\u0082\u0081").intern();
                C0044.m104();
                return;
            } else {
                m673(21, null, null, "\u008e\u008e\u0089\u0086\u0084\u0088\u0085\u0084\u0090\u0085\u008f\u0086\u008c\u008a\u0084\u0087\u0085\u0086\u0085\u0084\u0083\u0082\u0081").intern();
                C0044.m104();
                return;
            }
        }
        C0195.m731().m737(c0131);
        if ((!C0118.m451() ? (char) 14 : '\b') == '\b') {
            int i2 = f611 + 19;
            f613 = i2 % 128;
            int i3 = i2 % 2;
            m673(127, null, null, "\u0093\u0092\u0081\u0091\u0084\u0083\u0082\u0081").intern();
            C0044.m104();
            return;
        }
        m673(127, null, null, "\u0093\u0095\u0094\u0092\u0094\u0084\u0083\u0082\u0081").intern();
        C0044.m108();
        C0195.m731().m736(new RunnableC0072(C0040.m93()));
        if (c0131.m485() == 0) {
            int i4 = f611 + 43;
            f613 = i4 % 128;
            if (!(i4 % 2 == 0)) {
                int m499 = c0131.m499();
                super.hashCode();
            }
            C0130.m480();
            C0130.m481();
            C0070.m220();
            C0070.m221();
            f612 = true;
        }
        C0119.m456().m461();
        C0130.m480();
        C0130.m481();
        C0070.m220();
        C0070.m221();
        f612 = true;
    }
}
