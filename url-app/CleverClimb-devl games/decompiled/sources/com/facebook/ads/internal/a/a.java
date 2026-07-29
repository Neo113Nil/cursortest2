package com.facebook.ads.internal.a;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.internal.j.a;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f4876a;

    /* renamed from: b, reason: collision with root package name */
    protected final com.facebook.ads.internal.m.c f4877b;

    /* renamed from: c, reason: collision with root package name */
    protected final String f4878c;

    public a(Context context, com.facebook.ads.internal.m.c cVar, String str) {
        this.f4876a = context;
        this.f4877b = cVar;
        this.f4878c = str;
    }

    public abstract a.EnumC0346a a();

    protected void a(Map<String, String> map) {
        if (!TextUtils.isEmpty(this.f4878c)) {
            if (this instanceof e) {
                this.f4877b.g(this.f4878c, map);
            } else {
                this.f4877b.c(this.f4878c, map);
            }
        }
        com.facebook.ads.internal.q.a.d.a(this.f4876a, "Click logged");
    }

    public abstract void b();
}
