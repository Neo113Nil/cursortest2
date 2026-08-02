package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class giq {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;

    public giq() {
        this.b = new HashSet();
        this.c = new HashSet();
        this.d = new HashMap();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final boolean a() {
        Collection values = this.d.values();
        if ((values instanceof Collection) && values.isEmpty()) {
            return false;
        }
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (((iwq) it.next()).i()) {
                return true;
            }
        }
        return false;
    }

    public giq(bmc bmcVar, bjv bjvVar) {
        this.d = new bko(this);
        this.c = bmcVar;
        this.b = bjvVar;
    }
}
