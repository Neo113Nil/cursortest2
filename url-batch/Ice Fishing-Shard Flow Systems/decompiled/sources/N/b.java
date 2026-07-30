package N;

import android.os.Parcel;
import android.os.Parcelable;
import g0.C0408A;
import n.c1;
import n.q1;

/* loaded from: classes.dex */
public final class b implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1774a;

    public /* synthetic */ b(int i2) {
        this.f1774a = i2;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f1774a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return c.f1775e;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new C0408A(parcel, classLoader);
            case 2:
                return new c1(parcel, classLoader);
            default:
                return new q1(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f1774a) {
            case 0:
                return new c[i2];
            case 1:
                return new C0408A[i2];
            case 2:
                return new c1[i2];
            default:
                return new q1[i2];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1774a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return c.f1775e;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new C0408A(parcel, null);
            case 2:
                return new c1(parcel, null);
            default:
                return new q1(parcel, null);
        }
    }
}
