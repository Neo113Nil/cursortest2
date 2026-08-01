package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class O extends View.BaseSavedState {
    public static final Parcelable.Creator<O> CREATOR = new S.k(13);

    /* renamed from: a, reason: collision with root package name */
    public boolean f2915a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f2915a ? (byte) 1 : (byte) 0);
    }
}
