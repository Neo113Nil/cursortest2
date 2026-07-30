package com.google.android.gms.internal.consent_sdk;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.consent_sdk.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4353l implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f35872n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f35873u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f35874v;

    public /* synthetic */ RunnableC4353l(int i, Object obj, Object obj2) {
        this.f35872n = i;
        this.f35873u = obj;
        this.f35874v = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean booleanValue;
        switch (this.f35872n) {
            case 0:
                AtomicReference atomicReference = ((C4361n) this.f35873u).f35888c;
                Objects.requireNonNull(atomicReference);
                ((C4349k) this.f35874v).b(new C4399w2(2, atomicReference), new J1(22));
                return;
            default:
                C4373q c4373q = (C4373q) this.f35873u;
                String str = (String) this.f35874v;
                synchronized (E.class) {
                    if (E.f35667a == null) {
                        try {
                            c4373q.evaluateJavascript("(function(){})()", null);
                            E.f35667a = Boolean.TRUE;
                        } catch (IllegalStateException unused) {
                            E.f35667a = Boolean.FALSE;
                        }
                    }
                    booleanValue = E.f35667a.booleanValue();
                }
                if (booleanValue) {
                    c4373q.evaluateJavascript(str, null);
                    return;
                } else {
                    c4373q.loadUrl("javascript:".concat(str));
                    return;
                }
        }
    }
}
