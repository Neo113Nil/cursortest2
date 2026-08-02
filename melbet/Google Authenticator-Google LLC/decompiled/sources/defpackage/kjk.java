package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kjk implements kag {
    private final List a;
    private final kaf b;

    public kjk(List list, kaf kafVar) {
        this.a = hel.o(list);
        this.b = kafVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        if (((defpackage.his) r7).c == r5.d.size()) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // defpackage.kag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(kay kayVar, List list, List list2) {
        boolean z;
        boolean z2 = true;
        if (list != null) {
            if (((his) list).c == kayVar.c.size()) {
                z = true;
                hoq.A(z, "Incorrect number of required labels provided. Expected: %s", kayVar.c.size());
                if (list2 != null) {
                }
                z2 = false;
                hoq.A(z2, "Incorrect number of optional labels provided. Expected: %s", kayVar.d.size());
                for (kah kahVar : this.a) {
                    if (kahVar.a() <= kayVar.a) {
                        this.b.c();
                        kahVar.d();
                    }
                    kahVar.b();
                }
            }
        }
        z = false;
        hoq.A(z, "Incorrect number of required labels provided. Expected: %s", kayVar.c.size());
        if (list2 != null) {
        }
        z2 = false;
        hoq.A(z2, "Incorrect number of optional labels provided. Expected: %s", kayVar.d.size());
        while (r6.hasNext()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        if (((defpackage.his) r7).c == r5.d.size()) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // defpackage.kag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(kay kayVar, List list, List list2) {
        boolean z;
        boolean z2 = true;
        if (list != null) {
            if (((his) list).c == kayVar.c.size()) {
                z = true;
                hoq.A(z, "Incorrect number of required labels provided. Expected: %s", kayVar.c.size());
                if (list2 != null) {
                }
                z2 = false;
                hoq.A(z2, "Incorrect number of optional labels provided. Expected: %s", kayVar.d.size());
                for (kah kahVar : this.a) {
                    if (kahVar.a() <= kayVar.a) {
                        this.b.c();
                        kahVar.d();
                    }
                    kahVar.c();
                }
            }
        }
        z = false;
        hoq.A(z, "Incorrect number of required labels provided. Expected: %s", kayVar.c.size());
        if (list2 != null) {
        }
        z2 = false;
        hoq.A(z2, "Incorrect number of optional labels provided. Expected: %s", kayVar.d.size());
        while (r6.hasNext()) {
        }
    }
}
