package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.48, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass48 {
    public boolean A00;
    public final AnonymousClass45 A01;

    public AnonymousClass48() {
        this(AnonymousClass45.A00);
    }

    public AnonymousClass48(AnonymousClass45 anonymousClass45) {
        this.A01 = anonymousClass45;
    }

    public final synchronized void A00() throws InterruptedException {
        while (!this.A00) {
            wait();
        }
    }

    public final synchronized void A01() {
        boolean z8 = false;
        while (true) {
            boolean wasInterrupted = this.A00;
            if (wasInterrupted) {
                break;
            }
            try {
                wait();
            } catch (InterruptedException unused) {
                z8 = true;
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean A02() {
        boolean z8;
        z8 = this.A00;
        this.A00 = false;
        return z8;
    }

    public final synchronized boolean A03() {
        return this.A00;
    }

    public final synchronized boolean A04() {
        if (this.A00) {
            return false;
        }
        this.A00 = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean A05(long j9) throws InterruptedException {
        if (j9 <= 0) {
            return this.A00;
        }
        long nowMs = this.A01.A6J();
        long j10 = nowMs + j9;
        if (j10 < nowMs) {
            A00();
        } else {
            while (!this.A00 && nowMs < j10) {
                long endMs = j10 - nowMs;
                wait(endMs);
                nowMs = this.A01.A6J();
            }
        }
        return this.A00;
    }
}
