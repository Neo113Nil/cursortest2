package k;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: k.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1203a0 extends J.c {
    public static final Parcelable.Creator<C1203a0> CREATOR = new J.b(2);

    /* renamed from: c, reason: collision with root package name */
    public boolean f13969c;

    public C1203a0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f13969c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f13969c + "}";
    }

    @Override // J.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeValue(Boolean.valueOf(this.f13969c));
    }
}
