package com.anythink.core.common;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.d.u;
import com.anythink.core.common.h.bq;
import com.anythink.core.common.v.af;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class v {

    /* renamed from: b, reason: collision with root package name */
    private static final String f16712b = "v";

    /* renamed from: f, reason: collision with root package name */
    private static volatile v f16713f;

    /* renamed from: a, reason: collision with root package name */
    Context f16714a;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Integer> f16715c = new ConcurrentHashMap(8);

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, bq> f16716d = new ConcurrentHashMap(8);

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, Boolean> f16717e = new ConcurrentHashMap(8);

    private v(Context context) {
        this.f16714a = context.getApplicationContext();
    }

    public static v a(Context context) {
        if (f16713f == null) {
            synchronized (v.class) {
                try {
                    if (f16713f == null) {
                        f16713f = new v(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16713f;
    }

    private boolean c(String str) {
        Boolean bool = this.f16717e.get(str);
        if (bool == null) {
            boolean c4 = af.c(this.f16714a, u.b.f13014l, str);
            Boolean valueOf = Boolean.valueOf(c4);
            if (c4) {
                af.b(this.f16714a, u.b.f13014l, str);
            }
            this.f16717e.put(str, Boolean.FALSE);
            bool = valueOf;
        }
        return bool.booleanValue();
    }

    public final int b(String str) {
        Integer num = this.f16715c.get(str);
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    public final void a(String str, String str2, boolean z8) {
        bq bqVar;
        if (TextUtils.isEmpty(str) || (bqVar = this.f16716d.get(str)) == null || !TextUtils.equals(str2, bqVar.a())) {
            return;
        }
        bqVar.a(z8);
    }

    public final void a(String str) {
        Integer num = this.f16715c.get(str);
        if (num == null) {
            this.f16715c.put(str, 1);
        } else {
            this.f16715c.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    public final bq a(String str, String str2) {
        Boolean bool = this.f16717e.get(str);
        if (bool == null) {
            boolean c4 = af.c(this.f16714a, u.b.f13014l, str);
            Boolean valueOf = Boolean.valueOf(c4);
            if (c4) {
                af.b(this.f16714a, u.b.f13014l, str);
            }
            this.f16717e.put(str, Boolean.FALSE);
            bool = valueOf;
        }
        boolean booleanValue = bool.booleanValue();
        bq remove = this.f16716d.remove(str);
        if (remove == null) {
            remove = new bq("", booleanValue);
        }
        this.f16716d.put(str, new bq(str2, false));
        return remove;
    }
}
