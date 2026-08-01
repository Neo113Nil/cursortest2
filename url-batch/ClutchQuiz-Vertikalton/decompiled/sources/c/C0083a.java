package c;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import g1.f;

/* renamed from: c.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0083a implements Parcelable {
    public static final Parcelable.Creator<C0083a> CREATOR = new C0.b(7);

    /* renamed from: a, reason: collision with root package name */
    public final int f1703a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f1704b;

    public C0083a(Intent intent, int i) {
        this.f1703a = i;
        this.f1704b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f1703a;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f1704b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        f.e(parcel, "dest");
        parcel.writeInt(this.f1703a);
        Intent intent = this.f1704b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
