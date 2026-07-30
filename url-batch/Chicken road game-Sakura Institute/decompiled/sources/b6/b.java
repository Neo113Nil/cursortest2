package b6;

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f1390a;

    /* renamed from: b, reason: collision with root package name */
    public final c f1391b;

    public b(Set set, c cVar) {
        this.f1390a = a(set);
        this.f1391b = cVar;
    }

    public static String a(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb.append(aVar.f1388a);
            sb.append('/');
            sb.append(aVar.f1389b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}
