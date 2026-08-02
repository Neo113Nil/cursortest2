package n1;

import android.view.View;
import java.util.Collections;
import java.util.Iterator;
import q1.AbstractC1180a;

/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: d, reason: collision with root package name */
    public static final b f10147d = new b();

    @Override // n1.e
    public final void a(boolean z) {
        Iterator it = Collections.unmodifiableCollection(c.f10148c.f10149a).iterator();
        while (it.hasNext()) {
            AbstractC1180a abstractC1180a = ((j1.i) it.next()).f9544e;
            if (abstractC1180a.f10230b.get() != 0) {
                i.f10160a.a(abstractC1180a.g(), "setState", z ? "foregrounded" : "backgrounded", abstractC1180a.f10229a);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n1.e
    public final boolean b() {
        Iterator it = Collections.unmodifiableCollection(c.f10148c.f10150b).iterator();
        while (it.hasNext()) {
            View view = (View) ((j1.i) it.next()).f9543d.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
