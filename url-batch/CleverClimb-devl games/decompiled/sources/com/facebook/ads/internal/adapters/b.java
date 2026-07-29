package com.facebook.ads.internal.adapters;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    protected final c f4906a;

    /* renamed from: b, reason: collision with root package name */
    protected final com.facebook.ads.internal.r.a f4907b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f4908c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4909d;

    public b(Context context, c cVar, com.facebook.ads.internal.r.a aVar) {
        this.f4908c = context;
        this.f4906a = cVar;
        this.f4907b = aVar;
    }

    public final void a() {
        if (this.f4909d) {
            return;
        }
        if (this.f4906a != null) {
            this.f4906a.a();
        }
        HashMap hashMap = new HashMap();
        if (this.f4907b != null) {
            this.f4907b.a(hashMap);
        }
        a(hashMap);
        this.f4909d = true;
        com.facebook.ads.internal.q.a.d.a(this.f4908c, "Impression logged");
        if (this.f4906a != null) {
            this.f4906a.b();
        }
    }

    protected abstract void a(Map<String, String> map);
}
