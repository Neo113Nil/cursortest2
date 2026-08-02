package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kaf {
    private static kaf e;
    public int c;
    public final Object a = new Object();
    public final Set b = new HashSet();
    public kay[] d = new kay[5];

    public static synchronized kaf a() {
        kaf kafVar;
        synchronized (kaf.class) {
            kafVar = e;
            if (kafVar == null) {
                kafVar = new kaf();
                e = kafVar;
            }
        }
        return kafVar;
    }

    public final void b() {
        kay[] kayVarArr = this.d;
        this.d = (kay[]) Arrays.copyOf(kayVarArr, kayVarArr.length + 5);
    }

    public final void c() {
        synchronized (this.a) {
            DesugarCollections.unmodifiableList(Arrays.asList((kay[]) Arrays.copyOfRange(this.d, 0, this.c)));
        }
    }

    public final kay d(String str, List list, List list2) {
        kay kayVar;
        hoq.y(!hoq.S(str), "missing metric name");
        synchronized (this.a) {
            Set set = this.b;
            if (set.contains(str)) {
                throw new IllegalStateException(a.Z(str, "Metric with name ", " already exists"));
            }
            int i = this.c;
            if (i + 1 == this.d.length) {
                b();
            }
            kayVar = new kay(i, str, list, list2);
            this.d[i] = kayVar;
            set.add(str);
            this.c++;
        }
        return kayVar;
    }
}
