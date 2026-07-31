package com.ironsource;

import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class hh {

    /* renamed from: a, reason: collision with root package name */
    private HashMap<String, Object> f16593a = new HashMap<>();

    public hh a(String str, Object obj) {
        if (obj != null) {
            this.f16593a.put(str, SDKUtils.encodeString(obj.toString()));
        }
        return this;
    }

    public HashMap<String, Object> a() {
        return this.f16593a;
    }
}
