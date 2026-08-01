package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class fc {

    /* renamed from: a, reason: collision with root package name */
    public final sb f2286a;

    /* renamed from: b, reason: collision with root package name */
    public final md f2287b;

    public fc(sb sbVar, md mdVar) {
        this.f2286a = sbVar;
        this.f2287b = mdVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fc)) {
            return false;
        }
        fc fcVar = (fc) obj;
        sb sbVar = fcVar.f2286a;
        sb sbVar2 = this.f2286a;
        if (sbVar2 == null) {
            if (sbVar != null) {
                return false;
            }
        } else if (!sbVar2.equals(sbVar)) {
            return false;
        }
        return this.f2287b.equals(fcVar.f2287b);
    }

    public final int hashCode() {
        sb sbVar = this.f2286a;
        return (((sbVar == null ? 0 : sbVar.hashCode()) ^ 1000003) * 1000003) ^ this.f2287b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f2286a);
        String obj = this.f2287b.toString();
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 52 + obj.length() + 1);
        n0.l.l(sb2, "SnapshotBlobAndResult{snapshotBlob=", valueOf, ", snapshotResult=", obj);
        sb2.append("}");
        return sb2.toString();
    }
}
