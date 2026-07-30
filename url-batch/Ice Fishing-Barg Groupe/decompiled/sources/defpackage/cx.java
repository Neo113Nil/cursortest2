package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class cx implements o82 {
    public final i82 OPXfSBeufaJ8;
    public final InputStream rtx2ld2ELZv4;
    public final /* synthetic */ e0 wdg6QnbFHrFF;

    public cx(e0 e0Var) {
        this.wdg6QnbFHrFF = e0Var;
        Socket socket = (Socket) e0Var.OPXfSBeufaJ8;
        this.rtx2ld2ELZv4 = socket.getInputStream();
        this.OPXfSBeufaJ8 = new i82(socket);
    }

    @Override // defpackage.o82
    public final long RAsUl2FVSrh6(long j, yf yfVar) {
        i82 i82Var = this.OPXfSBeufaJ8;
        i82Var.a92UlCVFR9N8();
        z12 kpCQ9veP6n3I = yfVar.kpCQ9veP6n3I(1);
        int min = (int) Math.min(8192L, 8192 - kpCQ9veP6n3I.TSizfFm2Yiuu);
        try {
            i82Var.wdg6QnbFHrFF();
            try {
                int read = this.rtx2ld2ELZv4.read(kpCQ9veP6n3I.PxuCJdSBwIXG, kpCQ9veP6n3I.TSizfFm2Yiuu, min);
                if (i82Var.dgRBjINgWbAK()) {
                    throw i82Var.x50lh2ztY7Y5(null);
                }
                if (read != -1) {
                    kpCQ9veP6n3I.TSizfFm2Yiuu += read;
                    long j2 = read;
                    yfVar.OPXfSBeufaJ8 += j2;
                    return j2;
                }
                if (kpCQ9veP6n3I.lS5Rgt96tfkO != kpCQ9veP6n3I.TSizfFm2Yiuu) {
                    return -1L;
                }
                yfVar.rtx2ld2ELZv4 = kpCQ9veP6n3I.PxuCJdSBwIXG();
                d22.PxuCJdSBwIXG(kpCQ9veP6n3I);
                return -1L;
            } catch (IOException e) {
                if (i82Var.dgRBjINgWbAK()) {
                    throw i82Var.x50lh2ztY7Y5(e);
                }
                throw e;
            } finally {
                i82Var.dgRBjINgWbAK();
            }
        } catch (AssertionError e2) {
            if (jv2.PxuCJdSBwIXG(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    @Override // defpackage.o82
    public final yj2 TSizfFm2Yiuu() {
        return this.OPXfSBeufaJ8;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        e0 e0Var = this.wdg6QnbFHrFF;
        i82 i82Var = this.OPXfSBeufaJ8;
        i82Var.wdg6QnbFHrFF();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) e0Var.wdg6QnbFHrFF;
            Socket socket = (Socket) e0Var.OPXfSBeufaJ8;
            atomicInteger.getClass();
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 2) != 0) {
                    i = 0;
                    break;
                }
                int i3 = i2 | 2;
                if (atomicInteger.compareAndSet(i2, i3)) {
                    i = i3;
                    break;
                }
            }
            if (i != 0) {
                if (i == 3) {
                    socket.close();
                } else {
                    if (socket.isClosed() || socket.isInputShutdown()) {
                        return;
                    }
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.rtx2ld2ELZv4.close();
                    }
                }
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

    public final String toString() {
        return "source(" + ((Socket) this.wdg6QnbFHrFF.OPXfSBeufaJ8) + ')';
    }
}
