package h7;

import f8.v0;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f4486b = new AtomicInteger();

    /* renamed from: c, reason: collision with root package name */
    public final ThreadFactory f4487c = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final String f4485a = "GAC_Executor";

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f4487c.newThread(new v0(runnable, 1));
        int andIncrement = this.f4486b.getAndIncrement();
        int length = String.valueOf(andIncrement).length();
        String str = this.f4485a;
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + length + 1);
        sb2.append(str);
        sb2.append("[");
        sb2.append(andIncrement);
        sb2.append("]");
        newThread.setName(sb2.toString());
        return newThread;
    }
}
