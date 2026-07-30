package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class s70 implements Map.Entry, fu0 {
    public final r01 OPXfSBeufaJ8;
    public s70 dgRBjINgWbAK;
    public final Object rtx2ld2ELZv4;
    public s70 wdg6QnbFHrFF;
    public boolean x50lh2ztY7Y5;

    public s70(n01 n01Var, r01 r01Var) {
        this.rtx2ld2ELZv4 = n01Var;
        this.OPXfSBeufaJ8 = r01Var;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s70) {
            s70 s70Var = (s70) obj;
            return cs0.wdg6QnbFHrFF(this.rtx2ld2ELZv4, s70Var.rtx2ld2ELZv4) && this.OPXfSBeufaJ8 == s70Var.OPXfSBeufaJ8;
        }
        return false;
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
        return this.OPXfSBeufaJ8.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "Entry(key=" + this.rtx2ld2ELZv4 + ", value=" + this.OPXfSBeufaJ8 + ")";
    }
}
