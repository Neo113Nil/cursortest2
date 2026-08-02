package n1;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import q1.AbstractC1180a;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final l f10167d;

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f10168a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10169b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10170c;

    static {
        l lVar = new l();
        lVar.f10169b = false;
        lVar.f10170c = false;
        f10167d = lVar;
    }

    public final void a(boolean z, boolean z2) {
        if ((z2 || z) == (this.f10170c || this.f10169b)) {
            return;
        }
        Iterator it = Collections.unmodifiableCollection(c.f10148c.f10149a).iterator();
        while (it.hasNext()) {
            AbstractC1180a abstractC1180a = ((j1.i) it.next()).f9544e;
            boolean z3 = z2 || z;
            if (abstractC1180a.f10230b.get() != 0) {
                i.f10160a.a(abstractC1180a.g(), "setDeviceLockState", z3 ? "locked" : "unlocked");
            }
        }
    }
}
