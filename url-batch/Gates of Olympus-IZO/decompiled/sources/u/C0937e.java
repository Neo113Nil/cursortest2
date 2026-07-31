package u;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: u.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0937e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C0938f(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        return new C0938f[i3];
    }
}
