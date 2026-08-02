package defpackage;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class khh {
    public final Set a = Collections.newSetFromMap(new IdentityHashMap());

    protected abstract void a();

    protected abstract void b();

    public final void c(Object obj, boolean z) {
        Set set = this.a;
        int size = set.size();
        if (z) {
            set.add(obj);
            if (size == 0) {
                a();
                return;
            }
            return;
        }
        if (set.remove(obj) && size == 1) {
            b();
        }
    }
}
