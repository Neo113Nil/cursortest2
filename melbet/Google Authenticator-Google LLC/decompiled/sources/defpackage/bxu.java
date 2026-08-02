package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bxu extends bxy {
    private final bzk a;

    public bxu(bzk bzkVar) {
        if (bzkVar == null) {
            throw new NullPointerException("Null otpsToExport");
        }
        this.a = bzkVar;
    }

    @Override // defpackage.bxy
    public final bzk a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bxy) {
            return this.a.equals(((bxy) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "CreateExportQrCodeEvent{otpsToExport=" + this.a.toString() + "}";
    }
}
