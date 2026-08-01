package b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import u2.c;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new androidx.fragment.app.b(5);

    /* renamed from: f, reason: collision with root package name */
    public final int f684f;
    public final Intent g;

    public a(Intent intent, int i4) {
        this.f684f = i4;
        this.g = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i4 = this.f684f;
        sb.append(i4 != -1 ? i4 != 0 ? String.valueOf(i4) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        c.e(parcel, "dest");
        parcel.writeInt(this.f684f);
        Intent intent = this.g;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i4);
        }
    }
}
