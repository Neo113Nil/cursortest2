package w0;

import android.os.Parcel;
import android.os.Parcelable;
import l.h2;
import w4.l0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class o implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7545a;

    public /* synthetic */ o(int i) {
        this.f7545a = i;
    }

    public static p a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = o.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new p();
        }
        q0.g f6 = q0.j.f5955e.f();
        for (int i = 0; i < readInt; i++) {
            f6.add(parcel.readValue(classLoader));
        }
        return new p(f6.c());
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f7545a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                return new d3.f(parcel, classLoader);
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                return new k5.f(parcel, classLoader);
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                return new h2(parcel, classLoader);
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                return new l5.c(parcel, classLoader);
            case 5:
                return new r5.a(parcel, classLoader);
            case 6:
                if (parcel.readParcelable(classLoader) == null) {
                    return w3.b.f7876e;
                }
                throw new IllegalStateException("superState must be null");
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return new l0(parcel, classLoader);
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                return new x5.c(parcel, classLoader);
            default:
                return new z5.x(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f7545a) {
            case 0:
                return new p[i];
            case 1:
                return new d3.f[i];
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                return new k5.f[i];
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                return new h2[i];
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                return new l5.c[i];
            case 5:
                return new r5.a[i];
            case 6:
                return new w3.b[i];
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return new l0[i];
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                return new x5.c[i];
            default:
                return new z5.x[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f7545a) {
            case 0:
                return a(parcel, null);
            case 1:
                return new d3.f(parcel, null);
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                return new k5.f(parcel, null);
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                return new h2(parcel, null);
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                return new l5.c(parcel, null);
            case 5:
                return new r5.a(parcel, null);
            case 6:
                if (parcel.readParcelable(null) == null) {
                    return w3.b.f7876e;
                }
                throw new IllegalStateException("superState must be null");
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return new l0(parcel, null);
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                return new x5.c(parcel, null);
            default:
                return new z5.x(parcel, null);
        }
    }
}
