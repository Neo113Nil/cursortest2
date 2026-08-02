package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bfz implements bfw {
    public final Map b;
    public volatile Map c;

    public bfz(Map map) {
        this.b = DesugarCollections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bfz) {
            return this.b.equals(((bfz) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + String.valueOf(this.b) + "}";
    }
}
