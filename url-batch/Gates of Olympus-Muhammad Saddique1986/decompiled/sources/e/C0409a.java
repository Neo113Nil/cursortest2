package e;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import f2.j;

/* renamed from: e.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0409a implements Parcelable {
    public static final Parcelable.Creator<C0409a> CREATOR = new E1.a(1);

    /* renamed from: d, reason: collision with root package name */
    public final int f5676d;

    /* renamed from: e, reason: collision with root package name */
    public final Intent f5677e;

    public C0409a(Intent intent, int i3) {
        this.f5676d = i3;
        this.f5677e = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i3 = this.f5676d;
        sb.append(i3 != -1 ? i3 != 0 ? String.valueOf(i3) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f5677e);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        j.f(parcel, "dest");
        parcel.writeInt(this.f5676d);
        Intent intent = this.f5677e;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i3);
        }
    }
}
