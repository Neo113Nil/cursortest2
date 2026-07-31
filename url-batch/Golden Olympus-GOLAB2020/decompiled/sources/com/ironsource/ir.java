package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class ir implements Runnable {
    public abstract void a();

    public void a(@NotNull Throwable t4) {
        Intrinsics.checkNotNullParameter(t4, "t");
        wt.a(t4);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            a();
        } catch (Throwable th) {
            o9.d().a(th);
            try {
                a(th);
            } catch (Throwable th2) {
                o9.d().a(th2);
            }
        }
    }
}
