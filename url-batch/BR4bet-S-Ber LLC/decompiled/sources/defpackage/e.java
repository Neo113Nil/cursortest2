package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class e implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return f.g;
                }
                g9.s("superState must be null");
                return null;
            case 1:
                return new v8(parcel, classLoader);
            case 2:
                return new oa(parcel, classLoader);
            case 3:
                return new te(parcel, classLoader);
            case 4:
                return new dv(parcel, classLoader);
            case 5:
                return new k20(parcel, classLoader);
            case 6:
                return new v50(parcel, classLoader);
            case 7:
                return new v80(parcel, classLoader);
            default:
                return new q90(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new f[i];
            case 1:
                return new v8[i];
            case 2:
                return new oa[i];
            case 3:
                return new te[i];
            case 4:
                return new dv[i];
            case 5:
                return new k20[i];
            case 6:
                return new v50[i];
            case 7:
                return new v80[i];
            default:
                return new q90[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return f.g;
                }
                g9.s("superState must be null");
                return null;
            case 1:
                return new v8(parcel, null);
            case 2:
                return new oa(parcel, null);
            case 3:
                return new te(parcel, null);
            case 4:
                return new dv(parcel, null);
            case 5:
                return new k20(parcel, null);
            case 6:
                return new v50(parcel, null);
            case 7:
                return new v80(parcel, null);
            default:
                return new q90(parcel, null);
        }
    }
}
