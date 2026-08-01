package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class Q implements Parcelable {
    public static final Parcelable.Creator<Q> CREATOR = new Q.k(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f1261a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1262b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1263c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1264d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1265e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1266f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1267g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f1268j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1269k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1270l;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f1271m;

    public Q(AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q) {
        this.f1261a = abstractComponentCallbacksC0060q.getClass().getName();
        this.f1262b = abstractComponentCallbacksC0060q.f1398e;
        this.f1263c = abstractComponentCallbacksC0060q.f1404m;
        this.f1264d = abstractComponentCallbacksC0060q.f1413v;
        this.f1265e = abstractComponentCallbacksC0060q.f1414w;
        this.f1266f = abstractComponentCallbacksC0060q.f1415x;
        this.f1267g = abstractComponentCallbacksC0060q.f1377A;
        this.h = abstractComponentCallbacksC0060q.f1403l;
        this.i = abstractComponentCallbacksC0060q.f1417z;
        this.f1268j = abstractComponentCallbacksC0060q.f1399f;
        this.f1269k = abstractComponentCallbacksC0060q.f1416y;
        this.f1270l = abstractComponentCallbacksC0060q.f1387L.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1261a);
        sb.append(" (");
        sb.append(this.f1262b);
        sb.append(")}:");
        if (this.f1263c) {
            sb.append(" fromLayout");
        }
        int i = this.f1265e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f1266f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f1267g) {
            sb.append(" retainInstance");
        }
        if (this.h) {
            sb.append(" removing");
        }
        if (this.i) {
            sb.append(" detached");
        }
        if (this.f1269k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1261a);
        parcel.writeString(this.f1262b);
        parcel.writeInt(this.f1263c ? 1 : 0);
        parcel.writeInt(this.f1264d);
        parcel.writeInt(this.f1265e);
        parcel.writeString(this.f1266f);
        parcel.writeInt(this.f1267g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeBundle(this.f1268j);
        parcel.writeInt(this.f1269k ? 1 : 0);
        parcel.writeBundle(this.f1271m);
        parcel.writeInt(this.f1270l);
    }

    public Q(Parcel parcel) {
        this.f1261a = parcel.readString();
        this.f1262b = parcel.readString();
        this.f1263c = parcel.readInt() != 0;
        this.f1264d = parcel.readInt();
        this.f1265e = parcel.readInt();
        this.f1266f = parcel.readString();
        this.f1267g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.f1268j = parcel.readBundle();
        this.f1269k = parcel.readInt() != 0;
        this.f1271m = parcel.readBundle();
        this.f1270l = parcel.readInt();
    }
}
