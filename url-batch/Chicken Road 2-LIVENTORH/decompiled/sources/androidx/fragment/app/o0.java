package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class o0 implements Parcelable {
    public static final Parcelable.Creator<o0> CREATOR = new b(4);

    /* renamed from: f, reason: collision with root package name */
    public final String f485f;

    /* renamed from: g, reason: collision with root package name */
    public final String f486g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f487h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f488j;

    /* renamed from: k, reason: collision with root package name */
    public final String f489k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f490l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f491m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f492n;

    /* renamed from: o, reason: collision with root package name */
    public final Bundle f493o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f494p;

    /* renamed from: q, reason: collision with root package name */
    public final int f495q;

    /* renamed from: r, reason: collision with root package name */
    public Bundle f496r;

    public o0(u uVar) {
        this.f485f = uVar.getClass().getName();
        this.f486g = uVar.f538j;
        this.f487h = uVar.f546r;
        this.i = uVar.A;
        this.f488j = uVar.B;
        this.f489k = uVar.C;
        this.f490l = uVar.F;
        this.f491m = uVar.f545q;
        this.f492n = uVar.E;
        this.f493o = uVar.f539k;
        this.f494p = uVar.D;
        this.f495q = uVar.Q.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f485f);
        sb.append(" (");
        sb.append(this.f486g);
        sb.append(")}:");
        if (this.f487h) {
            sb.append(" fromLayout");
        }
        int i = this.f488j;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f489k;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f490l) {
            sb.append(" retainInstance");
        }
        if (this.f491m) {
            sb.append(" removing");
        }
        if (this.f492n) {
            sb.append(" detached");
        }
        if (this.f494p) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f485f);
        parcel.writeString(this.f486g);
        parcel.writeInt(this.f487h ? 1 : 0);
        parcel.writeInt(this.i);
        parcel.writeInt(this.f488j);
        parcel.writeString(this.f489k);
        parcel.writeInt(this.f490l ? 1 : 0);
        parcel.writeInt(this.f491m ? 1 : 0);
        parcel.writeInt(this.f492n ? 1 : 0);
        parcel.writeBundle(this.f493o);
        parcel.writeInt(this.f494p ? 1 : 0);
        parcel.writeBundle(this.f496r);
        parcel.writeInt(this.f495q);
    }

    public o0(Parcel parcel) {
        this.f485f = parcel.readString();
        this.f486g = parcel.readString();
        this.f487h = parcel.readInt() != 0;
        this.i = parcel.readInt();
        this.f488j = parcel.readInt();
        this.f489k = parcel.readString();
        this.f490l = parcel.readInt() != 0;
        this.f491m = parcel.readInt() != 0;
        this.f492n = parcel.readInt() != 0;
        this.f493o = parcel.readBundle();
        this.f494p = parcel.readInt() != 0;
        this.f496r = parcel.readBundle();
        this.f495q = parcel.readInt();
    }
}
