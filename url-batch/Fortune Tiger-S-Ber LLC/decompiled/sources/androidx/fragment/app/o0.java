package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class o0 implements Parcelable {
    public static final Parcelable.Creator<o0> CREATOR = new b(4);

    /* renamed from: f, reason: collision with root package name */
    public final String f476f;
    public final String g;
    public final boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final int f477i;

    /* renamed from: j, reason: collision with root package name */
    public final int f478j;

    /* renamed from: k, reason: collision with root package name */
    public final String f479k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f480l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f481m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f482n;

    /* renamed from: o, reason: collision with root package name */
    public final Bundle f483o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f484p;

    /* renamed from: q, reason: collision with root package name */
    public final int f485q;

    /* renamed from: r, reason: collision with root package name */
    public Bundle f486r;

    public o0(u uVar) {
        this.f476f = uVar.getClass().getName();
        this.g = uVar.f522j;
        this.h = uVar.f530r;
        this.f477i = uVar.A;
        this.f478j = uVar.B;
        this.f479k = uVar.C;
        this.f480l = uVar.F;
        this.f481m = uVar.f529q;
        this.f482n = uVar.E;
        this.f483o = uVar.f523k;
        this.f484p = uVar.D;
        this.f485q = uVar.Q.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f476f);
        sb.append(" (");
        sb.append(this.g);
        sb.append(")}:");
        if (this.h) {
            sb.append(" fromLayout");
        }
        int i4 = this.f478j;
        if (i4 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i4));
        }
        String str = this.f479k;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f480l) {
            sb.append(" retainInstance");
        }
        if (this.f481m) {
            sb.append(" removing");
        }
        if (this.f482n) {
            sb.append(" detached");
        }
        if (this.f484p) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f476f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.f477i);
        parcel.writeInt(this.f478j);
        parcel.writeString(this.f479k);
        parcel.writeInt(this.f480l ? 1 : 0);
        parcel.writeInt(this.f481m ? 1 : 0);
        parcel.writeInt(this.f482n ? 1 : 0);
        parcel.writeBundle(this.f483o);
        parcel.writeInt(this.f484p ? 1 : 0);
        parcel.writeBundle(this.f486r);
        parcel.writeInt(this.f485q);
    }

    public o0(Parcel parcel) {
        this.f476f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readInt() != 0;
        this.f477i = parcel.readInt();
        this.f478j = parcel.readInt();
        this.f479k = parcel.readString();
        this.f480l = parcel.readInt() != 0;
        this.f481m = parcel.readInt() != 0;
        this.f482n = parcel.readInt() != 0;
        this.f483o = parcel.readBundle();
        this.f484p = parcel.readInt() != 0;
        this.f486r = parcel.readBundle();
        this.f485q = parcel.readInt();
    }
}
