package E0;

import N0.F;
import android.os.Parcel;
import android.os.Parcelable;
import h0.T;
import m.h1;
import v0.C0307a;
import w0.C0311b;

/* loaded from: classes.dex */
public final class b implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141a;

    public /* synthetic */ b(int i) {
        this.f141a = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f141a) {
            case 0:
                return new c(parcel, classLoader);
            case 1:
                return new L0.d(parcel, classLoader);
            case 2:
                return new F(parcel, classLoader);
            case 3:
                if (parcel.readParcelable(classLoader) == null) {
                    return T.b.f825b;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new T(parcel, classLoader);
            case 5:
                return new h1(parcel, classLoader);
            case 6:
                return new C0307a(parcel, classLoader);
            case 7:
                return new C0311b(parcel, classLoader);
            default:
                return new y.f(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f141a) {
            case 0:
                return new c[i];
            case 1:
                return new L0.d[i];
            case 2:
                return new F[i];
            case 3:
                return new T.b[i];
            case 4:
                return new T[i];
            case 5:
                return new h1[i];
            case 6:
                return new C0307a[i];
            case 7:
                return new C0311b[i];
            default:
                return new y.f[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f141a) {
            case 0:
                return new c(parcel, null);
            case 1:
                return new L0.d(parcel, (ClassLoader) null);
            case 2:
                return new F(parcel, null);
            case 3:
                if (parcel.readParcelable(null) == null) {
                    return T.b.f825b;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new T(parcel, null);
            case 5:
                return new h1(parcel, null);
            case 6:
                return new C0307a(parcel, (ClassLoader) null);
            case 7:
                return new C0311b(parcel, null);
            default:
                return new y.f(parcel, null);
        }
    }
}
