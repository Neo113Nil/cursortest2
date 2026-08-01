package Z;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: Z.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0033c implements Parcelable {
    public static final Parcelable.Creator<C0033c> CREATOR = new S.k(2);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1127a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1128b;

    public C0033c(Parcel parcel) {
        this.f1127a = parcel.createStringArrayList();
        this.f1128b = parcel.createTypedArrayList(C0032b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f1127a);
        parcel.writeTypedList(this.f1128b);
    }
}
