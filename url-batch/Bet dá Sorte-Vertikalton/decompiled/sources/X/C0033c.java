package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0033c implements Parcelable {
    public static final Parcelable.Creator<C0033c> CREATOR = new A0.b(3);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f992a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f993b;

    public C0033c(Parcel parcel) {
        this.f992a = parcel.createStringArrayList();
        this.f993b = parcel.createTypedArrayList(C0032b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f992a);
        parcel.writeTypedList(this.f993b);
    }
}
