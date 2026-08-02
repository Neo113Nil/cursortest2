package defpackage;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ibn implements ibk {
    public static final /* synthetic */ int e = 0;
    private static final ibi g;
    private static final ibi h;
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public final ibg c = f;
    public boolean d = false;
    private static final ibg f = new ibv(1);
    private static final ibm i = new ibm();

    static {
        final int i2 = 1;
        g = new ibi() { // from class: ibl
            @Override // defpackage.ibd
            public final void a(Object obj, Object obj2) {
                if (i2 == 0) {
                    int i3 = ibn.e;
                    ((ibj) obj2).d(((Boolean) obj).booleanValue());
                } else {
                    int i4 = ibn.e;
                    ((ibj) obj2).c((String) obj);
                }
            }
        };
        final int i3 = 0;
        h = new ibi() { // from class: ibl
            @Override // defpackage.ibd
            public final void a(Object obj, Object obj2) {
                if (i3 == 0) {
                    int i32 = ibn.e;
                    ((ibj) obj2).d(((Boolean) obj).booleanValue());
                } else {
                    int i4 = ibn.e;
                    ((ibj) obj2).c((String) obj);
                }
            }
        };
    }

    public ibn() {
        c(String.class, g);
        c(Boolean.class, h);
        c(Date.class, i);
    }

    @Override // defpackage.ibk
    public final /* bridge */ /* synthetic */ void a(Class cls, ibg ibgVar) {
        this.a.put(cls, ibgVar);
        this.b.remove(cls);
    }

    public final void b() {
        this.d = true;
    }

    public final void c(Class cls, ibi ibiVar) {
        this.b.put(cls, ibiVar);
        this.a.remove(cls);
    }
}
