package com.google.android.gms.internal.consent_sdk;

import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.consent_sdk.w2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4399w2 implements b3, I3.h, I3.g, a3, A2 {

    /* renamed from: v, reason: collision with root package name */
    public static final J1 f35942v = new J1(27);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f35943n;

    /* renamed from: u, reason: collision with root package name */
    public Object f35944u;

    public /* synthetic */ C4399w2(int i, Object obj) {
        this.f35943n = i;
        this.f35944u = obj;
    }

    @Override // I3.h
    public void a(C4349k c4349k) {
        ((AtomicReference) this.f35944u).set(c4349k);
    }

    @Override // I3.g
    public void b(I3.f fVar) {
        ((I3.b) this.f35944u).onConsentFormDismissed(fVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.A2
    public H2 c(Class cls) {
        for (int i = 0; i < 2; i++) {
            A2 a22 = ((A2[]) this.f35944u)[i];
            if (a22.e(cls)) {
                return a22.c(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.consent_sdk.b3
    public Object d() {
        switch (this.f35943n) {
            case 1:
                return new C4317c((C4313b) ((C4313b) this.f35944u).f35811a);
            case 4:
                B b9 = C.f35656b;
                E.c(b9);
                return new C4361n((C4399w2) this.f35944u, b9);
            case 7:
                Z2 z22 = (Z2) this.f35944u;
                if (z22 != null) {
                    return z22.d();
                }
                throw new IllegalStateException();
            default:
                return this.f35944u;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.A2
    public boolean e(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((A2[]) this.f35944u)[i].e(cls)) {
                return true;
            }
        }
        return false;
    }

    public void f(int i, Object obj, I2 i22) {
        AbstractC4320c2 abstractC4320c2 = (AbstractC4320c2) obj;
        C4344i2 c4344i2 = (C4344i2) this.f35944u;
        c4344i2.y(i, 2);
        c4344i2.A(abstractC4320c2.b(i22));
        i22.d(abstractC4320c2, this);
    }

    public C4399w2(int i) {
        this.f35943n = i;
        switch (i) {
            case 7:
                break;
            default:
                int i4 = AbstractC4328e2.f35830a;
                C4399w2 c4399w2 = new C4399w2(6, new A2[]{J1.f35709O, f35942v});
                Charset charset = AbstractC4383s2.f35907a;
                this.f35944u = c4399w2;
                break;
        }
    }

    public C4399w2(C4313b c4313b) {
        this.f35943n = 1;
        Objects.requireNonNull(c4313b);
        this.f35944u = c4313b;
    }

    public C4399w2(C4344i2 c4344i2) {
        this.f35943n = 5;
        Charset charset = AbstractC4383s2.f35907a;
        this.f35944u = c4344i2;
        c4344i2.f35851b = this;
    }
}
