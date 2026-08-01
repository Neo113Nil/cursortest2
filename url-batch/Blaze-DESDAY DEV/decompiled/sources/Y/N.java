package Y;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class N implements Parcelable {
    public static final Parcelable.Creator<N> CREATOR = new Q.k(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f1005a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1006b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1007c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1008e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1009f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1010g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f1011j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1012k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1013l;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f1014m;

    public N(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        this.f1005a = abstractComponentCallbacksC0051q.getClass().getName();
        this.f1006b = abstractComponentCallbacksC0051q.f1130e;
        this.f1007c = abstractComponentCallbacksC0051q.f1136m;
        this.d = abstractComponentCallbacksC0051q.f1145v;
        this.f1008e = abstractComponentCallbacksC0051q.f1146w;
        this.f1009f = abstractComponentCallbacksC0051q.f1147x;
        this.f1010g = abstractComponentCallbacksC0051q.f1110A;
        this.h = abstractComponentCallbacksC0051q.f1135l;
        this.i = abstractComponentCallbacksC0051q.f1149z;
        this.f1011j = abstractComponentCallbacksC0051q.f1131f;
        this.f1012k = abstractComponentCallbacksC0051q.f1148y;
        this.f1013l = abstractComponentCallbacksC0051q.f1120L.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1005a);
        sb.append(" (");
        sb.append(this.f1006b);
        sb.append(")}:");
        if (this.f1007c) {
            sb.append(" fromLayout");
        }
        int i = this.f1008e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f1009f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f1010g) {
            sb.append(" retainInstance");
        }
        if (this.h) {
            sb.append(" removing");
        }
        if (this.i) {
            sb.append(" detached");
        }
        if (this.f1012k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1005a);
        parcel.writeString(this.f1006b);
        parcel.writeInt(this.f1007c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f1008e);
        parcel.writeString(this.f1009f);
        parcel.writeInt(this.f1010g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeBundle(this.f1011j);
        parcel.writeInt(this.f1012k ? 1 : 0);
        parcel.writeBundle(this.f1014m);
        parcel.writeInt(this.f1013l);
    }

    public N(Parcel parcel) {
        this.f1005a = parcel.readString();
        this.f1006b = parcel.readString();
        this.f1007c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.f1008e = parcel.readInt();
        this.f1009f = parcel.readString();
        this.f1010g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.f1011j = parcel.readBundle();
        this.f1012k = parcel.readInt() != 0;
        this.f1014m = parcel.readBundle();
        this.f1013l = parcel.readInt();
    }
}
