package n;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class P extends View.BaseSavedState {
    public static final Parcelable.Creator<P> CREATOR = new I1.c(16);

    /* renamed from: d, reason: collision with root package name */
    public boolean f6689d;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeByte(this.f6689d ? (byte) 1 : (byte) 0);
    }
}
