package com.facebook.ads.redexgen.X;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;

/* loaded from: assets/audience_network.dex */
public class L5 extends Thread implements Closeable {
    public boolean A00 = false;
    public final /* synthetic */ L6 A01;

    public L5(L6 l6) {
        this.A01 = l6;
        start();
    }

    public final synchronized void A00() {
        L4 l4;
        l4 = this.A01.A02;
        l4.A02();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        L4 l4;
        synchronized (this) {
            this.A00 = true;
            l4 = this.A01.A02;
            l4.A02();
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
        L4 l4;
        L4 l42;
        L4 l43;
        L4 l44;
        if (K0.A02(this)) {
            return;
        }
        while (true) {
            try {
                try {
                    try {
                        l42 = this.A01.A02;
                        l42.A04();
                        synchronized (this.A01) {
                            try {
                                synchronized (this) {
                                    try {
                                        boolean z = this.A00;
                                        l43 = this.A01.A02;
                                        boolean A05 = l43.A05();
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
                                l4 = this.A01.A02;
                                l4.A03();
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
                    K0.A00(th5, this);
                    return;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }
        synchronized (this.A01) {
            try {
                l44 = this.A01.A02;
                l44.A03();
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
