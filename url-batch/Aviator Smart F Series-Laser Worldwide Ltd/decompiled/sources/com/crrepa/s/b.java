package com.crrepa.s;

import android.text.TextUtils;
import com.crrepa.ble.conn.bean.CRPConnectKitMessage;
import com.crrepa.ble.hisilicon.connectkit.ConnectKitFileCompleteMessage;
import com.crrepa.ble.util.BleLog;
import com.crrepa.g1.k;
import com.crrepa.m.f;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f13772a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f13773b = 2;

    private b() {
    }

    private static void a(byte b8, int i8, String str, String str2, String str3, Integer num) {
        byte[] bArr;
        int i9;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        byte[] bytes2 = str2.getBytes(charset);
        if (TextUtils.isEmpty(str3)) {
            bArr = null;
            i9 = 0;
        } else {
            bArr = str3.getBytes(charset);
            i9 = bArr.length;
        }
        int length = bytes.length + 9 + bytes2.length;
        if (bArr != null) {
            length = length + bArr.length + 2;
        }
        if (num != null) {
            length += 4;
        }
        byte[] bArr2 = new byte[length];
        if (num == null) {
            bArr2[0] = 1;
        } else {
            bArr2[0] = 2;
        }
        byte[] a8 = com.crrepa.g1.c.a(i8);
        System.arraycopy(a8, 0, bArr2, 1, a8.length);
        int length2 = a8.length + 1;
        byte[] a9 = com.crrepa.g1.c.a(bytes.length);
        System.arraycopy(a9, 0, bArr2, length2, a9.length);
        int length3 = length2 + a9.length;
        System.arraycopy(bytes, 0, bArr2, length3, bytes.length);
        int length4 = length3 + bytes.length;
        byte[] a10 = com.crrepa.g1.c.a(bytes2.length);
        System.arraycopy(a10, 0, bArr2, length4, a10.length);
        int length5 = length4 + a10.length;
        System.arraycopy(bytes2, 0, bArr2, length5, bytes2.length);
        int length6 = length5 + bytes2.length;
        byte[] a11 = com.crrepa.g1.c.a(i9);
        System.arraycopy(a11, 0, bArr2, length6, a11.length);
        int length7 = length6 + a11.length;
        if (bArr != null) {
            System.arraycopy(bArr, 0, bArr2, length7, bArr.length);
            length7 += bArr.length;
        }
        if (num != null) {
            byte[] b9 = com.crrepa.g1.c.b(num.intValue());
            System.arraycopy(b9, 0, bArr2, length7, b9.length);
        }
        int c8 = com.crrepa.l.a.b().c() - 15;
        ArrayList<byte[]> arrayList = new ArrayList();
        if (length <= c8) {
            arrayList.add(com.crrepa.r.b.a(true, (byte) 13, (byte) 8, b8, bArr2));
        } else {
            arrayList.addAll(com.crrepa.r.b.a(true, (byte) 13, (byte) 8, b8, bArr2, c8));
        }
        for (byte[] bArr3 : arrayList) {
            BleLog.d("connectkit frameBytes: " + com.crrepa.g1.c.c(bArr3));
            f.e().b(bArr3);
        }
    }

    public static void b(CRPConnectKitMessage cRPConnectKitMessage) {
        BleLog.d("sendConnectKitMessage: " + cRPConnectKitMessage);
        a((byte) 2, cRPConnectKitMessage.getMessageId(), cRPConnectKitMessage.getSrcPackageName(), cRPConnectKitMessage.getDestPackageName(), cRPConnectKitMessage.getMsg(), cRPConnectKitMessage.getResponse());
    }

    public static void a(CRPConnectKitMessage cRPConnectKitMessage) {
        a((byte) 1, cRPConnectKitMessage.getMessageId(), cRPConnectKitMessage.getSrcPackageName(), cRPConnectKitMessage.getDestPackageName(), null, cRPConnectKitMessage.getResponse());
    }

    public static void a(CRPConnectKitMessage cRPConnectKitMessage, String str) {
        a((byte) 5, cRPConnectKitMessage.getMessageId(), cRPConnectKitMessage.getSrcPackageName(), cRPConnectKitMessage.getDestPackageName(), k.a(new ConnectKitFileCompleteMessage(cRPConnectKitMessage.getFile().getName(), str)), null);
    }

    public static byte[] a() {
        return com.crrepa.r.b.a(true, (byte) 13, (byte) 8, (byte) 6, new byte[1]);
    }
}
