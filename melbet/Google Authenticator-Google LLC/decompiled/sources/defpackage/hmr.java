package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class hmr {
    private static final hmr a = new hml();

    public static hmr g(hma hmaVar, hma hmaVar2) {
        int b = hmaVar2.b();
        return b == 0 ? a : b <= 28 ? new hmp(hmaVar, hmaVar2) : new hmq(hmaVar, hmaVar2);
    }

    public abstract int a();

    public abstract Object b(hky hkyVar);

    public abstract Set c();

    public abstract void d(hmh hmhVar, Object obj);
}
