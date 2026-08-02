package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dux implements Parcelable {
    public static final Parcelable.Creator CREATOR = new dtk(5);
    public final int a;
    public final boolean b;

    public dux(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dux)) {
            return false;
        }
        dux duxVar = (dux) obj;
        return this.a == duxVar.a && this.b == duxVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + a.m(this.b);
    }

    public final String toString() {
        return "ThemeConfiguration(themeStyleRes=" + this.a + ", enableDynamicColors=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
