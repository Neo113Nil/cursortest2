package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class zb1 implements Parcelable.ClassLoaderCreator {
    public static ac1 a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = zb1.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new ac1();
        }
        uw0 f = eb1.g.f();
        for (int i = 0; i < readInt; i++) {
            f.add(parcel.readValue(classLoader));
        }
        return new ac1(f.d());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ac1[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }
}
