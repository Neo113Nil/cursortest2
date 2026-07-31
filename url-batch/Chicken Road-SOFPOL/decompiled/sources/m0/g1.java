package m0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g1 implements Parcelable.ClassLoaderCreator {
    public static h1 a(Parcel parcel, ClassLoader classLoader) {
        v0 v0Var;
        if (classLoader == null) {
            classLoader = g1.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            v0Var = v0.f5133f;
        } else if (readInt == 1) {
            v0Var = v0.i;
        } else {
            if (readInt != 2) {
                throw new IllegalStateException("Unsupported MutableState policy " + readInt + " was restored");
            }
            v0Var = v0.f5134g;
        }
        return new h1(readValue, v0Var);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new h1[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }
}
