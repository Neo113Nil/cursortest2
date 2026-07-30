package t1;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.common.api.Scope;
import z1.AbstractC1053a;

/* renamed from: t1.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0907D implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7901a;

    public static void a(C0918e c0918e, Parcel parcel, int i2) {
        int Q = AbstractC1053a.Q(parcel, 20293);
        int i5 = c0918e.f7933d;
        AbstractC1053a.P(parcel, 1, 4);
        parcel.writeInt(i5);
        int i7 = c0918e.f7934e;
        AbstractC1053a.P(parcel, 2, 4);
        parcel.writeInt(i7);
        int i8 = c0918e.f7935i;
        AbstractC1053a.P(parcel, 3, 4);
        parcel.writeInt(i8);
        AbstractC1053a.K(parcel, 4, c0918e.f7936l);
        IBinder iBinder = c0918e.f7937m;
        if (iBinder != null) {
            int Q4 = AbstractC1053a.Q(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            AbstractC1053a.S(parcel, Q4);
        }
        AbstractC1053a.L(parcel, 6, c0918e.f7938n, i2);
        AbstractC1053a.H(parcel, 7, c0918e.f7939o);
        AbstractC1053a.J(parcel, 8, c0918e.f7940p, i2);
        AbstractC1053a.L(parcel, 10, c0918e.f7941q, i2);
        AbstractC1053a.L(parcel, 11, c0918e.f7942r, i2);
        boolean z7 = c0918e.f7943s;
        AbstractC1053a.P(parcel, 12, 4);
        parcel.writeInt(z7 ? 1 : 0);
        int i9 = c0918e.f7944t;
        AbstractC1053a.P(parcel, 13, 4);
        parcel.writeInt(i9);
        boolean z8 = c0918e.f7945u;
        AbstractC1053a.P(parcel, 14, 4);
        parcel.writeInt(z8 ? 1 : 0);
        AbstractC1053a.K(parcel, 15, c0918e.f7946v);
        AbstractC1053a.S(parcel, Q);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f7901a) {
            case 0:
                int M7 = d4.c.M(parcel);
                Bundle bundle = null;
                C0917d c0917d = null;
                int i2 = 0;
                q1.d[] dVarArr = null;
                while (parcel.dataPosition() < M7) {
                    int readInt = parcel.readInt();
                    char c7 = (char) readInt;
                    if (c7 == 1) {
                        bundle = d4.c.g(parcel, readInt);
                    } else if (c7 == 2) {
                        dVarArr = (q1.d[]) d4.c.j(parcel, readInt, q1.d.CREATOR);
                    } else if (c7 == 3) {
                        i2 = d4.c.G(parcel, readInt);
                    } else if (c7 != 4) {
                        d4.c.J(parcel, readInt);
                    } else {
                        c0917d = (C0917d) d4.c.h(parcel, readInt, C0917d.CREATOR);
                    }
                }
                d4.c.n(parcel, M7);
                C0906C c0906c = new C0906C();
                c0906c.f7897d = bundle;
                c0906c.f7898e = dVarArr;
                c0906c.f7899i = i2;
                c0906c.f7900l = c0917d;
                return c0906c;
            case 1:
                int M8 = d4.c.M(parcel);
                C0922i c0922i = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z7 = false;
                boolean z8 = false;
                int i5 = 0;
                while (parcel.dataPosition() < M8) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            c0922i = (C0922i) d4.c.h(parcel, readInt2, C0922i.CREATOR);
                            break;
                        case 2:
                            z7 = d4.c.D(parcel, readInt2);
                            break;
                        case 3:
                            z8 = d4.c.D(parcel, readInt2);
                            break;
                        case 4:
                            int H7 = d4.c.H(parcel, readInt2);
                            int dataPosition = parcel.dataPosition();
                            if (H7 != 0) {
                                iArr = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition + H7);
                                break;
                            } else {
                                iArr = null;
                                break;
                            }
                        case 5:
                            i5 = d4.c.G(parcel, readInt2);
                            break;
                        case 6:
                            int H8 = d4.c.H(parcel, readInt2);
                            int dataPosition2 = parcel.dataPosition();
                            if (H8 != 0) {
                                iArr2 = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition2 + H8);
                                break;
                            } else {
                                iArr2 = null;
                                break;
                            }
                        default:
                            d4.c.J(parcel, readInt2);
                            break;
                    }
                }
                d4.c.n(parcel, M8);
                return new C0917d(c0922i, z7, z8, iArr, i5, iArr2);
            default:
                int M9 = d4.c.M(parcel);
                Bundle bundle2 = new Bundle();
                Scope[] scopeArr = C0918e.f7931w;
                String str = null;
                IBinder iBinder = null;
                Account account = null;
                String str2 = null;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                boolean z9 = false;
                int i10 = 0;
                boolean z10 = false;
                q1.d[] dVarArr2 = C0918e.f7932x;
                q1.d[] dVarArr3 = dVarArr2;
                while (parcel.dataPosition() < M9) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            i7 = d4.c.G(parcel, readInt3);
                            break;
                        case 2:
                            i8 = d4.c.G(parcel, readInt3);
                            break;
                        case 3:
                            i9 = d4.c.G(parcel, readInt3);
                            break;
                        case 4:
                            str = d4.c.i(parcel, readInt3);
                            break;
                        case 5:
                            int H9 = d4.c.H(parcel, readInt3);
                            int dataPosition3 = parcel.dataPosition();
                            if (H9 != 0) {
                                IBinder readStrongBinder = parcel.readStrongBinder();
                                parcel.setDataPosition(dataPosition3 + H9);
                                iBinder = readStrongBinder;
                                break;
                            } else {
                                iBinder = null;
                                break;
                            }
                        case 6:
                            scopeArr = (Scope[]) d4.c.j(parcel, readInt3, Scope.CREATOR);
                            break;
                        case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            bundle2 = d4.c.g(parcel, readInt3);
                            break;
                        case S.j.BYTES_FIELD_NUMBER /* 8 */:
                            account = (Account) d4.c.h(parcel, readInt3, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            d4.c.J(parcel, readInt3);
                            break;
                        case '\n':
                            dVarArr2 = (q1.d[]) d4.c.j(parcel, readInt3, q1.d.CREATOR);
                            break;
                        case RequestError.STOP_TRACKING /* 11 */:
                            dVarArr3 = (q1.d[]) d4.c.j(parcel, readInt3, q1.d.CREATOR);
                            break;
                        case '\f':
                            z9 = d4.c.D(parcel, readInt3);
                            break;
                        case '\r':
                            i10 = d4.c.G(parcel, readInt3);
                            break;
                        case 14:
                            z10 = d4.c.D(parcel, readInt3);
                            break;
                        case 15:
                            str2 = d4.c.i(parcel, readInt3);
                            break;
                    }
                }
                d4.c.n(parcel, M9);
                return new C0918e(i7, i8, i9, str, iBinder, scopeArr, bundle2, account, dVarArr2, dVarArr3, z9, i10, z10, str2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        switch (this.f7901a) {
            case 0:
                return new C0906C[i2];
            case 1:
                return new C0917d[i2];
            default:
                return new C0918e[i2];
        }
    }
}
