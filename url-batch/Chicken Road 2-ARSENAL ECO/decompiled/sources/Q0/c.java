package Q0;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1973a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1973a) {
            case 0:
                int l02 = A3.c.l0(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < l02) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        A3.c.h0(parcel, readInt);
                    } else {
                        intent = (Intent) A3.c.G(parcel, readInt, Intent.CREATOR);
                    }
                }
                A3.c.N(parcel, l02);
                return new a(intent);
            default:
                return new g(parcel.readStrongBinder());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        switch (this.f1973a) {
            case 0:
                return new a[i7];
            default:
                return new g[i7];
        }
    }
}
