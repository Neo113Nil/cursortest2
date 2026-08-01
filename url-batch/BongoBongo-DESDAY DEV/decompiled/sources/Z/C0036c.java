package Z;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: Z.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0036c implements Parcelable {
    public static final Parcelable.Creator<C0036c> CREATOR = new R.k(2);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1116a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1117b;

    public C0036c(Parcel parcel) {
        this.f1116a = parcel.createStringArrayList();
        this.f1117b = parcel.createTypedArrayList(C0035b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f1116a);
        parcel.writeTypedList(this.f1117b);
    }
}
