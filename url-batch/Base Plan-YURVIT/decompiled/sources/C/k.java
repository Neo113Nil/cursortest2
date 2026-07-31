package C;

import N.C0058o;
import N.L;
import N.M;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f178a) {
            case 0:
                l lVar = new l(parcel);
                lVar.f179e = parcel.readInt();
                return lVar;
            case 1:
                C0058o c0058o = new C0058o();
                c0058o.f763e = parcel.readInt();
                c0058o.f764f = parcel.readInt();
                c0058o.f765g = parcel.readInt() == 1;
                return c0058o;
            case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                L l2 = new L();
                l2.f671e = parcel.readInt();
                l2.f672f = parcel.readInt();
                l2.f674h = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    l2.f673g = iArr;
                    parcel.readIntArray(iArr);
                }
                return l2;
            case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                M m2 = new M();
                m2.f675e = parcel.readInt();
                m2.f676f = parcel.readInt();
                int readInt2 = parcel.readInt();
                m2.f677g = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    m2.f678h = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                m2.f679i = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    m2.f680j = iArr3;
                    parcel.readIntArray(iArr3);
                }
                m2.f682l = parcel.readInt() == 1;
                m2.f683m = parcel.readInt() == 1;
                m2.f684n = parcel.readInt() == 1;
                m2.f681k = parcel.readArrayList(L.class.getClassLoader());
                return m2;
            default:
                return new ParcelImpl(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f178a) {
            case 0:
                return new l[i2];
            case 1:
                return new C0058o[i2];
            case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                return new L[i2];
            case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                return new M[i2];
            default:
                return new ParcelImpl[i2];
        }
    }
}
