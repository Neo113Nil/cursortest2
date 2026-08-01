package Z;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: Z.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0039c implements Parcelable {
    public static final Parcelable.Creator<C0039c> CREATOR = new B0.b(3);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1545a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1546b;

    public C0039c(Parcel parcel) {
        this.f1545a = parcel.createStringArrayList();
        this.f1546b = parcel.createTypedArrayList(C0038b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f1545a);
        parcel.writeTypedList(this.f1546b);
    }
}
