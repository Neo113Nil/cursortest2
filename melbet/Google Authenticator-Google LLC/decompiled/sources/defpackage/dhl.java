package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dhl implements ThreadFactory {
    public final HashSet a = new HashSet();
    private final ThreadFactory b;

    public dhl(ThreadFactory threadFactory) {
        this.b = threadFactory;
    }

    public final ArrayList a() {
        ArrayList arrayList;
        HashSet hashSet = this.a;
        synchronized (hashSet) {
            arrayList = new ArrayList(hashSet);
        }
        return arrayList;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.b.newThread(new dgc(this, runnable, 5));
        if (newThread == null) {
            return newThread;
        }
        HashSet hashSet = this.a;
        synchronized (hashSet) {
            hashSet.add(newThread);
        }
        return newThread;
    }
}
