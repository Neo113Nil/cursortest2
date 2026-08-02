package defpackage;

import j$.util.Map;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class qi extends qy implements Map, j$.util.Map {
    qc a;
    qe b;
    qg c;

    public qi(qy qyVar) {
        super(0);
        h(qyVar);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        qc qcVar = this.a;
        if (qcVar != null) {
            return qcVar;
        }
        qc qcVar2 = new qc(this);
        this.a = qcVar2;
        return qcVar2;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final Set keySet() {
        qe qeVar = this.b;
        if (qeVar != null) {
            return qeVar;
        }
        qe qeVar2 = new qe(this);
        this.b = qeVar2;
        return qeVar2;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        g(this.d + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final Collection values() {
        qg qgVar = this.c;
        if (qgVar != null) {
            return qgVar;
        }
        qg qgVar2 = new qg(this);
        this.c = qgVar2;
        return qgVar2;
    }

    public qi() {
        super(0);
    }
}
