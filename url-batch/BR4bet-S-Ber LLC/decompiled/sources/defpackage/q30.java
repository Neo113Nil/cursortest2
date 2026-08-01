package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class q30 implements Serializable {
    public final Throwable f;

    public q30(Throwable th) {
        this.f = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q30) {
            return this.f.equals(((q30) obj).f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f + ')';
    }
}
