package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.firebase.encoders.json.BuildConfig;
import java.util.ArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class va3 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ va3(int i) {
        this.a = i;
    }

    public static void a(bv0 bv0Var, Parcel parcel, int i) {
        int b0 = yk3.b0(parcel, 20293);
        int i2 = bv0Var.m;
        yk3.d0(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = bv0Var.n;
        yk3.d0(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = bv0Var.o;
        yk3.d0(parcel, 3, 4);
        parcel.writeInt(i4);
        yk3.W(parcel, 4, bv0Var.p);
        yk3.U(parcel, 5, bv0Var.q);
        yk3.X(parcel, 6, bv0Var.r, i);
        yk3.T(parcel, 7, bv0Var.s);
        yk3.V(parcel, 8, bv0Var.t, i);
        yk3.X(parcel, 10, bv0Var.u, i);
        yk3.X(parcel, 11, bv0Var.v, i);
        boolean z = bv0Var.w;
        yk3.d0(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = bv0Var.x;
        yk3.d0(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = bv0Var.y;
        yk3.d0(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        yk3.W(parcel, 15, bv0Var.z);
        yk3.c0(parcel, b0);
    }

    public static void b(kd3 kd3Var, Parcel parcel, int i) {
        String str = kd3Var.m;
        int b0 = yk3.b0(parcel, 20293);
        yk3.W(parcel, 2, str);
        yk3.V(parcel, 3, kd3Var.n, i);
        yk3.W(parcel, 4, kd3Var.o);
        long j = kd3Var.p;
        yk3.d0(parcel, 5, 8);
        parcel.writeLong(j);
        yk3.c0(parcel, b0);
    }

    public static void c(tq3 tq3Var, Parcel parcel) {
        int i = tq3Var.m;
        int b0 = yk3.b0(parcel, 20293);
        yk3.d0(parcel, 1, 4);
        parcel.writeInt(i);
        yk3.W(parcel, 2, tq3Var.n);
        long j = tq3Var.o;
        yk3.d0(parcel, 3, 8);
        parcel.writeLong(j);
        Long l = tq3Var.p;
        if (l != null) {
            yk3.d0(parcel, 4, 8);
            parcel.writeLong(l.longValue());
        }
        yk3.W(parcel, 6, tq3Var.q);
        yk3.W(parcel, 7, tq3Var.r);
        Double d = tq3Var.s;
        if (d != null) {
            yk3.d0(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        yk3.c0(parcel, b0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        long j = 0;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        c10 c10Var = null;
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        Bundle bundle = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Bundle bundle2 = null;
        PendingIntent pendingIntent = null;
        Bundle bundle3 = null;
        Intent intent = null;
        Account account = null;
        switch (this.a) {
            case 0:
                int j0 = tk3.j0(parcel);
                cb3 cb3Var = null;
                while (parcel.dataPosition() < j0) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c == 1) {
                        i = tk3.a0(parcel, readInt);
                    } else if (c == 2) {
                        c10Var = (c10) tk3.F(parcel, readInt, c10.CREATOR);
                    } else if (c != 3) {
                        tk3.f0(parcel, readInt);
                    } else {
                        cb3Var = (cb3) tk3.F(parcel, readInt, cb3.CREATOR);
                    }
                }
                tk3.L(parcel, j0);
                return new ua3(i, c10Var, cb3Var);
            case 1:
                int j02 = tk3.j0(parcel);
                int i10 = -1;
                long j2 = 0;
                long j3 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                String str7 = null;
                String str8 = null;
                while (parcel.dataPosition() < j02) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            i11 = tk3.a0(parcel, readInt2);
                            break;
                        case 2:
                            i12 = tk3.a0(parcel, readInt2);
                            break;
                        case 3:
                            i13 = tk3.a0(parcel, readInt2);
                            break;
                        case 4:
                            j2 = tk3.b0(parcel, readInt2);
                            break;
                        case 5:
                            j3 = tk3.b0(parcel, readInt2);
                            break;
                        case 6:
                            str7 = tk3.G(parcel, readInt2);
                            break;
                        case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                            str8 = tk3.G(parcel, readInt2);
                            break;
                        case '\b':
                            i14 = tk3.a0(parcel, readInt2);
                            break;
                        case '\t':
                            i10 = tk3.a0(parcel, readInt2);
                            break;
                        default:
                            tk3.f0(parcel, readInt2);
                            break;
                    }
                }
                tk3.L(parcel, j02);
                return new nl1(i11, i12, i13, j2, j3, str7, str8, i14, i10);
            case 2:
                int j03 = tk3.j0(parcel);
                int i15 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < j03) {
                    int readInt3 = parcel.readInt();
                    char c2 = (char) readInt3;
                    if (c2 == 1) {
                        i9 = tk3.a0(parcel, readInt3);
                    } else if (c2 == 2) {
                        account = (Account) tk3.F(parcel, readInt3, Account.CREATOR);
                    } else if (c2 == 3) {
                        i15 = tk3.a0(parcel, readInt3);
                    } else if (c2 != 4) {
                        tk3.f0(parcel, readInt3);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) tk3.F(parcel, readInt3, GoogleSignInAccount.CREATOR);
                    }
                }
                tk3.L(parcel, j03);
                return new ab3(i9, account, i15, googleSignInAccount);
            case 3:
                int j04 = tk3.j0(parcel);
                int i16 = 0;
                boolean z2 = false;
                boolean z3 = false;
                IBinder iBinder = null;
                c10 c10Var2 = null;
                while (parcel.dataPosition() < j04) {
                    int readInt4 = parcel.readInt();
                    char c3 = (char) readInt4;
                    if (c3 == 1) {
                        i16 = tk3.a0(parcel, readInt4);
                    } else if (c3 == 2) {
                        iBinder = tk3.Z(parcel, readInt4);
                    } else if (c3 == 3) {
                        c10Var2 = (c10) tk3.F(parcel, readInt4, c10.CREATOR);
                    } else if (c3 == 4) {
                        z2 = tk3.Y(parcel, readInt4);
                    } else if (c3 != 5) {
                        tk3.f0(parcel, readInt4);
                    } else {
                        z3 = tk3.Y(parcel, readInt4);
                    }
                }
                tk3.L(parcel, j04);
                return new cb3(i16, iBinder, c10Var2, z2, z3);
            case 4:
                int j05 = tk3.j0(parcel);
                while (parcel.dataPosition() < j05) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        tk3.f0(parcel, readInt5);
                    } else {
                        intent = (Intent) tk3.F(parcel, readInt5, Intent.CREATOR);
                    }
                }
                tk3.L(parcel, j05);
                return new cv(intent);
            case 5:
                int j06 = tk3.j0(parcel);
                long j4 = 0;
                long j5 = 0;
                int i17 = 0;
                while (parcel.dataPosition() < j06) {
                    int readInt6 = parcel.readInt();
                    char c4 = (char) readInt6;
                    if (c4 == 1) {
                        j4 = tk3.b0(parcel, readInt6);
                    } else if (c4 == 2) {
                        i17 = tk3.a0(parcel, readInt6);
                    } else if (c4 != 3) {
                        tk3.f0(parcel, readInt6);
                    } else {
                        j5 = tk3.b0(parcel, readInt6);
                    }
                }
                tk3.L(parcel, j06);
                return new tb3(j4, j5, i17);
            case 6:
                int j07 = tk3.j0(parcel);
                long j6 = 0;
                long j7 = 0;
                long j8 = 0;
                boolean z4 = false;
                String str9 = null;
                String str10 = null;
                tq3 tq3Var = null;
                String str11 = null;
                kd3 kd3Var = null;
                kd3 kd3Var2 = null;
                kd3 kd3Var3 = null;
                while (parcel.dataPosition() < j07) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 2:
                            str9 = tk3.G(parcel, readInt7);
                            break;
                        case 3:
                            str10 = tk3.G(parcel, readInt7);
                            break;
                        case 4:
                            tq3Var = (tq3) tk3.F(parcel, readInt7, tq3.CREATOR);
                            break;
                        case 5:
                            j6 = tk3.b0(parcel, readInt7);
                            break;
                        case 6:
                            z4 = tk3.Y(parcel, readInt7);
                            break;
                        case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                            str11 = tk3.G(parcel, readInt7);
                            break;
                        case '\b':
                            kd3Var = (kd3) tk3.F(parcel, readInt7, kd3.CREATOR);
                            break;
                        case '\t':
                            j7 = tk3.b0(parcel, readInt7);
                            break;
                        case '\n':
                            kd3Var2 = (kd3) tk3.F(parcel, readInt7, kd3.CREATOR);
                            break;
                        case 11:
                            j8 = tk3.b0(parcel, readInt7);
                            break;
                        case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                            kd3Var3 = (kd3) tk3.F(parcel, readInt7, kd3.CREATOR);
                            break;
                        default:
                            tk3.f0(parcel, readInt7);
                            break;
                    }
                }
                tk3.L(parcel, j07);
                return new yb3(str9, str10, tq3Var, j6, z4, str11, kd3Var, j7, kd3Var2, j8, kd3Var3);
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                int j08 = tk3.j0(parcel);
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                boolean z5 = false;
                boolean z6 = false;
                while (parcel.dataPosition() < j08) {
                    int readInt8 = parcel.readInt();
                    char c5 = (char) readInt8;
                    if (c5 == 1) {
                        i18 = tk3.a0(parcel, readInt8);
                    } else if (c5 == 2) {
                        z5 = tk3.Y(parcel, readInt8);
                    } else if (c5 == 3) {
                        z6 = tk3.Y(parcel, readInt8);
                    } else if (c5 == 4) {
                        i19 = tk3.a0(parcel, readInt8);
                    } else if (c5 != 5) {
                        tk3.f0(parcel, readInt8);
                    } else {
                        i20 = tk3.a0(parcel, readInt8);
                    }
                }
                tk3.L(parcel, j08);
                return new rb2(i18, i19, i20, z5, z6);
            case 8:
                int j09 = tk3.j0(parcel);
                while (parcel.dataPosition() < j09) {
                    int readInt9 = parcel.readInt();
                    if (((char) readInt9) != 1) {
                        tk3.f0(parcel, readInt9);
                    } else {
                        bundle3 = tk3.E(parcel, readInt9);
                    }
                }
                tk3.L(parcel, j09);
                return new jc3(bundle3);
            case 9:
                return new ue3(parcel.readStrongBinder());
            case 10:
                int j010 = tk3.j0(parcel);
                int i21 = 0;
                String str12 = null;
                while (parcel.dataPosition() < j010) {
                    int readInt10 = parcel.readInt();
                    char c6 = (char) readInt10;
                    if (c6 == 1) {
                        i8 = tk3.a0(parcel, readInt10);
                    } else if (c6 == 2) {
                        i21 = tk3.a0(parcel, readInt10);
                    } else if (c6 == 3) {
                        pendingIntent = (PendingIntent) tk3.F(parcel, readInt10, PendingIntent.CREATOR);
                    } else if (c6 != 4) {
                        tk3.f0(parcel, readInt10);
                    } else {
                        str12 = tk3.G(parcel, readInt10);
                    }
                }
                tk3.L(parcel, j010);
                return new c10(i8, i21, pendingIntent, str12);
            case 11:
                int j011 = tk3.j0(parcel);
                while (parcel.dataPosition() < j011) {
                    int readInt11 = parcel.readInt();
                    if (((char) readInt11) != 2) {
                        tk3.f0(parcel, readInt11);
                    } else {
                        bundle2 = tk3.E(parcel, readInt11);
                    }
                }
                tk3.L(parcel, j011);
                return new jd3(bundle2);
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                int j012 = tk3.j0(parcel);
                long j9 = 0;
                String str13 = null;
                jd3 jd3Var = null;
                String str14 = null;
                while (parcel.dataPosition() < j012) {
                    int readInt12 = parcel.readInt();
                    char c7 = (char) readInt12;
                    if (c7 == 2) {
                        str13 = tk3.G(parcel, readInt12);
                    } else if (c7 == 3) {
                        jd3Var = (jd3) tk3.F(parcel, readInt12, jd3.CREATOR);
                    } else if (c7 == 4) {
                        str14 = tk3.G(parcel, readInt12);
                    } else if (c7 != 5) {
                        tk3.f0(parcel, readInt12);
                    } else {
                        j9 = tk3.b0(parcel, readInt12);
                    }
                }
                tk3.L(parcel, j012);
                return new kd3(str13, jd3Var, str14, j9);
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                int j013 = tk3.j0(parcel);
                long j10 = -1;
                while (parcel.dataPosition() < j013) {
                    int readInt13 = parcel.readInt();
                    char c8 = (char) readInt13;
                    if (c8 == 1) {
                        str6 = tk3.G(parcel, readInt13);
                    } else if (c8 == 2) {
                        i7 = tk3.a0(parcel, readInt13);
                    } else if (c8 != 3) {
                        tk3.f0(parcel, readInt13);
                    } else {
                        j10 = tk3.b0(parcel, readInt13);
                    }
                }
                tk3.L(parcel, j013);
                return new mk0(str6, i7, j10);
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                int j014 = tk3.j0(parcel);
                while (parcel.dataPosition() < j014) {
                    int readInt14 = parcel.readInt();
                    char c9 = (char) readInt14;
                    if (c9 == 1) {
                        i6 = tk3.a0(parcel, readInt14);
                    } else if (c9 != 2) {
                        tk3.f0(parcel, readInt14);
                    } else {
                        str5 = tk3.G(parcel, readInt14);
                    }
                }
                tk3.L(parcel, j014);
                return new Scope(i6, str5);
            case 15:
                int j015 = tk3.j0(parcel);
                long j11 = 0;
                long j12 = 0;
                boolean z7 = false;
                Bundle bundle4 = null;
                String str15 = null;
                while (parcel.dataPosition() < j015) {
                    int readInt15 = parcel.readInt();
                    char c10 = (char) readInt15;
                    if (c10 == 1) {
                        j11 = tk3.b0(parcel, readInt15);
                    } else if (c10 == 2) {
                        j12 = tk3.b0(parcel, readInt15);
                    } else if (c10 == 3) {
                        z7 = tk3.Y(parcel, readInt15);
                    } else if (c10 == 7) {
                        bundle4 = tk3.E(parcel, readInt15);
                    } else if (c10 != '\b') {
                        tk3.f0(parcel, readInt15);
                    } else {
                        str15 = tk3.G(parcel, readInt15);
                    }
                }
                tk3.L(parcel, j015);
                return new ye3(j11, j12, z7, bundle4, str15);
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                int j016 = tk3.j0(parcel);
                Intent intent2 = null;
                while (parcel.dataPosition() < j016) {
                    int readInt16 = parcel.readInt();
                    char c11 = (char) readInt16;
                    if (c11 == 1) {
                        i5 = tk3.a0(parcel, readInt16);
                    } else if (c11 == 2) {
                        str4 = tk3.G(parcel, readInt16);
                    } else if (c11 != 3) {
                        tk3.f0(parcel, readInt16);
                    } else {
                        intent2 = (Intent) tk3.F(parcel, readInt16, Intent.CREATOR);
                    }
                }
                tk3.L(parcel, j016);
                return new ze3(i5, str4, intent2);
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                int j017 = tk3.j0(parcel);
                PendingIntent pendingIntent2 = null;
                c10 c10Var3 = null;
                while (parcel.dataPosition() < j017) {
                    int readInt17 = parcel.readInt();
                    char c12 = (char) readInt17;
                    if (c12 == 1) {
                        i4 = tk3.a0(parcel, readInt17);
                    } else if (c12 == 2) {
                        str3 = tk3.G(parcel, readInt17);
                    } else if (c12 == 3) {
                        pendingIntent2 = (PendingIntent) tk3.F(parcel, readInt17, PendingIntent.CREATOR);
                    } else if (c12 != 4) {
                        tk3.f0(parcel, readInt17);
                    } else {
                        c10Var3 = (c10) tk3.F(parcel, readInt17, c10.CREATOR);
                    }
                }
                tk3.L(parcel, j017);
                return new Status(i4, str3, pendingIntent2, c10Var3);
            case 18:
                int j018 = tk3.j0(parcel);
                mk0[] mk0VarArr = null;
                h10 h10Var = null;
                while (parcel.dataPosition() < j018) {
                    int readInt18 = parcel.readInt();
                    char c13 = (char) readInt18;
                    if (c13 == 1) {
                        bundle = tk3.E(parcel, readInt18);
                    } else if (c13 == 2) {
                        mk0VarArr = (mk0[]) tk3.H(parcel, readInt18, mk0.CREATOR);
                    } else if (c13 == 3) {
                        i3 = tk3.a0(parcel, readInt18);
                    } else if (c13 != 4) {
                        tk3.f0(parcel, readInt18);
                    } else {
                        h10Var = (h10) tk3.F(parcel, readInt18, h10.CREATOR);
                    }
                }
                tk3.L(parcel, j018);
                nl3 nl3Var = new nl3();
                nl3Var.m = bundle;
                nl3Var.n = mk0VarArr;
                nl3Var.o = i3;
                nl3Var.p = h10Var;
                return nl3Var;
            case 19:
                int j019 = tk3.j0(parcel);
                boolean z8 = false;
                boolean z9 = false;
                int i22 = 0;
                rb2 rb2Var = null;
                int[] iArr = null;
                int[] iArr2 = null;
                while (parcel.dataPosition() < j019) {
                    int readInt19 = parcel.readInt();
                    switch ((char) readInt19) {
                        case 1:
                            rb2Var = (rb2) tk3.F(parcel, readInt19, rb2.CREATOR);
                            break;
                        case 2:
                            z8 = tk3.Y(parcel, readInt19);
                            break;
                        case 3:
                            z9 = tk3.Y(parcel, readInt19);
                            break;
                        case 4:
                            int c0 = tk3.c0(parcel, readInt19);
                            int dataPosition = parcel.dataPosition();
                            if (c0 == 0) {
                                iArr = null;
                                break;
                            } else {
                                int[] createIntArray = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition + c0);
                                iArr = createIntArray;
                                break;
                            }
                        case 5:
                            i22 = tk3.a0(parcel, readInt19);
                            break;
                        case 6:
                            int c02 = tk3.c0(parcel, readInt19);
                            int dataPosition2 = parcel.dataPosition();
                            if (c02 == 0) {
                                iArr2 = null;
                                break;
                            } else {
                                int[] createIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition2 + c02);
                                iArr2 = createIntArray2;
                                break;
                            }
                        default:
                            tk3.f0(parcel, readInt19);
                            break;
                    }
                }
                tk3.L(parcel, j019);
                return new h10(rb2Var, z8, z9, iArr, i22, iArr2);
            case 20:
                int j020 = tk3.j0(parcel);
                Bundle bundle5 = new Bundle();
                Scope[] scopeArr = bv0.A;
                mk0[] mk0VarArr2 = bv0.B;
                mk0[] mk0VarArr3 = mk0VarArr2;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                boolean z10 = false;
                int i26 = 0;
                boolean z11 = false;
                String str16 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String str17 = null;
                while (parcel.dataPosition() < j020) {
                    int readInt20 = parcel.readInt();
                    switch ((char) readInt20) {
                        case 1:
                            i23 = tk3.a0(parcel, readInt20);
                            break;
                        case 2:
                            i24 = tk3.a0(parcel, readInt20);
                            break;
                        case 3:
                            i25 = tk3.a0(parcel, readInt20);
                            break;
                        case 4:
                            str16 = tk3.G(parcel, readInt20);
                            break;
                        case 5:
                            iBinder2 = tk3.Z(parcel, readInt20);
                            break;
                        case 6:
                            scopeArr = (Scope[]) tk3.H(parcel, readInt20, Scope.CREATOR);
                            break;
                        case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                            bundle5 = tk3.E(parcel, readInt20);
                            break;
                        case '\b':
                            account2 = (Account) tk3.F(parcel, readInt20, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            tk3.f0(parcel, readInt20);
                            break;
                        case '\n':
                            mk0VarArr2 = (mk0[]) tk3.H(parcel, readInt20, mk0.CREATOR);
                            break;
                        case 11:
                            mk0VarArr3 = (mk0[]) tk3.H(parcel, readInt20, mk0.CREATOR);
                            break;
                        case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                            z10 = tk3.Y(parcel, readInt20);
                            break;
                        case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                            i26 = tk3.a0(parcel, readInt20);
                            break;
                        case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                            z11 = tk3.Y(parcel, readInt20);
                            break;
                        case 15:
                            str17 = tk3.G(parcel, readInt20);
                            break;
                    }
                }
                tk3.L(parcel, j020);
                return new bv0(i23, i24, i25, str16, iBinder2, scopeArr, bundle5, account2, mk0VarArr2, mk0VarArr3, z10, i26, z11, str17);
            case 21:
                int j021 = tk3.j0(parcel);
                while (parcel.dataPosition() < j021) {
                    int readInt21 = parcel.readInt();
                    char c14 = (char) readInt21;
                    if (c14 == 1) {
                        str2 = tk3.G(parcel, readInt21);
                    } else if (c14 == 2) {
                        j = tk3.b0(parcel, readInt21);
                    } else if (c14 != 3) {
                        tk3.f0(parcel, readInt21);
                    } else {
                        i2 = tk3.a0(parcel, readInt21);
                    }
                }
                tk3.L(parcel, j021);
                return new ip3(str2, i2, j);
            case 22:
                int j022 = tk3.j0(parcel);
                long j13 = 0;
                long j14 = 0;
                int i27 = 0;
                byte[] bArr = null;
                String str18 = null;
                Bundle bundle6 = null;
                String str19 = null;
                while (parcel.dataPosition() < j022) {
                    int readInt22 = parcel.readInt();
                    switch ((char) readInt22) {
                        case 1:
                            j13 = tk3.b0(parcel, readInt22);
                            break;
                        case 2:
                            int c03 = tk3.c0(parcel, readInt22);
                            int dataPosition3 = parcel.dataPosition();
                            if (c03 == 0) {
                                bArr = null;
                                break;
                            } else {
                                byte[] createByteArray = parcel.createByteArray();
                                parcel.setDataPosition(dataPosition3 + c03);
                                bArr = createByteArray;
                                break;
                            }
                        case 3:
                            str18 = tk3.G(parcel, readInt22);
                            break;
                        case 4:
                            bundle6 = tk3.E(parcel, readInt22);
                            break;
                        case 5:
                            i27 = tk3.a0(parcel, readInt22);
                            break;
                        case 6:
                            j14 = tk3.b0(parcel, readInt22);
                            break;
                        case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                            str19 = tk3.G(parcel, readInt22);
                            break;
                        default:
                            tk3.f0(parcel, readInt22);
                            break;
                    }
                }
                tk3.L(parcel, j022);
                return new np3(j13, bArr, str18, bundle6, i27, j14, str19);
            case 23:
                int j023 = tk3.j0(parcel);
                while (true) {
                    ArrayList arrayList2 = null;
                    while (parcel.dataPosition() < j023) {
                        int readInt23 = parcel.readInt();
                        if (((char) readInt23) != 1) {
                            tk3.f0(parcel, readInt23);
                        } else {
                            int c04 = tk3.c0(parcel, readInt23);
                            int dataPosition4 = parcel.dataPosition();
                            if (c04 == 0) {
                                break;
                            }
                            ArrayList arrayList3 = new ArrayList();
                            int readInt24 = parcel.readInt();
                            for (int i28 = 0; i28 < readInt24; i28++) {
                                arrayList3.add(Integer.valueOf(parcel.readInt()));
                            }
                            parcel.setDataPosition(dataPosition4 + c04);
                            arrayList2 = arrayList3;
                        }
                    }
                    tk3.L(parcel, j023);
                    return new qp3(arrayList2);
                    break;
                }
            case 24:
                int j024 = tk3.j0(parcel);
                while (parcel.dataPosition() < j024) {
                    int readInt25 = parcel.readInt();
                    if (((char) readInt25) != 1) {
                        tk3.f0(parcel, readInt25);
                    } else {
                        arrayList = tk3.I(parcel, readInt25, np3.CREATOR);
                    }
                }
                tk3.L(parcel, j024);
                return new tp3(arrayList);
            case Constants.MAX_TREE_DEPTH /* 25 */:
                int j025 = tk3.j0(parcel);
                long j15 = 0;
                int i29 = 0;
                String str20 = null;
                Long l = null;
                Float f = null;
                String str21 = null;
                String str22 = null;
                Double d = null;
                while (parcel.dataPosition() < j025) {
                    int readInt26 = parcel.readInt();
                    switch ((char) readInt26) {
                        case 1:
                            i29 = tk3.a0(parcel, readInt26);
                            break;
                        case 2:
                            str20 = tk3.G(parcel, readInt26);
                            break;
                        case 3:
                            j15 = tk3.b0(parcel, readInt26);
                            break;
                        case 4:
                            int c05 = tk3.c0(parcel, readInt26);
                            if (c05 == 0) {
                                l = null;
                                break;
                            } else {
                                tk3.l0(parcel, c05, 8);
                                l = Long.valueOf(parcel.readLong());
                                break;
                            }
                        case 5:
                            int c06 = tk3.c0(parcel, readInt26);
                            if (c06 == 0) {
                                f = null;
                                break;
                            } else {
                                tk3.l0(parcel, c06, 4);
                                f = Float.valueOf(parcel.readFloat());
                                break;
                            }
                        case 6:
                            str21 = tk3.G(parcel, readInt26);
                            break;
                        case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                            str22 = tk3.G(parcel, readInt26);
                            break;
                        case '\b':
                            int c07 = tk3.c0(parcel, readInt26);
                            if (c07 == 0) {
                                d = null;
                                break;
                            } else {
                                tk3.l0(parcel, c07, 8);
                                d = Double.valueOf(parcel.readDouble());
                                break;
                            }
                        default:
                            tk3.f0(parcel, readInt26);
                            break;
                    }
                }
                tk3.L(parcel, j025);
                return new tq3(i29, str20, j15, l, f, str21, str22, d);
            case 26:
                int j026 = tk3.j0(parcel);
                int i30 = 0;
                int i31 = 0;
                while (parcel.dataPosition() < j026) {
                    int readInt27 = parcel.readInt();
                    char c15 = (char) readInt27;
                    if (c15 == 1) {
                        z = tk3.Y(parcel, readInt27);
                    } else if (c15 == 2) {
                        str = tk3.G(parcel, readInt27);
                    } else if (c15 == 3) {
                        i30 = tk3.a0(parcel, readInt27);
                    } else if (c15 != 4) {
                        tk3.f0(parcel, readInt27);
                    } else {
                        i31 = tk3.a0(parcel, readInt27);
                    }
                }
                tk3.L(parcel, j026);
                return new hr3(i30, i31, str, z);
            default:
                int j027 = tk3.j0(parcel);
                String str23 = BuildConfig.FLAVOR;
                String str24 = str23;
                String str25 = str24;
                String str26 = str25;
                int i32 = 100;
                long j16 = 0;
                long j17 = 0;
                long j18 = 0;
                long j19 = 0;
                long j20 = 0;
                long j21 = 0;
                long j22 = 0;
                long j23 = -2147483648L;
                boolean z12 = true;
                boolean z13 = true;
                boolean z14 = false;
                int i33 = 0;
                boolean z15 = false;
                boolean z16 = false;
                int i34 = 0;
                int i35 = 0;
                String str27 = null;
                String str28 = null;
                String str29 = null;
                String str30 = null;
                String str31 = null;
                String str32 = null;
                Boolean bool = null;
                ArrayList<String> arrayList4 = null;
                String str33 = null;
                String str34 = null;
                while (parcel.dataPosition() < j027) {
                    int readInt28 = parcel.readInt();
                    switch ((char) readInt28) {
                        case 2:
                            str27 = tk3.G(parcel, readInt28);
                            break;
                        case 3:
                            str28 = tk3.G(parcel, readInt28);
                            break;
                        case 4:
                            str29 = tk3.G(parcel, readInt28);
                            break;
                        case 5:
                            str30 = tk3.G(parcel, readInt28);
                            break;
                        case 6:
                            j16 = tk3.b0(parcel, readInt28);
                            break;
                        case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                            j17 = tk3.b0(parcel, readInt28);
                            break;
                        case '\b':
                            str31 = tk3.G(parcel, readInt28);
                            break;
                        case '\t':
                            z12 = tk3.Y(parcel, readInt28);
                            break;
                        case '\n':
                            z14 = tk3.Y(parcel, readInt28);
                            break;
                        case 11:
                            j23 = tk3.b0(parcel, readInt28);
                            break;
                        case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                            str32 = tk3.G(parcel, readInt28);
                            break;
                        case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                        case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                        case 19:
                        case 20:
                        case 24:
                        case '!':
                        default:
                            tk3.f0(parcel, readInt28);
                            break;
                        case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                            j18 = tk3.b0(parcel, readInt28);
                            break;
                        case 15:
                            i33 = tk3.a0(parcel, readInt28);
                            break;
                        case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                            z13 = tk3.Y(parcel, readInt28);
                            break;
                        case 18:
                            z15 = tk3.Y(parcel, readInt28);
                            break;
                        case 21:
                            int c08 = tk3.c0(parcel, readInt28);
                            if (c08 == 0) {
                                bool = null;
                                break;
                            } else {
                                tk3.l0(parcel, c08, 4);
                                bool = Boolean.valueOf(parcel.readInt() != 0);
                                break;
                            }
                        case 22:
                            j19 = tk3.b0(parcel, readInt28);
                            break;
                        case 23:
                            int c09 = tk3.c0(parcel, readInt28);
                            int dataPosition5 = parcel.dataPosition();
                            if (c09 == 0) {
                                arrayList4 = null;
                                break;
                            } else {
                                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                                parcel.setDataPosition(dataPosition5 + c09);
                                arrayList4 = createStringArrayList;
                                break;
                            }
                        case Constants.MAX_TREE_DEPTH /* 25 */:
                            str23 = tk3.G(parcel, readInt28);
                            break;
                        case 26:
                            str24 = tk3.G(parcel, readInt28);
                            break;
                        case 27:
                            str33 = tk3.G(parcel, readInt28);
                            break;
                        case 28:
                            z16 = tk3.Y(parcel, readInt28);
                            break;
                        case 29:
                            j20 = tk3.b0(parcel, readInt28);
                            break;
                        case 30:
                            i32 = tk3.a0(parcel, readInt28);
                            break;
                        case 31:
                            str25 = tk3.G(parcel, readInt28);
                            break;
                        case ' ':
                            i34 = tk3.a0(parcel, readInt28);
                            break;
                        case '\"':
                            j21 = tk3.b0(parcel, readInt28);
                            break;
                        case '#':
                            str34 = tk3.G(parcel, readInt28);
                            break;
                        case '$':
                            str26 = tk3.G(parcel, readInt28);
                            break;
                        case '%':
                            j22 = tk3.b0(parcel, readInt28);
                            break;
                        case '&':
                            i35 = tk3.a0(parcel, readInt28);
                            break;
                    }
                }
                tk3.L(parcel, j027);
                return new cs3(str27, str28, str29, str30, j16, j17, str31, z12, z14, j23, str32, j18, i33, z13, z15, bool, j19, arrayList4, str23, str24, str33, z16, j20, i32, str25, i34, j21, str34, str26, j22, i35);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ua3[i];
            case 1:
                return new nl1[i];
            case 2:
                return new ab3[i];
            case 3:
                return new cb3[i];
            case 4:
                return new cv[i];
            case 5:
                return new tb3[i];
            case 6:
                return new yb3[i];
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                return new rb2[i];
            case 8:
                return new jc3[i];
            case 9:
                return new ue3[i];
            case 10:
                return new c10[i];
            case 11:
                return new jd3[i];
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                return new kd3[i];
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                return new mk0[i];
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                return new Scope[i];
            case 15:
                return new ye3[i];
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                return new ze3[i];
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                return new Status[i];
            case 18:
                return new nl3[i];
            case 19:
                return new h10[i];
            case 20:
                return new bv0[i];
            case 21:
                return new ip3[i];
            case 22:
                return new np3[i];
            case 23:
                return new qp3[i];
            case 24:
                return new tp3[i];
            case Constants.MAX_TREE_DEPTH /* 25 */:
                return new tq3[i];
            case 26:
                return new hr3[i];
            default:
                return new cs3[i];
        }
    }
}
