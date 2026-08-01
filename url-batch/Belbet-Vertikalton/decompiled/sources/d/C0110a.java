package d;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import j1.h;

/* renamed from: d.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0110a implements Parcelable {
    public static final Parcelable.Creator<C0110a> CREATOR = new B0.b(10);

    /* renamed from: a, reason: collision with root package name */
    public final int f2641a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f2642b;

    public C0110a(Intent intent, int i) {
        this.f2641a = i;
        this.f2642b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f2641a;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f2642b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "dest");
        parcel.writeInt(this.f2641a);
        Intent intent = this.f2642b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
