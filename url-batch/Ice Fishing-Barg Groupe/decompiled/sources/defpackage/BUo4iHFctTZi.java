package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class BUo4iHFctTZi implements Parcelable.Creator {
    public final /* synthetic */ int PxuCJdSBwIXG;

    public /* synthetic */ BUo4iHFctTZi(int i) {
        this.PxuCJdSBwIXG = i;
    }

    public static void PxuCJdSBwIXG(rg0 rg0Var, Parcel parcel, int i) {
        int D0aTLcX6Uhyo = ki0.D0aTLcX6Uhyo(parcel, 20293);
        int i2 = rg0Var.rtx2ld2ELZv4;
        ki0.JTxCbbCwomzt(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = rg0Var.OPXfSBeufaJ8;
        ki0.JTxCbbCwomzt(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = rg0Var.wdg6QnbFHrFF;
        ki0.JTxCbbCwomzt(parcel, 3, 4);
        parcel.writeInt(i4);
        ki0.KUoIVIumpKat(parcel, 4, rg0Var.dgRBjINgWbAK);
        IBinder iBinder = rg0Var.x50lh2ztY7Y5;
        if (iBinder != null) {
            int D0aTLcX6Uhyo2 = ki0.D0aTLcX6Uhyo(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            ki0.PsecLrZVVK61(parcel, D0aTLcX6Uhyo2);
        }
        ki0.qudtW7lwm99e(parcel, 6, rg0Var.cpQdD2nAriOS, i);
        Bundle bundle = rg0Var.r3s1LDPKFs1S;
        if (bundle != null) {
            int D0aTLcX6Uhyo3 = ki0.D0aTLcX6Uhyo(parcel, 7);
            parcel.writeBundle(bundle);
            ki0.PsecLrZVVK61(parcel, D0aTLcX6Uhyo3);
        }
        ki0.yQRudnv4La6p(parcel, 8, rg0Var.QrzZRwfaDlRX, i);
        ki0.qudtW7lwm99e(parcel, 10, rg0Var.gPXPFXrUH4XX, i);
        ki0.qudtW7lwm99e(parcel, 11, rg0Var.BRwzKIf41E4i, i);
        boolean z = rg0Var.XL4ISE6Oc65B;
        ki0.JTxCbbCwomzt(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = rg0Var.RfyTYNmI9Srp;
        ki0.JTxCbbCwomzt(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = rg0Var.EcgxDIVH5in8;
        ki0.JTxCbbCwomzt(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        ki0.KUoIVIumpKat(parcel, 15, rg0Var.S9EYkSpbGuxq);
        ki0.PsecLrZVVK61(parcel, D0aTLcX6Uhyo);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 0;
        String str = null;
        String str2 = null;
        PendingIntent pendingIntent = null;
        String str3 = null;
        Account account = null;
        xq xqVar = null;
        Intent intent = null;
        switch (this.PxuCJdSBwIXG) {
            case 0:
                parcel.getClass();
                return new P6VAkUObIv30(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            case 1:
                return new sw(parcel.readInt());
            case 2:
                return new ParcelImpl(parcel);
            case 3:
                return new fj1(parcel.readFloat());
            case 4:
                return new hj1(parcel.readInt());
            case 5:
                return new jj1(parcel.readLong());
            case 6:
                int amuv7NJvPxHu = th0.amuv7NJvPxHu(parcel);
                while (true) {
                    ArrayList arrayList = null;
                    while (parcel.dataPosition() < amuv7NJvPxHu) {
                        int readInt = parcel.readInt();
                        char c = (char) readInt;
                        if (c == 1) {
                            i = th0.jyegZNwi31qc(parcel, readInt);
                        } else if (c != 2) {
                            th0.xfACYKDMU6Dj(parcel, readInt);
                        } else {
                            Parcelable.Creator<c61> creator = c61.CREATOR;
                            int aF05bpZJlKEP = th0.aF05bpZJlKEP(parcel, readInt);
                            int dataPosition = parcel.dataPosition();
                            if (aF05bpZJlKEP == 0) {
                                break;
                            }
                            arrayList = parcel.createTypedArrayList(creator);
                            parcel.setDataPosition(dataPosition + aF05bpZJlKEP);
                        }
                    }
                    th0.XL4ISE6Oc65B(parcel, amuv7NJvPxHu);
                    return new ee2(i, arrayList);
                    break;
                }
            case 7:
                int amuv7NJvPxHu2 = th0.amuv7NJvPxHu(parcel);
                int i2 = 0;
                while (parcel.dataPosition() < amuv7NJvPxHu2) {
                    int readInt2 = parcel.readInt();
                    char c2 = (char) readInt2;
                    if (c2 == 1) {
                        i = th0.jyegZNwi31qc(parcel, readInt2);
                    } else if (c2 == 2) {
                        i2 = th0.jyegZNwi31qc(parcel, readInt2);
                    } else if (c2 != 3) {
                        th0.xfACYKDMU6Dj(parcel, readInt2);
                    } else {
                        intent = (Intent) th0.r3s1LDPKFs1S(parcel, readInt2, Intent.CREATOR);
                    }
                }
                th0.XL4ISE6Oc65B(parcel, amuv7NJvPxHu2);
                return new pv2(i, i2, intent);
            case 8:
                int amuv7NJvPxHu3 = th0.amuv7NJvPxHu(parcel);
                long j = 0;
                int i3 = 0;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                Uri uri = null;
                String str8 = null;
                String str9 = null;
                ArrayList arrayList2 = null;
                String str10 = null;
                String str11 = null;
                while (parcel.dataPosition() < amuv7NJvPxHu3) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            i3 = th0.jyegZNwi31qc(parcel, readInt3);
                            break;
                        case 2:
                            str4 = th0.QrzZRwfaDlRX(parcel, readInt3);
                            break;
                        case 3:
                            str5 = th0.QrzZRwfaDlRX(parcel, readInt3);
                            break;
                        case 4:
                            str6 = th0.QrzZRwfaDlRX(parcel, readInt3);
                            break;
                        case 5:
                            str7 = th0.QrzZRwfaDlRX(parcel, readInt3);
                            break;
                        case 6:
                            uri = (Uri) th0.r3s1LDPKFs1S(parcel, readInt3, Uri.CREATOR);
                            break;
                        case 7:
                            str8 = th0.QrzZRwfaDlRX(parcel, readInt3);
                            break;
                        case '\b':
                            th0.gGoUzNp9JO5I(parcel, readInt3, 8);
                            j = parcel.readLong();
                            break;
                        case '\t':
                            str9 = th0.QrzZRwfaDlRX(parcel, readInt3);
                            break;
                        case '\n':
                            Parcelable.Creator<Scope> creator2 = Scope.CREATOR;
                            int aF05bpZJlKEP2 = th0.aF05bpZJlKEP(parcel, readInt3);
                            int dataPosition2 = parcel.dataPosition();
                            if (aF05bpZJlKEP2 != 0) {
                                ArrayList createTypedArrayList = parcel.createTypedArrayList(creator2);
                                parcel.setDataPosition(dataPosition2 + aF05bpZJlKEP2);
                                arrayList2 = createTypedArrayList;
                                break;
                            } else {
                                arrayList2 = null;
                                break;
                            }
                        case 11:
                            str10 = th0.QrzZRwfaDlRX(parcel, readInt3);
                            break;
                        case '\f':
                            str11 = th0.QrzZRwfaDlRX(parcel, readInt3);
                            break;
                        default:
                            th0.xfACYKDMU6Dj(parcel, readInt3);
                            break;
                    }
                }
                th0.XL4ISE6Oc65B(parcel, amuv7NJvPxHu3);
                return new GoogleSignInAccount(i3, str4, str5, str6, str7, uri, str8, j, str9, arrayList2, str10, str11);
            case 9:
                int amuv7NJvPxHu4 = th0.amuv7NJvPxHu(parcel);
                ArrayList<String> arrayList3 = null;
                String str12 = null;
                while (parcel.dataPosition() < amuv7NJvPxHu4) {
                    int readInt4 = parcel.readInt();
                    char c3 = (char) readInt4;
                    if (c3 == 1) {
                        int aF05bpZJlKEP3 = th0.aF05bpZJlKEP(parcel, readInt4);
                        int dataPosition3 = parcel.dataPosition();
                        if (aF05bpZJlKEP3 == 0) {
                            arrayList3 = null;
                        } else {
                            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(dataPosition3 + aF05bpZJlKEP3);
                            arrayList3 = createStringArrayList;
                        }
                    } else if (c3 != 2) {
                        th0.xfACYKDMU6Dj(parcel, readInt4);
                    } else {
                        str12 = th0.QrzZRwfaDlRX(parcel, readInt4);
                    }
                }
                th0.XL4ISE6Oc65B(parcel, amuv7NJvPxHu4);
                return new jw2(arrayList3, str12);
            case 10:
                int amuv7NJvPxHu5 = th0.amuv7NJvPxHu(parcel);
                tw2 tw2Var = null;
                while (parcel.dataPosition() < amuv7NJvPxHu5) {
                    int readInt5 = parcel.readInt();
                    char c4 = (char) readInt5;
                    if (c4 == 1) {
                        i = th0.jyegZNwi31qc(parcel, readInt5);
                    } else if (c4 == 2) {
                        xqVar = (xq) th0.r3s1LDPKFs1S(parcel, readInt5, xq.CREATOR);
                    } else if (c4 != 3) {
                        th0.xfACYKDMU6Dj(parcel, readInt5);
                    } else {
                        tw2Var = (tw2) th0.r3s1LDPKFs1S(parcel, readInt5, tw2.CREATOR);
                    }
                }
                th0.XL4ISE6Oc65B(parcel, amuv7NJvPxHu5);
                return new nw2(i, xqVar, tw2Var);
            case 11:
                int amuv7NJvPxHu6 = th0.amuv7NJvPxHu(parcel);
                long j2 = 0;
                long j3 = 0;
                int i4 = -1;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                String str13 = null;
                String str14 = null;
                while (parcel.dataPosition() < amuv7NJvPxHu6) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            i5 = th0.jyegZNwi31qc(parcel, readInt6);
                            break;
                        case 2:
                            i6 = th0.jyegZNwi31qc(parcel, readInt6);
                            break;
                        case 3:
                            i7 = th0.jyegZNwi31qc(parcel, readInt6);
                            break;
                        case 4:
                            th0.gGoUzNp9JO5I(parcel, readInt6, 8);
                            j2 = parcel.readLong();
                            break;
                        case 5:
                            th0.gGoUzNp9JO5I(parcel, readInt6, 8);
                            j3 = parcel.readLong();
                            break;
                        case 6:
                            str13 = th0.QrzZRwfaDlRX(parcel, readInt6);
                            break;
                        case 7:
                            str14 = th0.QrzZRwfaDlRX(parcel, readInt6);
                            break;
                        case '\b':
                            i8 = th0.jyegZNwi31qc(parcel, readInt6);
                            break;
                        case '\t':
                            i4 = th0.jyegZNwi31qc(parcel, readInt6);
                            break;
                        default:
                            th0.xfACYKDMU6Dj(parcel, readInt6);
                            break;
                    }
                }
                th0.XL4ISE6Oc65B(parcel, amuv7NJvPxHu6);
                return new c61(i5, i6, i7, j2, j3, str13, str14, i8, i4);
            case 12:
                int amuv7NJvPxHu7 = th0.amuv7NJvPxHu(parcel);
                int i9 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < amuv7NJvPxHu7) {
                    int readInt7 = parcel.readInt();
                    char c5 = (char) readInt7;
                    if (c5 == 1) {
                        i = th0.jyegZNwi31qc(parcel, readInt7);
                    } else if (c5 == 2) {
                        account = (Account) th0.r3s1LDPKFs1S(parcel, readInt7, Account.CREATOR);
                    } else if (c5 == 3) {
                        i9 = th0.jyegZNwi31qc(parcel, readInt7);
                    } else if (c5 != 4) {
                        th0.xfACYKDMU6Dj(parcel, readInt7);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) th0.r3s1LDPKFs1S(parcel, readInt7, GoogleSignInAccount.CREATOR);
                    }
                }
                th0.XL4ISE6Oc65B(parcel, amuv7NJvPxHu7);
                return new rw2(i, account, i9, googleSignInAccount);
            case 13:
                int amuv7NJvPxHu8 = th0.amuv7NJvPxHu(parcel);
                int i10 = 0;
                boolean z = false;
                boolean z2 = false;
                IBinder iBinder = null;
                xq xqVar2 = null;
                while (parcel.dataPosition() < amuv7NJvPxHu8) {
                    int readInt8 = parcel.readInt();
                    char c6 = (char) readInt8;
                    if (c6 == 1) {
                        i10 = th0.jyegZNwi31qc(parcel, readInt8);
                    } else if (c6 == 2) {
                        int aF05bpZJlKEP4 = th0.aF05bpZJlKEP(parcel, readInt8);
                        int dataPosition4 = parcel.dataPosition();
                        if (aF05bpZJlKEP4 == 0) {
                            iBinder = null;
                        } else {
                            IBinder readStrongBinder = parcel.readStrongBinder();
                            parcel.setDataPosition(dataPosition4 + aF05bpZJlKEP4);
                            iBinder = readStrongBinder;
                        }
                    } else if (c6 == 3) {
                        xqVar2 = (xq) th0.r3s1LDPKFs1S(parcel, readInt8, xq.CREATOR);
                    } else if (c6 == 4) {
                        z = th0.e6tOsSdd2EFb(parcel, readInt8);
                    } else if (c6 != 5) {
                        th0.xfACYKDMU6Dj(parcel, readInt8);
                    } else {
                        z2 = th0.e6tOsSdd2EFb(parcel, readInt8);
                    }
                }
                th0.XL4ISE6Oc65B(parcel, amuv7NJvPxHu8);
                return new tw2(i10, iBinder, xqVar2, z, z2);
            case 14:
                int amuv7NJvPxHu9 = th0.amuv7NJvPxHu(parcel);
                while (parcel.dataPosition() < amuv7NJvPxHu9) {
                    int readInt9 = parcel.readInt();
                    char c7 = (char) readInt9;
                    if (c7 == 1) {
                        i = th0.jyegZNwi31qc(parcel, readInt9);
                    } else if (c7 != 2) {
                        th0.xfACYKDMU6Dj(parcel, readInt9);
                    } else {
                        str3 = th0.QrzZRwfaDlRX(parcel, readInt9);
                    }
                }
                th0.XL4ISE6Oc65B(parcel, amuv7NJvPxHu9);
                return new Scope(str3, i);
            case 15:
                int amuv7NJvPxHu10 = th0.amuv7NJvPxHu(parcel);
                int i11 = 0;
                boolean z3 = false;
                boolean z4 = false;
                int i12 = 0;
                int i13 = 0;
                while (parcel.dataPosition() < amuv7NJvPxHu10) {
                    int readInt10 = parcel.readInt();
                    char c8 = (char) readInt10;
                    if (c8 == 1) {
                        i11 = th0.jyegZNwi31qc(parcel, readInt10);
                    } else if (c8 == 2) {
                        z3 = th0.e6tOsSdd2EFb(parcel, readInt10);
                    } else if (c8 == 3) {
                        z4 = th0.e6tOsSdd2EFb(parcel, readInt10);
                    } else if (c8 == 4) {
                        i12 = th0.jyegZNwi31qc(parcel, readInt10);
                    } else if (c8 != 5) {
                        th0.xfACYKDMU6Dj(parcel, readInt10);
                    } else {
                        i13 = th0.jyegZNwi31qc(parcel, readInt10);
                    }
                }
                th0.XL4ISE6Oc65B(parcel, amuv7NJvPxHu10);
                return new kx1(i11, z3, z4, i12, i13);
            case 16:
                int amuv7NJvPxHu11 = th0.amuv7NJvPxHu(parcel);
                int i14 = 0;
                String str15 = null;
                while (parcel.dataPosition() < amuv7NJvPxHu11) {
                    int readInt11 = parcel.readInt();
                    char c9 = (char) readInt11;
                    if (c9 == 1) {
                        i = th0.jyegZNwi31qc(parcel, readInt11);
                    } else if (c9 == 2) {
                        i14 = th0.jyegZNwi31qc(parcel, readInt11);
                    } else if (c9 == 3) {
                        pendingIntent = (PendingIntent) th0.r3s1LDPKFs1S(parcel, readInt11, PendingIntent.CREATOR);
                    } else if (c9 != 4) {
                        th0.xfACYKDMU6Dj(parcel, readInt11);
                    } else {
                        str15 = th0.QrzZRwfaDlRX(parcel, readInt11);
                    }
                }
                th0.XL4ISE6Oc65B(parcel, amuv7NJvPxHu11);
                return new xq(i, i14, pendingIntent, str15);
            case 17:
                int amuv7NJvPxHu12 = th0.amuv7NJvPxHu(parcel);
                PendingIntent pendingIntent2 = null;
                xq xqVar3 = null;
                while (parcel.dataPosition() < amuv7NJvPxHu12) {
                    int readInt12 = parcel.readInt();
                    char c10 = (char) readInt12;
                    if (c10 == 1) {
                        i = th0.jyegZNwi31qc(parcel, readInt12);
                    } else if (c10 == 2) {
                        str2 = th0.QrzZRwfaDlRX(parcel, readInt12);
                    } else if (c10 == 3) {
                        pendingIntent2 = (PendingIntent) th0.r3s1LDPKFs1S(parcel, readInt12, PendingIntent.CREATOR);
                    } else if (c10 != 4) {
                        th0.xfACYKDMU6Dj(parcel, readInt12);
                    } else {
                        xqVar3 = (xq) th0.r3s1LDPKFs1S(parcel, readInt12, xq.CREATOR);
                    }
                }
                th0.XL4ISE6Oc65B(parcel, amuv7NJvPxHu12);
                return new Status(i, str2, pendingIntent2, xqVar3);
            case 18:
                int amuv7NJvPxHu13 = th0.amuv7NJvPxHu(parcel);
                long j4 = -1;
                while (parcel.dataPosition() < amuv7NJvPxHu13) {
                    int readInt13 = parcel.readInt();
                    char c11 = (char) readInt13;
                    if (c11 == 1) {
                        str = th0.QrzZRwfaDlRX(parcel, readInt13);
                    } else if (c11 == 2) {
                        i = th0.jyegZNwi31qc(parcel, readInt13);
                    } else if (c11 != 3) {
                        th0.xfACYKDMU6Dj(parcel, readInt13);
                    } else {
                        th0.gGoUzNp9JO5I(parcel, readInt13, 8);
                        j4 = parcel.readLong();
                    }
                }
                th0.XL4ISE6Oc65B(parcel, amuv7NJvPxHu13);
                return new t70(i, j4, str);
            case 19:
                int amuv7NJvPxHu14 = th0.amuv7NJvPxHu(parcel);
                Bundle bundle = null;
                t70[] t70VarArr = null;
                cr crVar = null;
                while (parcel.dataPosition() < amuv7NJvPxHu14) {
                    int readInt14 = parcel.readInt();
                    char c12 = (char) readInt14;
                    if (c12 == 1) {
                        int aF05bpZJlKEP5 = th0.aF05bpZJlKEP(parcel, readInt14);
                        int dataPosition5 = parcel.dataPosition();
                        if (aF05bpZJlKEP5 == 0) {
                            bundle = null;
                        } else {
                            Bundle readBundle = parcel.readBundle();
                            parcel.setDataPosition(dataPosition5 + aF05bpZJlKEP5);
                            bundle = readBundle;
                        }
                    } else if (c12 == 2) {
                        t70VarArr = (t70[]) th0.gPXPFXrUH4XX(parcel, readInt14, t70.CREATOR);
                    } else if (c12 == 3) {
                        i = th0.jyegZNwi31qc(parcel, readInt14);
                    } else if (c12 != 4) {
                        th0.xfACYKDMU6Dj(parcel, readInt14);
                    } else {
                        crVar = (cr) th0.r3s1LDPKFs1S(parcel, readInt14, cr.CREATOR);
                    }
                }
                th0.XL4ISE6Oc65B(parcel, amuv7NJvPxHu14);
                nx2 nx2Var = new nx2();
                nx2Var.rtx2ld2ELZv4 = bundle;
                nx2Var.OPXfSBeufaJ8 = t70VarArr;
                nx2Var.wdg6QnbFHrFF = i;
                nx2Var.dgRBjINgWbAK = crVar;
                return nx2Var;
            case 20:
                int amuv7NJvPxHu15 = th0.amuv7NJvPxHu(parcel);
                boolean z5 = false;
                boolean z6 = false;
                int i15 = 0;
                kx1 kx1Var = null;
                int[] iArr = null;
                int[] iArr2 = null;
                while (parcel.dataPosition() < amuv7NJvPxHu15) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 1:
                            kx1Var = (kx1) th0.r3s1LDPKFs1S(parcel, readInt15, kx1.CREATOR);
                            break;
                        case 2:
                            z5 = th0.e6tOsSdd2EFb(parcel, readInt15);
                            break;
                        case 3:
                            z6 = th0.e6tOsSdd2EFb(parcel, readInt15);
                            break;
                        case 4:
                            int aF05bpZJlKEP6 = th0.aF05bpZJlKEP(parcel, readInt15);
                            int dataPosition6 = parcel.dataPosition();
                            if (aF05bpZJlKEP6 != 0) {
                                int[] createIntArray = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition6 + aF05bpZJlKEP6);
                                iArr = createIntArray;
                                break;
                            } else {
                                iArr = null;
                                break;
                            }
                        case 5:
                            i15 = th0.jyegZNwi31qc(parcel, readInt15);
                            break;
                        case 6:
                            int aF05bpZJlKEP7 = th0.aF05bpZJlKEP(parcel, readInt15);
                            int dataPosition7 = parcel.dataPosition();
                            if (aF05bpZJlKEP7 != 0) {
                                int[] createIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition7 + aF05bpZJlKEP7);
                                iArr2 = createIntArray2;
                                break;
                            } else {
                                iArr2 = null;
                                break;
                            }
                        default:
                            th0.xfACYKDMU6Dj(parcel, readInt15);
                            break;
                    }
                }
                th0.XL4ISE6Oc65B(parcel, amuv7NJvPxHu15);
                return new cr(kx1Var, z5, z6, iArr, i15, iArr2);
            default:
                int amuv7NJvPxHu16 = th0.amuv7NJvPxHu(parcel);
                Bundle bundle2 = new Bundle();
                Scope[] scopeArr = rg0.VhhvGxCb8gfr;
                t70[] t70VarArr2 = rg0.S2OOm9zPNm0h;
                t70[] t70VarArr3 = t70VarArr2;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                boolean z7 = false;
                int i19 = 0;
                boolean z8 = false;
                String str16 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String str17 = null;
                while (parcel.dataPosition() < amuv7NJvPxHu16) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 1:
                            i16 = th0.jyegZNwi31qc(parcel, readInt16);
                            break;
                        case 2:
                            i17 = th0.jyegZNwi31qc(parcel, readInt16);
                            break;
                        case 3:
                            i18 = th0.jyegZNwi31qc(parcel, readInt16);
                            break;
                        case 4:
                            str16 = th0.QrzZRwfaDlRX(parcel, readInt16);
                            break;
                        case 5:
                            int aF05bpZJlKEP8 = th0.aF05bpZJlKEP(parcel, readInt16);
                            int dataPosition8 = parcel.dataPosition();
                            if (aF05bpZJlKEP8 != 0) {
                                IBinder readStrongBinder2 = parcel.readStrongBinder();
                                parcel.setDataPosition(dataPosition8 + aF05bpZJlKEP8);
                                iBinder2 = readStrongBinder2;
                                break;
                            } else {
                                iBinder2 = null;
                                break;
                            }
                        case 6:
                            scopeArr = (Scope[]) th0.gPXPFXrUH4XX(parcel, readInt16, Scope.CREATOR);
                            break;
                        case 7:
                            int aF05bpZJlKEP9 = th0.aF05bpZJlKEP(parcel, readInt16);
                            int dataPosition9 = parcel.dataPosition();
                            if (aF05bpZJlKEP9 != 0) {
                                Bundle readBundle2 = parcel.readBundle();
                                parcel.setDataPosition(dataPosition9 + aF05bpZJlKEP9);
                                bundle2 = readBundle2;
                                break;
                            } else {
                                bundle2 = null;
                                break;
                            }
                        case '\b':
                            account2 = (Account) th0.r3s1LDPKFs1S(parcel, readInt16, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            th0.xfACYKDMU6Dj(parcel, readInt16);
                            break;
                        case '\n':
                            t70VarArr2 = (t70[]) th0.gPXPFXrUH4XX(parcel, readInt16, t70.CREATOR);
                            break;
                        case 11:
                            t70VarArr3 = (t70[]) th0.gPXPFXrUH4XX(parcel, readInt16, t70.CREATOR);
                            break;
                        case '\f':
                            z7 = th0.e6tOsSdd2EFb(parcel, readInt16);
                            break;
                        case '\r':
                            i19 = th0.jyegZNwi31qc(parcel, readInt16);
                            break;
                        case 14:
                            z8 = th0.e6tOsSdd2EFb(parcel, readInt16);
                            break;
                        case 15:
                            str17 = th0.QrzZRwfaDlRX(parcel, readInt16);
                            break;
                    }
                }
                th0.XL4ISE6Oc65B(parcel, amuv7NJvPxHu16);
                return new rg0(i16, i17, i18, str16, iBinder2, scopeArr, bundle2, account2, t70VarArr2, t70VarArr3, z7, i19, z8, str17);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.PxuCJdSBwIXG) {
            case 0:
                return new P6VAkUObIv30[i];
            case 1:
                return new sw[i];
            case 2:
                return new ParcelImpl[i];
            case 3:
                return new fj1[i];
            case 4:
                return new hj1[i];
            case 5:
                return new jj1[i];
            case 6:
                return new ee2[i];
            case 7:
                return new pv2[i];
            case 8:
                return new GoogleSignInAccount[i];
            case 9:
                return new jw2[i];
            case 10:
                return new nw2[i];
            case 11:
                return new c61[i];
            case 12:
                return new rw2[i];
            case 13:
                return new tw2[i];
            case 14:
                return new Scope[i];
            case 15:
                return new kx1[i];
            case 16:
                return new xq[i];
            case 17:
                return new Status[i];
            case 18:
                return new t70[i];
            case 19:
                return new nx2[i];
            case 20:
                return new cr[i];
            default:
                return new rg0[i];
        }
    }
}
