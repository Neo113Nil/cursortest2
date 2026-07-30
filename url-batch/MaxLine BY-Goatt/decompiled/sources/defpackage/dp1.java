package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class dp1 implements Parcelable {
    public static final Parcelable.Creator<dp1> CREATOR = new s3(16);
    public final String m;
    public final int n;
    public final Bundle o;
    public final Bundle p;

    public dp1(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.m = readString;
        this.n = parcel.readInt();
        this.o = parcel.readBundle(dp1.class.getClassLoader());
        Bundle readBundle = parcel.readBundle(dp1.class.getClassLoader());
        readBundle.getClass();
        this.p = readBundle;
    }

    public final cp1 a(Context context, op1 op1Var, zc1 zc1Var, hp1 hp1Var) {
        context.getClass();
        zc1Var.getClass();
        Bundle bundle = this.o;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        String str = this.m;
        str.getClass();
        return new cp1(context, op1Var, bundle2, zc1Var, hp1Var, str, this.p);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.m);
        parcel.writeInt(this.n);
        parcel.writeBundle(this.o);
        parcel.writeBundle(this.p);
    }

    public dp1(cp1 cp1Var) {
        cp1Var.getClass();
        this.m = cp1Var.r;
        this.n = cp1Var.n.r;
        this.o = cp1Var.a();
        Bundle bundle = new Bundle();
        this.p = bundle;
        cp1Var.u.b(bundle);
    }
}
