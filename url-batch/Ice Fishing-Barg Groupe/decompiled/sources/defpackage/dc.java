package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class dc extends jh0 {
    public final Object OPXfSBeufaJ8;
    public final long wdg6QnbFHrFF;

    public dc(long j, Object obj) {
        this.OPXfSBeufaJ8 = obj;
        this.wdg6QnbFHrFF = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc)) {
            return false;
        }
        dc dcVar = (dc) obj;
        return this.OPXfSBeufaJ8.equals(dcVar.OPXfSBeufaJ8) && this.wdg6QnbFHrFF == dcVar.wdg6QnbFHrFF;
    }

    public final int hashCode() {
        return Long.hashCode(this.wdg6QnbFHrFF) + (this.OPXfSBeufaJ8.hashCode() * 31);
    }

    public final String toString() {
        return "BackHandlerInfo(owner=" + this.OPXfSBeufaJ8 + ", compositeKey=" + this.wdg6QnbFHrFF + ')';
    }
}
