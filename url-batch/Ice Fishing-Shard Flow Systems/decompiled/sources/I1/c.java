package I1;

import E1.i;
import S.j;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0211b;
import androidx.fragment.app.C0212c;
import androidx.fragment.app.M;
import androidx.fragment.app.T;
import androidx.fragment.app.X;
import androidx.swiperefreshlayout.widget.k;
import androidx.versionedparcelable.ParcelImpl;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.firebase.messaging.x;
import f.C0382a;
import f.C0392k;
import g0.C0415H;
import g0.C0416I;
import g0.C0434n;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import n.P;
import p1.C0818a;
import p1.C0819b;
import p1.C0822e;
import t1.C0920g;
import t1.C0922i;
import t1.C0923j;
import t1.l;
import t1.q;
import t1.r;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1271a;

    public /* synthetic */ c(int i2) {
        this.f1271a = i2;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int readInt;
        switch (this.f1271a) {
            case 0:
                int M7 = d4.c.M(parcel);
                Intent intent = null;
                int i2 = 0;
                int i5 = 0;
                while (parcel.dataPosition() < M7) {
                    int readInt2 = parcel.readInt();
                    char c7 = (char) readInt2;
                    if (c7 == 1) {
                        i2 = d4.c.G(parcel, readInt2);
                    } else if (c7 == 2) {
                        i5 = d4.c.G(parcel, readInt2);
                    } else if (c7 != 3) {
                        d4.c.J(parcel, readInt2);
                    } else {
                        intent = (Intent) d4.c.h(parcel, readInt2, Intent.CREATOR);
                    }
                }
                d4.c.n(parcel, M7);
                return new b(i2, i5, intent);
            case 1:
                int M8 = d4.c.M(parcel);
                ArrayList<String> arrayList = null;
                String str = null;
                while (parcel.dataPosition() < M8) {
                    int readInt3 = parcel.readInt();
                    char c8 = (char) readInt3;
                    if (c8 == 1) {
                        int H7 = d4.c.H(parcel, readInt3);
                        int dataPosition = parcel.dataPosition();
                        if (H7 == 0) {
                            arrayList = null;
                        } else {
                            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(dataPosition + H7);
                            arrayList = createStringArrayList;
                        }
                    } else if (c8 != 2) {
                        d4.c.J(parcel, readInt3);
                    } else {
                        str = d4.c.i(parcel, readInt3);
                    }
                }
                d4.c.n(parcel, M8);
                return new g(str, arrayList);
            case 2:
                int M9 = d4.c.M(parcel);
                q1.b bVar = null;
                int i7 = 0;
                r rVar = null;
                while (parcel.dataPosition() < M9) {
                    int readInt4 = parcel.readInt();
                    char c9 = (char) readInt4;
                    if (c9 == 1) {
                        i7 = d4.c.G(parcel, readInt4);
                    } else if (c9 == 2) {
                        bVar = (q1.b) d4.c.h(parcel, readInt4, q1.b.CREATOR);
                    } else if (c9 != 3) {
                        d4.c.J(parcel, readInt4);
                    } else {
                        rVar = (r) d4.c.h(parcel, readInt4, r.CREATOR);
                    }
                }
                d4.c.n(parcel, M9);
                return new h(i7, bVar, rVar);
            case 3:
                L.g gVar = new L.g(parcel);
                gVar.f1649d = parcel.readInt();
                return gVar;
            case 4:
                return new C0211b(parcel);
            case 5:
                return new C0212c(parcel);
            case 6:
                M m2 = new M();
                m2.f3593d = parcel.readString();
                m2.f3594e = parcel.readInt();
                return m2;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                T t6 = new T();
                t6.f3642m = null;
                t6.f3643n = new ArrayList();
                t6.f3644o = new ArrayList();
                t6.f3638d = parcel.createStringArrayList();
                t6.f3639e = parcel.createStringArrayList();
                t6.f3640i = (C0211b[]) parcel.createTypedArray(C0211b.CREATOR);
                t6.f3641l = parcel.readInt();
                t6.f3642m = parcel.readString();
                t6.f3643n = parcel.createStringArrayList();
                t6.f3644o = parcel.createTypedArrayList(C0212c.CREATOR);
                t6.f3645p = parcel.createTypedArrayList(M.CREATOR);
                return t6;
            case j.BYTES_FIELD_NUMBER /* 8 */:
                return new X(parcel);
            case 9:
                return new k(parcel);
            case 10:
                int M10 = d4.c.M(parcel);
                Bundle bundle = null;
                while (parcel.dataPosition() < M10) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 2) {
                        d4.c.J(parcel, readInt5);
                    } else {
                        bundle = d4.c.g(parcel, readInt5);
                    }
                }
                d4.c.n(parcel, M10);
                return new x(bundle);
            case RequestError.STOP_TRACKING /* 11 */:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new C0382a(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
            case 12:
                Intrinsics.checkNotNullParameter(parcel, "inParcel");
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                Intrinsics.b(readParcelable);
                return new C0392k((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 13:
                C0434n c0434n = new C0434n();
                c0434n.f4953d = parcel.readInt();
                c0434n.f4954e = parcel.readInt();
                c0434n.f4955i = parcel.readInt() == 1;
                return c0434n;
            case 14:
                C0415H c0415h = new C0415H();
                c0415h.f4869d = parcel.readInt();
                c0415h.f4870e = parcel.readInt();
                c0415h.f4872l = parcel.readInt() == 1;
                int readInt6 = parcel.readInt();
                if (readInt6 > 0) {
                    int[] iArr = new int[readInt6];
                    c0415h.f4871i = iArr;
                    parcel.readIntArray(iArr);
                }
                return c0415h;
            case 15:
                C0416I c0416i = new C0416I();
                c0416i.f4873d = parcel.readInt();
                c0416i.f4874e = parcel.readInt();
                int readInt7 = parcel.readInt();
                c0416i.f4875i = readInt7;
                if (readInt7 > 0) {
                    int[] iArr2 = new int[readInt7];
                    c0416i.f4876l = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt8 = parcel.readInt();
                c0416i.f4877m = readInt8;
                if (readInt8 > 0) {
                    int[] iArr3 = new int[readInt8];
                    c0416i.f4878n = iArr3;
                    parcel.readIntArray(iArr3);
                }
                c0416i.f4880p = parcel.readInt() == 1;
                c0416i.f4881q = parcel.readInt() == 1;
                c0416i.f4882r = parcel.readInt() == 1;
                c0416i.f4879o = parcel.readArrayList(C0415H.class.getClassLoader());
                return c0416i;
            case 16:
                P p7 = new P(parcel);
                p7.f6689d = parcel.readByte() != 0;
                return p7;
            case 17:
                int M11 = d4.c.M(parcel);
                long j = 0;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                Uri uri = null;
                String str6 = null;
                String str7 = null;
                ArrayList arrayList2 = null;
                String str8 = null;
                String str9 = null;
                while (true) {
                    long j7 = j;
                    while (parcel.dataPosition() < M11) {
                        readInt = parcel.readInt();
                        switch ((char) readInt) {
                            case 2:
                                str2 = d4.c.i(parcel, readInt);
                                break;
                            case 3:
                                str3 = d4.c.i(parcel, readInt);
                                break;
                            case 4:
                                str4 = d4.c.i(parcel, readInt);
                                break;
                            case 5:
                                str5 = d4.c.i(parcel, readInt);
                                break;
                            case 6:
                                uri = (Uri) d4.c.h(parcel, readInt, Uri.CREATOR);
                                break;
                            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                                str6 = d4.c.i(parcel, readInt);
                                break;
                            case j.BYTES_FIELD_NUMBER /* 8 */:
                                break;
                            case '\t':
                                str7 = d4.c.i(parcel, readInt);
                                break;
                            case '\n':
                                Parcelable.Creator<Scope> creator = Scope.CREATOR;
                                int H8 = d4.c.H(parcel, readInt);
                                int dataPosition2 = parcel.dataPosition();
                                if (H8 != 0) {
                                    ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
                                    parcel.setDataPosition(dataPosition2 + H8);
                                    arrayList2 = createTypedArrayList;
                                    break;
                                } else {
                                    arrayList2 = null;
                                    break;
                                }
                            case RequestError.STOP_TRACKING /* 11 */:
                                str8 = d4.c.i(parcel, readInt);
                                break;
                            case '\f':
                                str9 = d4.c.i(parcel, readInt);
                                break;
                            default:
                                d4.c.J(parcel, readInt);
                                break;
                        }
                    }
                    d4.c.n(parcel, M11);
                    return new GoogleSignInAccount(str2, str3, str4, str5, uri, str6, j7, str7, arrayList2, str8, str9);
                    d4.c.O(parcel, readInt, 8);
                    j = parcel.readLong();
                    break;
                }
            case 18:
                int M12 = d4.c.M(parcel);
                Intent intent2 = null;
                while (parcel.dataPosition() < M12) {
                    int readInt9 = parcel.readInt();
                    if (((char) readInt9) != 1) {
                        d4.c.J(parcel, readInt9);
                    } else {
                        intent2 = (Intent) d4.c.h(parcel, readInt9, Intent.CREATOR);
                    }
                }
                d4.c.n(parcel, M12);
                return new C0818a(intent2);
            case 19:
                return new C0822e(parcel.readStrongBinder());
            case 20:
                int M13 = d4.c.M(parcel);
                String str10 = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                int i8 = 0;
                while (parcel.dataPosition() < M13) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 1:
                            str10 = d4.c.i(parcel, readInt10);
                            break;
                        case 2:
                            str11 = d4.c.i(parcel, readInt10);
                            break;
                        case 3:
                            str12 = d4.c.i(parcel, readInt10);
                            break;
                        case 4:
                            str13 = d4.c.i(parcel, readInt10);
                            break;
                        case 5:
                            str14 = d4.c.i(parcel, readInt10);
                            break;
                        case 6:
                            i8 = d4.c.G(parcel, readInt10);
                            break;
                        case j.DOUBLE_FIELD_NUMBER /* 7 */:
                            str15 = d4.c.i(parcel, readInt10);
                            break;
                        default:
                            d4.c.J(parcel, readInt10);
                            break;
                    }
                }
                d4.c.n(parcel, M13);
                return new C0819b(str10, str11, str12, str13, str14, i8, str15);
            case 21:
                int M14 = d4.c.M(parcel);
                PendingIntent pendingIntent = null;
                String str16 = null;
                Integer num = null;
                int i9 = 0;
                int i10 = 0;
                while (parcel.dataPosition() < M14) {
                    int readInt11 = parcel.readInt();
                    char c10 = (char) readInt11;
                    if (c10 == 1) {
                        i9 = d4.c.G(parcel, readInt11);
                    } else if (c10 == 2) {
                        i10 = d4.c.G(parcel, readInt11);
                    } else if (c10 == 3) {
                        pendingIntent = (PendingIntent) d4.c.h(parcel, readInt11, PendingIntent.CREATOR);
                    } else if (c10 == 4) {
                        str16 = d4.c.i(parcel, readInt11);
                    } else if (c10 != 5) {
                        d4.c.J(parcel, readInt11);
                    } else {
                        int H9 = d4.c.H(parcel, readInt11);
                        if (H9 == 0) {
                            num = null;
                        } else {
                            if (H9 != 4) {
                                String hexString = Integer.toHexString(H9);
                                StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + String.valueOf(4).length() + 19 + String.valueOf(H9).length() + 4 + 1);
                                sb.append("Expected size 4 got ");
                                sb.append(H9);
                                sb.append(" (0x");
                                sb.append(hexString);
                                sb.append(")");
                                throw new i(sb.toString(), parcel);
                            }
                            num = Integer.valueOf(parcel.readInt());
                        }
                    }
                }
                d4.c.n(parcel, M14);
                return new q1.b(i9, i10, pendingIntent, str16, num);
            case 22:
                int M15 = d4.c.M(parcel);
                int i11 = 0;
                boolean z7 = false;
                long j8 = -1;
                String str17 = null;
                while (parcel.dataPosition() < M15) {
                    int readInt12 = parcel.readInt();
                    char c11 = (char) readInt12;
                    if (c11 == 1) {
                        str17 = d4.c.i(parcel, readInt12);
                    } else if (c11 == 2) {
                        i11 = d4.c.G(parcel, readInt12);
                    } else if (c11 == 3) {
                        d4.c.O(parcel, readInt12, 8);
                        j8 = parcel.readLong();
                    } else if (c11 != 4) {
                        d4.c.J(parcel, readInt12);
                    } else {
                        z7 = d4.c.D(parcel, readInt12);
                    }
                }
                d4.c.n(parcel, M15);
                return new q1.d(str17, i11, j8, z7);
            case 23:
                return new ParcelImpl(parcel);
            case 24:
                int M16 = d4.c.M(parcel);
                int i12 = 0;
                while (true) {
                    ArrayList arrayList3 = null;
                    while (parcel.dataPosition() < M16) {
                        int readInt13 = parcel.readInt();
                        char c12 = (char) readInt13;
                        if (c12 == 1) {
                            i12 = d4.c.G(parcel, readInt13);
                        } else if (c12 != 2) {
                            d4.c.J(parcel, readInt13);
                        } else {
                            Parcelable.Creator<C0920g> creator2 = C0920g.CREATOR;
                            int H10 = d4.c.H(parcel, readInt13);
                            int dataPosition3 = parcel.dataPosition();
                            if (H10 == 0) {
                                break;
                            }
                            arrayList3 = parcel.createTypedArrayList(creator2);
                            parcel.setDataPosition(dataPosition3 + H10);
                        }
                    }
                    d4.c.n(parcel, M16);
                    return new C0923j(i12, arrayList3);
                    break;
                }
            case 25:
                int M17 = d4.c.M(parcel);
                int i13 = 0;
                int i14 = 0;
                boolean z8 = false;
                long j9 = 0;
                String str18 = null;
                while (parcel.dataPosition() < M17) {
                    int readInt14 = parcel.readInt();
                    char c13 = (char) readInt14;
                    if (c13 == 1) {
                        i13 = d4.c.G(parcel, readInt14);
                    } else if (c13 == 2) {
                        str18 = d4.c.i(parcel, readInt14);
                    } else if (c13 == 3) {
                        d4.c.O(parcel, readInt14, 8);
                        j9 = parcel.readLong();
                    } else if (c13 == 4) {
                        i14 = d4.c.G(parcel, readInt14);
                    } else if (c13 != 5) {
                        d4.c.J(parcel, readInt14);
                    } else {
                        z8 = d4.c.D(parcel, readInt14);
                    }
                }
                d4.c.n(parcel, M17);
                return new l(i13, str18, j9, i14, z8);
            case com.onesignal.debug.internal.crash.f.MIN_SDK_VERSION /* 26 */:
                int M18 = d4.c.M(parcel);
                int i15 = -1;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                String str19 = null;
                String str20 = null;
                long j10 = 0;
                long j11 = 0;
                while (parcel.dataPosition() < M18) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 1:
                            i16 = d4.c.G(parcel, readInt15);
                            break;
                        case 2:
                            i17 = d4.c.G(parcel, readInt15);
                            break;
                        case 3:
                            i18 = d4.c.G(parcel, readInt15);
                            break;
                        case 4:
                            d4.c.O(parcel, readInt15, 8);
                            j10 = parcel.readLong();
                            break;
                        case 5:
                            d4.c.O(parcel, readInt15, 8);
                            j11 = parcel.readLong();
                            break;
                        case 6:
                            str19 = d4.c.i(parcel, readInt15);
                            break;
                        case j.DOUBLE_FIELD_NUMBER /* 7 */:
                            str20 = d4.c.i(parcel, readInt15);
                            break;
                        case j.BYTES_FIELD_NUMBER /* 8 */:
                            i19 = d4.c.G(parcel, readInt15);
                            break;
                        case '\t':
                            i15 = d4.c.G(parcel, readInt15);
                            break;
                        default:
                            d4.c.J(parcel, readInt15);
                            break;
                    }
                }
                d4.c.n(parcel, M18);
                return new C0920g(i16, i17, i18, j10, j11, str19, str20, i19, i15);
            case 27:
                int M19 = d4.c.M(parcel);
                Account account = null;
                int i20 = 0;
                int i21 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < M19) {
                    int readInt16 = parcel.readInt();
                    char c14 = (char) readInt16;
                    if (c14 == 1) {
                        i20 = d4.c.G(parcel, readInt16);
                    } else if (c14 == 2) {
                        account = (Account) d4.c.h(parcel, readInt16, Account.CREATOR);
                    } else if (c14 == 3) {
                        i21 = d4.c.G(parcel, readInt16);
                    } else if (c14 != 4) {
                        d4.c.J(parcel, readInt16);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) d4.c.h(parcel, readInt16, GoogleSignInAccount.CREATOR);
                    }
                }
                d4.c.n(parcel, M19);
                return new q(i20, account, i21, googleSignInAccount);
            case 28:
                int M20 = d4.c.M(parcel);
                int i22 = 0;
                boolean z9 = false;
                boolean z10 = false;
                IBinder iBinder = null;
                q1.b bVar2 = null;
                while (parcel.dataPosition() < M20) {
                    int readInt17 = parcel.readInt();
                    char c15 = (char) readInt17;
                    if (c15 == 1) {
                        i22 = d4.c.G(parcel, readInt17);
                    } else if (c15 == 2) {
                        int H11 = d4.c.H(parcel, readInt17);
                        int dataPosition4 = parcel.dataPosition();
                        if (H11 == 0) {
                            iBinder = null;
                        } else {
                            iBinder = parcel.readStrongBinder();
                            parcel.setDataPosition(dataPosition4 + H11);
                        }
                    } else if (c15 == 3) {
                        bVar2 = (q1.b) d4.c.h(parcel, readInt17, q1.b.CREATOR);
                    } else if (c15 == 4) {
                        z9 = d4.c.D(parcel, readInt17);
                    } else if (c15 != 5) {
                        d4.c.J(parcel, readInt17);
                    } else {
                        z10 = d4.c.D(parcel, readInt17);
                    }
                }
                d4.c.n(parcel, M20);
                return new r(i22, iBinder, bVar2, z9, z10);
            default:
                int M21 = d4.c.M(parcel);
                int i23 = 0;
                boolean z11 = false;
                boolean z12 = false;
                int i24 = 0;
                int i25 = 0;
                while (parcel.dataPosition() < M21) {
                    int readInt18 = parcel.readInt();
                    char c16 = (char) readInt18;
                    if (c16 == 1) {
                        i23 = d4.c.G(parcel, readInt18);
                    } else if (c16 == 2) {
                        z11 = d4.c.D(parcel, readInt18);
                    } else if (c16 == 3) {
                        z12 = d4.c.D(parcel, readInt18);
                    } else if (c16 == 4) {
                        i24 = d4.c.G(parcel, readInt18);
                    } else if (c16 != 5) {
                        d4.c.J(parcel, readInt18);
                    } else {
                        i25 = d4.c.G(parcel, readInt18);
                    }
                }
                d4.c.n(parcel, M21);
                return new C0922i(i23, z11, z12, i24, i25);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f1271a) {
            case 0:
                return new b[i2];
            case 1:
                return new g[i2];
            case 2:
                return new h[i2];
            case 3:
                return new L.g[i2];
            case 4:
                return new C0211b[i2];
            case 5:
                return new C0212c[i2];
            case 6:
                return new M[i2];
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new T[i2];
            case j.BYTES_FIELD_NUMBER /* 8 */:
                return new X[i2];
            case 9:
                return new k[i2];
            case 10:
                return new x[i2];
            case RequestError.STOP_TRACKING /* 11 */:
                return new C0382a[i2];
            case 12:
                return new C0392k[i2];
            case 13:
                return new C0434n[i2];
            case 14:
                return new C0415H[i2];
            case 15:
                return new C0416I[i2];
            case 16:
                return new P[i2];
            case 17:
                return new GoogleSignInAccount[i2];
            case 18:
                return new C0818a[i2];
            case 19:
                return new C0822e[i2];
            case 20:
                return new C0819b[i2];
            case 21:
                return new q1.b[i2];
            case 22:
                return new q1.d[i2];
            case 23:
                return new ParcelImpl[i2];
            case 24:
                return new C0923j[i2];
            case 25:
                return new l[i2];
            case com.onesignal.debug.internal.crash.f.MIN_SDK_VERSION /* 26 */:
                return new C0920g[i2];
            case 27:
                return new q[i2];
            case 28:
                return new r[i2];
            default:
                return new C0922i[i2];
        }
    }
}
