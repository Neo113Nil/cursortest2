package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class N implements Parcelable {
    public static final Parcelable.Creator<N> CREATOR = new Q.k(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f841a;

    /* renamed from: b, reason: collision with root package name */
    public final String f842b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f843c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f844e;

    /* renamed from: f, reason: collision with root package name */
    public final String f845f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f846g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f847j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f848k;

    /* renamed from: l, reason: collision with root package name */
    public final int f849l;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f850m;

    public N(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        this.f841a = abstractComponentCallbacksC0048q.getClass().getName();
        this.f842b = abstractComponentCallbacksC0048q.f966e;
        this.f843c = abstractComponentCallbacksC0048q.f972m;
        this.d = abstractComponentCallbacksC0048q.f981v;
        this.f844e = abstractComponentCallbacksC0048q.f982w;
        this.f845f = abstractComponentCallbacksC0048q.f983x;
        this.f846g = abstractComponentCallbacksC0048q.f946A;
        this.h = abstractComponentCallbacksC0048q.f971l;
        this.i = abstractComponentCallbacksC0048q.f985z;
        this.f847j = abstractComponentCallbacksC0048q.f967f;
        this.f848k = abstractComponentCallbacksC0048q.f984y;
        this.f849l = abstractComponentCallbacksC0048q.f956L.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f841a);
        sb.append(" (");
        sb.append(this.f842b);
        sb.append(")}:");
        if (this.f843c) {
            sb.append(" fromLayout");
        }
        int i = this.f844e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f845f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f846g) {
            sb.append(" retainInstance");
        }
        if (this.h) {
            sb.append(" removing");
        }
        if (this.i) {
            sb.append(" detached");
        }
        if (this.f848k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f841a);
        parcel.writeString(this.f842b);
        parcel.writeInt(this.f843c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f844e);
        parcel.writeString(this.f845f);
        parcel.writeInt(this.f846g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeBundle(this.f847j);
        parcel.writeInt(this.f848k ? 1 : 0);
        parcel.writeBundle(this.f850m);
        parcel.writeInt(this.f849l);
    }

    public N(Parcel parcel) {
        this.f841a = parcel.readString();
        this.f842b = parcel.readString();
        this.f843c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.f844e = parcel.readInt();
        this.f845f = parcel.readString();
        this.f846g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.f847j = parcel.readBundle();
        this.f848k = parcel.readInt() != 0;
        this.f850m = parcel.readBundle();
        this.f849l = parcel.readInt();
    }
}
