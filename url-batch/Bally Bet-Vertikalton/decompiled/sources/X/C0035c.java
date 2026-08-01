package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0035c implements Parcelable {
    public static final Parcelable.Creator<C0035c> CREATOR = new Q.k(2);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f909a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f910b;

    public C0035c(Parcel parcel) {
        this.f909a = parcel.createStringArrayList();
        this.f910b = parcel.createTypedArrayList(C0034b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f909a);
        parcel.writeTypedList(this.f910b);
    }
}
