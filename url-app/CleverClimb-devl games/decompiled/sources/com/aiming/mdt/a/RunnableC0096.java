package com.aiming.mdt.a;

import android.os.Build;
import android.webkit.ValueCallback;

/* renamed from: com.aiming.mdt.a.ʻʿˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class RunnableC0096 implements Runnable {

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static long f284 = 9170388846522902748L;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static int f285 = 0;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static char[] f286 = {'U', 43186, 20945, 64224, 41737, 19467, 62797, 40560, 18096, 61405, 39163, 16671, 59953, 37707, 15469, 58538, 36257, 14065, 57117, 34932, 12666, 55903, 33471, 11169, 54466, 32042, 9777, 53073, 30823, 8396, 51617, 29399, 7072, 50194, 27981, 5752, 48796, 'U', 43186, 20945, 64224, 41737, 19467, 62797, 40560, 18096, 61405, 39163, 16671, 59953, 37707, 15469, 58538, 36257, 14065, 57117, 34932, 12642, 55929, 33414, 11236, 54506, 32047, 9743, 53073, 30834, 8378, 51617, 29377, 7159, 50300, 28011, 5751, 48770, 26533, 4312, 47600, 25152, 2939, 46205, 23680, 36178, 9605, 56566, 30669, 11835, 49431, 30818, 4949, 52136, 25328, 5530, 52267, 26381, 7776, 45381, 27052, 208, 48003, '\'', 43253, 8982, 35825, 29330, 55715, 32842, 28488, 54798, 48435, 26099, 52382, 48056, 25180, 51570, 45064, 7982, 51177, 44770, 5554, 64606, 43831, 4658, 63777, 41423, 2293, 63372, 24150, 1407, 60449, 23350, 989, 60152, 20878, 14508, 59249, 20059, 13675, 40339, 17598, 13266, 'U', 43186, 20945, 64224, 41737, 19481, 62812, 40557, 18060, 61340, 39167, 16657, 59940, 37756, 15465, 58503, 36267, 14077, 57119, 34865, 12670, 55917, 33413, 11169, 54400, 32025, 9770, 53062, 30847, 8350, 51698};

    /* renamed from: ʾ, reason: contains not printable characters */
    private static int f287 = 1;

    /* renamed from: ʻ, reason: contains not printable characters */
    private /* synthetic */ String f288;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    final /* synthetic */ ValueCallback f289;

    RunnableC0096(ValueCallback valueCallback, String str) {
        this.f289 = valueCallback;
        this.f288 = str;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static String m366(char c2, int i, int i2) {
        int i3 = f285 + 107;
        f287 = i3 % 128;
        int i4 = i3 % 2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (true) {
            if (i5 >= i2) {
                return new String(cArr);
            }
            int i6 = f287 + 1;
            f285 = i6 % 128;
            if ((i6 % 2 != 0 ? 'G' : (char) 0) != 0) {
                cArr[i5] = (char) ((f286[i >> i5] / (i5 % f284)) ^ c2);
                i5 += 79;
            } else {
                cArr[i5] = (char) ((f286[i + i5] ^ (i5 * f284)) ^ c2);
                i5++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0040, code lost:
    
        if ((r1 == null ? '[' : 'M') != 'M') goto L26;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        C0038 m95;
        try {
            if (Build.VERSION.SDK_INT < 19) {
                this.f289.onReceiveValue("");
                m366((char) 9027, 101, 39).intern();
                C0044.m108();
                return;
            }
            int i = f287 + 83;
            f285 = i % 128;
            if (!(i % 2 != 0)) {
                m95 = C0040.m93().m95();
                if (!(m95 == null)) {
                    m366((char) 0, 37, 44).intern();
                    C0044.m108();
                    StringBuilder sb = new StringBuilder();
                    sb.append(m366((char) 36152, 81, 18).intern());
                    sb.append(this.f288);
                    sb.append(m366((char) 0, 99, 2).intern());
                    m95.m78(sb.toString(), new C0138(this));
                    return;
                }
                int i2 = f285 + 13;
                f287 = i2 % 128;
                int i3 = i2 % 2;
                m366((char) 0, 0, 37).intern();
                C0044.m108();
                this.f289.onReceiveValue("");
                return;
            }
            m95 = C0040.m93().m95();
            Object obj = null;
            super.hashCode();
        } catch (Exception unused) {
            m366((char) 0, 140, 31).intern();
            C0044.m109();
            this.f289.onReceiveValue("");
        }
    }
}
