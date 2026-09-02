package E;

import android.util.SparseArray;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f145a;

    public a(c cVar) {
        this.f145a = cVar;
    }

    @Override // E.b
    public final void a() {
        c cVar = this.f145a;
        Iterator it = cVar.f168v.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a();
        }
        while (true) {
            io.flutter.plugin.platform.k kVar = cVar.f166s;
            SparseArray sparseArray = kVar.f675l;
            if (sparseArray.size() <= 0) {
                break;
            }
            kVar.f684v.g(sparseArray.keyAt(0));
        }
        while (true) {
            io.flutter.plugin.platform.j jVar = cVar.f167t;
            SparseArray sparseArray2 = jVar.f658h;
            if (sparseArray2.size() <= 0) {
                cVar.f158k.f312b = null;
                return;
            } else {
                jVar.f664n.g(sparseArray2.keyAt(0));
            }
        }
    }

    @Override // E.b
    public final void b() {
    }
}
