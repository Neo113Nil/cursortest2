package k;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class m0 extends View.BaseSavedState {
    public static final Parcelable.Creator<m0> CREATOR = new androidx.fragment.app.b(13);

    /* renamed from: f, reason: collision with root package name */
    public boolean f2600f;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeByte(this.f2600f ? (byte) 1 : (byte) 0);
    }
}
