package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azg {
    public static final /* synthetic */ int a = 0;

    static {
        asq.b("DiagnosticsWrkr");
    }

    public static final void a(axm axmVar, ayf ayfVar, axi axiVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            axt axtVar = (axt) it.next();
            axh a2 = axiVar.a(abf.u(axtVar));
            Integer valueOf = a2 != null ? Integer.valueOf(a2.c) : null;
            String str = axtVar.b;
            ixc.y(axmVar.a(str), ",", null, null, null, 62);
            ixc.y(ayfVar.a(str), ",", null, null, null, 62);
            String str2 = axtVar.d;
            axtVar.c.name();
            Objects.toString(valueOf);
        }
    }
}
