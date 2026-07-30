package com.baidu.mshield.x0.i;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.mshield.x0.d.d;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public Context f8476a;

    /* renamed from: b, reason: collision with root package name */
    public String f8477b = "";

    public b(Context context) {
        this.f8476a = context;
    }

    public static synchronized b a(Context context) {
        b bVar;
        synchronized (b.class) {
            bVar = new b(context);
        }
        return bVar;
    }

    public String b(String str) {
        StringBuilder sb = new StringBuilder();
        String c8 = d.c();
        sb.append(a("p/1/r", str));
        sb.append("&msg_id=" + c8);
        return sb.toString();
    }

    public final String a() {
        if (!TextUtils.isEmpty(this.f8477b)) {
            return this.f8477b;
        }
        String l8 = d.l(this.f8476a);
        if (!TextUtils.isEmpty(l8)) {
            this.f8477b = l8;
        }
        return this.f8477b;
    }

    public byte[] a(byte[] bArr, String str) {
        byte[] bArr2 = null;
        try {
            bArr2 = com.baidu.mshield.b.a.c.a(str.getBytes("utf-8"));
            return com.baidu.mshield.b.f.d.b(bArr2, bArr);
        } catch (Throwable th) {
            d.a(th);
            return bArr2;
        }
    }

    public String a(String str) {
        return a("s/5/aio", str);
    }

    public final String a(String str, String str2, String str3) {
        String str4;
        try {
            String c8 = d.c(this.f8476a);
            String d8 = d.d(this.f8476a);
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            try {
                str4 = d.a(c8, d8, currentTimeMillis);
            } catch (Throwable th) {
                d.a(th);
                str4 = "";
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(a());
            stringBuffer.append(str);
            stringBuffer.append("/250");
            stringBuffer.append("/" + c8);
            stringBuffer.append("/" + currentTimeMillis);
            stringBuffer.append("/" + str4);
            stringBuffer.append("?skey=" + str2);
            if (!TextUtils.isEmpty(str3)) {
                stringBuffer.append("&page=" + str3);
            }
            return stringBuffer.toString();
        } catch (Throwable th2) {
            d.a(th2);
            return "";
        }
    }

    public final String a(String str, String str2) {
        return a(str, str2, "");
    }
}
