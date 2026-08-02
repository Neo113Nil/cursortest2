package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Vy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0845Vy {
    public static String[] A01 = {"0TBfSTrFZZIPTbjcv3YvZ5KQe5wh6M4Z", "Y", "skEIHJjGP8F0E9LHs3c03M6jOmkdnZrb", "lNiM6G1VkMzjPhI0VWbHd", "xoZoqEy9j11lJxTnOEXOmkmQN9dBXrj3", "0lNV7cA9G3CxYQK", "ZSiJ5Be21P36sCEypxWEkyax05PjjigP", "3dFveWP5h629GmfNhsyVO5v38YfKmNKK"};
    public static final ThreadLocal<C0845Vy> A02 = new ThreadLocal<>();
    public final C0828Vh A00 = new C0828Vh();

    public static C0828Vh A00() {
        return A02().A00;
    }

    public static C0828Vh A01(C0844Vx c0844Vx) {
        C0828Vh currentStackTraces = new C0828Vh(A00());
        currentStackTraces.add(c0844Vx);
        return currentStackTraces;
    }

    public static C0845Vy A02() {
        C0845Vy c0845Vy = A02.get();
        if (c0845Vy == null) {
            C0845Vy c0845Vy2 = new C0845Vy();
            A02.set(c0845Vy2);
            return c0845Vy2;
        }
        return c0845Vy;
    }

    public static void A03(AbstractRunnableC0840Vt abstractRunnableC0840Vt) {
        C0828Vh A06 = abstractRunnableC0840Vt.A06();
        if (A06 != null) {
            C0828Vh createRunnableAsyncStackTrace = A02().A00;
            createRunnableAsyncStackTrace.addAll(A06);
        }
    }

    public static void A04(AbstractRunnableC0840Vt abstractRunnableC0840Vt) {
        C0828Vh A06 = abstractRunnableC0840Vt.A06();
        if (A06 != null) {
            C0828Vh c0828Vh = A02().A00;
            String[] strArr = A01;
            if (strArr[1].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[0] = "6tfOksRsBjIBNQljvPHCCYkD1Hr87lb7";
            c0828Vh.removeAll(A06);
        }
    }
}
