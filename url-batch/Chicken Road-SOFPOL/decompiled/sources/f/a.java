package f;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import q6.i;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new e5.a(1);

    /* renamed from: d, reason: collision with root package name */
    public final int f2577d;

    /* renamed from: e, reason: collision with root package name */
    public final Intent f2578e;

    public a(Intent intent, int i) {
        this.f2577d = i;
        this.f2578e = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f2577d;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f2578e);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "dest");
        parcel.writeInt(this.f2577d);
        Intent intent = this.f2578e;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
