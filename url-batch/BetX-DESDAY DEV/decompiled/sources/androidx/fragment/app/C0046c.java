package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0046c implements Parcelable {
    public static final Parcelable.Creator<C0046c> CREATOR = new Q.k(2);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1329a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1330b;

    public C0046c(Parcel parcel) {
        this.f1329a = parcel.createStringArrayList();
        this.f1330b = parcel.createTypedArrayList(C0045b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f1329a);
        parcel.writeTypedList(this.f1330b);
    }
}
