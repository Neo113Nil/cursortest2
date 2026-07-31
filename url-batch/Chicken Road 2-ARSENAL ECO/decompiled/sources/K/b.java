package K;

import android.os.Parcel;
import android.os.Parcelable;
import com.onesignal.inAppMessages.internal.display.impl.a;
import k.g0;
import k.r0;

/* loaded from: classes.dex */
public final class b implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1340a;

    public /* synthetic */ b(int i7) {
        this.f1340a = i7;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f1340a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return c.f1341g;
                }
                throw new IllegalStateException("superState must be null");
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return new g0(parcel, classLoader);
            default:
                return new r0(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f1340a) {
            case 0:
                return new c[i7];
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return new g0[i7];
            default:
                return new r0[i7];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1340a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return c.f1341g;
                }
                throw new IllegalStateException("superState must be null");
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return new g0(parcel, null);
            default:
                return new r0(parcel, null);
        }
    }
}
