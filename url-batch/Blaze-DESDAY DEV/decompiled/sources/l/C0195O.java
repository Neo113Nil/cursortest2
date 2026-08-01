package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: l.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0195O extends View.BaseSavedState {
    public static final Parcelable.Creator<C0195O> CREATOR = new Q.k(13);

    /* renamed from: a, reason: collision with root package name */
    public boolean f2861a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f2861a ? (byte) 1 : (byte) 0);
    }
}
