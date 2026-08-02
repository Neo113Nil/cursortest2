package defpackage;

import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gsz extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        gun gunVar = new gun(fao.g());
        Thread currentThread = Thread.currentThread();
        WeakHashMap weakHashMap = gta.c;
        synchronized (weakHashMap) {
            weakHashMap.put(currentThread, gunVar);
        }
        return gunVar;
    }
}
