package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0034c implements Parcelable {
    public static final Parcelable.Creator<C0034c> CREATOR = new Q.k(2);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1018a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1019b;

    public C0034c(Parcel parcel) {
        this.f1018a = parcel.createStringArrayList();
        this.f1019b = parcel.createTypedArrayList(C0033b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f1018a);
        parcel.writeTypedList(this.f1019b);
    }
}
