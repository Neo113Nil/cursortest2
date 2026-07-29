package org.apache.a.c.c;

import java.util.concurrent.ConcurrentHashMap;
import org.apache.a.m;

/* compiled from: SchemeRegistry.java */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, f> f9685a = new ConcurrentHashMap<>();

    public final f a(String str) {
        f b2 = b(str);
        if (b2 != null) {
            return b2;
        }
        throw new IllegalStateException("Scheme '" + str + "' not registered.");
    }

    public final f a(m mVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("Host must not be null.");
        }
        return a(mVar.c());
    }

    public final f b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Name must not be null.");
        }
        return this.f9685a.get(str);
    }

    public final f a(f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("Scheme must not be null.");
        }
        return this.f9685a.put(fVar.c(), fVar);
    }
}
