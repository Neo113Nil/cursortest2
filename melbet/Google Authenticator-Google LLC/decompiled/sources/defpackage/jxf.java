package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxf {
    public static final jxf a = new jxf(new jxc(1), jxc.a);
    private final ConcurrentMap b = new ConcurrentHashMap();

    public jxf(jxe... jxeVarArr) {
        for (jxe jxeVar : jxeVarArr) {
            this.b.put(jxeVar.b(), jxeVar);
        }
    }
}
