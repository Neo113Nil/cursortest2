package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cyy extends cri {
    public static final Parcelable.Creator CREATOR = new ctk(15);
    public final cyv a;
    public final cyx b;
    public final cyw c;

    public cyy(cyv cyvVar, cyx cyxVar, cyw cywVar) {
        this.a = cyvVar;
        this.b = cyxVar;
        this.c = cywVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyy)) {
            return false;
        }
        cyy cyyVar = (cyy) obj;
        return Objects.equals(this.a, cyyVar.a) && Objects.equals(this.b, cyyVar.b) && Objects.equals(this.c, cyyVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cyv cyvVar = this.a;
        int q = oy.q(parcel, 20293);
        oy.H(parcel, 1, cyvVar, i);
        oy.H(parcel, 2, this.b, i);
        oy.H(parcel, 3, this.c, i);
        oy.r(parcel, q);
    }
}
