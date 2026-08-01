package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: l.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0246Q extends View.BaseSavedState {
    public static final Parcelable.Creator<C0246Q> CREATOR = new Q.k(14);

    /* renamed from: a, reason: collision with root package name */
    public boolean f3285a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f3285a ? (byte) 1 : (byte) 0);
    }
}
