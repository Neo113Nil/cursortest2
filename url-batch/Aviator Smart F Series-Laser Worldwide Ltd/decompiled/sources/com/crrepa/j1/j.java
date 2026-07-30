package com.crrepa.j1;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* loaded from: classes3.dex */
public class j {
    private static final String H = "Otalib";

    /* renamed from: a, reason: collision with root package name */
    final int f13068a = b.f12996n;

    /* renamed from: b, reason: collision with root package name */
    final int f13069b = b.f12997o;

    /* renamed from: c, reason: collision with root package name */
    final int f13070c = b.f12998p;

    /* renamed from: d, reason: collision with root package name */
    final int f13071d = -1204;

    /* renamed from: e, reason: collision with root package name */
    final int f13072e = -1205;

    /* renamed from: f, reason: collision with root package name */
    final int f13073f = -1206;

    /* renamed from: g, reason: collision with root package name */
    final int f13074g = -1207;

    /* renamed from: h, reason: collision with root package name */
    final int f13075h = b.f12999q;

    /* renamed from: i, reason: collision with root package name */
    private final int f13076i = 0;

    /* renamed from: j, reason: collision with root package name */
    private final int f13077j = 1;

    /* renamed from: k, reason: collision with root package name */
    private final int f13078k = 2;

    /* renamed from: l, reason: collision with root package name */
    private final int f13079l = 3;

    /* renamed from: m, reason: collision with root package name */
    private final int f13080m = 4;

    /* renamed from: n, reason: collision with root package name */
    private final int f13081n = 5;

    /* renamed from: o, reason: collision with root package name */
    private final int f13082o = 6;

    /* renamed from: p, reason: collision with root package name */
    private final int f13083p = 7;

    /* renamed from: q, reason: collision with root package name */
    private final int f13084q = 8;

    /* renamed from: r, reason: collision with root package name */
    private final int f13085r = 9;

    /* renamed from: s, reason: collision with root package name */
    private final int f13086s = 10;

    /* renamed from: t, reason: collision with root package name */
    private final int f13087t = 11;

    /* renamed from: u, reason: collision with root package name */
    private final int f13088u = 12;

    /* renamed from: v, reason: collision with root package name */
    private final int f13089v = 13;

    /* renamed from: w, reason: collision with root package name */
    private final int f13090w = 14;

    /* renamed from: x, reason: collision with root package name */
    private final int f13091x = 15;

    /* renamed from: y, reason: collision with root package name */
    private final int f13092y = 16;

    /* renamed from: z, reason: collision with root package name */
    private final int f13093z = 17;
    private final int A = 18;
    private final int B = 19;
    final int C = 1024;
    final int D = 1500;
    final int E = 5000;
    private byte[] F = new byte[1500];
    private byte[] G = new byte[1500];

    int a(byte b8, byte[] bArr, int i8) {
        int i9 = i8 + 1;
        bArr[i8] = b8;
        return i9;
    }

    public int b(g gVar) {
        return new k().a(gVar);
    }

    int c(g gVar) {
        byte[] bArr = new byte[1];
        int a8 = a((byte) 18, this.F, 0);
        byte[] bArr2 = this.F;
        byte[] bArr3 = this.G;
        int a9 = a(gVar, a8, bArr2, bArr3.length, bArr3, 5000);
        if (a9 < 0) {
            return a9;
        }
        byte[] bArr4 = new byte[4];
        b(bArr4, this.G, a(bArr, this.G, 0));
        int a10 = h.a(bArr4);
        if (bArr[0] != 18) {
            return -1205;
        }
        return a10;
    }

    int d(g gVar) {
        byte[] bArr = new byte[1];
        int a8 = a((byte) 17, this.F, 0);
        byte[] bArr2 = this.F;
        byte[] bArr3 = this.G;
        int a9 = a(gVar, a8, bArr2, bArr3.length, bArr3, 5000);
        if (a9 < 0) {
            return a9;
        }
        byte[] bArr4 = new byte[4];
        b(bArr4, this.G, a(bArr, this.G, 0));
        int a10 = h.a(bArr4);
        if (bArr[0] != 17) {
            return -1205;
        }
        return a10;
    }

    public int a(int i8, int i9, g gVar, Handler handler) {
        byte[] bArr = new byte[1];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        int a8 = a((byte) i9, this.F, a((byte) 11, this.F, 0));
        byte[] bArr4 = this.F;
        byte[] bArr5 = this.G;
        int a9 = a(gVar, a8, bArr4, bArr5.length, bArr5, 5000);
        if (a9 < 0) {
            return a9;
        }
        int a10 = a(bArr, this.G, 0);
        if (bArr[0] != 11) {
            return -1205;
        }
        int b8 = b(bArr2, this.G, a10);
        int a11 = h.a(bArr2);
        b(bArr3, this.G, b8);
        int a12 = h.a(bArr3);
        Message obtain = Message.obtain();
        obtain.what = 1005;
        obtain.arg1 = a11;
        obtain.arg2 = a12;
        obtain.obj = Integer.valueOf(i8);
        handler.sendMessage(obtain);
        return 0;
    }

    public int b(g gVar, byte[] bArr, int i8, int i9, Handler handler) {
        int length = bArr.length;
        byte[] bArr2 = new byte[1];
        byte[] bArr3 = new byte[4];
        int a8 = a(length, this.F, a(i8, this.F, a((byte) i9, this.F, a((byte) 12, this.F, 0))));
        byte[] bArr4 = this.F;
        byte[] bArr5 = this.G;
        int a9 = a(gVar, a8, bArr4, bArr5.length, bArr5, 5000);
        if (a9 < 0) {
            return a9;
        }
        int a10 = a(bArr2, this.G, 0);
        if (bArr2[0] != 12) {
            return -1205;
        }
        b(bArr3, this.G, a10);
        int a11 = h.a(bArr3);
        if (a11 < 0) {
            return a11;
        }
        int a12 = a(gVar, a11, length, bArr, handler);
        if (bArr.length == a12) {
            return 0;
        }
        return a12 == -8 ? b.f12999q : a12;
    }

    int a(int i8, byte[] bArr, int i9) {
        bArr[i9] = (byte) (i8 >> 24);
        bArr[i9 + 1] = (byte) (i8 >> 16);
        int i10 = i9 + 3;
        bArr[i9 + 2] = (byte) (i8 >> 8);
        int i11 = i9 + 4;
        bArr[i10] = (byte) i8;
        return i11;
    }

    int b(byte[] bArr, byte[] bArr2, int i8) {
        bArr[0] = bArr2[i8];
        bArr[1] = bArr2[i8 + 1];
        int i9 = i8 + 3;
        bArr[2] = bArr2[i8 + 2];
        int i10 = i8 + 4;
        bArr[3] = bArr2[i9];
        return i10;
    }

    int a(g gVar) {
        byte[] bArr = new byte[1];
        int a8 = a((byte) 16, this.F, 0);
        byte[] bArr2 = this.F;
        byte[] bArr3 = this.G;
        int a9 = a(gVar, a8, bArr2, bArr3.length, bArr3, 5000);
        if (a9 < 0) {
            return a9;
        }
        byte[] bArr4 = new byte[4];
        b(bArr4, this.G, a(bArr, this.G, 0));
        int a10 = h.a(bArr4);
        if (bArr[0] != 16) {
            return -1205;
        }
        return a10;
    }

    int a(g gVar, byte b8) {
        byte[] bArr = new byte[1];
        int a8 = a(b8, this.F, a((byte) 8, this.F, 0));
        byte[] bArr2 = this.F;
        byte[] bArr3 = this.G;
        int a9 = a(gVar, a8, bArr2, bArr3.length, bArr3, 5000);
        if (a9 < 0) {
            return a9;
        }
        byte[] bArr4 = new byte[4];
        b(bArr4, this.G, a(bArr, this.G, 0));
        int a10 = h.a(bArr4);
        if (bArr[0] != 8) {
            return -1205;
        }
        return a10;
    }

    int a(g gVar, int i8) {
        byte[] bArr = new byte[1];
        int a8 = a(i8, this.F, a((byte) 5, this.F, 0));
        byte[] bArr2 = this.F;
        byte[] bArr3 = this.G;
        int a9 = a(gVar, a8, bArr2, bArr3.length, bArr3, 100);
        if (a9 < 0) {
            return a9;
        }
        byte[] bArr4 = new byte[4];
        b(bArr4, this.G, a(bArr, this.G, 0));
        int a10 = h.a(bArr4);
        if (bArr[0] != 5) {
            return -1205;
        }
        return a10;
    }

    int a(g gVar, int i8, int i9) {
        byte[] bArr = new byte[1];
        int a8 = a(i9, this.F, a(i8, this.F, a((byte) 0, this.F, 0)));
        byte[] bArr2 = this.F;
        byte[] bArr3 = this.G;
        int a9 = a(gVar, a8, bArr2, bArr3.length, bArr3, 5000);
        if (a9 < 0) {
            return a9;
        }
        byte[] bArr4 = new byte[4];
        b(bArr4, this.G, a(bArr, this.G, 0));
        int a10 = h.a(bArr4);
        if (bArr[0] != 0) {
            return -1205;
        }
        return a10;
    }

    int a(g gVar, int i8, int i9, int i10) {
        byte[] bArr = new byte[1];
        int a8 = a(i9, this.F, a(i8, this.F, a((byte) i10, this.F, a((byte) 12, this.F, 0))));
        byte[] bArr2 = this.F;
        byte[] bArr3 = this.G;
        a(gVar, a8, bArr2, bArr3.length, bArr3, 5000);
        a(bArr, this.G, 0);
        return bArr[0] != 12 ? -1205 : 0;
    }

    int a(g gVar, int i8, long j8, byte[] bArr, Handler handler) {
        int i9 = 1024;
        byte[] bArr2 = new byte[1024];
        Message message = new Message();
        message.arg1 = 1002;
        int i10 = 0;
        message.arg2 = (int) ((j8 / 1024) + (j8 % 1024 == 0 ? 0 : 1));
        handler.sendMessage(message);
        long j9 = j8;
        long currentTimeMillis = System.currentTimeMillis();
        int i11 = 0;
        float f8 = 0.0f;
        int i12 = 0;
        int i13 = 0;
        int i14 = i8;
        for (long j10 = 0; j9 > j10; j10 = 0) {
            int length = bArr.length - i11 > i9 ? 1024 : bArr.length - i11;
            System.arraycopy(bArr, i11, bArr2, i10, length);
            int a8 = a(gVar, bArr2, i14, length);
            if (a8 <= 0) {
                Log.e(H, "write error:" + length);
                return a8;
            }
            i14 += length;
            byte[] bArr3 = bArr2;
            j9 -= length;
            i12 += length;
            i11 += length;
            f8 += length;
            if (System.currentTimeMillis() - currentTimeMillis >= 1000) {
                long currentTimeMillis2 = System.currentTimeMillis();
                Message obtain = Message.obtain();
                obtain.arg1 = 1008;
                obtain.obj = Float.valueOf(f8 / 1024.0f);
                handler.sendMessage(obtain);
                currentTimeMillis = currentTimeMillis2;
                f8 = 0.0f;
            }
            int i15 = i13 + 1;
            Message message2 = new Message();
            message2.arg1 = 1003;
            message2.arg2 = i15;
            Log.i("JavaXmodem", "num:" + i15);
            handler.sendMessage(message2);
            if (length < 1024) {
                break;
            }
            i13 = i15;
            bArr2 = bArr3;
            i9 = 1024;
            i10 = 0;
        }
        return i12;
    }

    private int a(g gVar, int i8, byte[] bArr, int i9, byte[] bArr2, int i10) {
        k kVar = new k();
        b.f13007y = false;
        return kVar.b(gVar, i8, bArr, i9, bArr2, i10);
    }

    int a(g gVar, byte[] bArr, int i8, int i9) {
        byte[] bArr2 = new byte[1];
        int a8 = a(i9, this.F, a(i8, this.F, a((byte) 3, this.F, 0)));
        int i10 = 0;
        while (i10 < i9) {
            this.F[a8] = bArr[i10];
            i10++;
            a8++;
        }
        byte[] bArr3 = this.F;
        byte[] bArr4 = this.G;
        int a9 = a(gVar, a8, bArr3, bArr4.length, bArr4, 5000);
        if (a9 < 0) {
            Log.e(H, "transaction error:" + a9);
            return a9;
        }
        int a10 = a(bArr2, this.G, 0);
        if (bArr2[0] != 3) {
            return -1205;
        }
        byte[] bArr5 = new byte[4];
        b(bArr5, this.G, a10);
        return h.a(bArr5);
    }

    int a(g gVar, byte[] bArr, int i8, int i9, Handler handler) {
        StringBuilder sb;
        String str;
        byte[] bArr2 = new byte[1];
        byte[] bArr3 = new byte[4];
        if (bArr == null) {
            return -1;
        }
        long length = bArr.length;
        int a8 = a((int) length, this.F, a(i8, this.F, a((byte) i9, this.F, a((byte) 12, this.F, 0))));
        byte[] bArr4 = this.F;
        byte[] bArr5 = this.G;
        int a9 = a(gVar, a8, bArr4, bArr5.length, bArr5, 5000);
        if (a9 < 0) {
            sb = new StringBuilder();
            str = "application addr error:";
        } else {
            int a10 = a(bArr2, this.G, 0);
            if (bArr2[0] != 12) {
                return -1205;
            }
            b(bArr3, this.G, a10);
            int a11 = h.a(bArr3);
            if (a11 < 0) {
                Log.e(H, "binary addr error:" + a9);
                return a11;
            }
            a9 = a(gVar, a11, length, bArr, handler);
            if (length == a9) {
                return 0;
            }
            if (a9 == -8) {
                a9 = b.f12999q;
            }
            sb = new StringBuilder();
            str = "real_size = ";
        }
        sb.append(str);
        sb.append(a9);
        Log.e(H, sb.toString());
        return a9;
    }

    int a(short s7, byte[] bArr, int i8) {
        int i9 = i8 + 1;
        bArr[i8] = (byte) (s7 >> 8);
        int i10 = i8 + 2;
        bArr[i9] = (byte) s7;
        return i10;
    }

    int a(byte[] bArr, byte[] bArr2, int i8) {
        int i9 = i8 + 1;
        bArr[0] = bArr2[i8];
        return i9;
    }
}
