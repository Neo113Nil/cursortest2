package k1;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: k1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1207c implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10681a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f10681a) {
            case 0:
                int t02 = K1.b.t0(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < t02) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        K1.b.n0(parcel, readInt);
                    } else {
                        intent = (Intent) K1.b.M(parcel, readInt, Intent.CREATOR);
                    }
                }
                K1.b.S(parcel, t02);
                return new C1205a(intent);
            default:
                return new C1211g(parcel.readStrongBinder());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        switch (this.f10681a) {
            case 0:
                return new C1205a[i2];
            default:
                return new C1211g[i2];
        }
    }
}
