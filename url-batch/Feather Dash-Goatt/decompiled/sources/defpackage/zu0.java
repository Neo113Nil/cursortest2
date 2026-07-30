package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class zu0 implements Parcelable.ClassLoaderCreator {
    public static av0 a(Parcel parcel, ClassLoader classLoader) {
        vb1 vb1Var;
        if (classLoader == null) {
            classLoader = zu0.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            vb1Var = j50.A;
        } else if (readInt == 1) {
            vb1Var = j41.o;
        } else {
            if (readInt != 2) {
                throw new IllegalStateException("Unsupported MutableState policy " + readInt + " was restored");
            }
            vb1Var = j50.B;
        }
        return new av0(readValue, vb1Var);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new av0[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }
}
