package d9;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f3697a;

    /* renamed from: b, reason: collision with root package name */
    public final c f3698b;

    public b(Set set, c cVar) {
        this.f3697a = b(set);
        this.f3698b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f3695a);
            sb2.append('/');
            sb2.append(aVar.f3696b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        c cVar = this.f3698b;
        synchronized (((HashSet) cVar.f3701e)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) cVar.f3701e);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.f3697a;
        if (isEmpty) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(' ');
        synchronized (((HashSet) cVar.f3701e)) {
            unmodifiableSet2 = Collections.unmodifiableSet((HashSet) cVar.f3701e);
        }
        sb2.append(b(unmodifiableSet2));
        return sb2.toString();
    }
}
