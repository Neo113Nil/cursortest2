package x7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import z7.l;
import z7.n;
import z7.o;
import z7.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e extends p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f10524e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Long f10525i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w7.g f10526r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ IntegrityTokenRequest f10527s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f10528t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, w7.g gVar2, byte[] bArr, Long l10, w7.g gVar3, IntegrityTokenRequest integrityTokenRequest) {
        super(gVar2);
        this.f10528t = gVar;
        this.f10524e = bArr;
        this.f10525i = l10;
        this.f10526r = gVar3;
        this.f10527s = integrityTokenRequest;
    }

    @Override // z7.p
    public final void a(Exception exc) {
        if (exc instanceof z7.e) {
            super.a(new a(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // z7.p
    public final void b() {
        w7.g gVar = this.f10526r;
        g gVar2 = this.f10528t;
        try {
            n nVar = gVar2.f10534d.f10935n;
            Bundle a9 = g.a(gVar2, this.f10524e, this.f10525i);
            f fVar = new f(gVar2, gVar);
            l lVar = (l) nVar;
            lVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IIntegrityService");
            int i3 = z7.j.f10940a;
            obtain.writeInt(1);
            a9.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(fVar);
            try {
                lVar.f10942d.transact(2, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RemoteException e2) {
            o oVar = gVar2.f10531a;
            Object[] objArr = {this.f10527s};
            oVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", o.b(oVar.f10944a, "requestIntegrityToken(%s)", objArr), e2);
            }
            gVar.b(new a(-100, e2));
        }
    }
}
