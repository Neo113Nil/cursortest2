package e;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new d4.a(1);

    /* renamed from: f, reason: collision with root package name */
    public final int f2650f;

    /* renamed from: g, reason: collision with root package name */
    public final Intent f2651g;

    public a(Intent intent, int i7) {
        this.f2650f = i7;
        this.f2651g = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i7 = this.f2650f;
        sb.append(i7 != -1 ? i7 != 0 ? String.valueOf(i7) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f2651g);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        k.f(parcel, "dest");
        parcel.writeInt(this.f2650f);
        Intent intent = this.f2651g;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i7);
        }
    }
}
