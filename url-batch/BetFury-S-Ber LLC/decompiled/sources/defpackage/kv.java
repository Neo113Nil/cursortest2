package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class kv implements Parcelable {
    public static final Parcelable.Creator<kv> CREATOR = new u1(9);
    public final IntentSender f;
    public final Intent g;
    public final int h;
    public final int i;

    public kv(IntentSender intentSender, Intent intent, int i, int i2) {
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
