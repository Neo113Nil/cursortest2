package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bo2;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class sn2 extends bo2 {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f31883c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f31884d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f31885e;

    public sn2(bo2.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j4) {
        super(bVar);
        this.f31883c = new HashSet<>(hashSet);
        this.f31884d = jSONObject;
        this.f31885e = j4;
    }
}
