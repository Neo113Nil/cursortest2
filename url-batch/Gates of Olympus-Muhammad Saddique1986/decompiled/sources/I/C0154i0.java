package I;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: I.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0154i0 implements Parcelable.ClassLoaderCreator {
    public static C0156j0 a(Parcel parcel, ClassLoader classLoader) {
        W w2;
        if (classLoader == null) {
            classLoader = C0154i0.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            w2 = W.f2780f;
        } else if (readInt == 1) {
            w2 = W.f2783i;
        } else {
            if (readInt != 2) {
                throw new IllegalStateException(A.k.g(readInt, "Unsupported MutableState policy ", " was restored"));
            }
            w2 = W.f2781g;
        }
        return new C0156j0(readValue, w2);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        return new C0156j0[i3];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }
}
