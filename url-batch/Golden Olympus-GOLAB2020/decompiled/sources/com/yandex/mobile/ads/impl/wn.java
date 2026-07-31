package com.yandex.mobile.ads.impl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.yandex.mobile.ads.impl.tw1;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class wn {

    /* renamed from: a, reason: collision with root package name */
    protected final p52 f34131a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34132b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34133c;

    /* renamed from: d, reason: collision with root package name */
    private final long f34134d;

    /* renamed from: e, reason: collision with root package name */
    private final int f34135e;

    /* renamed from: f, reason: collision with root package name */
    private int f34136f;

    /* renamed from: g, reason: collision with root package name */
    private int f34137g;

    /* renamed from: h, reason: collision with root package name */
    private int f34138h;

    /* renamed from: i, reason: collision with root package name */
    private int f34139i;

    /* renamed from: j, reason: collision with root package name */
    private int f34140j;

    /* renamed from: k, reason: collision with root package name */
    private long[] f34141k;

    /* renamed from: l, reason: collision with root package name */
    private int[] f34142l;

    public wn(int i4, int i5, long j4, int i6, p52 p52Var) {
        boolean z4 = true;
        if (i5 != 1 && i5 != 2) {
            z4 = false;
        }
        C2253tf.a(z4);
        this.f34134d = j4;
        this.f34135e = i6;
        this.f34131a = p52Var;
        this.f34132b = a(i4, i5 == 2 ? 1667497984 : 1651965952);
        this.f34133c = i5 == 2 ? a(i4, 1650720768) : -1;
        this.f34141k = new long[UserVerificationMethods.USER_VERIFY_NONE];
        this.f34142l = new int[UserVerificationMethods.USER_VERIFY_NONE];
    }

    public final void a(long j4) {
        if (this.f34140j == this.f34142l.length) {
            long[] jArr = this.f34141k;
            this.f34141k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f34142l;
            this.f34142l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f34141k;
        int i4 = this.f34140j;
        jArr2[i4] = j4;
        this.f34142l[i4] = this.f34139i;
        this.f34140j = i4 + 1;
    }

    public final tw1.a b(long j4) {
        long j5 = 1;
        int i4 = (int) (j4 / ((this.f34134d * j5) / this.f34135e));
        int a4 = u82.a(this.f34142l, i4, true, true);
        int i5 = this.f34142l[a4];
        if (i5 == i4) {
            vw1 vw1Var = new vw1(((this.f34134d * j5) / this.f34135e) * i5, this.f34141k[a4]);
            return new tw1.a(vw1Var, vw1Var);
        }
        long j6 = i5;
        long j7 = (this.f34134d * j5) / this.f34135e;
        long[] jArr = this.f34141k;
        vw1 vw1Var2 = new vw1(j6 * j7, jArr[a4]);
        int i6 = a4 + 1;
        return i6 < jArr.length ? new tw1.a(vw1Var2, new vw1(j7 * r0[i6], jArr[i6])) : new tw1.a(vw1Var2, vw1Var2);
    }

    public final void c(long j4) {
        if (this.f34140j == 0) {
            this.f34138h = 0;
        } else {
            this.f34138h = this.f34142l[u82.b(this.f34141k, j4, true)];
        }
    }

    public final void a() {
        this.f34141k = Arrays.copyOf(this.f34141k, this.f34140j);
        this.f34142l = Arrays.copyOf(this.f34142l, this.f34140j);
    }

    private static int a(int i4, int i5) {
        return (((i4 % 10) + 48) << 8) | ((i4 / 10) + 48) | i5;
    }

    public final boolean a(int i4) {
        return this.f34132b == i4 || this.f34133c == i4;
    }

    public final boolean a(lz lzVar) {
        int i4 = this.f34137g;
        int b4 = i4 - this.f34131a.b(lzVar, i4, false);
        this.f34137g = b4;
        boolean z4 = b4 == 0;
        if (z4) {
            if (this.f34136f > 0) {
                p52 p52Var = this.f34131a;
                int i5 = this.f34138h;
                p52Var.a((this.f34134d * i5) / this.f34135e, Arrays.binarySearch(this.f34142l, i5) >= 0 ? 1 : 0, this.f34136f, 0, null);
            }
            this.f34138h++;
        }
        return z4;
    }

    public final void b() {
        this.f34139i++;
    }

    public final void b(int i4) {
        this.f34136f = i4;
        this.f34137g = i4;
    }
}
