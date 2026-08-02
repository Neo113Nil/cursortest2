package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ehh {
    public final boolean a;
    public final Map b;

    public ehh(boolean z, Map map) {
        this.a = z;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehh)) {
            return false;
        }
        ehh ehhVar = (ehh) obj;
        return this.a == ehhVar.a && ksp.b(this.b, ehhVar.b);
    }

    public final int hashCode() {
        return (a.m(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Data(isLightTheme=" + this.a + ", resolvedColorsMap=" + this.b + ")";
    }
}
