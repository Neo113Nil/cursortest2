package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class jp1 extends jh0 {
    public final Object OPXfSBeufaJ8;
    public final long wdg6QnbFHrFF;

    public jp1(long j, Object obj) {
        this.OPXfSBeufaJ8 = obj;
        this.wdg6QnbFHrFF = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp1)) {
            return false;
        }
        jp1 jp1Var = (jp1) obj;
        return this.OPXfSBeufaJ8.equals(jp1Var.OPXfSBeufaJ8) && this.wdg6QnbFHrFF == jp1Var.wdg6QnbFHrFF;
    }

    public final int hashCode() {
        return Long.hashCode(this.wdg6QnbFHrFF) + (this.OPXfSBeufaJ8.hashCode() * 31);
    }

    public final String toString() {
        return "PredictiveBackHandlerInfo(owner=" + this.OPXfSBeufaJ8 + ", compositeKey=" + this.wdg6QnbFHrFF + ')';
    }
}
