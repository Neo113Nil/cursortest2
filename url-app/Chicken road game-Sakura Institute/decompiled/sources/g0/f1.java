package g0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f1 implements Parcelable.ClassLoaderCreator {
    public static g1 a(Parcel parcel, ClassLoader classLoader) {
        t0 t0Var;
        if (classLoader == null) {
            classLoader = f1.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            t0Var = t0.f3900h;
        } else if (readInt == 1) {
            t0Var = t0.f3903k;
        } else {
            if (readInt != 2) {
                throw new IllegalStateException(a0.m.g(readInt, "Unsupported MutableState policy ", " was restored"));
            }
            t0Var = t0.f3901i;
        }
        return new g1(readValue, t0Var);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new g1[i7];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }
}
