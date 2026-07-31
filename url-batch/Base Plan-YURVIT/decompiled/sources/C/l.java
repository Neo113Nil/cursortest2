package C;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class l extends View.BaseSavedState {
    public static final Parcelable.Creator<l> CREATOR = new k(0);

    /* renamed from: e, reason: collision with root package name */
    public int f179e;

    public final String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f179e + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f179e);
    }
}
