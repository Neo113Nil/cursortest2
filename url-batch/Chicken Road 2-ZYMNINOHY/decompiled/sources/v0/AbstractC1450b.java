package v0;

import E.AbstractC0005f;
import android.os.SystemClock;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;

/* renamed from: v0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1450b {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f15531a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f15532b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f15533c;

    /* renamed from: d, reason: collision with root package name */
    public static long f15534d;

    public static long a() {
        byte b4;
        SocketTimeoutException socketTimeoutException;
        byte[] bArr;
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            Object obj = f15532b;
            synchronized (obj) {
            }
            datagramSocket.setSoTimeout(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
            synchronized (obj) {
            }
            InetAddress[] allByName = InetAddress.getAllByName("time.android.com");
            int length = allByName.length;
            byte b5 = 0;
            SocketTimeoutException socketTimeoutException2 = null;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                byte[] bArr2 = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr2, 48, allByName[i4], 123);
                bArr2[b5] = 27;
                long currentTimeMillis = System.currentTimeMillis();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (currentTimeMillis == 0) {
                    Arrays.fill(bArr2, 40, 48, b5);
                    b4 = b5;
                    socketTimeoutException = socketTimeoutException2;
                    bArr = bArr2;
                } else {
                    long j4 = currentTimeMillis / 1000;
                    long j5 = currentTimeMillis - (j4 * 1000);
                    b4 = b5;
                    socketTimeoutException = socketTimeoutException2;
                    long j6 = j4 + 2208988800L;
                    bArr = bArr2;
                    bArr[40] = (byte) (j6 >> 24);
                    bArr[41] = (byte) (j6 >> 16);
                    bArr[42] = (byte) (j6 >> 8);
                    bArr[43] = (byte) j6;
                    long j7 = (j5 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j7 >> 24);
                    bArr[45] = (byte) (j7 >> 16);
                    bArr[46] = (byte) (j7 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                }
                datagramSocket.send(datagramPacket);
                byte[] bArr3 = bArr;
                try {
                    datagramSocket.receive(new DatagramPacket(bArr3, 48));
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j8 = (elapsedRealtime2 - elapsedRealtime) + currentTimeMillis;
                    byte b6 = bArr3[b4];
                    int i6 = bArr3[1] & 255;
                    long d4 = d(24, bArr3);
                    long d5 = d(32, bArr3);
                    long d6 = d(40, bArr3);
                    b((byte) ((b6 >> 6) & 3), (byte) (b6 & 7), i6, d6);
                    long j9 = (j8 + (((d6 - j8) + (d5 - d4)) / 2)) - elapsedRealtime2;
                    datagramSocket.close();
                    return j9;
                } catch (SocketTimeoutException e4) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException2 = e4;
                    } else {
                        SocketTimeoutException socketTimeoutException3 = socketTimeoutException;
                        socketTimeoutException3.addSuppressed(e4);
                        socketTimeoutException2 = socketTimeoutException3;
                    }
                    int i7 = i5 + 1;
                    if (i5 >= 10) {
                        break;
                    }
                    i4++;
                    i5 = i7;
                    b5 = b4;
                }
            }
            socketTimeoutException2.getClass();
            throw socketTimeoutException2;
        } finally {
        }
    }

    public static void b(byte b4, byte b5, int i4, long j4) {
        if (b4 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b5 != 4 && b5 != 5) {
            throw new IOException(AbstractC0005f.j(b5, "SNTP: Untrusted mode: "));
        }
        if (i4 == 0 || i4 > 15) {
            throw new IOException(AbstractC0005f.j(i4, "SNTP: Untrusted stratum: "));
        }
        if (j4 == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static long c(int i4, byte[] bArr) {
        int i5 = bArr[i4];
        int i6 = bArr[i4 + 1];
        int i7 = bArr[i4 + 2];
        int i8 = bArr[i4 + 3];
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        if ((i6 & 128) == 128) {
            i6 = (i6 & 127) + 128;
        }
        if ((i7 & 128) == 128) {
            i7 = (i7 & 127) + 128;
        }
        if ((i8 & 128) == 128) {
            i8 = (i8 & 127) + 128;
        }
        return (i5 << 24) + (i6 << 16) + (i7 << 8) + i8;
    }

    public static long d(int i4, byte[] bArr) {
        long c4 = c(i4, bArr);
        long c5 = c(i4 + 4, bArr);
        if (c4 == 0 && c5 == 0) {
            return 0L;
        }
        return ((c5 * 1000) / 4294967296L) + ((c4 - 2208988800L) * 1000);
    }
}
