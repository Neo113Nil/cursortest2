package defpackage;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cjy {
    public static final cjy a;
    public static final cjy b;
    public static final cjy c;
    public final hfm d;

    static {
        hfm hfmVar;
        EnumSet allOf = EnumSet.allOf(cjz.class);
        if (allOf instanceof Collection) {
            hfmVar = allOf.isEmpty() ? hjb.a : hef.a(EnumSet.copyOf((Collection) allOf));
        } else {
            Iterator it = allOf.iterator();
            if (it.hasNext()) {
                EnumSet of = EnumSet.of((Enum) it.next());
                hnu.N(of, it);
                hfmVar = hef.a(of);
            } else {
                hfmVar = hjb.a;
            }
        }
        a = new cjy(hfmVar);
        b = new cjy(hjb.a);
        c = new cjy(hef.a(EnumSet.of(cjz.ZWIEBACK, new cjz[0])));
    }

    public cjy(hfm hfmVar) {
        this.d = hfmVar;
    }

    public final boolean a(cjz cjzVar) {
        return this.d.contains(cjzVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cjy) && this.d.equals(((cjy) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
