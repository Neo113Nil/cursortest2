package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class X implements Parcelable {
    public static final Parcelable.Creator<X> CREATOR = new I1.c(8);

    /* renamed from: d, reason: collision with root package name */
    public final String f3654d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3655e;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3656i;

    /* renamed from: l, reason: collision with root package name */
    public final int f3657l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3658m;

    /* renamed from: n, reason: collision with root package name */
    public final String f3659n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f3660o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f3661p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f3662q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f3663r;

    /* renamed from: s, reason: collision with root package name */
    public final int f3664s;

    /* renamed from: t, reason: collision with root package name */
    public final String f3665t;

    /* renamed from: u, reason: collision with root package name */
    public final int f3666u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f3667v;

    public X(ComponentCallbacksC0228t componentCallbacksC0228t) {
        this.f3654d = componentCallbacksC0228t.getClass().getName();
        this.f3655e = componentCallbacksC0228t.f3803m;
        this.f3656i = componentCallbacksC0228t.f3812v;
        this.f3657l = componentCallbacksC0228t.f3779E;
        this.f3658m = componentCallbacksC0228t.f3780F;
        this.f3659n = componentCallbacksC0228t.f3781G;
        this.f3660o = componentCallbacksC0228t.f3784J;
        this.f3661p = componentCallbacksC0228t.f3810t;
        this.f3662q = componentCallbacksC0228t.f3783I;
        this.f3663r = componentCallbacksC0228t.f3782H;
        this.f3664s = componentCallbacksC0228t.f3793T.ordinal();
        this.f3665t = componentCallbacksC0228t.f3806p;
        this.f3666u = componentCallbacksC0228t.f3807q;
        this.f3667v = componentCallbacksC0228t.f3789O;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f3654d);
        sb.append(" (");
        sb.append(this.f3655e);
        sb.append(")}:");
        if (this.f3656i) {
            sb.append(" fromLayout");
        }
        int i2 = this.f3658m;
        if (i2 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i2));
        }
        String str = this.f3659n;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f3660o) {
            sb.append(" retainInstance");
        }
        if (this.f3661p) {
            sb.append(" removing");
        }
        if (this.f3662q) {
            sb.append(" detached");
        }
        if (this.f3663r) {
            sb.append(" hidden");
        }
        String str2 = this.f3665t;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f3666u);
        }
        if (this.f3667v) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f3654d);
        parcel.writeString(this.f3655e);
        parcel.writeInt(this.f3656i ? 1 : 0);
        parcel.writeInt(this.f3657l);
        parcel.writeInt(this.f3658m);
        parcel.writeString(this.f3659n);
        parcel.writeInt(this.f3660o ? 1 : 0);
        parcel.writeInt(this.f3661p ? 1 : 0);
        parcel.writeInt(this.f3662q ? 1 : 0);
        parcel.writeInt(this.f3663r ? 1 : 0);
        parcel.writeInt(this.f3664s);
        parcel.writeString(this.f3665t);
        parcel.writeInt(this.f3666u);
        parcel.writeInt(this.f3667v ? 1 : 0);
    }

    public X(Parcel parcel) {
        this.f3654d = parcel.readString();
        this.f3655e = parcel.readString();
        this.f3656i = parcel.readInt() != 0;
        this.f3657l = parcel.readInt();
        this.f3658m = parcel.readInt();
        this.f3659n = parcel.readString();
        this.f3660o = parcel.readInt() != 0;
        this.f3661p = parcel.readInt() != 0;
        this.f3662q = parcel.readInt() != 0;
        this.f3663r = parcel.readInt() != 0;
        this.f3664s = parcel.readInt();
        this.f3665t = parcel.readString();
        this.f3666u = parcel.readInt();
        this.f3667v = parcel.readInt() != 0;
    }
}
