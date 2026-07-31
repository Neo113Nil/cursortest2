package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.AbstractC1346l;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* loaded from: classes.dex */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    final String f12383b;

    /* renamed from: c, reason: collision with root package name */
    final String f12384c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f12385d;

    /* renamed from: e, reason: collision with root package name */
    final int f12386e;

    /* renamed from: f, reason: collision with root package name */
    final int f12387f;

    /* renamed from: g, reason: collision with root package name */
    final String f12388g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f12389h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f12390i;

    /* renamed from: j, reason: collision with root package name */
    final boolean f12391j;

    /* renamed from: k, reason: collision with root package name */
    final Bundle f12392k;

    /* renamed from: l, reason: collision with root package name */
    final boolean f12393l;

    /* renamed from: m, reason: collision with root package name */
    final int f12394m;

    /* renamed from: n, reason: collision with root package name */
    Bundle f12395n;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentState[] newArray(int i4) {
            return new FragmentState[i4];
        }
    }

    FragmentState(Fragment fragment) {
        this.f12383b = fragment.getClass().getName();
        this.f12384c = fragment.mWho;
        this.f12385d = fragment.mFromLayout;
        this.f12386e = fragment.mFragmentId;
        this.f12387f = fragment.mContainerId;
        this.f12388g = fragment.mTag;
        this.f12389h = fragment.mRetainInstance;
        this.f12390i = fragment.mRemoving;
        this.f12391j = fragment.mDetached;
        this.f12392k = fragment.mArguments;
        this.f12393l = fragment.mHidden;
        this.f12394m = fragment.mMaxState.ordinal();
    }

    Fragment a(l lVar, ClassLoader classLoader) {
        Fragment a4 = lVar.a(classLoader, this.f12383b);
        Bundle bundle = this.f12392k;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a4.setArguments(this.f12392k);
        a4.mWho = this.f12384c;
        a4.mFromLayout = this.f12385d;
        a4.mRestored = true;
        a4.mFragmentId = this.f12386e;
        a4.mContainerId = this.f12387f;
        a4.mTag = this.f12388g;
        a4.mRetainInstance = this.f12389h;
        a4.mRemoving = this.f12390i;
        a4.mDetached = this.f12391j;
        a4.mHidden = this.f12393l;
        a4.mMaxState = AbstractC1346l.b.values()[this.f12394m];
        Bundle bundle2 = this.f12395n;
        if (bundle2 != null) {
            a4.mSavedFragmentState = bundle2;
            return a4;
        }
        a4.mSavedFragmentState = new Bundle();
        return a4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(UserVerificationMethods.USER_VERIFY_PATTERN);
        sb.append("FragmentState{");
        sb.append(this.f12383b);
        sb.append(" (");
        sb.append(this.f12384c);
        sb.append(")}:");
        if (this.f12385d) {
            sb.append(" fromLayout");
        }
        if (this.f12387f != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f12387f));
        }
        String str = this.f12388g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f12388g);
        }
        if (this.f12389h) {
            sb.append(" retainInstance");
        }
        if (this.f12390i) {
            sb.append(" removing");
        }
        if (this.f12391j) {
            sb.append(" detached");
        }
        if (this.f12393l) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f12383b);
        parcel.writeString(this.f12384c);
        parcel.writeInt(this.f12385d ? 1 : 0);
        parcel.writeInt(this.f12386e);
        parcel.writeInt(this.f12387f);
        parcel.writeString(this.f12388g);
        parcel.writeInt(this.f12389h ? 1 : 0);
        parcel.writeInt(this.f12390i ? 1 : 0);
        parcel.writeInt(this.f12391j ? 1 : 0);
        parcel.writeBundle(this.f12392k);
        parcel.writeInt(this.f12393l ? 1 : 0);
        parcel.writeBundle(this.f12395n);
        parcel.writeInt(this.f12394m);
    }

    FragmentState(Parcel parcel) {
        this.f12383b = parcel.readString();
        this.f12384c = parcel.readString();
        this.f12385d = parcel.readInt() != 0;
        this.f12386e = parcel.readInt();
        this.f12387f = parcel.readInt();
        this.f12388g = parcel.readString();
        this.f12389h = parcel.readInt() != 0;
        this.f12390i = parcel.readInt() != 0;
        this.f12391j = parcel.readInt() != 0;
        this.f12392k = parcel.readBundle();
        this.f12393l = parcel.readInt() != 0;
        this.f12395n = parcel.readBundle();
        this.f12394m = parcel.readInt();
    }
}
