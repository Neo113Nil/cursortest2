package com.crrepa.j1;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.jni.ecc256;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class i {

    /* renamed from: v, reason: collision with root package name */
    private static final int f13042v = 96;

    /* renamed from: w, reason: collision with root package name */
    private static final int f13043w = 97;

    /* renamed from: x, reason: collision with root package name */
    private static final int f13044x = 98;

    /* renamed from: y, reason: collision with root package name */
    private static final int f13045y = 4;

    /* renamed from: z, reason: collision with root package name */
    private static final int f13046z = 1;

    /* renamed from: a, reason: collision with root package name */
    private byte[] f13047a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f13048b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f13049c;

    /* renamed from: n, reason: collision with root package name */
    private BlockingQueue<Byte> f13060n;

    /* renamed from: o, reason: collision with root package name */
    private Semaphore f13061o;

    /* renamed from: p, reason: collision with root package name */
    private Semaphore f13062p;

    /* renamed from: r, reason: collision with root package name */
    private g f13064r;

    /* renamed from: t, reason: collision with root package name */
    private Context f13066t;

    /* renamed from: u, reason: collision with root package name */
    private Handler f13067u;

    /* renamed from: h, reason: collision with root package name */
    private byte[] f13054h = new byte[32];

    /* renamed from: i, reason: collision with root package name */
    private byte[] f13055i = new byte[32];

    /* renamed from: j, reason: collision with root package name */
    private byte[] f13056j = new byte[32];

    /* renamed from: k, reason: collision with root package name */
    private boolean f13057k = false;

    /* renamed from: l, reason: collision with root package name */
    byte[] f13058l = {1, 0, 0, 0};

    /* renamed from: m, reason: collision with root package name */
    byte[] f13059m = {2, 0, 8, 0, 6, 0, 6, 0, 0, 0, -56, 0};

    /* renamed from: f, reason: collision with root package name */
    private boolean f13052f = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13050d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f13051e = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f13053g = false;

    /* renamed from: q, reason: collision with root package name */
    private a f13063q = new a();

    /* renamed from: s, reason: collision with root package name */
    private j f13065s = new j();

    public i(Context context, Handler handler) {
        this.f13066t = context;
        this.f13067u = handler;
        this.f13064r = new g(context, handler);
    }

    private int a() {
        return this.f13065s.b(this.f13064r);
    }

    private int b() {
        return this.f13065s.d(this.f13064r);
    }

    private int c() {
        return this.f13065s.a(this.f13064r, (byte) 1);
    }

    private void e() {
        BlockingQueue<Byte> blockingQueue = this.f13060n;
        if (blockingQueue != null) {
            blockingQueue.clear();
            this.f13060n = null;
        }
        Semaphore semaphore = this.f13061o;
        if (semaphore != null) {
            semaphore.release();
            this.f13061o = null;
        }
        Semaphore semaphore2 = this.f13062p;
        if (semaphore2 != null) {
            semaphore2.release();
            this.f13062p = null;
        }
    }

    public void d() {
        this.f13050d = false;
        this.f13051e = false;
        this.f13052f = false;
        e();
        Message obtain = Message.obtain();
        obtain.arg1 = 1000;
        obtain.arg2 = 4;
        obtain.obj = new byte[]{0, 0, 0, 0};
        this.f13067u.sendMessage(obtain);
    }

    public void f() {
        e();
        this.f13050d = false;
        this.f13051e = false;
        this.f13052f = false;
        b.f13007y = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int a(byte[] bArr, int i8) {
        int i9;
        int i10;
        Semaphore semaphore;
        StringBuilder sb;
        String str;
        if (bArr == null && bArr.length <= 0) {
            return -1;
        }
        Log.e("peng", "interval:" + this.f13052f + "  reset link:" + this.f13050d + "   verify:" + this.f13051e);
        if (!this.f13052f) {
            Message obtain = Message.obtain();
            obtain.arg1 = 1000;
            byte[] bArr2 = this.f13059m;
            obtain.arg2 = bArr2.length;
            obtain.obj = bArr2;
            this.f13067u.sendMessage(obtain);
            this.f13052f = true;
        }
        try {
            if (this.f13050d) {
                i9 = -1;
            } else {
                i9 = a();
                if (i9 < 0) {
                    this.f13052f = false;
                    this.f13050d = false;
                    sb = new StringBuilder();
                    str = "resetling error:";
                    sb.append(str);
                    sb.append(i9);
                    Log.e("Otalib", sb.toString());
                    return i9;
                }
                this.f13050d = true;
            }
            if (!this.f13051e) {
                i9 = c();
                if (i9 < 0) {
                    this.f13052f = false;
                    this.f13050d = false;
                    this.f13051e = false;
                    sb = new StringBuilder();
                    str = "verify error:";
                    sb.append(str);
                    sb.append(i9);
                    Log.e("Otalib", sb.toString());
                    return i9;
                }
                this.f13051e = true;
            }
            this.f13062p.acquire();
            if (i8 == 3) {
                i10 = 96;
            } else {
                if (i8 != 4) {
                    if (i8 == 5) {
                        i10 = 97;
                    }
                    semaphore = this.f13062p;
                    if (semaphore != null) {
                        semaphore.release();
                    }
                    if (i9 < 0) {
                        this.f13050d = false;
                        this.f13051e = false;
                        this.f13052f = false;
                        e();
                    }
                    sb = new StringBuilder();
                    str = "response = ";
                    sb.append(str);
                    sb.append(i9);
                    Log.e("Otalib", sb.toString());
                    return i9;
                }
                i10 = 98;
            }
            i9 = a(bArr, 0, i10);
            semaphore = this.f13062p;
            if (semaphore != null) {
            }
            if (i9 < 0) {
            }
            sb = new StringBuilder();
            str = "response = ";
            sb.append(str);
            sb.append(i9);
            Log.e("Otalib", sb.toString());
            return i9;
        } catch (InterruptedException e8) {
            e8.printStackTrace();
            Semaphore semaphore2 = this.f13062p;
            if (semaphore2 != null) {
                semaphore2.release();
            }
            Log.e("Otalib", "--- Semaphore error ---");
            return -1;
        }
    }

    public int b(int i8) {
        j jVar;
        g gVar;
        Handler handler;
        int i9;
        if (!this.f13050d) {
            int a8 = a();
            if (a8 < 0) {
                this.f13050d = false;
                return a8;
            }
            this.f13050d = true;
        }
        int i10 = 3;
        if (i8 != 3) {
            i10 = 4;
            if (i8 != 4) {
                i10 = 5;
                if (i8 != 5) {
                    return this.f13065s.a(0, i8, this.f13064r, this.f13067u);
                }
                jVar = this.f13065s;
                gVar = this.f13064r;
                handler = this.f13067u;
                i9 = 97;
            } else {
                jVar = this.f13065s;
                gVar = this.f13064r;
                handler = this.f13067u;
                i9 = 98;
            }
        } else {
            jVar = this.f13065s;
            gVar = this.f13064r;
            handler = this.f13067u;
            i9 = 96;
        }
        return jVar.a(i10, i9, gVar, handler);
    }

    private int a(byte[] bArr, int i8, int i9) {
        return this.f13065s.a(this.f13064r, bArr, i8, i9, this.f13067u);
    }

    public void b(byte[] bArr, int i8) {
        if (this.f13060n == null || this.f13061o == null) {
            return;
        }
        int i9 = 0;
        if (i8 == 1) {
            while (i9 < bArr.length) {
                try {
                    this.f13060n.put(Byte.valueOf(bArr[i9]));
                    this.f13061o.release(1);
                } catch (InterruptedException e8) {
                    e8.printStackTrace();
                }
                i9++;
            }
            return;
        }
        if (i8 != 2) {
            return;
        }
        if (this.f13057k) {
            e.a(bArr, bArr, bArr.length, this.f13056j);
        }
        while (i9 < bArr.length) {
            try {
                this.f13064r.f13032c.put(Byte.valueOf(bArr[i9]));
                this.f13064r.f13030a.release(1);
            } catch (InterruptedException e9) {
                e9.printStackTrace();
            }
            i9++;
        }
    }

    public int a(byte[] bArr, String str) {
        if (bArr == null && bArr.length <= 0) {
            return -1;
        }
        Log.e("peng", "interval:" + this.f13052f + "  reset link:" + this.f13050d + "   verify:" + this.f13051e);
        int parseInt = Integer.parseInt(str, 16);
        if (!Pattern.matches("[a-f0-9A-F]{1,12}", str)) {
            return b.f13001s;
        }
        if (!this.f13052f) {
            Message obtain = Message.obtain();
            obtain.arg1 = 1000;
            byte[] bArr2 = this.f13059m;
            obtain.arg2 = bArr2.length;
            obtain.obj = bArr2;
            this.f13067u.sendMessage(obtain);
            this.f13052f = true;
        }
        if (!this.f13050d) {
            int a8 = a();
            if (a8 < 0) {
                this.f13052f = false;
                this.f13050d = false;
                return a8;
            }
            this.f13050d = true;
        }
        if (!this.f13051e) {
            int c8 = c();
            if (c8 < 0) {
                this.f13052f = false;
                this.f13050d = false;
                this.f13051e = false;
                return c8;
            }
            this.f13051e = true;
        }
        try {
            this.f13062p.acquire();
            int b8 = this.f13065s.b(this.f13064r, bArr, parseInt, 4, this.f13067u);
            Semaphore semaphore = this.f13062p;
            if (semaphore != null) {
                semaphore.release();
            }
            if (b8 < 0) {
                this.f13050d = false;
                this.f13051e = false;
                this.f13052f = false;
            }
            return b8;
        } catch (InterruptedException e8) {
            e8.printStackTrace();
            Semaphore semaphore2 = this.f13062p;
            if (semaphore2 != null) {
                semaphore2.release();
            }
            return -1;
        }
    }

    public void a(int i8) {
        byte[] bArr = {a4.a.Z0, 0, 0, 0};
        byte[] bArr2 = {a4.a.f15a1, 0, 0, 0};
        Message obtain = Message.obtain();
        if (i8 == 1006) {
            obtain.arg1 = 1000;
            obtain.arg2 = 4;
            obtain.obj = bArr;
        } else {
            if (i8 != 1007) {
                return;
            }
            obtain.arg1 = 1000;
            obtain.arg2 = 4;
            obtain.obj = bArr2;
        }
        this.f13067u.sendMessage(obtain);
    }

    public void a(boolean z7) {
        this.f13060n = new LinkedBlockingQueue();
        this.f13061o = new Semaphore(0);
        this.f13062p = new Semaphore(1);
        this.f13057k = z7;
        if (z7) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i8 = 0; i8 < 32; i8++) {
                stringBuffer.append(Integer.toHexString(new Random().nextInt(16)) + Integer.toHexString(new Random().nextInt(16)));
            }
            this.f13049c = h.e(stringBuffer.toString());
            e.b(0);
            e.a(0);
            ecc256 ecc256Var = new ecc256();
            byte[] bArr = new byte[32];
            this.f13047a = bArr;
            byte[] bArr2 = new byte[32];
            this.f13048b = bArr2;
            ecc256Var.ecc_generate_public_key(this.f13049c, bArr, bArr2);
            byte[] bArr3 = this.f13058l;
            int length = bArr3.length;
            byte[] bArr4 = this.f13047a;
            int length2 = length + bArr4.length;
            byte[] bArr5 = this.f13048b;
            int length3 = length2 + bArr5.length;
            byte[] bArr6 = new byte[length3];
            int length4 = bArr4.length + bArr5.length;
            bArr3[2] = (byte) (length4 & 255);
            bArr3[3] = (byte) ((length4 >> 8) & 255);
            System.arraycopy(bArr3, 0, bArr6, 0, bArr3.length);
            byte[] bArr7 = this.f13047a;
            System.arraycopy(bArr7, 0, bArr6, this.f13058l.length, bArr7.length);
            byte[] bArr8 = this.f13048b;
            System.arraycopy(bArr8, 0, bArr6, this.f13047a.length + this.f13058l.length, bArr8.length);
            Message obtain = Message.obtain();
            obtain.arg1 = 1000;
            obtain.arg2 = length3;
            obtain.obj = bArr6;
            this.f13067u.sendMessage(obtain);
            try {
                if (this.f13061o.tryAcquire((this.f13054h.length * 2) + 4, 10000L, TimeUnit.MILLISECONDS)) {
                    int i9 = 0;
                    while (true) {
                        byte[] bArr9 = this.f13054h;
                        if (i9 >= (bArr9.length * 2) + 4) {
                            ecc256Var.ecc_generate_dhkey(this.f13049c, bArr9, this.f13055i, this.f13056j);
                            this.f13064r.a(this.f13056j, this.f13057k);
                            return;
                        }
                        if (i9 < 4) {
                            this.f13060n.poll();
                        } else if (i9 >= 4 && i9 < bArr9.length + 4) {
                            Byte poll = this.f13060n.poll();
                            if (poll == null) {
                                this.f13057k = false;
                                Message message = new Message();
                                message.arg1 = 1001;
                                this.f13067u.sendMessage(message);
                            }
                            this.f13054h[i9 - 4] = poll.byteValue();
                        } else if (i9 >= bArr9.length + 4 && i9 < (bArr9.length * 2) + 4) {
                            Byte poll2 = this.f13060n.poll();
                            if (poll2 == null) {
                                this.f13057k = false;
                                Message message2 = new Message();
                                message2.arg1 = 1001;
                                this.f13067u.sendMessage(message2);
                            }
                            this.f13055i[(i9 - 4) - this.f13054h.length] = poll2.byteValue();
                        }
                        i9++;
                    }
                }
            } catch (InterruptedException e8) {
                e8.printStackTrace();
            }
            e();
            this.f13057k = false;
            Message obtain2 = Message.obtain();
            obtain2.arg1 = 1001;
            this.f13067u.sendMessage(obtain2);
        }
    }
}
