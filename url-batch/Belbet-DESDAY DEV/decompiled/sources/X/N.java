package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class N implements Parcelable {
    public static final Parcelable.Creator<N> CREATOR = new Q.k(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f847a;

    /* renamed from: b, reason: collision with root package name */
    public final String f848b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f849c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f850e;

    /* renamed from: f, reason: collision with root package name */
    public final String f851f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f852g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f853j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f854k;

    /* renamed from: l, reason: collision with root package name */
    public final int f855l;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f856m;

    public N(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        this.f847a = abstractComponentCallbacksC0048q.getClass().getName();
        this.f848b = abstractComponentCallbacksC0048q.f972e;
        this.f849c = abstractComponentCallbacksC0048q.f978m;
        this.d = abstractComponentCallbacksC0048q.f987v;
        this.f850e = abstractComponentCallbacksC0048q.f988w;
        this.f851f = abstractComponentCallbacksC0048q.f989x;
        this.f852g = abstractComponentCallbacksC0048q.f952A;
        this.h = abstractComponentCallbacksC0048q.f977l;
        this.i = abstractComponentCallbacksC0048q.f991z;
        this.f853j = abstractComponentCallbacksC0048q.f973f;
        this.f854k = abstractComponentCallbacksC0048q.f990y;
        this.f855l = abstractComponentCallbacksC0048q.f962L.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f847a);
        sb.append(" (");
        sb.append(this.f848b);
        sb.append(")}:");
        if (this.f849c) {
            sb.append(" fromLayout");
        }
        int i = this.f850e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f851f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f852g) {
            sb.append(" retainInstance");
        }
        if (this.h) {
            sb.append(" removing");
        }
        if (this.i) {
            sb.append(" detached");
        }
        if (this.f854k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f847a);
        parcel.writeString(this.f848b);
        parcel.writeInt(this.f849c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f850e);
        parcel.writeString(this.f851f);
        parcel.writeInt(this.f852g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeBundle(this.f853j);
        parcel.writeInt(this.f854k ? 1 : 0);
        parcel.writeBundle(this.f856m);
        parcel.writeInt(this.f855l);
    }

    public N(Parcel parcel) {
        this.f847a = parcel.readString();
        this.f848b = parcel.readString();
        this.f849c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.f850e = parcel.readInt();
        this.f851f = parcel.readString();
        this.f852g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.f853j = parcel.readBundle();
        this.f854k = parcel.readInt() != 0;
        this.f856m = parcel.readBundle();
        this.f855l = parcel.readInt();
    }
}
