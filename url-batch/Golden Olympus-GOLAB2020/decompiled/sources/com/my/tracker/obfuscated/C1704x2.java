package com.my.tracker.obfuscated;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.my.tracker.obfuscated.x2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1704x2 {

    /* renamed from: a, reason: collision with root package name */
    final Handler f21571a = AbstractC1658m.f21416a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicBoolean f21572b;

    /* renamed from: c, reason: collision with root package name */
    final Runnable f21573c;

    /* renamed from: d, reason: collision with root package name */
    final long f21574d;

    private C1704x2(long j4, final Runnable runnable) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f21572b = atomicBoolean;
        this.f21574d = j4;
        this.f21573c = new Runnable() { // from class: com.my.tracker.obfuscated.C3
            @Override // java.lang.Runnable
            public final void run() {
                C1704x2.this.a(runnable);
            }
        };
        atomicBoolean.set(false);
    }

    private void c() {
        this.f21571a.removeCallbacks(this.f21573c);
        this.f21572b.set(true);
        this.f21571a.postDelayed(this.f21573c, this.f21574d);
    }

    public boolean b() {
        boolean z4;
        synchronized (this.f21572b) {
            z4 = !this.f21572b.get();
        }
        return z4;
    }

    public void d() {
        synchronized (this.f21572b) {
            try {
                if (a()) {
                    c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        synchronized (this.f21572b) {
            try {
                if (!this.f21572b.get()) {
                    c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f() {
        synchronized (this.f21572b) {
            this.f21572b.set(false);
            this.f21571a.removeCallbacks(this.f21573c);
        }
    }

    public static C1704x2 a(long j4, Runnable runnable) {
        return new C1704x2(j4, runnable);
    }

    public boolean a() {
        boolean z4;
        synchronized (this.f21572b) {
            z4 = !b();
        }
        return z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Runnable runnable) {
        synchronized (this.f21572b) {
            try {
                if (this.f21572b.get()) {
                    c();
                    runnable.run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
