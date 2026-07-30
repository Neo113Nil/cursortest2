package l2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f6266a;

    /* renamed from: b, reason: collision with root package name */
    public final c f6267b;

    public b(Set set, c cVar) {
        this.f6266a = b(set);
        this.f6267b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C0660a c0660a = (C0660a) it.next();
            sb.append(c0660a.f6264a);
            sb.append('/');
            sb.append(c0660a.f6265b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        String str = this.f6266a;
        c cVar = this.f6267b;
        synchronized (((HashSet) cVar.f6269d)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) cVar.f6269d);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (((HashSet) cVar.f6269d)) {
            unmodifiableSet2 = Collections.unmodifiableSet((HashSet) cVar.f6269d);
        }
        sb.append(b(unmodifiableSet2));
        return sb.toString();
    }
}
