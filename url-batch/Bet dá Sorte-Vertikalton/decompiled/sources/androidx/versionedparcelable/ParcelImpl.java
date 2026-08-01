package androidx.versionedparcelable;

import A0.b;
import android.os.Parcel;
import android.os.Parcelable;
import m0.C0254b;
import m0.InterfaceC0255c;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new b(15);

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0255c f1574a;

    public ParcelImpl(Parcel parcel) {
        this.f1574a = new C0254b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new C0254b(parcel).i(this.f1574a);
    }
}
