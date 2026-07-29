package com.tapjoy.internal;

import android.os.SystemClock;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/* loaded from: classes2.dex */
public final class gl {

    /* renamed from: a, reason: collision with root package name */
    public long f8208a;

    /* renamed from: b, reason: collision with root package name */
    public long f8209b;

    /* renamed from: c, reason: collision with root package name */
    public long f8210c;

    /* JADX WARN: Removed duplicated region for block: B:25:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(String str, int i) {
        DatagramSocket datagramSocket;
        long elapsedRealtime;
        long j;
        long b2;
        long b3;
        long b4;
        long j2;
        try {
            DatagramSocket datagramSocket2 = new DatagramSocket();
            try {
                datagramSocket2.setSoTimeout(i);
                byte[] bArr = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, InetAddress.getByName(str), 123);
                bArr[0] = 27;
                long currentTimeMillis = System.currentTimeMillis();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j3 = currentTimeMillis / 1000;
                long j4 = currentTimeMillis - (j3 * 1000);
                long j5 = j3 + 2208988800L;
                bArr[40] = (byte) (j5 >> 24);
                try {
                    bArr[41] = (byte) (j5 >> 16);
                    try {
                        bArr[42] = (byte) (j5 >> 8);
                        bArr[43] = (byte) (j5 >> 0);
                        long j6 = (j4 * 4294967296L) / 1000;
                        bArr[44] = (byte) (j6 >> 24);
                        bArr[45] = (byte) (j6 >> 16);
                        bArr[46] = (byte) (j6 >> 8);
                        bArr[47] = (byte) (Math.random() * 255.0d);
                        datagramSocket = datagramSocket2;
                        try {
                            datagramSocket.send(datagramPacket);
                            datagramSocket.receive(new DatagramPacket(bArr, 48));
                            elapsedRealtime = SystemClock.elapsedRealtime();
                            long j7 = elapsedRealtime - elapsedRealtime2;
                            j = currentTimeMillis + j7;
                            b2 = b(bArr, 24);
                            b3 = b(bArr, 32);
                            b4 = b(bArr, 40);
                            j2 = j7 - (b4 - b3);
                        } catch (Exception unused) {
                            if (datagramSocket != null) {
                                return false;
                            }
                            datagramSocket.close();
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            if (datagramSocket != null) {
                                datagramSocket.close();
                            }
                            throw th;
                        }
                        try {
                            this.f8208a = j + (((b3 - b2) + (b4 - j)) / 2);
                            this.f8209b = elapsedRealtime;
                            this.f8210c = j2;
                            datagramSocket.close();
                            return true;
                        } catch (Exception unused2) {
                            if (datagramSocket != null) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (datagramSocket != null) {
                            }
                            throw th;
                        }
                    } catch (Exception unused3) {
                        datagramSocket = datagramSocket2;
                    } catch (Throwable th3) {
                        th = th3;
                        datagramSocket = datagramSocket2;
                    }
                } catch (Exception unused4) {
                    datagramSocket = datagramSocket2;
                } catch (Throwable th4) {
                    th = th4;
                    datagramSocket = datagramSocket2;
                }
            } catch (Exception unused5) {
                datagramSocket = datagramSocket2;
            } catch (Throwable th5) {
                th = th5;
                datagramSocket = datagramSocket2;
            }
        } catch (Exception unused6) {
            datagramSocket = null;
        } catch (Throwable th6) {
            th = th6;
            datagramSocket = null;
        }
    }

    private static long a(byte[] bArr, int i) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & 127) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        return (i2 << 24) + (i3 << 16) + (i4 << 8) + i5;
    }

    private static long b(byte[] bArr, int i) {
        return ((a(bArr, i) - 2208988800L) * 1000) + ((a(bArr, i + 4) * 1000) / 4294967296L);
    }
}
