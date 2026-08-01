package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class N implements Parcelable {
    public static final Parcelable.Creator<N> CREATOR = new Q.k(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f958a;

    /* renamed from: b, reason: collision with root package name */
    public final String f959b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f960c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f961e;

    /* renamed from: f, reason: collision with root package name */
    public final String f962f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f963g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f964j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f965k;

    /* renamed from: l, reason: collision with root package name */
    public final int f966l;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f967m;

    public N(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        this.f958a = abstractComponentCallbacksC0048q.getClass().getName();
        this.f959b = abstractComponentCallbacksC0048q.f1083e;
        this.f960c = abstractComponentCallbacksC0048q.f1089m;
        this.d = abstractComponentCallbacksC0048q.f1098v;
        this.f961e = abstractComponentCallbacksC0048q.f1099w;
        this.f962f = abstractComponentCallbacksC0048q.f1100x;
        this.f963g = abstractComponentCallbacksC0048q.f1063A;
        this.h = abstractComponentCallbacksC0048q.f1088l;
        this.i = abstractComponentCallbacksC0048q.f1102z;
        this.f964j = abstractComponentCallbacksC0048q.f1084f;
        this.f965k = abstractComponentCallbacksC0048q.f1101y;
        this.f966l = abstractComponentCallbacksC0048q.f1073L.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f958a);
        sb.append(" (");
        sb.append(this.f959b);
        sb.append(")}:");
        if (this.f960c) {
            sb.append(" fromLayout");
        }
        int i = this.f961e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f962f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f963g) {
            sb.append(" retainInstance");
        }
        if (this.h) {
            sb.append(" removing");
        }
        if (this.i) {
            sb.append(" detached");
        }
        if (this.f965k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f958a);
        parcel.writeString(this.f959b);
        parcel.writeInt(this.f960c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f961e);
        parcel.writeString(this.f962f);
        parcel.writeInt(this.f963g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeBundle(this.f964j);
        parcel.writeInt(this.f965k ? 1 : 0);
        parcel.writeBundle(this.f967m);
        parcel.writeInt(this.f966l);
    }

    public N(Parcel parcel) {
        this.f958a = parcel.readString();
        this.f959b = parcel.readString();
        this.f960c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.f961e = parcel.readInt();
        this.f962f = parcel.readString();
        this.f963g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.f964j = parcel.readBundle();
        this.f965k = parcel.readInt() != 0;
        this.f967m = parcel.readBundle();
        this.f966l = parcel.readInt();
    }
}
