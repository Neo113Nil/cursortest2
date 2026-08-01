package Z;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class N implements Parcelable {
    public static final Parcelable.Creator<N> CREATOR = new B0.b(6);

    /* renamed from: a, reason: collision with root package name */
    public final String f1482a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1483b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1484c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1485d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1486f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1487g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1488h;
    public final boolean i;
    public final Bundle j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1489k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1490l;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f1491m;

    public N(AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q) {
        this.f1482a = abstractComponentCallbacksC0053q.getClass().getName();
        this.f1483b = abstractComponentCallbacksC0053q.e;
        this.f1484c = abstractComponentCallbacksC0053q.f1617m;
        this.f1485d = abstractComponentCallbacksC0053q.f1626v;
        this.e = abstractComponentCallbacksC0053q.f1627w;
        this.f1486f = abstractComponentCallbacksC0053q.f1628x;
        this.f1487g = abstractComponentCallbacksC0053q.f1591A;
        this.f1488h = abstractComponentCallbacksC0053q.f1616l;
        this.i = abstractComponentCallbacksC0053q.f1630z;
        this.j = abstractComponentCallbacksC0053q.f1612f;
        this.f1489k = abstractComponentCallbacksC0053q.f1629y;
        this.f1490l = abstractComponentCallbacksC0053q.f1601L.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1482a);
        sb.append(" (");
        sb.append(this.f1483b);
        sb.append(")}:");
        if (this.f1484c) {
            sb.append(" fromLayout");
        }
        int i = this.e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f1486f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f1487g) {
            sb.append(" retainInstance");
        }
        if (this.f1488h) {
            sb.append(" removing");
        }
        if (this.i) {
            sb.append(" detached");
        }
        if (this.f1489k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1482a);
        parcel.writeString(this.f1483b);
        parcel.writeInt(this.f1484c ? 1 : 0);
        parcel.writeInt(this.f1485d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f1486f);
        parcel.writeInt(this.f1487g ? 1 : 0);
        parcel.writeInt(this.f1488h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeBundle(this.j);
        parcel.writeInt(this.f1489k ? 1 : 0);
        parcel.writeBundle(this.f1491m);
        parcel.writeInt(this.f1490l);
    }

    public N(Parcel parcel) {
        this.f1482a = parcel.readString();
        this.f1483b = parcel.readString();
        this.f1484c = parcel.readInt() != 0;
        this.f1485d = parcel.readInt();
        this.e = parcel.readInt();
        this.f1486f = parcel.readString();
        this.f1487g = parcel.readInt() != 0;
        this.f1488h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.j = parcel.readBundle();
        this.f1489k = parcel.readInt() != 0;
        this.f1491m = parcel.readBundle();
        this.f1490l = parcel.readInt();
    }
}
