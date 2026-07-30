package com.iab.omid.library.toponad.walking;

import com.iab.omid.library.toponad.walking.async.b;
import com.iab.omid.library.toponad.walking.async.d;
import com.iab.omid.library.toponad.walking.async.e;
import com.iab.omid.library.toponad.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b implements b.InterfaceC0172b {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f36492a;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.toponad.walking.async.c f36493b;

    public b(com.iab.omid.library.toponad.walking.async.c cVar) {
        this.f36493b = cVar;
    }

    @Override // com.iab.omid.library.toponad.walking.async.b.InterfaceC0172b
    public JSONObject a() {
        return this.f36492a;
    }

    public void b() {
        this.f36493b.b(new d(this));
    }

    @Override // com.iab.omid.library.toponad.walking.async.b.InterfaceC0172b
    public void a(JSONObject jSONObject) {
        this.f36492a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j9) {
        this.f36493b.b(new f(this, hashSet, jSONObject, j9));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j9) {
        this.f36493b.b(new e(this, hashSet, jSONObject, j9));
    }
}
