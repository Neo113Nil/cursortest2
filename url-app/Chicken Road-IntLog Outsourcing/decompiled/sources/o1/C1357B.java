package o1;

import a.AbstractC0169a;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* renamed from: o1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1357B implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11502a;

    public /* synthetic */ C1357B(int i2) {
        this.f11502a = i2;
    }

    public static void a(C1368f c1368f, Parcel parcel, int i2) {
        int R5 = AbstractC0169a.R(parcel, 20293);
        int i3 = c1368f.f11537a;
        AbstractC0169a.T(parcel, 1, 4);
        parcel.writeInt(i3);
        AbstractC0169a.T(parcel, 2, 4);
        parcel.writeInt(c1368f.f11538b);
        AbstractC0169a.T(parcel, 3, 4);
        parcel.writeInt(c1368f.f11539c);
        AbstractC0169a.O(parcel, 4, c1368f.f11540d);
        AbstractC0169a.M(parcel, 5, c1368f.f11541e);
        AbstractC0169a.P(parcel, 6, c1368f.f11542f, i2);
        AbstractC0169a.L(parcel, 7, c1368f.f11543g);
        AbstractC0169a.N(parcel, 8, c1368f.f11544h, i2);
        AbstractC0169a.P(parcel, 10, c1368f.f11545i, i2);
        AbstractC0169a.P(parcel, 11, c1368f.f11546j, i2);
        AbstractC0169a.T(parcel, 12, 4);
        parcel.writeInt(c1368f.f11547k ? 1 : 0);
        AbstractC0169a.T(parcel, 13, 4);
        parcel.writeInt(c1368f.f11548l);
        boolean z = c1368f.f11549m;
        AbstractC0169a.T(parcel, 14, 4);
        parcel.writeInt(z ? 1 : 0);
        AbstractC0169a.O(parcel, 15, c1368f.f11550n);
        AbstractC0169a.S(parcel, R5);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f11502a) {
            case 0:
                int t02 = K1.b.t0(parcel);
                Scope[] scopeArr = C1368f.f11535o;
                Bundle bundle = new Bundle();
                l1.d[] dVarArr = C1368f.f11536p;
                l1.d[] dVarArr2 = dVarArr;
                String str = null;
                IBinder iBinder = null;
                Account account = null;
                String str2 = null;
                int i2 = 0;
                int i3 = 0;
                int i6 = 0;
                boolean z = false;
                int i7 = 0;
                boolean z5 = false;
                while (parcel.dataPosition() < t02) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            i2 = K1.b.i0(parcel, readInt);
                            break;
                        case 2:
                            i3 = K1.b.i0(parcel, readInt);
                            break;
                        case 3:
                            i6 = K1.b.i0(parcel, readInt);
                            break;
                        case 4:
                            str = K1.b.N(parcel, readInt);
                            break;
                        case 5:
                            iBinder = K1.b.h0(parcel, readInt);
                            break;
                        case 6:
                            scopeArr = (Scope[]) K1.b.O(parcel, readInt, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = K1.b.L(parcel, readInt);
                            break;
                        case '\b':
                            account = (Account) K1.b.M(parcel, readInt, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            K1.b.n0(parcel, readInt);
                            break;
                        case '\n':
                            dVarArr = (l1.d[]) K1.b.O(parcel, readInt, l1.d.CREATOR);
                            break;
                        case 11:
                            dVarArr2 = (l1.d[]) K1.b.O(parcel, readInt, l1.d.CREATOR);
                            break;
                        case '\f':
                            z = K1.b.f0(parcel, readInt);
                            break;
                        case '\r':
                            i7 = K1.b.i0(parcel, readInt);
                            break;
                        case 14:
                            z5 = K1.b.f0(parcel, readInt);
                            break;
                        case 15:
                            str2 = K1.b.N(parcel, readInt);
                            break;
                    }
                }
                K1.b.S(parcel, t02);
                return new C1368f(i2, i3, i6, str, iBinder, scopeArr, bundle, account, dVarArr, dVarArr2, z, i7, z5, str2);
            default:
                int t03 = K1.b.t0(parcel);
                C1372j c1372j = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z6 = false;
                boolean z7 = false;
                int i8 = 0;
                while (parcel.dataPosition() < t03) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            c1372j = (C1372j) K1.b.M(parcel, readInt2, C1372j.CREATOR);
                            break;
                        case 2:
                            z6 = K1.b.f0(parcel, readInt2);
                            break;
                        case 3:
                            z7 = K1.b.f0(parcel, readInt2);
                            break;
                        case 4:
                            int k02 = K1.b.k0(parcel, readInt2);
                            int dataPosition = parcel.dataPosition();
                            if (k02 != 0) {
                                iArr = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition + k02);
                                break;
                            } else {
                                iArr = null;
                                break;
                            }
                        case 5:
                            i8 = K1.b.i0(parcel, readInt2);
                            break;
                        case 6:
                            int k03 = K1.b.k0(parcel, readInt2);
                            int dataPosition2 = parcel.dataPosition();
                            if (k03 != 0) {
                                iArr2 = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition2 + k03);
                                break;
                            } else {
                                iArr2 = null;
                                break;
                            }
                        default:
                            K1.b.n0(parcel, readInt2);
                            break;
                    }
                }
                K1.b.S(parcel, t03);
                return new C1367e(c1372j, z6, z7, iArr, i8, iArr2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        switch (this.f11502a) {
            case 0:
                return new C1368f[i2];
            default:
                return new C1367e[i2];
        }
    }
}
