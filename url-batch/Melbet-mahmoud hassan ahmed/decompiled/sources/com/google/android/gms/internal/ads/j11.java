package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j11 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, m11> f6929a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, l11> f6930b;

    j11(Map<String, m11> map, Map<String, l11> map2) {
        this.f6929a = map;
        this.f6930b = map2;
    }

    public final void a(ds2 ds2Var) {
        for (bs2 bs2Var : ds2Var.f4313b.f3935c) {
            if (this.f6929a.containsKey(bs2Var.f3514a)) {
                this.f6929a.get(bs2Var.f3514a).b(bs2Var.f3515b);
            } else if (this.f6930b.containsKey(bs2Var.f3514a)) {
                l11 l11Var = this.f6930b.get(bs2Var.f3514a);
                JSONObject jSONObject = bs2Var.f3515b;
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (optString != null) {
                        hashMap.put(next, optString);
                    }
                }
                l11Var.a(hashMap);
            }
        }
    }
}
