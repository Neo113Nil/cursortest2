package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class b01 extends AbstractC1811ak implements Handler.Callback {

    /* renamed from: n, reason: collision with root package name */
    private final yz0 f23533n;

    /* renamed from: o, reason: collision with root package name */
    private final a01 f23534o;

    /* renamed from: p, reason: collision with root package name */
    private final Handler f23535p;

    /* renamed from: q, reason: collision with root package name */
    private final zz0 f23536q;

    /* renamed from: r, reason: collision with root package name */
    private xz0 f23537r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f23538s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f23539t;

    /* renamed from: u, reason: collision with root package name */
    private long f23540u;

    /* renamed from: v, reason: collision with root package name */
    private long f23541v;

    /* renamed from: w, reason: collision with root package name */
    private wz0 f23542w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b01(a01 a01Var, Looper looper) {
        super(5);
        yz0 yz0Var = yz0.f35406a;
        this.f23534o = (a01) C2253tf.a(a01Var);
        this.f23535p = looper == null ? null : u82.a(looper, (Handler.Callback) this);
        this.f23533n = (yz0) C2253tf.a(yz0Var);
        this.f23536q = new zz0();
        this.f23541v = -9223372036854775807L;
    }

    private void a(wz0 wz0Var, ArrayList arrayList) {
        for (int i4 = 0; i4 < wz0Var.c(); i4++) {
            yb0 a4 = wz0Var.a(i4).a();
            if (a4 == null || !this.f23533n.a(a4)) {
                arrayList.add(wz0Var.a(i4));
            } else {
                hy1 b4 = this.f23533n.b(a4);
                byte[] b5 = wz0Var.a(i4).b();
                b5.getClass();
                this.f23536q.b();
                this.f23536q.e(b5.length);
                ByteBuffer byteBuffer = this.f23536q.f26356d;
                int i5 = u82.f32873a;
                byteBuffer.put(b5);
                this.f23536q.h();
                wz0 a5 = b4.a(this.f23536q);
                if (a5 != null) {
                    a(a5, arrayList);
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final boolean d() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.so1, com.yandex.mobile.ads.impl.to1
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        this.f23534o.a((wz0) message.obj);
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1811ak
    protected final void u() {
        this.f23542w = null;
        this.f23541v = -9223372036854775807L;
        this.f23537r = null;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1811ak, com.yandex.mobile.ads.impl.so1
    public final boolean a() {
        return this.f23539t;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1811ak
    protected final void a(long j4, boolean z4) {
        this.f23542w = null;
        this.f23541v = -9223372036854775807L;
        this.f23538s = false;
        this.f23539t = false;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1811ak
    protected final void a(yb0[] yb0VarArr, long j4, long j5) {
        this.f23537r = this.f23533n.b(yb0VarArr[0]);
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final void a(long j4, long j5) {
        boolean z4;
        do {
            z4 = false;
            if (!this.f23538s && this.f23542w == null) {
                this.f23536q.b();
                zb0 q4 = q();
                int a4 = a(q4, this.f23536q, 0);
                if (a4 == -4) {
                    if (this.f23536q.f()) {
                        this.f23538s = true;
                    } else {
                        zz0 zz0Var = this.f23536q;
                        zz0Var.f35836j = this.f23540u;
                        zz0Var.h();
                        xz0 xz0Var = this.f23537r;
                        int i4 = u82.f32873a;
                        wz0 a5 = xz0Var.a(this.f23536q);
                        if (a5 != null) {
                            ArrayList arrayList = new ArrayList(a5.c());
                            a(a5, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f23542w = new wz0(arrayList);
                                this.f23541v = this.f23536q.f26358f;
                            }
                        }
                    }
                } else if (a4 == -5) {
                    yb0 yb0Var = q4.f35541b;
                    yb0Var.getClass();
                    this.f23540u = yb0Var.f34995q;
                }
            }
            wz0 wz0Var = this.f23542w;
            if (wz0Var != null && this.f23541v <= j4) {
                Handler handler = this.f23535p;
                if (handler != null) {
                    handler.obtainMessage(0, wz0Var).sendToTarget();
                } else {
                    this.f23534o.a(wz0Var);
                }
                this.f23542w = null;
                this.f23541v = -9223372036854775807L;
                z4 = true;
            }
            if (this.f23538s && this.f23542w == null) {
                this.f23539t = true;
            }
        } while (z4);
    }

    @Override // com.yandex.mobile.ads.impl.to1
    public final int a(yb0 yb0Var) {
        if (this.f23533n.a(yb0Var)) {
            return to1.a(yb0Var.f34978F == 0 ? 4 : 2, 0, 0);
        }
        return to1.a(0, 0, 0);
    }
}
