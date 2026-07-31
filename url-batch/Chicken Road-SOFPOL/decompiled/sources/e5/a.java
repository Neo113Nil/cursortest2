package e5;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import q6.i;
import u3.g;
import w4.r;
import w4.t0;
import w4.u0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2492a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2492a) {
            case 0:
                return new ParcelImpl(parcel);
            case 1:
                i.e(parcel, "parcel");
                return new f.a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                g gVar = new g(parcel);
                gVar.f7374d = parcel.readInt();
                return gVar;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                r rVar = new r();
                rVar.f8023d = parcel.readInt();
                rVar.f8024e = parcel.readInt();
                rVar.f8025f = parcel.readInt() == 1;
                return rVar;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                t0 t0Var = new t0();
                t0Var.f8034d = parcel.readInt();
                t0Var.f8035e = parcel.readInt();
                t0Var.f8037g = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    t0Var.f8036f = iArr;
                    parcel.readIntArray(iArr);
                }
                return t0Var;
            default:
                u0 u0Var = new u0();
                u0Var.f8040d = parcel.readInt();
                u0Var.f8041e = parcel.readInt();
                int readInt2 = parcel.readInt();
                u0Var.f8042f = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    u0Var.f8043g = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                u0Var.f8044h = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    u0Var.i = iArr3;
                    parcel.readIntArray(iArr3);
                }
                u0Var.f8046k = parcel.readInt() == 1;
                u0Var.f8047l = parcel.readInt() == 1;
                u0Var.f8048m = parcel.readInt() == 1;
                u0Var.f8045j = parcel.readArrayList(t0.class.getClassLoader());
                return u0Var;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f2492a) {
            case 0:
                return new ParcelImpl[i];
            case 1:
                return new f.a[i];
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                return new g[i];
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                return new r[i];
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                return new t0[i];
            default:
                return new u0[i];
        }
    }
}
