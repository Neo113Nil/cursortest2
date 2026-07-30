package h4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f38228a;

    /* renamed from: b, reason: collision with root package name */
    public final c f38229b;

    public b(Set set, c cVar) {
        this.f38228a = b(set);
        this.f38229b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C4568a c4568a = (C4568a) it.next();
            sb.append(c4568a.f38226a);
            sb.append('/');
            sb.append(c4568a.f38227b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        c cVar = this.f38229b;
        synchronized (((HashSet) cVar.f38233u)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) cVar.f38233u);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.f38228a;
        if (isEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (((HashSet) cVar.f38233u)) {
            unmodifiableSet2 = Collections.unmodifiableSet((HashSet) cVar.f38233u);
        }
        sb.append(b(unmodifiableSet2));
        return sb.toString();
    }
}
