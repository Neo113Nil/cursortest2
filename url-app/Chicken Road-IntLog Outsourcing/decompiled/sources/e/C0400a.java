package e;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0400a implements Parcelable {
    public static final Parcelable.Creator<C0400a> CREATOR = new B1.c(13);

    /* renamed from: a, reason: collision with root package name */
    public final int f5494a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f5495b;

    public C0400a(int i2, Intent intent) {
        this.f5494a = i2;
        this.f5495b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i2 = this.f5494a;
        sb.append(i2 != -1 ? i2 != 0 ? String.valueOf(i2) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f5495b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f5494a);
        Intent intent = this.f5495b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i2);
        }
    }

    public C0400a(Parcel parcel) {
        this.f5494a = parcel.readInt();
        this.f5495b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
