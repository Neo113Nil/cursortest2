package g0;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b1 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3693a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f3693a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new c1(parcel.readFloat());
            case 1:
                return new d1(parcel.readInt());
            default:
                return new e1(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f3693a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new c1[i7];
            case 1:
                return new d1[i7];
            default:
                return new e1[i7];
        }
    }
}
