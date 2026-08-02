package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bxv extends bye {
    private final bzk a;

    public bxv(bzk bzkVar) {
        this.a = bzkVar;
    }

    @Override // defpackage.bye
    public final bzk a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bye) {
            return this.a.equals(((bye) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "AllExportQrCodesScannedEvent{otpsToExport=" + this.a.toString() + "}";
    }
}
