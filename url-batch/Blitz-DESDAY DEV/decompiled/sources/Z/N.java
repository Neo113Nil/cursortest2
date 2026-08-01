package Z;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class N implements Parcelable {
    public static final Parcelable.Creator<N> CREATOR = new S.k(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f1067a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1068b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1069c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1070e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1071f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1072g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f1073j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1074k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1075l;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f1076m;

    public N(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        this.f1067a = abstractComponentCallbacksC0047q.getClass().getName();
        this.f1068b = abstractComponentCallbacksC0047q.f1192e;
        this.f1069c = abstractComponentCallbacksC0047q.f1198m;
        this.d = abstractComponentCallbacksC0047q.f1207v;
        this.f1070e = abstractComponentCallbacksC0047q.f1208w;
        this.f1071f = abstractComponentCallbacksC0047q.f1209x;
        this.f1072g = abstractComponentCallbacksC0047q.f1172A;
        this.h = abstractComponentCallbacksC0047q.f1197l;
        this.i = abstractComponentCallbacksC0047q.f1211z;
        this.f1073j = abstractComponentCallbacksC0047q.f1193f;
        this.f1074k = abstractComponentCallbacksC0047q.f1210y;
        this.f1075l = abstractComponentCallbacksC0047q.f1182L.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1067a);
        sb.append(" (");
        sb.append(this.f1068b);
        sb.append(")}:");
        if (this.f1069c) {
            sb.append(" fromLayout");
        }
        int i = this.f1070e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f1071f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f1072g) {
            sb.append(" retainInstance");
        }
        if (this.h) {
            sb.append(" removing");
        }
        if (this.i) {
            sb.append(" detached");
        }
        if (this.f1074k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1067a);
        parcel.writeString(this.f1068b);
        parcel.writeInt(this.f1069c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f1070e);
        parcel.writeString(this.f1071f);
        parcel.writeInt(this.f1072g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeBundle(this.f1073j);
        parcel.writeInt(this.f1074k ? 1 : 0);
        parcel.writeBundle(this.f1076m);
        parcel.writeInt(this.f1075l);
    }

    public N(Parcel parcel) {
        this.f1067a = parcel.readString();
        this.f1068b = parcel.readString();
        this.f1069c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.f1070e = parcel.readInt();
        this.f1071f = parcel.readString();
        this.f1072g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.f1073j = parcel.readBundle();
        this.f1074k = parcel.readInt() != 0;
        this.f1076m = parcel.readBundle();
        this.f1075l = parcel.readInt();
    }
}
