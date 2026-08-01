package F;

import android.util.SparseArray;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f221a;

    public a(c cVar) {
        this.f221a = cVar;
    }

    @Override // F.b
    public final void a() {
        c cVar = this.f221a;
        Iterator it = cVar.f243v.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a();
        }
        while (true) {
            io.flutter.plugin.platform.j jVar = cVar.f241s;
            SparseArray sparseArray = jVar.f728l;
            if (sparseArray.size() <= 0) {
                break;
            }
            jVar.f737v.g(sparseArray.keyAt(0));
        }
        while (true) {
            io.flutter.plugin.platform.i iVar = cVar.t;
            SparseArray sparseArray2 = iVar.f711h;
            if (sparseArray2.size() <= 0) {
                cVar.f233k.f370b = null;
                return;
            } else {
                iVar.f717n.g(sparseArray2.keyAt(0));
            }
        }
    }

    @Override // F.b
    public final void b() {
    }
}
