package G;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: G.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0195e0 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2801a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2801a) {
            case 0:
                return new C0197f0(parcel.readFloat());
            case 1:
                return new C0199g0(parcel.readInt());
            default:
                return new C0201h0(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f2801a) {
            case 0:
                return new C0197f0[i2];
            case 1:
                return new C0199g0[i2];
            default:
                return new C0201h0[i2];
        }
    }
}
