package com.iab.omid.library.startio.walking;

import com.iab.omid.library.startio.walking.async.b;
import com.iab.omid.library.startio.walking.async.d;
import com.iab.omid.library.startio.walking.async.e;
import com.iab.omid.library.startio.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b implements b.InterfaceC0018b {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f63a;
    private final com.iab.omid.library.startio.walking.async.c b;

    public b(com.iab.omid.library.startio.walking.async.c cVar) {
        this.b = cVar;
    }

    @Override // com.iab.omid.library.startio.walking.async.b.InterfaceC0018b
    public JSONObject a() {
        return this.f63a;
    }

    @Override // com.iab.omid.library.startio.walking.async.b.InterfaceC0018b
    public void a(JSONObject jSONObject) {
        this.f63a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet hashSet, long j) {
        this.b.b(new e(this, hashSet, jSONObject, j));
    }

    public void b() {
        this.b.b(new d(this));
    }

    public void b(JSONObject jSONObject, HashSet hashSet, long j) {
        this.b.b(new f(this, hashSet, jSONObject, j));
    }
}
