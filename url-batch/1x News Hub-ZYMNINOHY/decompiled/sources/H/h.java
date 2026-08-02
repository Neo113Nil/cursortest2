package H;

import H.h;
import N0.C0064c;
import N0.m;
import N0.n;
import N0.x;
import U.C0078n;
import U.J;
import U.K;
import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.location.Location;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.impl.C0642l9;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f590a;

    public /* synthetic */ h(int i3) {
        this.f590a = i3;
    }

    public static void a(N0.d dVar, Parcel parcel, int i3) {
        int S2 = C2.b.S(parcel, 20293);
        C2.b.U(parcel, 1, 4);
        parcel.writeInt(dVar.f1003a);
        C2.b.U(parcel, 2, 4);
        parcel.writeInt(dVar.f1004b);
        C2.b.U(parcel, 3, 4);
        parcel.writeInt(dVar.f1005c);
        C2.b.O(parcel, 4, dVar.f1006d);
        C2.b.M(parcel, 5, dVar.f1007e);
        C2.b.P(parcel, 6, dVar.f, i3);
        Bundle bundle = dVar.f1008g;
        if (bundle != null) {
            int S3 = C2.b.S(parcel, 7);
            parcel.writeBundle(bundle);
            C2.b.T(parcel, S3);
        }
        C2.b.N(parcel, 8, dVar.f1009h, i3);
        C2.b.P(parcel, 10, dVar.f1010i, i3);
        C2.b.P(parcel, 11, dVar.f1011j, i3);
        C2.b.U(parcel, 12, 4);
        parcel.writeInt(dVar.f1012k ? 1 : 0);
        C2.b.U(parcel, 13, 4);
        parcel.writeInt(dVar.f1013l);
        boolean z = dVar.f1014m;
        C2.b.U(parcel, 14, 4);
        parcel.writeInt(z ? 1 : 0);
        C2.b.O(parcel, 15, dVar.f1015n);
        C2.b.T(parcel, S2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createFromParcel(final Parcel parcel) {
        Uri uri;
        Bundle bundle;
        switch (this.f590a) {
            case 0:
                i iVar = new i(parcel);
                iVar.f591a = parcel.readInt();
                return iVar;
            case 1:
                int V2 = android.support.v4.media.session.a.V(parcel);
                String str = null;
                int i3 = 0;
                while (parcel.dataPosition() < V2) {
                    int readInt = parcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 == 1) {
                        str = android.support.v4.media.session.a.r(parcel, readInt);
                    } else if (c3 != 2) {
                        android.support.v4.media.session.a.R(parcel, readInt);
                    } else {
                        i3 = android.support.v4.media.session.a.J(parcel, readInt);
                    }
                }
                android.support.v4.media.session.a.v(parcel, V2);
                return new H0.b(str, i3);
            case 2:
                int V3 = android.support.v4.media.session.a.V(parcel);
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                Uri uri2 = null;
                String str6 = null;
                String str7 = null;
                ArrayList arrayList = null;
                String str8 = null;
                String str9 = null;
                long j3 = 0;
                int i4 = 0;
                while (parcel.dataPosition() < V3) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            i4 = android.support.v4.media.session.a.J(parcel, readInt2);
                            break;
                        case 2:
                            str2 = android.support.v4.media.session.a.r(parcel, readInt2);
                            break;
                        case 3:
                            str3 = android.support.v4.media.session.a.r(parcel, readInt2);
                            break;
                        case 4:
                            str4 = android.support.v4.media.session.a.r(parcel, readInt2);
                            break;
                        case 5:
                            str5 = android.support.v4.media.session.a.r(parcel, readInt2);
                            break;
                        case 6:
                            uri2 = (Uri) android.support.v4.media.session.a.q(parcel, readInt2, Uri.CREATOR);
                            break;
                        case 7:
                            str6 = android.support.v4.media.session.a.r(parcel, readInt2);
                            break;
                        case '\b':
                            j3 = android.support.v4.media.session.a.K(parcel, readInt2);
                            break;
                        case '\t':
                            str7 = android.support.v4.media.session.a.r(parcel, readInt2);
                            break;
                        case '\n':
                            arrayList = android.support.v4.media.session.a.t(parcel, readInt2, Scope.CREATOR);
                            break;
                        case 11:
                            str8 = android.support.v4.media.session.a.r(parcel, readInt2);
                            break;
                        case '\f':
                            str9 = android.support.v4.media.session.a.r(parcel, readInt2);
                            break;
                        default:
                            android.support.v4.media.session.a.R(parcel, readInt2);
                            break;
                    }
                }
                android.support.v4.media.session.a.v(parcel, V3);
                return new GoogleSignInAccount(i4, str2, str3, str4, str5, uri2, str6, j3, str7, arrayList, str8, str9);
            case 3:
                int V4 = android.support.v4.media.session.a.V(parcel);
                PendingIntent pendingIntent = null;
                int i5 = 0;
                int i6 = 0;
                String str10 = null;
                while (parcel.dataPosition() < V4) {
                    int readInt3 = parcel.readInt();
                    char c4 = (char) readInt3;
                    if (c4 == 1) {
                        i5 = android.support.v4.media.session.a.J(parcel, readInt3);
                    } else if (c4 == 2) {
                        i6 = android.support.v4.media.session.a.J(parcel, readInt3);
                    } else if (c4 == 3) {
                        pendingIntent = (PendingIntent) android.support.v4.media.session.a.q(parcel, readInt3, PendingIntent.CREATOR);
                    } else if (c4 != 4) {
                        android.support.v4.media.session.a.R(parcel, readInt3);
                    } else {
                        str10 = android.support.v4.media.session.a.r(parcel, readInt3);
                    }
                }
                android.support.v4.media.session.a.v(parcel, V4);
                return new K0.b(i5, i6, pendingIntent, str10);
            case 4:
                int V5 = android.support.v4.media.session.a.V(parcel);
                long j4 = -1;
                int i7 = 0;
                String str11 = null;
                while (parcel.dataPosition() < V5) {
                    int readInt4 = parcel.readInt();
                    char c5 = (char) readInt4;
                    if (c5 == 1) {
                        str11 = android.support.v4.media.session.a.r(parcel, readInt4);
                    } else if (c5 == 2) {
                        i7 = android.support.v4.media.session.a.J(parcel, readInt4);
                    } else if (c5 != 3) {
                        android.support.v4.media.session.a.R(parcel, readInt4);
                    } else {
                        j4 = android.support.v4.media.session.a.K(parcel, readInt4);
                    }
                }
                android.support.v4.media.session.a.v(parcel, V5);
                return new K0.d(str11, i7, j4);
            case 5:
                int V6 = android.support.v4.media.session.a.V(parcel);
                String str12 = null;
                int i8 = 0;
                while (parcel.dataPosition() < V6) {
                    int readInt5 = parcel.readInt();
                    char c6 = (char) readInt5;
                    if (c6 == 1) {
                        i8 = android.support.v4.media.session.a.J(parcel, readInt5);
                    } else if (c6 != 2) {
                        android.support.v4.media.session.a.R(parcel, readInt5);
                    } else {
                        str12 = android.support.v4.media.session.a.r(parcel, readInt5);
                    }
                }
                android.support.v4.media.session.a.v(parcel, V6);
                return new Scope(i8, str12);
            case 6:
                int V7 = android.support.v4.media.session.a.V(parcel);
                String str13 = null;
                K0.b bVar = null;
                int i9 = 0;
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < V7) {
                    int readInt6 = parcel.readInt();
                    char c7 = (char) readInt6;
                    if (c7 == 1) {
                        i9 = android.support.v4.media.session.a.J(parcel, readInt6);
                    } else if (c7 == 2) {
                        str13 = android.support.v4.media.session.a.r(parcel, readInt6);
                    } else if (c7 == 3) {
                        pendingIntent2 = (PendingIntent) android.support.v4.media.session.a.q(parcel, readInt6, PendingIntent.CREATOR);
                    } else if (c7 != 4) {
                        android.support.v4.media.session.a.R(parcel, readInt6);
                    } else {
                        bVar = (K0.b) android.support.v4.media.session.a.q(parcel, readInt6, K0.b.CREATOR);
                    }
                }
                android.support.v4.media.session.a.v(parcel, V7);
                return new Status(i9, str13, pendingIntent2, bVar);
            case 7:
                int V8 = android.support.v4.media.session.a.V(parcel);
                ArrayList arrayList2 = null;
                int i10 = 0;
                while (parcel.dataPosition() < V8) {
                    int readInt7 = parcel.readInt();
                    char c8 = (char) readInt7;
                    if (c8 == 1) {
                        i10 = android.support.v4.media.session.a.J(parcel, readInt7);
                    } else if (c8 != 2) {
                        android.support.v4.media.session.a.R(parcel, readInt7);
                    } else {
                        arrayList2 = android.support.v4.media.session.a.t(parcel, readInt7, N0.f.CREATOR);
                    }
                }
                android.support.v4.media.session.a.v(parcel, V8);
                return new N0.i(i10, arrayList2);
            case 8:
                int V9 = android.support.v4.media.session.a.V(parcel);
                int i11 = -1;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                String str14 = null;
                String str15 = null;
                long j5 = 0;
                long j6 = 0;
                while (parcel.dataPosition() < V9) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            i12 = android.support.v4.media.session.a.J(parcel, readInt8);
                            break;
                        case 2:
                            i13 = android.support.v4.media.session.a.J(parcel, readInt8);
                            break;
                        case 3:
                            i14 = android.support.v4.media.session.a.J(parcel, readInt8);
                            break;
                        case 4:
                            j5 = android.support.v4.media.session.a.K(parcel, readInt8);
                            break;
                        case 5:
                            j6 = android.support.v4.media.session.a.K(parcel, readInt8);
                            break;
                        case 6:
                            str14 = android.support.v4.media.session.a.r(parcel, readInt8);
                            break;
                        case 7:
                            str15 = android.support.v4.media.session.a.r(parcel, readInt8);
                            break;
                        case '\b':
                            i15 = android.support.v4.media.session.a.J(parcel, readInt8);
                            break;
                        case '\t':
                            i11 = android.support.v4.media.session.a.J(parcel, readInt8);
                            break;
                        default:
                            android.support.v4.media.session.a.R(parcel, readInt8);
                            break;
                    }
                }
                android.support.v4.media.session.a.v(parcel, V9);
                return new N0.f(i12, i13, i14, j5, j6, str14, str15, i15, i11);
            case 9:
                int V10 = android.support.v4.media.session.a.V(parcel);
                Account account = null;
                int i16 = 0;
                int i17 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < V10) {
                    int readInt9 = parcel.readInt();
                    char c9 = (char) readInt9;
                    if (c9 == 1) {
                        i16 = android.support.v4.media.session.a.J(parcel, readInt9);
                    } else if (c9 == 2) {
                        account = (Account) android.support.v4.media.session.a.q(parcel, readInt9, Account.CREATOR);
                    } else if (c9 == 3) {
                        i17 = android.support.v4.media.session.a.J(parcel, readInt9);
                    } else if (c9 != 4) {
                        android.support.v4.media.session.a.R(parcel, readInt9);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) android.support.v4.media.session.a.q(parcel, readInt9, GoogleSignInAccount.CREATOR);
                    }
                }
                android.support.v4.media.session.a.v(parcel, V10);
                return new m(i16, account, i17, googleSignInAccount);
            case 10:
                int V11 = android.support.v4.media.session.a.V(parcel);
                int i18 = 0;
                boolean z = false;
                boolean z2 = false;
                IBinder iBinder = null;
                K0.b bVar2 = null;
                while (parcel.dataPosition() < V11) {
                    int readInt10 = parcel.readInt();
                    char c10 = (char) readInt10;
                    if (c10 == 1) {
                        i18 = android.support.v4.media.session.a.J(parcel, readInt10);
                    } else if (c10 == 2) {
                        iBinder = android.support.v4.media.session.a.I(parcel, readInt10);
                    } else if (c10 == 3) {
                        bVar2 = (K0.b) android.support.v4.media.session.a.q(parcel, readInt10, K0.b.CREATOR);
                    } else if (c10 == 4) {
                        z = android.support.v4.media.session.a.H(parcel, readInt10);
                    } else if (c10 != 5) {
                        android.support.v4.media.session.a.R(parcel, readInt10);
                    } else {
                        z2 = android.support.v4.media.session.a.H(parcel, readInt10);
                    }
                }
                android.support.v4.media.session.a.v(parcel, V11);
                return new n(i18, iBinder, bVar2, z, z2);
            case 11:
                int V12 = android.support.v4.media.session.a.V(parcel);
                int i19 = 0;
                boolean z3 = false;
                boolean z4 = false;
                int i20 = 0;
                int i21 = 0;
                while (parcel.dataPosition() < V12) {
                    int readInt11 = parcel.readInt();
                    char c11 = (char) readInt11;
                    if (c11 == 1) {
                        i19 = android.support.v4.media.session.a.J(parcel, readInt11);
                    } else if (c11 == 2) {
                        z3 = android.support.v4.media.session.a.H(parcel, readInt11);
                    } else if (c11 == 3) {
                        z4 = android.support.v4.media.session.a.H(parcel, readInt11);
                    } else if (c11 == 4) {
                        i20 = android.support.v4.media.session.a.J(parcel, readInt11);
                    } else if (c11 != 5) {
                        android.support.v4.media.session.a.R(parcel, readInt11);
                    } else {
                        i21 = android.support.v4.media.session.a.J(parcel, readInt11);
                    }
                }
                android.support.v4.media.session.a.v(parcel, V12);
                return new N0.h(i19, z3, z4, i20, i21);
            case 12:
                int V13 = android.support.v4.media.session.a.V(parcel);
                int i22 = 0;
                Bundle bundle2 = null;
                K0.d[] dVarArr = null;
                C0064c c0064c = null;
                while (parcel.dataPosition() < V13) {
                    int readInt12 = parcel.readInt();
                    char c12 = (char) readInt12;
                    if (c12 == 1) {
                        int L = android.support.v4.media.session.a.L(parcel, readInt12);
                        int dataPosition = parcel.dataPosition();
                        if (L == 0) {
                            bundle2 = null;
                        } else {
                            Bundle readBundle = parcel.readBundle();
                            parcel.setDataPosition(dataPosition + L);
                            bundle2 = readBundle;
                        }
                    } else if (c12 == 2) {
                        dVarArr = (K0.d[]) android.support.v4.media.session.a.s(parcel, readInt12, K0.d.CREATOR);
                    } else if (c12 == 3) {
                        i22 = android.support.v4.media.session.a.J(parcel, readInt12);
                    } else if (c12 != 4) {
                        android.support.v4.media.session.a.R(parcel, readInt12);
                    } else {
                        c0064c = (C0064c) android.support.v4.media.session.a.q(parcel, readInt12, C0064c.CREATOR);
                    }
                }
                android.support.v4.media.session.a.v(parcel, V13);
                x xVar = new x();
                xVar.f1066a = bundle2;
                xVar.f1067b = dVarArr;
                xVar.f1068c = i22;
                xVar.f1069d = c0064c;
                return xVar;
            case 13:
                int V14 = android.support.v4.media.session.a.V(parcel);
                N0.h hVar = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z5 = false;
                boolean z6 = false;
                int i23 = 0;
                while (parcel.dataPosition() < V14) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 1:
                            hVar = (N0.h) android.support.v4.media.session.a.q(parcel, readInt13, N0.h.CREATOR);
                            break;
                        case 2:
                            z5 = android.support.v4.media.session.a.H(parcel, readInt13);
                            break;
                        case 3:
                            z6 = android.support.v4.media.session.a.H(parcel, readInt13);
                            break;
                        case 4:
                            int L2 = android.support.v4.media.session.a.L(parcel, readInt13);
                            int dataPosition2 = parcel.dataPosition();
                            if (L2 != 0) {
                                iArr = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition2 + L2);
                                break;
                            } else {
                                iArr = null;
                                break;
                            }
                        case 5:
                            i23 = android.support.v4.media.session.a.J(parcel, readInt13);
                            break;
                        case 6:
                            int L3 = android.support.v4.media.session.a.L(parcel, readInt13);
                            int dataPosition3 = parcel.dataPosition();
                            if (L3 != 0) {
                                iArr2 = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition3 + L3);
                                break;
                            } else {
                                iArr2 = null;
                                break;
                            }
                        default:
                            android.support.v4.media.session.a.R(parcel, readInt13);
                            break;
                    }
                }
                android.support.v4.media.session.a.v(parcel, V14);
                return new C0064c(hVar, z5, z6, iArr, i23, iArr2);
            case 14:
                int V15 = android.support.v4.media.session.a.V(parcel);
                Scope[] scopeArr = N0.d.o;
                Bundle bundle3 = new Bundle();
                K0.d[] dVarArr2 = N0.d.f1002p;
                K0.d[] dVarArr3 = dVarArr2;
                String str16 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String str17 = null;
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                boolean z7 = false;
                int i27 = 0;
                boolean z8 = false;
                while (parcel.dataPosition() < V15) {
                    int readInt14 = parcel.readInt();
                    switch ((char) readInt14) {
                        case 1:
                            i24 = android.support.v4.media.session.a.J(parcel, readInt14);
                            break;
                        case 2:
                            i25 = android.support.v4.media.session.a.J(parcel, readInt14);
                            break;
                        case 3:
                            i26 = android.support.v4.media.session.a.J(parcel, readInt14);
                            break;
                        case 4:
                            str16 = android.support.v4.media.session.a.r(parcel, readInt14);
                            break;
                        case 5:
                            iBinder2 = android.support.v4.media.session.a.I(parcel, readInt14);
                            break;
                        case 6:
                            scopeArr = (Scope[]) android.support.v4.media.session.a.s(parcel, readInt14, Scope.CREATOR);
                            break;
                        case 7:
                            int L4 = android.support.v4.media.session.a.L(parcel, readInt14);
                            int dataPosition4 = parcel.dataPosition();
                            if (L4 != 0) {
                                Bundle readBundle2 = parcel.readBundle();
                                parcel.setDataPosition(dataPosition4 + L4);
                                bundle3 = readBundle2;
                                break;
                            } else {
                                bundle3 = null;
                                break;
                            }
                        case '\b':
                            account2 = (Account) android.support.v4.media.session.a.q(parcel, readInt14, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            android.support.v4.media.session.a.R(parcel, readInt14);
                            break;
                        case '\n':
                            dVarArr2 = (K0.d[]) android.support.v4.media.session.a.s(parcel, readInt14, K0.d.CREATOR);
                            break;
                        case 11:
                            dVarArr3 = (K0.d[]) android.support.v4.media.session.a.s(parcel, readInt14, K0.d.CREATOR);
                            break;
                        case '\f':
                            z7 = android.support.v4.media.session.a.H(parcel, readInt14);
                            break;
                        case '\r':
                            i27 = android.support.v4.media.session.a.J(parcel, readInt14);
                            break;
                        case 14:
                            z8 = android.support.v4.media.session.a.H(parcel, readInt14);
                            break;
                        case 15:
                            str17 = android.support.v4.media.session.a.r(parcel, readInt14);
                            break;
                    }
                }
                android.support.v4.media.session.a.v(parcel, V15);
                return new N0.d(i24, i25, i26, str16, iBinder2, scopeArr, bundle3, account2, dVarArr2, dVarArr3, z7, i27, z8, str17);
            case 15:
                C0078n c0078n = new C0078n();
                c0078n.f1443a = parcel.readInt();
                c0078n.f1444b = parcel.readInt();
                c0078n.f1445c = parcel.readInt() == 1;
                return c0078n;
            case 16:
                J j7 = new J();
                j7.f1365a = parcel.readInt();
                j7.f1366b = parcel.readInt();
                j7.f1368d = parcel.readInt() == 1;
                int readInt15 = parcel.readInt();
                if (readInt15 > 0) {
                    int[] iArr3 = new int[readInt15];
                    j7.f1367c = iArr3;
                    parcel.readIntArray(iArr3);
                }
                return j7;
            case 17:
                K k3 = new K();
                k3.f1369a = parcel.readInt();
                k3.f1370b = parcel.readInt();
                int readInt16 = parcel.readInt();
                k3.f1371c = readInt16;
                if (readInt16 > 0) {
                    int[] iArr4 = new int[readInt16];
                    k3.f1372d = iArr4;
                    parcel.readIntArray(iArr4);
                }
                int readInt17 = parcel.readInt();
                k3.f1373e = readInt17;
                if (readInt17 > 0) {
                    int[] iArr5 = new int[readInt17];
                    k3.f = iArr5;
                    parcel.readIntArray(iArr5);
                }
                k3.f1375h = parcel.readInt() == 1;
                k3.f1376i = parcel.readInt() == 1;
                k3.f1377j = parcel.readInt() == 1;
                k3.f1374g = parcel.readArrayList(J.class.getClassLoader());
                return k3;
            case 18:
                return new ParcelImpl(parcel);
            case C0642l9.f7777C /* 19 */:
                int V16 = android.support.v4.media.session.a.V(parcel);
                int i28 = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
                long j8 = 0;
                a1.c[] cVarArr = null;
                int i29 = 1;
                int i30 = 1;
                while (parcel.dataPosition() < V16) {
                    int readInt18 = parcel.readInt();
                    char c13 = (char) readInt18;
                    if (c13 == 1) {
                        i29 = android.support.v4.media.session.a.J(parcel, readInt18);
                    } else if (c13 == 2) {
                        i30 = android.support.v4.media.session.a.J(parcel, readInt18);
                    } else if (c13 == 3) {
                        j8 = android.support.v4.media.session.a.K(parcel, readInt18);
                    } else if (c13 == 4) {
                        i28 = android.support.v4.media.session.a.J(parcel, readInt18);
                    } else if (c13 != 5) {
                        android.support.v4.media.session.a.R(parcel, readInt18);
                    } else {
                        cVarArr = (a1.c[]) android.support.v4.media.session.a.s(parcel, readInt18, a1.c.CREATOR);
                    }
                }
                android.support.v4.media.session.a.v(parcel, V16);
                LocationAvailability locationAvailability = new LocationAvailability();
                locationAvailability.f2970d = i28;
                locationAvailability.f2967a = i29;
                locationAvailability.f2968b = i30;
                locationAvailability.f2969c = j8;
                locationAvailability.f2971e = cVarArr;
                return locationAvailability;
            case C0642l9.f7778D /* 20 */:
                int V17 = android.support.v4.media.session.a.V(parcel);
                int i31 = 102;
                long j9 = 3600000;
                long j10 = 600000;
                boolean z9 = false;
                long j11 = 0;
                float f = 0.0f;
                int i32 = Integer.MAX_VALUE;
                long j12 = Long.MAX_VALUE;
                boolean z10 = false;
                while (parcel.dataPosition() < V17) {
                    int readInt19 = parcel.readInt();
                    boolean z11 = z10;
                    switch ((char) readInt19) {
                        case 1:
                            i31 = android.support.v4.media.session.a.J(parcel, readInt19);
                            break;
                        case 2:
                            j9 = android.support.v4.media.session.a.K(parcel, readInt19);
                            break;
                        case 3:
                            j10 = android.support.v4.media.session.a.K(parcel, readInt19);
                            break;
                        case 4:
                            z9 = android.support.v4.media.session.a.H(parcel, readInt19);
                            break;
                        case 5:
                            j12 = android.support.v4.media.session.a.K(parcel, readInt19);
                            break;
                        case 6:
                            i32 = android.support.v4.media.session.a.J(parcel, readInt19);
                            break;
                        case 7:
                            android.support.v4.media.session.a.Y(parcel, readInt19, 4);
                            f = parcel.readFloat();
                            break;
                        case '\b':
                            j11 = android.support.v4.media.session.a.K(parcel, readInt19);
                            break;
                        case '\t':
                            z10 = android.support.v4.media.session.a.H(parcel, readInt19);
                            continue;
                        default:
                            android.support.v4.media.session.a.R(parcel, readInt19);
                            break;
                    }
                    z10 = z11;
                }
                android.support.v4.media.session.a.v(parcel, V17);
                LocationRequest locationRequest = new LocationRequest();
                locationRequest.f2972a = i31;
                locationRequest.f2973b = j9;
                locationRequest.f2974c = j10;
                locationRequest.f2975d = z9;
                locationRequest.f2976e = j12;
                locationRequest.f = i32;
                locationRequest.f2977g = f;
                locationRequest.f2978h = j11;
                locationRequest.f2979i = z10;
                return locationRequest;
            case C0642l9.f7779E /* 21 */:
                int V18 = android.support.v4.media.session.a.V(parcel);
                List list = LocationResult.f2980b;
                while (parcel.dataPosition() < V18) {
                    int readInt20 = parcel.readInt();
                    if (((char) readInt20) != 1) {
                        android.support.v4.media.session.a.R(parcel, readInt20);
                    } else {
                        list = android.support.v4.media.session.a.t(parcel, readInt20, Location.CREATOR);
                    }
                }
                android.support.v4.media.session.a.v(parcel, V18);
                return new LocationResult(list);
            case 22:
                int V19 = android.support.v4.media.session.a.V(parcel);
                int i33 = 1;
                int i34 = 1;
                long j13 = -1;
                long j14 = -1;
                while (parcel.dataPosition() < V19) {
                    int readInt21 = parcel.readInt();
                    char c14 = (char) readInt21;
                    if (c14 == 1) {
                        i33 = android.support.v4.media.session.a.J(parcel, readInt21);
                    } else if (c14 == 2) {
                        i34 = android.support.v4.media.session.a.J(parcel, readInt21);
                    } else if (c14 == 3) {
                        j13 = android.support.v4.media.session.a.K(parcel, readInt21);
                    } else if (c14 != 4) {
                        android.support.v4.media.session.a.R(parcel, readInt21);
                    } else {
                        j14 = android.support.v4.media.session.a.K(parcel, readInt21);
                    }
                }
                android.support.v4.media.session.a.v(parcel, V19);
                return new a1.c(i33, i34, j13, j14);
            case 23:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new h(23);

                    /* renamed from: a, reason: collision with root package name */
                    public final int f1928a;

                    /* renamed from: b, reason: collision with root package name */
                    public final MediaDescriptionCompat f1929b;

                    {
                        this.f1928a = parcel.readInt();
                        this.f1929b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.f1928a + ", mDescription=" + this.f1929b + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i35) {
                        parcel2.writeInt(this.f1928a);
                        this.f1929b.writeToParcel(parcel2, i35);
                    }
                };
            case 24:
                Object createFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (createFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) createFromParcel;
                String mediaId = mediaDescription.getMediaId();
                CharSequence title = mediaDescription.getTitle();
                CharSequence subtitle = mediaDescription.getSubtitle();
                CharSequence description = mediaDescription.getDescription();
                Bitmap iconBitmap = mediaDescription.getIconBitmap();
                Uri iconUri = mediaDescription.getIconUri();
                Bundle extras = mediaDescription.getExtras();
                if (extras != null) {
                    extras.setClassLoader(android.support.v4.media.session.a.class.getClassLoader());
                    uri = (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
                } else {
                    uri = null;
                }
                if (uri != null) {
                    if (extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && extras.size() == 2) {
                        bundle = null;
                        if (uri == null) {
                            uri = mediaDescription.getMediaUri();
                        }
                        MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, uri);
                        mediaDescriptionCompat.f1937i = createFromParcel;
                        return mediaDescriptionCompat;
                    }
                    extras.remove("android.support.v4.media.description.MEDIA_URI");
                    extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                }
                bundle = extras;
                if (uri == null) {
                }
                MediaDescriptionCompat mediaDescriptionCompat2 = new MediaDescriptionCompat(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, uri);
                mediaDescriptionCompat2.f1937i = createFromParcel;
                return mediaDescriptionCompat2;
            case C0642l9.f7780F /* 25 */:
                return new MediaMetadataCompat(parcel);
            case C0642l9.f7781G /* 26 */:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case C0642l9.f7782H /* 27 */:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$QueueItem
                    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new h(27);

                    /* renamed from: a, reason: collision with root package name */
                    public final MediaDescriptionCompat f1941a;

                    /* renamed from: b, reason: collision with root package name */
                    public final long f1942b;

                    {
                        this.f1941a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        this.f1942b = parcel.readLong();
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaSession.QueueItem {Description=" + this.f1941a + ", Id=" + this.f1942b + " }";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i35) {
                        this.f1941a.writeToParcel(parcel2, i35);
                        parcel2.writeLong(this.f1942b);
                    }
                };
            case 28:
                MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = new MediaSessionCompat$ResultReceiverWrapper();
                mediaSessionCompat$ResultReceiverWrapper.f1943a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return mediaSessionCompat$ResultReceiverWrapper;
            default:
                final Parcelable readParcelable = parcel.readParcelable(null);
                return new Parcelable(readParcelable) { // from class: android.support.v4.media.session.MediaSessionCompat$Token
                    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new h(29);

                    /* renamed from: a, reason: collision with root package name */
                    public final Parcelable f1944a;

                    {
                        this.f1944a = readParcelable;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof MediaSessionCompat$Token)) {
                            return false;
                        }
                        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
                        Parcelable parcelable = this.f1944a;
                        if (parcelable == null) {
                            return mediaSessionCompat$Token.f1944a == null;
                        }
                        Parcelable parcelable2 = mediaSessionCompat$Token.f1944a;
                        if (parcelable2 == null) {
                            return false;
                        }
                        return parcelable.equals(parcelable2);
                    }

                    public final int hashCode() {
                        Parcelable parcelable = this.f1944a;
                        if (parcelable == null) {
                            return 0;
                        }
                        return parcelable.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i35) {
                        parcel2.writeParcelable(this.f1944a, i35);
                    }
                };
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f590a) {
            case 0:
                return new i[i3];
            case 1:
                return new H0.b[i3];
            case 2:
                return new GoogleSignInAccount[i3];
            case 3:
                return new K0.b[i3];
            case 4:
                return new K0.d[i3];
            case 5:
                return new Scope[i3];
            case 6:
                return new Status[i3];
            case 7:
                return new N0.i[i3];
            case 8:
                return new N0.f[i3];
            case 9:
                return new m[i3];
            case 10:
                return new n[i3];
            case 11:
                return new N0.h[i3];
            case 12:
                return new x[i3];
            case 13:
                return new C0064c[i3];
            case 14:
                return new N0.d[i3];
            case 15:
                return new C0078n[i3];
            case 16:
                return new J[i3];
            case 17:
                return new K[i3];
            case 18:
                return new ParcelImpl[i3];
            case C0642l9.f7777C /* 19 */:
                return new LocationAvailability[i3];
            case C0642l9.f7778D /* 20 */:
                return new LocationRequest[i3];
            case C0642l9.f7779E /* 21 */:
                return new LocationResult[i3];
            case 22:
                return new a1.c[i3];
            case 23:
                return new MediaBrowserCompat$MediaItem[i3];
            case 24:
                return new MediaDescriptionCompat[i3];
            case C0642l9.f7780F /* 25 */:
                return new MediaMetadataCompat[i3];
            case C0642l9.f7781G /* 26 */:
                return new RatingCompat[i3];
            case C0642l9.f7782H /* 27 */:
                return new MediaSessionCompat$QueueItem[i3];
            case 28:
                return new MediaSessionCompat$ResultReceiverWrapper[i3];
            default:
                return new MediaSessionCompat$Token[i3];
        }
    }
}
