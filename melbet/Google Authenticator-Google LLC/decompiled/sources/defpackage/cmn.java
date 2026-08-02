package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cmn extends cri {
    public static final Parcelable.Creator CREATOR = ckq.a;
    public static final cmn a = ox.x(null, false, false);
    public final cmp b;
    public final boolean c;
    public boolean d;

    static {
        ox.x(null, false, true);
    }

    public cmn(cmp cmpVar, boolean z) {
        this.b = cmpVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cmn)) {
            return false;
        }
        cmn cmnVar = (cmn) obj;
        return Objects.equals(this.b, cmnVar.b) && this.d == cmnVar.d && this.c == cmnVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Boolean.valueOf(this.d), Boolean.valueOf(this.c)});
    }

    public final String toString() {
        return "ApiMetadata(complianceOptions=" + String.valueOf(this.b) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.d) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int q = oy.q(parcel, 20293);
        oy.H(parcel, 1, this.b, i);
        oy.s(parcel, 2, this.c);
        oy.r(parcel, q);
    }
}
