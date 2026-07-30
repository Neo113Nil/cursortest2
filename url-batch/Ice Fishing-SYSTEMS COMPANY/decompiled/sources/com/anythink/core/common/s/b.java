package com.anythink.core.common.s;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.d.u;
import com.anythink.core.common.s.b.d;
import com.anythink.core.common.s.b.e;
import com.anythink.core.common.s.c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f16545a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f16546b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static volatile b f16547c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, a> f16548d = new ConcurrentHashMap();

    private b() {
    }

    public static b a() {
        if (f16547c == null) {
            synchronized (b.class) {
                try {
                    if (f16547c == null) {
                        f16547c = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16547c;
    }

    private a c(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return new com.anythink.core.common.s.b.b();
        }
        if (context instanceof Activity) {
            context = context.getApplicationContext();
        }
        a aVar = this.f16548d.get(str);
        if (aVar != null) {
            return aVar;
        }
        a d2 = d(context, str);
        this.f16548d.put(str, d2);
        return d2;
    }

    private static a d(Context context, String str) {
        return d.c(new c.a().a(context).a(str).b(1).a(1).a());
    }

    public final a b(Context context, String str) {
        return c(context, str);
    }

    private static boolean b(String str) {
        return !a(str);
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.endsWith(u.a.f12990m) || str.endsWith(u.a.f12989l);
    }

    private void a(Context context) {
        String[] strArr = {u.b.f13004a, u.b.f13005b, u.b.f13006c, u.b.f13008e, u.b.f13010g, u.b.f13011h, u.b.i, u.b.f13012j, u.b.f13013k, u.b.f13014l, u.b.f13015m, u.b.f13016n, u.b.f13017o, "anythink_app_pl_cl_retry"};
        for (int i = 0; i < 14; i++) {
            a c4 = c(context, strArr[i]);
            if (c4 instanceof e) {
                ((e) c4).c();
            }
        }
    }

    public final a a(Context context, String str) {
        return c(context, str);
    }
}
