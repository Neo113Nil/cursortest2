package d4;

import a8.m;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import e.f;
import j3.i;
import java.util.ArrayList;
import m4.e;
import m4.g;
import m4.h;
import m4.u;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2593a;

    public /* synthetic */ a(int i7) {
        this.f2593a = i7;
    }

    public static void a(m4.c cVar, Parcel parcel, int i7) {
        int R = m.R(parcel, 20293);
        int i8 = cVar.f6341f;
        m.T(parcel, 1, 4);
        parcel.writeInt(i8);
        int i9 = cVar.f6342g;
        m.T(parcel, 2, 4);
        parcel.writeInt(i9);
        int i10 = cVar.f6343h;
        m.T(parcel, 3, 4);
        parcel.writeInt(i10);
        m.P(parcel, 4, cVar.f6344i);
        IBinder iBinder = cVar.f6345j;
        if (iBinder != null) {
            int R2 = m.R(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            m.S(parcel, R2);
        }
        m.Q(parcel, 6, cVar.f6346k, i7);
        Bundle bundle = cVar.f6347l;
        if (bundle != null) {
            int R3 = m.R(parcel, 7);
            parcel.writeBundle(bundle);
            m.S(parcel, R3);
        }
        m.O(parcel, 8, cVar.f6348m, i7);
        m.Q(parcel, 10, cVar.f6349n, i7);
        m.Q(parcel, 11, cVar.f6350o, i7);
        boolean z8 = cVar.f6351p;
        m.T(parcel, 12, 4);
        parcel.writeInt(z8 ? 1 : 0);
        int i11 = cVar.f6352q;
        m.T(parcel, 13, 4);
        parcel.writeInt(i11);
        boolean z9 = cVar.f6353r;
        m.T(parcel, 14, 4);
        parcel.writeInt(z9 ? 1 : 0);
        m.P(parcel, 15, cVar.f6354s);
        m.S(parcel, R);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2593a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new ParcelImpl(parcel);
            case 1:
                k.f(parcel, "parcel");
                return new e.a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 2:
                k.f(parcel, "inParcel");
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                k.c(readParcelable);
                return new f((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 3:
                int e02 = a8.d.e0(parcel);
                PendingIntent pendingIntent = null;
                int i7 = 0;
                int i8 = 0;
                String str = null;
                while (parcel.dataPosition() < e02) {
                    int readInt = parcel.readInt();
                    char c4 = (char) readInt;
                    if (c4 == 1) {
                        i7 = a8.d.U(parcel, readInt);
                    } else if (c4 == 2) {
                        i8 = a8.d.U(parcel, readInt);
                    } else if (c4 == 3) {
                        pendingIntent = (PendingIntent) a8.d.x(parcel, readInt, PendingIntent.CREATOR);
                    } else if (c4 != 4) {
                        a8.d.a0(parcel, readInt);
                    } else {
                        str = a8.d.y(parcel, readInt);
                    }
                }
                a8.d.D(parcel, e02);
                return new j4.b(i7, i8, pendingIntent, str);
            case 4:
                int e03 = a8.d.e0(parcel);
                long j8 = -1;
                int i9 = 0;
                String str2 = null;
                while (parcel.dataPosition() < e03) {
                    int readInt2 = parcel.readInt();
                    char c6 = (char) readInt2;
                    if (c6 == 1) {
                        str2 = a8.d.y(parcel, readInt2);
                    } else if (c6 == 2) {
                        i9 = a8.d.U(parcel, readInt2);
                    } else if (c6 != 3) {
                        a8.d.a0(parcel, readInt2);
                    } else {
                        a8.d.g0(parcel, readInt2, 8);
                        j8 = parcel.readLong();
                    }
                }
                a8.d.D(parcel, e03);
                return new j4.d(i9, j8, str2);
            case 5:
                int e04 = a8.d.e0(parcel);
                String str3 = null;
                int i10 = 0;
                while (parcel.dataPosition() < e04) {
                    int readInt3 = parcel.readInt();
                    char c9 = (char) readInt3;
                    if (c9 == 1) {
                        i10 = a8.d.U(parcel, readInt3);
                    } else if (c9 != 2) {
                        a8.d.a0(parcel, readInt3);
                    } else {
                        str3 = a8.d.y(parcel, readInt3);
                    }
                }
                a8.d.D(parcel, e04);
                return new Scope(str3, i10);
            case 6:
                int e05 = a8.d.e0(parcel);
                String str4 = null;
                j4.b bVar = null;
                int i11 = 0;
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < e05) {
                    int readInt4 = parcel.readInt();
                    char c10 = (char) readInt4;
                    if (c10 == 1) {
                        i11 = a8.d.U(parcel, readInt4);
                    } else if (c10 == 2) {
                        str4 = a8.d.y(parcel, readInt4);
                    } else if (c10 == 3) {
                        pendingIntent2 = (PendingIntent) a8.d.x(parcel, readInt4, PendingIntent.CREATOR);
                    } else if (c10 != 4) {
                        a8.d.a0(parcel, readInt4);
                    } else {
                        bVar = (j4.b) a8.d.x(parcel, readInt4, j4.b.CREATOR);
                    }
                }
                a8.d.D(parcel, e05);
                return new Status(i11, str4, pendingIntent2, bVar);
            case i.DOUBLE_FIELD_NUMBER /* 7 */:
                int e06 = a8.d.e0(parcel);
                int i12 = 0;
                while (true) {
                    ArrayList arrayList = null;
                    while (parcel.dataPosition() < e06) {
                        int readInt5 = parcel.readInt();
                        char c11 = (char) readInt5;
                        if (c11 == 1) {
                            i12 = a8.d.U(parcel, readInt5);
                        } else if (c11 != 2) {
                            a8.d.a0(parcel, readInt5);
                        } else {
                            Parcelable.Creator<e> creator = e.CREATOR;
                            int V = a8.d.V(parcel, readInt5);
                            int dataPosition = parcel.dataPosition();
                            if (V == 0) {
                                break;
                            }
                            arrayList = parcel.createTypedArrayList(creator);
                            parcel.setDataPosition(dataPosition + V);
                        }
                    }
                    a8.d.D(parcel, e06);
                    return new h(i12, arrayList);
                    break;
                }
            case 8:
                int e07 = a8.d.e0(parcel);
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                long j9 = 0;
                long j10 = 0;
                String str5 = null;
                String str6 = null;
                int i17 = -1;
                while (parcel.dataPosition() < e07) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            i13 = a8.d.U(parcel, readInt6);
                            break;
                        case 2:
                            i14 = a8.d.U(parcel, readInt6);
                            break;
                        case 3:
                            i15 = a8.d.U(parcel, readInt6);
                            break;
                        case 4:
                            a8.d.g0(parcel, readInt6, 8);
                            j9 = parcel.readLong();
                            break;
                        case 5:
                            a8.d.g0(parcel, readInt6, 8);
                            j10 = parcel.readLong();
                            break;
                        case 6:
                            str5 = a8.d.y(parcel, readInt6);
                            break;
                        case i.DOUBLE_FIELD_NUMBER /* 7 */:
                            str6 = a8.d.y(parcel, readInt6);
                            break;
                        case '\b':
                            i16 = a8.d.U(parcel, readInt6);
                            break;
                        case q.c.f7259c /* 9 */:
                            i17 = a8.d.U(parcel, readInt6);
                            break;
                        default:
                            a8.d.a0(parcel, readInt6);
                            break;
                    }
                }
                a8.d.D(parcel, e07);
                return new e(i13, i14, i15, j9, j10, str5, str6, i16, i17);
            case q.c.f7259c /* 9 */:
                int e08 = a8.d.e0(parcel);
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                boolean z8 = false;
                boolean z9 = false;
                while (parcel.dataPosition() < e08) {
                    int readInt7 = parcel.readInt();
                    char c12 = (char) readInt7;
                    if (c12 == 1) {
                        i18 = a8.d.U(parcel, readInt7);
                    } else if (c12 == 2) {
                        z8 = a8.d.T(parcel, readInt7);
                    } else if (c12 == 3) {
                        z9 = a8.d.T(parcel, readInt7);
                    } else if (c12 == 4) {
                        i19 = a8.d.U(parcel, readInt7);
                    } else if (c12 != 5) {
                        a8.d.a0(parcel, readInt7);
                    } else {
                        i20 = a8.d.U(parcel, readInt7);
                    }
                }
                a8.d.D(parcel, e08);
                return new g(i18, i19, i20, z8, z9);
            case q.c.f7261e /* 10 */:
                int e09 = a8.d.e0(parcel);
                int i21 = 0;
                Bundle bundle = null;
                j4.d[] dVarArr = null;
                m4.b bVar2 = null;
                while (parcel.dataPosition() < e09) {
                    int readInt8 = parcel.readInt();
                    char c13 = (char) readInt8;
                    if (c13 == 1) {
                        int V2 = a8.d.V(parcel, readInt8);
                        int dataPosition2 = parcel.dataPosition();
                        if (V2 == 0) {
                            bundle = null;
                        } else {
                            Bundle readBundle = parcel.readBundle();
                            parcel.setDataPosition(dataPosition2 + V2);
                            bundle = readBundle;
                        }
                    } else if (c13 == 2) {
                        dVarArr = (j4.d[]) a8.d.z(parcel, readInt8, j4.d.CREATOR);
                    } else if (c13 == 3) {
                        i21 = a8.d.U(parcel, readInt8);
                    } else if (c13 != 4) {
                        a8.d.a0(parcel, readInt8);
                    } else {
                        bVar2 = (m4.b) a8.d.x(parcel, readInt8, m4.b.CREATOR);
                    }
                }
                a8.d.D(parcel, e09);
                u uVar = new u();
                uVar.f6397f = bundle;
                uVar.f6398g = dVarArr;
                uVar.f6399h = i21;
                uVar.f6400i = bVar2;
                return uVar;
            case 11:
                int e010 = a8.d.e0(parcel);
                g gVar = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z10 = false;
                boolean z11 = false;
                int i22 = 0;
                while (parcel.dataPosition() < e010) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 1:
                            gVar = (g) a8.d.x(parcel, readInt9, g.CREATOR);
                            break;
                        case 2:
                            z10 = a8.d.T(parcel, readInt9);
                            break;
                        case 3:
                            z11 = a8.d.T(parcel, readInt9);
                            break;
                        case 4:
                            int V3 = a8.d.V(parcel, readInt9);
                            int dataPosition3 = parcel.dataPosition();
                            if (V3 != 0) {
                                iArr = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition3 + V3);
                                break;
                            } else {
                                iArr = null;
                                break;
                            }
                        case 5:
                            i22 = a8.d.U(parcel, readInt9);
                            break;
                        case 6:
                            int V4 = a8.d.V(parcel, readInt9);
                            int dataPosition4 = parcel.dataPosition();
                            if (V4 != 0) {
                                iArr2 = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition4 + V4);
                                break;
                            } else {
                                iArr2 = null;
                                break;
                            }
                        default:
                            a8.d.a0(parcel, readInt9);
                            break;
                    }
                }
                a8.d.D(parcel, e010);
                return new m4.b(gVar, z10, z11, iArr, i22, iArr2);
            case 12:
                int e011 = a8.d.e0(parcel);
                Bundle bundle2 = new Bundle();
                Scope[] scopeArr = m4.c.f6339t;
                String str7 = null;
                IBinder iBinder = null;
                Account account = null;
                String str8 = null;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                boolean z12 = false;
                int i26 = 0;
                boolean z13 = false;
                j4.d[] dVarArr2 = m4.c.f6340u;
                j4.d[] dVarArr3 = dVarArr2;
                while (parcel.dataPosition() < e011) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 1:
                            i23 = a8.d.U(parcel, readInt10);
                            break;
                        case 2:
                            i24 = a8.d.U(parcel, readInt10);
                            break;
                        case 3:
                            i25 = a8.d.U(parcel, readInt10);
                            break;
                        case 4:
                            str7 = a8.d.y(parcel, readInt10);
                            break;
                        case 5:
                            int V5 = a8.d.V(parcel, readInt10);
                            int dataPosition5 = parcel.dataPosition();
                            if (V5 != 0) {
                                IBinder readStrongBinder = parcel.readStrongBinder();
                                parcel.setDataPosition(dataPosition5 + V5);
                                iBinder = readStrongBinder;
                                break;
                            } else {
                                iBinder = null;
                                break;
                            }
                        case 6:
                            scopeArr = (Scope[]) a8.d.z(parcel, readInt10, Scope.CREATOR);
                            break;
                        case i.DOUBLE_FIELD_NUMBER /* 7 */:
                            int V6 = a8.d.V(parcel, readInt10);
                            int dataPosition6 = parcel.dataPosition();
                            if (V6 != 0) {
                                Bundle readBundle2 = parcel.readBundle();
                                parcel.setDataPosition(dataPosition6 + V6);
                                bundle2 = readBundle2;
                                break;
                            } else {
                                bundle2 = null;
                                break;
                            }
                        case '\b':
                            account = (Account) a8.d.x(parcel, readInt10, Account.CREATOR);
                            break;
                        case q.c.f7259c /* 9 */:
                        default:
                            a8.d.a0(parcel, readInt10);
                            break;
                        case q.c.f7261e /* 10 */:
                            dVarArr2 = (j4.d[]) a8.d.z(parcel, readInt10, j4.d.CREATOR);
                            break;
                        case 11:
                            dVarArr3 = (j4.d[]) a8.d.z(parcel, readInt10, j4.d.CREATOR);
                            break;
                        case '\f':
                            z12 = a8.d.T(parcel, readInt10);
                            break;
                        case '\r':
                            i26 = a8.d.U(parcel, readInt10);
                            break;
                        case 14:
                            z13 = a8.d.T(parcel, readInt10);
                            break;
                        case q.c.f7263g /* 15 */:
                            str8 = a8.d.y(parcel, readInt10);
                            break;
                    }
                }
                a8.d.D(parcel, e011);
                return new m4.c(i23, i24, i25, str7, iBinder, scopeArr, bundle2, account, dVarArr2, dVarArr3, z12, i26, z13, str8);
            default:
                k.f(parcel, "inParcel");
                return new t3.i(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f2593a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new ParcelImpl[i7];
            case 1:
                return new e.a[i7];
            case 2:
                return new f[i7];
            case 3:
                return new j4.b[i7];
            case 4:
                return new j4.d[i7];
            case 5:
                return new Scope[i7];
            case 6:
                return new Status[i7];
            case i.DOUBLE_FIELD_NUMBER /* 7 */:
                return new h[i7];
            case 8:
                return new e[i7];
            case q.c.f7259c /* 9 */:
                return new g[i7];
            case q.c.f7261e /* 10 */:
                return new u[i7];
            case 11:
                return new m4.b[i7];
            case 12:
                return new m4.c[i7];
            default:
                return new t3.i[i7];
        }
    }
}
