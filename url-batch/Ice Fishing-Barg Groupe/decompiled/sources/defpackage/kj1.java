package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class kj1 implements Parcelable.ClassLoaderCreator {
    public static mj1 PxuCJdSBwIXG(Parcel parcel, ClassLoader classLoader) {
        y72 y72Var;
        if (classLoader == null) {
            classLoader = kj1.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            y72Var = ih0.EcgxDIVH5in8;
        } else if (readInt == 1) {
            y72Var = jx1.S2OOm9zPNm0h;
        } else {
            if (readInt != 2) {
                u9.rtx2ld2ELZv4(o0.OPXfSBeufaJ8(readInt, "Unsupported MutableState policy ", " was restored"));
                return null;
            }
            y72Var = jx1.S9EYkSpbGuxq;
        }
        return new mj1(readValue, y72Var);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return PxuCJdSBwIXG(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new mj1[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return PxuCJdSBwIXG(parcel, classLoader);
    }
}
