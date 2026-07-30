package N1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a extends q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ IBinder f1796e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c f1797i;

    public a(c cVar, IBinder iBinder) {
        this.f1797i = cVar;
        this.f1796e = iBinder;
    }

    @Override // N1.q
    public final void b() {
        o mVar;
        d dVar = this.f1797i.f1800a;
        dVar.f1810i.getClass();
        int i2 = n.f1823f;
        IBinder iBinder = this.f1796e;
        if (iBinder == null) {
            mVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
            mVar = queryLocalInterface instanceof o ? (o) queryLocalInterface : new m(iBinder);
        }
        dVar.f1814n = mVar;
        p pVar = dVar.f1803b;
        int i5 = 0;
        pVar.a("linkToDeath", new Object[0]);
        try {
            ((m) dVar.f1814n).f1822e.linkToDeath(dVar.f1811k, 0);
        } catch (RemoteException e7) {
            Object[] objArr = new Object[0];
            pVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", p.b(pVar.f1824a, "linkToDeath failed", objArr), e7);
            }
        }
        dVar.f1808g = false;
        ArrayList arrayList = dVar.f1805d;
        int size = arrayList.size();
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            ((Runnable) obj).run();
        }
        dVar.f1805d.clear();
    }
}
