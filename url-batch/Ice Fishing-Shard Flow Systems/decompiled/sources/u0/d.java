package u0;

import android.content.Context;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import v0.AbstractC0959c;
import v0.C0958b;
import v0.F;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final v0.s f8051a = new v0.s();

    public static boolean a(String str) {
        C0958b c0958b = F.f8151a;
        Set<v0.n> unmodifiableSet = Collections.unmodifiableSet(AbstractC0959c.f8187c);
        HashSet hashSet = new HashSet();
        for (v0.n nVar : unmodifiableSet) {
            if (((AbstractC0959c) nVar).f8188a.equals(str)) {
                hashSet.add(nVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException(r4.f.i("Unknown feature ", str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractC0959c abstractC0959c = (AbstractC0959c) ((v0.n) it.next());
            if (abstractC0959c.a() || abstractC0959c.b()) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(Context context, String str) {
        C0958b c0958b = F.f8151a;
        Set<v0.x> unmodifiableSet = Collections.unmodifiableSet(v0.x.f8205d);
        HashSet hashSet = new HashSet();
        for (v0.x xVar : unmodifiableSet) {
            if (xVar.f8206a.equals(str)) {
                hashSet.add(xVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException(r4.f.i("Unknown feature ", str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((v0.x) it.next()).a(context)) {
                return true;
            }
        }
        return false;
    }
}
