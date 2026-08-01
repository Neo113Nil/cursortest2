package a7;

import android.os.Parcel;
import android.os.Parcelable;
import c7.c0;
import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f extends d7.a {
    public static final Parcelable.Creator<f> CREATOR = o.f337b;

    /* renamed from: r, reason: collision with root package name */
    public static final f f317r;

    /* renamed from: d, reason: collision with root package name */
    public final g f318d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f319e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f320i;

    static {
        f fVar = new f(null, false);
        fVar.f320i = false;
        f317r = fVar;
    }

    public f(g gVar, boolean z10) {
        this.f318d = gVar;
        this.f319e = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return c0.k(this.f318d, fVar.f318d) && this.f320i == fVar.f320i && this.f319e == fVar.f319e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f318d, Boolean.valueOf(this.f320i), Boolean.valueOf(this.f319e)});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f318d);
        return v4.a.p(new StringBuilder(valueOf.length() + 31), "ApiMetadata(complianceOptions=", valueOf, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        if (this.f320i) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int Z = cf.c.Z(parcel, 20293);
        cf.c.U(parcel, 1, this.f318d, i3);
        cf.c.Y(parcel, 2, 4);
        parcel.writeInt(this.f319e ? 1 : 0);
        cf.c.a0(parcel, Z);
    }
}
