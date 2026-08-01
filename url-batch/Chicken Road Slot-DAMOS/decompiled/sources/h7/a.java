package h7;

import f8.v0;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final String f4483a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadFactory f4484b = Executors.defaultThreadFactory();

    public a(String str) {
        this.f4483a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f4484b.newThread(new v0(runnable, 1));
        newThread.setName(this.f4483a);
        return newThread;
    }
}
