package K2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d {
    private final String entry;
    private final c level;

    public d(c level, String entry) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.level = level;
        this.entry = entry;
    }

    public static /* synthetic */ d copy$default(d dVar, c cVar, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cVar = dVar.level;
        }
        if ((i2 & 2) != 0) {
            str = dVar.entry;
        }
        return dVar.copy(cVar, str);
    }

    public final c component1() {
        return this.level;
    }

    public final String component2() {
        return this.entry;
    }

    public final d copy(c level, String entry) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(entry, "entry");
        return new d(level, entry);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.level == dVar.level && Intrinsics.a(this.entry, dVar.entry);
    }

    public final String getEntry() {
        return this.entry;
    }

    public final c getLevel() {
        return this.level;
    }

    public int hashCode() {
        return this.entry.hashCode() + (this.level.hashCode() * 31);
    }

    public String toString() {
        return "OneSignalLogEvent(level=" + this.level + ", entry=" + this.entry + ')';
    }
}
