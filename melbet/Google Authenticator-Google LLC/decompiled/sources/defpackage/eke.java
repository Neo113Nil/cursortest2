package defpackage;

import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eke extends ThreadLocal {
    final /* synthetic */ fwm a;

    public eke(fwm fwmVar) {
        this.a = fwmVar;
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        ekg ekgVar = new ekg();
        Thread currentThread = Thread.currentThread();
        Object obj = this.a.b;
        synchronized (obj) {
            ((WeakHashMap) obj).put(currentThread, ekgVar);
        }
        return ekgVar;
    }
}
