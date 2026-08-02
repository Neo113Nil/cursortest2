package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.play_billing.r1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0257r1 implements InterfaceC0266u1 {

    /* renamed from: b, reason: collision with root package name */
    public static final C0219e1 f2914b = new C0219e1(3);

    /* renamed from: a, reason: collision with root package name */
    public final Object f2915a;

    public C0257r1(InterfaceC0266u1... interfaceC0266u1Arr) {
        this.f2915a = interfaceC0266u1Arr;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0266u1
    public C1 a(Class cls) {
        for (int i3 = 0; i3 < 2; i3++) {
            InterfaceC0266u1 interfaceC0266u1 = ((InterfaceC0266u1[]) this.f2915a)[i3];
            if (interfaceC0266u1.b(cls)) {
                return interfaceC0266u1.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0266u1
    public boolean b(Class cls) {
        for (int i3 = 0; i3 < 2; i3++) {
            if (((InterfaceC0266u1[]) this.f2915a)[i3].b(cls)) {
                return true;
            }
        }
        return false;
    }

    public void c(int i3, Object obj, D1 d12) {
        Z0 z0 = (Z0) this.f2915a;
        z0.X(i3, 3);
        d12.h((S0) obj, z0.f2827b);
        z0.X(i3, 4);
    }

    public void d(int i3, Object obj, D1 d12) {
        S0 s02 = (S0) obj;
        Z0 z0 = (Z0) this.f2915a;
        z0.Z((i3 << 3) | 2);
        z0.Z(s02.a(d12));
        d12.h(s02, z0.f2827b);
    }

    public C0257r1() {
        A1 a12 = A1.f2703c;
        C0257r1 c0257r1 = new C0257r1(C0219e1.f2853b, f2914b);
        Charset charset = AbstractC0240l1.f2880a;
        this.f2915a = c0257r1;
    }

    public C0257r1(Z0 z0) {
        Charset charset = AbstractC0240l1.f2880a;
        this.f2915a = z0;
        z0.f2827b = this;
    }
}
