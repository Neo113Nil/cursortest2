package G0;

import P0.E;
import android.os.Parcel;
import android.os.Parcelable;
import f0.Q;
import l.a1;
import x.C0324f;
import x0.C0326a;

/* loaded from: classes.dex */
public final class b implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180a;

    public /* synthetic */ b(int i) {
        this.f180a = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f180a) {
            case 0:
                return new c(parcel, classLoader);
            case 1:
                return new N0.d(parcel, classLoader);
            case 2:
                return new E(parcel, classLoader);
            case 3:
                if (parcel.readParcelable(classLoader) == null) {
                    return R.b.f731b;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new Q(parcel, classLoader);
            case 5:
                return new a1(parcel, classLoader);
            case 6:
                return new C0324f(parcel, classLoader);
            case 7:
                return new C0326a(parcel, classLoader);
            default:
                return new y0.b(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f180a) {
            case 0:
                return new c[i];
            case 1:
                return new N0.d[i];
            case 2:
                return new E[i];
            case 3:
                return new R.b[i];
            case 4:
                return new Q[i];
            case 5:
                return new a1[i];
            case 6:
                return new C0324f[i];
            case 7:
                return new C0326a[i];
            default:
                return new y0.b[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f180a) {
            case 0:
                return new c(parcel, null);
            case 1:
                return new N0.d(parcel, (ClassLoader) null);
            case 2:
                return new E(parcel, null);
            case 3:
                if (parcel.readParcelable(null) == null) {
                    return R.b.f731b;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new Q(parcel, null);
            case 5:
                return new a1(parcel, null);
            case 6:
                return new C0324f(parcel, null);
            case 7:
                return new C0326a(parcel, (ClassLoader) null);
            default:
                return new y0.b(parcel, null);
        }
    }
}
