package y5;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import l1.x;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f9896a;

    public /* synthetic */ a(b bVar) {
        this.f9896a = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        b bVar = this.f9896a;
        synchronized (bVar) {
            x xVar = (x) bVar.f9897a.get();
            long currentTimeMillis = System.currentTimeMillis();
            b6.b bVar2 = (b6.b) bVar.f9899c.get();
            String str = bVar2.f1390a;
            b6.c cVar = bVar2.f1391b;
            synchronized (((HashSet) cVar.f1394g)) {
                unmodifiableSet = Collections.unmodifiableSet((HashSet) cVar.f1394g);
            }
            if (!unmodifiableSet.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(' ');
                synchronized (((HashSet) cVar.f1394g)) {
                    unmodifiableSet2 = Collections.unmodifiableSet((HashSet) cVar.f1394g);
                }
                sb.append(b6.b.a(unmodifiableSet2));
                str = sb.toString();
            }
            xVar.s(currentTimeMillis, str);
        }
        return null;
    }
}
