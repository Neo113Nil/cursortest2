package F0;

import O2.C0370g;
import O2.C0371h;
import O2.C0374k;
import O2.E;
import O2.m;
import O2.n;
import O2.s;
import O2.t;
import S0.f;
import U.k;
import X0.C0412f;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0469b;
import androidx.fragment.app.C0470c;
import androidx.fragment.app.K;
import androidx.fragment.app.P;
import androidx.fragment.app.U;
import androidx.versionedparcelable.ParcelImpl;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.material.datepicker.o;
import e.C4462a;
import e.j;
import f3.C4503b;
import f3.C4507f;
import java.util.ArrayList;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f940a;

    public /* synthetic */ a(int i) {
        this.f940a = i;
    }

    public static void a(C0371h c0371h, Parcel parcel, int i) {
        int B8 = f.B(parcel, 20293);
        f.A(parcel, 1, 4);
        parcel.writeInt(c0371h.f2424n);
        f.A(parcel, 2, 4);
        parcel.writeInt(c0371h.f2425u);
        f.A(parcel, 3, 4);
        parcel.writeInt(c0371h.f2426v);
        f.u(parcel, 4, c0371h.f2427w);
        f.s(parcel, 5, c0371h.f2428x);
        f.x(parcel, 6, c0371h.f2429y, i);
        f.q(parcel, 7, c0371h.f2430z);
        f.t(parcel, 8, c0371h.f2417A, i);
        f.x(parcel, 10, c0371h.f2418B, i);
        f.x(parcel, 11, c0371h.f2419C, i);
        f.A(parcel, 12, 4);
        parcel.writeInt(c0371h.f2420D ? 1 : 0);
        f.A(parcel, 13, 4);
        parcel.writeInt(c0371h.f2421E);
        boolean z8 = c0371h.f2422F;
        f.A(parcel, 14, 4);
        parcel.writeInt(z8 ? 1 : 0);
        f.u(parcel, 15, c0371h.f2423G);
        f.C(parcel, B8);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int readInt;
        switch (this.f940a) {
            case 0:
                return new ParcelImpl(parcel);
            case 1:
                int F8 = K3.b.F(parcel);
                String str = null;
                int i = 0;
                while (parcel.dataPosition() < F8) {
                    int readInt2 = parcel.readInt();
                    char c4 = (char) readInt2;
                    if (c4 == 1) {
                        str = K3.b.i(parcel, readInt2);
                    } else if (c4 != 2) {
                        K3.b.C(parcel, readInt2);
                    } else {
                        i = K3.b.v(parcel, readInt2);
                    }
                }
                K3.b.m(parcel, F8);
                return new H2.c(str, i);
            case 2:
                int F9 = K3.b.F(parcel);
                long j9 = 0;
                int i4 = 0;
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
                while (true) {
                    long j10 = j9;
                    while (parcel.dataPosition() < F9) {
                        readInt = parcel.readInt();
                        switch ((char) readInt) {
                            case 1:
                                i4 = K3.b.v(parcel, readInt);
                                break;
                            case 2:
                                str2 = K3.b.i(parcel, readInt);
                                break;
                            case 3:
                                str3 = K3.b.i(parcel, readInt);
                                break;
                            case 4:
                                str4 = K3.b.i(parcel, readInt);
                                break;
                            case 5:
                                str5 = K3.b.i(parcel, readInt);
                                break;
                            case 6:
                                uri = (Uri) K3.b.h(parcel, readInt, Uri.CREATOR);
                                break;
                            case 7:
                                str6 = K3.b.i(parcel, readInt);
                                break;
                            case '\b':
                                break;
                            case '\t':
                                str7 = K3.b.i(parcel, readInt);
                                break;
                            case '\n':
                                Parcelable.Creator<Scope> creator = Scope.CREATOR;
                                int x3 = K3.b.x(parcel, readInt);
                                int dataPosition = parcel.dataPosition();
                                if (x3 != 0) {
                                    ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
                                    parcel.setDataPosition(dataPosition + x3);
                                    arrayList = createTypedArrayList;
                                    break;
                                } else {
                                    arrayList = null;
                                    break;
                                }
                            case 11:
                                str8 = K3.b.i(parcel, readInt);
                                break;
                            case '\f':
                                str9 = K3.b.i(parcel, readInt);
                                break;
                            default:
                                K3.b.C(parcel, readInt);
                                break;
                        }
                    }
                    K3.b.m(parcel, F9);
                    return new GoogleSignInAccount(i4, str2, str3, str4, str5, uri, str6, j10, str7, arrayList, str8, str9);
                    j9 = K3.b.w(parcel, readInt);
                    break;
                }
            case 3:
                int F10 = K3.b.F(parcel);
                PendingIntent pendingIntent = null;
                String str10 = null;
                Integer num = null;
                int i9 = 0;
                int i10 = 0;
                while (parcel.dataPosition() < F10) {
                    int readInt3 = parcel.readInt();
                    char c9 = (char) readInt3;
                    if (c9 == 1) {
                        i9 = K3.b.v(parcel, readInt3);
                    } else if (c9 == 2) {
                        i10 = K3.b.v(parcel, readInt3);
                    } else if (c9 == 3) {
                        pendingIntent = (PendingIntent) K3.b.h(parcel, readInt3, PendingIntent.CREATOR);
                    } else if (c9 == 4) {
                        str10 = K3.b.i(parcel, readInt3);
                    } else if (c9 != 5) {
                        K3.b.C(parcel, readInt3);
                    } else {
                        int x9 = K3.b.x(parcel, readInt3);
                        if (x9 == 0) {
                            num = null;
                        } else {
                            if (x9 != 4) {
                                String hexString = Integer.toHexString(x9);
                                StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + String.valueOf(4).length() + 19 + String.valueOf(x9).length() + 4 + 1);
                                sb.append("Expected size 4 got ");
                                sb.append(x9);
                                sb.append(" (0x");
                                sb.append(hexString);
                                sb.append(")");
                                throw new B0.c(sb.toString(), parcel);
                            }
                            num = Integer.valueOf(parcel.readInt());
                        }
                    }
                }
                K3.b.m(parcel, F10);
                return new L2.b(i9, i10, pendingIntent, str10, num);
            case 4:
                int F11 = K3.b.F(parcel);
                boolean z8 = false;
                int i11 = 0;
                long j11 = -1;
                String str11 = null;
                while (parcel.dataPosition() < F11) {
                    int readInt4 = parcel.readInt();
                    char c10 = (char) readInt4;
                    if (c10 == 1) {
                        str11 = K3.b.i(parcel, readInt4);
                    } else if (c10 == 2) {
                        i11 = K3.b.v(parcel, readInt4);
                    } else if (c10 == 3) {
                        j11 = K3.b.w(parcel, readInt4);
                    } else if (c10 != 4) {
                        K3.b.C(parcel, readInt4);
                    } else {
                        z8 = K3.b.t(parcel, readInt4);
                    }
                }
                K3.b.m(parcel, F11);
                return new L2.d(str11, z8, i11, j11);
            case 5:
                int F12 = K3.b.F(parcel);
                String str12 = null;
                int i12 = 0;
                while (parcel.dataPosition() < F12) {
                    int readInt5 = parcel.readInt();
                    char c11 = (char) readInt5;
                    if (c11 == 1) {
                        i12 = K3.b.v(parcel, readInt5);
                    } else if (c11 != 2) {
                        K3.b.C(parcel, readInt5);
                    } else {
                        str12 = K3.b.i(parcel, readInt5);
                    }
                }
                K3.b.m(parcel, F12);
                return new Scope(i12, str12);
            case 6:
                int F13 = K3.b.F(parcel);
                String str13 = null;
                L2.b bVar = null;
                int i13 = 0;
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < F13) {
                    int readInt6 = parcel.readInt();
                    char c12 = (char) readInt6;
                    if (c12 == 1) {
                        i13 = K3.b.v(parcel, readInt6);
                    } else if (c12 == 2) {
                        str13 = K3.b.i(parcel, readInt6);
                    } else if (c12 == 3) {
                        pendingIntent2 = (PendingIntent) K3.b.h(parcel, readInt6, PendingIntent.CREATOR);
                    } else if (c12 != 4) {
                        K3.b.C(parcel, readInt6);
                    } else {
                        bVar = (L2.b) K3.b.h(parcel, readInt6, L2.b.CREATOR);
                    }
                }
                K3.b.m(parcel, F13);
                return new Status(i13, str13, pendingIntent2, bVar);
            case 7:
                int F14 = K3.b.F(parcel);
                int i14 = 0;
                while (true) {
                    ArrayList arrayList2 = null;
                    while (parcel.dataPosition() < F14) {
                        int readInt7 = parcel.readInt();
                        char c13 = (char) readInt7;
                        if (c13 == 1) {
                            i14 = K3.b.v(parcel, readInt7);
                        } else if (c13 != 2) {
                            K3.b.C(parcel, readInt7);
                        } else {
                            Parcelable.Creator<C0374k> creator2 = C0374k.CREATOR;
                            int x10 = K3.b.x(parcel, readInt7);
                            int dataPosition2 = parcel.dataPosition();
                            if (x10 == 0) {
                                break;
                            }
                            arrayList2 = parcel.createTypedArrayList(creator2);
                            parcel.setDataPosition(dataPosition2 + x10);
                        }
                    }
                    K3.b.m(parcel, F14);
                    return new n(i14, arrayList2);
                    break;
                }
            case 8:
                int F15 = K3.b.F(parcel);
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                long j12 = 0;
                long j13 = 0;
                String str14 = null;
                String str15 = null;
                int i19 = -1;
                while (parcel.dataPosition() < F15) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            i15 = K3.b.v(parcel, readInt8);
                            break;
                        case 2:
                            i16 = K3.b.v(parcel, readInt8);
                            break;
                        case 3:
                            i17 = K3.b.v(parcel, readInt8);
                            break;
                        case 4:
                            j12 = K3.b.w(parcel, readInt8);
                            break;
                        case 5:
                            j13 = K3.b.w(parcel, readInt8);
                            break;
                        case 6:
                            str14 = K3.b.i(parcel, readInt8);
                            break;
                        case 7:
                            str15 = K3.b.i(parcel, readInt8);
                            break;
                        case '\b':
                            i18 = K3.b.v(parcel, readInt8);
                            break;
                        case '\t':
                            i19 = K3.b.v(parcel, readInt8);
                            break;
                        default:
                            K3.b.C(parcel, readInt8);
                            break;
                    }
                }
                K3.b.m(parcel, F15);
                return new C0374k(i15, i16, i17, j12, j13, str14, str15, i18, i19);
            case 9:
                int F16 = K3.b.F(parcel);
                int i20 = 0;
                Account account = null;
                GoogleSignInAccount googleSignInAccount = null;
                int i21 = 0;
                while (parcel.dataPosition() < F16) {
                    int readInt9 = parcel.readInt();
                    char c14 = (char) readInt9;
                    if (c14 == 1) {
                        i20 = K3.b.v(parcel, readInt9);
                    } else if (c14 == 2) {
                        account = (Account) K3.b.h(parcel, readInt9, Account.CREATOR);
                    } else if (c14 == 3) {
                        i21 = K3.b.v(parcel, readInt9);
                    } else if (c14 != 4) {
                        K3.b.C(parcel, readInt9);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) K3.b.h(parcel, readInt9, GoogleSignInAccount.CREATOR);
                    }
                }
                K3.b.m(parcel, F16);
                return new s(i20, account, i21, googleSignInAccount);
            case 10:
                int F17 = K3.b.F(parcel);
                int i22 = 0;
                boolean z9 = false;
                boolean z10 = false;
                IBinder iBinder = null;
                L2.b bVar2 = null;
                while (parcel.dataPosition() < F17) {
                    int readInt10 = parcel.readInt();
                    char c15 = (char) readInt10;
                    if (c15 == 1) {
                        i22 = K3.b.v(parcel, readInt10);
                    } else if (c15 == 2) {
                        iBinder = K3.b.u(parcel, readInt10);
                    } else if (c15 == 3) {
                        bVar2 = (L2.b) K3.b.h(parcel, readInt10, L2.b.CREATOR);
                    } else if (c15 == 4) {
                        z9 = K3.b.t(parcel, readInt10);
                    } else if (c15 != 5) {
                        K3.b.C(parcel, readInt10);
                    } else {
                        z10 = K3.b.t(parcel, readInt10);
                    }
                }
                K3.b.m(parcel, F17);
                return new t(i22, iBinder, bVar2, z9, z10);
            case 11:
                int F18 = K3.b.F(parcel);
                int i23 = 0;
                boolean z11 = false;
                boolean z12 = false;
                int i24 = 0;
                int i25 = 0;
                while (parcel.dataPosition() < F18) {
                    int readInt11 = parcel.readInt();
                    char c16 = (char) readInt11;
                    if (c16 == 1) {
                        i23 = K3.b.v(parcel, readInt11);
                    } else if (c16 == 2) {
                        z11 = K3.b.t(parcel, readInt11);
                    } else if (c16 == 3) {
                        z12 = K3.b.t(parcel, readInt11);
                    } else if (c16 == 4) {
                        i24 = K3.b.v(parcel, readInt11);
                    } else if (c16 != 5) {
                        K3.b.C(parcel, readInt11);
                    } else {
                        i25 = K3.b.v(parcel, readInt11);
                    }
                }
                K3.b.m(parcel, F18);
                return new m(i23, z11, z12, i24, i25);
            case 12:
                int F19 = K3.b.F(parcel);
                Bundle bundle = null;
                C0370g c0370g = null;
                int i26 = 0;
                L2.d[] dVarArr = null;
                while (parcel.dataPosition() < F19) {
                    int readInt12 = parcel.readInt();
                    char c17 = (char) readInt12;
                    if (c17 == 1) {
                        bundle = K3.b.f(parcel, readInt12);
                    } else if (c17 == 2) {
                        dVarArr = (L2.d[]) K3.b.l(parcel, readInt12, L2.d.CREATOR);
                    } else if (c17 == 3) {
                        i26 = K3.b.v(parcel, readInt12);
                    } else if (c17 != 4) {
                        K3.b.C(parcel, readInt12);
                    } else {
                        c0370g = (C0370g) K3.b.h(parcel, readInt12, C0370g.CREATOR);
                    }
                }
                K3.b.m(parcel, F19);
                E e6 = new E();
                e6.f2354n = bundle;
                e6.f2355u = dVarArr;
                e6.f2356v = i26;
                e6.f2357w = c0370g;
                return e6;
            case 13:
                int F20 = K3.b.F(parcel);
                m mVar = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z13 = false;
                boolean z14 = false;
                int i27 = 0;
                while (parcel.dataPosition() < F20) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 1:
                            mVar = (m) K3.b.h(parcel, readInt13, m.CREATOR);
                            break;
                        case 2:
                            z13 = K3.b.t(parcel, readInt13);
                            break;
                        case 3:
                            z14 = K3.b.t(parcel, readInt13);
                            break;
                        case 4:
                            int x11 = K3.b.x(parcel, readInt13);
                            int dataPosition3 = parcel.dataPosition();
                            if (x11 != 0) {
                                iArr = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition3 + x11);
                                break;
                            } else {
                                iArr = null;
                                break;
                            }
                        case 5:
                            i27 = K3.b.v(parcel, readInt13);
                            break;
                        case 6:
                            int x12 = K3.b.x(parcel, readInt13);
                            int dataPosition4 = parcel.dataPosition();
                            if (x12 != 0) {
                                iArr2 = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition4 + x12);
                                break;
                            } else {
                                iArr2 = null;
                                break;
                            }
                        default:
                            K3.b.C(parcel, readInt13);
                            break;
                    }
                }
                K3.b.m(parcel, F20);
                return new C0370g(mVar, z13, z14, iArr, i27, iArr2);
            case 14:
                int F21 = K3.b.F(parcel);
                Scope[] scopeArr = C0371h.f2415H;
                Bundle bundle2 = new Bundle();
                L2.d[] dVarArr2 = C0371h.f2416I;
                L2.d[] dVarArr3 = dVarArr2;
                String str16 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String str17 = null;
                int i28 = 0;
                int i29 = 0;
                int i30 = 0;
                boolean z15 = false;
                int i31 = 0;
                boolean z16 = false;
                while (parcel.dataPosition() < F21) {
                    int readInt14 = parcel.readInt();
                    switch ((char) readInt14) {
                        case 1:
                            i28 = K3.b.v(parcel, readInt14);
                            break;
                        case 2:
                            i29 = K3.b.v(parcel, readInt14);
                            break;
                        case 3:
                            i30 = K3.b.v(parcel, readInt14);
                            break;
                        case 4:
                            str16 = K3.b.i(parcel, readInt14);
                            break;
                        case 5:
                            iBinder2 = K3.b.u(parcel, readInt14);
                            break;
                        case 6:
                            scopeArr = (Scope[]) K3.b.l(parcel, readInt14, Scope.CREATOR);
                            break;
                        case 7:
                            bundle2 = K3.b.f(parcel, readInt14);
                            break;
                        case '\b':
                            account2 = (Account) K3.b.h(parcel, readInt14, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            K3.b.C(parcel, readInt14);
                            break;
                        case '\n':
                            dVarArr2 = (L2.d[]) K3.b.l(parcel, readInt14, L2.d.CREATOR);
                            break;
                        case 11:
                            dVarArr3 = (L2.d[]) K3.b.l(parcel, readInt14, L2.d.CREATOR);
                            break;
                        case '\f':
                            z15 = K3.b.t(parcel, readInt14);
                            break;
                        case '\r':
                            i31 = K3.b.v(parcel, readInt14);
                            break;
                        case 14:
                            z16 = K3.b.t(parcel, readInt14);
                            break;
                        case 15:
                            str17 = K3.b.i(parcel, readInt14);
                            break;
                    }
                }
                K3.b.m(parcel, F21);
                return new C0371h(i28, i29, i30, str16, iBinder2, scopeArr, bundle2, account2, dVarArr2, dVarArr3, z15, i31, z16, str17);
            case 15:
                return new WrappedParcelable(parcel);
            case 16:
                k kVar = new k(parcel);
                kVar.f3206n = parcel.readInt();
                return kVar;
            case 17:
                C0412f c0412f = new C0412f(parcel);
                c0412f.f3653n = parcel.readString();
                c0412f.f3655v = parcel.readFloat();
                c0412f.f3656w = parcel.readInt() == 1;
                c0412f.f3657x = parcel.readString();
                c0412f.f3658y = parcel.readInt();
                c0412f.f3659z = parcel.readInt();
                return c0412f;
            case 18:
                return new C0469b(parcel);
            case 19:
                return new C0470c(parcel);
            case 20:
                K k6 = new K();
                k6.f4946n = parcel.readString();
                k6.f4947u = parcel.readInt();
                return k6;
            case 21:
                P p6 = new P();
                p6.f4992x = null;
                p6.f4993y = new ArrayList();
                p6.f4994z = new ArrayList();
                p6.f4988n = parcel.createStringArrayList();
                p6.f4989u = parcel.createStringArrayList();
                p6.f4990v = (C0469b[]) parcel.createTypedArray(C0469b.CREATOR);
                p6.f4991w = parcel.readInt();
                p6.f4992x = parcel.readString();
                p6.f4993y = parcel.createStringArrayList();
                p6.f4994z = parcel.createTypedArrayList(C0470c.CREATOR);
                p6.f4987A = parcel.createTypedArrayList(K.CREATOR);
                return p6;
            case 22:
                return new U(parcel);
            case 23:
                return new com.google.android.material.datepicker.b((o) parcel.readParcelable(o.class.getClassLoader()), (o) parcel.readParcelable(o.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (o) parcel.readParcelable(o.class.getClassLoader()), parcel.readInt());
            case 24:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 25:
                return o.a(parcel.readInt(), parcel.readInt());
            case 26:
                h.e(parcel, "parcel");
                return new C4462a(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
            case 27:
                h.e(parcel, "inParcel");
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                h.b(readParcelable);
                return new j((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 28:
                int F22 = K3.b.F(parcel);
                int i32 = 0;
                Intent intent = null;
                int i33 = 0;
                while (parcel.dataPosition() < F22) {
                    int readInt15 = parcel.readInt();
                    char c18 = (char) readInt15;
                    if (c18 == 1) {
                        i32 = K3.b.v(parcel, readInt15);
                    } else if (c18 == 2) {
                        i33 = K3.b.v(parcel, readInt15);
                    } else if (c18 != 3) {
                        K3.b.C(parcel, readInt15);
                    } else {
                        intent = (Intent) K3.b.h(parcel, readInt15, Intent.CREATOR);
                    }
                }
                K3.b.m(parcel, F22);
                return new C4503b(i32, i33, intent);
            default:
                int F23 = K3.b.F(parcel);
                ArrayList arrayList3 = null;
                String str18 = null;
                while (parcel.dataPosition() < F23) {
                    int readInt16 = parcel.readInt();
                    char c19 = (char) readInt16;
                    if (c19 == 1) {
                        arrayList3 = K3.b.k(parcel, readInt16);
                    } else if (c19 != 2) {
                        K3.b.C(parcel, readInt16);
                    } else {
                        str18 = K3.b.i(parcel, readInt16);
                    }
                }
                K3.b.m(parcel, F23);
                return new C4507f(str18, arrayList3);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f940a) {
            case 0:
                return new ParcelImpl[i];
            case 1:
                return new H2.c[i];
            case 2:
                return new GoogleSignInAccount[i];
            case 3:
                return new L2.b[i];
            case 4:
                return new L2.d[i];
            case 5:
                return new Scope[i];
            case 6:
                return new Status[i];
            case 7:
                return new n[i];
            case 8:
                return new C0374k[i];
            case 9:
                return new s[i];
            case 10:
                return new t[i];
            case 11:
                return new m[i];
            case 12:
                return new E[i];
            case 13:
                return new C0370g[i];
            case 14:
                return new C0371h[i];
            case 15:
                return new WrappedParcelable[i];
            case 16:
                return new k[i];
            case 17:
                return new C0412f[i];
            case 18:
                return new C0469b[i];
            case 19:
                return new C0470c[i];
            case 20:
                return new K[i];
            case 21:
                return new P[i];
            case 22:
                return new U[i];
            case 23:
                return new com.google.android.material.datepicker.b[i];
            case 24:
                return new com.google.android.material.datepicker.d[i];
            case 25:
                return new o[i];
            case 26:
                return new C4462a[i];
            case 27:
                return new j[i];
            case 28:
                return new C4503b[i];
            default:
                return new C4507f[i];
        }
    }
}
