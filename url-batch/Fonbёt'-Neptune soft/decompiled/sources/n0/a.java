package n0;

import android.util.SparseArray;
import io.flutter.plugin.platform.o;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f3262a;

    public a(c cVar) {
        this.f3262a = cVar;
    }

    @Override // n0.b
    public final void a() {
        c cVar = this.f3262a;
        Iterator it = cVar.f3281s.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a();
        }
        while (true) {
            o oVar = cVar.f3280r;
            SparseArray sparseArray = oVar.f2665k;
            if (sparseArray.size() <= 0) {
                cVar.f3273k.f3518b = null;
                return;
            } else {
                oVar.v.e(sparseArray.keyAt(0));
            }
        }
    }

    @Override // n0.b
    public final void b() {
    }
}
