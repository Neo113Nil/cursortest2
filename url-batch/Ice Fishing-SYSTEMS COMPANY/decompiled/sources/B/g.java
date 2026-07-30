package B;

import F3.G;
import android.os.Parcel;
import android.os.Parcelable;
import m.W0;
import n3.C4811a;
import o3.C4833b;
import t0.C5026J;
import w3.C5162a;

/* loaded from: classes.dex */
public final class g implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59a;

    public /* synthetic */ g(int i) {
        this.f59a = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f59a) {
            case 0:
                return new h(parcel, classLoader);
            case 1:
                return new D3.e(parcel, classLoader);
            case 2:
                return new G(parcel, classLoader);
            case 3:
                return new G0.i(parcel, classLoader);
            case 4:
                if (parcel.readParcelable(classLoader) == null) {
                    return V.b.f3317u;
                }
                throw new IllegalStateException("superState must be null");
            case 5:
                return new a0.e(parcel, classLoader);
            case 6:
                return new W0(parcel, classLoader);
            case 7:
                return new C4811a(parcel, classLoader);
            case 8:
                return new C4833b(parcel, classLoader);
            case 9:
                return new C5026J(parcel, classLoader);
            default:
                return new C5162a(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f59a) {
            case 0:
                return new h[i];
            case 1:
                return new D3.e[i];
            case 2:
                return new G[i];
            case 3:
                return new G0.i[i];
            case 4:
                return new V.b[i];
            case 5:
                return new a0.e[i];
            case 6:
                return new W0[i];
            case 7:
                return new C4811a[i];
            case 8:
                return new C4833b[i];
            case 9:
                return new C5026J[i];
            default:
                return new C5162a[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f59a) {
            case 0:
                return new h(parcel, null);
            case 1:
                return new D3.e(parcel, null);
            case 2:
                return new G(parcel, null);
            case 3:
                return new G0.i(parcel, null);
            case 4:
                if (parcel.readParcelable(null) == null) {
                    return V.b.f3317u;
                }
                throw new IllegalStateException("superState must be null");
            case 5:
                return new a0.e(parcel, null);
            case 6:
                return new W0(parcel, null);
            case 7:
                return new C4811a(parcel, null);
            case 8:
                return new C4833b(parcel, null);
            case 9:
                return new C5026J(parcel, null);
            default:
                return new C5162a(parcel, null);
        }
    }
}
