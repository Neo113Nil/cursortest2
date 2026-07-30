package com.crrepa.f;

import android.text.TextUtils;
import com.crrepa.ble.conn.bean.CRPWhatsappReceiveMessageInfo;
import com.crrepa.ble.conn.bean.CRPWhatsappStateInfo;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f12761a = 23;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f12762b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f12763c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final byte f12764d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final byte f12765e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final byte f12766f = 5;

    /* renamed from: g, reason: collision with root package name */
    public static final byte f12767g = 6;

    /* renamed from: h, reason: collision with root package name */
    public static final byte f12768h = 7;

    /* renamed from: i, reason: collision with root package name */
    public static final byte f12769i = 8;

    /* renamed from: j, reason: collision with root package name */
    public static final byte f12770j = 9;

    private u0() {
    }

    public static byte[] a() {
        return g.a(-69, new byte[]{23, 1});
    }

    public static byte[] a(CRPWhatsappReceiveMessageInfo cRPWhatsappReceiveMessageInfo) {
        if (cRPWhatsappReceiveMessageInfo == null) {
            return null;
        }
        String name = cRPWhatsappReceiveMessageInfo.getName();
        String message = cRPWhatsappReceiveMessageInfo.getMessage();
        if (TextUtils.isEmpty(name) || TextUtils.isEmpty(message)) {
            return null;
        }
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = name.getBytes(charset);
        byte[] bytes2 = message.getBytes(charset);
        byte[] bArr = new byte[bytes.length + 6 + bytes2.length];
        bArr[0] = 23;
        bArr[1] = 9;
        bArr[2] = 1;
        bArr[3] = (byte) bytes.length;
        System.arraycopy(bytes, 0, bArr, 4, bytes.length);
        byte[] a8 = com.crrepa.g1.c.a(bytes2.length);
        System.arraycopy(a8, 0, bArr, bytes.length + 4, a8.length);
        System.arraycopy(bytes2, 0, bArr, bytes.length + 4 + a8.length, bytes2.length);
        return g.a(-69, bArr);
    }

    public static byte[] a(CRPWhatsappStateInfo cRPWhatsappStateInfo) {
        String msg = cRPWhatsappStateInfo.getMsg();
        byte[] bytes = !TextUtils.isEmpty(msg) ? msg.getBytes(StandardCharsets.UTF_8) : null;
        byte[] bArr = new byte[(bytes == null ? 0 : bytes.length + 1) + 3];
        bArr[0] = 23;
        bArr[1] = 4;
        bArr[2] = cRPWhatsappStateInfo.getState();
        if (bytes != null) {
            bArr[3] = (byte) bytes.length;
            System.arraycopy(bytes, 0, bArr, 4, bytes.length);
        }
        return g.a(-69, bArr);
    }

    public static byte[] a(List<String> list) {
        byte[] bArr = new byte[3];
        bArr[0] = 23;
        bArr[1] = 2;
        if (list == null || list.isEmpty()) {
            bArr[2] = 0;
        } else {
            bArr[2] = (byte) list.size();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                byte[] a8 = com.crrepa.g1.c.a(it.next(), 80, StandardCharsets.UTF_8);
                if (!com.crrepa.g1.c.h(a8)) {
                    byte[] bArr2 = new byte[a8.length + bArr.length + 1];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    bArr2[bArr.length] = (byte) a8.length;
                    System.arraycopy(a8, 0, bArr2, bArr.length + 1, a8.length);
                    bArr = bArr2;
                }
            }
        }
        return g.a(-69, bArr);
    }
}
