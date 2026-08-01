package Y;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: Y.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0036c implements Parcelable {
    public static final Parcelable.Creator<C0036c> CREATOR = new F0.b(3);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1397a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1398b;

    public C0036c(Parcel parcel) {
        this.f1397a = parcel.createStringArrayList();
        this.f1398b = parcel.createTypedArrayList(C0035b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f1397a);
        parcel.writeTypedList(this.f1398b);
    }
}
