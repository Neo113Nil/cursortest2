package ua;

import kotlin.jvm.internal.Intrinsics;
import n0.l;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d {
    private final String entry;
    private final c level;

    public d(c cVar, String str) {
        cVar.getClass();
        str.getClass();
        this.level = cVar;
        this.entry = str;
    }

    public static /* synthetic */ d copy$default(d dVar, c cVar, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            cVar = dVar.level;
        }
        if ((i3 & 2) != 0) {
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

    public final d copy(c cVar, String str) {
        cVar.getClass();
        str.getClass();
        return new d(cVar, str);
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
        StringBuilder sb2 = new StringBuilder("OneSignalLogEvent(level=");
        sb2.append(this.level);
        sb2.append(", entry=");
        return l.h(sb2, this.entry, ')');
    }
}
