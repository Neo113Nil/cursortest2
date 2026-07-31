package o2;

import android.os.SystemClock;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import n2.h0;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f19700a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f19701b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static boolean f19702c = false;

    /* renamed from: d, reason: collision with root package name */
    private static long f19703d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static String f19704e = "time.android.com";

    public interface b {
        void a();

        void b(IOException iOException);
    }

    private static final class c implements h0.b<h0.e> {

        /* renamed from: f, reason: collision with root package name */
        private final b f19705f;

        public c(b bVar) {
            this.f19705f = bVar;
        }

        @Override // n2.h0.b
        public void l(h0.e eVar, long j7, long j8) {
            if (this.f19705f != null) {
                if (d0.k()) {
                    this.f19705f.a();
                } else {
                    this.f19705f.b(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // n2.h0.b
        public void m(h0.e eVar, long j7, long j8, boolean z6) {
        }

        @Override // n2.h0.b
        public h0.c o(h0.e eVar, long j7, long j8, IOException iOException, int i7) {
            b bVar = this.f19705f;
            if (bVar != null) {
                bVar.b(iOException);
            }
            return n2.h0.f19436f;
        }
    }

    private static final class d implements h0.e {
        private d() {
        }

        @Override // n2.h0.e
        public void a() {
            synchronized (d0.f19700a) {
                synchronized (d0.f19701b) {
                    if (d0.f19702c) {
                        return;
                    }
                    long l7 = d0.l();
                    synchronized (d0.f19701b) {
                        long unused = d0.f19703d = l7;
                        boolean unused2 = d0.f19702c = true;
                    }
                }
            }
        }

        @Override // n2.h0.e
        public void c() {
        }
    }

    private static void g(byte b7, byte b8, int i7, long j7) {
        if (b7 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b8 != 4 && b8 != 5) {
            throw new IOException("SNTP: Untrusted mode: " + ((int) b8));
        }
        if (i7 != 0 && i7 <= 15) {
            if (j7 == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
        } else {
            throw new IOException("SNTP: Untrusted stratum: " + i7);
        }
    }

    public static long h() {
        long j7;
        synchronized (f19701b) {
            j7 = f19702c ? f19703d : -9223372036854775807L;
        }
        return j7;
    }

    public static String i() {
        String str;
        synchronized (f19701b) {
            str = f19704e;
        }
        return str;
    }

    public static void j(n2.h0 h0Var, b bVar) {
        if (k()) {
            if (bVar != null) {
                bVar.a();
            }
        } else {
            if (h0Var == null) {
                h0Var = new n2.h0("SntpClient");
            }
            h0Var.n(new d(), new c(bVar), 1);
        }
    }

    public static boolean k() {
        boolean z6;
        synchronized (f19701b) {
            z6 = f19702c;
        }
        return z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long l() {
        InetAddress byName = InetAddress.getByName(i());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            o(bArr, 40, currentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j7 = currentTimeMillis + (elapsedRealtime2 - elapsedRealtime);
            byte b7 = (byte) ((bArr[0] >> 6) & 3);
            byte b8 = (byte) (bArr[0] & 7);
            int i7 = bArr[1] & 255;
            long n7 = n(bArr, 24);
            long n8 = n(bArr, 32);
            long n9 = n(bArr, 40);
            g(b7, b8, i7, n9);
            long j8 = (j7 + (((n8 - n7) + (n9 - j7)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j8;
        } catch (Throwable th) {
            try {
                datagramSocket.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static long m(byte[] bArr, int i7) {
        int i8 = bArr[i7];
        int i9 = bArr[i7 + 1];
        int i10 = bArr[i7 + 2];
        int i11 = bArr[i7 + 3];
        if ((i8 & 128) == 128) {
            i8 = (i8 & 127) + 128;
        }
        if ((i9 & 128) == 128) {
            i9 = (i9 & 127) + 128;
        }
        if ((i10 & 128) == 128) {
            i10 = (i10 & 127) + 128;
        }
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        return (i8 << 24) + (i9 << 16) + (i10 << 8) + i11;
    }

    private static long n(byte[] bArr, int i7) {
        long m7 = m(bArr, i7);
        long m8 = m(bArr, i7 + 4);
        if (m7 == 0 && m8 == 0) {
            return 0L;
        }
        return ((m7 - 2208988800L) * 1000) + ((m8 * 1000) / 4294967296L);
    }

    private static void o(byte[] bArr, int i7, long j7) {
        if (j7 == 0) {
            Arrays.fill(bArr, i7, i7 + 8, (byte) 0);
            return;
        }
        long j8 = j7 / 1000;
        long j9 = j7 - (j8 * 1000);
        long j10 = j8 + 2208988800L;
        int i8 = i7 + 1;
        bArr[i7] = (byte) (j10 >> 24);
        int i9 = i8 + 1;
        bArr[i8] = (byte) (j10 >> 16);
        int i10 = i9 + 1;
        bArr[i9] = (byte) (j10 >> 8);
        int i11 = i10 + 1;
        bArr[i10] = (byte) (j10 >> 0);
        long j11 = (j9 * 4294967296L) / 1000;
        int i12 = i11 + 1;
        bArr[i11] = (byte) (j11 >> 24);
        int i13 = i12 + 1;
        bArr[i12] = (byte) (j11 >> 16);
        bArr[i13] = (byte) (j11 >> 8);
        bArr[i13 + 1] = (byte) (Math.random() * 255.0d);
    }
}
