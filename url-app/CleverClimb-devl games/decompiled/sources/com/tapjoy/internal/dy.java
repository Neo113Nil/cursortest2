package com.tapjoy.internal;

import com.tapjoy.internal.dz;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class dy extends dz {

    /* renamed from: a, reason: collision with root package name */
    protected final HashSet f7973a;

    /* renamed from: b, reason: collision with root package name */
    protected final JSONObject f7974b;

    /* renamed from: c, reason: collision with root package name */
    protected final double f7975c;

    public dy(dz.b bVar, HashSet hashSet, JSONObject jSONObject, double d2) {
        super(bVar);
        this.f7973a = new HashSet(hashSet);
        this.f7974b = jSONObject;
        this.f7975c = d2;
    }
}
