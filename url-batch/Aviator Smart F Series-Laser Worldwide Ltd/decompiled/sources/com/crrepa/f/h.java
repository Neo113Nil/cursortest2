package com.crrepa.f;

import com.crrepa.ble.util.BleLog;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f12554a = 2;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f12555b = 7;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f12556c = 8;

    /* renamed from: d, reason: collision with root package name */
    public static final byte f12557d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final byte f12558e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final byte f12559f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final byte f12560g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final byte f12561h = 3;

    /* renamed from: i, reason: collision with root package name */
    public static final byte f12562i = 4;

    /* renamed from: j, reason: collision with root package name */
    public static final byte f12563j = 4;

    /* renamed from: k, reason: collision with root package name */
    public static final byte f12564k = 3;

    private h() {
    }

    private static void a(com.crrepa.m.f fVar, byte b8, byte b9) {
        fVar.c(g.a(-69, new byte[]{2, 7, b8, b9, -1}));
    }

    public static void b(com.crrepa.m.f fVar, byte b8, String str) {
        byte[] a8 = com.crrepa.g1.c.a(str, 512, StandardCharsets.UTF_8);
        if (com.crrepa.g1.c.h(a8)) {
            return;
        }
        BleLog.d("sendHealthReportSuggestionCmd: " + com.crrepa.g1.c.c(a8));
        int i8 = 0;
        byte b9 = 1;
        while (i8 < a8.length) {
            int min = Math.min(i8 + 230, a8.length);
            a(fVar, (byte) 3, b8, Arrays.copyOfRange(a8, i8, min), b9);
            b9 = (byte) (b9 + 1);
            i8 = min;
        }
        a(fVar, (byte) 3, b8);
    }

    private static void a(com.crrepa.m.f fVar, byte b8, byte b9, byte[] bArr, byte b10) {
        byte[] bArr2 = new byte[bArr.length + 5];
        bArr2[0] = 2;
        bArr2[1] = 7;
        bArr2[2] = b8;
        bArr2[3] = b9;
        bArr2[4] = b10;
        System.arraycopy(bArr, 0, bArr2, 5, bArr.length);
        fVar.c(g.a(-69, bArr2));
    }

    public static byte[] b(int i8) {
        return g.a(-69, new byte[]{2, 7, 4, (byte) i8});
    }

    public static void a(com.crrepa.m.f fVar, byte b8, String str) {
        byte[] a8 = com.crrepa.g1.c.a(str, 512, StandardCharsets.UTF_8);
        if (com.crrepa.g1.c.h(a8)) {
            return;
        }
        BleLog.d("sendHealthAnalysisSuggestionCmd: " + com.crrepa.g1.c.c(a8));
        int i8 = 0;
        byte b9 = 1;
        while (i8 < a8.length) {
            int min = Math.min(i8 + 230, a8.length);
            a(fVar, (byte) 1, b8, Arrays.copyOfRange(a8, i8, min), b9);
            b9 = (byte) (b9 + 1);
            i8 = min;
        }
        a(fVar, (byte) 1, b8);
    }

    public static byte[] b(int i8, String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        byte[] bArr = new byte[bytes.length + 4];
        bArr[0] = 2;
        bArr[1] = 7;
        bArr[2] = 3;
        bArr[3] = (byte) i8;
        System.arraycopy(bytes, 0, bArr, 4, bytes.length);
        return g.a(-69, bArr);
    }

    public static byte[] a(int i8) {
        return g.a(-69, new byte[]{2, 7, 2, (byte) i8});
    }

    public static byte[] a(int i8, String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        byte[] bArr = new byte[bytes.length + 4];
        bArr[0] = 2;
        bArr[1] = 7;
        bArr[2] = 1;
        bArr[3] = (byte) i8;
        System.arraycopy(bytes, 0, bArr, 4, bytes.length);
        return g.a(-69, bArr);
    }
}
