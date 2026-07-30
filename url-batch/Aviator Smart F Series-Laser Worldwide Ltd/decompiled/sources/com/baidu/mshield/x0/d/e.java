package com.baidu.mshield.x0.d;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.baidu.mshield.x0.EngineImpl;

/* loaded from: classes2.dex */
public final class e {
    public static String a(Context context) {
        return EngineImpl.getInstance(context).getPropertyByType("arid");
    }

    public static String b(Context context) {
        try {
            com.baidu.mshield.x0.l.c cVar = new com.baidu.mshield.x0.l.c(context);
            String f8 = cVar.f();
            if (!TextUtils.isEmpty(f8)) {
                return f8;
            }
            if (Build.VERSION.SDK_INT > 25) {
                return "";
            }
            String a8 = a(context);
            if (TextUtils.isEmpty("") && TextUtils.isEmpty(a8)) {
                return "";
            }
            byte[] bytes = (":" + a8).getBytes();
            for (int i8 = 0; i8 < bytes.length; i8++) {
                bytes[i8] = (byte) (bytes[i8] ^ 246);
            }
            String c8 = com.baidu.mshield.b.f.e.c(bytes);
            if (TextUtils.isEmpty(c8)) {
                return "";
            }
            cVar.f(c8);
            return c8;
        } catch (Throwable th) {
            d.a(th);
            return "";
        }
    }
}
