package k;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g0 extends K.c {
    public static final Parcelable.Creator<g0> CREATOR = new K.b(1);

    /* renamed from: h, reason: collision with root package name */
    public boolean f4995h;

    public g0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4995h = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f4995h + "}";
    }

    @Override // K.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeValue(Boolean.valueOf(this.f4995h));
    }
}
