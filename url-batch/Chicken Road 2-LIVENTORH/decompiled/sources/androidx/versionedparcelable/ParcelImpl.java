package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.b;
import l1.c;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new b(15);

    /* renamed from: f, reason: collision with root package name */
    public final c f715f;

    public ParcelImpl(Parcel parcel) {
        this.f715f = new l1.b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new l1.b(parcel).i(this.f715f);
    }
}
