package w2;

import java.util.Iterator;
import java.util.Set;

/* renamed from: w2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1293b {

    /* renamed from: a, reason: collision with root package name */
    public final String f11385a;

    /* renamed from: b, reason: collision with root package name */
    public final C1294c f11386b;

    public C1293b(Set set, C1294c c1294c) {
        this.f11385a = a(set);
        this.f11386b = c1294c;
    }

    public static String a(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C1292a c1292a = (C1292a) it.next();
            sb.append(c1292a.f11383a);
            sb.append('/');
            sb.append(c1292a.f11384b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}
