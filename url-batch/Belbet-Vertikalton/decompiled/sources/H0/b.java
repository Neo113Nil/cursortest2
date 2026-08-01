package H0;

import Q0.E;
import android.os.Parcel;
import android.os.Parcelable;
import h0.C0149O;
import n.g1;
import y0.C0423b;
import z.C0432f;

/* loaded from: classes.dex */
public final class b implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f460a;

    public /* synthetic */ b(int i) {
        this.f460a = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f460a) {
            case 0:
                return new c(parcel, classLoader);
            case 1:
                return new O0.e(parcel, classLoader);
            case 2:
                return new E(parcel, classLoader);
            case 3:
                if (parcel.readParcelable(classLoader) == null) {
                    return T.b.f1147b;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new C0149O(parcel, classLoader);
            case 5:
                return new g1(parcel, classLoader);
            case 6:
                return new C0423b(parcel, classLoader);
            case 7:
                return new C0432f(parcel, classLoader);
            default:
                return new z0.b(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f460a) {
            case 0:
                return new c[i];
            case 1:
                return new O0.e[i];
            case 2:
                return new E[i];
            case 3:
                return new T.b[i];
            case 4:
                return new C0149O[i];
            case 5:
                return new g1[i];
            case 6:
                return new C0423b[i];
            case 7:
                return new C0432f[i];
            default:
                return new z0.b[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f460a) {
            case 0:
                return new c(parcel, null);
            case 1:
                return new O0.e(parcel, (ClassLoader) null);
            case 2:
                return new E(parcel, null);
            case 3:
                if (parcel.readParcelable(null) == null) {
                    return T.b.f1147b;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new C0149O(parcel, null);
            case 5:
                return new g1(parcel, null);
            case 6:
                return new C0423b(parcel, (ClassLoader) null);
            case 7:
                return new C0432f(parcel, null);
            default:
                return new z0.b(parcel, null);
        }
    }
}
