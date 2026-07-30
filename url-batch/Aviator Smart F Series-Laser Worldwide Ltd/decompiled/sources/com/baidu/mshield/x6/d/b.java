package com.baidu.mshield.x6.d;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.baidu.mshield.b.f.e;
import com.baidu.mshield.utility.c;
import com.baidu.mshield.x6.f.f;
import com.baidu.mshield.x6.f.h;
import java.net.URLEncoder;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public Context f8527a;

    /* renamed from: b, reason: collision with root package name */
    public String f8528b = "";

    public b(Context context) {
        this.f8527a = context;
    }

    public static synchronized b a(Context context) {
        b bVar;
        synchronized (b.class) {
            bVar = new b(context);
        }
        return bVar;
    }

    public String b(String str) {
        return a() + e("f/2/sig") + "?skey=" + d(str);
    }

    public String c(String str) {
        return a() + e("c/11/z") + "?skey=" + d(str);
    }

    public String d(String str) {
        return URLEncoder.encode(Base64.encodeToString(h.d(str.getBytes(), e.a(c.b(this.f8527a)).getBytes()), 0));
    }

    public final String e(String str) {
        String str2;
        try {
            String a8 = f.a();
            String b8 = f.b();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            try {
                str2 = f.a(a8, b8, currentTimeMillis);
            } catch (Throwable th) {
                f.b(th);
                str2 = "";
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str);
            stringBuffer.append("/250");
            stringBuffer.append("/" + a8);
            stringBuffer.append("/" + currentTimeMillis);
            stringBuffer.append("/" + str2);
            return stringBuffer.toString();
        } catch (Throwable th2) {
            f.b(th2);
            return "";
        }
    }

    public final String a() {
        if (!TextUtils.isEmpty(this.f8528b)) {
            return this.f8528b;
        }
        String f8 = f.f(this.f8527a);
        if (!TextUtils.isEmpty(f8)) {
            this.f8528b = f8;
        }
        return this.f8528b;
    }

    public String a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(a());
        if (com.baidu.mshield.x6.c.b.b()) {
            sb.append(e("f/2/ejc"));
        } else {
            sb.append(e("f/2/jc"));
        }
        sb.append("?skey=");
        sb.append(d(str));
        return sb.toString();
    }
}
