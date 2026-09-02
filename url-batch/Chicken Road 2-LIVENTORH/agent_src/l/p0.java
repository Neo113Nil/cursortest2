package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class p0 extends View.BaseSavedState {
    public static final Parcelable.Creator<p0> CREATOR = new androidx.fragment.app.b(14);

    /* renamed from: f, reason: collision with root package name */
    public boolean f2415f;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f2415f ? (byte) 1 : (byte) 0);
    }
}
