package e;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import f2.j;

/* renamed from: e.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0414f implements Parcelable {
    public static final Parcelable.Creator<C0414f> CREATOR = new E1.a(2);

    /* renamed from: d, reason: collision with root package name */
    public final IntentSender f5687d;

    /* renamed from: e, reason: collision with root package name */
    public final Intent f5688e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5689f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5690g;

    public C0414f(Parcel parcel) {
        j.f(parcel, "parcel");
        Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        j.c(readParcelable);
        Intent intent = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        this.f5687d = (IntentSender) readParcelable;
        this.f5688e = intent;
        this.f5689f = readInt;
        this.f5690g = readInt2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        j.f(parcel, "dest");
        parcel.writeParcelable(this.f5687d, i3);
        parcel.writeParcelable(this.f5688e, i3);
        parcel.writeInt(this.f5689f);
        parcel.writeInt(this.f5690g);
    }
}
