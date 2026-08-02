package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gdm {
    public static final gdm a = new gdm(null, Instant.EPOCH, false);
    private final Object b;
    private final ked c;

    private gdm(Object obj, Instant instant, boolean z) {
        this.b = obj;
        this.c = new ked(instant, obj != null, z);
    }

    public static gdm a(Object obj, Instant instant) {
        obj.getClass();
        return new gdm(obj, instant, true);
    }

    public final Instant b() {
        hoq.I(d(), "Cannot get timestamp for a CacheResult that does not have content");
        hoq.I(e(), "Cannot get timestamp for an invalid CacheResult");
        return (Instant) this.c.c;
    }

    public final Object c() {
        hoq.I(d(), "Cannot get data for a CacheResult that does not have content");
        return this.b;
    }

    public final boolean d() {
        return this.c.a;
    }

    public final boolean e() {
        hoq.I(d(), "Cannot call isValid() for a CacheResult that does not have content");
        return this.c.b;
    }

    public final String toString() {
        ked kedVar = this.c;
        if (!kedVar.a) {
            return "CacheResult.cacheMiss";
        }
        boolean z = kedVar.b;
        Object obj = this.b;
        if (!z) {
            return "CacheResult.cacheInvalid{data=" + String.valueOf(obj) + "}";
        }
        Object obj2 = kedVar.c;
        return "CacheResult.cacheHit{data=" + String.valueOf(obj) + ", timestamp=" + obj2.toString() + "}";
    }
}
