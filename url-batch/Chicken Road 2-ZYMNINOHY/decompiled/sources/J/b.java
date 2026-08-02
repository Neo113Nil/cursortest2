package J;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.E;
import k.C1203a0;
import k.m0;
import l1.C1244A;

/* loaded from: classes.dex */
public final class b implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1140a;

    public /* synthetic */ b(int i4) {
        this.f1140a = i4;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f1140a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return c.f1141b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new E(parcel, classLoader);
            case 2:
                return new C1203a0(parcel, classLoader);
            case 3:
                return new m0(parcel, classLoader);
            default:
                return new C1244A(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.f1140a) {
            case 0:
                return new c[i4];
            case 1:
                return new E[i4];
            case 2:
                return new C1203a0[i4];
            case 3:
                return new m0[i4];
            default:
                return new C1244A[i4];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1140a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return c.f1141b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new E(parcel, null);
            case 2:
                return new C1203a0(parcel, null);
            case 3:
                return new m0(parcel, null);
            default:
                return new C1244A(parcel, null);
        }
    }
}
