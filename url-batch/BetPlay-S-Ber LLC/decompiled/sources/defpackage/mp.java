package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class mp implements Parcelable {
    public static final Parcelable.Creator<mp> CREATOR = new v1(9);
    public final IntentSender f;
    public final Intent g;
    public final int h;
    public final int i;

    public mp(IntentSender intentSender, Intent intent, int i, int i2) {
        this.f = intentSender;
        this.g = intent;
        this.h = i;
        this.i = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.f, i);
        parcel.writeParcelable(this.g, i);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
    }
}
