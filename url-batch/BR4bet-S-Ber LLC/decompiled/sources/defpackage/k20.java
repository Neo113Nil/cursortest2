package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class k20 extends f {
    public static final Parcelable.Creator<k20> CREATOR = new e(5);
    public Parcelable h;

    public k20(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.h = parcel.readParcelable(classLoader == null ? b20.class.getClassLoader() : classLoader);
    }

    @Override // defpackage.f, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.h, 0);
    }
}
