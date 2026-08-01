package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class N implements Parcelable {
    public static final Parcelable.Creator<N> CREATOR = new Q.k(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f918a;

    /* renamed from: b, reason: collision with root package name */
    public final String f919b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f920c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f921e;

    /* renamed from: f, reason: collision with root package name */
    public final String f922f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f923g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f924j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f925k;

    /* renamed from: l, reason: collision with root package name */
    public final int f926l;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f927m;

    public N(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        this.f918a = abstractComponentCallbacksC0048q.getClass().getName();
        this.f919b = abstractComponentCallbacksC0048q.f1043e;
        this.f920c = abstractComponentCallbacksC0048q.f1049m;
        this.d = abstractComponentCallbacksC0048q.f1058v;
        this.f921e = abstractComponentCallbacksC0048q.f1059w;
        this.f922f = abstractComponentCallbacksC0048q.f1060x;
        this.f923g = abstractComponentCallbacksC0048q.f1023A;
        this.h = abstractComponentCallbacksC0048q.f1048l;
        this.i = abstractComponentCallbacksC0048q.f1062z;
        this.f924j = abstractComponentCallbacksC0048q.f1044f;
        this.f925k = abstractComponentCallbacksC0048q.f1061y;
        this.f926l = abstractComponentCallbacksC0048q.f1033L.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f918a);
        sb.append(" (");
        sb.append(this.f919b);
        sb.append(")}:");
        if (this.f920c) {
            sb.append(" fromLayout");
        }
        int i = this.f921e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f922f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f923g) {
            sb.append(" retainInstance");
        }
        if (this.h) {
            sb.append(" removing");
        }
        if (this.i) {
            sb.append(" detached");
        }
        if (this.f925k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f918a);
        parcel.writeString(this.f919b);
        parcel.writeInt(this.f920c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f921e);
        parcel.writeString(this.f922f);
        parcel.writeInt(this.f923g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeBundle(this.f924j);
        parcel.writeInt(this.f925k ? 1 : 0);
        parcel.writeBundle(this.f927m);
        parcel.writeInt(this.f926l);
    }

    public N(Parcel parcel) {
        this.f918a = parcel.readString();
        this.f919b = parcel.readString();
        this.f920c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.f921e = parcel.readInt();
        this.f922f = parcel.readString();
        this.f923g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.f924j = parcel.readBundle();
        this.f925k = parcel.readInt() != 0;
        this.f927m = parcel.readBundle();
        this.f926l = parcel.readInt();
    }
}
