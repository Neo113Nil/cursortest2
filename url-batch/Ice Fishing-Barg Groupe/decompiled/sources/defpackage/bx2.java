package defpackage;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class bx2 {
    public static final /* synthetic */ int PxuCJdSBwIXG = 0;

    static {
        bx2.class.getClassLoader();
    }

    public static Parcelable PxuCJdSBwIXG(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void lS5Rgt96tfkO(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(o0.wdg6QnbFHrFF("Parcel data not fully consumed, unread size: ", dataAvail));
        }
    }
}
