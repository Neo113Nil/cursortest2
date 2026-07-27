package j2;

import B1.C0097d;
import g.ThreadFactoryC0634b;
import java.lang.Thread;

/* renamed from: j2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0713c implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ThreadFactoryC0634b f7156a;

    public C0713c(ThreadFactoryC0634b threadFactoryC0634b) {
        this.f7156a = threadFactoryC0634b;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        ((C0097d) this.f7156a.f6666b).u(th);
    }
}
