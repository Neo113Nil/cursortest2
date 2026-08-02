package H;

import O3.l;
import a2.C0162b;
import a2.C0164d;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0195b;
import androidx.fragment.app.C0196b0;
import androidx.fragment.app.C0197c;
import androidx.fragment.app.h0;
import androidx.fragment.app.k0;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import d.C0373a;
import d2.C0385c;
import d2.C0386d;
import d2.C0388f;
import d2.n;
import d2.o;
import d2.y;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.impl.C0583e9;
import io.flutter.Build;
import java.util.ArrayList;
import java.util.List;
import l1.C1251H;
import l1.C1252I;
import l1.C1265l;

/* loaded from: classes.dex */
public final class h implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1075a;

    public /* synthetic */ h(int i4) {
        this.f1075a = i4;
    }

    public static void a(C0386d c0386d, Parcel parcel, int i4) {
        int D3 = l.D(parcel, 20293);
        int i5 = c0386d.f8241a;
        l.G(parcel, 1, 4);
        parcel.writeInt(i5);
        int i6 = c0386d.f8242b;
        l.G(parcel, 2, 4);
        parcel.writeInt(i6);
        int i7 = c0386d.f8243c;
        l.G(parcel, 3, 4);
        parcel.writeInt(i7);
        l.A(parcel, 4, c0386d.f8244d);
        l.y(parcel, 5, c0386d.f8245e);
        l.B(parcel, 6, c0386d.f8246f, i4);
        Bundle bundle = c0386d.f8247g;
        if (bundle != null) {
            int D4 = l.D(parcel, 7);
            parcel.writeBundle(bundle);
            l.F(parcel, D4);
        }
        l.z(parcel, 8, c0386d.f8248h, i4);
        l.B(parcel, 10, c0386d.f8249i, i4);
        l.B(parcel, 11, c0386d.f8250j, i4);
        boolean z = c0386d.f8251k;
        l.G(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i8 = c0386d.f8252l;
        l.G(parcel, 13, 4);
        parcel.writeInt(i8);
        boolean z4 = c0386d.f8253m;
        l.G(parcel, 14, 4);
        parcel.writeInt(z4 ? 1 : 0);
        l.A(parcel, 15, c0386d.n);
        l.F(parcel, D3);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1075a) {
            case 0:
                i iVar = new i(parcel);
                iVar.f1076a = parcel.readInt();
                return iVar;
            case 1:
                int I4 = O3.d.I(parcel);
                String str = null;
                int i4 = 0;
                while (parcel.dataPosition() < I4) {
                    int readInt = parcel.readInt();
                    char c4 = (char) readInt;
                    if (c4 == 1) {
                        str = O3.d.i(parcel, readInt);
                    } else if (c4 != 2) {
                        O3.d.C(parcel, readInt);
                    } else {
                        i4 = O3.d.w(parcel, readInt);
                    }
                }
                O3.d.l(parcel, I4);
                return new X1.b(str, i4);
            case 2:
                int I5 = O3.d.I(parcel);
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                Uri uri = null;
                String str6 = null;
                String str7 = null;
                ArrayList arrayList = null;
                String str8 = null;
                String str9 = null;
                long j4 = 0;
                int i5 = 0;
                while (parcel.dataPosition() < I5) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            i5 = O3.d.w(parcel, readInt2);
                            break;
                        case 2:
                            str2 = O3.d.i(parcel, readInt2);
                            break;
                        case 3:
                            str3 = O3.d.i(parcel, readInt2);
                            break;
                        case 4:
                            str4 = O3.d.i(parcel, readInt2);
                            break;
                        case 5:
                            str5 = O3.d.i(parcel, readInt2);
                            break;
                        case 6:
                            uri = (Uri) O3.d.h(parcel, readInt2, Uri.CREATOR);
                            break;
                        case 7:
                            str6 = O3.d.i(parcel, readInt2);
                            break;
                        case '\b':
                            j4 = O3.d.x(parcel, readInt2);
                            break;
                        case '\t':
                            str7 = O3.d.i(parcel, readInt2);
                            break;
                        case '\n':
                            arrayList = O3.d.k(parcel, readInt2, Scope.CREATOR);
                            break;
                        case 11:
                            str8 = O3.d.i(parcel, readInt2);
                            break;
                        case '\f':
                            str9 = O3.d.i(parcel, readInt2);
                            break;
                        default:
                            O3.d.C(parcel, readInt2);
                            break;
                    }
                }
                O3.d.l(parcel, I5);
                return new GoogleSignInAccount(i5, str2, str3, str4, str5, uri, str6, j4, str7, arrayList, str8, str9);
            case 3:
                int I6 = O3.d.I(parcel);
                PendingIntent pendingIntent = null;
                int i6 = 0;
                int i7 = 0;
                String str10 = null;
                while (parcel.dataPosition() < I6) {
                    int readInt3 = parcel.readInt();
                    char c5 = (char) readInt3;
                    if (c5 == 1) {
                        i6 = O3.d.w(parcel, readInt3);
                    } else if (c5 == 2) {
                        i7 = O3.d.w(parcel, readInt3);
                    } else if (c5 == 3) {
                        pendingIntent = (PendingIntent) O3.d.h(parcel, readInt3, PendingIntent.CREATOR);
                    } else if (c5 != 4) {
                        O3.d.C(parcel, readInt3);
                    } else {
                        str10 = O3.d.i(parcel, readInt3);
                    }
                }
                O3.d.l(parcel, I6);
                return new C0162b(i6, i7, pendingIntent, str10);
            case 4:
                int I7 = O3.d.I(parcel);
                long j5 = -1;
                int i8 = 0;
                String str11 = null;
                while (parcel.dataPosition() < I7) {
                    int readInt4 = parcel.readInt();
                    char c6 = (char) readInt4;
                    if (c6 == 1) {
                        str11 = O3.d.i(parcel, readInt4);
                    } else if (c6 == 2) {
                        i8 = O3.d.w(parcel, readInt4);
                    } else if (c6 != 3) {
                        O3.d.C(parcel, readInt4);
                    } else {
                        j5 = O3.d.x(parcel, readInt4);
                    }
                }
                O3.d.l(parcel, I7);
                return new C0164d(str11, i8, j5);
            case 5:
                return new C0195b(parcel);
            case 6:
                return new C0197c(parcel);
            case 7:
                C0196b0 c0196b0 = new C0196b0();
                c0196b0.f4818a = parcel.readString();
                c0196b0.f4819b = parcel.readInt();
                return c0196b0;
            case 8:
                h0 h0Var = new h0();
                h0Var.f4880e = null;
                h0Var.f4881f = new ArrayList();
                h0Var.f4882g = new ArrayList();
                h0Var.f4876a = parcel.createStringArrayList();
                h0Var.f4877b = parcel.createStringArrayList();
                h0Var.f4878c = (C0195b[]) parcel.createTypedArray(C0195b.CREATOR);
                h0Var.f4879d = parcel.readInt();
                h0Var.f4880e = parcel.readString();
                h0Var.f4881f = parcel.createStringArrayList();
                h0Var.f4882g = parcel.createTypedArrayList(C0197c.CREATOR);
                h0Var.f4883h = parcel.createTypedArrayList(C0196b0.CREATOR);
                return h0Var;
            case 9:
                return new k0(parcel);
            case 10:
                int I8 = O3.d.I(parcel);
                String str12 = null;
                int i9 = 0;
                while (parcel.dataPosition() < I8) {
                    int readInt5 = parcel.readInt();
                    char c7 = (char) readInt5;
                    if (c7 == 1) {
                        i9 = O3.d.w(parcel, readInt5);
                    } else if (c7 != 2) {
                        O3.d.C(parcel, readInt5);
                    } else {
                        str12 = O3.d.i(parcel, readInt5);
                    }
                }
                O3.d.l(parcel, I8);
                return new Scope(i9, str12);
            case 11:
                int I9 = O3.d.I(parcel);
                String str13 = null;
                C0162b c0162b = null;
                int i10 = 0;
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < I9) {
                    int readInt6 = parcel.readInt();
                    char c8 = (char) readInt6;
                    if (c8 == 1) {
                        i10 = O3.d.w(parcel, readInt6);
                    } else if (c8 == 2) {
                        str13 = O3.d.i(parcel, readInt6);
                    } else if (c8 == 3) {
                        pendingIntent2 = (PendingIntent) O3.d.h(parcel, readInt6, PendingIntent.CREATOR);
                    } else if (c8 != 4) {
                        O3.d.C(parcel, readInt6);
                    } else {
                        c0162b = (C0162b) O3.d.h(parcel, readInt6, C0162b.CREATOR);
                    }
                }
                O3.d.l(parcel, I9);
                return new Status(i10, str13, pendingIntent2, c0162b);
            case 12:
                kotlin.jvm.internal.i.e(parcel, "parcel");
                return new C0373a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 13:
                kotlin.jvm.internal.i.e(parcel, "inParcel");
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                kotlin.jvm.internal.i.b(readParcelable);
                return new d.j((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 14:
                int I10 = O3.d.I(parcel);
                ArrayList arrayList2 = null;
                int i11 = 0;
                while (parcel.dataPosition() < I10) {
                    int readInt7 = parcel.readInt();
                    char c9 = (char) readInt7;
                    if (c9 == 1) {
                        i11 = O3.d.w(parcel, readInt7);
                    } else if (c9 != 2) {
                        O3.d.C(parcel, readInt7);
                    } else {
                        arrayList2 = O3.d.k(parcel, readInt7, C0388f.CREATOR);
                    }
                }
                O3.d.l(parcel, I10);
                return new d2.j(i11, arrayList2);
            case 15:
                int I11 = O3.d.I(parcel);
                int i12 = -1;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                String str14 = null;
                String str15 = null;
                long j6 = 0;
                long j7 = 0;
                while (parcel.dataPosition() < I11) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            i13 = O3.d.w(parcel, readInt8);
                            break;
                        case 2:
                            i14 = O3.d.w(parcel, readInt8);
                            break;
                        case 3:
                            i15 = O3.d.w(parcel, readInt8);
                            break;
                        case 4:
                            j6 = O3.d.x(parcel, readInt8);
                            break;
                        case 5:
                            j7 = O3.d.x(parcel, readInt8);
                            break;
                        case 6:
                            str14 = O3.d.i(parcel, readInt8);
                            break;
                        case 7:
                            str15 = O3.d.i(parcel, readInt8);
                            break;
                        case '\b':
                            i16 = O3.d.w(parcel, readInt8);
                            break;
                        case '\t':
                            i12 = O3.d.w(parcel, readInt8);
                            break;
                        default:
                            O3.d.C(parcel, readInt8);
                            break;
                    }
                }
                O3.d.l(parcel, I11);
                return new C0388f(i13, i14, i15, j6, j7, str14, str15, i16, i12);
            case 16:
                int I12 = O3.d.I(parcel);
                Account account = null;
                int i17 = 0;
                int i18 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < I12) {
                    int readInt9 = parcel.readInt();
                    char c10 = (char) readInt9;
                    if (c10 == 1) {
                        i17 = O3.d.w(parcel, readInt9);
                    } else if (c10 == 2) {
                        account = (Account) O3.d.h(parcel, readInt9, Account.CREATOR);
                    } else if (c10 == 3) {
                        i18 = O3.d.w(parcel, readInt9);
                    } else if (c10 != 4) {
                        O3.d.C(parcel, readInt9);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) O3.d.h(parcel, readInt9, GoogleSignInAccount.CREATOR);
                    }
                }
                O3.d.l(parcel, I12);
                return new n(i17, account, i18, googleSignInAccount);
            case 17:
                int I13 = O3.d.I(parcel);
                int i19 = 0;
                boolean z = false;
                boolean z4 = false;
                IBinder iBinder = null;
                C0162b c0162b2 = null;
                while (parcel.dataPosition() < I13) {
                    int readInt10 = parcel.readInt();
                    char c11 = (char) readInt10;
                    if (c11 == 1) {
                        i19 = O3.d.w(parcel, readInt10);
                    } else if (c11 == 2) {
                        iBinder = O3.d.v(parcel, readInt10);
                    } else if (c11 == 3) {
                        c0162b2 = (C0162b) O3.d.h(parcel, readInt10, C0162b.CREATOR);
                    } else if (c11 == 4) {
                        z = O3.d.u(parcel, readInt10);
                    } else if (c11 != 5) {
                        O3.d.C(parcel, readInt10);
                    } else {
                        z4 = O3.d.u(parcel, readInt10);
                    }
                }
                O3.d.l(parcel, I13);
                return new o(i19, iBinder, c0162b2, z, z4);
            case 18:
                int I14 = O3.d.I(parcel);
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                boolean z5 = false;
                boolean z6 = false;
                while (parcel.dataPosition() < I14) {
                    int readInt11 = parcel.readInt();
                    char c12 = (char) readInt11;
                    if (c12 == 1) {
                        i20 = O3.d.w(parcel, readInt11);
                    } else if (c12 == 2) {
                        z5 = O3.d.u(parcel, readInt11);
                    } else if (c12 == 3) {
                        z6 = O3.d.u(parcel, readInt11);
                    } else if (c12 == 4) {
                        i21 = O3.d.w(parcel, readInt11);
                    } else if (c12 != 5) {
                        O3.d.C(parcel, readInt11);
                    } else {
                        i22 = O3.d.w(parcel, readInt11);
                    }
                }
                O3.d.l(parcel, I14);
                return new d2.i(i20, i21, i22, z5, z6);
            case C0583e9.f11743C /* 19 */:
                int I15 = O3.d.I(parcel);
                int i23 = 0;
                Bundle bundle = null;
                C0164d[] c0164dArr = null;
                C0385c c0385c = null;
                while (parcel.dataPosition() < I15) {
                    int readInt12 = parcel.readInt();
                    char c13 = (char) readInt12;
                    if (c13 == 1) {
                        int y4 = O3.d.y(parcel, readInt12);
                        int dataPosition = parcel.dataPosition();
                        if (y4 == 0) {
                            bundle = null;
                        } else {
                            Bundle readBundle = parcel.readBundle();
                            parcel.setDataPosition(dataPosition + y4);
                            bundle = readBundle;
                        }
                    } else if (c13 == 2) {
                        c0164dArr = (C0164d[]) O3.d.j(parcel, readInt12, C0164d.CREATOR);
                    } else if (c13 == 3) {
                        i23 = O3.d.w(parcel, readInt12);
                    } else if (c13 != 4) {
                        O3.d.C(parcel, readInt12);
                    } else {
                        c0385c = (C0385c) O3.d.h(parcel, readInt12, C0385c.CREATOR);
                    }
                }
                O3.d.l(parcel, I15);
                y yVar = new y();
                yVar.f8309a = bundle;
                yVar.f8310b = c0164dArr;
                yVar.f8311c = i23;
                yVar.f8312d = c0385c;
                return yVar;
            case C0583e9.f11744D /* 20 */:
                int I16 = O3.d.I(parcel);
                d2.i iVar2 = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z7 = false;
                boolean z8 = false;
                int i24 = 0;
                while (parcel.dataPosition() < I16) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 1:
                            iVar2 = (d2.i) O3.d.h(parcel, readInt13, d2.i.CREATOR);
                            break;
                        case 2:
                            z7 = O3.d.u(parcel, readInt13);
                            break;
                        case 3:
                            z8 = O3.d.u(parcel, readInt13);
                            break;
                        case 4:
                            int y5 = O3.d.y(parcel, readInt13);
                            int dataPosition2 = parcel.dataPosition();
                            if (y5 != 0) {
                                iArr = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition2 + y5);
                                break;
                            } else {
                                iArr = null;
                                break;
                            }
                        case 5:
                            i24 = O3.d.w(parcel, readInt13);
                            break;
                        case 6:
                            int y6 = O3.d.y(parcel, readInt13);
                            int dataPosition3 = parcel.dataPosition();
                            if (y6 != 0) {
                                iArr2 = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition3 + y6);
                                break;
                            } else {
                                iArr2 = null;
                                break;
                            }
                        default:
                            O3.d.C(parcel, readInt13);
                            break;
                    }
                }
                O3.d.l(parcel, I16);
                return new C0385c(iVar2, z7, z8, iArr, i24, iArr2);
            case 21:
                int I17 = O3.d.I(parcel);
                Bundle bundle2 = new Bundle();
                Scope[] scopeArr = C0386d.o;
                String str16 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String str17 = null;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                boolean z9 = false;
                int i28 = 0;
                boolean z10 = false;
                C0164d[] c0164dArr2 = C0386d.f8240p;
                C0164d[] c0164dArr3 = c0164dArr2;
                while (parcel.dataPosition() < I17) {
                    int readInt14 = parcel.readInt();
                    switch ((char) readInt14) {
                        case 1:
                            i25 = O3.d.w(parcel, readInt14);
                            break;
                        case 2:
                            i26 = O3.d.w(parcel, readInt14);
                            break;
                        case 3:
                            i27 = O3.d.w(parcel, readInt14);
                            break;
                        case 4:
                            str16 = O3.d.i(parcel, readInt14);
                            break;
                        case 5:
                            iBinder2 = O3.d.v(parcel, readInt14);
                            break;
                        case 6:
                            scopeArr = (Scope[]) O3.d.j(parcel, readInt14, Scope.CREATOR);
                            break;
                        case 7:
                            int y7 = O3.d.y(parcel, readInt14);
                            int dataPosition4 = parcel.dataPosition();
                            if (y7 != 0) {
                                Bundle readBundle2 = parcel.readBundle();
                                parcel.setDataPosition(dataPosition4 + y7);
                                bundle2 = readBundle2;
                                break;
                            } else {
                                bundle2 = null;
                                break;
                            }
                        case '\b':
                            account2 = (Account) O3.d.h(parcel, readInt14, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            O3.d.C(parcel, readInt14);
                            break;
                        case '\n':
                            c0164dArr2 = (C0164d[]) O3.d.j(parcel, readInt14, C0164d.CREATOR);
                            break;
                        case 11:
                            c0164dArr3 = (C0164d[]) O3.d.j(parcel, readInt14, C0164d.CREATOR);
                            break;
                        case '\f':
                            z9 = O3.d.u(parcel, readInt14);
                            break;
                        case '\r':
                            i28 = O3.d.w(parcel, readInt14);
                            break;
                        case 14:
                            z10 = O3.d.u(parcel, readInt14);
                            break;
                        case 15:
                            str17 = O3.d.i(parcel, readInt14);
                            break;
                    }
                }
                O3.d.l(parcel, I17);
                return new C0386d(i25, i26, i27, str16, iBinder2, scopeArr, bundle2, account2, c0164dArr2, c0164dArr3, z9, i28, z10, str17);
            case Build.API_LEVELS.API_22 /* 22 */:
                C1265l c1265l = new C1265l();
                c1265l.f14245a = parcel.readInt();
                c1265l.f14246b = parcel.readInt();
                c1265l.f14247c = parcel.readInt() == 1;
                return c1265l;
            case Build.API_LEVELS.API_23 /* 23 */:
                C1251H c1251h = new C1251H();
                c1251h.f14179a = parcel.readInt();
                c1251h.f14180b = parcel.readInt();
                c1251h.f14182d = parcel.readInt() == 1;
                int readInt15 = parcel.readInt();
                if (readInt15 > 0) {
                    int[] iArr3 = new int[readInt15];
                    c1251h.f14181c = iArr3;
                    parcel.readIntArray(iArr3);
                }
                return c1251h;
            case 24:
                C1252I c1252i = new C1252I();
                c1252i.f14183a = parcel.readInt();
                c1252i.f14184b = parcel.readInt();
                int readInt16 = parcel.readInt();
                c1252i.f14185c = readInt16;
                if (readInt16 > 0) {
                    int[] iArr4 = new int[readInt16];
                    c1252i.f14186d = iArr4;
                    parcel.readIntArray(iArr4);
                }
                int readInt17 = parcel.readInt();
                c1252i.f14187e = readInt17;
                if (readInt17 > 0) {
                    int[] iArr5 = new int[readInt17];
                    c1252i.f14188f = iArr5;
                    parcel.readIntArray(iArr5);
                }
                c1252i.f14190h = parcel.readInt() == 1;
                c1252i.f14191i = parcel.readInt() == 1;
                c1252i.f14192j = parcel.readInt() == 1;
                c1252i.f14189g = parcel.readArrayList(C1251H.class.getClassLoader());
                return c1252i;
            case 25:
                int I18 = O3.d.I(parcel);
                int i29 = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
                long j8 = 0;
                q2.c[] cVarArr = null;
                int i30 = 1;
                int i31 = 1;
                while (parcel.dataPosition() < I18) {
                    int readInt18 = parcel.readInt();
                    char c14 = (char) readInt18;
                    if (c14 == 1) {
                        i30 = O3.d.w(parcel, readInt18);
                    } else if (c14 == 2) {
                        i31 = O3.d.w(parcel, readInt18);
                    } else if (c14 == 3) {
                        j8 = O3.d.x(parcel, readInt18);
                    } else if (c14 == 4) {
                        i29 = O3.d.w(parcel, readInt18);
                    } else if (c14 != 5) {
                        O3.d.C(parcel, readInt18);
                    } else {
                        cVarArr = (q2.c[]) O3.d.j(parcel, readInt18, q2.c.CREATOR);
                    }
                }
                O3.d.l(parcel, I18);
                LocationAvailability locationAvailability = new LocationAvailability();
                locationAvailability.f6040d = i29;
                locationAvailability.f6037a = i30;
                locationAvailability.f6038b = i31;
                locationAvailability.f6039c = j8;
                locationAvailability.f6041e = cVarArr;
                return locationAvailability;
            case 26:
                int I19 = O3.d.I(parcel);
                int i32 = 102;
                long j9 = 3600000;
                long j10 = 600000;
                boolean z11 = false;
                long j11 = 0;
                float f4 = 0.0f;
                int i33 = Integer.MAX_VALUE;
                long j12 = Long.MAX_VALUE;
                boolean z12 = false;
                while (parcel.dataPosition() < I19) {
                    int readInt19 = parcel.readInt();
                    boolean z13 = z12;
                    switch ((char) readInt19) {
                        case 1:
                            i32 = O3.d.w(parcel, readInt19);
                            break;
                        case 2:
                            j9 = O3.d.x(parcel, readInt19);
                            break;
                        case 3:
                            j10 = O3.d.x(parcel, readInt19);
                            break;
                        case 4:
                            z11 = O3.d.u(parcel, readInt19);
                            break;
                        case 5:
                            j12 = O3.d.x(parcel, readInt19);
                            break;
                        case 6:
                            i33 = O3.d.w(parcel, readInt19);
                            break;
                        case 7:
                            O3.d.N(parcel, readInt19, 4);
                            f4 = parcel.readFloat();
                            break;
                        case '\b':
                            j11 = O3.d.x(parcel, readInt19);
                            break;
                        case '\t':
                            z12 = O3.d.u(parcel, readInt19);
                            continue;
                        default:
                            O3.d.C(parcel, readInt19);
                            break;
                    }
                    z12 = z13;
                }
                O3.d.l(parcel, I19);
                LocationRequest locationRequest = new LocationRequest();
                locationRequest.f6042a = i32;
                locationRequest.f6043b = j9;
                locationRequest.f6044c = j10;
                locationRequest.f6045d = z11;
                locationRequest.f6046e = j12;
                locationRequest.f6047f = i33;
                locationRequest.f6048g = f4;
                locationRequest.f6049h = j11;
                locationRequest.f6050i = z12;
                return locationRequest;
            case 27:
                int I20 = O3.d.I(parcel);
                List list = LocationResult.f6051b;
                while (parcel.dataPosition() < I20) {
                    int readInt20 = parcel.readInt();
                    if (((char) readInt20) != 1) {
                        O3.d.C(parcel, readInt20);
                    } else {
                        list = O3.d.k(parcel, readInt20, Location.CREATOR);
                    }
                }
                O3.d.l(parcel, I20);
                return new LocationResult(list);
            case Build.API_LEVELS.API_28 /* 28 */:
                int I21 = O3.d.I(parcel);
                int i34 = 1;
                int i35 = 1;
                long j13 = -1;
                long j14 = -1;
                while (parcel.dataPosition() < I21) {
                    int readInt21 = parcel.readInt();
                    char c15 = (char) readInt21;
                    if (c15 == 1) {
                        i34 = O3.d.w(parcel, readInt21);
                    } else if (c15 == 2) {
                        i35 = O3.d.w(parcel, readInt21);
                    } else if (c15 == 3) {
                        j13 = O3.d.x(parcel, readInt21);
                    } else if (c15 != 4) {
                        O3.d.C(parcel, readInt21);
                    } else {
                        j14 = O3.d.x(parcel, readInt21);
                    }
                }
                O3.d.l(parcel, I21);
                return new q2.c(i34, i35, j13, j14);
            default:
                return new ParcelImpl(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.f1075a) {
            case 0:
                return new i[i4];
            case 1:
                return new X1.b[i4];
            case 2:
                return new GoogleSignInAccount[i4];
            case 3:
                return new C0162b[i4];
            case 4:
                return new C0164d[i4];
            case 5:
                return new C0195b[i4];
            case 6:
                return new C0197c[i4];
            case 7:
                return new C0196b0[i4];
            case 8:
                return new h0[i4];
            case 9:
                return new k0[i4];
            case 10:
                return new Scope[i4];
            case 11:
                return new Status[i4];
            case 12:
                return new C0373a[i4];
            case 13:
                return new d.j[i4];
            case 14:
                return new d2.j[i4];
            case 15:
                return new C0388f[i4];
            case 16:
                return new n[i4];
            case 17:
                return new o[i4];
            case 18:
                return new d2.i[i4];
            case C0583e9.f11743C /* 19 */:
                return new y[i4];
            case C0583e9.f11744D /* 20 */:
                return new C0385c[i4];
            case 21:
                return new C0386d[i4];
            case Build.API_LEVELS.API_22 /* 22 */:
                return new C1265l[i4];
            case Build.API_LEVELS.API_23 /* 23 */:
                return new C1251H[i4];
            case 24:
                return new C1252I[i4];
            case 25:
                return new LocationAvailability[i4];
            case 26:
                return new LocationRequest[i4];
            case 27:
                return new LocationResult[i4];
            case Build.API_LEVELS.API_28 /* 28 */:
                return new q2.c[i4];
            default:
                return new ParcelImpl[i4];
        }
    }
}
