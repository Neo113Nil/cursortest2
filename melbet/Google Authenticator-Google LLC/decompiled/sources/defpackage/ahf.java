package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahf {
    private final ahg a;
    private final List b;
    private final List c;
    private final int d;
    private List e;

    public ahf(ahg ahgVar, List list, List list2, int i) {
        this.a = ahgVar;
        this.b = list;
        this.c = list2;
        this.d = i;
    }

    public final List a() {
        List list = this.e;
        if (list == null) {
            kpt kptVar = new kpt(10);
            kptVar.addAll(this.b);
            ahg ahgVar = this.a;
            if (ahgVar != null) {
                kptVar.add(ahgVar);
            }
            kptVar.addAll(this.c);
            list = ixc.a(kptVar);
            this.e = list;
        }
        list.getClass();
        return list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ahf ahfVar = (ahf) obj;
        return this.d == ahfVar.d && ksp.b(a(), ahfVar.a());
    }

    public final int hashCode() {
        return (this.d * 31) + a().hashCode();
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.d + ", mergedHistory=" + a() + ")";
    }

    public ahf() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ahf(byte[] bArr) {
        this(null, r3, r3, -1);
        kpk kpkVar = kpk.a;
    }
}
