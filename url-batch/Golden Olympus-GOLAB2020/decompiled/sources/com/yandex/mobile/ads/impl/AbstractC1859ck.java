package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.yandex.mobile.ads.impl.ck, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1859ck implements x60 {

    /* renamed from: a, reason: collision with root package name */
    protected final n52 f24231a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f24232b;

    /* renamed from: c, reason: collision with root package name */
    protected final int[] f24233c;

    /* renamed from: d, reason: collision with root package name */
    private final yb0[] f24234d;

    /* renamed from: e, reason: collision with root package name */
    private int f24235e;

    public AbstractC1859ck(n52 n52Var, int[] iArr) {
        int i4 = 0;
        C2253tf.b(iArr.length > 0);
        this.f24231a = (n52) C2253tf.a(n52Var);
        int length = iArr.length;
        this.f24232b = length;
        this.f24234d = new yb0[length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            this.f24234d[i5] = n52Var.a(iArr[i5]);
        }
        Arrays.sort(this.f24234d, new Comparator() { // from class: com.yandex.mobile.ads.impl.O0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int a4;
                a4 = AbstractC1859ck.a((yb0) obj, (yb0) obj2);
                return a4;
            }
        });
        this.f24233c = new int[this.f24232b];
        while (true) {
            int i6 = this.f24232b;
            if (i4 >= i6) {
                long[] jArr = new long[i6];
                return;
            } else {
                this.f24233c[i4] = n52Var.a(this.f24234d[i4]);
                i4++;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.x60
    public void a(float f4) {
    }

    @Override // com.yandex.mobile.ads.impl.x60
    public void c() {
    }

    @Override // com.yandex.mobile.ads.impl.x60
    public void d() {
    }

    @Override // com.yandex.mobile.ads.impl.x60
    public final yb0 e() {
        return this.f24234d[0];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC1859ck abstractC1859ck = (AbstractC1859ck) obj;
            if (this.f24231a == abstractC1859ck.f24231a && Arrays.equals(this.f24233c, abstractC1859ck.f24233c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f24235e == 0) {
            this.f24235e = Arrays.hashCode(this.f24233c) + (System.identityHashCode(this.f24231a) * 31);
        }
        return this.f24235e;
    }

    @Override // com.yandex.mobile.ads.impl.r52
    public final yb0 a(int i4) {
        return this.f24234d[i4];
    }

    @Override // com.yandex.mobile.ads.impl.r52
    public final int b(int i4) {
        return this.f24233c[i4];
    }

    @Override // com.yandex.mobile.ads.impl.r52
    public final int c(int i4) {
        for (int i5 = 0; i5 < this.f24232b; i5++) {
            if (this.f24233c[i5] == i4) {
                return i5;
            }
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.r52
    public final n52 a() {
        return this.f24231a;
    }

    @Override // com.yandex.mobile.ads.impl.r52
    public final int b() {
        return this.f24233c.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(yb0 yb0Var, yb0 yb0Var2) {
        return yb0Var2.f34987i - yb0Var.f34987i;
    }
}
