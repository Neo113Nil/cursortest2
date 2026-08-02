package F;

import P.C0104n;
import P.K;
import P.L;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f453a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f453a) {
            case 0:
                l lVar = new l(parcel);
                lVar.f454a = parcel.readInt();
                return lVar;
            case 1:
                C0104n c0104n = new C0104n();
                c0104n.f937a = parcel.readInt();
                c0104n.f938b = parcel.readInt();
                c0104n.f939c = parcel.readInt() == 1;
                return c0104n;
            case 2:
                K k2 = new K();
                k2.f848a = parcel.readInt();
                k2.f849b = parcel.readInt();
                k2.f851d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    k2.f850c = iArr;
                    parcel.readIntArray(iArr);
                }
                return k2;
            case 3:
                L l2 = new L();
                l2.f852a = parcel.readInt();
                l2.f853b = parcel.readInt();
                int readInt2 = parcel.readInt();
                l2.f854c = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    l2.f855d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                l2.f856e = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    l2.f857f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                l2.f859h = parcel.readInt() == 1;
                l2.f860i = parcel.readInt() == 1;
                l2.f861j = parcel.readInt() == 1;
                l2.f858g = parcel.readArrayList(K.class.getClassLoader());
                return l2;
            default:
                return new ParcelImpl(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f453a) {
            case 0:
                return new l[i2];
            case 1:
                return new C0104n[i2];
            case 2:
                return new K[i2];
            case 3:
                return new L[i2];
            default:
                return new ParcelImpl[i2];
        }
    }
}
