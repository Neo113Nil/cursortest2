package J2;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final l f1192d;

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f1193a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1194b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1195c;

    static {
        l lVar = new l();
        lVar.f1194b = false;
        lVar.f1195c = false;
        f1192d = lVar;
    }

    public final void a(boolean z, boolean z4) {
        if ((z4 || z) == (this.f1195c || this.f1194b)) {
            return;
        }
        Iterator it = Collections.unmodifiableCollection(c.f1173c.f1174a).iterator();
        while (it.hasNext()) {
            M2.a aVar = ((F2.i) it.next()).f785e;
            boolean z5 = z4 || z;
            if (aVar.f1750b.get() != 0) {
                i.f1185a.a(aVar.g(), "setDeviceLockState", z5 ? "locked" : "unlocked");
            }
        }
    }
}
