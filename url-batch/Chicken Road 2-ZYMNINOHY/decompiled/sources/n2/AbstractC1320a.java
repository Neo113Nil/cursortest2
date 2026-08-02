package n2;

import E.AbstractC0005f;
import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: n2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1320a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f14587a = 0;

    static {
        AbstractC1320a.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(AbstractC0005f.j(dataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }
}
