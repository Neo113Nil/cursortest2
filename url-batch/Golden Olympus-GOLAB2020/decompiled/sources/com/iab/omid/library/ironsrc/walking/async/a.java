package com.iab.omid.library.ironsrc.walking.async;

import com.iab.omid.library.ironsrc.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f14620c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f14621d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f14622e;

    public a(b.InterfaceC0144b interfaceC0144b, HashSet<String> hashSet, JSONObject jSONObject, long j4) {
        super(interfaceC0144b);
        this.f14620c = new HashSet<>(hashSet);
        this.f14621d = jSONObject;
        this.f14622e = j4;
    }
}
