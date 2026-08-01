package c;

import Q.k;
import X0.e;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0077a implements Parcelable {
    public static final Parcelable.Creator<C0077a> CREATOR = new k(6);

    /* renamed from: a, reason: collision with root package name */
    public final int f1507a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f1508b;

    public C0077a(Intent intent, int i) {
        this.f1507a = i;
        this.f1508b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f1507a;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f1508b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        e.e(parcel, "dest");
        parcel.writeInt(this.f1507a);
        Intent intent = this.f1508b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
