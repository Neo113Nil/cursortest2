package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class N implements Parcelable {
    public static final Parcelable.Creator<N> CREATOR = new C0.b(6);

    /* renamed from: a, reason: collision with root package name */
    public final String f984a;

    /* renamed from: b, reason: collision with root package name */
    public final String f985b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f986c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f987e;

    /* renamed from: f, reason: collision with root package name */
    public final String f988f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f989g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f990j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f991k;

    /* renamed from: l, reason: collision with root package name */
    public final int f992l;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f993m;

    public N(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        this.f984a = abstractComponentCallbacksC0048q.getClass().getName();
        this.f985b = abstractComponentCallbacksC0048q.f1109e;
        this.f986c = abstractComponentCallbacksC0048q.f1115m;
        this.d = abstractComponentCallbacksC0048q.f1124v;
        this.f987e = abstractComponentCallbacksC0048q.f1125w;
        this.f988f = abstractComponentCallbacksC0048q.f1126x;
        this.f989g = abstractComponentCallbacksC0048q.f1089A;
        this.h = abstractComponentCallbacksC0048q.f1114l;
        this.i = abstractComponentCallbacksC0048q.f1128z;
        this.f990j = abstractComponentCallbacksC0048q.f1110f;
        this.f991k = abstractComponentCallbacksC0048q.f1127y;
        this.f992l = abstractComponentCallbacksC0048q.f1099L.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f984a);
        sb.append(" (");
        sb.append(this.f985b);
        sb.append(")}:");
        if (this.f986c) {
            sb.append(" fromLayout");
        }
        int i = this.f987e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f988f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f989g) {
            sb.append(" retainInstance");
        }
        if (this.h) {
            sb.append(" removing");
        }
        if (this.i) {
            sb.append(" detached");
        }
        if (this.f991k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f984a);
        parcel.writeString(this.f985b);
        parcel.writeInt(this.f986c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f987e);
        parcel.writeString(this.f988f);
        parcel.writeInt(this.f989g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeBundle(this.f990j);
        parcel.writeInt(this.f991k ? 1 : 0);
        parcel.writeBundle(this.f993m);
        parcel.writeInt(this.f992l);
    }

    public N(Parcel parcel) {
        this.f984a = parcel.readString();
        this.f985b = parcel.readString();
        this.f986c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.f987e = parcel.readInt();
        this.f988f = parcel.readString();
        this.f989g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.f990j = parcel.readBundle();
        this.f991k = parcel.readInt() != 0;
        this.f993m = parcel.readBundle();
        this.f992l = parcel.readInt();
    }
}
