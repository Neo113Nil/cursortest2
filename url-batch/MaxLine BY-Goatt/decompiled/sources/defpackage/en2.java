package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class en2 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public static fn2 a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = en2.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new fn2();
        }
        f12 e = am2.o.e();
        for (int i = 0; i < readInt; i++) {
            e.add(parcel.readValue(classLoader));
        }
        return new fn2(e.c());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return a(parcel, null);
            default:
                return new er0(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new fn2[i];
            default:
                return new er0[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return a(parcel, classLoader);
            default:
                return new er0(parcel, classLoader);
        }
    }
}
