package E1;

import com.google.android.gms.internal.play_billing.AbstractC0346t;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: E1.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0048y {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0346t f671a;

    public C0048y a() {
        if (this.f671a == null) {
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }
        C0048y c0048y = new C0048y();
        c0048y.f671a = this.f671a;
        return c0048y;
    }

    public void b(List list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Product list cannot be empty.");
        }
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0049z c0049z = (C0049z) it.next();
            if (!"play_pass_subs".equals(c0049z.f673b)) {
                hashSet.add(c0049z.f673b);
            }
        }
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("All products should be of the same product type.");
        }
        this.f671a = AbstractC0346t.j(list);
    }
}
