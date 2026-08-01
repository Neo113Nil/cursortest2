package Y;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class N implements Parcelable {
    public static final Parcelable.Creator<N> CREATOR = new F0.b(6);

    /* renamed from: a, reason: collision with root package name */
    public final String f1337a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1338b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1339c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1340e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1341f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1342g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f1343j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1344k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1345l;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f1346m;

    public N(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        this.f1337a = abstractComponentCallbacksC0050q.getClass().getName();
        this.f1338b = abstractComponentCallbacksC0050q.f1462e;
        this.f1339c = abstractComponentCallbacksC0050q.f1468m;
        this.d = abstractComponentCallbacksC0050q.f1477v;
        this.f1340e = abstractComponentCallbacksC0050q.f1478w;
        this.f1341f = abstractComponentCallbacksC0050q.f1479x;
        this.f1342g = abstractComponentCallbacksC0050q.f1442A;
        this.h = abstractComponentCallbacksC0050q.f1467l;
        this.i = abstractComponentCallbacksC0050q.f1481z;
        this.f1343j = abstractComponentCallbacksC0050q.f1463f;
        this.f1344k = abstractComponentCallbacksC0050q.f1480y;
        this.f1345l = abstractComponentCallbacksC0050q.f1452L.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1337a);
        sb.append(" (");
        sb.append(this.f1338b);
        sb.append(")}:");
        if (this.f1339c) {
            sb.append(" fromLayout");
        }
        int i = this.f1340e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f1341f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f1342g) {
            sb.append(" retainInstance");
        }
        if (this.h) {
            sb.append(" removing");
        }
        if (this.i) {
            sb.append(" detached");
        }
        if (this.f1344k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1337a);
        parcel.writeString(this.f1338b);
        parcel.writeInt(this.f1339c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f1340e);
        parcel.writeString(this.f1341f);
        parcel.writeInt(this.f1342g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeBundle(this.f1343j);
        parcel.writeInt(this.f1344k ? 1 : 0);
        parcel.writeBundle(this.f1346m);
        parcel.writeInt(this.f1345l);
    }

    public N(Parcel parcel) {
        this.f1337a = parcel.readString();
        this.f1338b = parcel.readString();
        this.f1339c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.f1340e = parcel.readInt();
        this.f1341f = parcel.readString();
        this.f1342g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.f1343j = parcel.readBundle();
        this.f1344k = parcel.readInt() != 0;
        this.f1346m = parcel.readBundle();
        this.f1345l = parcel.readInt();
    }
}
