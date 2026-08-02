package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahk extends yo {
    private final ahd a;

    public ahk(ahd ahdVar) {
        this.a = ahdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && ksp.b(this.a, ((ahk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.a + ", direction=-1)";
    }
}
