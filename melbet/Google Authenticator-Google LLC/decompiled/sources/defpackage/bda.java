package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bda {
    public final bjs a;
    public final wq b;
    private final Class c;
    private final List d;
    private final String e;

    public bda(Class cls, Class cls2, Class cls3, List list, bjs bjsVar, wq wqVar) {
        this.c = cls;
        this.d = list;
        this.a = bjsVar;
        this.b = wqVar;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final bdv a(bbw bbwVar, int i, int i2, bbl bblVar, List list) {
        List list2 = this.d;
        int size = list2.size();
        bdv bdvVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            bbn bbnVar = (bbn) list2.get(i3);
            try {
                if (bbnVar.b(bbwVar.a(), bblVar)) {
                    bdvVar = bbnVar.a(bbwVar.a(), i, i2, bblVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                list.add(e);
            }
            if (bdvVar != null) {
                break;
            }
        }
        if (bdvVar != null) {
            return bdvVar;
        }
        throw new bdr(this.e, new ArrayList(list));
    }

    public final String toString() {
        bjs bjsVar = this.a;
        List list = this.d;
        return "DecodePath{ dataClass=" + String.valueOf(this.c) + ", decoders=" + String.valueOf(list) + ", transcoder=" + bjsVar.toString() + "}";
    }
}
