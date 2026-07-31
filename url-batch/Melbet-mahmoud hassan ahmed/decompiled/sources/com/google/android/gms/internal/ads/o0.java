package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
final class o0 extends q0 {

    /* renamed from: b, reason: collision with root package name */
    public final long f9410b;

    /* renamed from: c, reason: collision with root package name */
    public final List<p0> f9411c;

    /* renamed from: d, reason: collision with root package name */
    public final List<o0> f9412d;

    public o0(int i7, long j7) {
        super(i7);
        this.f9410b = j7;
        this.f9411c = new ArrayList();
        this.f9412d = new ArrayList();
    }

    public final o0 c(int i7) {
        int size = this.f9412d.size();
        for (int i8 = 0; i8 < size; i8++) {
            o0 o0Var = this.f9412d.get(i8);
            if (o0Var.f10494a == i7) {
                return o0Var;
            }
        }
        return null;
    }

    public final p0 d(int i7) {
        int size = this.f9411c.size();
        for (int i8 = 0; i8 < size; i8++) {
            p0 p0Var = this.f9411c.get(i8);
            if (p0Var.f10494a == i7) {
                return p0Var;
            }
        }
        return null;
    }

    public final void e(o0 o0Var) {
        this.f9412d.add(o0Var);
    }

    public final void f(p0 p0Var) {
        this.f9411c.add(p0Var);
    }

    @Override // com.google.android.gms.internal.ads.q0
    public final String toString() {
        String b7 = q0.b(this.f10494a);
        String arrays = Arrays.toString(this.f9411c.toArray());
        String arrays2 = Arrays.toString(this.f9412d.toArray());
        int length = String.valueOf(arrays).length();
        StringBuilder sb = new StringBuilder(b7.length() + 22 + length + String.valueOf(arrays2).length());
        sb.append(b7);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }
}
