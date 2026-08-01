package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class Q implements Parcelable {
    public static final Parcelable.Creator<Q> CREATOR = new Q.k(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f1262a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1263b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1264c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1265d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1266e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1267f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1268g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f1269j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1270k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1271l;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f1272m;

    public Q(AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q) {
        this.f1262a = abstractComponentCallbacksC0060q.getClass().getName();
        this.f1263b = abstractComponentCallbacksC0060q.f1399e;
        this.f1264c = abstractComponentCallbacksC0060q.f1405m;
        this.f1265d = abstractComponentCallbacksC0060q.f1414v;
        this.f1266e = abstractComponentCallbacksC0060q.f1415w;
        this.f1267f = abstractComponentCallbacksC0060q.f1416x;
        this.f1268g = abstractComponentCallbacksC0060q.f1378A;
        this.h = abstractComponentCallbacksC0060q.f1404l;
        this.i = abstractComponentCallbacksC0060q.f1418z;
        this.f1269j = abstractComponentCallbacksC0060q.f1400f;
        this.f1270k = abstractComponentCallbacksC0060q.f1417y;
        this.f1271l = abstractComponentCallbacksC0060q.f1388L.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1262a);
        sb.append(" (");
        sb.append(this.f1263b);
        sb.append(")}:");
        if (this.f1264c) {
            sb.append(" fromLayout");
        }
        int i = this.f1266e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f1267f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f1268g) {
            sb.append(" retainInstance");
        }
        if (this.h) {
            sb.append(" removing");
        }
        if (this.i) {
            sb.append(" detached");
        }
        if (this.f1270k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1262a);
        parcel.writeString(this.f1263b);
        parcel.writeInt(this.f1264c ? 1 : 0);
        parcel.writeInt(this.f1265d);
        parcel.writeInt(this.f1266e);
        parcel.writeString(this.f1267f);
        parcel.writeInt(this.f1268g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeBundle(this.f1269j);
        parcel.writeInt(this.f1270k ? 1 : 0);
        parcel.writeBundle(this.f1272m);
        parcel.writeInt(this.f1271l);
    }

    public Q(Parcel parcel) {
        this.f1262a = parcel.readString();
        this.f1263b = parcel.readString();
        this.f1264c = parcel.readInt() != 0;
        this.f1265d = parcel.readInt();
        this.f1266e = parcel.readInt();
        this.f1267f = parcel.readString();
        this.f1268g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.f1269j = parcel.readBundle();
        this.f1270k = parcel.readInt() != 0;
        this.f1272m = parcel.readBundle();
        this.f1271l = parcel.readInt();
    }
}
