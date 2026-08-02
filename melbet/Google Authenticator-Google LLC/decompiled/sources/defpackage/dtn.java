package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dtn implements Parcelable {
    public static final Parcelable.Creator CREATOR = new dtk(2);
    public final dtm a;
    public final jiv b;

    public dtn(dtm dtmVar, jiv jivVar) {
        dtmVar.getClass();
        jivVar.getClass();
        this.a = dtmVar;
        this.b = jivVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtn)) {
            return false;
        }
        dtn dtnVar = (dtn) obj;
        return ksp.b(this.a, dtnVar.a) && this.b == dtnVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ActivityResultContext(actionData=" + this.a + ", dismissibility=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b.ordinal());
    }
}
