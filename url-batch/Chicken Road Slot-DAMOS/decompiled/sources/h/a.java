package h;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import c7.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new p(10);

    /* renamed from: d, reason: collision with root package name */
    public final int f4427d;

    /* renamed from: e, reason: collision with root package name */
    public final Intent f4428e;

    public a(int i3, Intent intent) {
        this.f4427d = i3;
        this.f4428e = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActivityResult{resultCode=");
        int i3 = this.f4427d;
        sb2.append(i3 != -1 ? i3 != 0 ? String.valueOf(i3) : "RESULT_CANCELED" : "RESULT_OK");
        sb2.append(", data=");
        sb2.append(this.f4428e);
        sb2.append('}');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.getClass();
        parcel.writeInt(this.f4427d);
        Intent intent = this.f4428e;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i3);
        }
    }
}
