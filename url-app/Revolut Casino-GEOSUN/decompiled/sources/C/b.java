package C;

import F.k;
import L.F;
import android.os.Parcel;
import android.os.Parcelable;
import h.c0;
import h.p0;

/* loaded from: classes.dex */
public final class b implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54a;

    public /* synthetic */ b(int i2) {
        this.f54a = i2;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f54a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return c.f55b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new F(parcel, classLoader);
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                return new c0(parcel, classLoader);
            default:
                return new p0(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f54a) {
            case 0:
                return new c[i2];
            case 1:
                return new F[i2];
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                return new c0[i2];
            default:
                return new p0[i2];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f54a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return c.f55b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new F(parcel, null);
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                return new c0(parcel, null);
            default:
                return new p0(parcel, null);
        }
    }
}
