package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class fa0 implements Parcelable {
    public static final Parcelable.Creator<fa0> CREATOR = new g2(2);
    public final IntentSender d;
    public final Intent e;
    public final int g;
    public final int h;

    public fa0(Parcel parcel) {
        Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        readParcelable.getClass();
        Intent intent = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        this.d = (IntentSender) readParcelable;
        this.e = intent;
        this.g = readInt;
        this.h = readInt2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
    }
}
