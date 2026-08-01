package z7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ IBinder f10918e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c f10919i;

    public a(c cVar, IBinder iBinder) {
        this.f10919i = cVar;
        this.f10918e = iBinder;
    }

    @Override // z7.p
    public final void b() {
        n lVar;
        d dVar = this.f10919i.f10922a;
        dVar.f10931i.getClass();
        int i3 = m.f10943e;
        IBinder iBinder = this.f10918e;
        if (iBinder == null) {
            lVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
            lVar = queryLocalInterface instanceof n ? (n) queryLocalInterface : new l(iBinder);
        }
        dVar.f10935n = lVar;
        o oVar = dVar.f10925b;
        int i10 = 0;
        oVar.a("linkToDeath", new Object[0]);
        try {
            ((l) dVar.f10935n).f10942d.linkToDeath(dVar.f10932k, 0);
        } catch (RemoteException e2) {
            Object[] objArr = new Object[0];
            oVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", o.b(oVar.f10944a, "linkToDeath failed", objArr), e2);
            }
        }
        dVar.g = false;
        ArrayList arrayList = dVar.f10927d;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
        dVar.f10927d.clear();
    }
}
