package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class t6 {
    public static final s6 h = new s6();
    public final k0 a;
    public final q4 b;
    public ArrayList e;
    public int g;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public List f = Collections.EMPTY_LIST;
    public final s6 c = h;

    public t6(k0 k0Var, q4 q4Var) {
        this.a = k0Var;
        this.b = q4Var;
    }

    public final void a() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            jv jvVar = ((mq) it.next()).a;
        }
    }
}
