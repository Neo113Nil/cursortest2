package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bgh implements bge {
    private final List a;
    private final wq b;

    public bgh(List list, wq wqVar) {
        this.a = list;
        this.b = wqVar;
    }

    @Override // defpackage.bge
    public final boolean a(Object obj) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((bge) it.next()).a(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [bbh] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // defpackage.bge
    public final bvw b(Object obj, int i, int i2, bbl bblVar) {
        bvw b;
        List list = this.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        int i3 = 0;
        ?? r5 = 0;
        while (i3 < size) {
            bge bgeVar = (bge) list.get(i3);
            if (bgeVar.a(obj) && (b = bgeVar.b(obj, i, i2, bblVar)) != null) {
                arrayList.add(b.b);
                r5 = b.c;
            }
            i3++;
            r5 = r5;
        }
        if (arrayList.isEmpty() || r5 == 0) {
            return null;
        }
        return new bvw((bbh) r5, new bgg(arrayList, this.b));
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.a.toArray()) + "}";
    }
}
