package H;

import E.AbstractC0005f;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class i extends View.BaseSavedState {
    public static final Parcelable.Creator<i> CREATOR = new h(0);

    /* renamed from: a, reason: collision with root package name */
    public int f1076a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" scrollPosition=");
        return AbstractC0005f.o(sb, this.f1076a, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeInt(this.f1076a);
    }
}
