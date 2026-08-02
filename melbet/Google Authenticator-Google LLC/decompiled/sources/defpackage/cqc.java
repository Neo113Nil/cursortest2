package defpackage;

import android.accounts.Account;
import android.app.ApplicationErrorReport;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.FRDProductSpecificDataEntry;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.ND4CSettings;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cqc implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public cqc(int i) {
        this.a = i;
    }

    static void a(cqb cqbVar, Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 1, cqbVar.c);
        oy.v(parcel, 2, cqbVar.d);
        oy.v(parcel, 3, cqbVar.e);
        oy.I(parcel, 4, cqbVar.f);
        oy.C(parcel, 5, cqbVar.g);
        oy.L(parcel, 6, cqbVar.h, i);
        oy.z(parcel, 7, cqbVar.i);
        oy.H(parcel, 8, cqbVar.j, i);
        oy.L(parcel, 10, cqbVar.k, i);
        oy.L(parcel, 11, cqbVar.l, i);
        oy.s(parcel, 12, cqbVar.m);
        oy.v(parcel, 13, cqbVar.n);
        oy.s(parcel, 14, cqbVar.o);
        oy.I(parcel, 15, cqbVar.p);
        oy.r(parcel, q);
    }

    public static final ErrorReport b(Parcel parcel) {
        int R = oy.R(parcel);
        ApplicationErrorReport applicationErrorReport = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        String str14 = null;
        String str15 = null;
        byte[] bArr = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        Bundle bundle = null;
        String str19 = null;
        String str20 = null;
        String str21 = null;
        String str22 = null;
        String str23 = null;
        String str24 = null;
        String str25 = null;
        String str26 = null;
        String str27 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String str28 = null;
        ctq[] ctqVarArr = null;
        String[] strArr4 = null;
        String str29 = null;
        ctw ctwVar = null;
        ctr ctrVar = null;
        String str30 = null;
        Bundle bundle2 = null;
        ArrayList arrayList = null;
        Bitmap bitmap = null;
        String str31 = null;
        ArrayList arrayList2 = null;
        String[] strArr5 = null;
        String[] strArr6 = null;
        String[] strArr7 = null;
        String str32 = null;
        ctj ctjVar = null;
        cts[] ctsVarArr = null;
        String str33 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        boolean z2 = false;
        int i9 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i10 = 0;
        int i11 = 0;
        boolean z6 = false;
        boolean z7 = false;
        while (parcel.dataPosition() < R) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    applicationErrorReport = (ApplicationErrorReport) oy.V(parcel, readInt, ApplicationErrorReport.CREATOR);
                    break;
                case 3:
                    str = oy.Z(parcel, readInt);
                    break;
                case 4:
                    i = oy.P(parcel, readInt);
                    break;
                case 5:
                    str2 = oy.Z(parcel, readInt);
                    break;
                case 6:
                    str3 = oy.Z(parcel, readInt);
                    break;
                case 7:
                    str4 = oy.Z(parcel, readInt);
                    break;
                case '\b':
                    str5 = oy.Z(parcel, readInt);
                    break;
                case '\t':
                    str6 = oy.Z(parcel, readInt);
                    break;
                case '\n':
                    str7 = oy.Z(parcel, readInt);
                    break;
                case 11:
                    str8 = oy.Z(parcel, readInt);
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    i2 = oy.P(parcel, readInt);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    str9 = oy.Z(parcel, readInt);
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    str10 = oy.Z(parcel, readInt);
                    break;
                case 15:
                    str11 = oy.Z(parcel, readInt);
                    break;
                case 16:
                    str12 = oy.Z(parcel, readInt);
                    break;
                case 17:
                    str13 = oy.Z(parcel, readInt);
                    break;
                case 18:
                    strArr = oy.aj(parcel, readInt);
                    break;
                case 19:
                    strArr2 = oy.aj(parcel, readInt);
                    break;
                case 20:
                    strArr3 = oy.aj(parcel, readInt);
                    break;
                case 21:
                    str14 = oy.Z(parcel, readInt);
                    break;
                case 22:
                    str15 = oy.Z(parcel, readInt);
                    break;
                case 23:
                    bArr = oy.ag(parcel, readInt);
                    break;
                case 24:
                    i3 = oy.P(parcel, readInt);
                    break;
                case 25:
                    i4 = oy.P(parcel, readInt);
                    break;
                case 26:
                    i5 = oy.P(parcel, readInt);
                    break;
                case 27:
                    i6 = oy.P(parcel, readInt);
                    break;
                case 28:
                    str16 = oy.Z(parcel, readInt);
                    break;
                case 29:
                    str17 = oy.Z(parcel, readInt);
                    break;
                case 30:
                    str18 = oy.Z(parcel, readInt);
                    break;
                case 31:
                    bundle = oy.T(parcel, readInt);
                    break;
                case ' ':
                    z = oy.af(parcel, readInt);
                    break;
                case '!':
                    i7 = oy.P(parcel, readInt);
                    break;
                case '\"':
                    i8 = oy.P(parcel, readInt);
                    break;
                case '#':
                    z2 = oy.af(parcel, readInt);
                    break;
                case '$':
                    str19 = oy.Z(parcel, readInt);
                    break;
                case '%':
                    str20 = oy.Z(parcel, readInt);
                    break;
                case '&':
                    i9 = oy.P(parcel, readInt);
                    break;
                case '\'':
                    str21 = oy.Z(parcel, readInt);
                    break;
                case '(':
                    str22 = oy.Z(parcel, readInt);
                    break;
                case ')':
                    str23 = oy.Z(parcel, readInt);
                    break;
                case '*':
                    str24 = oy.Z(parcel, readInt);
                    break;
                case '+':
                    str25 = oy.Z(parcel, readInt);
                    break;
                case ',':
                    str26 = oy.Z(parcel, readInt);
                    break;
                case '-':
                    str27 = oy.Z(parcel, readInt);
                    break;
                case '.':
                    bitmapTeleporter = (BitmapTeleporter) oy.V(parcel, readInt, BitmapTeleporter.CREATOR);
                    break;
                case '/':
                    str28 = oy.Z(parcel, readInt);
                    break;
                case '0':
                    ctqVarArr = (ctq[]) oy.ai(parcel, readInt, ctq.CREATOR);
                    break;
                case '1':
                    strArr4 = oy.aj(parcel, readInt);
                    break;
                case '2':
                    z3 = oy.af(parcel, readInt);
                    break;
                case '3':
                    str29 = oy.Z(parcel, readInt);
                    break;
                case '4':
                    ctwVar = (ctw) oy.V(parcel, readInt, ctw.CREATOR);
                    break;
                case '5':
                    ctrVar = (ctr) oy.V(parcel, readInt, ctr.CREATOR);
                    break;
                case '6':
                    str30 = oy.Z(parcel, readInt);
                    break;
                case '7':
                    z4 = oy.af(parcel, readInt);
                    break;
                case '8':
                    bundle2 = oy.T(parcel, readInt);
                    break;
                case '9':
                    arrayList = oy.ac(parcel, readInt, RectF.CREATOR);
                    break;
                case ':':
                    z5 = oy.af(parcel, readInt);
                    break;
                case ';':
                    bitmap = (Bitmap) oy.V(parcel, readInt, Bitmap.CREATOR);
                    break;
                case '<':
                    str31 = oy.Z(parcel, readInt);
                    break;
                case '=':
                    arrayList2 = oy.ab(parcel, readInt);
                    break;
                case '>':
                    i10 = oy.P(parcel, readInt);
                    break;
                case '?':
                    i11 = oy.P(parcel, readInt);
                    break;
                case '@':
                    strArr5 = oy.aj(parcel, readInt);
                    break;
                case 'A':
                    strArr6 = oy.aj(parcel, readInt);
                    break;
                case 'B':
                    strArr7 = oy.aj(parcel, readInt);
                    break;
                case 'C':
                    z6 = oy.af(parcel, readInt);
                    break;
                case 'D':
                    z7 = oy.af(parcel, readInt);
                    break;
                case 'E':
                    str32 = oy.Z(parcel, readInt);
                    break;
                case 'F':
                    ctjVar = (ctj) oy.V(parcel, readInt, ctj.CREATOR);
                    break;
                case 'G':
                    ctsVarArr = (cts[]) oy.ai(parcel, readInt, cts.CREATOR);
                    break;
                case 'H':
                    str33 = oy.Z(parcel, readInt);
                    break;
                default:
                    oy.ae(parcel, readInt);
                    break;
            }
        }
        oy.ad(parcel, R);
        return new ErrorReport(applicationErrorReport, str, i, str2, str3, str4, str5, str6, str7, str8, i2, str9, str10, str11, str12, str13, strArr, strArr2, strArr3, str14, str15, bArr, i3, i4, i5, i6, str16, str17, str18, bundle, z, i7, i8, z2, str19, str20, i9, str21, str22, str23, str24, str25, str26, str27, bitmapTeleporter, str28, ctqVarArr, strArr4, z3, str29, ctwVar, ctrVar, str30, z4, bundle2, arrayList, z5, bitmap, str31, arrayList2, i10, i11, strArr5, strArr6, strArr7, z6, z7, str32, ctjVar, ctsVarArr, str33);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        boolean z3 = false;
        int i5 = 0;
        Account account = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Boolean bool = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        ArrayList arrayList = null;
        PendingIntent pendingIntent = null;
        ArrayList arrayList2 = null;
        switch (this.a) {
            case 0:
                int R = oy.R(parcel);
                Scope[] scopeArr = cqb.a;
                Bundle bundle = new Bundle();
                cli[] cliVarArr = cqb.b;
                cli[] cliVarArr2 = cliVarArr;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                boolean z4 = false;
                int i9 = 0;
                boolean z5 = false;
                String str5 = null;
                IBinder iBinder = null;
                Account account2 = null;
                String str6 = null;
                while (parcel.dataPosition() < R) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            i6 = oy.P(parcel, readInt);
                            break;
                        case 2:
                            i7 = oy.P(parcel, readInt);
                            break;
                        case 3:
                            i8 = oy.P(parcel, readInt);
                            break;
                        case 4:
                            str5 = oy.Z(parcel, readInt);
                            break;
                        case 5:
                            iBinder = oy.U(parcel, readInt);
                            break;
                        case 6:
                            scopeArr = (Scope[]) oy.ai(parcel, readInt, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = oy.T(parcel, readInt);
                            break;
                        case '\b':
                            account2 = (Account) oy.V(parcel, readInt, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            oy.ae(parcel, readInt);
                            break;
                        case '\n':
                            cliVarArr = (cli[]) oy.ai(parcel, readInt, cli.CREATOR);
                            break;
                        case 11:
                            cliVarArr2 = (cli[]) oy.ai(parcel, readInt, cli.CREATOR);
                            break;
                        case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                            z4 = oy.af(parcel, readInt);
                            break;
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                            i9 = oy.P(parcel, readInt);
                            break;
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            z5 = oy.af(parcel, readInt);
                            break;
                        case 15:
                            str6 = oy.Z(parcel, readInt);
                            break;
                    }
                }
                oy.ad(parcel, R);
                return new cqb(i6, i7, i8, str5, iBinder, scopeArr, bundle, account2, cliVarArr, cliVarArr2, z4, i9, z5, str6);
            case 1:
                int R2 = oy.R(parcel);
                while (true) {
                    SparseArray sparseArray = null;
                    while (parcel.dataPosition() < R2) {
                        int readInt2 = parcel.readInt();
                        if (((char) readInt2) != 1) {
                            oy.ae(parcel, readInt2);
                        } else {
                            Parcelable.Creator creator = cxe.CREATOR;
                            int Q = oy.Q(parcel, readInt2);
                            int dataPosition = parcel.dataPosition();
                            if (Q == 0) {
                                break;
                            }
                            int readInt3 = parcel.readInt();
                            SparseArray sparseArray2 = new SparseArray();
                            for (int i10 = 0; i10 < readInt3; i10++) {
                                sparseArray2.append(parcel.readInt(), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null);
                            }
                            parcel.setDataPosition(dataPosition + Q);
                            sparseArray = sparseArray2;
                        }
                    }
                    oy.ad(parcel, R2);
                    return new cpx(sparseArray);
                    break;
                }
            case 2:
                int R3 = oy.R(parcel);
                long j = 0;
                long j2 = 0;
                int i11 = -1;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                String str7 = null;
                String str8 = null;
                while (parcel.dataPosition() < R3) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 1:
                            i12 = oy.P(parcel, readInt4);
                            break;
                        case 2:
                            i13 = oy.P(parcel, readInt4);
                            break;
                        case 3:
                            i14 = oy.P(parcel, readInt4);
                            break;
                        case 4:
                            j = oy.S(parcel, readInt4);
                            break;
                        case 5:
                            j2 = oy.S(parcel, readInt4);
                            break;
                        case 6:
                            str7 = oy.Z(parcel, readInt4);
                            break;
                        case 7:
                            str8 = oy.Z(parcel, readInt4);
                            break;
                        case '\b':
                            i15 = oy.P(parcel, readInt4);
                            break;
                        case '\t':
                            i11 = oy.P(parcel, readInt4);
                            break;
                        default:
                            oy.ae(parcel, readInt4);
                            break;
                    }
                }
                oy.ad(parcel, R3);
                return new cqy(i12, i13, i14, j, j2, str7, str8, i15, i11);
            case 3:
                int R4 = oy.R(parcel);
                int i16 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < R4) {
                    int readInt5 = parcel.readInt();
                    char c = (char) readInt5;
                    if (c == 1) {
                        i = oy.P(parcel, readInt5);
                    } else if (c == 2) {
                        account = (Account) oy.V(parcel, readInt5, Account.CREATOR);
                    } else if (c == 3) {
                        i16 = oy.P(parcel, readInt5);
                    } else if (c != 4) {
                        oy.ae(parcel, readInt5);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) oy.V(parcel, readInt5, GoogleSignInAccount.CREATOR);
                    }
                }
                oy.ad(parcel, R4);
                return new crb(i, account, i16, googleSignInAccount);
            case 4:
                int R5 = oy.R(parcel);
                int i17 = 0;
                boolean z6 = false;
                boolean z7 = false;
                IBinder iBinder2 = null;
                clg clgVar = null;
                while (parcel.dataPosition() < R5) {
                    int readInt6 = parcel.readInt();
                    char c2 = (char) readInt6;
                    if (c2 == 1) {
                        i17 = oy.P(parcel, readInt6);
                    } else if (c2 == 2) {
                        iBinder2 = oy.U(parcel, readInt6);
                    } else if (c2 == 3) {
                        clgVar = (clg) oy.V(parcel, readInt6, clg.CREATOR);
                    } else if (c2 == 4) {
                        z6 = oy.af(parcel, readInt6);
                    } else if (c2 != 5) {
                        oy.ae(parcel, readInt6);
                    } else {
                        z7 = oy.af(parcel, readInt6);
                    }
                }
                oy.ad(parcel, R5);
                return new crc(i17, iBinder2, clgVar, z6, z7);
            case 5:
                int R6 = oy.R(parcel);
                int i18 = 0;
                boolean z8 = false;
                boolean z9 = false;
                int i19 = 0;
                int i20 = 0;
                while (parcel.dataPosition() < R6) {
                    int readInt7 = parcel.readInt();
                    char c3 = (char) readInt7;
                    if (c3 == 1) {
                        i18 = oy.P(parcel, readInt7);
                    } else if (c3 == 2) {
                        z8 = oy.af(parcel, readInt7);
                    } else if (c3 == 3) {
                        z9 = oy.af(parcel, readInt7);
                    } else if (c3 == 4) {
                        i19 = oy.P(parcel, readInt7);
                    } else if (c3 != 5) {
                        oy.ae(parcel, readInt7);
                    } else {
                        i20 = oy.P(parcel, readInt7);
                    }
                }
                oy.ad(parcel, R6);
                return new cre(i18, z8, z9, i19, i20);
            case 6:
                int R7 = oy.R(parcel);
                while (parcel.dataPosition() < R7) {
                    int readInt8 = parcel.readInt();
                    char c4 = (char) readInt8;
                    if (c4 == 1) {
                        i5 = oy.P(parcel, readInt8);
                    } else if (c4 != 2) {
                        oy.ae(parcel, readInt8);
                    } else {
                        arrayList2 = oy.ac(parcel, readInt8, cqy.CREATOR);
                    }
                }
                oy.ad(parcel, R7);
                return new crg(i5, arrayList2);
            case 7:
                int R8 = oy.R(parcel);
                int i21 = 0;
                while (parcel.dataPosition() < R8) {
                    int readInt9 = parcel.readInt();
                    char c5 = (char) readInt9;
                    if (c5 == 1) {
                        z3 = oy.af(parcel, readInt9);
                    } else if (c5 != 2) {
                        oy.ae(parcel, readInt9);
                    } else {
                        i21 = oy.P(parcel, readInt9);
                    }
                }
                oy.ad(parcel, R8);
                return new crx(z3, i21);
            case 8:
                int R9 = oy.R(parcel);
                while (parcel.dataPosition() < R9) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 1) {
                        oy.ae(parcel, readInt10);
                    } else {
                        pendingIntent = (PendingIntent) oy.V(parcel, readInt10, PendingIntent.CREATOR);
                    }
                }
                oy.ad(parcel, R9);
                return new cry(pendingIntent);
            case 9:
                int R10 = oy.R(parcel);
                boolean z10 = false;
                while (parcel.dataPosition() < R10) {
                    int readInt11 = parcel.readInt();
                    char c6 = (char) readInt11;
                    if (c6 == 1) {
                        i4 = oy.P(parcel, readInt11);
                    } else if (c6 != 2) {
                        oy.ae(parcel, readInt11);
                    } else {
                        z10 = oy.af(parcel, readInt11);
                    }
                }
                oy.ad(parcel, R10);
                return new crz(i4, z10);
            case 10:
                int R11 = oy.R(parcel);
                String str9 = null;
                String str10 = null;
                while (parcel.dataPosition() < R11) {
                    int readInt12 = parcel.readInt();
                    char c7 = (char) readInt12;
                    if (c7 == 1) {
                        arrayList = oy.ac(parcel, readInt12, cli.CREATOR);
                    } else if (c7 == 2) {
                        z2 = oy.af(parcel, readInt12);
                    } else if (c7 == 3) {
                        str9 = oy.Z(parcel, readInt12);
                    } else if (c7 != 4) {
                        oy.ae(parcel, readInt12);
                    } else {
                        str10 = oy.Z(parcel, readInt12);
                    }
                }
                oy.ad(parcel, R11);
                return new csa(arrayList, z2, str9, str10);
            case 11:
                return b(parcel);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                int R12 = oy.R(parcel);
                String str11 = null;
                String str12 = null;
                while (parcel.dataPosition() < R12) {
                    int readInt13 = parcel.readInt();
                    char c8 = (char) readInt13;
                    if (c8 == 2) {
                        parcelFileDescriptor = (ParcelFileDescriptor) oy.V(parcel, readInt13, ParcelFileDescriptor.CREATOR);
                    } else if (c8 == 3) {
                        str11 = oy.Z(parcel, readInt13);
                    } else if (c8 != 4) {
                        oy.ae(parcel, readInt13);
                    } else {
                        str12 = oy.Z(parcel, readInt13);
                    }
                }
                oy.ad(parcel, R12);
                return new ctq(parcelFileDescriptor, str11, str12);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                int R13 = oy.R(parcel);
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                String str13 = null;
                ctu[] ctuVarArr = null;
                while (parcel.dataPosition() < R13) {
                    int readInt14 = parcel.readInt();
                    switch ((char) readInt14) {
                        case 2:
                            str13 = oy.Z(parcel, readInt14);
                            break;
                        case 3:
                            z11 = oy.af(parcel, readInt14);
                            break;
                        case 4:
                            z12 = oy.af(parcel, readInt14);
                            break;
                        case 5:
                            z13 = oy.af(parcel, readInt14);
                            break;
                        case 6:
                            z14 = oy.af(parcel, readInt14);
                            break;
                        case 7:
                            ctuVarArr = (ctu[]) oy.ai(parcel, readInt14, ctu.CREATOR);
                            break;
                        case '\b':
                            z15 = oy.af(parcel, readInt14);
                            break;
                        default:
                            oy.ae(parcel, readInt14);
                            break;
                    }
                }
                oy.ad(parcel, R13);
                return new ctr(str13, z11, z12, z13, z14, ctuVarArr, z15);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                int R14 = oy.R(parcel);
                int i22 = 0;
                while (parcel.dataPosition() < R14) {
                    int readInt15 = parcel.readInt();
                    char c9 = (char) readInt15;
                    if (c9 == 2) {
                        i3 = oy.P(parcel, readInt15);
                    } else if (c9 != 3) {
                        oy.ae(parcel, readInt15);
                    } else {
                        i22 = oy.P(parcel, readInt15);
                    }
                }
                oy.ad(parcel, R14);
                return new ctw(i3, i22);
            case 15:
                int R15 = oy.R(parcel);
                int i23 = 0;
                int i24 = 0;
                ArrayList arrayList3 = null;
                ArrayList arrayList4 = null;
                ArrayList arrayList5 = null;
                ArrayList arrayList6 = null;
                byte[][] bArr = null;
                while (parcel.dataPosition() < R15) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 2:
                            i23 = oy.P(parcel, readInt16);
                            break;
                        case 3:
                            i24 = oy.P(parcel, readInt16);
                            break;
                        case 4:
                            arrayList3 = oy.ab(parcel, readInt16);
                            break;
                        case 5:
                            arrayList4 = oy.aa(parcel, readInt16);
                            break;
                        case 6:
                            arrayList5 = oy.ab(parcel, readInt16);
                            break;
                        case 7:
                            arrayList6 = oy.aa(parcel, readInt16);
                            break;
                        case '\b':
                            bArr = oy.ak(parcel, readInt16);
                            break;
                        case '\t':
                            bool = oy.W(parcel, readInt16);
                            break;
                        default:
                            oy.ae(parcel, readInt16);
                            break;
                    }
                }
                oy.ad(parcel, R15);
                return new FRDProductSpecificDataEntry(i23, i24, arrayList3, arrayList4, arrayList5, arrayList6, bArr, bool.booleanValue());
            case 16:
                int R16 = oy.R(parcel);
                int i25 = 0;
                int i26 = 0;
                GoogleHelp googleHelp = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                while (parcel.dataPosition() < R16) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 1:
                            googleHelp = (GoogleHelp) oy.V(parcel, readInt17, GoogleHelp.CREATOR);
                            break;
                        case 2:
                            str14 = oy.Z(parcel, readInt17);
                            break;
                        case 3:
                            str15 = oy.Z(parcel, readInt17);
                            break;
                        case 4:
                            i25 = oy.P(parcel, readInt17);
                            break;
                        case 5:
                            str16 = oy.Z(parcel, readInt17);
                            break;
                        case 6:
                            i26 = oy.P(parcel, readInt17);
                            break;
                        case 7:
                            str17 = oy.Z(parcel, readInt17);
                            break;
                        default:
                            oy.ae(parcel, readInt17);
                            break;
                    }
                }
                oy.ad(parcel, R16);
                return new cug(googleHelp, str14, str15, i25, str16, i26, str17);
            case 17:
                int R17 = oy.R(parcel);
                while (parcel.dataPosition() < R17) {
                    int readInt18 = parcel.readInt();
                    char c10 = (char) readInt18;
                    if (c10 == 2) {
                        z = oy.af(parcel, readInt18);
                    } else if (c10 != 3) {
                        oy.ae(parcel, readInt18);
                    } else {
                        str4 = oy.Z(parcel, readInt18);
                    }
                }
                oy.ad(parcel, R17);
                return new ND4CSettings(z, str4);
            case 18:
                int R18 = oy.R(parcel);
                String str18 = null;
                String str19 = null;
                String str20 = null;
                while (parcel.dataPosition() < R18) {
                    int readInt19 = parcel.readInt();
                    char c11 = (char) readInt19;
                    if (c11 == 2) {
                        str3 = oy.Z(parcel, readInt19);
                    } else if (c11 == 3) {
                        str18 = oy.Z(parcel, readInt19);
                    } else if (c11 == 4) {
                        str20 = oy.Z(parcel, readInt19);
                    } else if (c11 != 5) {
                        oy.ae(parcel, readInt19);
                    } else {
                        str19 = oy.Z(parcel, readInt19);
                    }
                }
                oy.ad(parcel, R18);
                return new cuh(str3, str18, str19, str20);
            case 19:
                int R19 = oy.R(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < R19) {
                    int readInt20 = parcel.readInt();
                    char c12 = (char) readInt20;
                    if (c12 == 2) {
                        i2 = oy.P(parcel, readInt20);
                    } else if (c12 == 3) {
                        str2 = oy.Z(parcel, readInt20);
                    } else if (c12 != 4) {
                        oy.ae(parcel, readInt20);
                    } else {
                        intent = (Intent) oy.V(parcel, readInt20, Intent.CREATOR);
                    }
                }
                oy.ad(parcel, R19);
                return new cuy(i2, str2, intent);
            default:
                int R20 = oy.R(parcel);
                String str21 = null;
                String str22 = null;
                while (parcel.dataPosition() < R20) {
                    int readInt21 = parcel.readInt();
                    char c13 = (char) readInt21;
                    if (c13 == 2) {
                        str = oy.Z(parcel, readInt21);
                    } else if (c13 == 3) {
                        str21 = oy.Z(parcel, readInt21);
                    } else if (c13 != 4) {
                        oy.ae(parcel, readInt21);
                    } else {
                        str22 = oy.Z(parcel, readInt21);
                    }
                }
                oy.ad(parcel, R20);
                return new TogglingData(str, str21, str22);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new cqb[i];
            case 1:
                return new cpx[i];
            case 2:
                return new cqy[i];
            case 3:
                return new crb[i];
            case 4:
                return new crc[i];
            case 5:
                return new cre[i];
            case 6:
                return new crg[i];
            case 7:
                return new crx[i];
            case 8:
                return new cry[i];
            case 9:
                return new crz[i];
            case 10:
                return new csa[i];
            case 11:
                return new ErrorReport[i];
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new ctq[i];
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new ctr[i];
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new ctw[i];
            case 15:
                return new FRDProductSpecificDataEntry[i];
            case 16:
                return new cug[i];
            case 17:
                return new ND4CSettings[i];
            case 18:
                return new cuh[i];
            case 19:
                return new cuy[i];
            default:
                return new TogglingData[i];
        }
    }
}
