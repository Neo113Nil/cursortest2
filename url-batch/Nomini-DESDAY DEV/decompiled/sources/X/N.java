package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class N implements Parcelable {
    public static final Parcelable.Creator<N> CREATOR = new Q.k(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f840a;

    /* renamed from: b, reason: collision with root package name */
    public final String f841b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f842c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f843e;

    /* renamed from: f, reason: collision with root package name */
    public final String f844f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f845g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f846j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f847k;

    /* renamed from: l, reason: collision with root package name */
    public final int f848l;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f849m;

    public N(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        this.f840a = abstractComponentCallbacksC0048q.getClass().getName();
        this.f841b = abstractComponentCallbacksC0048q.f965e;
        this.f842c = abstractComponentCallbacksC0048q.f971m;
        this.d = abstractComponentCallbacksC0048q.f980v;
        this.f843e = abstractComponentCallbacksC0048q.f981w;
        this.f844f = abstractComponentCallbacksC0048q.f982x;
        this.f845g = abstractComponentCallbacksC0048q.f945A;
        this.h = abstractComponentCallbacksC0048q.f970l;
        this.i = abstractComponentCallbacksC0048q.f984z;
        this.f846j = abstractComponentCallbacksC0048q.f966f;
        this.f847k = abstractComponentCallbacksC0048q.f983y;
        this.f848l = abstractComponentCallbacksC0048q.f955L.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f840a);
        sb.append(" (");
        sb.append(this.f841b);
        sb.append(")}:");
        if (this.f842c) {
            sb.append(" fromLayout");
        }
        int i = this.f843e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f844f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f845g) {
            sb.append(" retainInstance");
        }
        if (this.h) {
            sb.append(" removing");
        }
        if (this.i) {
            sb.append(" detached");
        }
        if (this.f847k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f840a);
        parcel.writeString(this.f841b);
        parcel.writeInt(this.f842c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f843e);
        parcel.writeString(this.f844f);
        parcel.writeInt(this.f845g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeBundle(this.f846j);
        parcel.writeInt(this.f847k ? 1 : 0);
        parcel.writeBundle(this.f849m);
        parcel.writeInt(this.f848l);
    }

    public N(Parcel parcel) {
        this.f840a = parcel.readString();
        this.f841b = parcel.readString();
        this.f842c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.f843e = parcel.readInt();
        this.f844f = parcel.readString();
        this.f845g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.f846j = parcel.readBundle();
        this.f847k = parcel.readInt() != 0;
        this.f849m = parcel.readBundle();
        this.f848l = parcel.readInt();
    }
}
