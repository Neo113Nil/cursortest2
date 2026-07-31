package e;

import I.j;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0336a implements Parcelable {
    public static final Parcelable.Creator<C0336a> CREATOR = new j(15);

    /* renamed from: f, reason: collision with root package name */
    public final int f3994f;

    /* renamed from: g, reason: collision with root package name */
    public final Intent f3995g;

    public C0336a(int i7, Intent intent) {
        this.f3994f = i7;
        this.f3995g = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i7 = this.f3994f;
        sb.append(i7 != -1 ? i7 != 0 ? String.valueOf(i7) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f3995g);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f3994f);
        Intent intent = this.f3995g;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i7);
        }
    }

    public C0336a(Parcel parcel) {
        this.f3994f = parcel.readInt();
        this.f3995g = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
