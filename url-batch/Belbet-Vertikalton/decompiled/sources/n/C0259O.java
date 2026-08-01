package n;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: n.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0259O extends View.BaseSavedState {
    public static final Parcelable.Creator<C0259O> CREATOR = new B0.b(14);

    /* renamed from: a, reason: collision with root package name */
    public boolean f3502a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f3502a ? (byte) 1 : (byte) 0);
    }
}
