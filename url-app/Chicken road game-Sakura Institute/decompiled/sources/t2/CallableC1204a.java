package t2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import w2.C1293b;
import w2.C1294c;

/* renamed from: t2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC1204a implements Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1205b f10737d;

    public /* synthetic */ CallableC1204a(C1205b c1205b) {
        this.f10737d = c1205b;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        C1205b c1205b = this.f10737d;
        synchronized (c1205b) {
            C1209f c1209f = (C1209f) c1205b.f10738a.get();
            long currentTimeMillis = System.currentTimeMillis();
            C1293b c1293b = (C1293b) c1205b.f10740c.get();
            C1294c c1294c = c1293b.f11386b;
            synchronized (((HashSet) c1294c.f11388d)) {
                unmodifiableSet = Collections.unmodifiableSet((HashSet) c1294c.f11388d);
            }
            boolean isEmpty = unmodifiableSet.isEmpty();
            String str = c1293b.f11385a;
            if (!isEmpty) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(' ');
                synchronized (((HashSet) c1294c.f11388d)) {
                    unmodifiableSet2 = Collections.unmodifiableSet((HashSet) c1294c.f11388d);
                }
                sb.append(C1293b.a(unmodifiableSet2));
                str = sb.toString();
            }
            c1209f.d(str, currentTimeMillis);
        }
        return null;
    }
}
