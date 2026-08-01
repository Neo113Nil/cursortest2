package Z;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class N implements Parcelable {
    public static final Parcelable.Creator<N> CREATOR = new R.k(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f1051a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1052b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1053c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1054e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1055f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1056g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1057h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f1058j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1059k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1060l;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f1061m;

    public N(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        this.f1051a = abstractComponentCallbacksC0050q.getClass().getName();
        this.f1052b = abstractComponentCallbacksC0050q.f1182e;
        this.f1053c = abstractComponentCallbacksC0050q.f1189m;
        this.d = abstractComponentCallbacksC0050q.f1198v;
        this.f1054e = abstractComponentCallbacksC0050q.f1199w;
        this.f1055f = abstractComponentCallbacksC0050q.f1200x;
        this.f1056g = abstractComponentCallbacksC0050q.f1162A;
        this.f1057h = abstractComponentCallbacksC0050q.f1188l;
        this.i = abstractComponentCallbacksC0050q.f1202z;
        this.f1058j = abstractComponentCallbacksC0050q.f1183f;
        this.f1059k = abstractComponentCallbacksC0050q.f1201y;
        this.f1060l = abstractComponentCallbacksC0050q.f1172L.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1051a);
        sb.append(" (");
        sb.append(this.f1052b);
        sb.append(")}:");
        if (this.f1053c) {
            sb.append(" fromLayout");
        }
        int i = this.f1054e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f1055f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f1056g) {
            sb.append(" retainInstance");
        }
        if (this.f1057h) {
            sb.append(" removing");
        }
        if (this.i) {
            sb.append(" detached");
        }
        if (this.f1059k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1051a);
        parcel.writeString(this.f1052b);
        parcel.writeInt(this.f1053c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f1054e);
        parcel.writeString(this.f1055f);
        parcel.writeInt(this.f1056g ? 1 : 0);
        parcel.writeInt(this.f1057h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeBundle(this.f1058j);
        parcel.writeInt(this.f1059k ? 1 : 0);
        parcel.writeBundle(this.f1061m);
        parcel.writeInt(this.f1060l);
    }

    public N(Parcel parcel) {
        this.f1051a = parcel.readString();
        this.f1052b = parcel.readString();
        this.f1053c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.f1054e = parcel.readInt();
        this.f1055f = parcel.readString();
        this.f1056g = parcel.readInt() != 0;
        this.f1057h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.f1058j = parcel.readBundle();
        this.f1059k = parcel.readInt() != 0;
        this.f1061m = parcel.readBundle();
        this.f1060l = parcel.readInt();
    }
}
