package Y;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class N implements Parcelable {
    public static final Parcelable.Creator<N> CREATOR = new Q.k(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f978a;

    /* renamed from: b, reason: collision with root package name */
    public final String f979b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f980c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f981e;

    /* renamed from: f, reason: collision with root package name */
    public final String f982f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f983g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f984j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f985k;

    /* renamed from: l, reason: collision with root package name */
    public final int f986l;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f987m;

    public N(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        this.f978a = abstractComponentCallbacksC0051q.getClass().getName();
        this.f979b = abstractComponentCallbacksC0051q.f1103e;
        this.f980c = abstractComponentCallbacksC0051q.f1109m;
        this.d = abstractComponentCallbacksC0051q.f1118v;
        this.f981e = abstractComponentCallbacksC0051q.f1119w;
        this.f982f = abstractComponentCallbacksC0051q.f1120x;
        this.f983g = abstractComponentCallbacksC0051q.f1083A;
        this.h = abstractComponentCallbacksC0051q.f1108l;
        this.i = abstractComponentCallbacksC0051q.f1122z;
        this.f984j = abstractComponentCallbacksC0051q.f1104f;
        this.f985k = abstractComponentCallbacksC0051q.f1121y;
        this.f986l = abstractComponentCallbacksC0051q.f1093L.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f978a);
        sb.append(" (");
        sb.append(this.f979b);
        sb.append(")}:");
        if (this.f980c) {
            sb.append(" fromLayout");
        }
        int i = this.f981e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f982f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f983g) {
            sb.append(" retainInstance");
        }
        if (this.h) {
            sb.append(" removing");
        }
        if (this.i) {
            sb.append(" detached");
        }
        if (this.f985k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f978a);
        parcel.writeString(this.f979b);
        parcel.writeInt(this.f980c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f981e);
        parcel.writeString(this.f982f);
        parcel.writeInt(this.f983g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeBundle(this.f984j);
        parcel.writeInt(this.f985k ? 1 : 0);
        parcel.writeBundle(this.f987m);
        parcel.writeInt(this.f986l);
    }

    public N(Parcel parcel) {
        this.f978a = parcel.readString();
        this.f979b = parcel.readString();
        this.f980c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.f981e = parcel.readInt();
        this.f982f = parcel.readString();
        this.f983g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.f984j = parcel.readBundle();
        this.f985k = parcel.readInt() != 0;
        this.f987m = parcel.readBundle();
        this.f986l = parcel.readInt();
    }
}
