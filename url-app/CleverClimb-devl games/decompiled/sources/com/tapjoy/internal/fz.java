package com.tapjoy.internal;

import com.tapjoy.TapjoyConstants;
import com.tapjoy.internal.gk;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class fz extends gk {

    /* renamed from: a, reason: collision with root package name */
    static final Map f8140a = Collections.unmodifiableMap(new HashMap());

    /* renamed from: c, reason: collision with root package name */
    private final gk.a f8141c = a("BuildConfig");

    /* renamed from: d, reason: collision with root package name */
    private final gk.a f8142d = a("ServerFinal");
    private final gk.a e = a("AppRuntime");
    private final gk.a f;
    private final gk.a g;

    fz() {
        this.e.f8206b = new ConcurrentHashMap();
        this.f = a("ConnectFlags");
        this.g = a("ServerDefault");
        gk.a a2 = a("SDKDefault");
        if (!"".isEmpty()) {
            try {
                this.f8141c.f8206b = bn.b("").d();
            } catch (IOException e) {
                throw new Error("BuildConfig.TJC_CONFIGURATION malformed", e);
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("placement_request_content_retry_timeout", -1);
        hashMap.put("placement_request_content_retry_backoff", Arrays.asList(0L, 500L, Long.valueOf(TapjoyConstants.TIMER_INCREMENT), Double.valueOf(2.0d)));
        a2.f8206b = hashMap;
    }

    public final void a(@Nullable Map map) {
        Map map2;
        Map map3 = null;
        if (map != null) {
            map3 = (Map) map.get("final");
            map2 = (Map) map.get("default");
        } else {
            map2 = null;
        }
        this.f8142d.f8206b = map3;
        this.g.f8206b = map2;
        setChanged();
    }

    public final void a(Hashtable hashtable) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : hashtable.entrySet()) {
            String str = (String) f8140a.get(entry.getKey());
            if (str == null) {
                str = (String) entry.getKey();
            }
            this.e.f8206b.remove(str);
            hashMap.put(str, entry.getValue());
        }
        this.f.f8206b = hashMap;
        setChanged();
    }
}
