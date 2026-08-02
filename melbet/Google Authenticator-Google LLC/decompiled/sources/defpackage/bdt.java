package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bdt {
    public final wq a;
    public final List b;
    public final String c;

    public bdt(Class cls, Class cls2, Class cls3, List list, wq wqVar) {
        this.a = wqVar;
        a.V(list);
        this.b = list;
        this.c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.b.toArray()) + "}";
    }
}
