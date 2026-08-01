package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class d7 {
    public static final c7 h = new c7();
    public final rc0 a;
    public final rc0 b;
    public List e;
    public int g;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public List f = Collections.EMPTY_LIST;
    public final c7 c = h;

    public d7(rc0 rc0Var, rc0 rc0Var2) {
        this.a = rc0Var;
        this.b = rc0Var2;
    }

    public final void a() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ny nyVar = ((at) it.next()).a;
        }
    }
}
