package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lh implements Parcelable.ClassLoaderCreator {
    private final /* synthetic */ int a;

    public lh(int i) {
        this.a = i;
    }

    public static final abn a(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return abn.c;
        }
        throw new IllegalStateException("superState must be null");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new li(parcel, null);
            case 1:
                return new bc(parcel, null);
            case 2:
                return new mh(parcel, null);
            case 3:
                return new ub(parcel, null);
            case 4:
                return a(parcel, null);
            case 5:
                return new aby(parcel, null);
            case 6:
                return new arr(parcel, null);
            case 7:
                return new dnx(parcel, null);
            case 8:
                return new fms(parcel, null);
            default:
                return new fne(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new li[i];
            case 1:
                return new bc[i];
            case 2:
                return new mh[i];
            case 3:
                return new ub[i];
            case 4:
                return new abn[i];
            case 5:
                return new aby[i];
            case 6:
                return new arr[i];
            case 7:
                return new dnx[i];
            case 8:
                return new fms[i];
            default:
                return new fne[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return new li(parcel, classLoader);
            case 1:
                return new bc(parcel, classLoader);
            case 2:
                return new mh(parcel, classLoader);
            case 3:
                return new ub(parcel, classLoader);
            case 4:
                return a(parcel, classLoader);
            case 5:
                return new aby(parcel, classLoader);
            case 6:
                return new arr(parcel, classLoader);
            case 7:
                return new dnx(parcel, classLoader);
            case 8:
                return new fms(parcel, classLoader);
            default:
                return new fne(parcel, classLoader);
        }
    }
}
