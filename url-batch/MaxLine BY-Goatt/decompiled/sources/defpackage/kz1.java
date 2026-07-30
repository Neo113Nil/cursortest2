package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class kz1 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ kz1(int i) {
        this.a = i;
    }

    public static lz1 a(Parcel parcel, ClassLoader classLoader) {
        zm2 zm2Var;
        if (classLoader == null) {
            classLoader = kz1.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            zm2Var = qb2.Z;
        } else if (readInt == 1) {
            zm2Var = by1.B;
        } else {
            if (readInt != 2) {
                lh.g(in1.l(readInt, "Unsupported MutableState policy ", " was restored"));
                return null;
            }
            zm2Var = by1.q;
        }
        return new lz1(readValue, zm2Var);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return s.n;
                }
                lh.g("superState must be null");
                return null;
            default:
                return new hy2(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new lz1[i];
            case 1:
                return new s[i];
            default:
                return new hy2[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return a(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return s.n;
                }
                lh.g("superState must be null");
                return null;
            default:
                return new hy2(parcel, null);
        }
    }
}
