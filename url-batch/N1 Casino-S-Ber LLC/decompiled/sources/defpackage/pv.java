package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class pv implements Comparator {
    public final /* synthetic */ ja a;

    public pv(ja jaVar) {
        this.a = jaVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare = this.a.compare(obj, obj2);
        if (compare != 0) {
            return compare;
        }
        Long valueOf = Long.valueOf(((fv) obj2).g);
        Long valueOf2 = Long.valueOf(((fv) obj).g);
        if (valueOf == valueOf2) {
            return 0;
        }
        return valueOf.compareTo(valueOf2);
    }
}
