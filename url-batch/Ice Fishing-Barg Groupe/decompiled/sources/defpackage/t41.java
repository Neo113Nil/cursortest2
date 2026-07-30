package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class t41 implements Map.Entry, fu0 {
    public final Object OPXfSBeufaJ8;
    public final Object rtx2ld2ELZv4;

    public t41(Object obj, Object obj2) {
        this.rtx2ld2ELZv4 = obj;
        this.OPXfSBeufaJ8 = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t41)) {
            return false;
        }
        t41 t41Var = (t41) obj;
        return cs0.wdg6QnbFHrFF(this.rtx2ld2ELZv4, t41Var.rtx2ld2ELZv4) && cs0.wdg6QnbFHrFF(this.OPXfSBeufaJ8, t41Var.OPXfSBeufaJ8);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.rtx2ld2ELZv4;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.OPXfSBeufaJ8;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.rtx2ld2ELZv4;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.OPXfSBeufaJ8;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.rtx2ld2ELZv4 + ", value=" + this.OPXfSBeufaJ8 + ')';
    }
}
