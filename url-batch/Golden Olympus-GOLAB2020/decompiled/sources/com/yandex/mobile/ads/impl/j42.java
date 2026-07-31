package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.yandex.mobile.ads.impl.f32;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class j42 extends AbstractC1811ak implements Handler.Callback {

    /* renamed from: A, reason: collision with root package name */
    private int f27463A;

    /* renamed from: B, reason: collision with root package name */
    private long f27464B;

    /* renamed from: n, reason: collision with root package name */
    private final Handler f27465n;

    /* renamed from: o, reason: collision with root package name */
    private final i42 f27466o;

    /* renamed from: p, reason: collision with root package name */
    private final f32 f27467p;

    /* renamed from: q, reason: collision with root package name */
    private final zb0 f27468q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f27469r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f27470s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f27471t;

    /* renamed from: u, reason: collision with root package name */
    private int f27472u;

    /* renamed from: v, reason: collision with root package name */
    private yb0 f27473v;

    /* renamed from: w, reason: collision with root package name */
    private d32 f27474w;

    /* renamed from: x, reason: collision with root package name */
    private g32 f27475x;

    /* renamed from: y, reason: collision with root package name */
    private h32 f27476y;

    /* renamed from: z, reason: collision with root package name */
    private h32 f27477z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j42(i42 i42Var, Looper looper) {
        super(3);
        f32 f32Var = f32.f25604a;
        this.f27466o = (i42) C2253tf.a(i42Var);
        this.f27465n = looper == null ? null : u82.a(looper, (Handler.Callback) this);
        this.f27467p = f32Var;
        this.f27468q = new zb0();
        this.f27464B = -9223372036854775807L;
    }

    private void A() {
        this.f27475x = null;
        this.f27463A = -1;
        h32 h32Var = this.f27476y;
        if (h32Var != null) {
            h32Var.h();
            this.f27476y = null;
        }
        h32 h32Var2 = this.f27477z;
        if (h32Var2 != null) {
            h32Var2.h();
            this.f27477z = null;
        }
    }

    private void B() {
        A();
        d32 d32Var = this.f27474w;
        d32Var.getClass();
        d32Var.release();
        this.f27474w = null;
        this.f27472u = 0;
    }

    private long y() {
        if (this.f27463A == -1) {
            return Long.MAX_VALUE;
        }
        this.f27476y.getClass();
        if (this.f27463A >= this.f27476y.a()) {
            return Long.MAX_VALUE;
        }
        return this.f27476y.a(this.f27463A);
    }

    private void z() {
        this.f27471t = true;
        f32 f32Var = this.f27467p;
        yb0 yb0Var = this.f27473v;
        yb0Var.getClass();
        this.f27474w = ((f32.a) f32Var).a(yb0Var);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1811ak, com.yandex.mobile.ads.impl.so1
    public final boolean a() {
        return this.f27470s;
    }

    public final void c(long j4) {
        if (!k()) {
            throw new IllegalStateException();
        }
        this.f27464B = j4;
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final boolean d() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.so1, com.yandex.mobile.ads.impl.to1
    public final String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        List<uu> list = (List) message.obj;
        this.f27466o.onCues(list);
        this.f27466o.a(new wu(list));
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1811ak
    protected final void u() {
        this.f27473v = null;
        this.f27464B = -9223372036854775807L;
        List<uu> list = Collections.EMPTY_LIST;
        Handler handler = this.f27465n;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            this.f27466o.onCues(list);
            this.f27466o.a(new wu(list));
        }
        B();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1811ak
    protected final void a(long j4, boolean z4) {
        List<uu> list = Collections.EMPTY_LIST;
        Handler handler = this.f27465n;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            this.f27466o.onCues(list);
            this.f27466o.a(new wu(list));
        }
        this.f27469r = false;
        this.f27470s = false;
        this.f27464B = -9223372036854775807L;
        if (this.f27472u != 0) {
            B();
            z();
        } else {
            A();
            d32 d32Var = this.f27474w;
            d32Var.getClass();
            d32Var.flush();
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1811ak
    protected final void a(yb0[] yb0VarArr, long j4, long j5) {
        this.f27473v = yb0VarArr[0];
        if (this.f27474w != null) {
            this.f27472u = 1;
        } else {
            z();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x00db, code lost:
    
        if (r13 != false) goto L52;
     */
    @Override // com.yandex.mobile.ads.impl.so1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j4, long j5) {
        boolean z4;
        if (k()) {
            long j6 = this.f27464B;
            if (j6 != -9223372036854775807L && j4 >= j6) {
                A();
                this.f27470s = true;
            }
        }
        if (this.f27470s) {
            return;
        }
        if (this.f27477z == null) {
            d32 d32Var = this.f27474w;
            d32Var.getClass();
            d32Var.a(j4);
            try {
                d32 d32Var2 = this.f27474w;
                d32Var2.getClass();
                this.f27477z = d32Var2.a();
            } catch (e32 e4) {
                ms0.a("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f27473v, e4);
                List<uu> list = Collections.EMPTY_LIST;
                Handler handler = this.f27465n;
                if (handler != null) {
                    handler.obtainMessage(0, list).sendToTarget();
                } else {
                    this.f27466o.onCues(list);
                    this.f27466o.a(new wu(list));
                }
                B();
                z();
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.f27476y != null) {
            long y4 = y();
            z4 = false;
            while (y4 <= j4) {
                this.f27463A++;
                y4 = y();
                z4 = true;
            }
        } else {
            z4 = false;
        }
        h32 h32Var = this.f27477z;
        if (h32Var != null) {
            if (h32Var.f()) {
                if (!z4 && y() == Long.MAX_VALUE) {
                    if (this.f27472u == 2) {
                        B();
                        z();
                    } else {
                        A();
                        this.f27470s = true;
                    }
                }
            } else if (h32Var.f26983c <= j4) {
                h32 h32Var2 = this.f27476y;
                if (h32Var2 != null) {
                    h32Var2.h();
                }
                this.f27463A = h32Var.a(j4);
                this.f27476y = h32Var;
                this.f27477z = null;
                this.f27476y.getClass();
                List<uu> b4 = this.f27476y.b(j4);
                Handler handler2 = this.f27465n;
                if (handler2 != null) {
                    handler2.obtainMessage(0, b4).sendToTarget();
                } else {
                    this.f27466o.onCues(b4);
                    this.f27466o.a(new wu(b4));
                }
                if (this.f27472u == 2) {
                    return;
                }
                while (!this.f27469r) {
                    try {
                        g32 g32Var = this.f27475x;
                        if (g32Var == null) {
                            d32 d32Var3 = this.f27474w;
                            d32Var3.getClass();
                            g32Var = d32Var3.b();
                            if (g32Var == null) {
                                return;
                            } else {
                                this.f27475x = g32Var;
                            }
                        }
                        if (this.f27472u == 1) {
                            g32Var.d(4);
                            d32 d32Var4 = this.f27474w;
                            d32Var4.getClass();
                            d32Var4.a(g32Var);
                            this.f27475x = null;
                            this.f27472u = 2;
                            return;
                        }
                        int a4 = a(this.f27468q, g32Var, 0);
                        if (a4 == -4) {
                            if (g32Var.f()) {
                                this.f27469r = true;
                                this.f27471t = false;
                            } else {
                                yb0 yb0Var = this.f27468q.f35541b;
                                if (yb0Var == null) {
                                    return;
                                }
                                g32Var.f25996j = yb0Var.f34995q;
                                g32Var.h();
                                this.f27471t &= !g32Var.g();
                            }
                            if (!this.f27471t) {
                                d32 d32Var5 = this.f27474w;
                                d32Var5.getClass();
                                d32Var5.a(g32Var);
                                this.f27475x = null;
                            }
                        } else if (a4 == -3) {
                            return;
                        }
                    } catch (e32 e5) {
                        ms0.a("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f27473v, e5);
                        List<uu> list2 = Collections.EMPTY_LIST;
                        Handler handler3 = this.f27465n;
                        if (handler3 != null) {
                            handler3.obtainMessage(0, list2).sendToTarget();
                        } else {
                            this.f27466o.onCues(list2);
                            this.f27466o.a(new wu(list2));
                        }
                        B();
                        z();
                        return;
                    }
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.to1
    public final int a(yb0 yb0Var) {
        if (((f32.a) this.f27467p).b(yb0Var)) {
            return to1.a(yb0Var.f34978F == 0 ? 4 : 2, 0, 0);
        }
        if (i01.e(yb0Var.f34991m)) {
            return to1.a(1, 0, 0);
        }
        return to1.a(0, 0, 0);
    }
}
