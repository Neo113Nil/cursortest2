package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kly extends ixe {
    public static final Logger a = Logger.getLogger(kly.class.getName());
    public static final kjm b = new kmj(khd.n, 0);
    public static final jyf c = new klx();
    private static final jxv u = jxv.b;
    private static final jxf v = jxf.a;
    private static final long w;
    public final khq s;
    final bst t = new bst(null, null, null);
    final List d = new ArrayList();
    public final List e = new ArrayList();
    public final List f = new ArrayList();
    public final List g = new ArrayList();
    public jyf h = c;
    public kjm i = b;
    public jxv j = u;
    public jxf k = v;
    long l = w;
    iwy r = jxs.b;
    public boolean m = true;
    public boolean n = true;
    public boolean o = true;
    public boolean p = true;
    jyl q = jyl.a;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        w = 120000L;
    }

    public kly(khq khqVar) {
        this.s = khqVar;
        Iterator it = jxh.a().b().iterator();
        while (it.hasNext()) {
            ((jxg) it.next()).b();
        }
    }
}
