package m;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import f3.C4509h;

/* loaded from: classes.dex */
public final class M extends View.BaseSavedState {
    public static final Parcelable.Creator<M> CREATOR = new C4509h(1);

    /* renamed from: n, reason: collision with root package name */
    public boolean f39303n;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f39303n ? (byte) 1 : (byte) 0);
    }
}
