package com.anythink.core.common.n.b.a.e;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    static final int f15485a = 65535;

    /* renamed from: b, reason: collision with root package name */
    static final int f15486b = 1;

    /* renamed from: c, reason: collision with root package name */
    static final int f15487c = 2;

    /* renamed from: d, reason: collision with root package name */
    static final int f15488d = 4;

    /* renamed from: e, reason: collision with root package name */
    static final int f15489e = 5;

    /* renamed from: f, reason: collision with root package name */
    static final int f15490f = 6;

    /* renamed from: g, reason: collision with root package name */
    static final int f15491g = 7;

    /* renamed from: h, reason: collision with root package name */
    static final int f15492h = 10;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f15493j = new int[10];

    public final void a() {
        this.i = 0;
        Arrays.fill(this.f15493j, 0);
    }

    public final int b(int i) {
        return this.f15493j[i];
    }

    public final int c() {
        if ((this.i & 2) != 0) {
            return this.f15493j[1];
        }
        return -1;
    }

    public final int d() {
        if ((this.i & 16) != 0) {
            return this.f15493j[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int e() {
        return (this.i & 128) != 0 ? this.f15493j[7] : f15485a;
    }

    private int d(int i) {
        return (this.i & 64) != 0 ? this.f15493j[6] : i;
    }

    public final int b() {
        return Integer.bitCount(this.i);
    }

    public final int c(int i) {
        return (this.i & 32) != 0 ? this.f15493j[5] : i;
    }

    public final m a(int i, int i4) {
        if (i >= 0) {
            int[] iArr = this.f15493j;
            if (i < iArr.length) {
                this.i = (1 << i) | this.i;
                iArr[i] = i4;
            }
        }
        return this;
    }

    public final boolean a(int i) {
        return ((1 << i) & this.i) != 0;
    }

    private boolean a(boolean z8) {
        return ((this.i & 4) != 0 ? this.f15493j[2] : z8 ? 1 : 0) == 1;
    }

    public final void a(m mVar) {
        for (int i = 0; i < 10; i++) {
            if (mVar.a(i)) {
                a(i, mVar.f15493j[i]);
            }
        }
    }
}
