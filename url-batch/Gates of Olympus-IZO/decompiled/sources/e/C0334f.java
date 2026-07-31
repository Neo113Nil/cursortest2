package e;

import Z1.i;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0334f implements Parcelable {
    public static final Parcelable.Creator<C0334f> CREATOR = new A1.a(2);

    /* renamed from: d, reason: collision with root package name */
    public final IntentSender f4465d;

    /* renamed from: e, reason: collision with root package name */
    public final Intent f4466e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4467f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4468g;

    public C0334f(Parcel parcel) {
        i.f(parcel, "parcel");
        Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        i.c(readParcelable);
        Intent intent = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        this.f4465d = (IntentSender) readParcelable;
        this.f4466e = intent;
        this.f4467f = readInt;
        this.f4468g = readInt2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        i.f(parcel, "dest");
        parcel.writeParcelable(this.f4465d, i3);
        parcel.writeParcelable(this.f4466e, i3);
        parcel.writeInt(this.f4467f);
        parcel.writeInt(this.f4468g);
    }
}
