package B1;

import W.H;
import W.I;
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
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import e.C0400a;
import e.C0408i;
import h1.C0479b;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.impl.C0793l9;
import java.util.ArrayList;
import java.util.List;
import o1.C1356A;
import o1.C1366d;
import o1.C1367e;
import o1.C1370h;
import o1.C1372j;
import o1.C1373k;
import o1.p;
import o1.q;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f213a;

    public /* synthetic */ c(int i2) {
        this.f213a = i2;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel inParcel) {
        switch (this.f213a) {
            case 0:
                int t02 = K1.b.t0(inParcel);
                Status status = null;
                while (inParcel.dataPosition() < t02) {
                    int readInt = inParcel.readInt();
                    if (((char) readInt) != 1) {
                        K1.b.n0(inParcel, readInt);
                    } else {
                        status = (Status) K1.b.M(inParcel, readInt, Status.CREATOR);
                    }
                }
                K1.b.S(inParcel, t02);
                return new b(status);
            case 1:
                int t03 = K1.b.t0(inParcel);
                List list = j.f220l;
                LocationRequest locationRequest = null;
                String str = null;
                String str2 = null;
                String str3 = null;
                boolean z = false;
                boolean z5 = false;
                boolean z6 = false;
                boolean z7 = false;
                boolean z8 = false;
                long j2 = Long.MAX_VALUE;
                while (inParcel.dataPosition() < t03) {
                    int readInt2 = inParcel.readInt();
                    char c2 = (char) readInt2;
                    if (c2 != 1) {
                        switch (c2) {
                            case 5:
                                list = K1.b.P(inParcel, readInt2, C1366d.CREATOR);
                                break;
                            case 6:
                                str = K1.b.N(inParcel, readInt2);
                                break;
                            case 7:
                                z = K1.b.f0(inParcel, readInt2);
                                break;
                            case '\b':
                                z5 = K1.b.f0(inParcel, readInt2);
                                break;
                            case '\t':
                                z6 = K1.b.f0(inParcel, readInt2);
                                break;
                            case '\n':
                                str2 = K1.b.N(inParcel, readInt2);
                                break;
                            case 11:
                                z7 = K1.b.f0(inParcel, readInt2);
                                break;
                            case '\f':
                                z8 = K1.b.f0(inParcel, readInt2);
                                break;
                            case '\r':
                                str3 = K1.b.N(inParcel, readInt2);
                                break;
                            case 14:
                                j2 = K1.b.j0(inParcel, readInt2);
                                break;
                            default:
                                K1.b.n0(inParcel, readInt2);
                                break;
                        }
                    } else {
                        locationRequest = (LocationRequest) K1.b.M(inParcel, readInt2, LocationRequest.CREATOR);
                    }
                }
                K1.b.S(inParcel, t03);
                return new j(locationRequest, list, str, z, z5, z6, str2, z7, z8, str3, j2);
            case 2:
                int t04 = K1.b.t0(inParcel);
                int i2 = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
                long j6 = 0;
                E1.g[] gVarArr = null;
                int i3 = 1;
                int i6 = 1;
                while (inParcel.dataPosition() < t04) {
                    int readInt3 = inParcel.readInt();
                    char c6 = (char) readInt3;
                    if (c6 == 1) {
                        i3 = K1.b.i0(inParcel, readInt3);
                    } else if (c6 == 2) {
                        i6 = K1.b.i0(inParcel, readInt3);
                    } else if (c6 == 3) {
                        j6 = K1.b.j0(inParcel, readInt3);
                    } else if (c6 == 4) {
                        i2 = K1.b.i0(inParcel, readInt3);
                    } else if (c6 != 5) {
                        K1.b.n0(inParcel, readInt3);
                    } else {
                        gVarArr = (E1.g[]) K1.b.O(inParcel, readInt3, E1.g.CREATOR);
                    }
                }
                K1.b.S(inParcel, t04);
                LocationAvailability locationAvailability = new LocationAvailability();
                locationAvailability.f5299d = i2;
                locationAvailability.f5296a = i3;
                locationAvailability.f5297b = i6;
                locationAvailability.f5298c = j6;
                locationAvailability.f5300e = gVarArr;
                return locationAvailability;
            case 3:
                int t05 = K1.b.t0(inParcel);
                int i7 = 102;
                long j7 = 3600000;
                long j8 = 600000;
                boolean z9 = false;
                long j9 = 0;
                float f3 = 0.0f;
                int i8 = Integer.MAX_VALUE;
                long j10 = Long.MAX_VALUE;
                boolean z10 = false;
                while (inParcel.dataPosition() < t05) {
                    int readInt4 = inParcel.readInt();
                    boolean z11 = z10;
                    switch ((char) readInt4) {
                        case 1:
                            i7 = K1.b.i0(inParcel, readInt4);
                            break;
                        case 2:
                            j7 = K1.b.j0(inParcel, readInt4);
                            break;
                        case 3:
                            j8 = K1.b.j0(inParcel, readInt4);
                            break;
                        case 4:
                            z9 = K1.b.f0(inParcel, readInt4);
                            break;
                        case 5:
                            j10 = K1.b.j0(inParcel, readInt4);
                            break;
                        case 6:
                            i8 = K1.b.i0(inParcel, readInt4);
                            break;
                        case 7:
                            K1.b.y0(inParcel, readInt4, 4);
                            f3 = inParcel.readFloat();
                            break;
                        case '\b':
                            j9 = K1.b.j0(inParcel, readInt4);
                            break;
                        case '\t':
                            z10 = K1.b.f0(inParcel, readInt4);
                            continue;
                        default:
                            K1.b.n0(inParcel, readInt4);
                            break;
                    }
                    z10 = z11;
                }
                K1.b.S(inParcel, t05);
                LocationRequest locationRequest2 = new LocationRequest();
                locationRequest2.f5301a = i7;
                locationRequest2.f5302b = j7;
                locationRequest2.f5303c = j8;
                locationRequest2.f5304d = z9;
                locationRequest2.f5305e = j10;
                locationRequest2.f5306f = i8;
                locationRequest2.f5307g = f3;
                locationRequest2.f5308h = j9;
                locationRequest2.f5309i = z10;
                return locationRequest2;
            case 4:
                int t06 = K1.b.t0(inParcel);
                List list2 = LocationResult.f5310b;
                while (inParcel.dataPosition() < t06) {
                    int readInt5 = inParcel.readInt();
                    if (((char) readInt5) != 1) {
                        K1.b.n0(inParcel, readInt5);
                    } else {
                        list2 = K1.b.P(inParcel, readInt5, Location.CREATOR);
                    }
                }
                K1.b.S(inParcel, t06);
                return new LocationResult(list2);
            case 5:
                int t07 = K1.b.t0(inParcel);
                int i9 = 1;
                int i10 = 1;
                long j11 = -1;
                long j12 = -1;
                while (inParcel.dataPosition() < t07) {
                    int readInt6 = inParcel.readInt();
                    char c7 = (char) readInt6;
                    if (c7 == 1) {
                        i9 = K1.b.i0(inParcel, readInt6);
                    } else if (c7 == 2) {
                        i10 = K1.b.i0(inParcel, readInt6);
                    } else if (c7 == 3) {
                        j11 = K1.b.j0(inParcel, readInt6);
                    } else if (c7 != 4) {
                        K1.b.n0(inParcel, readInt6);
                    } else {
                        j12 = K1.b.j0(inParcel, readInt6);
                    }
                }
                K1.b.S(inParcel, t07);
                return new E1.g(i9, i10, j11, j12);
            case 6:
                int t08 = K1.b.t0(inParcel);
                Intent intent = null;
                int i11 = 0;
                int i12 = 0;
                while (inParcel.dataPosition() < t08) {
                    int readInt7 = inParcel.readInt();
                    char c8 = (char) readInt7;
                    if (c8 == 1) {
                        i11 = K1.b.i0(inParcel, readInt7);
                    } else if (c8 == 2) {
                        i12 = K1.b.i0(inParcel, readInt7);
                    } else if (c8 != 3) {
                        K1.b.n0(inParcel, readInt7);
                    } else {
                        intent = (Intent) K1.b.M(inParcel, readInt7, Intent.CREATOR);
                    }
                }
                K1.b.S(inParcel, t08);
                return new G1.b(i11, i12, intent);
            case 7:
                int t09 = K1.b.t0(inParcel);
                ArrayList<String> arrayList = null;
                String str4 = null;
                while (inParcel.dataPosition() < t09) {
                    int readInt8 = inParcel.readInt();
                    char c9 = (char) readInt8;
                    if (c9 == 1) {
                        int k02 = K1.b.k0(inParcel, readInt8);
                        int dataPosition = inParcel.dataPosition();
                        if (k02 == 0) {
                            arrayList = null;
                        } else {
                            ArrayList<String> createStringArrayList = inParcel.createStringArrayList();
                            inParcel.setDataPosition(dataPosition + k02);
                            arrayList = createStringArrayList;
                        }
                    } else if (c9 != 2) {
                        K1.b.n0(inParcel, readInt8);
                    } else {
                        str4 = K1.b.N(inParcel, readInt8);
                    }
                }
                K1.b.S(inParcel, t09);
                return new G1.f(str4, arrayList);
            case 8:
                int t010 = K1.b.t0(inParcel);
                l1.b bVar = null;
                int i13 = 0;
                q qVar = null;
                while (inParcel.dataPosition() < t010) {
                    int readInt9 = inParcel.readInt();
                    char c10 = (char) readInt9;
                    if (c10 == 1) {
                        i13 = K1.b.i0(inParcel, readInt9);
                    } else if (c10 == 2) {
                        bVar = (l1.b) K1.b.M(inParcel, readInt9, l1.b.CREATOR);
                    } else if (c10 != 3) {
                        K1.b.n0(inParcel, readInt9);
                    } else {
                        qVar = (q) K1.b.M(inParcel, readInt9, q.CREATOR);
                    }
                }
                K1.b.S(inParcel, t010);
                return new G1.g(i13, bVar, qVar);
            case 9:
                I.j jVar = new I.j(inParcel);
                jVar.f1240a = inParcel.readInt();
                return jVar;
            case 10:
                W.n nVar = new W.n();
                nVar.f3358a = inParcel.readInt();
                nVar.f3359b = inParcel.readInt();
                nVar.f3360c = inParcel.readInt() == 1;
                return nVar;
            case 11:
                H h3 = new H();
                h3.f3272a = inParcel.readInt();
                h3.f3273b = inParcel.readInt();
                h3.f3275d = inParcel.readInt() == 1;
                int readInt10 = inParcel.readInt();
                if (readInt10 > 0) {
                    int[] iArr = new int[readInt10];
                    h3.f3274c = iArr;
                    inParcel.readIntArray(iArr);
                }
                return h3;
            case 12:
                I i14 = new I();
                i14.f3276a = inParcel.readInt();
                i14.f3277b = inParcel.readInt();
                int readInt11 = inParcel.readInt();
                i14.f3278c = readInt11;
                if (readInt11 > 0) {
                    int[] iArr2 = new int[readInt11];
                    i14.f3279d = iArr2;
                    inParcel.readIntArray(iArr2);
                }
                int readInt12 = inParcel.readInt();
                i14.f3280e = readInt12;
                if (readInt12 > 0) {
                    int[] iArr3 = new int[readInt12];
                    i14.f3281f = iArr3;
                    inParcel.readIntArray(iArr3);
                }
                i14.f3283h = inParcel.readInt() == 1;
                i14.f3284i = inParcel.readInt() == 1;
                i14.f3285j = inParcel.readInt() == 1;
                i14.f3282g = inParcel.readArrayList(H.class.getClassLoader());
                return i14;
            case 13:
                return new C0400a(inParcel);
            case 14:
                kotlin.jvm.internal.i.e(inParcel, "inParcel");
                Parcelable readParcelable = inParcel.readParcelable(IntentSender.class.getClassLoader());
                kotlin.jvm.internal.i.b(readParcelable);
                return new C0408i((IntentSender) readParcelable, (Intent) inParcel.readParcelable(Intent.class.getClassLoader()), inParcel.readInt(), inParcel.readInt());
            case 15:
                return new ParcelImpl(inParcel);
            case 16:
                int t011 = K1.b.t0(inParcel);
                String str5 = null;
                int i15 = 0;
                while (inParcel.dataPosition() < t011) {
                    int readInt13 = inParcel.readInt();
                    char c11 = (char) readInt13;
                    if (c11 == 1) {
                        str5 = K1.b.N(inParcel, readInt13);
                    } else if (c11 != 2) {
                        K1.b.n0(inParcel, readInt13);
                    } else {
                        i15 = K1.b.i0(inParcel, readInt13);
                    }
                }
                K1.b.S(inParcel, t011);
                return new C0479b(str5, i15);
            case 17:
                int t012 = K1.b.t0(inParcel);
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                Uri uri = null;
                String str10 = null;
                String str11 = null;
                ArrayList arrayList2 = null;
                String str12 = null;
                String str13 = null;
                long j13 = 0;
                int i16 = 0;
                while (inParcel.dataPosition() < t012) {
                    int readInt14 = inParcel.readInt();
                    switch ((char) readInt14) {
                        case 1:
                            i16 = K1.b.i0(inParcel, readInt14);
                            break;
                        case 2:
                            str6 = K1.b.N(inParcel, readInt14);
                            break;
                        case 3:
                            str7 = K1.b.N(inParcel, readInt14);
                            break;
                        case 4:
                            str8 = K1.b.N(inParcel, readInt14);
                            break;
                        case 5:
                            str9 = K1.b.N(inParcel, readInt14);
                            break;
                        case 6:
                            uri = (Uri) K1.b.M(inParcel, readInt14, Uri.CREATOR);
                            break;
                        case 7:
                            str10 = K1.b.N(inParcel, readInt14);
                            break;
                        case '\b':
                            j13 = K1.b.j0(inParcel, readInt14);
                            break;
                        case '\t':
                            str11 = K1.b.N(inParcel, readInt14);
                            break;
                        case '\n':
                            arrayList2 = K1.b.P(inParcel, readInt14, Scope.CREATOR);
                            break;
                        case 11:
                            str12 = K1.b.N(inParcel, readInt14);
                            break;
                        case '\f':
                            str13 = K1.b.N(inParcel, readInt14);
                            break;
                        default:
                            K1.b.n0(inParcel, readInt14);
                            break;
                    }
                }
                K1.b.S(inParcel, t012);
                return new GoogleSignInAccount(i16, str6, str7, str8, str9, uri, str10, j13, str11, arrayList2, str12, str13);
            case 18:
                int t013 = K1.b.t0(inParcel);
                PendingIntent pendingIntent = null;
                int i17 = 0;
                int i18 = 0;
                String str14 = null;
                while (inParcel.dataPosition() < t013) {
                    int readInt15 = inParcel.readInt();
                    char c12 = (char) readInt15;
                    if (c12 == 1) {
                        i17 = K1.b.i0(inParcel, readInt15);
                    } else if (c12 == 2) {
                        i18 = K1.b.i0(inParcel, readInt15);
                    } else if (c12 == 3) {
                        pendingIntent = (PendingIntent) K1.b.M(inParcel, readInt15, PendingIntent.CREATOR);
                    } else if (c12 != 4) {
                        K1.b.n0(inParcel, readInt15);
                    } else {
                        str14 = K1.b.N(inParcel, readInt15);
                    }
                }
                K1.b.S(inParcel, t013);
                return new l1.b(i17, i18, pendingIntent, str14);
            case C0793l9.f8681C /* 19 */:
                int t014 = K1.b.t0(inParcel);
                long j14 = -1;
                int i19 = 0;
                String str15 = null;
                while (inParcel.dataPosition() < t014) {
                    int readInt16 = inParcel.readInt();
                    char c13 = (char) readInt16;
                    if (c13 == 1) {
                        str15 = K1.b.N(inParcel, readInt16);
                    } else if (c13 == 2) {
                        i19 = K1.b.i0(inParcel, readInt16);
                    } else if (c13 != 3) {
                        K1.b.n0(inParcel, readInt16);
                    } else {
                        j14 = K1.b.j0(inParcel, readInt16);
                    }
                }
                K1.b.S(inParcel, t014);
                return new l1.d(str15, i19, j14);
            case C0793l9.f8682D /* 20 */:
                int t015 = K1.b.t0(inParcel);
                String str16 = null;
                int i20 = 0;
                while (inParcel.dataPosition() < t015) {
                    int readInt17 = inParcel.readInt();
                    char c14 = (char) readInt17;
                    if (c14 == 1) {
                        i20 = K1.b.i0(inParcel, readInt17);
                    } else if (c14 != 2) {
                        K1.b.n0(inParcel, readInt17);
                    } else {
                        str16 = K1.b.N(inParcel, readInt17);
                    }
                }
                K1.b.S(inParcel, t015);
                return new Scope(i20, str16);
            case C0793l9.f8683E /* 21 */:
                int t016 = K1.b.t0(inParcel);
                String str17 = null;
                l1.b bVar2 = null;
                int i21 = 0;
                PendingIntent pendingIntent2 = null;
                while (inParcel.dataPosition() < t016) {
                    int readInt18 = inParcel.readInt();
                    char c15 = (char) readInt18;
                    if (c15 == 1) {
                        i21 = K1.b.i0(inParcel, readInt18);
                    } else if (c15 == 2) {
                        str17 = K1.b.N(inParcel, readInt18);
                    } else if (c15 == 3) {
                        pendingIntent2 = (PendingIntent) K1.b.M(inParcel, readInt18, PendingIntent.CREATOR);
                    } else if (c15 != 4) {
                        K1.b.n0(inParcel, readInt18);
                    } else {
                        bVar2 = (l1.b) K1.b.M(inParcel, readInt18, l1.b.CREATOR);
                    }
                }
                K1.b.S(inParcel, t016);
                return new Status(i21, str17, pendingIntent2, bVar2);
            case 22:
                int t017 = K1.b.t0(inParcel);
                String str18 = null;
                int i22 = 0;
                while (inParcel.dataPosition() < t017) {
                    int readInt19 = inParcel.readInt();
                    char c16 = (char) readInt19;
                    if (c16 == 1) {
                        i22 = K1.b.i0(inParcel, readInt19);
                    } else if (c16 != 2) {
                        K1.b.n0(inParcel, readInt19);
                    } else {
                        str18 = K1.b.N(inParcel, readInt19);
                    }
                }
                K1.b.S(inParcel, t017);
                return new C1366d(i22, str18);
            case 23:
                int t018 = K1.b.t0(inParcel);
                ArrayList arrayList3 = null;
                int i23 = 0;
                while (inParcel.dataPosition() < t018) {
                    int readInt20 = inParcel.readInt();
                    char c17 = (char) readInt20;
                    if (c17 == 1) {
                        i23 = K1.b.i0(inParcel, readInt20);
                    } else if (c17 != 2) {
                        K1.b.n0(inParcel, readInt20);
                    } else {
                        arrayList3 = K1.b.P(inParcel, readInt20, C1370h.CREATOR);
                    }
                }
                K1.b.S(inParcel, t018);
                return new C1373k(i23, arrayList3);
            case 24:
                int t019 = K1.b.t0(inParcel);
                int i24 = -1;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                String str19 = null;
                String str20 = null;
                long j15 = 0;
                long j16 = 0;
                while (inParcel.dataPosition() < t019) {
                    int readInt21 = inParcel.readInt();
                    switch ((char) readInt21) {
                        case 1:
                            i25 = K1.b.i0(inParcel, readInt21);
                            break;
                        case 2:
                            i26 = K1.b.i0(inParcel, readInt21);
                            break;
                        case 3:
                            i27 = K1.b.i0(inParcel, readInt21);
                            break;
                        case 4:
                            j15 = K1.b.j0(inParcel, readInt21);
                            break;
                        case 5:
                            j16 = K1.b.j0(inParcel, readInt21);
                            break;
                        case 6:
                            str19 = K1.b.N(inParcel, readInt21);
                            break;
                        case 7:
                            str20 = K1.b.N(inParcel, readInt21);
                            break;
                        case '\b':
                            i28 = K1.b.i0(inParcel, readInt21);
                            break;
                        case '\t':
                            i24 = K1.b.i0(inParcel, readInt21);
                            break;
                        default:
                            K1.b.n0(inParcel, readInt21);
                            break;
                    }
                }
                K1.b.S(inParcel, t019);
                return new C1370h(i25, i26, i27, j15, j16, str19, str20, i28, i24);
            case C0793l9.f8684F /* 25 */:
                int t020 = K1.b.t0(inParcel);
                Account account = null;
                int i29 = 0;
                int i30 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (inParcel.dataPosition() < t020) {
                    int readInt22 = inParcel.readInt();
                    char c18 = (char) readInt22;
                    if (c18 == 1) {
                        i29 = K1.b.i0(inParcel, readInt22);
                    } else if (c18 == 2) {
                        account = (Account) K1.b.M(inParcel, readInt22, Account.CREATOR);
                    } else if (c18 == 3) {
                        i30 = K1.b.i0(inParcel, readInt22);
                    } else if (c18 != 4) {
                        K1.b.n0(inParcel, readInt22);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) K1.b.M(inParcel, readInt22, GoogleSignInAccount.CREATOR);
                    }
                }
                K1.b.S(inParcel, t020);
                return new p(i29, account, i30, googleSignInAccount);
            case 26:
                int t021 = K1.b.t0(inParcel);
                int i31 = 0;
                boolean z12 = false;
                boolean z13 = false;
                IBinder iBinder = null;
                l1.b bVar3 = null;
                while (inParcel.dataPosition() < t021) {
                    int readInt23 = inParcel.readInt();
                    char c19 = (char) readInt23;
                    if (c19 == 1) {
                        i31 = K1.b.i0(inParcel, readInt23);
                    } else if (c19 == 2) {
                        iBinder = K1.b.h0(inParcel, readInt23);
                    } else if (c19 == 3) {
                        bVar3 = (l1.b) K1.b.M(inParcel, readInt23, l1.b.CREATOR);
                    } else if (c19 == 4) {
                        z12 = K1.b.f0(inParcel, readInt23);
                    } else if (c19 != 5) {
                        K1.b.n0(inParcel, readInt23);
                    } else {
                        z13 = K1.b.f0(inParcel, readInt23);
                    }
                }
                K1.b.S(inParcel, t021);
                return new q(i31, iBinder, bVar3, z12, z13);
            case C0793l9.f8686H /* 27 */:
                int t022 = K1.b.t0(inParcel);
                int i32 = 0;
                boolean z14 = false;
                boolean z15 = false;
                int i33 = 0;
                int i34 = 0;
                while (inParcel.dataPosition() < t022) {
                    int readInt24 = inParcel.readInt();
                    char c20 = (char) readInt24;
                    if (c20 == 1) {
                        i32 = K1.b.i0(inParcel, readInt24);
                    } else if (c20 == 2) {
                        z14 = K1.b.f0(inParcel, readInt24);
                    } else if (c20 == 3) {
                        z15 = K1.b.f0(inParcel, readInt24);
                    } else if (c20 == 4) {
                        i33 = K1.b.i0(inParcel, readInt24);
                    } else if (c20 != 5) {
                        K1.b.n0(inParcel, readInt24);
                    } else {
                        i34 = K1.b.i0(inParcel, readInt24);
                    }
                }
                K1.b.S(inParcel, t022);
                return new C1372j(i32, z14, z15, i33, i34);
            default:
                int t023 = K1.b.t0(inParcel);
                Bundle bundle = null;
                C1367e c1367e = null;
                int i35 = 0;
                l1.d[] dVarArr = null;
                while (inParcel.dataPosition() < t023) {
                    int readInt25 = inParcel.readInt();
                    char c21 = (char) readInt25;
                    if (c21 == 1) {
                        bundle = K1.b.L(inParcel, readInt25);
                    } else if (c21 == 2) {
                        dVarArr = (l1.d[]) K1.b.O(inParcel, readInt25, l1.d.CREATOR);
                    } else if (c21 == 3) {
                        i35 = K1.b.i0(inParcel, readInt25);
                    } else if (c21 != 4) {
                        K1.b.n0(inParcel, readInt25);
                    } else {
                        c1367e = (C1367e) K1.b.M(inParcel, readInt25, C1367e.CREATOR);
                    }
                }
                K1.b.S(inParcel, t023);
                C1356A c1356a = new C1356A();
                c1356a.f11498a = bundle;
                c1356a.f11499b = dVarArr;
                c1356a.f11500c = i35;
                c1356a.f11501d = c1367e;
                return c1356a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f213a) {
            case 0:
                return new b[i2];
            case 1:
                return new j[i2];
            case 2:
                return new LocationAvailability[i2];
            case 3:
                return new LocationRequest[i2];
            case 4:
                return new LocationResult[i2];
            case 5:
                return new E1.g[i2];
            case 6:
                return new G1.b[i2];
            case 7:
                return new G1.f[i2];
            case 8:
                return new G1.g[i2];
            case 9:
                return new I.j[i2];
            case 10:
                return new W.n[i2];
            case 11:
                return new H[i2];
            case 12:
                return new I[i2];
            case 13:
                return new C0400a[i2];
            case 14:
                return new C0408i[i2];
            case 15:
                return new ParcelImpl[i2];
            case 16:
                return new C0479b[i2];
            case 17:
                return new GoogleSignInAccount[i2];
            case 18:
                return new l1.b[i2];
            case C0793l9.f8681C /* 19 */:
                return new l1.d[i2];
            case C0793l9.f8682D /* 20 */:
                return new Scope[i2];
            case C0793l9.f8683E /* 21 */:
                return new Status[i2];
            case 22:
                return new C1366d[i2];
            case 23:
                return new C1373k[i2];
            case 24:
                return new C1370h[i2];
            case C0793l9.f8684F /* 25 */:
                return new p[i2];
            case 26:
                return new q[i2];
            case C0793l9.f8686H /* 27 */:
                return new C1372j[i2];
            default:
                return new C1356A[i2];
        }
    }
}
