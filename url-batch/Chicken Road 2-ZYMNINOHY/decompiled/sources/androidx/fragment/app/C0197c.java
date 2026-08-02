package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0197c implements Parcelable {
    public static final Parcelable.Creator<C0197c> CREATOR = new H.h(6);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4820a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4821b;

    public C0197c(Parcel parcel) {
        this.f4820a = parcel.createStringArrayList();
        this.f4821b = parcel.createTypedArrayList(C0195b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeStringList(this.f4820a);
        parcel.writeTypedList(this.f4821b);
    }
}
