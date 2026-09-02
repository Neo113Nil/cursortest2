package c1;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0277b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3775a = 0;

    static {
        AbstractC0277b.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
