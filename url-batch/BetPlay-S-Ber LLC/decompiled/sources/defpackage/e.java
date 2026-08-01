package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class e implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return f.EMPTY_STATE;
                }
                o8.t("superState must be null");
                return null;
            case 1:
                return new z9(parcel, classLoader);
            case 2:
                return new wd(parcel, classLoader);
            case 3:
                return new mi(parcel, classLoader);
            case 4:
                return new ik(parcel, classLoader);
            case BottomSheetBehavior.STATE_HIDDEN /* 5 */:
                return new qs(parcel, classLoader);
            case BottomSheetBehavior.STATE_HALF_EXPANDED /* 6 */:
                return new wz(parcel, classLoader);
            case 7:
                return new f30(parcel, classLoader);
            case BottomSheetBehavior.SAVE_SKIP_COLLAPSED /* 8 */:
                return new w50(parcel, classLoader);
            default:
                return new o60(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new f[i];
            case 1:
                return new z9[i];
            case 2:
                return new wd[i];
            case 3:
                return new mi[i];
            case 4:
                return new ik[i];
            case BottomSheetBehavior.STATE_HIDDEN /* 5 */:
                return new qs[i];
            case BottomSheetBehavior.STATE_HALF_EXPANDED /* 6 */:
                return new wz[i];
            case 7:
                return new f30[i];
            case BottomSheetBehavior.SAVE_SKIP_COLLAPSED /* 8 */:
                return new w50[i];
            default:
                return new o60[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return f.EMPTY_STATE;
                }
                o8.t("superState must be null");
                return null;
            case 1:
                return new z9(parcel, null);
            case 2:
                return new wd(parcel, null);
            case 3:
                return new mi(parcel, null);
            case 4:
                return new ik(parcel, null);
            case BottomSheetBehavior.STATE_HIDDEN /* 5 */:
                return new qs(parcel, null);
            case BottomSheetBehavior.STATE_HALF_EXPANDED /* 6 */:
                return new wz(parcel, null);
            case 7:
                return new f30(parcel, null);
            case BottomSheetBehavior.SAVE_SKIP_COLLAPSED /* 8 */:
                return new w50(parcel, null);
            default:
                return new o60(parcel, null);
        }
    }
}
