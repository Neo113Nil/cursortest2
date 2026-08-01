package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: l.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0194N extends View.BaseSavedState {
    public static final Parcelable.Creator<C0194N> CREATOR = new A0.b(14);

    /* renamed from: a, reason: collision with root package name */
    public boolean f2876a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f2876a ? (byte) 1 : (byte) 0);
    }
}
