package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class gn extends AbstractC1811ak {

    /* renamed from: n, reason: collision with root package name */
    private final gy f26237n;

    /* renamed from: o, reason: collision with root package name */
    private final sf1 f26238o;

    /* renamed from: p, reason: collision with root package name */
    private long f26239p;

    /* renamed from: q, reason: collision with root package name */
    private fn f26240q;

    /* renamed from: r, reason: collision with root package name */
    private long f26241r;

    public gn() {
        super(6);
        this.f26237n = new gy(1);
        this.f26238o = new sf1();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1811ak, com.yandex.mobile.ads.impl.fi1.b
    public final void a(int i4, Object obj) {
        if (i4 == 8) {
            this.f26240q = (fn) obj;
        }
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final boolean d() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.so1, com.yandex.mobile.ads.impl.to1
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1811ak
    protected final void u() {
        fn fnVar = this.f26240q;
        if (fnVar != null) {
            fnVar.f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1811ak
    protected final void a(long j4, boolean z4) {
        this.f26241r = Long.MIN_VALUE;
        fn fnVar = this.f26240q;
        if (fnVar != null) {
            fnVar.f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1811ak
    protected final void a(yb0[] yb0VarArr, long j4, long j5) {
        this.f26239p = j5;
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final void a(long j4, long j5) {
        float[] fArr;
        while (!e() && this.f26241r < 100000 + j4) {
            this.f26237n.b();
            if (a(q(), this.f26237n, 0) != -4 || this.f26237n.f()) {
                return;
            }
            gy gyVar = this.f26237n;
            this.f26241r = gyVar.f26358f;
            if (this.f26240q != null && !gyVar.e()) {
                this.f26237n.h();
                ByteBuffer byteBuffer = this.f26237n.f26356d;
                int i4 = u82.f32873a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    this.f26238o.a(byteBuffer.limit(), byteBuffer.array());
                    this.f26238o.e(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i5 = 0; i5 < 3; i5++) {
                        fArr2[i5] = Float.intBitsToFloat(this.f26238o.k());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f26240q.a(this.f26241r - this.f26239p, fArr);
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.to1
    public final int a(yb0 yb0Var) {
        if ("application/x-camera-motion".equals(yb0Var.f34991m)) {
            return to1.a(4, 0, 0);
        }
        return to1.a(0, 0, 0);
    }
}
