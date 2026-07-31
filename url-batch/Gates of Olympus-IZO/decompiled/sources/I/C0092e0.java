package I;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: I.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0092e0 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2247a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2247a) {
            case 0:
                return new C0094f0(parcel.readFloat());
            case 1:
                return new C0096g0(parcel.readInt());
            default:
                return new C0098h0(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f2247a) {
            case 0:
                return new C0094f0[i3];
            case 1:
                return new C0096g0[i3];
            default:
                return new C0098h0[i3];
        }
    }
}
