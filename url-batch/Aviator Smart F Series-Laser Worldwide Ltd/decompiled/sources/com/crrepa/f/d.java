package com.crrepa.f;

import android.text.TextUtils;
import com.crrepa.ble.conn.type.CRPChatErrorCode;
import com.crrepa.ble.util.BleLog;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f12486a = 2;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f12487b = 5;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f12488c = 6;

    /* renamed from: d, reason: collision with root package name */
    public static final byte f12489d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final byte f12490e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final byte f12491f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final byte f12492g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final byte f12493h = 6;

    /* renamed from: i, reason: collision with root package name */
    public static final byte f12494i = 8;

    /* renamed from: j, reason: collision with root package name */
    public static final byte f12495j = 9;

    /* renamed from: k, reason: collision with root package name */
    private static final byte f12496k = 2;

    /* renamed from: l, reason: collision with root package name */
    public static final byte f12497l = 5;

    /* renamed from: m, reason: collision with root package name */
    public static final byte f12498m = 7;

    /* renamed from: n, reason: collision with root package name */
    public static final byte f12499n = 8;

    /* renamed from: o, reason: collision with root package name */
    public static final byte f12500o = 48;

    /* renamed from: p, reason: collision with root package name */
    public static final byte f12501p = 49;

    /* renamed from: q, reason: collision with root package name */
    public static final byte f12502q = 57;

    /* renamed from: r, reason: collision with root package name */
    public static final byte f12503r = -1;

    /* renamed from: s, reason: collision with root package name */
    private static final StringBuilder f12504s = new StringBuilder();

    private d() {
    }

    private static void a(com.crrepa.m.f fVar, byte b8) {
        fVar.a(a(b8));
    }

    public static byte[] b() {
        return g.a(-69, new byte[]{2, 5, 2});
    }

    public static byte[] c() {
        return g.a(-69, new byte[]{2, 5, 49, 1});
    }

    public static byte[] d() {
        return g.a(-69, new byte[]{2, 5, 57});
    }

    public static byte[] e() {
        return g.a(-69, new byte[]{2, 5, 48});
    }

    public static byte[] f() {
        return g.a(-69, new byte[]{2, 5, 49, 2});
    }

    public static void a(com.crrepa.m.f fVar, byte b8, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        BleLog.d("writeChatResponseCmd: " + com.crrepa.g1.c.c(bytes));
        if (bytes.length <= 230) {
            a(fVar, b8, bytes, (byte) 1);
        } else {
            int i8 = 0;
            byte b9 = 1;
            for (int i9 = 1; i9 < str.length(); i9++) {
                String substring = str.substring(i8, i9);
                Charset charset = StandardCharsets.UTF_8;
                if (230 < substring.getBytes(charset).length) {
                    int i10 = i9 - 1;
                    a(fVar, b8, str.substring(i8, i10).getBytes(charset), b9);
                    b9 = (byte) (b9 + 1);
                    i8 = i10;
                }
            }
            if (i8 < str.length()) {
                a(fVar, b8, str.substring(i8).getBytes(StandardCharsets.UTF_8), b9);
            }
        }
        a(fVar, b8);
    }

    public static void a(com.crrepa.m.f fVar, byte b8, String str, byte b9, boolean z7) {
        int i8;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int i9 = 0;
        if (b9 == 0) {
            f12504s.setLength(0);
        }
        BleLog.d("sendChatResponseCmd response: " + str);
        StringBuilder sb = f12504s;
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
            f12504s.delete(0, i8);
        } else {
            sb.setLength(0);
        }
        a(fVar, b8, bytes, b9);
        if (z7) {
            StringBuilder sb3 = f12504s;
            if (sb3.length() > 0) {
                String sb4 = sb3.toString();
                BleLog.d("sendChatResponseCmd sendResponse: " + sb4);
                byte b10 = (byte) (b9 + 1);
                for (int i11 = 1; i11 < sb4.length(); i11++) {
                    String substring2 = sb4.substring(i9, i11);
                    Charset charset2 = StandardCharsets.UTF_8;
                    if (230 < substring2.getBytes(charset2).length) {
                        int i12 = i11 - 1;
                        a(fVar, b8, sb4.substring(i9, i12).getBytes(charset2), b10);
                        b10 = (byte) (b10 + 1);
                        i9 = i12;
                    }
                }
                if (i9 < sb4.length()) {
                    a(fVar, b8, sb4.substring(i9).getBytes(StandardCharsets.UTF_8), b10);
                }
            }
            a(fVar, b8);
        }
    }

    private static void a(com.crrepa.m.f fVar, byte b8, byte[] bArr, byte b9) {
        byte[] bArr2 = new byte[bArr.length + 5];
        bArr2[0] = 2;
        bArr2[1] = 5;
        bArr2[2] = 7;
        bArr2[3] = b8;
        bArr2[4] = b9;
        System.arraycopy(bArr, 0, bArr2, 5, bArr.length);
        BleLog.d("writeAiAgentResponseCmd: " + com.crrepa.g1.c.c(bArr2));
        fVar.a(g.a(-69, bArr2));
    }

    public static byte[] a() {
        return g.a(-69, new byte[]{2, 5, -1});
    }

    public static byte[] a(byte b8) {
        return g.a(-69, new byte[]{2, 5, 8, b8});
    }

    public static byte[] a(byte b8, String str) {
        byte[] a8 = com.crrepa.g1.c.a(str, 240, StandardCharsets.UTF_8);
        if (com.crrepa.g1.c.h(a8)) {
            return null;
        }
        byte[] bArr = new byte[a8.length + 4];
        bArr[0] = 2;
        bArr[1] = 5;
        bArr[2] = 5;
        bArr[3] = b8;
        System.arraycopy(a8, 0, bArr, 4, a8.length);
        return g.a(-69, bArr);
    }

    public static byte[] a(CRPChatErrorCode cRPChatErrorCode) {
        return g.a(-69, new byte[]{2, 5, cRPChatErrorCode.getValue()});
    }
}
