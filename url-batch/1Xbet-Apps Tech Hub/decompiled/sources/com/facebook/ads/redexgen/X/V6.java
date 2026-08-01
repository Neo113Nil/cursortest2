package com.facebook.ads.redexgen.X;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: assets/audience_network.dex */
public final class V6 implements InterfaceC0529Gv {
    public HandlerC0523Gp<? extends InterfaceC0524Gq> A00;
    public IOException A01;
    public final ExecutorService A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final <T extends InterfaceC0524Gq> long A04(T t, InterfaceC0522Go<T> interfaceC0522Go, int i) {
        Looper myLooper = Looper.myLooper();
        HI.A04(myLooper != null);
        this.A01 = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC0523Gp(this, myLooper, t, interfaceC0522Go, i, elapsedRealtime).A06(0L);
        return elapsedRealtime;
    }

    public V6(String str) {
        this.A02 = C0557Hx.A0T(str);
    }

    public final void A05() {
        this.A00.A07(false);
    }

    public final void A06(int i) throws IOException {
        IOException iOException = this.A01;
        if (iOException == null) {
            HandlerC0523Gp<? extends InterfaceC0524Gq> handlerC0523Gp = this.A00;
            if (handlerC0523Gp != null) {
                if (i == Integer.MIN_VALUE) {
                    i = handlerC0523Gp.A03;
                }
                handlerC0523Gp.A05(i);
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void A07(InterfaceC0525Gr interfaceC0525Gr) {
        HandlerC0523Gp<? extends InterfaceC0524Gq> handlerC0523Gp = this.A00;
        if (handlerC0523Gp != null) {
            handlerC0523Gp.A07(true);
        }
        if (interfaceC0525Gr != null) {
            this.A02.execute(new RunnableC0526Gs(interfaceC0525Gr));
        }
        this.A02.shutdown();
    }

    public final boolean A08() {
        return this.A00 != null;
    }
}
