package m;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: m.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0197O extends View.BaseSavedState {
    public static final Parcelable.Creator<C0197O> CREATOR = new R.k(13);

    /* renamed from: a, reason: collision with root package name */
    public boolean f2971a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f2971a ? (byte) 1 : (byte) 0);
    }
}
