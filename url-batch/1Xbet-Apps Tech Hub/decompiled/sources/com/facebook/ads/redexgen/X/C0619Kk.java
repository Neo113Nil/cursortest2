package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.Executors;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.facebook.ads.redexgen.X.Kk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0619Kk {
    public static int A00;
    public static byte[] A01;
    public static volatile EnumC0618Kj A02;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A01 = new byte[]{60, 19, Ascii.EM, Ascii.SI, Ascii.DC2, Ascii.DC4, Ascii.EM, 48, Ascii.FS, 19, Ascii.DC4, Ascii.ESC, Ascii.CAN, Ascii.SO, 9, 83, 5, 16, 17, 119, 115, 116, 73, 126, 113, 76, Byte.MAX_VALUE, 104, 105, 115, 117, 116, 2, 4, Ascii.DC2, 4, 90, 4, 19, Ascii.FS};
    }

    static {
        A07();
        A00 = -1;
        A02 = EnumC0618Kj.A04;
    }

    public static int A01(Context context) {
        if (A02 == EnumC0618Kj.A04) {
            A08(context);
        }
        return A00;
    }

    public static int A02(Context context) {
        try {
            XmlResourceParser parser = context.getAssets().openXmlResourceParser(A06(0, 19, 71));
            return A05(parser);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int A03(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).minSdkVersion;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:11:0x0027 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A05(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(A06(32, 8, 77))) {
                for (int i = 0; i < i; i++) {
                    if (xmlPullParser.getAttributeName(i).equals(A06(19, 13, 32))) {
                        int i2 = Integer.parseInt(xmlPullParser.getAttributeValue(i));
                        return i2;
                    }
                }
            }
        }
        return 0;
    }

    public static void A08(Context context) {
        if (A0A()) {
            return;
        }
        A09(context);
    }

    public static void A09(Context context) {
        if (A02 != EnumC0618Kj.A04) {
            return;
        }
        A02 = EnumC0618Kj.A03;
        Executors.newSingleThreadExecutor().execute(new U1(context));
    }

    public static boolean A0A() {
        return A02 == EnumC0618Kj.A02;
    }
}
