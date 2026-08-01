package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class o0 implements Parcelable {
    public static final Parcelable.Creator<o0> CREATOR = new b(4);

    /* renamed from: f, reason: collision with root package name */
    public final String f595f;

    /* renamed from: g, reason: collision with root package name */
    public final String f596g;
    public final boolean h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f597j;

    /* renamed from: k, reason: collision with root package name */
    public final String f598k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f599l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f600m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f601n;

    /* renamed from: o, reason: collision with root package name */
    public final Bundle f602o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f603p;

    /* renamed from: q, reason: collision with root package name */
    public final int f604q;

    /* renamed from: r, reason: collision with root package name */
    public Bundle f605r;

    public o0(u uVar) {
        this.f595f = uVar.getClass().getName();
        this.f596g = uVar.f646j;
        this.h = uVar.f654r;
        this.i = uVar.A;
        this.f597j = uVar.B;
        this.f598k = uVar.C;
        this.f599l = uVar.F;
        this.f600m = uVar.f653q;
        this.f601n = uVar.E;
        this.f602o = uVar.f647k;
        this.f603p = uVar.D;
        this.f604q = uVar.Q.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f595f);
        sb.append(" (");
        sb.append(this.f596g);
        sb.append(")}:");
        if (this.h) {
            sb.append(" fromLayout");
        }
        int i = this.f597j;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f598k;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f599l) {
            sb.append(" retainInstance");
        }
        if (this.f600m) {
            sb.append(" removing");
        }
        if (this.f601n) {
            sb.append(" detached");
        }
        if (this.f603p) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f595f);
        parcel.writeString(this.f596g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i);
        parcel.writeInt(this.f597j);
        parcel.writeString(this.f598k);
        parcel.writeInt(this.f599l ? 1 : 0);
        parcel.writeInt(this.f600m ? 1 : 0);
        parcel.writeInt(this.f601n ? 1 : 0);
        parcel.writeBundle(this.f602o);
        parcel.writeInt(this.f603p ? 1 : 0);
        parcel.writeBundle(this.f605r);
        parcel.writeInt(this.f604q);
    }

    public o0(Parcel parcel) {
        this.f595f = parcel.readString();
        this.f596g = parcel.readString();
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt();
        this.f597j = parcel.readInt();
        this.f598k = parcel.readString();
        this.f599l = parcel.readInt() != 0;
        this.f600m = parcel.readInt() != 0;
        this.f601n = parcel.readInt() != 0;
        this.f602o = parcel.readBundle();
        this.f603p = parcel.readInt() != 0;
        this.f605r = parcel.readBundle();
        this.f604q = parcel.readInt();
    }
}
