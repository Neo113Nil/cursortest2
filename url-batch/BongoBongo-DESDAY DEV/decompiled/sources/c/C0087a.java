package c;

import R.k;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import h1.d;

/* renamed from: c.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0087a implements Parcelable {
    public static final Parcelable.Creator<C0087a> CREATOR = new k(6);

    /* renamed from: a, reason: collision with root package name */
    public final int f1728a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f1729b;

    public C0087a(Intent intent, int i) {
        this.f1728a = i;
        this.f1729b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f1728a;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f1729b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        d.e(parcel, "dest");
        parcel.writeInt(this.f1728a);
        Intent intent = this.f1729b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
