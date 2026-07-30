package com.iab.omid.library.toponad.walking.async;

import com.iab.omid.library.toponad.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f36483c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f36484d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f36485e;

    public a(b.InterfaceC0172b interfaceC0172b, HashSet<String> hashSet, JSONObject jSONObject, long j9) {
        super(interfaceC0172b);
        this.f36483c = new HashSet<>(hashSet);
        this.f36484d = jSONObject;
        this.f36485e = j9;
    }
}
