package b1;

import android.os.Parcel;
import android.os.Parcelable;
import m.a2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1041a;

    public /* synthetic */ v(int i3) {
        this.f1041a = i3;
    }

    public static w a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = v.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new w();
        }
        t0.e g = t0.h.f9218i.g();
        for (int i3 = 0; i3 < readInt; i3++) {
            g.add(parcel.readValue(classLoader));
        }
        return new w(g.e());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1041a) {
            case 0:
                return a(parcel, null);
            case 1:
                return new a2(parcel, null);
            default:
                if (parcel.readParcelable(null) == null) {
                    return v3.b.f9952e;
                }
                kotlin.collections.i0.l("superState must be null");
                return null;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f1041a) {
            case 0:
                return new w[i3];
            case 1:
                return new a2[i3];
            default:
                return new v3.b[i3];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f1041a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                return new a2(parcel, classLoader);
            default:
                if (parcel.readParcelable(classLoader) == null) {
                    return v3.b.f9952e;
                }
                kotlin.collections.i0.l("superState must be null");
                return null;
        }
    }
}
