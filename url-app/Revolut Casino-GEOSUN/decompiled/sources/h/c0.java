package h;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c0 extends C.c {
    public static final Parcelable.Creator<c0> CREATOR = new C.b(2);

    /* renamed from: c, reason: collision with root package name */
    public boolean f2160c;

    public c0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2160c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f2160c + "}";
    }

    @Override // C.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeValue(Boolean.valueOf(this.f2160c));
    }
}
