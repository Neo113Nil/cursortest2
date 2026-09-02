package a0;

import android.os.Parcel;
import android.os.Parcelable;
import f1.v0;
import g2.q;
import l.b3;
import o2.a0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
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
                return new e2.a(parcel, classLoader);
            case 2:
                return new e2.f(parcel, classLoader);
            case 3:
                return new v0(parcel, classLoader);
            case 4:
                return new q(parcel, classLoader);
            case 5:
                return new b3(parcel, classLoader);
            case 6:
                return new m2.d(parcel, classLoader);
            case 7:
                return new a0(parcel, classLoader);
            case 8:
                if (parcel.readParcelable(classLoader) == null) {
                    return s0.b.f3174g;
                }
                throw new IllegalStateException("superState must be null");
            case 9:
                return new u1.a(parcel, classLoader);
            default:
                return new v1.c(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f97a) {
            case 0:
                return new h[i];
            case 1:
                return new e2.a[i];
            case 2:
                return new e2.f[i];
            case 3:
                return new v0[i];
            case 4:
                return new q[i];
            case 5:
                return new b3[i];
            case 6:
                return new m2.d[i];
            case 7:
                return new a0[i];
            case 8:
                return new s0.b[i];
            case 9:
                return new u1.a[i];
            default:
                return new v1.c[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f97a) {
            case 0:
                return new h(parcel, null);
            case 1:
                return new e2.a(parcel, null);
            case 2:
                return new e2.f(parcel, null);
            case 3:
                return new v0(parcel, null);
            case 4:
                return new q(parcel, null);
            case 5:
                return new b3(parcel, null);
            case 6:
                return new m2.d(parcel, null);
            case 7:
                return new a0(parcel, null);
            case 8:
                if (parcel.readParcelable(null) == null) {
                    return s0.b.f3174g;
                }
                throw new IllegalStateException("superState must be null");
            case 9:
                return new u1.a(parcel, null);
            default:
                return new v1.c(parcel, null);
        }
    }
}
