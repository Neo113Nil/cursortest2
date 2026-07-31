package r3;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* loaded from: classes.dex */
public final class y0 implements Parcelable.Creator<f> {
    static void a(f fVar, Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.h(parcel, 1, fVar.f21260f);
        s3.c.h(parcel, 2, fVar.f21261g);
        s3.c.h(parcel, 3, fVar.f21262h);
        s3.c.m(parcel, 4, fVar.f21263i, false);
        s3.c.g(parcel, 5, fVar.f21264j, false);
        s3.c.p(parcel, 6, fVar.f21265k, i7, false);
        s3.c.d(parcel, 7, fVar.f21266l, false);
        s3.c.l(parcel, 8, fVar.f21267m, i7, false);
        s3.c.p(parcel, 10, fVar.f21268n, i7, false);
        s3.c.p(parcel, 11, fVar.f21269o, i7, false);
        s3.c.c(parcel, 12, fVar.f21270p);
        s3.c.h(parcel, 13, fVar.f21271q);
        s3.c.c(parcel, 14, fVar.f21272r);
        s3.c.m(parcel, 15, fVar.c(), false);
        s3.c.b(parcel, a7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ f createFromParcel(Parcel parcel) {
        int u6 = s3.b.u(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        o3.d[] dVarArr = null;
        o3.d[] dVarArr2 = null;
        String str2 = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        boolean z6 = false;
        int i10 = 0;
        boolean z7 = false;
        while (parcel.dataPosition() < u6) {
            int o7 = s3.b.o(parcel);
            switch (s3.b.l(o7)) {
                case 1:
                    i7 = s3.b.q(parcel, o7);
                    break;
                case 2:
                    i8 = s3.b.q(parcel, o7);
                    break;
                case 3:
                    i9 = s3.b.q(parcel, o7);
                    break;
                case 4:
                    str = s3.b.f(parcel, o7);
                    break;
                case 5:
                    iBinder = s3.b.p(parcel, o7);
                    break;
                case 6:
                    scopeArr = (Scope[]) s3.b.i(parcel, o7, Scope.CREATOR);
                    break;
                case c4.w0.f2149o /* 7 */:
                    bundle = s3.b.a(parcel, o7);
                    break;
                case c4.w0.f2150p /* 8 */:
                    account = (Account) s3.b.e(parcel, o7, Account.CREATOR);
                    break;
                case 9:
                default:
                    s3.b.t(parcel, o7);
                    break;
                case 10:
                    dVarArr = (o3.d[]) s3.b.i(parcel, o7, o3.d.CREATOR);
                    break;
                case 11:
                    dVarArr2 = (o3.d[]) s3.b.i(parcel, o7, o3.d.CREATOR);
                    break;
                case 12:
                    z6 = s3.b.m(parcel, o7);
                    break;
                case 13:
                    i10 = s3.b.q(parcel, o7);
                    break;
                case 14:
                    z7 = s3.b.m(parcel, o7);
                    break;
                case 15:
                    str2 = s3.b.f(parcel, o7);
                    break;
            }
        }
        s3.b.k(parcel, u6);
        return new f(i7, i8, i9, str, iBinder, scopeArr, bundle, account, dVarArr, dVarArr2, z6, i10, z7, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ f[] newArray(int i7) {
        return new f[i7];
    }
}
