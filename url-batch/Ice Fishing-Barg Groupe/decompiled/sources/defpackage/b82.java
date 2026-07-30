package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class b82 implements Parcelable.ClassLoaderCreator {
    public static d82 PxuCJdSBwIXG(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = b82.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new d82();
        }
        g72.Companion.getClass();
        vl1 e9gEMXR7LXtO = g72.OPXfSBeufaJ8.e9gEMXR7LXtO();
        for (int i = 0; i < readInt; i++) {
            e9gEMXR7LXtO.add(parcel.readValue(classLoader));
        }
        return new d82(e9gEMXR7LXtO.TSizfFm2Yiuu());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return PxuCJdSBwIXG(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new d82[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return PxuCJdSBwIXG(parcel, classLoader);
    }
}
