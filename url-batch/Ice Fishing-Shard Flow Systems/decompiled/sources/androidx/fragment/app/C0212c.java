package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0212c implements Parcelable {
    public static final Parcelable.Creator<C0212c> CREATOR = new I1.c(5);

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f3715d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3716e;

    public C0212c(Parcel parcel) {
        this.f3715d = parcel.createStringArrayList();
        this.f3716e = parcel.createTypedArrayList(C0211b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeStringList(this.f3715d);
        parcel.writeTypedList(this.f3716e);
    }
}
