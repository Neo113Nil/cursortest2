package com.iab.omid.library.startio.walking.async;

import com.iab.omid.library.startio.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class a extends b {
    protected final HashSet c;
    protected final JSONObject d;
    protected final long e;

    public a(b.InterfaceC0018b interfaceC0018b, HashSet hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0018b);
        this.c = new HashSet(hashSet);
        this.d = jSONObject;
        this.e = j;
    }
}
