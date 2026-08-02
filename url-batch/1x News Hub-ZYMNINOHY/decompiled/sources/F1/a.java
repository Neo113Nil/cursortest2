package F1;

import android.util.SparseArray;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.platform.q;
import io.flutter.plugin.platform.r;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlutterEngine f485a;

    public a(FlutterEngine flutterEngine) {
        this.f485a = flutterEngine;
    }

    @Override // F1.b
    public final void b() {
        FlutterEngine flutterEngine = this.f485a;
        Iterator it = flutterEngine.v.iterator();
        while (it.hasNext()) {
            ((b) it.next()).b();
        }
        while (true) {
            r rVar = flutterEngine.f9115s;
            SparseArray sparseArray = rVar.f9305l;
            if (sparseArray.size() <= 0) {
                break;
            }
            rVar.f9314w.o(sparseArray.keyAt(0));
        }
        while (true) {
            q qVar = flutterEngine.f9116t;
            SparseArray sparseArray2 = qVar.f9286i;
            if (sparseArray2.size() <= 0) {
                flutterEngine.f9108k.f1183d = null;
                return;
            } else {
                qVar.f9293q.o(sparseArray2.keyAt(0));
            }
        }
    }

    @Override // F1.b
    public final void a() {
    }
}
