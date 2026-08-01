package n0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e1 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6669a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f6669a) {
            case 0:
                return new f1(parcel.readFloat());
            case 1:
                return new g1(parcel.readInt());
            default:
                return new h1(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f6669a) {
            case 0:
                return new f1[i3];
            case 1:
                return new g1[i3];
            default:
                return new h1[i3];
        }
    }
}
