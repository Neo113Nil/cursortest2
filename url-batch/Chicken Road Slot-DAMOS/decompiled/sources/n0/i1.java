package n0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i1 implements Parcelable.ClassLoaderCreator {
    public static j1 a(Parcel parcel, ClassLoader classLoader) {
        e eVar;
        if (classLoader == null) {
            classLoader = i1.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            eVar = e.f6660r;
        } else if (readInt == 1) {
            eVar = e.f6663u;
        } else {
            if (readInt != 2) {
                kotlin.collections.i0.l(l.f(readInt, "Unsupported MutableState policy ", " was restored"));
                return null;
            }
            eVar = e.f6661s;
        }
        return new j1(readValue, eVar);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        return new j1[i3];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }
}
