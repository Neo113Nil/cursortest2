package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dhy implements ThreadFactory {
    public final Object a = new Object();
    public final Set b = Collections.newSetFromMap(new WeakHashMap());
    public final Set c = new qk(0);
    private final int d;

    public dhy(int i) {
        this.d = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        dhx dhxVar;
        synchronized (this.a) {
            dhxVar = new dhx(this.d, runnable);
            this.b.add(dhxVar);
            byte[] bArr = null;
            dhxVar.a = new dgc(this, dhxVar, 6, bArr);
            dhxVar.b = new dgc(this, dhxVar, 7, bArr);
        }
        return dhxVar;
    }
}
