package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.UUID;

/* loaded from: classes.dex */
public final class jc {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f7075a = "0123456789abcdef".toCharArray();

    public static long a(double d7, int i7, DisplayMetrics displayMetrics) {
        double d8 = displayMetrics.density;
        Double.isNaN(d8);
        return Math.round(d7 / d8);
    }

    public static Activity b(View view) {
        View rootView = view.getRootView();
        if (rootView != null) {
            view = rootView;
        }
        Context context = view.getContext();
        for (int i7 = 0; (context instanceof ContextWrapper) && i7 < 10; i7++) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static String c(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        for (int i7 = 0; i7 < bArr.length; i7++) {
            int i8 = bArr[i7] & 255;
            int i9 = i7 + i7;
            char[] cArr2 = f7075a;
            cArr[i9] = cArr2[i8 >>> 4];
            cArr[i9 + 1] = cArr2[i8 & 15];
        }
        return new String(cArr);
    }

    public static String d(String str) {
        if (str == null || !str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            return str;
        }
        UUID fromString = UUID.fromString(str);
        byte[] bArr = new byte[16];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(fromString.getMostSignificantBits());
        wrap.putLong(fromString.getLeastSignificantBits());
        return q9.a(bArr, true);
    }

    public static String e(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static boolean f() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean g(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean h(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    public static byte[] i(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("String must be of even-length");
        }
        byte[] bArr = new byte[length / 2];
        for (int i7 = 0; i7 < length; i7 += 2) {
            bArr[i7 / 2] = (byte) ((Character.digit(str.charAt(i7), 16) << 4) + Character.digit(str.charAt(i7 + 1), 16));
        }
        return bArr;
    }
}
