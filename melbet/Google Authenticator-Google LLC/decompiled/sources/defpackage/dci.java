package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dci extends cri {
    public static final Parcelable.Creator CREATOR = new dbh(11);
    private final String a;
    private final String b;

    public dci(Parcel parcel) {
        this.a = parcel.readString();
        String readString = parcel.readString();
        oy.at(readString);
        this.b = readString;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dci)) {
            return false;
        }
        dci dciVar = (dci) obj;
        return Objects.equals(this.a, dciVar.a) && Objects.equals(this.b, dciVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
