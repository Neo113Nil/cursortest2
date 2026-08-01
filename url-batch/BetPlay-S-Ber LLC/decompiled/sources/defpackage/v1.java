package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.b;
import androidx.fragment.app.p;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class v1 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new w1(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            case 1:
                v5 v5Var = new v5(parcel);
                v5Var.f = parcel.readByte() != 0;
                return v5Var;
            case 2:
                return new b(parcel);
            case 3:
                return new s7(parcel);
            case 4:
                return new x8((yu) parcel.readParcelable(yu.class.getClassLoader()), (yu) parcel.readParcelable(yu.class.getClassLoader()), (ee) parcel.readParcelable(ee.class.getClassLoader()), (yu) parcel.readParcelable(yu.class.getClassLoader()), parcel.readInt());
            case BottomSheetBehavior.STATE_HIDDEN /* 5 */:
                return new ee(parcel.readLong());
            case BottomSheetBehavior.STATE_HALF_EXPANDED /* 6 */:
                uk ukVar = new uk();
                ukVar.f = parcel.readString();
                ukVar.g = parcel.readInt();
                return ukVar;
            case 7:
                yk ykVar = new yk();
                ykVar.j = null;
                ykVar.k = new ArrayList();
                ykVar.l = new ArrayList();
                ykVar.f = parcel.createStringArrayList();
                ykVar.g = parcel.createStringArrayList();
                ykVar.h = (b[]) parcel.createTypedArray(b.CREATOR);
                ykVar.i = parcel.readInt();
                ykVar.j = parcel.readString();
                ykVar.k = parcel.createStringArrayList();
                ykVar.l = parcel.createTypedArrayList(s7.CREATOR);
                ykVar.m = parcel.createTypedArrayList(uk.CREATOR);
                return ykVar;
            case BottomSheetBehavior.SAVE_SKIP_COLLAPSED /* 8 */:
                return new p(parcel);
            case 9:
                parcel.getClass();
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                readParcelable.getClass();
                return new mp((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 10:
                vq vqVar = new vq();
                vqVar.f = parcel.readInt();
                vqVar.g = parcel.readInt();
                vqVar.h = parcel.readInt() == 1;
                return vqVar;
            case 11:
                ht htVar = new ht(parcel);
                htVar.f = ((Integer) parcel.readValue(ht.class.getClassLoader())).intValue();
                return htVar;
            case 12:
                return yu.a(parcel.readInt(), parcel.readInt());
            case 13:
                qv qvVar = new qv(parcel);
                qvVar.f = parcel.readInt();
                return qvVar;
            case 14:
                return new ParcelImpl(parcel);
            case 15:
                y30 y30Var = new y30();
                y30Var.f = parcel.readInt();
                y30Var.g = parcel.readInt();
                y30Var.i = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    y30Var.h = iArr;
                    parcel.readIntArray(iArr);
                }
                return y30Var;
            default:
                z30 z30Var = new z30();
                z30Var.f = parcel.readInt();
                z30Var.g = parcel.readInt();
                int readInt2 = parcel.readInt();
                z30Var.h = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    z30Var.i = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                z30Var.j = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    z30Var.k = iArr3;
                    parcel.readIntArray(iArr3);
                }
                z30Var.m = parcel.readInt() == 1;
                z30Var.n = parcel.readInt() == 1;
                z30Var.o = parcel.readInt() == 1;
                z30Var.l = parcel.readArrayList(y30.class.getClassLoader());
                return z30Var;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new w1[i];
            case 1:
                return new v5[i];
            case 2:
                return new b[i];
            case 3:
                return new s7[i];
            case 4:
                return new x8[i];
            case BottomSheetBehavior.STATE_HIDDEN /* 5 */:
                return new ee[i];
            case BottomSheetBehavior.STATE_HALF_EXPANDED /* 6 */:
                return new uk[i];
            case 7:
                return new yk[i];
            case BottomSheetBehavior.SAVE_SKIP_COLLAPSED /* 8 */:
                return new p[i];
            case 9:
                return new mp[i];
            case 10:
                return new vq[i];
            case 11:
                return new ht[i];
            case 12:
                return new yu[i];
            case 13:
                return new qv[i];
            case 14:
                return new ParcelImpl[i];
            case 15:
                return new y30[i];
            default:
                return new z30[i];
        }
    }
}
