package A1;

import Z1.i;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import e.C0329a;
import e.C0334f;
import h1.C0438i;
import q1.C0785i;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f11a) {
            case 0:
                return new ParcelImpl(parcel);
            case 1:
                i.f(parcel, "parcel");
                return new C0329a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                i.f(parcel, "inParcel");
                return new C0334f(parcel);
            default:
                i.f(parcel, "inParcel");
                return new C0785i(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f11a) {
            case 0:
                return new ParcelImpl[i3];
            case 1:
                return new C0329a[i3];
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                return new C0334f[i3];
            default:
                return new C0785i[i3];
        }
    }
}
