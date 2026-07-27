package G;

import A.AbstractC0017m;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: G.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0203i0 implements Parcelable.ClassLoaderCreator {
    public static C0205j0 a(Parcel parcel, ClassLoader classLoader) {
        W w4;
        if (classLoader == null) {
            classLoader = C0203i0.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            w4 = W.f2776i;
        } else if (readInt == 1) {
            w4 = W.f2779l;
        } else {
            if (readInt != 2) {
                throw new IllegalStateException(AbstractC0017m.h(readInt, "Unsupported MutableState policy ", " was restored"));
            }
            w4 = W.f2777j;
        }
        return new C0205j0(readValue, w4);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        return new C0205j0[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }
}
