package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zr3 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayDeque<uo3> f15241a = new ArrayDeque<>();

    /* synthetic */ zr3(yr3 yr3Var) {
    }

    static /* bridge */ /* synthetic */ uo3 a(zr3 zr3Var, uo3 uo3Var, uo3 uo3Var2) {
        zr3Var.b(uo3Var);
        zr3Var.b(uo3Var2);
        uo3 pop = zr3Var.f15241a.pop();
        while (!zr3Var.f15241a.isEmpty()) {
            pop = new ds3(zr3Var.f15241a.pop(), pop);
        }
        return pop;
    }

    private final void b(uo3 uo3Var) {
        cs3 cs3Var;
        if (!uo3Var.t()) {
            if (!(uo3Var instanceof ds3)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(uo3Var.getClass())));
            }
            ds3 ds3Var = (ds3) uo3Var;
            b(ds3Var.f4316k);
            b(ds3Var.f4317l);
            return;
        }
        int c7 = c(uo3Var.q());
        int S = ds3.S(c7 + 1);
        if (this.f15241a.isEmpty() || this.f15241a.peek().q() >= S) {
            this.f15241a.push(uo3Var);
            return;
        }
        int S2 = ds3.S(c7);
        uo3 pop = this.f15241a.pop();
        while (true) {
            cs3Var = null;
            if (this.f15241a.isEmpty() || this.f15241a.peek().q() >= S2) {
                break;
            } else {
                pop = new ds3(this.f15241a.pop(), pop);
            }
        }
        ds3 ds3Var2 = new ds3(pop, uo3Var);
        while (!this.f15241a.isEmpty()) {
            if (this.f15241a.peek().q() >= ds3.S(c(ds3Var2.q()) + 1)) {
                break;
            } else {
                ds3Var2 = new ds3(this.f15241a.pop(), ds3Var2);
            }
        }
        this.f15241a.push(ds3Var2);
    }

    private static final int c(int i7) {
        int binarySearch = Arrays.binarySearch(ds3.f4314o, i7);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }
}
