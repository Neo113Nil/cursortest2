package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aly {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public aly(String str, Map map, Set set, Set set2) {
        set.getClass();
        this.a = str;
        this.b = map;
        this.c = set;
        this.d = set2;
    }

    public final boolean equals(Object obj) {
        return ajz.h(this, obj);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return ajz.f(this);
    }
}
