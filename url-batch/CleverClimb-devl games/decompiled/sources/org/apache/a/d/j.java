package org.apache.a.d;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: CookieSpecRegistry.java */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, i> f9701a = new ConcurrentHashMap<>();

    public void a(String str, i iVar) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        if (iVar == null) {
            throw new IllegalArgumentException("Cookie spec factory may not be null");
        }
        this.f9701a.put(str.toLowerCase(Locale.ENGLISH), iVar);
    }

    public h a(String str, org.apache.a.i.d dVar) throws IllegalStateException {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        i iVar = this.f9701a.get(str.toLowerCase(Locale.ENGLISH));
        if (iVar != null) {
            return iVar.a(dVar);
        }
        throw new IllegalStateException("Unsupported cookie spec: " + str);
    }
}
