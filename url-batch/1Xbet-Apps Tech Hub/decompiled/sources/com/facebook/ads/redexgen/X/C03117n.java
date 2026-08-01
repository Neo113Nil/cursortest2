package com.facebook.ads.redexgen.X;

import android.os.Process;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.lang.Thread;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.7n, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03117n implements Thread.UncaughtExceptionHandler {
    public static byte[] A04;
    public final Y9 A00;
    public final InterfaceC03177u A01;
    public final Thread.UncaughtExceptionHandler A02;
    public final Map<String, String> A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 65);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{42, Ascii.FS, 94, 122, 96, 96, 122, 125, 116, 51, 80, 124, 125, 103, 118, 107, 103, Ascii.VT, 7, 5, 70, Ascii.SO, 9, Ascii.VT, Ascii.CR, 10, 7, 7, 3, 70, 9, Ascii.FF, Ascii.ESC, 71, 86, 69, 87, 76, Ascii.DC4, Ascii.DC2, 5, 19, Ascii.RS, Ascii.ETB, 2, 80, 86, 65, 87, 90, 83, 70, 124, 64, 76, 71, 70};
    }

    public C03117n(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Y9 y9, InterfaceC03107m interfaceC03107m) {
        this(uncaughtExceptionHandler, y9, interfaceC03107m, C03187v.A00());
    }

    public C03117n(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Y9 y9, InterfaceC03107m interfaceC03107m, InterfaceC03177u interfaceC03177u) {
        this.A02 = uncaughtExceptionHandler;
        if (y9 != null) {
            this.A00 = y9;
            this.A03 = interfaceC03107m.A7r(y9);
            this.A01 = interfaceC03177u;
            return;
        }
        throw new IllegalArgumentException(A00(2, 15, 82));
    }

    public static void A02() {
        try {
            Process.killProcess(Process.myPid());
        } catch (Throwable unused) {
        }
        try {
            System.exit(10);
        } catch (Throwable unused2) {
        }
    }

    private void A03(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.A02;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            A02();
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            String A03 = LD.A03(this.A00, th);
            if (!TextUtils.isEmpty(A03)) {
                String stackTraceString = A00(17, 16, 41);
                if (A03.contains(stackTraceString)) {
                    Map<String, String> A02 = new C03097l(A03, this.A03).A02();
                    String A00 = A00(38, 7, 38);
                    String stackTraceString2 = A00(33, 5, 101);
                    A02.put(A00, stackTraceString2);
                    Throwable A002 = AbstractRunnableC0604Jv.A00();
                    String A003 = A00(45, 12, 98);
                    if (A002 != th) {
                        String stackTraceString3 = A00(0, 1, 91);
                        A02.put(A003, stackTraceString3);
                    } else {
                        String stackTraceString4 = A00(1, 1, 108);
                        A02.put(A003, stackTraceString4);
                    }
                    this.A01.AGU(new AnonymousClass81(this.A00.A08().A01(), this.A00.A08().A02(), A02), this.A00);
                    if (IP.A1g(this.A00)) {
                        IP.A0d(this.A00);
                    }
                }
            }
        } catch (Exception unused) {
        }
        A03(thread, th);
    }
}
