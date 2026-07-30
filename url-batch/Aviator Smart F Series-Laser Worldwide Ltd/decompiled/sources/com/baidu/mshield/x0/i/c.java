package com.baidu.mshield.x0.i;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import com.baidu.mshield.b.f.e;
import com.baidu.mshield.x0.d.d;
import java.net.URLEncoder;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c extends com.baidu.mshield.b.d.a {

    /* renamed from: c, reason: collision with root package name */
    public b f8478c;

    public c(Context context, Handler handler) {
        super(context, handler);
        this.f8316b = context;
        this.f8478c = b.a(context);
    }

    public boolean a(String str) {
        com.baidu.mshield.b.c.a.b("j=" + str);
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            byte[] d8 = d.d();
            String b8 = this.f8478c.b(URLEncoder.encode(Base64.encodeToString(com.baidu.mshield.b.f.d.d(d8, e.a(com.baidu.mshield.utility.c.b(this.f8316b)).getBytes()), 0)));
            byte[] a8 = this.f8478c.a(d8, str);
            if (a8 == null) {
                return true;
            }
            try {
                String a9 = a(b8, a8);
                if (TextUtils.isEmpty(a9)) {
                    return false;
                }
                try {
                    new JSONObject(a9).getInt("response");
                    return true;
                } catch (Throwable th) {
                    d.a(th);
                    return true;
                }
            } catch (Throwable th2) {
                d.a(th2);
                return false;
            }
        } catch (Throwable th3) {
            d.a(th3);
            return true;
        }
    }
}
