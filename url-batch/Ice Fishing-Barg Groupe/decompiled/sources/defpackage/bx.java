package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class bx implements y52 {
    public final i82 OPXfSBeufaJ8;
    public final OutputStream rtx2ld2ELZv4;
    public final /* synthetic */ e0 wdg6QnbFHrFF;

    public bx(e0 e0Var) {
        this.wdg6QnbFHrFF = e0Var;
        Socket socket = (Socket) e0Var.OPXfSBeufaJ8;
        this.rtx2ld2ELZv4 = socket.getOutputStream();
        this.OPXfSBeufaJ8 = new i82(socket);
    }

    @Override // defpackage.y52
    public final yj2 TSizfFm2Yiuu() {
        return this.OPXfSBeufaJ8;
    }

    @Override // defpackage.y52
    public final void VhhvGxCb8gfr(long j, yf yfVar) {
        cs0.cpQdD2nAriOS(yfVar.OPXfSBeufaJ8, 0L, j);
        while (j > 0) {
            i82 i82Var = this.OPXfSBeufaJ8;
            i82Var.a92UlCVFR9N8();
            z12 z12Var = yfVar.rtx2ld2ELZv4;
            z12Var.getClass();
            int min = (int) Math.min(j, z12Var.TSizfFm2Yiuu - z12Var.lS5Rgt96tfkO);
            i82Var.wdg6QnbFHrFF();
            try {
                try {
                    this.rtx2ld2ELZv4.write(z12Var.PxuCJdSBwIXG, z12Var.lS5Rgt96tfkO, min);
                    if (i82Var.dgRBjINgWbAK()) {
                        throw i82Var.x50lh2ztY7Y5(null);
                    }
                    int i = z12Var.lS5Rgt96tfkO + min;
                    z12Var.lS5Rgt96tfkO = i;
                    long j2 = min;
                    j -= j2;
                    yfVar.OPXfSBeufaJ8 -= j2;
                    if (i == z12Var.TSizfFm2Yiuu) {
                        yfVar.rtx2ld2ELZv4 = z12Var.PxuCJdSBwIXG();
                        d22.PxuCJdSBwIXG(z12Var);
                    }
                } catch (IOException e) {
                    if (!i82Var.dgRBjINgWbAK()) {
                        throw e;
                    }
                    throw i82Var.x50lh2ztY7Y5(e);
                }
            } catch (Throwable th) {
                i82Var.dgRBjINgWbAK();
                throw th;
            }
        }
    }

    @Override // defpackage.y52, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        OutputStream outputStream = this.rtx2ld2ELZv4;
        e0 e0Var = this.wdg6QnbFHrFF;
        i82 i82Var = this.OPXfSBeufaJ8;
        i82Var.wdg6QnbFHrFF();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) e0Var.wdg6QnbFHrFF;
            Socket socket = (Socket) e0Var.OPXfSBeufaJ8;
            atomicInteger.getClass();
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 1) != 0) {
                    i = 0;
                    break;
                }
                int i3 = i2 | 1;
                if (atomicInteger.compareAndSet(i2, i3)) {
                    i = i3;
                    break;
                }
            }
            if (i != 0) {
                if (i != 3) {
                    if (!socket.isClosed() && !socket.isOutputShutdown()) {
                        outputStream.flush();
                        try {
                            socket.shutdownOutput();
                        } catch (UnsupportedOperationException unused) {
                            outputStream.close();
                        }
                    }
                    return;
                }
                socket.close();
                if (i82Var.dgRBjINgWbAK()) {
                    throw i82Var.x50lh2ztY7Y5(null);
                }
            }
        } catch (IOException e) {
            if (!i82Var.dgRBjINgWbAK()) {
                throw e;
            }
            throw i82Var.x50lh2ztY7Y5(e);
        } finally {
            i82Var.dgRBjINgWbAK();
        }
    }

    @Override // defpackage.y52, java.io.Flushable
    public final void flush() {
        i82 i82Var = this.OPXfSBeufaJ8;
        i82Var.wdg6QnbFHrFF();
        try {
            this.rtx2ld2ELZv4.flush();
            if (i82Var.dgRBjINgWbAK()) {
                throw i82Var.x50lh2ztY7Y5(null);
            }
        } catch (IOException e) {
            if (!i82Var.dgRBjINgWbAK()) {
                throw e;
            }
            throw i82Var.x50lh2ztY7Y5(e);
        } finally {
            i82Var.dgRBjINgWbAK();
        }
    }

    public final String toString() {
        return "sink(" + ((Socket) this.wdg6QnbFHrFF.OPXfSBeufaJ8) + ')';
    }
}
