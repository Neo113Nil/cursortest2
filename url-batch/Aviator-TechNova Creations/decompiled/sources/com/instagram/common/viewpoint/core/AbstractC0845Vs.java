package com.instagram.common.viewpoint.core;

import android.widget.RelativeLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Vs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0845Vs extends RelativeLayout {
    public static final AtomicBoolean A00 = new AtomicBoolean();
    public static final AtomicReference<InterfaceC0836Vj> A01 = new AtomicReference<>();

    public static void A00(boolean z, InterfaceC0836Vj interfaceC0836Vj) {
        A00.set(z);
        A01.set(interfaceC0836Vj);
    }
}
