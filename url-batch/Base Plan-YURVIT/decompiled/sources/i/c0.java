package i;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c0 extends E.c {
    public static final Parcelable.Creator<c0> CREATOR = new E.b(2);

    /* renamed from: g, reason: collision with root package name */
    public boolean f2188g;

    public c0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2188g = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f2188g + "}";
    }

    @Override // E.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeValue(Boolean.valueOf(this.f2188g));
    }
}
