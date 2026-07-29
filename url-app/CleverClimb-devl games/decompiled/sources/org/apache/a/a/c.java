package org.apache.a.a;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: AuthSchemeRegistry.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, b> f9636a = new ConcurrentHashMap<>();

    public void a(String str, b bVar) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        if (bVar == null) {
            throw new IllegalArgumentException("Authentication scheme factory may not be null");
        }
        this.f9636a.put(str.toLowerCase(Locale.ENGLISH), bVar);
    }

    public a a(String str, org.apache.a.i.d dVar) throws IllegalStateException {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        b bVar = this.f9636a.get(str.toLowerCase(Locale.ENGLISH));
        if (bVar != null) {
            return bVar.a(dVar);
        }
        throw new IllegalStateException("Unsupported authentication scheme: " + str);
    }
}
