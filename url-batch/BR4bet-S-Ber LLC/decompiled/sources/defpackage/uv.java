package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class uv extends View.BaseSavedState {
    public static final Parcelable.Creator<uv> CREATOR = new s1(10);
    public int f;

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i = this.f;
        sb.append(i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked");
        sb.append("}");
        return sb.toString();
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.f));
    }
}
