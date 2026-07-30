package com.baidu.xclient.gdid;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.mshield.b.a.g;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static volatile h f10741a;

    /* renamed from: b, reason: collision with root package name */
    public AtomicBoolean f10742b = new AtomicBoolean(false);

    public static h a() {
        if (f10741a == null) {
            synchronized (h.class) {
                try {
                    if (f10741a == null) {
                        f10741a = new h();
                    }
                } finally {
                }
            }
        }
        return f10741a;
    }

    public final JSONObject a(Context context, StringBuilder sb) {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = d.a().d()[0];
            String str2 = "";
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            jSONObject.put("15028", str);
            String a8 = com.baidu.xclient.gdid.k.c.a("02018", d.a().c("arid"), sb);
            if (!TextUtils.isEmpty(a8)) {
                str2 = a8;
            }
            jSONObject.put("02018", str2);
            jSONObject.put("15003", com.baidu.mshield.b.b.a.a(context));
            jSONObject.put("02003", d.a().c("mod"));
            jSONObject.put("02002", com.baidu.xclient.gdid.jni.c.a(context).f());
            String b8 = g.b(context);
            String c8 = g.c(context);
            jSONObject.put("15029", b8);
            jSONObject.put("15030", c8);
            jSONObject.put("p", com.baidu.mshield.b.a.e.c() ? "1" : "0");
            jSONObject.put("02020", com.baidu.xclient.gdid.k.d.b());
            jSONObject.put("02015", d.a().c("arv"));
            jSONObject.put("s", com.baidu.xclient.gdid.jni.c.a(context).a());
            return jSONObject;
        } catch (Throwable th) {
            com.baidu.xclient.gdid.k.d.a(th);
            return null;
        }
    }

    public void a(Context context) {
        if (this.f10742b.get()) {
            return;
        }
        try {
            this.f10742b.set(true);
            if (!e.e().x() && com.baidu.xclient.gdid.k.d.a(context) && com.baidu.mshield.b.e.a.d(context)) {
                long n8 = e.e().n();
                long o8 = e.e().o();
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - n8 >= o8) {
                    StringBuilder sb = new StringBuilder();
                    JSONObject a8 = a(context, sb);
                    a8.put("15057", sb);
                    JSONObject a9 = com.baidu.xclient.gdid.k.d.a(context, a8, "1072102");
                    if (a9 != null && new com.baidu.xclient.gdid.g.a(context, null).a(a9) != null) {
                        e.e().d();
                        e.e().g(currentTimeMillis);
                    }
                }
            }
        } finally {
            try {
            } finally {
            }
        }
    }
}
