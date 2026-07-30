package A;

import L.C0040p;
import L.M;
import L.N;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

/* loaded from: classes.dex */
public final class l implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f31a) {
            case 0:
                m mVar = new m(parcel);
                mVar.f32a = parcel.readInt();
                return mVar;
            case 1:
                C0040p c0040p = new C0040p();
                c0040p.f585a = parcel.readInt();
                c0040p.f586b = parcel.readInt();
                c0040p.f587c = parcel.readInt() == 1;
                return c0040p;
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                M m2 = new M();
                m2.f488a = parcel.readInt();
                m2.f489b = parcel.readInt();
                m2.f491d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    m2.f490c = iArr;
                    parcel.readIntArray(iArr);
                }
                return m2;
            case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                N n2 = new N();
                n2.f492a = parcel.readInt();
                n2.f493b = parcel.readInt();
                int readInt2 = parcel.readInt();
                n2.f494c = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    n2.f495d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                n2.f496e = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    n2.f497f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                n2.f499h = parcel.readInt() == 1;
                n2.f500i = parcel.readInt() == 1;
                n2.f501j = parcel.readInt() == 1;
                n2.f498g = parcel.readArrayList(M.class.getClassLoader());
                return n2;
            default:
                return new ParcelImpl(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f31a) {
            case 0:
                return new m[i2];
            case 1:
                return new C0040p[i2];
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                return new M[i2];
            case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                return new N[i2];
            default:
                return new ParcelImpl[i2];
        }
    }
}
