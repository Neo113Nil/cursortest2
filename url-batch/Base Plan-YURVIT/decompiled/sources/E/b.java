package E;

import H.k;
import N.E;
import android.os.Parcel;
import android.os.Parcelable;
import i.c0;
import i.p0;

/* loaded from: classes.dex */
public final class b implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207a;

    public /* synthetic */ b(int i2) {
        this.f207a = i2;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f207a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return c.f208f;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new E(parcel, classLoader);
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                return new c0(parcel, classLoader);
            default:
                return new p0(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f207a) {
            case 0:
                return new c[i2];
            case 1:
                return new E[i2];
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                return new c0[i2];
            default:
                return new p0[i2];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f207a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return c.f208f;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new E(parcel, null);
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                return new c0(parcel, null);
            default:
                return new p0(parcel, null);
        }
    }
}
