package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.np, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1769np implements InterfaceC01373v {
    public static final List<C1770nq> A01 = new ArrayList(50);
    public final Handler A00;

    public C1769np(Handler handler) {
        this.A00 = handler;
    }

    public static C1770nq A00() {
        C1770nq c1770nq;
        synchronized (A01) {
            c1770nq = A01.isEmpty() ? new C1770nq() : A01.remove(A01.size() - 1);
        }
        return c1770nq;
    }

    public static void A01(C1770nq c1770nq) {
        synchronized (A01) {
            if (A01.size() < 50) {
                A01.add(c1770nq);
            }
        }
    }

    public final boolean A03(Runnable runnable) {
        return this.A00.post(runnable);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01373v
    public final Looper A8J() {
        return this.A00.getLooper();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01373v
    public final boolean A9f(int i) {
        return this.A00.hasMessages(i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01373v
    public final C1770nq AC7(int i) {
        return A00().A01(this.A00.obtainMessage(i), this);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01373v
    public final C1770nq AC8(int i, int i2, int i3) {
        return A00().A01(this.A00.obtainMessage(i, i2, i3), this);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01373v
    public final C1770nq AC9(int i, int i2, int i3, Object obj) {
        return A00().A01(this.A00.obtainMessage(i, i2, i3, obj), this);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01373v
    public final C1770nq ACA(int i, Object obj) {
        return A00().A01(this.A00.obtainMessage(i, obj), this);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01373v
    public final void AHj(int i) {
        this.A00.removeMessages(i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01373v
    public final boolean AIQ(int i) {
        return this.A00.sendEmptyMessage(i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01373v
    public final boolean AIR(int i, long j) {
        return this.A00.sendEmptyMessageAtTime(i, j);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01373v
    public final boolean AIT(InterfaceC01363u interfaceC01363u) {
        return ((C1770nq) interfaceC01363u).A03(this.A00);
    }
}
