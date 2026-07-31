package e;

import Z1.i;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0329a implements Parcelable {
    public static final Parcelable.Creator<C0329a> CREATOR = new A1.a(1);

    /* renamed from: d, reason: collision with root package name */
    public final int f4454d;

    /* renamed from: e, reason: collision with root package name */
    public final Intent f4455e;

    public C0329a(Intent intent, int i3) {
        this.f4454d = i3;
        this.f4455e = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i3 = this.f4454d;
        sb.append(i3 != -1 ? i3 != 0 ? String.valueOf(i3) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f4455e);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        i.f(parcel, "dest");
        parcel.writeInt(this.f4454d);
        Intent intent = this.f4455e;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i3);
        }
    }
}
