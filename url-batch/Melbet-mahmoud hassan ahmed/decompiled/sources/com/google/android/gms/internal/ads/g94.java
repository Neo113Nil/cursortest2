package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class g94 {

    /* renamed from: b, reason: collision with root package name */
    private int f5508b;

    /* renamed from: c, reason: collision with root package name */
    private int f5509c;

    /* renamed from: d, reason: collision with root package name */
    private int f5510d = 0;

    /* renamed from: e, reason: collision with root package name */
    private s84[] f5511e = new s84[100];

    /* renamed from: a, reason: collision with root package name */
    private final s84[] f5507a = new s84[1];

    public g94(boolean z6, int i7) {
    }

    public final synchronized int a() {
        return this.f5509c * 65536;
    }

    public final synchronized s84 b() {
        s84 s84Var;
        this.f5509c++;
        int i7 = this.f5510d;
        if (i7 > 0) {
            s84[] s84VarArr = this.f5511e;
            int i8 = i7 - 1;
            this.f5510d = i8;
            s84Var = s84VarArr[i8];
            Objects.requireNonNull(s84Var);
            s84VarArr[i8] = null;
        } else {
            s84Var = new s84(new byte[65536], 0);
        }
        return s84Var;
    }

    public final synchronized void c(s84 s84Var) {
        s84[] s84VarArr = this.f5507a;
        s84VarArr[0] = s84Var;
        d(s84VarArr);
    }

    public final synchronized void d(s84[] s84VarArr) {
        int length = this.f5510d + s84VarArr.length;
        s84[] s84VarArr2 = this.f5511e;
        int length2 = s84VarArr2.length;
        if (length >= length2) {
            this.f5511e = (s84[]) Arrays.copyOf(s84VarArr2, Math.max(length2 + length2, length));
        }
        for (s84 s84Var : s84VarArr) {
            s84[] s84VarArr3 = this.f5511e;
            int i7 = this.f5510d;
            this.f5510d = i7 + 1;
            s84VarArr3[i7] = s84Var;
        }
        this.f5509c -= s84VarArr.length;
        notifyAll();
    }

    public final synchronized void e() {
        f(0);
    }

    public final synchronized void f(int i7) {
        int i8 = this.f5508b;
        this.f5508b = i7;
        if (i7 < i8) {
            g();
        }
    }

    public final synchronized void g() {
        int max = Math.max(0, n13.K(this.f5508b, 65536) - this.f5509c);
        int i7 = this.f5510d;
        if (max >= i7) {
            return;
        }
        Arrays.fill(this.f5511e, max, i7, (Object) null);
        this.f5510d = max;
    }
}
