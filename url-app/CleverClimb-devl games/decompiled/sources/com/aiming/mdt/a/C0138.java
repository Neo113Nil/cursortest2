package com.aiming.mdt.a;

import android.os.Build;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import org.json.JSONObject;

/* renamed from: com.aiming.mdt.a.ʼʿˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0138 implements ValueCallback<String> {

    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    private static int f453 = 0;

    /* renamed from: ʼʾ, reason: contains not printable characters */
    private static int f456 = 1;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static int f457 = 1015015821;

    /* renamed from: ʻ, reason: contains not printable characters */
    private /* synthetic */ RunnableC0096 f458;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static byte[] f455 = {5, 91, -75, 106, -77, -94, -101, 7, 68, -80, -81, 85, 66, -70, 74, -76, -66, -83, 96, -77, -94, 114, -71, -73, 71, -91, 9, -33, 40, -8, -15, 114, -11, -10, 18, -42, -11, 100, 39, -45, -52, 54, 33, -39, 41, -41, -35, -50, 3, -48, -63, 17, -38, -44, 36, -58, 23, -90, -119, 108, -76, 90, -75, 82, 91, -88, -113, 17, -76, 90, 85, -78, 91, 72, -17, 111, 85, -91, -86, -109, 29, -88, -92, 92, 85, -94, -85, 84, -29, 108, -105, 28, -93, -83, 93, 95, -31, 103, 88, -86, -8, -20, -61, 33, -22, -27, 31, -20, 17, -34, 35, -29, 18, -11, -79, 95, -80, 87, 94, -83, 64, -84, 93, 22, 49, -33, -4, 102, -42, -7, 28, -60, 42, -59, 34, 43, -40, 8, -45, -35, 45, -49, -29, 100, 47, -11, -28, 109, 46, -38, -59, 63, 40, -48, 32, -34, -44, -57, 10, -39, -56, 24, -45, -35, 45, -49, -19, 32, 9, -53, 53, -56, -59, -115, 115, 48, -60, -37, 33, 54, -50, 62, -64, -54, -39, 20, -57, 54, -113, 124, -53, 61, -41, 20, -51, -61, 51, -47};

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static int f452 = 374393100;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static int f454 = 21;

    C0138(RunnableC0096 runnableC0096) {
        this.f458 = runnableC0096;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static String m525(int i, int i2, short s, byte b2, int i3) {
        int i4;
        int i5;
        StringBuilder sb = new StringBuilder();
        int i6 = f454 - 22;
        boolean z = i6 == -1;
        short[] sArr = null;
        if (z) {
            if (f455 != null) {
                i6 = (byte) (f455[f452 + i2] + f454);
                int i7 = f456 + 117;
                f453 = i7 % 128;
                int i8 = i7 % 2;
            } else {
                i6 = (short) (sArr[f452 + i2] + f454);
            }
        }
        if (i6 > 0) {
            int i9 = ((i2 + i6) - 2) + f452 + (z ? 1 : 0);
            char c2 = (char) (i3 + f457);
            sb.append(c2);
            char c3 = c2;
            int i10 = i9;
            for (int i11 = 1; i11 < i6; i11++) {
                if (f455 != null) {
                    int i12 = f456 + 27;
                    f453 = i12 % 128;
                    if (!(i12 % 2 != 0)) {
                        i4 = i10 - 1;
                        i5 = c3 + (f455[i10] ^ b2);
                    } else {
                        i4 = i10 + 72;
                        i5 = c3 - (f455[i10] ^ b2);
                    }
                    c3 = (char) i5;
                    i10 = i4;
                } else {
                    c3 = (char) (c3 + (sArr[i10] ^ b2));
                    i10--;
                }
                sb.append(c3);
            }
        }
        return sb.toString();
    }

    @Override // android.webkit.ValueCallback
    public final /* synthetic */ void onReceiveValue(String str) {
        String str2 = str;
        try {
            m525(-22, -374393100, (short) 0, (byte) -68, -1015015736).intern();
            C0044.m108();
            if (!(!TextUtils.isEmpty(str2))) {
                int i = f453 + 53;
                f456 = i % 128;
                int i2 = i % 2;
                m525(-22, -374393074, (short) 0, (byte) -33, -1015015736).intern();
                C0044.m108();
                this.f458.f289.onReceiveValue("");
                return;
            }
            JSONObject jSONObject = new JSONObject(str2);
            Class<?> cls = Class.forName(m525(-22, -374393044, (short) 0, (byte) -90, -1015015722).intern());
            Object invoke = cls.getDeclaredMethod(m525(-22, -374393000, (short) 0, (byte) -20, -1015015718).intern(), new Class[0]).invoke(cls, new Object[0]);
            WebView webView = (WebView) invoke.getClass().getDeclaredMethod(m525(-22, -374392987, (short) 0, (byte) -93, -1015015718).intern(), new Class[0]).invoke(invoke, new Object[0]);
            if ((Build.VERSION.SDK_INT > 19 ? 'S' : 'M') != 'S') {
                this.f458.f289.onReceiveValue("");
                int i3 = f453 + 75;
                f456 = i3 % 128;
                if (i3 % 2 == 0) {
                }
                return;
            }
            m525(-22, -374392977, (short) 0, (byte) -42, -1015015736).intern();
            jSONObject.getString(m525(-22, -374392934, (short) 0, (byte) 41, -1015015715).intern());
            C0044.m108();
            webView.evaluateJavascript(jSONObject.getString(m525(-22, -374392934, (short) 0, (byte) 41, -1015015715).intern()), this.f458.f289);
            int i4 = f453 + 71;
            f456 = i4 % 128;
            if (i4 % 2 == 0) {
                Object obj = null;
                super.hashCode();
            }
        } catch (Throwable unused) {
            m525(-22, -374392932, (short) 0, (byte) -56, -1015015736).intern();
            C0044.m109();
            this.f458.f289.onReceiveValue("");
        }
    }
}
