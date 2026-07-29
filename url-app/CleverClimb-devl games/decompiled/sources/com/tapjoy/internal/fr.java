package com.tapjoy.internal;

import com.tapjoy.TapjoyLog;
import com.tapjoy.internal.gg;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class fr {

    /* renamed from: c, reason: collision with root package name */
    private static final String f8124c = "fr";

    /* renamed from: a, reason: collision with root package name */
    public final Map f8125a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Map f8126b = new HashMap();

    protected fr(String str, String str2, String str3) {
        this.f8125a.put("placement", str);
        this.f8125a.put("placement_type", str2);
        this.f8125a.put("content_type", str3);
    }

    protected final gg.a a(String str, Map map, Map map2) {
        gg.a b2 = gg.e(str).a().a(this.f8125a).a(map).b(map2);
        this.f8126b.put(str, b2);
        return b2;
    }

    public final void a(String str, Object obj) {
        this.f8125a.put(str, obj);
    }

    protected final gg.a b(String str, Map map, Map map2) {
        gg.a aVar = !al.a(str) ? (gg.a) this.f8126b.remove(str) : null;
        if (aVar == null) {
            TapjoyLog.e(f8124c, "Error when calling endTrackingEvent -- " + str + " tracking has not been started.");
        } else {
            aVar.a(this.f8125a).a(map).b(map2).b().c();
        }
        return aVar;
    }

    public final gg.a a() {
        return a("Content.rendered", null, null);
    }

    public final gg.a b() {
        return b("Content.rendered", null, null);
    }
}
