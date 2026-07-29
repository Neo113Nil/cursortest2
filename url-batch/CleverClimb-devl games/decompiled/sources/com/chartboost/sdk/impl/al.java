package com.chartboost.sdk.impl;

import com.chartboost.sdk.Libraries.h;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class al {

    /* renamed from: a, reason: collision with root package name */
    private final com.chartboost.sdk.Libraries.f f3729a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, h.a> f3730b = new HashMap();

    public al(com.chartboost.sdk.Libraries.f fVar) {
        this.f3729a = fVar;
    }

    public h.a a(String str) {
        if (b(str)) {
            if (this.f3730b.containsKey(str)) {
                return this.f3730b.get(str);
            }
            h.a aVar = new h.a(str, new File(this.f3729a.d().f3590d, String.format("%s%s", str, ".png")), this.f3729a);
            this.f3730b.put(str, aVar);
            return aVar;
        }
        if (!this.f3730b.containsKey(str)) {
            return null;
        }
        this.f3730b.remove(str);
        return null;
    }

    private boolean b(String str) {
        return this.f3729a.b(String.format("%s%s", str, ".png"));
    }
}
