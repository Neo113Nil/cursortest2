package G0;

import android.os.Parcel;
import android.os.Parcelable;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class i extends V.b {
    public static final Parcelable.Creator<i> CREATOR = new B.g(3);

    /* renamed from: v, reason: collision with root package name */
    public int f1191v;

    /* renamed from: w, reason: collision with root package name */
    public Parcelable f1192w;

    public i(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? i.class.getClassLoader() : classLoader;
        this.f1191v = parcel.readInt();
        this.f1192w = parcel.readParcelable(classLoader);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" position=");
        return AbstractC5051n.e(this.f1191v, "}", sb);
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f1191v);
        parcel.writeParcelable(this.f1192w, i);
    }
}
