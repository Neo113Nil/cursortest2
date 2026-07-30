package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class dr1 extends vr1 {
    public final /* synthetic */ byte[] e;
    public final /* synthetic */ Long g;
    public final /* synthetic */ ng1 h;
    public final /* synthetic */ IntegrityTokenRequest i;
    public final /* synthetic */ hr1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dr1(hr1 hr1Var, ng1 ng1Var, byte[] bArr, Long l, ng1 ng1Var2, IntegrityTokenRequest integrityTokenRequest) {
        super(ng1Var);
        this.j = hr1Var;
        this.e = bArr;
        this.g = l;
        this.h = ng1Var2;
        this.i = integrityTokenRequest;
    }

    @Override // defpackage.vr1
    public final void a(Exception exc) {
        if (exc instanceof cr1) {
            super.a(new ea0(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // defpackage.vr1
    public final void b() {
        ng1 ng1Var = this.h;
        hr1 hr1Var = this.j;
        try {
            tr1 tr1Var = hr1Var.d.n;
            Bundle a = hr1.a(hr1Var, this.e, this.g);
            fr1 fr1Var = new fr1(hr1Var, ng1Var);
            rr1 rr1Var = (rr1) tr1Var;
            rr1Var.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IIntegrityService");
            int i = or1.a;
            obtain.writeInt(1);
            a.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(fr1Var);
            try {
                rr1Var.b.transact(2, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RemoteException e) {
            ur1 ur1Var = hr1Var.a;
            Object[] objArr = {this.i};
            ur1Var.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", ur1.b(ur1Var.a, "requestIntegrityToken(%s)", objArr), e);
            }
            ng1Var.b(new ea0(-100, e));
        }
    }
}
