package E1;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import e.C0409a;
import e.C0414f;
import f2.j;
import k1.i;
import t1.C1029i;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1032a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1032a) {
            case 0:
                return new ParcelImpl(parcel);
            case 1:
                j.f(parcel, "parcel");
                return new C0409a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                j.f(parcel, "inParcel");
                return new C0414f(parcel);
            default:
                j.f(parcel, "inParcel");
                return new C1029i(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f1032a) {
            case 0:
                return new ParcelImpl[i3];
            case 1:
                return new C0409a[i3];
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                return new C0414f[i3];
            default:
                return new C1029i[i3];
        }
    }
}
