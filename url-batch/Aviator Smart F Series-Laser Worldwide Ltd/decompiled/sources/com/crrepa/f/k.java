package com.crrepa.f;

import android.text.TextUtils;
import com.crrepa.ble.conn.type.CRPChatErrorCode;
import com.crrepa.ble.util.BleLog;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f12585a = 2;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f12586b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f12587c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final byte f12588d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final byte f12589e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final byte f12590f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final byte f12591g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final byte f12592h = 4;

    /* renamed from: i, reason: collision with root package name */
    public static final byte f12593i = 6;

    /* renamed from: j, reason: collision with root package name */
    public static final byte f12594j = 8;

    /* renamed from: k, reason: collision with root package name */
    public static final byte f12595k = 9;

    /* renamed from: l, reason: collision with root package name */
    public static final byte f12596l = 14;

    /* renamed from: m, reason: collision with root package name */
    private static final byte f12597m = 2;

    /* renamed from: n, reason: collision with root package name */
    public static final byte f12598n = 5;

    /* renamed from: o, reason: collision with root package name */
    public static final byte f12599o = 7;

    /* renamed from: p, reason: collision with root package name */
    public static final byte f12600p = 8;

    /* renamed from: q, reason: collision with root package name */
    public static final byte f12601q = 48;

    /* renamed from: r, reason: collision with root package name */
    public static final byte f12602r = 49;

    /* renamed from: s, reason: collision with root package name */
    public static final byte f12603s = 57;

    /* renamed from: t, reason: collision with root package name */
    public static final byte f12604t = -1;

    /* renamed from: u, reason: collision with root package name */
    private static final StringBuilder f12605u = new StringBuilder();

    private k() {
    }

    private static void a(com.crrepa.m.f fVar) {
        fVar.a(d());
    }

    public static byte[] b() {
        return g.a(-69, new byte[]{2, 1, -1});
    }

    public static byte[] c() {
        return g.a(-69, new byte[]{2, 1, 2});
    }

    public static byte[] d() {
        return g.a(-69, new byte[]{2, 1, 8});
    }

    public static byte[] e() {
        return g.a(-69, new byte[]{2, 1, 49, 1});
    }

    public static byte[] f() {
        return g.a(-69, new byte[]{2, 1, 57});
    }

    public static byte[] g() {
        return g.a(-69, new byte[]{2, 1, 48});
    }

    public static byte[] h() {
        return g.a(-69, new byte[]{2, 1, 49, 2});
    }

    public static void a(com.crrepa.m.f fVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        BleLog.d("writeChatResponseCmd: " + com.crrepa.g1.c.c(bytes));
        if (bytes.length <= 230) {
            a(fVar, bytes, (byte) 1);
        } else {
            int i8 = 0;
            byte b8 = 1;
            for (int i9 = 1; i9 < str.length(); i9++) {
                String substring = str.substring(i8, i9);
                Charset charset = StandardCharsets.UTF_8;
                if (230 < substring.getBytes(charset).length) {
                    int i10 = i9 - 1;
                    a(fVar, str.substring(i8, i10).getBytes(charset), b8);
                    b8 = (byte) (b8 + 1);
                    i8 = i10;
                }
            }
            if (i8 < str.length()) {
                a(fVar, str.substring(i8).getBytes(StandardCharsets.UTF_8), b8);
            }
        }
        a(fVar);
    }

    public static void a(com.crrepa.m.f fVar, String str, byte b8, boolean z7) {
        int i8;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int i9 = 0;
        if (b8 == 0) {
            f12605u.setLength(0);
        }
        BleLog.d("sendChatResponseCmd response: " + str);
        StringBuilder sb = f12605u;
        sb.append(str);
        String sb2 = sb.toString();
        BleLog.d("sendChatResponseCmd sendResponse: " + str);
        byte[] bytes = sb2.getBytes(StandardCharsets.UTF_8);
        if (230 < bytes.length) {
            int i10 = 1;
            while (true) {
                if (i10 >= sb2.length()) {
                    i8 = 0;
                    break;
                }
                String substring = sb2.substring(0, i10);
                Charset charset = StandardCharsets.UTF_8;
                if (230 < substring.getBytes(charset).length) {
                    i8 = i10 - 1;
                    bytes = sb2.substring(0, i8).getBytes(charset);
                    break;
                }
                i10++;
            }
            f12605u.delete(0, i8);
        } else {
            sb.setLength(0);
        }
        a(fVar, bytes, b8);
        if (z7) {
            StringBuilder sb3 = f12605u;
            if (sb3.length() > 0) {
                String sb4 = sb3.toString();
                BleLog.d("sendChatResponseCmd sendResponse: " + sb4);
                byte b9 = (byte) (b8 + 1);
                for (int i11 = 1; i11 < sb4.length(); i11++) {
                    String substring2 = sb4.substring(i9, i11);
                    Charset charset2 = StandardCharsets.UTF_8;
                    if (230 < substring2.getBytes(charset2).length) {
                        int i12 = i11 - 1;
                        a(fVar, sb4.substring(i9, i12).getBytes(charset2), b9);
                        b9 = (byte) (b9 + 1);
                        i9 = i12;
                    }
                }
                if (i9 < sb4.length()) {
                    a(fVar, sb4.substring(i9).getBytes(StandardCharsets.UTF_8), b9);
                }
            }
            a(fVar);
        }
    }

    private static void a(com.crrepa.m.f fVar, byte[] bArr, byte b8) {
        byte[] bArr2 = new byte[bArr.length + 4];
        bArr2[0] = 2;
        bArr2[1] = 1;
        bArr2[2] = 7;
        bArr2[3] = b8;
        System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        BleLog.d("writeChatResponseCmd: " + com.crrepa.g1.c.c(bArr2));
        fVar.a(g.a(-69, bArr2));
    }

    public static boolean a(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr) || bArr.length < 8 || -69 != bArr[4] || 2 != bArr[5]) {
            return false;
        }
        byte b8 = bArr[7];
        return 7 == b8 || 8 == b8;
    }

    public static byte[] a() {
        return g.a(-69, new byte[]{2, 0});
    }

    public static byte[] a(CRPChatErrorCode cRPChatErrorCode) {
        return g.a(-69, new byte[]{2, 1, cRPChatErrorCode.getValue()});
    }

    public static byte[] a(String str) {
        byte[] a8 = com.crrepa.g1.c.a(str, 240, StandardCharsets.UTF_8);
        if (com.crrepa.g1.c.h(a8)) {
            return null;
        }
        byte[] bArr = new byte[a8.length + 3];
        bArr[0] = 2;
        bArr[1] = 1;
        bArr[2] = 5;
        System.arraycopy(a8, 0, bArr, 3, a8.length);
        return g.a(-69, bArr);
    }
}
