package r1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import t1.u;
import u1.AbstractC0943a;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class g extends AbstractC0943a {
    public static final Parcelable.Creator<g> CREATOR = o.f7459b;

    /* renamed from: l, reason: collision with root package name */
    public static final g f7439l;

    /* renamed from: d, reason: collision with root package name */
    public final h f7440d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7441e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7442i;

    static {
        g gVar = new g(null, false);
        gVar.f7442i = false;
        f7439l = gVar;
    }

    public g(h hVar, boolean z7) {
        this.f7440d = hVar;
        this.f7441e = z7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return u.i(this.f7440d, gVar.f7440d) && this.f7442i == gVar.f7442i && this.f7441e == gVar.f7441e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7440d, Boolean.valueOf(this.f7442i), Boolean.valueOf(this.f7441e)});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f7440d);
        StringBuilder sb = new StringBuilder(valueOf.length() + 31);
        sb.append("ApiMetadata(complianceOptions=");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        if (this.f7442i) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int Q = AbstractC1053a.Q(parcel, 20293);
        AbstractC1053a.J(parcel, 1, this.f7440d, i2);
        AbstractC1053a.P(parcel, 2, 4);
        parcel.writeInt(this.f7441e ? 1 : 0);
        AbstractC1053a.S(parcel, Q);
    }
}
