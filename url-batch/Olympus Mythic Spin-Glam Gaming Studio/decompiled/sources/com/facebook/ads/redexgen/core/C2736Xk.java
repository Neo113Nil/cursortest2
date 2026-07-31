package com.facebook.ads.redexgen.core;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;

/* renamed from: com.facebook.ads.redexgen.X.Xk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2736Xk extends Thread implements Closeable {
    public boolean A00 = false;
    public final /* synthetic */ C2737Xl A01;

    public C2736Xk(C2737Xl c2737Xl) {
        this.A01 = c2737Xl;
        start();
    }

    public final synchronized void A00() {
        C2735Xj c2735Xj;
        c2735Xj = this.A01.A02;
        c2735Xj.A02();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C2735Xj c2735Xj;
        synchronized (this) {
            this.A00 = true;
            c2735Xj = this.A01.A02;
            c2735Xj.A02();
        }
        try {
            join();
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
    
        if (r1 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
    
        if (r0 == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002c, code lost:
    
        r0 = r5.A01.A03;
        r0.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x004d, code lost:
    
        r2 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x005b, code lost:
    
        monitor-enter(r5.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x005c, code lost:
    
        r0 = r5.A01.A02;
        r0.A03();
        r5.A01.A00 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006b, code lost:
    
        throw r2;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        C2735Xj c2735Xj;
        C2735Xj c2735Xj2;
        C2735Xj c2735Xj3;
        C2735Xj c2735Xj4;
        if (WU.A02(this)) {
            return;
        }
        while (true) {
            try {
                try {
                    try {
                        c2735Xj2 = this.A01.A02;
                        c2735Xj2.A04();
                        synchronized (this.A01) {
                            try {
                                synchronized (this) {
                                    try {
                                        boolean z = this.A00;
                                        c2735Xj3 = this.A01.A02;
                                        boolean A05 = c2735Xj3.A05();
                                    } finally {
                                        th = th;
                                        while (true) {
                                            try {
                                            } catch (Throwable th) {
                                                th = th;
                                            }
                                        }
                                    }
                                }
                                try {
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        throw th;
                    } catch (Exception unused) {
                        synchronized (this.A01) {
                            try {
                                c2735Xj = this.A01.A02;
                                c2735Xj.A03();
                                this.A01.A00 = null;
                                return;
                            } finally {
                                th = th;
                                while (true) {
                                    try {
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th5) {
                    WU.A00(th5, this);
                    return;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }
        synchronized (this.A01) {
            try {
                c2735Xj4 = this.A01.A02;
                c2735Xj4.A03();
                this.A01.A00 = null;
            } catch (Throwable th7) {
                th = th7;
                while (true) {
                    try {
                        throw th;
                    } catch (Throwable th8) {
                    }
                }
            }
        }
    }
}
