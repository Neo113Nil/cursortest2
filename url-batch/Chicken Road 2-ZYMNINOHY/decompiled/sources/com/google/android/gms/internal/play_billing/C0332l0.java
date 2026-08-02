package com.google.android.gms.internal.play_billing;

import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.gms.internal.play_billing.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0332l0 {

    /* renamed from: b, reason: collision with root package name */
    public static final C0332l0 f5968b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0332l0 f5969c;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f5970a;

    static {
        if (G1.f5838d) {
            f5969c = null;
            f5968b = null;
        } else {
            f5969c = new C0332l0(null);
            f5968b = new C0332l0(null);
        }
    }

    public C0332l0(CancellationException cancellationException) {
        this.f5970a = cancellationException;
    }
}
