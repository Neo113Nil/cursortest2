package D0;

import M0.F;
import android.os.Parcel;
import android.os.Parcelable;
import g0.V;
import l.b1;
import u0.C0304a;

/* loaded from: classes.dex */
public final class b implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136a;

    public /* synthetic */ b(int i) {
        this.f136a = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f136a) {
            case 0:
                return new c(parcel, classLoader);
            case 1:
                return new K0.d(parcel, classLoader);
            case 2:
                return new F(parcel, classLoader);
            case 3:
                if (parcel.readParcelable(classLoader) == null) {
                    return S.b.f782b;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new V(parcel, classLoader);
            case 5:
                return new b1(parcel, classLoader);
            case 6:
                return new C0304a(parcel, classLoader);
            case 7:
                return new v0.b(parcel, classLoader);
            default:
                return new x.f(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f136a) {
            case 0:
                return new c[i];
            case 1:
                return new K0.d[i];
            case 2:
                return new F[i];
            case 3:
                return new S.b[i];
            case 4:
                return new V[i];
            case 5:
                return new b1[i];
            case 6:
                return new C0304a[i];
            case 7:
                return new v0.b[i];
            default:
                return new x.f[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f136a) {
            case 0:
                return new c(parcel, null);
            case 1:
                return new K0.d(parcel, (ClassLoader) null);
            case 2:
                return new F(parcel, null);
            case 3:
                if (parcel.readParcelable(null) == null) {
                    return S.b.f782b;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new V(parcel, null);
            case 5:
                return new b1(parcel, null);
            case 6:
                return new C0304a(parcel, (ClassLoader) null);
            case 7:
                return new v0.b(parcel, null);
            default:
                return new x.f(parcel, null);
        }
    }
}
