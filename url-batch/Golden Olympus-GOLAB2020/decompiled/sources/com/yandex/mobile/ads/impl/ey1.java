package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fy;
import com.yandex.mobile.ads.impl.gy;
import com.yandex.mobile.ads.impl.hy;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public abstract class ey1<I extends gy, O extends hy, E extends fy> implements dy<I, O, E> {

    /* renamed from: a, reason: collision with root package name */
    private final Thread f25504a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f25505b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<I> f25506c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque<O> f25507d = new ArrayDeque<>();

    /* renamed from: e, reason: collision with root package name */
    private final I[] f25508e;

    /* renamed from: f, reason: collision with root package name */
    private final O[] f25509f;

    /* renamed from: g, reason: collision with root package name */
    private int f25510g;

    /* renamed from: h, reason: collision with root package name */
    private int f25511h;

    /* renamed from: i, reason: collision with root package name */
    private I f25512i;

    /* renamed from: j, reason: collision with root package name */
    private e32 f25513j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f25514k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f25515l;

    final class a extends Thread {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ey1 f25516b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(jy1 jy1Var) {
            super("ExoPlayer:SimpleDecoder");
            this.f25516b = jy1Var;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            ey1 ey1Var = this.f25516b;
            ey1Var.getClass();
            do {
                try {
                } catch (InterruptedException e4) {
                    throw new IllegalStateException(e4);
                }
            } while (ey1Var.e());
        }
    }

    protected ey1(I[] iArr, O[] oArr) {
        this.f25508e = iArr;
        this.f25510g = iArr.length;
        for (int i4 = 0; i4 < this.f25510g; i4++) {
            this.f25508e[i4] = c();
        }
        this.f25509f = oArr;
        this.f25511h = oArr.length;
        for (int i5 = 0; i5 < this.f25511h; i5++) {
            this.f25509f[i5] = d();
        }
        a aVar = new a((jy1) this);
        this.f25504a = aVar;
        aVar.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean e() {
        e32 e32Var;
        e32 e32Var2;
        synchronized (this.f25505b) {
            while (!this.f25515l && (this.f25506c.isEmpty() || this.f25511h <= 0)) {
                try {
                    this.f25505b.wait();
                } finally {
                }
            }
            if (this.f25515l) {
                return false;
            }
            I removeFirst = this.f25506c.removeFirst();
            O[] oArr = this.f25509f;
            int i4 = this.f25511h - 1;
            this.f25511h = i4;
            O o4 = oArr[i4];
            boolean z4 = this.f25514k;
            this.f25514k = false;
            if (removeFirst.c(4)) {
                o4.b(4);
            } else {
                if (removeFirst.c(Integer.MIN_VALUE)) {
                    o4.b(Integer.MIN_VALUE);
                }
                if (removeFirst.c(134217728)) {
                    o4.b(134217728);
                }
                try {
                    e32Var2 = a(removeFirst, o4, z4);
                } catch (OutOfMemoryError e4) {
                    e32Var = new e32("Unexpected decode error", e4);
                    e32Var2 = e32Var;
                    if (e32Var2 != null) {
                    }
                    synchronized (this.f25505b) {
                    }
                } catch (RuntimeException e5) {
                    e32Var = new e32("Unexpected decode error", e5);
                    e32Var2 = e32Var;
                    if (e32Var2 != null) {
                    }
                    synchronized (this.f25505b) {
                    }
                }
                if (e32Var2 != null) {
                    synchronized (this.f25505b) {
                        this.f25513j = e32Var2;
                    }
                    return false;
                }
            }
            synchronized (this.f25505b) {
                try {
                    if (this.f25514k) {
                        o4.h();
                    } else if (o4.c(Integer.MIN_VALUE)) {
                        o4.h();
                    } else {
                        this.f25507d.addLast(o4);
                    }
                    removeFirst.b();
                    I[] iArr = this.f25508e;
                    int i5 = this.f25510g;
                    this.f25510g = i5 + 1;
                    iArr[i5] = removeFirst;
                } finally {
                }
            }
            return true;
        }
    }

    protected abstract e32 a(gy gyVar, hy hyVar, boolean z4);

    @Override // com.yandex.mobile.ads.impl.dy
    public final Object b() {
        I i4;
        synchronized (this.f25505b) {
            try {
                e32 e32Var = this.f25513j;
                if (e32Var != null) {
                    throw e32Var;
                }
                if (this.f25512i != null) {
                    throw new IllegalStateException();
                }
                int i5 = this.f25510g;
                if (i5 == 0) {
                    i4 = null;
                } else {
                    I[] iArr = this.f25508e;
                    int i6 = i5 - 1;
                    this.f25510g = i6;
                    i4 = iArr[i6];
                }
                this.f25512i = i4;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i4;
    }

    protected abstract g32 c();

    protected abstract O d();

    protected final void f() {
        int i4 = this.f25510g;
        I[] iArr = this.f25508e;
        if (i4 != iArr.length) {
            throw new IllegalStateException();
        }
        for (I i5 : iArr) {
            i5.e(1024);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dy
    public final void flush() {
        synchronized (this.f25505b) {
            try {
                this.f25514k = true;
                I i4 = this.f25512i;
                if (i4 != null) {
                    i4.b();
                    I[] iArr = this.f25508e;
                    int i5 = this.f25510g;
                    this.f25510g = i5 + 1;
                    iArr[i5] = i4;
                    this.f25512i = null;
                }
                while (!this.f25506c.isEmpty()) {
                    I removeFirst = this.f25506c.removeFirst();
                    removeFirst.b();
                    I[] iArr2 = this.f25508e;
                    int i6 = this.f25510g;
                    this.f25510g = i6 + 1;
                    iArr2[i6] = removeFirst;
                }
                while (!this.f25507d.isEmpty()) {
                    this.f25507d.removeFirst().h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.dy
    public final void release() {
        synchronized (this.f25505b) {
            this.f25515l = true;
            this.f25505b.notify();
        }
        try {
            this.f25504a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // com.yandex.mobile.ads.impl.dy
    public final Object a() {
        synchronized (this.f25505b) {
            try {
                e32 e32Var = this.f25513j;
                if (e32Var != null) {
                    throw e32Var;
                }
                if (this.f25507d.isEmpty()) {
                    return null;
                }
                return this.f25507d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.dy
    public final void a(g32 g32Var) {
        synchronized (this.f25505b) {
            try {
                e32 e32Var = this.f25513j;
                if (e32Var == null) {
                    if (g32Var == this.f25512i) {
                        this.f25506c.addLast(g32Var);
                        if (!this.f25506c.isEmpty() && this.f25511h > 0) {
                            this.f25505b.notify();
                        }
                        this.f25512i = null;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw e32Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(O o4) {
        synchronized (this.f25505b) {
            try {
                o4.b();
                O[] oArr = this.f25509f;
                int i4 = this.f25511h;
                this.f25511h = i4 + 1;
                oArr[i4] = o4;
                if (!this.f25506c.isEmpty() && this.f25511h > 0) {
                    this.f25505b.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
