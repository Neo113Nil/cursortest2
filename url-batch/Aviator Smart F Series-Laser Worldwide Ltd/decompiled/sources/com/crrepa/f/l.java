package com.crrepa.f;

import com.crrepa.ble.conn.bean.CRPJieliWatchFaceLayoutInfo;
import com.crrepa.ble.conn.bean.CRPWatchFaceLayoutInfo;
import com.crrepa.ble.conn.type.CRPChatErrorCode;
import com.crrepa.ble.util.BleLog;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f12629a = 2;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f12630b = 3;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f12631c = 4;

    /* renamed from: d, reason: collision with root package name */
    public static final byte f12632d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final byte f12633e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final byte f12634f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final byte f12635g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final byte f12636h = 6;

    /* renamed from: i, reason: collision with root package name */
    public static final byte f12637i = 7;

    /* renamed from: j, reason: collision with root package name */
    public static final byte f12638j = 9;

    /* renamed from: k, reason: collision with root package name */
    public static final byte f12639k = 13;

    /* renamed from: l, reason: collision with root package name */
    public static final byte f12640l = 14;

    /* renamed from: m, reason: collision with root package name */
    public static final byte f12641m = 16;

    /* renamed from: n, reason: collision with root package name */
    public static final byte f12642n = 17;

    /* renamed from: o, reason: collision with root package name */
    private static final byte f12643o = 2;

    /* renamed from: p, reason: collision with root package name */
    public static final byte f12644p = 5;

    /* renamed from: q, reason: collision with root package name */
    public static final byte f12645q = 8;

    /* renamed from: r, reason: collision with root package name */
    public static final byte f12646r = 15;

    /* renamed from: s, reason: collision with root package name */
    public static final byte f12647s = -1;

    /* renamed from: t, reason: collision with root package name */
    public static final byte f12648t = 18;

    /* renamed from: u, reason: collision with root package name */
    public static final byte f12649u = 19;

    /* renamed from: v, reason: collision with root package name */
    public static final byte f12650v = 20;

    /* renamed from: w, reason: collision with root package name */
    public static final byte f12651w = 21;

    private l() {
    }

    public static byte[] a() {
        return g.a(-69, new byte[]{2, 3, 21});
    }

    public static byte[] b() {
        return g.a(-69, new byte[]{2, 3, 18});
    }

    public static byte[] c() {
        return g.a(-69, new byte[]{2, 3, 20});
    }

    public static byte[] d() {
        return g.a(-69, new byte[]{2, 3, 17});
    }

    public static byte[] e() {
        return g.a(-69, new byte[]{2, 3, -1});
    }

    public static byte[] f() {
        return g.a(-69, new byte[]{2, 3, 2});
    }

    public static byte[] a(int i8, boolean z7) {
        byte[] c8 = com.crrepa.g1.c.c(i8);
        byte[] bArr = new byte[c8.length + 3];
        bArr[0] = 2;
        bArr[1] = 3;
        if (z7) {
            bArr[2] = 7;
        } else {
            bArr[2] = 13;
        }
        System.arraycopy(c8, 0, bArr, 3, c8.length);
        return g.a(-69, bArr);
    }

    public static byte[] a(CRPJieliWatchFaceLayoutInfo cRPJieliWatchFaceLayoutInfo) {
        BleLog.i("sendAiPhotoWatchFaceLayoutCmd: " + cRPJieliWatchFaceLayoutInfo);
        byte[] bArr = new byte[31];
        bArr[0] = 2;
        bArr[1] = 3;
        bArr[2] = 19;
        bArr[3] = cRPJieliWatchFaceLayoutInfo.getWatchFaceType().getValue();
        bArr[4] = cRPJieliWatchFaceLayoutInfo.isShowPointer();
        bArr[5] = cRPJieliWatchFaceLayoutInfo.getPhotoDisplayMode().getValue();
        bArr[6] = cRPJieliWatchFaceLayoutInfo.getFixedPhotoIndex();
        int elementColor = cRPJieliWatchFaceLayoutInfo.getElementColor();
        bArr[7] = (byte) ((elementColor >> 24) & 255);
        bArr[8] = (byte) ((elementColor >> 16) & 255);
        bArr[9] = (byte) ((elementColor >> 8) & 255);
        bArr[10] = (byte) (elementColor & 255);
        int i8 = 11;
        for (CRPJieliWatchFaceLayoutInfo.ElementBean elementBean : cRPJieliWatchFaceLayoutInfo.getElementArray()) {
            bArr[i8] = elementBean.getType();
            byte[] a8 = com.crrepa.g1.c.a(elementBean.getX());
            bArr[i8 + 1] = a8[0];
            bArr[i8 + 2] = a8[1];
            byte[] a9 = com.crrepa.g1.c.a(elementBean.getY());
            int i9 = i8 + 4;
            bArr[i8 + 3] = a9[0];
            i8 += 5;
            bArr[i9] = a9[1];
        }
        return g.a(-69, bArr);
    }

    public static byte[] a(CRPWatchFaceLayoutInfo cRPWatchFaceLayoutInfo) {
        byte[] bArr = new byte[40];
        bArr[0] = 2;
        bArr[1] = 3;
        bArr[2] = 16;
        bArr[3] = (byte) cRPWatchFaceLayoutInfo.getTimePosition();
        bArr[4] = (byte) cRPWatchFaceLayoutInfo.getTimeTopContent();
        bArr[5] = (byte) cRPWatchFaceLayoutInfo.getTimeBottomContent();
        int a8 = com.crrepa.g1.n.a(cRPWatchFaceLayoutInfo.getTextColor());
        BleLog.i("colorInt: " + a8);
        byte[] b8 = com.crrepa.g1.c.b(a8);
        System.arraycopy(b8, 0, bArr, 6, b8.length);
        byte[] bArr2 = new byte[32];
        String backgroundPictureMd5 = cRPWatchFaceLayoutInfo.getBackgroundPictureMd5();
        int length = backgroundPictureMd5.length();
        for (int i8 = 0; i8 < length; i8++) {
            bArr2[i8] = com.crrepa.g1.c.a(backgroundPictureMd5.charAt(i8));
        }
        System.arraycopy(bArr2, 0, bArr, 8, length);
        return g.a(-69, bArr);
    }

    public static byte[] a(CRPChatErrorCode cRPChatErrorCode) {
        return g.a(-69, new byte[]{2, 3, cRPChatErrorCode.getValue()});
    }

    public static byte[] a(String str) {
        byte[] a8 = com.crrepa.g1.c.a(str, 240, StandardCharsets.UTF_8);
        if (com.crrepa.g1.c.h(a8)) {
            return null;
        }
        byte[] bArr = new byte[a8.length + 3];
        bArr[0] = 2;
        bArr[1] = 3;
        bArr[2] = 5;
        System.arraycopy(a8, 0, bArr, 3, a8.length);
        return g.a(-69, bArr);
    }

    public static byte[] a(boolean z7, boolean z8) {
        byte[] bArr = new byte[7];
        bArr[0] = 2;
        bArr[1] = 3;
        if (z8) {
            bArr[2] = 7;
        } else {
            bArr[2] = 13;
        }
        byte[] bArr2 = new byte[4];
        if (!z7) {
            Arrays.fill(bArr2, (byte) -1);
        }
        System.arraycopy(bArr2, 0, bArr, 3, 4);
        return g.a(-69, bArr);
    }
}
