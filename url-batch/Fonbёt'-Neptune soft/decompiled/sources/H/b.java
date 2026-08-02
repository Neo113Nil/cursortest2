package H;

import P.D;
import android.os.Parcel;
import android.os.Parcelable;
import j.e0;
import j.r0;

/* loaded from: classes.dex */
public final class b implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f493a;

    public /* synthetic */ b(int i2) {
        this.f493a = i2;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f493a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return c.f494b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new D(parcel, classLoader);
            case 2:
                return new e0(parcel, classLoader);
            default:
                return new r0(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f493a) {
            case 0:
                return new c[i2];
            case 1:
                return new D[i2];
            case 2:
                return new e0[i2];
            default:
                return new r0[i2];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f493a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return c.f494b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new D(parcel, null);
            case 2:
                return new e0(parcel, null);
            default:
                return new r0(parcel, null);
        }
    }
}
