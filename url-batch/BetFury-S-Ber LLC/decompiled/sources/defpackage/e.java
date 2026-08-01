package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
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
                s9.u("superState must be null");
                return null;
            case 1:
                return new h9(parcel, classLoader);
            case 2:
                return new ib(parcel, classLoader);
            case 3:
                return new mg(parcel, classLoader);
            case 4:
                return new ao(parcel, classLoader);
            case 5:
                return new i00(parcel, classLoader);
            case 6:
                return new r80(parcel, classLoader);
            case 7:
                return new ic0(parcel, classLoader);
            case 8:
                return new yd0(parcel, classLoader);
            case 9:
                return new uh0(parcel, classLoader);
            default:
                return new ui0(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new f[i];
            case 1:
                return new h9[i];
            case 2:
                return new ib[i];
            case 3:
                return new mg[i];
            case 4:
                return new ao[i];
            case 5:
                return new i00[i];
            case 6:
                return new r80[i];
            case 7:
                return new ic0[i];
            case 8:
                return new yd0[i];
            case 9:
                return new uh0[i];
            default:
                return new ui0[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return f.g;
                }
                s9.u("superState must be null");
                return null;
            case 1:
                return new h9(parcel, null);
            case 2:
                return new ib(parcel, null);
            case 3:
                return new mg(parcel, null);
            case 4:
                return new ao(parcel, null);
            case 5:
                return new i00(parcel, null);
            case 6:
                return new r80(parcel, null);
            case 7:
                return new ic0(parcel, null);
            case 8:
                return new yd0(parcel, null);
            case 9:
                return new uh0(parcel, null);
            default:
                return new ui0(parcel, null);
        }
    }
}
