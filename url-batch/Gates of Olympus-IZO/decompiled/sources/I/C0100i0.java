package I;

import H2.AbstractC0080b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: I.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0100i0 implements Parcelable.ClassLoaderCreator {
    public static C0102j0 a(Parcel parcel, ClassLoader classLoader) {
        X x3;
        if (classLoader == null) {
            classLoader = C0100i0.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            x3 = X.f2225f;
        } else if (readInt == 1) {
            x3 = X.f2228i;
        } else {
            if (readInt != 2) {
                throw new IllegalStateException(AbstractC0080b.i("Unsupported MutableState policy ", readInt, " was restored"));
            }
            x3 = X.f2226g;
        }
        return new C0102j0(readValue, x3);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        return new C0102j0[i3];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }
}
