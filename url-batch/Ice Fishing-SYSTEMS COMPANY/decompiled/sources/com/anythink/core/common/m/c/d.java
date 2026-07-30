package com.anythink.core.common.m.c;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.v.af;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class d implements i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14698a = "anythink_app_pl_cl_retry";

    /* renamed from: b, reason: collision with root package name */
    protected final Context f14699b;

    /* renamed from: d, reason: collision with root package name */
    protected final Object f14701d = new Object();

    /* renamed from: c, reason: collision with root package name */
    protected final Map<String, Long> f14700c = new ConcurrentHashMap(1);

    public d(Context context) {
        this.f14699b = context;
    }

    @Override // com.anythink.core.common.m.c.i
    public com.anythink.core.common.m.b.f a(com.anythink.core.common.m.b.d dVar) {
        String c4 = c(dVar);
        if (this.f14700c == null || TextUtils.isEmpty(c4)) {
            return null;
        }
        com.anythink.core.common.m.b.f a9 = com.anythink.core.common.m.b.f.a();
        synchronized (this.f14701d) {
            try {
                Long l9 = this.f14700c.get(c4);
                if (l9 == null) {
                    l9 = Long.valueOf(af.b(this.f14699b, "anythink_app_pl_cl_retry", c4, 0L));
                    this.f14700c.put(c4, l9);
                }
                if (l9.longValue() == 0) {
                    a9.a(false);
                } else if (l9.longValue() == -1) {
                    a9.a(true);
                    a9.b(com.anythink.core.common.m.a.f14558n);
                } else {
                    boolean z8 = System.currentTimeMillis() - l9.longValue() < 0;
                    if (z8) {
                        a9.b(com.anythink.core.common.m.a.f14558n);
                    }
                    a9.a(z8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a9;
    }

    public boolean b(com.anythink.core.common.m.b.d dVar) {
        return false;
    }

    public String c(com.anythink.core.common.m.b.d dVar) {
        return dVar != null ? dVar.a() : "";
    }
}
