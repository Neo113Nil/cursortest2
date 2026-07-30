package com.baidu.sec.privacy.f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import cn.hutool.core.util.l;
import com.google.common.primitives.UnsignedBytes;
import h4.p;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f10661a = a(new byte[]{a4.a.f19b1, a4.a.f82s1, 112, a4.a.X0, a4.a.f55k1, a4.a.f15a1, 32, 51, 50, 45, a4.a.Y0, 121, a4.a.f73p1, a4.a.f19b1, 32, a4.a.f43h1});

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f10662b = {34, a4.a.f82s1, a4.a.V0, 28, 86, a4.a.f85t1, a4.a.C0, a4.a.f16a2, a4.a.f31e1, -79, a4.a.f58l0, a4.a.f85t1, a4.a.O0, -26, a4.a.S1, a4.a.f91v1, a4.a.M1, -25, 25, 17, 88, a4.a.f100y1, a4.a.G1, -8, 0, 33, 70, -4, -1, -110, a4.a.f28d2, a4.a.S1, 5, a4.a.N0, a4.a.f24c2, -27, -98, -7, a4.a.f66n0, a4.a.f91v1, a4.a.Y1, 47, a4.a.E1, a4.a.f91v1, 20, a4.a.f44h2, 74, a4.a.K1, a4.a.f28d2, a4.a.f73p1, -101, -8, -89, a4.a.f20b2, a4.a.Z0, a4.a.B1, 9, 55, a4.a.f43h1, p.f16767c, a4.a.I1, 5, -79, a4.a.C0, 64, -110, -51, 78, -29, a4.a.M0, -51, 63, a4.a.V1, a4.a.Z1, a4.a.f39g1, 43, 10, a4.a.N1, -98, -112, -50, -87, -98, a4.a.P1, -61, -39, 57, a4.a.X1, -31, a4.a.S1, 80, a4.a.S0, a4.a.f66n0, -25, 45, -119, p.f16767c, a4.a.Q1, -56, -101, -23, a4.a.D0, a4.a.P1, -52, a4.a.f91v1, a4.a.P0, 61, -20, a4.a.f79r1, -105, a4.a.Y1, a4.a.f23c1, -27, 86, 17, a4.a.f40g2, -110, 75, -59, a4.a.f88u1, -24, a4.a.f66n0, a4.a.f76q1, 48, 11, 11, a4.a.f100y1, 9, 12, -57, a4.a.V0, a4.a.O1, -30, -47, -4, a4.a.f51j1, a4.a.f36f2, a4.a.f19b1, a4.a.f50j0, a4.a.P1, a4.a.Z1, a4.a.X1, -25, 66, -41, -43, -28, a4.a.T1, -50, 33, -65, 10, -94, 5, -49, -36, 64, -101, a4.a.R0, a4.a.f52j2, 78, 35, -44, 94, -53, -28, a4.a.f70o1, a4.a.f43h1, a4.a.f76q1, -81, -6, 51, 86, a4.a.f58l0, a4.a.J1, -80, a4.a.f55k1, a4.a.f20b2, -30, -9, 49, -49, a4.a.f15a1, 50, -41, 20, -97, 32, -34, a4.a.f44h2, 60, -25, 53, -97, 35, -37, -122, -122, -80, 41, 54, 0, -9, -111, 55, a4.a.T0, 17, 41, a4.a.O0, -49, a4.a.Z1, 51, 9, 56, a4.a.U0, a4.a.X0, a4.a.f103z1, 85, 4, a4.a.I1, -48, a4.a.f51j1, -57, a4.a.W0, -31, a4.a.L1, a4.a.f20b2, -87, a4.a.W1, a4.a.V1, -52, a4.a.C0, a4.a.f43h1, 66, -103, 35, 5, 47, -112, 39, -58, a4.a.f19b1, 77, -21, 4, -59, 41, -3, 35, -36, a4.a.f72p0, a4.a.f51j1, a4.a.f58l0, -111, a4.a.f70o1, 23};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f10663c = {0, a4.a.f24c2, a4.a.f66n0, -20, -46, a4.a.f52j2, -1, a4.a.I1, 74, -47, a4.a.f97x1, a4.a.Q1, 23, -7, -79, -117, a4.a.Q1, a4.a.O0, 94, 22, -56, 34, a4.a.f20b2, a4.a.G, 52, a4.a.f27d1, a4.a.R1, a4.a.Q1, -58, -3, 60, -16, a4.a.U0, 55, 73, -24, 47, a4.a.A1, 16, 17, -96, -42, a4.a.W0, a4.a.V0, 61, a4.a.Q1, 43, a4.a.f16a2, -47, a4.a.L0, a4.a.D0, -106, -59, 67, a4.a.f27d1, 34, a4.a.M0, -88, a4.a.O1, -19, a4.a.f40g2, -112, a4.a.C0, 17, 94, a4.a.f50j0, -48, 35, -62, 23, -56, -65, -2, 43, a4.a.I0, -119, -50, -59, a4.a.Q1, -119, 17, -66, -99, a4.a.T0, a4.a.f20b2, -111, -64, 10, -30, -64, 70, 52, a4.a.X0, 33, a4.a.f67n1, a4.a.f40g2, 63, 71, -54, -54, a4.a.W1, -6, 79, -53, 24, 79, -81, 24, -48, 1, 23, -63, a4.a.S0, a4.a.R1, -83, a4.a.D1, -1, a4.a.f66n0, Byte.MAX_VALUE, -46, a4.a.V0, 3, 77, -39, -81, a4.a.f88u1, a4.a.f67n1, 20, a4.a.S0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f10664d = {0, a4.a.H1, 121, 53, -39, a4.a.f20b2, a4.a.R1, -23, -65, a4.a.S1, -19, a4.a.E1, 122, -49, 73, a4.a.N0, a4.a.Y1, a4.a.f48i2, a4.a.f78r0, -59, -98, a4.a.D0, -81, 55, 24, -24, a4.a.G, -60, -106, 31, a4.a.G0, -3, 54, 6, -25, 67, a4.a.N0, -87, -60, 24, 51, 57, a4.a.f16a2, 9, -25, -62, -82, 28, a4.a.P0, -101, -89, 71, 91, a4.a.C1, -48, 17, -83, a4.a.f16a2, a4.a.W1, 121, a4.a.D1, a4.a.f76q1, 73, a4.a.B1, a4.a.f35f1, a4.a.U0, a4.a.T1, 14, a4.a.H1, 20, a4.a.V1, 54, 8, a4.a.f58l0, -94, 47, -6, 39, 17, 10, 61, a4.a.Y0, -87, -109, a4.a.M0, 52, 9, -96, -2, a4.a.f35f1, a4.a.f47i1, 70, 88, -8, 75, -35, 32, a4.a.f100y1, a4.a.M1, 55, 9, -96, 16, a4.a.R0, -79, a4.a.K1, -83, -51, 0, 35, 61, a4.a.f24c2, a4.a.Q0, a4.a.B1, a4.a.Y1, 41, 31, -99, a4.a.f15a1, a4.a.I1, -8, a4.a.A1, a4.a.L0, -122, a4.a.f79r1, -105, a4.a.M1, -20, 4, a4.a.W1, 52, a4.a.Q1, a4.a.T1, a4.a.f78r0, a4.a.f76q1, -23, -104, a4.a.V0, -30, 61, -80, 41, 47, -63, 17, a4.a.G1, -97, -6, -99, a4.a.f100y1, a4.a.f100y1, -25, 51, a4.a.F1, a4.a.Z1, -110, a4.a.Z1, 48, -41, a4.a.f20b2, -29, 73, a4.a.S0, 47, a4.a.f31e1, 9, -104, a4.a.f67n1, 21, 57, 21, a4.a.G, 61, a4.a.f43h1, -117, 70, a4.a.P0, -58, 51, a4.a.M0, a4.a.H1, UnsignedBytes.MAX_POWER_OF_TWO, a4.a.D0, 50, a4.a.O1, -62, -32, a4.a.f44h2, a4.a.f67n1, -112, 37, a4.a.f55k1, 78, 63, -118, a4.a.D0, 8, 56, a4.a.N1, -60, 80, -28, -31, a4.a.G1, 26, 41, -93, a4.a.f85t1, -33, 94, a4.a.N1, 67, -34, 75, a4.a.f23c1, -1, 4, -112, a4.a.G0, -43, -49, 22, 35, -31, 88, -44, a4.a.D1, -58, 8, -23, Byte.MAX_VALUE, 33, 28, -40, 29, -54, 35, -53, a4.a.f55k1, 56, 7, a4.a.f19b1, -8, 34, -29, 66, -66, 72, 76, 5, 118, 57, 57, a4.a.W0, 28, -42, a4.a.f27d1};

    public static int a(int i8, int i9) {
        return (i8 >>> (-i9)) | (i8 << i9);
    }

    @SuppressLint({"NewApi"})
    public static String b(Context context) {
        try {
            IBinder binder = context.getContentResolver().call(Uri.parse("content://" + context.getPackageName() + ".helios.ipc.default"), "_method_get_bridge", "", new Bundle()).getBinder("bridge_binder");
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            obtain.writeInterfaceToken("com.baidu.helios.bridge.multiprocess.IMultiProcessBridge");
            obtain.writeString("aid");
            binder.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                return ((Bundle) Bundle.CREATOR.createFromParcel(obtain2)).getString("id");
            }
        } catch (Throwable th) {
            c.a(th);
        }
        return "";
    }

    public static String a(Context context) {
        ByteArrayOutputStream byteArrayOutputStream;
        FileInputStream fileInputStream = null;
        try {
            File a8 = com.baidu.sec.privacy.b.b.a(context).a(context.getFilesDir().getParent() + "/.helios/ids/aid/aid.dat");
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                FileInputStream fileInputStream2 = new FileInputStream(a8);
                try {
                    byte[] bArr = new byte[32];
                    while (true) {
                        int read = fileInputStream2.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    String str = new String(a(ByteBuffer.wrap(byteArrayOutputStream.toByteArray())), l.UTF_8);
                    try {
                        fileInputStream2.close();
                        byteArrayOutputStream.close();
                    } catch (Throwable th) {
                        c.a(th);
                    }
                    return str;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    try {
                        c.a(th);
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th3) {
                                c.a(th3);
                                return "";
                            }
                        }
                        if (byteArrayOutputStream == null) {
                            return "";
                        }
                        byteArrayOutputStream.close();
                        return "";
                    } catch (Throwable th4) {
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th5) {
                                c.a(th5);
                                throw th4;
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        throw th4;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
            byteArrayOutputStream = null;
        }
    }

    public static byte[] a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= 12) {
            byte[] bArr = new byte[12];
            byteBuffer.get(bArr);
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
            a(bArr, a(), allocate, byteBuffer);
            return allocate.array();
        }
        throw new GeneralSecurityException("data too short");
    }

    public static void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i8) {
        if (i8 < 0 || byteBuffer2.remaining() < i8 || byteBuffer3.remaining() < i8 || byteBuffer.remaining() < i8) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i9 = 0; i9 < i8; i9++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static void a(byte[] bArr, byte[] bArr2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int remaining = byteBuffer2.remaining();
        int i8 = remaining / 64;
        int i9 = i8 + 1;
        for (int i10 = 0; i10 < i9; i10++) {
            ByteBuffer a8 = a(bArr, bArr2, i10 + 32);
            if (i10 == i8) {
                a(byteBuffer, byteBuffer2, a8, remaining % 64);
            } else {
                a(byteBuffer, byteBuffer2, a8, 64);
            }
        }
    }

    public static ByteBuffer a(byte[] bArr, byte[] bArr2, int i8) {
        int[] a8 = a(a(bArr), a(bArr2), i8);
        int[] iArr = (int[]) a8.clone();
        a(iArr);
        for (int i9 = 0; i9 < a8.length; i9++) {
            a8[i9] = a8[i9] + iArr[i9];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(a8, 0, 16);
        return order;
    }

    public static void a(int[] iArr) {
        for (int i8 = 0; i8 < 10; i8++) {
            a(iArr, 0, 4, 8, 12);
            a(iArr, 1, 5, 9, 13);
            a(iArr, 2, 6, 10, 14);
            a(iArr, 3, 7, 11, 15);
            a(iArr, 0, 5, 10, 15);
            a(iArr, 1, 6, 11, 12);
            a(iArr, 2, 7, 8, 13);
            a(iArr, 3, 4, 9, 14);
        }
    }

    public static void a(int[] iArr, int i8, int i9, int i10, int i11) {
        int i12 = iArr[i8] + iArr[i9];
        iArr[i8] = i12;
        int a8 = a(i12 ^ iArr[i11], 16);
        iArr[i11] = a8;
        int i13 = iArr[i10] + a8;
        iArr[i10] = i13;
        int a9 = a(iArr[i9] ^ i13, 12);
        iArr[i9] = a9;
        int i14 = iArr[i8] + a9;
        iArr[i8] = i14;
        int a10 = a(iArr[i11] ^ i14, 8);
        iArr[i11] = a10;
        int i15 = iArr[i10] + a10;
        iArr[i10] = i15;
        iArr[i9] = a(iArr[i9] ^ i15, 7);
    }

    public static byte[] a() {
        return new BigInteger(f10662b).modPow(new BigInteger(f10663c), new BigInteger(f10664d)).toByteArray();
    }

    public static int[] a(int[] iArr, int[] iArr2, int i8) {
        if (iArr.length == 3) {
            int[] iArr3 = new int[16];
            a(iArr3, iArr2);
            iArr3[12] = i8;
            System.arraycopy(iArr, 0, iArr3, 13, iArr.length);
            return iArr3;
        }
        throw new IllegalArgumentException(String.format("need 96-bit param, but got a %d-bit param", Integer.valueOf(iArr.length * 32)));
    }

    public static int[] a(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    public static void a(int[] iArr, int[] iArr2) {
        int[] iArr3 = f10661a;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }
}
