package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ago {
    public final Map b = new LinkedHashMap();

    public abstract Object a(agn agnVar);

    public final boolean equals(Object obj) {
        return (obj instanceof ago) && ksp.b(this.b, ((ago) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.b + ")";
    }
}
