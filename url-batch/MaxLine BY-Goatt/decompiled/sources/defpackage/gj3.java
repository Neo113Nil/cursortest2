package defpackage;

import java.lang.Thread;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gj3 implements Thread.UncaughtExceptionHandler {
    public final String a;
    public final /* synthetic */ lj3 b;

    public gj3(lj3 lj3Var, String str) {
        this.b = lj3Var;
        this.a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        vh3 vh3Var = ((pj3) this.b.m).r;
        pj3.m(vh3Var);
        vh3Var.r.c(th, this.a);
    }
}
