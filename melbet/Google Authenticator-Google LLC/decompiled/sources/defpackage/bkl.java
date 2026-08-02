package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bkl {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public final Set b = new HashSet();
    public boolean c;

    public final boolean a(blb blbVar) {
        boolean z = true;
        if (blbVar == null) {
            return true;
        }
        Set set = this.a;
        Set set2 = this.b;
        boolean remove = set.remove(blbVar);
        if (!set2.remove(blbVar) && !remove) {
            z = false;
        }
        if (z) {
            blbVar.c();
        }
        return z;
    }

    public final String toString() {
        Set set = this.a;
        return super.toString() + "{numRequests=" + set.size() + ", isPaused=" + this.c + "}";
    }
}
