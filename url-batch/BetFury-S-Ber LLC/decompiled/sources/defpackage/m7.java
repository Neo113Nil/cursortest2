package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class m7 {
    public static final l7 h = new l7();
    public final o0 a;
    public final o0 b;
    public List e;
    public int g;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public List f = Collections.EMPTY_LIST;
    public final l7 c = h;

    public m7(o0 o0Var, o0 o0Var2) {
        this.a = o0Var;
        this.b = o0Var2;
    }

    public final void a() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            c40 c40Var = ((zx) it.next()).a;
        }
    }
}
