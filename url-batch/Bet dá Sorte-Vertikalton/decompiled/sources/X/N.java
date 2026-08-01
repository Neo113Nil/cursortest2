package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class N implements Parcelable {
    public static final Parcelable.Creator<N> CREATOR = new A0.b(6);

    /* renamed from: a, reason: collision with root package name */
    public final String f932a;

    /* renamed from: b, reason: collision with root package name */
    public final String f933b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f934c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f935e;

    /* renamed from: f, reason: collision with root package name */
    public final String f936f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f937g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f938j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f939k;

    /* renamed from: l, reason: collision with root package name */
    public final int f940l;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f941m;

    public N(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        this.f932a = abstractComponentCallbacksC0047q.getClass().getName();
        this.f933b = abstractComponentCallbacksC0047q.f1057e;
        this.f934c = abstractComponentCallbacksC0047q.f1063m;
        this.d = abstractComponentCallbacksC0047q.f1072v;
        this.f935e = abstractComponentCallbacksC0047q.f1073w;
        this.f936f = abstractComponentCallbacksC0047q.f1074x;
        this.f937g = abstractComponentCallbacksC0047q.f1037A;
        this.h = abstractComponentCallbacksC0047q.f1062l;
        this.i = abstractComponentCallbacksC0047q.f1076z;
        this.f938j = abstractComponentCallbacksC0047q.f1058f;
        this.f939k = abstractComponentCallbacksC0047q.f1075y;
        this.f940l = abstractComponentCallbacksC0047q.f1047L.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f932a);
        sb.append(" (");
        sb.append(this.f933b);
        sb.append(")}:");
        if (this.f934c) {
            sb.append(" fromLayout");
        }
        int i = this.f935e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f936f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f937g) {
            sb.append(" retainInstance");
        }
        if (this.h) {
            sb.append(" removing");
        }
        if (this.i) {
            sb.append(" detached");
        }
        if (this.f939k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f932a);
        parcel.writeString(this.f933b);
        parcel.writeInt(this.f934c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f935e);
        parcel.writeString(this.f936f);
        parcel.writeInt(this.f937g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeBundle(this.f938j);
        parcel.writeInt(this.f939k ? 1 : 0);
        parcel.writeBundle(this.f941m);
        parcel.writeInt(this.f940l);
    }

    public N(Parcel parcel) {
        this.f932a = parcel.readString();
        this.f933b = parcel.readString();
        this.f934c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.f935e = parcel.readInt();
        this.f936f = parcel.readString();
        this.f937g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.f938j = parcel.readBundle();
        this.f939k = parcel.readInt() != 0;
        this.f941m = parcel.readBundle();
        this.f940l = parcel.readInt();
    }
}
