package defpackage;

import android.os.StrictMode;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dfv implements ThreadFactory {
    public final /* synthetic */ ThreadFactory a;
    public final /* synthetic */ StrictMode.ThreadPolicy.Builder b;
    public final /* synthetic */ bst c;

    public /* synthetic */ dfv(bst bstVar, ThreadFactory threadFactory, StrictMode.ThreadPolicy.Builder builder) {
        this.c = bstVar;
        this.a = threadFactory;
        this.b = builder;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return this.a.newThread(new ajx((Object) this.c, (Object) this.b, (Object) runnable, 11, (byte[]) null));
    }
}
