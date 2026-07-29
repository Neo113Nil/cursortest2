package com.tapjoy.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class ih extends ImageView implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private id f8376a;

    /* renamed from: b, reason: collision with root package name */
    private Bitmap f8377b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f8378c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8379d;
    private boolean e;
    private boolean f;
    private Thread g;
    private b h;
    private long i;
    private a j;
    private final Runnable k;
    private final Runnable l;

    public interface a {
    }

    public interface b {
        Bitmap a();
    }

    static /* synthetic */ Bitmap b(ih ihVar) {
        ihVar.f8377b = null;
        return null;
    }

    static /* synthetic */ id c(ih ihVar) {
        ihVar.f8376a = null;
        return null;
    }

    static /* synthetic */ Thread d(ih ihVar) {
        ihVar.g = null;
        return null;
    }

    static /* synthetic */ boolean e(ih ihVar) {
        ihVar.f = false;
        return false;
    }

    public ih(Context context) {
        super(context);
        this.f8378c = new Handler(Looper.getMainLooper());
        this.h = null;
        this.i = -1L;
        this.j = null;
        this.k = new Runnable() { // from class: com.tapjoy.internal.ih.1
            @Override // java.lang.Runnable
            public final void run() {
                if (ih.this.f8377b == null || ih.this.f8377b.isRecycled()) {
                    return;
                }
                ih.this.setImageBitmap(ih.this.f8377b);
            }
        };
        this.l = new Runnable() { // from class: com.tapjoy.internal.ih.2
            @Override // java.lang.Runnable
            public final void run() {
                ih.b(ih.this);
                ih.c(ih.this);
                ih.d(ih.this);
                ih.e(ih.this);
            }
        };
    }

    public final void a(Cif cif, byte[] bArr) {
        try {
            this.f8376a = new id(new ii(), cif, ByteBuffer.wrap(bArr));
            if (this.f8379d) {
                e();
            } else {
                d();
            }
        } catch (Exception e) {
            this.f8376a = null;
            new Object[1][0] = e;
        }
    }

    public final void setBytes(byte[] bArr) {
        this.f8376a = new id();
        try {
            this.f8376a.a(bArr);
            if (this.f8379d) {
                e();
            } else {
                d();
            }
        } catch (Exception e) {
            this.f8376a = null;
            new Object[1][0] = e;
        }
    }

    public final long getFramesDisplayDuration() {
        return this.i;
    }

    public final void setFramesDisplayDuration(long j) {
        this.i = j;
    }

    public final void a() {
        this.f8379d = true;
        e();
    }

    public final void b() {
        this.f8379d = false;
        if (this.g != null) {
            this.g.interrupt();
            this.g = null;
        }
    }

    private void d() {
        boolean z;
        if (this.f8376a.f8361a == 0) {
            return;
        }
        id idVar = this.f8376a;
        if (-1 >= idVar.f8363c.f8370c) {
            z = false;
        } else {
            idVar.f8361a = -1;
            z = true;
        }
        if (!z || this.f8379d) {
            return;
        }
        this.e = true;
        e();
    }

    public final void c() {
        this.f8379d = false;
        this.e = false;
        this.f = true;
        b();
        this.f8378c.post(this.l);
    }

    public final int getGifWidth() {
        return this.f8376a.f8363c.f;
    }

    public final int getGifHeight() {
        return this.f8376a.f8363c.g;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:12|(4:64|(1:66)|67|(10:71|15|16|17|(1:19)|20|21|22|23|(1:52)(6:26|27|(2:32|(1:37)(1:36))|38|(3:40|(1:42)(1:44)|43)|45)))|14|15|16|17|(0)|20|21|22|23|(1:51)(1:53)|52) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x006c, code lost:
    
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0077, code lost:
    
        new java.lang.Object[1][0] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x006a, code lost:
    
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0070, code lost:
    
        new java.lang.Object[1][0] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0075, code lost:
    
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0076, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x006e, code lost:
    
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x006f, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f A[Catch: IllegalArgumentException -> 0x006e, ArrayIndexOutOfBoundsException -> 0x0075, TryCatch #5 {ArrayIndexOutOfBoundsException -> 0x0075, IllegalArgumentException -> 0x006e, blocks: (B:17:0x003f, B:19:0x004f, B:20:0x0057), top: B:16:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c1 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00c7  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        do {
            if (!this.f8379d && !this.e) {
                break;
            }
            id idVar = this.f8376a;
            int i = 0;
            if (idVar.f8363c.f8370c > 0) {
                if (idVar.f8361a == idVar.f8363c.f8370c - 1) {
                    idVar.f8362b++;
                }
                if (idVar.f8363c.m == -1 || idVar.f8362b <= idVar.f8363c.m) {
                    idVar.f8361a = (idVar.f8361a + 1) % idVar.f8363c.f8370c;
                    z = true;
                    long nanoTime = System.nanoTime();
                    this.f8377b = this.f8376a.a();
                    if (this.h != null) {
                        this.f8377b = this.h.a();
                    }
                    long j = (System.nanoTime() - nanoTime) / 1000000;
                    this.f8378c.post(this.k);
                    this.e = false;
                    if (this.f8379d || !z) {
                        this.f8379d = false;
                        break;
                    }
                    try {
                        id idVar2 = this.f8376a;
                        if (idVar2.f8363c.f8370c > 0 && idVar2.f8361a >= 0) {
                            int i2 = idVar2.f8361a;
                            i = (i2 < 0 || i2 >= idVar2.f8363c.f8370c) ? -1 : ((ie) idVar2.f8363c.e.get(i2)).i;
                        }
                        int i3 = (int) (i - j);
                        if (i3 > 0) {
                            Thread.sleep(this.i > 0 ? this.i : i3);
                        }
                    } catch (InterruptedException unused) {
                    }
                }
            }
            z = false;
            long nanoTime2 = System.nanoTime();
            this.f8377b = this.f8376a.a();
            if (this.h != null) {
            }
            long j2 = (System.nanoTime() - nanoTime2) / 1000000;
            this.f8378c.post(this.k);
            this.e = false;
            if (this.f8379d) {
            }
            this.f8379d = false;
            break;
        } while (this.f8379d);
        if (this.f) {
            this.f8378c.post(this.l);
        }
        this.g = null;
    }

    public final b getOnFrameAvailable() {
        return this.h;
    }

    public final void setOnFrameAvailable(b bVar) {
        this.h = bVar;
    }

    public final a getOnAnimationStop() {
        return this.j;
    }

    public final void setOnAnimationStop(a aVar) {
        this.j = aVar;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    private void e() {
        if ((this.f8379d || this.e) && this.f8376a != null && this.g == null) {
            this.g = new Thread(this);
            this.g.start();
        }
    }
}
