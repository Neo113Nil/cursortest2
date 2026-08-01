package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class N implements Parcelable {
    public static final Parcelable.Creator<N> CREATOR = new Q.k(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f889a;

    /* renamed from: b, reason: collision with root package name */
    public final String f890b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f891c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f892e;

    /* renamed from: f, reason: collision with root package name */
    public final String f893f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f894g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f895j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f896k;

    /* renamed from: l, reason: collision with root package name */
    public final int f897l;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f898m;

    public N(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        this.f889a = abstractComponentCallbacksC0048q.getClass().getName();
        this.f890b = abstractComponentCallbacksC0048q.f1011e;
        this.f891c = abstractComponentCallbacksC0048q.f1017m;
        this.d = abstractComponentCallbacksC0048q.f1026v;
        this.f892e = abstractComponentCallbacksC0048q.f1027w;
        this.f893f = abstractComponentCallbacksC0048q.f1028x;
        this.f894g = abstractComponentCallbacksC0048q.f991A;
        this.h = abstractComponentCallbacksC0048q.f1016l;
        this.i = abstractComponentCallbacksC0048q.f1030z;
        this.f895j = abstractComponentCallbacksC0048q.f1012f;
        this.f896k = abstractComponentCallbacksC0048q.f1029y;
        this.f897l = abstractComponentCallbacksC0048q.f1001L.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f889a);
        sb.append(" (");
        sb.append(this.f890b);
        sb.append(")}:");
        if (this.f891c) {
            sb.append(" fromLayout");
        }
        int i = this.f892e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f893f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f894g) {
            sb.append(" retainInstance");
        }
        if (this.h) {
            sb.append(" removing");
        }
        if (this.i) {
            sb.append(" detached");
        }
        if (this.f896k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f889a);
        parcel.writeString(this.f890b);
        parcel.writeInt(this.f891c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f892e);
        parcel.writeString(this.f893f);
        parcel.writeInt(this.f894g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeBundle(this.f895j);
        parcel.writeInt(this.f896k ? 1 : 0);
        parcel.writeBundle(this.f898m);
        parcel.writeInt(this.f897l);
    }

    public N(Parcel parcel) {
        this.f889a = parcel.readString();
        this.f890b = parcel.readString();
        this.f891c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.f892e = parcel.readInt();
        this.f893f = parcel.readString();
        this.f894g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.f895j = parcel.readBundle();
        this.f896k = parcel.readInt() != 0;
        this.f898m = parcel.readBundle();
        this.f897l = parcel.readInt();
    }
}
