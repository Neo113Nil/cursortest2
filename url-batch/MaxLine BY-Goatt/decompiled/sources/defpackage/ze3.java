package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ze3 extends i1 {
    public static final Parcelable.Creator<ze3> CREATOR = new va3(16);
    public final int m;
    public final String n;
    public final Intent o;

    public ze3(int i, String str, Intent intent) {
        this.m = i;
        this.n = str;
        this.o = intent;
    }

    public static ze3 a(Activity activity) {
        return new ze3(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ze3)) {
            return false;
        }
        ze3 ze3Var = (ze3) obj;
        return this.m == ze3Var.m && Objects.equals(this.n, ze3Var.n) && Objects.equals(this.o, ze3Var.o);
    }

    public final int hashCode() {
        return this.m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b0 = yk3.b0(parcel, 20293);
        yk3.d0(parcel, 1, 4);
        parcel.writeInt(this.m);
        yk3.W(parcel, 2, this.n);
        yk3.V(parcel, 3, this.o, i);
        yk3.c0(parcel, b0);
    }
}
