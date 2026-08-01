package c;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import i3.d;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new androidx.fragment.app.b(5);

    /* renamed from: f, reason: collision with root package name */
    public final int f855f;

    /* renamed from: g, reason: collision with root package name */
    public final Intent f856g;

    public a(Intent intent, int i) {
        this.f855f = i;
        this.f856g = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f855f;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f856g);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        d.e(parcel, "dest");
        parcel.writeInt(this.f855f);
        Intent intent = this.f856g;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
