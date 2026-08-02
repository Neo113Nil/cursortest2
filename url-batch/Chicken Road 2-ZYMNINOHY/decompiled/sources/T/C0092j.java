package T;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: T.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0092j implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2795a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2795a) {
            case 0:
                return new C0094l(parcel);
            case 1:
                return new C0093k(parcel);
            default:
                return new O(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.f2795a) {
            case 0:
                return new C0094l[i4];
            case 1:
                return new C0093k[i4];
            default:
                return new O[i4];
        }
    }
}
