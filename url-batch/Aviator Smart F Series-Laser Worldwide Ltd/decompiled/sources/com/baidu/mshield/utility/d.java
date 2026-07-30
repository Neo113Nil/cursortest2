package com.baidu.mshield.utility;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.mshield.ac.F;
import java.net.URLEncoder;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class d {
    public static String a(Context context, String str, boolean z7, boolean z8) {
        return a(context, str, "", z7, z8, true, null);
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return null;
        }
        return c(bArr, bArr2);
    }

    public static byte[] c(byte[] bArr, byte[] bArr2) {
        byte[] a8 = a(bArr2);
        byte[] bArr3 = new byte[bArr.length];
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < bArr.length; i10++) {
            i8 = (i8 + 1) & 255;
            byte b8 = a8[i8];
            i9 = ((b8 & 255) + i9) & 255;
            a8[i8] = a8[i9];
            a8[i9] = b8;
            int i11 = ((a8[i8] & 255) + (b8 & 255)) & 255;
            byte b9 = (byte) (a8[i11] ^ bArr[i10]);
            bArr3[i10] = b9;
            bArr3[i10] = (byte) (b9 ^ a4.a.f66n0);
        }
        return bArr3;
    }

    public static String a(Context context, String str, String str2, boolean z7, boolean z8) {
        return a(context, str, str2, z7, z8, false, "");
    }

    public static String a(Context context, String str, String str2, boolean z7, boolean z8, String str3) {
        return a(context, str, str2, z7, z8, false, str3);
    }

    public static String a(Context context, String str, String str2, boolean z7, boolean z8, boolean z9, String str3) {
        byte[] bytes;
        String a8;
        String str4 = "";
        if (!com.baidu.mshield.b.e.a.d(context)) {
            return "";
        }
        String[] i8 = a.i(context);
        String str5 = i8[0];
        String str6 = i8[1];
        String valueOf = String.valueOf(new Date().getTime() / 1000);
        String a9 = com.baidu.mshield.b.f.e.a(str5 + valueOf + str6);
        byte[] a10 = com.baidu.mshield.core.b.a();
        com.baidu.mshield.b.c.a.b("after get aesKey:" + new String(a10));
        com.baidu.mshield.b.c.a.b("after get aesKey:base64:" + Base64.encode(a10, 0));
        if (!TextUtils.isEmpty(str2)) {
            byte[] a11 = com.baidu.mshield.b.a.c.a(str2.getBytes());
            com.baidu.mshield.b.c.a.b("afterGzipPostBody,length=" + a11.length);
            bytes = F.getInstance().ae(a11, a10);
        } else {
            bytes = "".getBytes();
        }
        com.baidu.mshield.b.c.a.b("afterEncryptPostBody length=" + bytes.length + SystemInfoUtil.COMMA + new String(bytes));
        byte[] bytes2 = com.baidu.mshield.b.f.e.a(c.b(context)).getBytes();
        StringBuilder sb = new StringBuilder();
        sb.append("afterLoadRc4Key:");
        sb.append(new String(bytes2));
        com.baidu.mshield.b.c.a.b(sb.toString());
        byte[] re = F.getInstance().re(a10, bytes2);
        com.baidu.mshield.b.c.a.b("after ar:sKey length=" + re.length);
        String encodeToString = Base64.encodeToString(re, 0);
        com.baidu.mshield.b.c.a.b("after Base64:sKey=" + encodeToString);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("/");
        sb2.append("250");
        sb2.append("/");
        sb2.append(str5);
        sb2.append("/");
        sb2.append(valueOf);
        sb2.append("/");
        sb2.append(a9);
        if (!TextUtils.isEmpty(encodeToString)) {
            sb2.append("?skey=");
            sb2.append(URLEncoder.encode(encodeToString, "utf-8"));
        }
        com.baidu.mshield.b.c.a.b(sb2.toString());
        try {
            if (z9) {
                a8 = new com.baidu.mshield.b.d.b(context, null).a(sb2.toString());
            } else {
                a8 = new com.baidu.mshield.b.d.b(context, null).a(sb2.toString(), bytes);
            }
            str4 = a8;
        } catch (Throwable th) {
            a.a(th);
        }
        com.baidu.mshield.b.c.a.b("r:" + str4);
        if (z7 && TextUtils.isEmpty(str4)) {
            a(context);
            throw new NetworkErrorException("response is empty");
        }
        if (!z8) {
            return str4;
        }
        JSONObject jSONObject = new JSONObject(str4);
        String optString = jSONObject.optString("skey");
        com.baidu.mshield.b.c.a.b("base sKey from server:" + optString);
        byte[] decode = Base64.decode(optString, 0);
        com.baidu.mshield.b.c.a.b("after Base64 decode:server aeskey size=" + decode.length);
        byte[] rd = F.getInstance().rd(decode, bytes2);
        com.baidu.mshield.b.c.a.b("after dr aes key:size=" + new String(rd));
        String optString2 = jSONObject.optString("response");
        com.baidu.mshield.b.c.a.b("plugins:requestId:" + jSONObject.optString("request_id"));
        com.baidu.mshield.b.c.a.b("plugins:response Base64:" + optString2);
        byte[] decode2 = Base64.decode(optString2, 0);
        com.baidu.mshield.b.c.a.b("after Base64 decode:server aeskey size=" + decode2.length);
        byte[] ad = F.getInstance().ad(decode2, rd);
        if (decode2.length > 0 && (ad == null || ad.length == 0)) {
            a.g(context);
            throw new NetworkErrorException("aes is fail");
        }
        String str7 = new String(ad);
        com.baidu.mshield.b.c.a.b("sdk res:" + str7);
        return str7;
    }

    public static void a(Context context) {
        try {
            com.baidu.mshield.sharedpreferences.a a8 = com.baidu.mshield.sharedpreferences.a.a(context);
            if (System.currentTimeMillis() - a8.y() > 86400000) {
                HashMap hashMap = new HashMap();
                if (com.baidu.mshield.b.a.d.c(context)) {
                    hashMap.put("0", Integer.valueOf(a8.A() + 1));
                    hashMap.put("1", Integer.valueOf(a8.z()));
                } else {
                    hashMap.put("0", Integer.valueOf(a8.A()));
                    hashMap.put("1", Integer.valueOf(a8.z() + 1));
                }
                a8.d(0);
                a8.e(0);
                a8.j();
                a.a(context, "1067112", hashMap);
                return;
            }
            if (com.baidu.mshield.b.a.d.c(context)) {
                a8.c(a8.A() + 1);
            } else {
                a8.b(a8.z() + 1);
            }
        } catch (Throwable th) {
            a.a(th);
        }
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return null;
        }
        return c(bArr, bArr2);
    }

    public static byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[256];
        for (int i8 = 0; i8 < 256; i8++) {
            bArr2[i8] = (byte) i8;
        }
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            int i12 = bArr[i9] & 255;
            byte b8 = bArr2[i11];
            i10 = (i12 + (b8 & 255) + i10) & 255;
            bArr2[i11] = bArr2[i10];
            bArr2[i10] = b8;
            i9 = (i9 + 1) % bArr.length;
        }
        return bArr2;
    }
}
