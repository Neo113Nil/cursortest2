package com.iab.omid.library.startio.attestation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Map f18a;

    public a(Map map) {
        this.f18a = map == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(map));
    }

    public Map a() {
        return this.f18a;
    }
}
