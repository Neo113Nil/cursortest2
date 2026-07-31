package com.yandex.mobile.ads.impl;

import android.util.Pair;
import com.yandex.mobile.ads.impl.dw0;
import com.yandex.mobile.ads.impl.x42;

/* loaded from: classes3.dex */
public final class rt0 extends sq<Void> {

    /* renamed from: k, reason: collision with root package name */
    private final dw0 f31352k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f31353l;

    /* renamed from: m, reason: collision with root package name */
    private final x42.d f31354m;

    /* renamed from: n, reason: collision with root package name */
    private final x42.b f31355n;

    /* renamed from: o, reason: collision with root package name */
    private a f31356o;

    /* renamed from: p, reason: collision with root package name */
    private qt0 f31357p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f31358q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f31359r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f31360s;

    private static final class a extends dc0 {

        /* renamed from: f, reason: collision with root package name */
        public static final Object f31361f = new Object();

        /* renamed from: d, reason: collision with root package name */
        private final Object f31362d;

        /* renamed from: e, reason: collision with root package name */
        private final Object f31363e;

        @Override // com.yandex.mobile.ads.impl.dc0, com.yandex.mobile.ads.impl.x42
        public final int a(Object obj) {
            Object obj2;
            x42 x42Var = this.f24579c;
            if (f31361f.equals(obj) && (obj2 = this.f31363e) != null) {
                obj = obj2;
            }
            return x42Var.a(obj);
        }

        private a(x42 x42Var, Object obj, Object obj2) {
            super(x42Var);
            this.f31362d = obj;
            this.f31363e = obj2;
        }

        @Override // com.yandex.mobile.ads.impl.x42
        public final x42.b a(int i4, x42.b bVar, boolean z4) {
            this.f24579c.a(i4, bVar, z4);
            if (u82.a(bVar.f34404c, this.f31363e) && z4) {
                bVar.f34404c = f31361f;
            }
            return bVar;
        }

        @Override // com.yandex.mobile.ads.impl.dc0, com.yandex.mobile.ads.impl.x42
        public final Object a(int i4) {
            Object a4 = this.f24579c.a(i4);
            return u82.a(a4, this.f31363e) ? f31361f : a4;
        }

        @Override // com.yandex.mobile.ads.impl.dc0, com.yandex.mobile.ads.impl.x42
        public final x42.d a(int i4, x42.d dVar, long j4) {
            this.f24579c.a(i4, dVar, j4);
            if (u82.a(dVar.f34418b, this.f31362d)) {
                dVar.f34418b = x42.d.f34414s;
            }
            return dVar;
        }

        public static a a(rv0 rv0Var) {
            return new a(new b(rv0Var), x42.d.f34414s, f31361f);
        }
    }

    public static final class b extends x42 {

        /* renamed from: c, reason: collision with root package name */
        private final rv0 f31364c;

        public b(rv0 rv0Var) {
            this.f31364c = rv0Var;
        }

        @Override // com.yandex.mobile.ads.impl.x42
        public final int a() {
            return 1;
        }

        @Override // com.yandex.mobile.ads.impl.x42
        public final int b() {
            return 1;
        }

        @Override // com.yandex.mobile.ads.impl.x42
        public final int a(Object obj) {
            return obj == a.f31361f ? 0 : -1;
        }

        @Override // com.yandex.mobile.ads.impl.x42
        public final x42.b a(int i4, x42.b bVar, boolean z4) {
            bVar.a(z4 ? 0 : null, z4 ? a.f31361f : null, 0, -9223372036854775807L, 0L, C2265u4.f32818h, true);
            return bVar;
        }

        @Override // com.yandex.mobile.ads.impl.x42
        public final x42.d a(int i4, x42.d dVar, long j4) {
            dVar.a(x42.d.f34414s, this.f31364c, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            dVar.f34429m = true;
            return dVar;
        }

        @Override // com.yandex.mobile.ads.impl.x42
        public final Object a(int i4) {
            return a.f31361f;
        }
    }

    public rt0(dw0 dw0Var, boolean z4) {
        boolean z5;
        this.f31352k = dw0Var;
        if (z4) {
            dw0Var.getClass();
            z5 = true;
        } else {
            z5 = false;
        }
        this.f31353l = z5;
        this.f31354m = new x42.d();
        this.f31355n = new x42.b();
        dw0Var.getClass();
        this.f31356o = a.a(dw0Var.getMediaItem());
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final qt0 a(dw0.b bVar, InterfaceC2250tc interfaceC2250tc, long j4) {
        qt0 qt0Var = new qt0(bVar, interfaceC2250tc, j4);
        qt0Var.a(this.f31352k);
        if (!this.f31359r) {
            this.f31357p = qt0Var;
            if (!this.f31358q) {
                this.f31358q = true;
                a((rt0) null, this.f31352k);
            }
            return qt0Var;
        }
        Object obj = bVar.f35792a;
        if (this.f31356o.f31363e != null && obj.equals(a.f31361f)) {
            obj = this.f31356o.f31363e;
        }
        qt0Var.a(new dw0.b(bVar.a(obj)));
        return qt0Var;
    }

    @Override // com.yandex.mobile.ads.impl.sq, com.yandex.mobile.ads.impl.AbstractC2349xj
    public final void e() {
        this.f31359r = false;
        this.f31358q = false;
        super.e();
    }

    public final x42 f() {
        return this.f31356o;
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    public final rv0 getMediaItem() {
        return this.f31352k.getMediaItem();
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    public final void maybeThrowSourceInfoRefreshError() {
    }

    @Override // com.yandex.mobile.ads.impl.sq
    protected final dw0.b a(Void r22, dw0.b bVar) {
        Object obj = bVar.f35792a;
        Object obj2 = this.f31356o.f31363e;
        if (obj2 != null && obj2.equals(obj)) {
            obj = a.f31361f;
        }
        return new dw0.b(bVar.a(obj));
    }

    @Override // com.yandex.mobile.ads.impl.sq, com.yandex.mobile.ads.impl.AbstractC2349xj
    public final void a(s62 s62Var) {
        super.a(s62Var);
        if (this.f31353l) {
            return;
        }
        this.f31358q = true;
        a((rt0) null, this.f31352k);
    }

    @Override // com.yandex.mobile.ads.impl.dw0
    public final void a(xv0 xv0Var) {
        ((qt0) xv0Var).c();
        if (xv0Var == this.f31357p) {
            this.f31357p = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.yandex.mobile.ads.impl.Tc] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    @Override // com.yandex.mobile.ads.impl.sq
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Void r17, dw0 dw0Var, x42 x42Var) {
        long j4;
        a aVar;
        qt0 qt0Var;
        a aVar2;
        dw0.b bVar = 0;
        bVar = 0;
        bVar = 0;
        bVar = 0;
        if (this.f31359r) {
            a aVar3 = this.f31356o;
            this.f31356o = new a(x42Var, aVar3.f31362d, aVar3.f31363e);
            qt0 qt0Var2 = this.f31357p;
            if (qt0Var2 != null) {
                a(qt0Var2.a());
            }
        } else if (x42Var.c()) {
            if (this.f31360s) {
                a aVar4 = this.f31356o;
                aVar2 = new a(x42Var, aVar4.f31362d, aVar4.f31363e);
            } else {
                aVar2 = new a(x42Var, x42.d.f34414s, a.f31361f);
            }
            this.f31356o = aVar2;
        } else {
            x42Var.a(0, this.f31354m, 0L);
            x42.d dVar = this.f31354m;
            long j5 = dVar.f34430n;
            Object obj = dVar.f34418b;
            qt0 qt0Var3 = this.f31357p;
            if (qt0Var3 != null) {
                long b4 = qt0Var3.b();
                a aVar5 = this.f31356o;
                Object obj2 = this.f31357p.f30884b.f35792a;
                aVar5.a(aVar5.a(obj2), this.f31355n, true);
                long j6 = this.f31355n.f34407f + b4;
                if (j6 != this.f31356o.a(0, this.f31354m, 0L).f34430n) {
                    j4 = j6;
                    Pair<Object, Long> a4 = x42Var.a(this.f31354m, this.f31355n, 0, j4);
                    Object obj3 = a4.first;
                    long longValue = ((Long) a4.second).longValue();
                    if (!this.f31360s) {
                        a aVar6 = this.f31356o;
                        aVar = new a(x42Var, aVar6.f31362d, aVar6.f31363e);
                    } else {
                        aVar = new a(x42Var, obj, obj3);
                    }
                    this.f31356o = aVar;
                    qt0Var = this.f31357p;
                    if (qt0Var != null) {
                        a(longValue);
                        dw0.b bVar2 = qt0Var.f30884b;
                        Object obj4 = bVar2.f35792a;
                        if (this.f31356o.f31363e != null && obj4.equals(a.f31361f)) {
                            obj4 = this.f31356o.f31363e;
                        }
                        bVar = new dw0.b(bVar2.a(obj4));
                    }
                }
            }
            j4 = j5;
            Pair<Object, Long> a42 = x42Var.a(this.f31354m, this.f31355n, 0, j4);
            Object obj32 = a42.first;
            long longValue2 = ((Long) a42.second).longValue();
            if (!this.f31360s) {
            }
            this.f31356o = aVar;
            qt0Var = this.f31357p;
            if (qt0Var != null) {
            }
        }
        this.f31360s = true;
        this.f31359r = true;
        a(this.f31356o);
        if (bVar != 0) {
            qt0 qt0Var4 = this.f31357p;
            qt0Var4.getClass();
            qt0Var4.a(bVar);
        }
    }

    private void a(long j4) {
        qt0 qt0Var = this.f31357p;
        int a4 = this.f31356o.a(qt0Var.f30884b.f35792a);
        if (a4 == -1) {
            return;
        }
        long j5 = this.f31356o.a(a4, this.f31355n, false).f34406e;
        if (j5 != -9223372036854775807L && j4 >= j5) {
            j4 = Math.max(0L, j5 - 1);
        }
        qt0Var.a(j4);
    }
}
