package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class N implements Parcelable {
    public static final Parcelable.Creator<N> CREATOR = new Q.k(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f846a;

    /* renamed from: b, reason: collision with root package name */
    public final String f847b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f848c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f849e;

    /* renamed from: f, reason: collision with root package name */
    public final String f850f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f851g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f852j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f853k;

    /* renamed from: l, reason: collision with root package name */
    public final int f854l;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f855m;

    public N(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        this.f846a = abstractComponentCallbacksC0048q.getClass().getName();
        this.f847b = abstractComponentCallbacksC0048q.f971e;
        this.f848c = abstractComponentCallbacksC0048q.f977m;
        this.d = abstractComponentCallbacksC0048q.f986v;
        this.f849e = abstractComponentCallbacksC0048q.f987w;
        this.f850f = abstractComponentCallbacksC0048q.f988x;
        this.f851g = abstractComponentCallbacksC0048q.f951A;
        this.h = abstractComponentCallbacksC0048q.f976l;
        this.i = abstractComponentCallbacksC0048q.f990z;
        this.f852j = abstractComponentCallbacksC0048q.f972f;
        this.f853k = abstractComponentCallbacksC0048q.f989y;
        this.f854l = abstractComponentCallbacksC0048q.f961L.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f846a);
        sb.append(" (");
        sb.append(this.f847b);
        sb.append(")}:");
        if (this.f848c) {
            sb.append(" fromLayout");
        }
        int i = this.f849e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f850f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f851g) {
            sb.append(" retainInstance");
        }
        if (this.h) {
            sb.append(" removing");
        }
        if (this.i) {
            sb.append(" detached");
        }
        if (this.f853k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f846a);
        parcel.writeString(this.f847b);
        parcel.writeInt(this.f848c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f849e);
        parcel.writeString(this.f850f);
        parcel.writeInt(this.f851g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeBundle(this.f852j);
        parcel.writeInt(this.f853k ? 1 : 0);
        parcel.writeBundle(this.f855m);
        parcel.writeInt(this.f854l);
    }

    public N(Parcel parcel) {
        this.f846a = parcel.readString();
        this.f847b = parcel.readString();
        this.f848c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.f849e = parcel.readInt();
        this.f850f = parcel.readString();
        this.f851g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.f852j = parcel.readBundle();
        this.f853k = parcel.readInt() != 0;
        this.f855m = parcel.readBundle();
        this.f854l = parcel.readInt();
    }
}
