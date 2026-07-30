package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hs0 implements Parcelable {
    public static final Parcelable.Creator<hs0> CREATOR = new s3(7);
    public final String m;
    public final String n;
    public final boolean o;
    public final int p;
    public final int q;
    public final String r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final Bundle v;
    public final boolean w;
    public final int x;
    public Bundle y;

    public hs0(Parcel parcel) {
        this.m = parcel.readString();
        this.n = parcel.readString();
        this.o = parcel.readInt() != 0;
        this.p = parcel.readInt();
        this.q = parcel.readInt();
        this.r = parcel.readString();
        this.s = parcel.readInt() != 0;
        this.t = parcel.readInt() != 0;
        this.u = parcel.readInt() != 0;
        this.v = parcel.readBundle();
        this.w = parcel.readInt() != 0;
        this.y = parcel.readBundle();
        this.x = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.m);
        sb.append(" (");
        sb.append(this.n);
        sb.append(")}:");
        if (this.o) {
            sb.append(" fromLayout");
        }
        int i = this.q;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.r;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.s) {
            sb.append(" retainInstance");
        }
        if (this.t) {
            sb.append(" removing");
        }
        if (this.u) {
            sb.append(" detached");
        }
        if (this.w) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.m);
        parcel.writeString(this.n);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        parcel.writeString(this.r);
        parcel.writeInt(this.s ? 1 : 0);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeInt(this.u ? 1 : 0);
        parcel.writeBundle(this.v);
        parcel.writeInt(this.w ? 1 : 0);
        parcel.writeBundle(this.y);
        parcel.writeInt(this.x);
    }

    public hs0(fr0 fr0Var) {
        this.m = fr0Var.getClass().getName();
        this.n = fr0Var.mWho;
        this.o = fr0Var.mFromLayout;
        this.p = fr0Var.mFragmentId;
        this.q = fr0Var.mContainerId;
        this.r = fr0Var.mTag;
        this.s = fr0Var.mRetainInstance;
        this.t = fr0Var.mRemoving;
        this.u = fr0Var.mDetached;
        this.v = fr0Var.mArguments;
        this.w = fr0Var.mHidden;
        this.x = fr0Var.mMaxState.ordinal();
    }
}
