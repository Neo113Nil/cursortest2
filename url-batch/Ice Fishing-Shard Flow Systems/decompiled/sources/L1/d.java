package L1;

import N1.k;
import N1.m;
import N1.o;
import N1.p;
import N1.q;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* loaded from: classes.dex */
public final class d extends q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f1665e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Long f1666i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ K1.h f1667l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ IntegrityTokenRequest f1668m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f f1669n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, K1.h hVar, byte[] bArr, Long l7, K1.h hVar2, IntegrityTokenRequest integrityTokenRequest) {
        super(hVar);
        this.f1669n = fVar;
        this.f1665e = bArr;
        this.f1666i = l7;
        this.f1667l = hVar2;
        this.f1668m = integrityTokenRequest;
    }

    @Override // N1.q
    public final void a(Exception exc) {
        if (exc instanceof N1.e) {
            super.a(new a(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // N1.q
    public final void b() {
        K1.h hVar = this.f1667l;
        f fVar = this.f1669n;
        try {
            o oVar = fVar.f1676d.f1814n;
            Bundle a7 = f.a(fVar, this.f1665e, this.f1666i);
            e eVar = new e(fVar, hVar);
            m mVar = (m) oVar;
            mVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IIntegrityService");
            int i2 = k.f1820a;
            obtain.writeInt(1);
            a7.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(eVar);
            try {
                mVar.f1822e.transact(2, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RemoteException e7) {
            p pVar = fVar.f1673a;
            Object[] objArr = {this.f1668m};
            pVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", p.b(pVar.f1824a, "requestIntegrityToken(%s)", objArr), e7);
            }
            hVar.c(new a(-100, e7));
        }
    }
}
