package e;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new d4.a(2);

    /* renamed from: f, reason: collision with root package name */
    public final IntentSender f2661f;

    /* renamed from: g, reason: collision with root package name */
    public final Intent f2662g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2663h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2664i;

    public f(IntentSender intentSender, Intent intent, int i7, int i8) {
        this.f2661f = intentSender;
        this.f2662g = intent;
        this.f2663h = i7;
        this.f2664i = i8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        k.f(parcel, "dest");
        parcel.writeParcelable(this.f2661f, i7);
        parcel.writeParcelable(this.f2662g, i7);
        parcel.writeInt(this.f2663h);
        parcel.writeInt(this.f2664i);
    }
}
