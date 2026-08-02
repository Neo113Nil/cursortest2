package a0;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: a0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0136b {

    /* renamed from: b, reason: collision with root package name */
    public static final C0136b f4058b = new C0136b(new HashMap());

    /* renamed from: a, reason: collision with root package name */
    public final Map f4059a;

    public C0136b(HashMap hashMap) {
        this.f4059a = Collections.unmodifiableMap(hashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0136b) {
            return this.f4059a.equals(((C0136b) obj).f4059a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4059a.hashCode();
    }
}
