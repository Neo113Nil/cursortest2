package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
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
                t8.t("superState must be null");
                return null;
            case 1:
                return new h8(parcel, classLoader);
            case 2:
                return new ba(parcel, classLoader);
            case 3:
                return new sd(parcel, classLoader);
            case 4:
                return new ti(parcel, classLoader);
            case 5:
                return new cs(parcel, classLoader);
            case 6:
                return new hz(parcel, classLoader);
            case 7:
                return new t10(parcel, classLoader);
            case 8:
                return new t20(parcel, classLoader);
            case 9:
                return new o50(parcel, classLoader);
            default:
                return new g60(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new f[i];
            case 1:
                return new h8[i];
            case 2:
                return new ba[i];
            case 3:
                return new sd[i];
            case 4:
                return new ti[i];
            case 5:
                return new cs[i];
            case 6:
                return new hz[i];
            case 7:
                return new t10[i];
            case 8:
                return new t20[i];
            case 9:
                return new o50[i];
            default:
                return new g60[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return f.g;
                }
                t8.t("superState must be null");
                return null;
            case 1:
                return new h8(parcel, null);
            case 2:
                return new ba(parcel, null);
            case 3:
                return new sd(parcel, null);
            case 4:
                return new ti(parcel, null);
            case 5:
                return new cs(parcel, null);
            case 6:
                return new hz(parcel, null);
            case 7:
                return new t10(parcel, null);
            case 8:
                return new t20(parcel, null);
            case 9:
                return new o50(parcel, null);
            default:
                return new g60(parcel, null);
        }
    }
}
