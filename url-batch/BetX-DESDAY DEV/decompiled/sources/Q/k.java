package Q;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0045b;
import androidx.fragment.app.C0046c;
import androidx.fragment.app.H;
import androidx.fragment.app.M;
import androidx.fragment.app.Q;
import androidx.versionedparcelable.ParcelImpl;
import c.C0094a;
import c.C0104k;
import com.luckyarcade.spinthrow.GameConfig;
import e0.C0133u;
import e0.d0;
import e0.e0;
import java.util.ArrayList;
import l.C0247P;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f726a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f726a) {
            case 0:
                l lVar = new l(parcel);
                lVar.f727a = parcel.readInt();
                return lVar;
            case 1:
                return new C0045b(parcel);
            case 2:
                return new C0046c(parcel);
            case GameConfig.COMBO_EVERY /* 3 */:
                H h = new H();
                h.f1208a = parcel.readString();
                h.f1209b = parcel.readInt();
                return h;
            case 4:
                M m2 = new M();
                m2.f1252e = null;
                m2.f1253f = new ArrayList();
                m2.f1254g = new ArrayList();
                m2.f1248a = parcel.createStringArrayList();
                m2.f1249b = parcel.createStringArrayList();
                m2.f1250c = (C0045b[]) parcel.createTypedArray(C0045b.CREATOR);
                m2.f1251d = parcel.readInt();
                m2.f1252e = parcel.readString();
                m2.f1253f = parcel.createStringArrayList();
                m2.f1254g = parcel.createTypedArrayList(C0046c.CREATOR);
                m2.h = parcel.createTypedArrayList(H.CREATOR);
                return m2;
            case 5:
                return new Q(parcel);
            case 6:
                X0.f.e(parcel, "parcel");
                return new C0094a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 7:
                X0.f.e(parcel, "inParcel");
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                X0.f.b(readParcelable);
                return new C0104k((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 8:
                return new com.google.android.material.datepicker.b((com.google.android.material.datepicker.o) parcel.readParcelable(com.google.android.material.datepicker.o.class.getClassLoader()), (com.google.android.material.datepicker.o) parcel.readParcelable(com.google.android.material.datepicker.o.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (com.google.android.material.datepicker.o) parcel.readParcelable(com.google.android.material.datepicker.o.class.getClassLoader()), parcel.readInt());
            case 9:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case GameConfig.SCORE_PER_STICK /* 10 */:
                return com.google.android.material.datepicker.o.a(parcel.readInt(), parcel.readInt());
            case 11:
                C0133u c0133u = new C0133u();
                c0133u.f2350a = parcel.readInt();
                c0133u.f2351b = parcel.readInt();
                c0133u.f2352c = parcel.readInt() == 1;
                return c0133u;
            case 12:
                d0 d0Var = new d0();
                d0Var.f2216a = parcel.readInt();
                d0Var.f2217b = parcel.readInt();
                d0Var.f2219d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    d0Var.f2218c = iArr;
                    parcel.readIntArray(iArr);
                }
                return d0Var;
            case 13:
                e0 e0Var = new e0();
                e0Var.f2226a = parcel.readInt();
                e0Var.f2227b = parcel.readInt();
                int readInt2 = parcel.readInt();
                e0Var.f2228c = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    e0Var.f2229d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                e0Var.f2230e = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    e0Var.f2231f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                e0Var.h = parcel.readInt() == 1;
                e0Var.i = parcel.readInt() == 1;
                e0Var.f2233j = parcel.readInt() == 1;
                e0Var.f2232g = parcel.readArrayList(d0.class.getClassLoader());
                return e0Var;
            case 14:
                C0247P c0247p = new C0247P(parcel);
                c0247p.f3285a = parcel.readByte() != 0;
                return c0247p;
            case 15:
                return new ParcelImpl(parcel);
            default:
                v0.b bVar = new v0.b(parcel);
                bVar.f4451a = ((Integer) parcel.readValue(v0.b.class.getClassLoader())).intValue();
                return bVar;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f726a) {
            case 0:
                return new l[i];
            case 1:
                return new C0045b[i];
            case 2:
                return new C0046c[i];
            case GameConfig.COMBO_EVERY /* 3 */:
                return new H[i];
            case 4:
                return new M[i];
            case 5:
                return new Q[i];
            case 6:
                return new C0094a[i];
            case 7:
                return new C0104k[i];
            case 8:
                return new com.google.android.material.datepicker.b[i];
            case 9:
                return new com.google.android.material.datepicker.d[i];
            case GameConfig.SCORE_PER_STICK /* 10 */:
                return new com.google.android.material.datepicker.o[i];
            case 11:
                return new C0133u[i];
            case 12:
                return new d0[i];
            case 13:
                return new e0[i];
            case 14:
                return new C0247P[i];
            case 15:
                return new ParcelImpl[i];
            default:
                return new v0.b[i];
        }
    }
}
