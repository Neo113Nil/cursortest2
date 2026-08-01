package C0;

import U0.C;
import android.os.Parcel;
import android.os.Parcelable;
import g0.Q;
import l.a1;

/* loaded from: classes.dex */
public final class g implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f97a;

    public /* synthetic */ g(int i) {
        this.f97a = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f97a) {
            case 0:
                return new h(parcel, classLoader);
            case 1:
                return new D0.b(parcel, classLoader);
            case 2:
                return new L0.a(parcel, classLoader);
            case 3:
                if (parcel.readParcelable(classLoader) == null) {
                    return S.b.f985b;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new S0.c(parcel, classLoader);
            case 5:
                return new C(parcel, classLoader);
            case 6:
                return new Q(parcel, classLoader);
            case 7:
                return new a1(parcel, classLoader);
            default:
                return new x.f(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f97a) {
            case 0:
                return new h[i];
            case 1:
                return new D0.b[i];
            case 2:
                return new L0.a[i];
            case 3:
                return new S.b[i];
            case 4:
                return new S0.c[i];
            case 5:
                return new C[i];
            case 6:
                return new Q[i];
            case 7:
                return new a1[i];
            default:
                return new x.f[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f97a) {
            case 0:
                return new h(parcel, (ClassLoader) null);
            case 1:
                return new D0.b(parcel, null);
            case 2:
                return new L0.a(parcel, null);
            case 3:
                if (parcel.readParcelable(null) == null) {
                    return S.b.f985b;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new S0.c(parcel, (ClassLoader) null);
            case 5:
                return new C(parcel, null);
            case 6:
                return new Q(parcel, null);
            case 7:
                return new a1(parcel, null);
            default:
                return new x.f(parcel, null);
        }
    }
}
