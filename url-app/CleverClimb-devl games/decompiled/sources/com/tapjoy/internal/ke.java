package com.tapjoy.internal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class ke {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f8497a = Logger.getLogger(ke.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private final Queue f8498b = new LinkedList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f8499c = false;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        final Runnable f8500a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f8501b;
    }

    public final void a() {
        synchronized (this.f8498b) {
            if (this.f8499c) {
                return;
            }
            this.f8499c = true;
            while (!this.f8498b.isEmpty()) {
                a aVar = (a) this.f8498b.poll();
                try {
                    aVar.f8501b.execute(aVar.f8500a);
                } catch (RuntimeException e) {
                    f8497a.log(Level.SEVERE, "RuntimeException while executing runnable " + aVar.f8500a + " with executor " + aVar.f8501b, (Throwable) e);
                }
            }
        }
    }
}
