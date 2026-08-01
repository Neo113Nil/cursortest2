package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: l.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0220P extends View.BaseSavedState {
    public static final Parcelable.Creator<C0220P> CREATOR = new Q.k(13);

    /* renamed from: a, reason: collision with root package name */
    public boolean f2897a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f2897a ? (byte) 1 : (byte) 0);
    }
}
