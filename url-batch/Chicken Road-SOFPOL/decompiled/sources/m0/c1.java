package m0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c1 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4884a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f4884a) {
            case 0:
                return new d1(parcel.readFloat());
            case 1:
                return new e1(parcel.readInt());
            default:
                return new f1(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f4884a) {
            case 0:
                return new d1[i];
            case 1:
                return new e1[i];
            default:
                return new f1[i];
        }
    }
}
