package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Vy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0851Vy {
    public static String[] A01 = {"0TBfSTrFZZIPTbjcv3YvZ5KQe5wh6M4Z", "Y", "skEIHJjGP8F0E9LHs3c03M6jOmkdnZrb", "lNiM6G1VkMzjPhI0VWbHd", "xoZoqEy9j11lJxTnOEXOmkmQN9dBXrj3", "0lNV7cA9G3CxYQK", "ZSiJ5Be21P36sCEypxWEkyax05PjjigP", "3dFveWP5h629GmfNhsyVO5v38YfKmNKK"};
    public static final ThreadLocal<C0851Vy> A02 = new ThreadLocal<>();
    public final C0834Vh A00 = new C0834Vh();

    public static C0834Vh A00() {
        return A02().A00;
    }

    public static C0834Vh A01(C0850Vx c0850Vx) {
        C0834Vh currentStackTraces = new C0834Vh(A00());
        currentStackTraces.add(c0850Vx);
        return currentStackTraces;
    }

    public static C0851Vy A02() {
        C0851Vy c0851Vy = A02.get();
        if (c0851Vy == null) {
            C0851Vy c0851Vy2 = new C0851Vy();
            A02.set(c0851Vy2);
            return c0851Vy2;
        }
        return c0851Vy;
    }

    public static void A03(AbstractRunnableC0846Vt abstractRunnableC0846Vt) {
        C0834Vh A06 = abstractRunnableC0846Vt.A06();
        if (A06 != null) {
            C0834Vh createRunnableAsyncStackTrace = A02().A00;
            createRunnableAsyncStackTrace.addAll(A06);
        }
    }

    public static void A04(AbstractRunnableC0846Vt abstractRunnableC0846Vt) {
        C0834Vh A06 = abstractRunnableC0846Vt.A06();
        if (A06 != null) {
            C0834Vh c0834Vh = A02().A00;
            String[] strArr = A01;
            if (strArr[1].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[0] = "6tfOksRsBjIBNQljvPHCCYkD1Hr87lb7";
            c0834Vh.removeAll(A06);
        }
    }
}
