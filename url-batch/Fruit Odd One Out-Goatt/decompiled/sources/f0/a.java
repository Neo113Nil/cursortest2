package f0;

import android.util.SparseArray;
import java.util.Iterator;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f265a;

    public a(c cVar) {
        this.f265a = cVar;
    }

    @Override // f0.b
    public final void a() {
        c cVar = this.f265a;
        Iterator it = cVar.v.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a();
        }
        io.flutter.plugin.platform.j jVar = cVar.f285s;
        SparseArray sparseArray = jVar.f523l;
        while (sparseArray.size() > 0) {
            jVar.v.m(sparseArray.keyAt(0));
        }
        io.flutter.plugin.platform.i iVar = cVar.f286t;
        SparseArray sparseArray2 = iVar.f506h;
        while (sparseArray2.size() > 0) {
            iVar.f512o.m(sparseArray2.keyAt(0));
        }
        cVar.f278k.f810b = null;
    }

    @Override // f0.b
    public final void b() {
    }
}
