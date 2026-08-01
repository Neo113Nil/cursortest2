package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class oa extends f {
    public static final Parcelable.Creator<oa> CREATOR = new e(2);
    public boolean h;

    public oa(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.h = parcel.readInt() == 1;
    }

    @Override // defpackage.f, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.h ? 1 : 0);
    }
}
