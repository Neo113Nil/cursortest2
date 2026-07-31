package io.appmetrica.analytics.impl;

import kotlin.NoWhenBranchMatchedException;

/* renamed from: io.appmetrica.analytics.impl.j4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0268j4 {
    public static InterfaceC0217h4 a(Q3 q3) {
        switch (AbstractC0243i4.f1300a[q3.e.ordinal()]) {
            case 1:
                return new C0070bc();
            case 2:
                return new C0283jj();
            case 3:
                return new C0360mj();
            case 4:
                return new Dh(new Fh());
            case 5:
                return new Dh(new Vj());
            case 6:
                return new C0353mc();
            case 7:
                return new C0353mc();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
