package A0;

import R0.D;
import android.os.Parcel;
import android.os.Parcelable;
import f0.P;
import l.a1;
import x.C0383g;
import z0.C0390a;

/* loaded from: classes.dex */
public final class b implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3a;

    public /* synthetic */ b(int i) {
        this.f3a = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f3a) {
            case 0:
                return new c(parcel, classLoader);
            case 1:
                return new I0.a(parcel, classLoader);
            case 2:
                return new P0.d(parcel, classLoader);
            case 3:
                if (parcel.readParcelable(classLoader) == null) {
                    return R.b.f645b;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new D(parcel, classLoader);
            case 5:
                return new P(parcel, classLoader);
            case 6:
                return new a1(parcel, classLoader);
            case 7:
                return new C0383g(parcel, classLoader);
            default:
                return new C0390a(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f3a) {
            case 0:
                return new c[i];
            case 1:
                return new I0.a[i];
            case 2:
                return new P0.d[i];
            case 3:
                return new R.b[i];
            case 4:
                return new D[i];
            case 5:
                return new P[i];
            case 6:
                return new a1[i];
            case 7:
                return new C0383g[i];
            default:
                return new C0390a[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f3a) {
            case 0:
                return new c(parcel, null);
            case 1:
                return new I0.a(parcel, null);
            case 2:
                return new P0.d(parcel, (ClassLoader) null);
            case 3:
                if (parcel.readParcelable(null) == null) {
                    return R.b.f645b;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new D(parcel, null);
            case 5:
                return new P(parcel, null);
            case 6:
                return new a1(parcel, null);
            case 7:
                return new C0383g(parcel, null);
            default:
                return new C0390a(parcel, (ClassLoader) null);
        }
    }
}
