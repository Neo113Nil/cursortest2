package com.crrepa.j1;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: e, reason: collision with root package name */
    public Handler f13034e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f13035f;

    /* renamed from: a, reason: collision with root package name */
    public Semaphore f13030a = new Semaphore(0);

    /* renamed from: b, reason: collision with root package name */
    public Semaphore f13031b = new Semaphore(1);

    /* renamed from: c, reason: collision with root package name */
    public BlockingQueue<Byte> f13032c = new LinkedBlockingQueue();

    /* renamed from: d, reason: collision with root package name */
    private String f13033d = "TransOverBle";

    /* renamed from: g, reason: collision with root package name */
    private boolean f13036g = false;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f13037a;

        /* renamed from: b, reason: collision with root package name */
        int f13038b;

        /* renamed from: c, reason: collision with root package name */
        byte[] f13039c = new byte[16];
    }

    public g() {
    }

    private int b(byte[] bArr, int i8) {
        if (bArr == null) {
            Log.i(this.f13033d, "send data is null");
            return 0;
        }
        if (this.f13036g) {
            e.b(bArr, bArr, i8, this.f13035f);
        }
        Message message = new Message();
        message.arg1 = 1004;
        message.arg2 = i8;
        message.obj = bArr;
        this.f13034e.sendMessage(message);
        return 0;
    }

    public byte a(byte[] bArr, int i8) {
        if (bArr.length == 0) {
            return (byte) 0;
        }
        byte b8 = 0;
        for (int i9 = 0; i9 < i8; i9++) {
            b8 = (byte) (b8 + bArr[i9]);
        }
        return b8;
    }

    public int c(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return -1;
        }
        return new c().a(bArr, bArr.length, this);
    }

    public g(Context context, Handler handler) {
        this.f13034e = handler;
    }

    public int a(f fVar, a aVar) {
        byte[] bArr = new byte[1024];
        bArr[0] = 0;
        byte b8 = fVar.f13029a;
        bArr[1] = b8;
        bArr[2] = 0;
        int i8 = 5;
        switch (b8) {
            case 0:
            case 2:
            case 3:
                if (aVar != null) {
                    int i9 = aVar.f13038b;
                    if (i9 != 0) {
                        bArr[5] = 8;
                        bArr[6] = 0;
                        bArr[7] = 1;
                        bArr[8] = 0;
                        int i10 = aVar.f13037a;
                        bArr[9] = (byte) (i10 & 255);
                        bArr[10] = (byte) ((i10 >> 8) & 255);
                        bArr[11] = (byte) ((i10 >> 16) & 255);
                        bArr[12] = (byte) ((i10 >> 24) & 255);
                        bArr[13] = 8;
                        bArr[14] = 0;
                        bArr[15] = 2;
                        bArr[16] = 0;
                        bArr[17] = (byte) (i9 & 255);
                        bArr[18] = (byte) ((i9 >> 8) & 255);
                        bArr[19] = (byte) ((i9 >> 16) & 255);
                        bArr[20] = (byte) ((i9 >> 24) & 255);
                        i8 = 21;
                        bArr[3] = (byte) 21;
                        bArr[4] = (byte) 0;
                        bArr[2] = a(bArr, 21);
                        break;
                    } else {
                        return 0;
                    }
                } else {
                    return -1;
                }
            case 1:
            case 5:
            case 6:
                bArr[3] = (byte) 5;
                bArr[4] = (byte) 0;
                bArr[2] = a(bArr, 5);
                break;
            case 4:
                bArr[5] = 20;
                bArr[6] = 0;
                bArr[7] = 4;
                bArr[8] = 0;
                byte[] bArr2 = aVar.f13039c;
                System.arraycopy(bArr2, 0, bArr, 9, bArr2.length);
                i8 = 25;
                bArr[3] = (byte) 25;
                bArr[4] = (byte) 0;
                bArr[2] = a(bArr, 25);
                break;
        }
        a();
        return c(bArr, i8);
    }

    public void b(byte[] bArr) {
        if (bArr != null) {
            Message message = new Message();
            message.arg1 = 1000;
            message.obj = bArr;
            this.f13034e.sendMessage(message);
        }
    }

    public int c(byte[] bArr, int i8) {
        return b(bArr, i8);
    }

    public int a(byte[] bArr, Handler handler) {
        if (bArr == null || bArr.length == 0) {
            return -1;
        }
        return new c().a(bArr, bArr.length, this, handler);
    }

    public byte[] b(int i8) {
        return new c().a(i8, this);
    }

    public void a() {
        this.f13032c.clear();
    }

    public byte[] b(int i8, int i9) {
        return a(i8, i9);
    }

    public void a(byte[] bArr, boolean z7) {
        this.f13035f = bArr;
        this.f13036g = z7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
    
        if (r12 != 5) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean a(f fVar) {
        byte[] a8 = a(5, 4000);
        if (a8 == null) {
            try {
                this.f13030a.acquire(this.f13032c.size());
            } catch (InterruptedException e8) {
                e = e8;
                e.printStackTrace();
                this.f13032c.clear();
                return false;
            }
        } else if (a8[0] == 1 && a8[1] == fVar.f13029a) {
            byte[] a9 = a((short) (((short) (a8[3] | (a8[4] << 8))) - 5), 4000);
            if (a9 == null) {
                try {
                    this.f13030a.acquire(this.f13032c.size());
                } catch (InterruptedException e9) {
                    e = e9;
                    e.printStackTrace();
                    this.f13032c.clear();
                    return false;
                }
            } else {
                int length = a8.length + a9.length;
                byte[] bArr = new byte[length];
                System.arraycopy(a8, 0, bArr, 0, a8.length);
                System.arraycopy(a9, 0, bArr, a8.length, a9.length);
                if (a(bArr)) {
                    byte b8 = fVar.f13029a;
                    try {
                        if (b8 != 0) {
                            if (b8 != 1) {
                                if (b8 != 2) {
                                    if (b8 != 3) {
                                        if (b8 != 4) {
                                        }
                                    }
                                }
                            } else if (length >= 10) {
                                return ((short) (bArr[5] | (bArr[6] << 8))) == 8;
                            }
                            this.f13030a.acquire(this.f13032c.size());
                        }
                        this.f13030a.acquire(this.f13032c.size());
                    } catch (InterruptedException e10) {
                        e = e10;
                        e.printStackTrace();
                        this.f13032c.clear();
                        return false;
                    }
                    if (length >= 10) {
                        return bArr[9] == 0;
                    }
                } else {
                    try {
                        this.f13030a.acquire(this.f13032c.size());
                    } catch (InterruptedException e11) {
                        e = e11;
                        e.printStackTrace();
                        this.f13032c.clear();
                        return false;
                    }
                }
            }
        } else {
            try {
                this.f13030a.acquire(this.f13032c.size());
            } catch (InterruptedException e12) {
                e = e12;
                e.printStackTrace();
                this.f13032c.clear();
                return false;
            }
        }
        this.f13032c.clear();
        return false;
    }

    public boolean a(byte[] bArr) {
        byte b8 = (byte) (bArr[0] + bArr[1]);
        for (int i8 = 3; i8 < bArr.length; i8++) {
            b8 = (byte) (b8 + bArr[i8]);
        }
        return b8 == bArr[2];
    }

    public byte[] a(int i8) {
        return a(i8, 10000);
    }

    private byte[] a(int i8, int i9) {
        byte[] bArr = new byte[i8];
        try {
            if (this.f13030a.tryAcquire(i8, i9, TimeUnit.MILLISECONDS)) {
                for (int i10 = 0; i10 < i8; i10++) {
                    try {
                        this.f13031b.acquire(1);
                    } catch (InterruptedException e8) {
                        e8.printStackTrace();
                    }
                    if (this.f13032c.isEmpty()) {
                        return null;
                    }
                    bArr[i10] = this.f13032c.poll().byteValue();
                    this.f13031b.release(1);
                }
                return bArr;
            }
        } catch (InterruptedException e9) {
            e9.printStackTrace();
        }
        Log.i(this.f13033d, "receive timeout");
        return null;
    }
}
