package j;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e0 extends H.c {
    public static final Parcelable.Creator<e0> CREATOR = new H.b(2);

    /* renamed from: c, reason: collision with root package name */
    public boolean f2933c;

    public e0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2933c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f2933c + "}";
    }

    @Override // H.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeValue(Boolean.valueOf(this.f2933c));
    }
}
