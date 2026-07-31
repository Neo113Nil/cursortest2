package com.iab.omid.library.ironsrc.walking;

import com.iab.omid.library.ironsrc.walking.async.b;
import com.iab.omid.library.ironsrc.walking.async.d;
import com.iab.omid.library.ironsrc.walking.async.e;
import com.iab.omid.library.ironsrc.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b implements b.InterfaceC0144b {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f14629a;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.walking.async.c f14630b;

    public b(com.iab.omid.library.ironsrc.walking.async.c cVar) {
        this.f14630b = cVar;
    }

    @Override // com.iab.omid.library.ironsrc.walking.async.b.InterfaceC0144b
    public JSONObject a() {
        return this.f14629a;
    }

    public void b() {
        this.f14630b.b(new d(this));
    }

    @Override // com.iab.omid.library.ironsrc.walking.async.b.InterfaceC0144b
    public void a(JSONObject jSONObject) {
        this.f14629a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j4) {
        this.f14630b.b(new f(this, hashSet, jSONObject, j4));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j4) {
        this.f14630b.b(new e(this, hashSet, jSONObject, j4));
    }
}
