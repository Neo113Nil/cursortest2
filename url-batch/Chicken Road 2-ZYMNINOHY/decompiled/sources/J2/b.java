package J2;

import android.view.View;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: d, reason: collision with root package name */
    public static final b f1172d = new b();

    @Override // J2.e
    public final void a(boolean z) {
        Iterator it = Collections.unmodifiableCollection(c.f1173c.f1174a).iterator();
        while (it.hasNext()) {
            M2.a aVar = ((F2.i) it.next()).f785e;
            if (aVar.f1750b.get() != 0) {
                i.f1185a.a(aVar.g(), "setState", z ? "foregrounded" : "backgrounded", aVar.f1749a);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // J2.e
    public final boolean b() {
        Iterator it = Collections.unmodifiableCollection(c.f1173c.f1175b).iterator();
        while (it.hasNext()) {
            View view = (View) ((F2.i) it.next()).f784d.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
