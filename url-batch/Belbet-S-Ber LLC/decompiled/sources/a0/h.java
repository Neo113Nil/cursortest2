package a0;

import android.os.Parcel;
import android.os.Parcelable;
import g1.j1;
import l.y2;
import s2.a0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class h implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95a;

    public /* synthetic */ h(int i) {
        this.f95a = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f95a) {
            case 0:
                return new i(parcel, classLoader);
            case 1:
                return new j1(parcel, classLoader);
            case 2:
                return new i2.c(parcel, classLoader);
            case 3:
                return new y2(parcel, classLoader);
            case 4:
                return new p2.d(parcel, classLoader);
            case 5:
                return new r2.a(parcel, classLoader);
            case 6:
                return new a0(parcel, classLoader);
            case 7:
                if (parcel.readParcelable(classLoader) == null) {
                    return t0.b.f3385g;
                }
                throw new IllegalStateException("superState must be null");
            case 8:
                return new v1.a(parcel, classLoader);
            default:
                return new w1.d(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f95a) {
            case 0:
                return new i[i];
            case 1:
                return new j1[i];
            case 2:
                return new i2.c[i];
            case 3:
                return new y2[i];
            case 4:
                return new p2.d[i];
            case 5:
                return new r2.a[i];
            case 6:
                return new a0[i];
            case 7:
                return new t0.b[i];
            case 8:
                return new v1.a[i];
            default:
                return new w1.d[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f95a) {
            case 0:
                return new i(parcel, null);
            case 1:
                return new j1(parcel, null);
            case 2:
                return new i2.c(parcel, null);
            case 3:
                return new y2(parcel, null);
            case 4:
                return new p2.d(parcel, null);
            case 5:
                return new r2.a(parcel, null);
            case 6:
                return new a0(parcel, null);
            case 7:
                if (parcel.readParcelable(null) == null) {
                    return t0.b.f3385g;
                }
                throw new IllegalStateException("superState must be null");
            case 8:
                return new v1.a(parcel, null);
            default:
                return new w1.d(parcel, null);
        }
    }
}
