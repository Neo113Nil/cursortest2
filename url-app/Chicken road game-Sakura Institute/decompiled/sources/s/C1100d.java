package s;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: s.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1100d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C1101e(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        return new C1101e[i2];
    }
}
