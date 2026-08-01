package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class m0 extends View.BaseSavedState {
    public static final Parcelable.Creator<m0> CREATOR = new androidx.fragment.app.b(13);

    /* renamed from: f, reason: collision with root package name */
    public boolean f2507f;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f2507f ? (byte) 1 : (byte) 0);
    }
}
