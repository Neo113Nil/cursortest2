package t3;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import c7.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g extends View.BaseSavedState {
    public static final Parcelable.Creator<g> CREATOR = new p(23);

    /* renamed from: d, reason: collision with root package name */
    public int f9273d;

    public final String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f9273d + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.f9273d);
    }
}
