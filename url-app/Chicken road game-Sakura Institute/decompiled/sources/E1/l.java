package E1;

import H1.u;
import a.AbstractC0345a;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import e.C0550a;
import e.C0555f;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import q.AbstractC1024c;
import s1.C1194j;

/* loaded from: classes.dex */
public final class l implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2299a;

    public /* synthetic */ l(int i2) {
        this.f2299a = i2;
    }

    public static void a(H1.c cVar, Parcel parcel, int i2) {
        int N3 = AbstractC0345a.N(parcel, 20293);
        int i4 = cVar.f3239d;
        AbstractC0345a.P(parcel, 1, 4);
        parcel.writeInt(i4);
        AbstractC0345a.P(parcel, 2, 4);
        parcel.writeInt(cVar.f3240e);
        AbstractC0345a.P(parcel, 3, 4);
        parcel.writeInt(cVar.f3241i);
        AbstractC0345a.L(parcel, 4, cVar.f3242j);
        IBinder iBinder = cVar.f3243k;
        if (iBinder != null) {
            int N4 = AbstractC0345a.N(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            AbstractC0345a.O(parcel, N4);
        }
        AbstractC0345a.M(parcel, 6, cVar.f3244l, i2);
        Bundle bundle = cVar.f3245m;
        if (bundle != null) {
            int N5 = AbstractC0345a.N(parcel, 7);
            parcel.writeBundle(bundle);
            AbstractC0345a.O(parcel, N5);
        }
        AbstractC0345a.K(parcel, 8, cVar.f3246n, i2);
        AbstractC0345a.M(parcel, 10, cVar.f3247o, i2);
        AbstractC0345a.M(parcel, 11, cVar.f3248p, i2);
        AbstractC0345a.P(parcel, 12, 4);
        parcel.writeInt(cVar.f3249q ? 1 : 0);
        AbstractC0345a.P(parcel, 13, 4);
        parcel.writeInt(cVar.f3250r);
        boolean z4 = cVar.f3251s;
        AbstractC0345a.P(parcel, 14, 4);
        parcel.writeInt(z4 ? 1 : 0);
        AbstractC0345a.L(parcel, 15, cVar.f3252t);
        AbstractC0345a.O(parcel, N3);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2299a) {
            case 0:
                int X3 = M1.a.X(parcel);
                PendingIntent pendingIntent = null;
                int i2 = 0;
                int i4 = 0;
                String str = null;
                while (parcel.dataPosition() < X3) {
                    int readInt = parcel.readInt();
                    char c4 = (char) readInt;
                    if (c4 == 1) {
                        i2 = M1.a.O(parcel, readInt);
                    } else if (c4 == 2) {
                        i4 = M1.a.O(parcel, readInt);
                    } else if (c4 == 3) {
                        pendingIntent = (PendingIntent) M1.a.u(parcel, readInt, PendingIntent.CREATOR);
                    } else if (c4 != 4) {
                        M1.a.U(parcel, readInt);
                    } else {
                        str = M1.a.v(parcel, readInt);
                    }
                }
                M1.a.y(parcel, X3);
                return new b(i2, i4, pendingIntent, str);
            case 1:
                int X4 = M1.a.X(parcel);
                long j4 = -1;
                int i5 = 0;
                String str2 = null;
                while (parcel.dataPosition() < X4) {
                    int readInt2 = parcel.readInt();
                    char c5 = (char) readInt2;
                    if (c5 == 1) {
                        str2 = M1.a.v(parcel, readInt2);
                    } else if (c5 == 2) {
                        i5 = M1.a.O(parcel, readInt2);
                    } else if (c5 != 3) {
                        M1.a.U(parcel, readInt2);
                    } else {
                        M1.a.Z(parcel, readInt2, 8);
                        j4 = parcel.readLong();
                    }
                }
                M1.a.y(parcel, X4);
                return new d(i5, j4, str2);
            case 2:
                int X5 = M1.a.X(parcel);
                String str3 = null;
                int i6 = 0;
                while (parcel.dataPosition() < X5) {
                    int readInt3 = parcel.readInt();
                    char c6 = (char) readInt3;
                    if (c6 == 1) {
                        i6 = M1.a.O(parcel, readInt3);
                    } else if (c6 != 2) {
                        M1.a.U(parcel, readInt3);
                    } else {
                        str3 = M1.a.v(parcel, readInt3);
                    }
                }
                M1.a.y(parcel, X5);
                return new Scope(i6, str3);
            case 3:
                int X6 = M1.a.X(parcel);
                String str4 = null;
                b bVar = null;
                int i7 = 0;
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < X6) {
                    int readInt4 = parcel.readInt();
                    char c7 = (char) readInt4;
                    if (c7 == 1) {
                        i7 = M1.a.O(parcel, readInt4);
                    } else if (c7 == 2) {
                        str4 = M1.a.v(parcel, readInt4);
                    } else if (c7 == 3) {
                        pendingIntent2 = (PendingIntent) M1.a.u(parcel, readInt4, PendingIntent.CREATOR);
                    } else if (c7 != 4) {
                        M1.a.U(parcel, readInt4);
                    } else {
                        bVar = (b) M1.a.u(parcel, readInt4, b.CREATOR);
                    }
                }
                M1.a.y(parcel, X6);
                return new Status(i7, str4, pendingIntent2, bVar);
            case 4:
                int X7 = M1.a.X(parcel);
                int i8 = 0;
                while (true) {
                    ArrayList arrayList = null;
                    while (parcel.dataPosition() < X7) {
                        int readInt5 = parcel.readInt();
                        char c8 = (char) readInt5;
                        if (c8 == 1) {
                            i8 = M1.a.O(parcel, readInt5);
                        } else if (c8 != 2) {
                            M1.a.U(parcel, readInt5);
                        } else {
                            Parcelable.Creator<H1.e> creator = H1.e.CREATOR;
                            int P3 = M1.a.P(parcel, readInt5);
                            int dataPosition = parcel.dataPosition();
                            if (P3 == 0) {
                                break;
                            }
                            arrayList = parcel.createTypedArrayList(creator);
                            parcel.setDataPosition(dataPosition + P3);
                        }
                    }
                    M1.a.y(parcel, X7);
                    return new H1.h(i8, arrayList);
                    break;
                }
            case 5:
                int X8 = M1.a.X(parcel);
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                long j5 = 0;
                long j6 = 0;
                String str5 = null;
                String str6 = null;
                int i13 = -1;
                while (parcel.dataPosition() < X8) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            i9 = M1.a.O(parcel, readInt6);
                            break;
                        case 2:
                            i10 = M1.a.O(parcel, readInt6);
                            break;
                        case 3:
                            i11 = M1.a.O(parcel, readInt6);
                            break;
                        case 4:
                            M1.a.Z(parcel, readInt6, 8);
                            j5 = parcel.readLong();
                            break;
                        case 5:
                            M1.a.Z(parcel, readInt6, 8);
                            j6 = parcel.readLong();
                            break;
                        case 6:
                            str5 = M1.a.v(parcel, readInt6);
                            break;
                        case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                            str6 = M1.a.v(parcel, readInt6);
                            break;
                        case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                            i12 = M1.a.O(parcel, readInt6);
                            break;
                        case AbstractC1024c.f9242c /* 9 */:
                            i13 = M1.a.O(parcel, readInt6);
                            break;
                        default:
                            M1.a.U(parcel, readInt6);
                            break;
                    }
                }
                M1.a.y(parcel, X8);
                return new H1.e(i9, i10, i11, j5, j6, str5, str6, i12, i13);
            case 6:
                int X9 = M1.a.X(parcel);
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                boolean z4 = false;
                boolean z5 = false;
                while (parcel.dataPosition() < X9) {
                    int readInt7 = parcel.readInt();
                    char c9 = (char) readInt7;
                    if (c9 == 1) {
                        i14 = M1.a.O(parcel, readInt7);
                    } else if (c9 == 2) {
                        z4 = M1.a.N(parcel, readInt7);
                    } else if (c9 == 3) {
                        z5 = M1.a.N(parcel, readInt7);
                    } else if (c9 == 4) {
                        i15 = M1.a.O(parcel, readInt7);
                    } else if (c9 != 5) {
                        M1.a.U(parcel, readInt7);
                    } else {
                        i16 = M1.a.O(parcel, readInt7);
                    }
                }
                M1.a.y(parcel, X9);
                return new H1.g(i14, i15, i16, z4, z5);
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                int X10 = M1.a.X(parcel);
                int i17 = 0;
                Bundle bundle = null;
                d[] dVarArr = null;
                H1.b bVar2 = null;
                while (parcel.dataPosition() < X10) {
                    int readInt8 = parcel.readInt();
                    char c10 = (char) readInt8;
                    if (c10 == 1) {
                        int P4 = M1.a.P(parcel, readInt8);
                        int dataPosition2 = parcel.dataPosition();
                        if (P4 == 0) {
                            bundle = null;
                        } else {
                            Bundle readBundle = parcel.readBundle();
                            parcel.setDataPosition(dataPosition2 + P4);
                            bundle = readBundle;
                        }
                    } else if (c10 == 2) {
                        dVarArr = (d[]) M1.a.w(parcel, readInt8, d.CREATOR);
                    } else if (c10 == 3) {
                        i17 = M1.a.O(parcel, readInt8);
                    } else if (c10 != 4) {
                        M1.a.U(parcel, readInt8);
                    } else {
                        bVar2 = (H1.b) M1.a.u(parcel, readInt8, H1.b.CREATOR);
                    }
                }
                M1.a.y(parcel, X10);
                u uVar = new u();
                uVar.f3295d = bundle;
                uVar.f3296e = dVarArr;
                uVar.f3297i = i17;
                uVar.f3298j = bVar2;
                return uVar;
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                int X11 = M1.a.X(parcel);
                H1.g gVar = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z6 = false;
                boolean z7 = false;
                int i18 = 0;
                while (parcel.dataPosition() < X11) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 1:
                            gVar = (H1.g) M1.a.u(parcel, readInt9, H1.g.CREATOR);
                            break;
                        case 2:
                            z6 = M1.a.N(parcel, readInt9);
                            break;
                        case 3:
                            z7 = M1.a.N(parcel, readInt9);
                            break;
                        case 4:
                            int P5 = M1.a.P(parcel, readInt9);
                            int dataPosition3 = parcel.dataPosition();
                            if (P5 != 0) {
                                iArr = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition3 + P5);
                                break;
                            } else {
                                iArr = null;
                                break;
                            }
                        case 5:
                            i18 = M1.a.O(parcel, readInt9);
                            break;
                        case 6:
                            int P6 = M1.a.P(parcel, readInt9);
                            int dataPosition4 = parcel.dataPosition();
                            if (P6 != 0) {
                                iArr2 = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition4 + P6);
                                break;
                            } else {
                                iArr2 = null;
                                break;
                            }
                        default:
                            M1.a.U(parcel, readInt9);
                            break;
                    }
                }
                M1.a.y(parcel, X11);
                return new H1.b(gVar, z6, z7, iArr, i18, iArr2);
            case AbstractC1024c.f9242c /* 9 */:
                int X12 = M1.a.X(parcel);
                Scope[] scopeArr = H1.c.f3237u;
                Bundle bundle2 = new Bundle();
                d[] dVarArr2 = H1.c.f3238v;
                d[] dVarArr3 = dVarArr2;
                String str7 = null;
                IBinder iBinder = null;
                Account account = null;
                String str8 = null;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                boolean z8 = false;
                int i22 = 0;
                boolean z9 = false;
                while (parcel.dataPosition() < X12) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 1:
                            i19 = M1.a.O(parcel, readInt10);
                            break;
                        case 2:
                            i20 = M1.a.O(parcel, readInt10);
                            break;
                        case 3:
                            i21 = M1.a.O(parcel, readInt10);
                            break;
                        case 4:
                            str7 = M1.a.v(parcel, readInt10);
                            break;
                        case 5:
                            int P7 = M1.a.P(parcel, readInt10);
                            int dataPosition5 = parcel.dataPosition();
                            if (P7 != 0) {
                                IBinder readStrongBinder = parcel.readStrongBinder();
                                parcel.setDataPosition(dataPosition5 + P7);
                                iBinder = readStrongBinder;
                                break;
                            } else {
                                iBinder = null;
                                break;
                            }
                        case 6:
                            scopeArr = (Scope[]) M1.a.w(parcel, readInt10, Scope.CREATOR);
                            break;
                        case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                            int P8 = M1.a.P(parcel, readInt10);
                            int dataPosition6 = parcel.dataPosition();
                            if (P8 != 0) {
                                Bundle readBundle2 = parcel.readBundle();
                                parcel.setDataPosition(dataPosition6 + P8);
                                bundle2 = readBundle2;
                                break;
                            } else {
                                bundle2 = null;
                                break;
                            }
                        case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                            account = (Account) M1.a.u(parcel, readInt10, Account.CREATOR);
                            break;
                        case AbstractC1024c.f9242c /* 9 */:
                        default:
                            M1.a.U(parcel, readInt10);
                            break;
                        case '\n':
                            dVarArr2 = (d[]) M1.a.w(parcel, readInt10, d.CREATOR);
                            break;
                        case RequestError.STOP_TRACKING /* 11 */:
                            dVarArr3 = (d[]) M1.a.w(parcel, readInt10, d.CREATOR);
                            break;
                        case '\f':
                            z8 = M1.a.N(parcel, readInt10);
                            break;
                        case '\r':
                            i22 = M1.a.O(parcel, readInt10);
                            break;
                        case 14:
                            z9 = M1.a.N(parcel, readInt10);
                            break;
                        case AbstractC1024c.f9246g /* 15 */:
                            str8 = M1.a.v(parcel, readInt10);
                            break;
                    }
                }
                M1.a.y(parcel, X12);
                return new H1.c(i19, i20, i21, str7, iBinder, scopeArr, bundle2, account, dVarArr2, dVarArr3, z8, i22, z9, str8);
            case 10:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new C0550a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case RequestError.STOP_TRACKING /* 11 */:
                Intrinsics.checkNotNullParameter(parcel, "inParcel");
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                Intrinsics.c(readParcelable);
                return new C0555f((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 12:
                Intrinsics.checkNotNullParameter(parcel, "inParcel");
                return new C1194j(parcel);
            default:
                return new ParcelImpl(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f2299a) {
            case 0:
                return new b[i2];
            case 1:
                return new d[i2];
            case 2:
                return new Scope[i2];
            case 3:
                return new Status[i2];
            case 4:
                return new H1.h[i2];
            case 5:
                return new H1.e[i2];
            case 6:
                return new H1.g[i2];
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return new u[i2];
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                return new H1.b[i2];
            case AbstractC1024c.f9242c /* 9 */:
                return new H1.c[i2];
            case 10:
                return new C0550a[i2];
            case RequestError.STOP_TRACKING /* 11 */:
                return new C0555f[i2];
            case 12:
                return new C1194j[i2];
            default:
                return new ParcelImpl[i2];
        }
    }
}
