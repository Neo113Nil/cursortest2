package defpackage;

import java.util.Comparator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class hfn implements Comparator {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public hfn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kbm] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                ?? r2 = this.a;
                return ixe.j(Integer.valueOf(r2.get((ehs) obj) != null ? 0 : 1), Integer.valueOf(r2.get((ehs) obj2) != null ? 0 : 1));
            }
            ?? r22 = this.a;
            int a = r22.a(obj) - r22.a(obj2);
            return a != 0 ? a : obj.getClass().getName().compareTo(obj2.getClass().getName());
        }
        Map.Entry entry = (Map.Entry) obj;
        Map.Entry entry2 = (Map.Entry) obj2;
        Comparator comparator = hfs.b;
        entry.getClass();
        entry2.getClass();
        return this.a.compare(entry.getKey(), entry2.getKey());
    }

    public /* synthetic */ hfn(Comparator comparator, int i) {
        this.b = i;
        this.a = comparator;
    }
}
