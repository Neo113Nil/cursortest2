package com.facebook.ads.redexgen.X;

import com.facebook.ads.redexgen.X.XD;
import com.facebook.ads.redexgen.X.XE;
import java.lang.Exception;
import java.util.ArrayDeque;

/* loaded from: assets/audience_network.dex */
public abstract class XC<I extends XE, O extends XD, E extends Exception> implements InterfaceC0392At<I, O, E> {
    public int A00;
    public int A01;
    public int A02;
    public I A03;
    public E A04;
    public boolean A05;
    public boolean A06;
    public final Thread A08;
    public final I[] A0B;
    public final O[] A0C;
    public final Object A07 = new Object();
    public final ArrayDeque<I> A09 = new ArrayDeque<>();
    public final ArrayDeque<O> A0A = new ArrayDeque<>();

    public abstract I A0T();

    public abstract O A0V();

    public abstract E A0W(I i, O o, boolean z);

    public abstract E A0X(Throwable th);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XC != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.XE, O extends com.facebook.ads.redexgen.X.XD, E extends java.lang.Exception> */
    /* JADX WARN: Incorrect condition in loop: B:3:0x0020 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x0035 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public XC(I[] inputBuffers, O[] outputBuffers) {
        this.A0B = inputBuffers;
        this.A00 = inputBuffers.length;
        for (int i = 0; i < i; i++) {
            this.A0B[i] = A0T();
        }
        this.A0C = outputBuffers;
        this.A01 = outputBuffers.length;
        for (int i2 = 0; i2 < i; i2++) {
            this.A0C[i2] = A0V();
        }
        C0395Aw c0395Aw = new C0395Aw(this);
        this.A08 = c0395Aw;
        c0395Aw.start();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XC != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.XE, O extends com.facebook.ads.redexgen.X.XD, E extends java.lang.Exception> */
    private void A0K() {
        if (A0Q()) {
            this.A07.notify();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XC != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.XE, O extends com.facebook.ads.redexgen.X.XD, E extends java.lang.Exception> */
    private void A0L() throws Exception {
        E e = this.A04;
        if (e == null) {
        } else {
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XC != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.XE, O extends com.facebook.ads.redexgen.X.XD, E extends java.lang.Exception> */
    public void A0M() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (A0R());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XC != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.XE, O extends com.facebook.ads.redexgen.X.XD, E extends java.lang.Exception> */
    private void A0N(I inputBuffer) {
        inputBuffer.A07();
        I[] iArr = this.A0B;
        int i = this.A00;
        this.A00 = i + 1;
        iArr[i] = inputBuffer;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XC != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.XE, O extends com.facebook.ads.redexgen.X.XD, E extends java.lang.Exception> */
    private void A0O(O outputBuffer) {
        outputBuffer.A07();
        O[] oArr = this.A0C;
        int i = this.A01;
        this.A01 = i + 1;
        oArr[i] = outputBuffer;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XC != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.XE, O extends com.facebook.ads.redexgen.X.XD, E extends java.lang.Exception> */
    private boolean A0Q() {
        return !this.A09.isEmpty() && this.A01 > 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XC != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.XE, O extends com.facebook.ads.redexgen.X.XD, E extends java.lang.Exception> */
    private boolean A0R() throws InterruptedException {
        synchronized (this.A07) {
            while (!this.A06 && !A0Q()) {
                this.A07.wait();
            }
            if (this.A06) {
                return false;
            }
            I removeFirst = this.A09.removeFirst();
            O[] oArr = this.A0C;
            int i = this.A01 - 1;
            this.A01 = i;
            O o = oArr[i];
            boolean z = this.A05;
            this.A05 = false;
            if (removeFirst.A04()) {
                o.A00(4);
            } else {
                if (removeFirst.A03()) {
                    o.A00(Integer.MIN_VALUE);
                }
                try {
                    this.A04 = A0W(removeFirst, o, z);
                } catch (OutOfMemoryError e) {
                    this.A04 = A0X(e);
                } catch (RuntimeException e2) {
                    this.A04 = A0X(e2);
                }
                if (this.A04 != null) {
                    synchronized (this.A07) {
                    }
                    return false;
                }
            }
            synchronized (this.A07) {
                if (this.A05) {
                    A0O(o);
                } else if (o.A03()) {
                    this.A02++;
                    A0O(o);
                } else {
                    o.A00 = this.A02;
                    this.A02 = 0;
                    this.A0A.addLast(o);
                }
                A0N(removeFirst);
            }
            return true;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XC != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.XE, O extends com.facebook.ads.redexgen.X.XD, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0392At
    /* renamed from: A0S, reason: merged with bridge method [inline-methods] */
    public final I A50() throws Exception {
        I i;
        synchronized (this.A07) {
            A0L();
            HI.A04(this.A03 == null);
            int i2 = this.A00;
            if (i2 == 0) {
                i = null;
            } else {
                I[] iArr = this.A0B;
                int i3 = i2 - 1;
                this.A00 = i3;
                i = iArr[i3];
            }
            this.A03 = i;
        }
        return i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XC != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.XE, O extends com.facebook.ads.redexgen.X.XD, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0392At
    /* renamed from: A0U, reason: merged with bridge method [inline-methods] */
    public final O A51() throws Exception {
        synchronized (this.A07) {
            A0L();
            if (this.A0A.isEmpty()) {
                return null;
            }
            return this.A0A.removeFirst();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XC != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.XE, O extends com.facebook.ads.redexgen.X.XD, E extends java.lang.Exception> */
    public final void A0Y(int i) {
        HI.A04(this.A00 == this.A0B.length);
        for (I i2 : this.A0B) {
            i2.A09(i);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XC != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.XE, O extends com.facebook.ads.redexgen.X.XD, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0392At
    /* renamed from: A0Z, reason: merged with bridge method [inline-methods] */
    public final void AE8(I inputBuffer) throws Exception {
        synchronized (this.A07) {
            A0L();
            HI.A03(inputBuffer == this.A03);
            this.A09.addLast(inputBuffer);
            A0K();
            this.A03 = null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XC != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.XE, O extends com.facebook.ads.redexgen.X.XD, E extends java.lang.Exception> */
    public void A0a(O outputBuffer) {
        synchronized (this.A07) {
            A0O(outputBuffer);
            A0K();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XC != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.XE, O extends com.facebook.ads.redexgen.X.XD, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0392At
    public final void AEO() {
        synchronized (this.A07) {
            this.A06 = true;
            this.A07.notify();
        }
        try {
            this.A08.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XC != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.XE, O extends com.facebook.ads.redexgen.X.XD, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0392At
    public final void flush() {
        synchronized (this.A07) {
            this.A05 = true;
            this.A02 = 0;
            I i = this.A03;
            if (i != null) {
                A0N(i);
                this.A03 = null;
            }
            while (!this.A09.isEmpty()) {
                A0N(this.A09.removeFirst());
            }
            while (!this.A0A.isEmpty()) {
                A0O(this.A0A.removeFirst());
            }
        }
    }
}
