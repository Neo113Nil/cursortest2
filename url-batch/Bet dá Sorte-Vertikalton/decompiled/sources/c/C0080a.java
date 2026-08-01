package c;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import b1.d;

/* renamed from: c.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0080a implements Parcelable {
    public static final Parcelable.Creator<C0080a> CREATOR = new A0.b(7);

    /* renamed from: a, reason: collision with root package name */
    public final int f1589a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f1590b;

    public C0080a(Intent intent, int i) {
        this.f1589a = i;
        this.f1590b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f1589a;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f1590b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        d.e(parcel, "dest");
        parcel.writeInt(this.f1589a);
        Intent intent = this.f1590b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
