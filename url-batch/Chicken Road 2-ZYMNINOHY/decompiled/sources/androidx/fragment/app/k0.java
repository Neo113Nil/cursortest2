package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class k0 implements Parcelable {
    public static final Parcelable.Creator<k0> CREATOR = new H.h(9);

    /* renamed from: a, reason: collision with root package name */
    public final String f4894a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4895b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4896c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4897d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4898e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4899f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4900g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4901h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f4902i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f4903j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4904k;

    /* renamed from: l, reason: collision with root package name */
    public final String f4905l;

    /* renamed from: m, reason: collision with root package name */
    public final int f4906m;
    public final boolean n;

    public k0(F f4) {
        this.f4894a = f4.getClass().getName();
        this.f4895b = f4.mWho;
        this.f4896c = f4.mFromLayout;
        this.f4897d = f4.mFragmentId;
        this.f4898e = f4.mContainerId;
        this.f4899f = f4.mTag;
        this.f4900g = f4.mRetainInstance;
        this.f4901h = f4.mRemoving;
        this.f4902i = f4.mDetached;
        this.f4903j = f4.mHidden;
        this.f4904k = f4.mMaxState.ordinal();
        this.f4905l = f4.mTargetWho;
        this.f4906m = f4.mTargetRequestCode;
        this.n = f4.mUserVisibleHint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f4894a);
        sb.append(" (");
        sb.append(this.f4895b);
        sb.append(")}:");
        if (this.f4896c) {
            sb.append(" fromLayout");
        }
        int i4 = this.f4898e;
        if (i4 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i4));
        }
        String str = this.f4899f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f4900g) {
            sb.append(" retainInstance");
        }
        if (this.f4901h) {
            sb.append(" removing");
        }
        if (this.f4902i) {
            sb.append(" detached");
        }
        if (this.f4903j) {
            sb.append(" hidden");
        }
        String str2 = this.f4905l;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f4906m);
        }
        if (this.n) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f4894a);
        parcel.writeString(this.f4895b);
        parcel.writeInt(this.f4896c ? 1 : 0);
        parcel.writeInt(this.f4897d);
        parcel.writeInt(this.f4898e);
        parcel.writeString(this.f4899f);
        parcel.writeInt(this.f4900g ? 1 : 0);
        parcel.writeInt(this.f4901h ? 1 : 0);
        parcel.writeInt(this.f4902i ? 1 : 0);
        parcel.writeInt(this.f4903j ? 1 : 0);
        parcel.writeInt(this.f4904k);
        parcel.writeString(this.f4905l);
        parcel.writeInt(this.f4906m);
        parcel.writeInt(this.n ? 1 : 0);
    }

    public k0(Parcel parcel) {
        this.f4894a = parcel.readString();
        this.f4895b = parcel.readString();
        this.f4896c = parcel.readInt() != 0;
        this.f4897d = parcel.readInt();
        this.f4898e = parcel.readInt();
        this.f4899f = parcel.readString();
        this.f4900g = parcel.readInt() != 0;
        this.f4901h = parcel.readInt() != 0;
        this.f4902i = parcel.readInt() != 0;
        this.f4903j = parcel.readInt() != 0;
        this.f4904k = parcel.readInt();
        this.f4905l = parcel.readString();
        this.f4906m = parcel.readInt();
        this.n = parcel.readInt() != 0;
    }
}
