package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class KN {

    /* renamed from: b, reason: collision with root package name */
    public static final KN f25957b = new KN(new HashMap());

    /* renamed from: a, reason: collision with root package name */
    public final Map f25958a;

    public /* synthetic */ KN(HashMap hashMap) {
        this.f25958a = Collections.unmodifiableMap(hashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KN) {
            return this.f25958a.equals(((KN) obj).f25958a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25958a.hashCode();
    }
}
