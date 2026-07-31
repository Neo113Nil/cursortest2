package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class cr3 implements fs3 {

    /* renamed from: b, reason: collision with root package name */
    private static final ir3 f3929b = new ar3();

    /* renamed from: a, reason: collision with root package name */
    private final ir3 f3930a;

    public cr3() {
        ir3 ir3Var;
        ir3[] ir3VarArr = new ir3[2];
        ir3VarArr[0] = wp3.c();
        try {
            ir3Var = (ir3) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            ir3Var = f3929b;
        }
        ir3VarArr[1] = ir3Var;
        br3 br3Var = new br3(ir3VarArr);
        kq3.f(br3Var, "messageInfoFactory");
        this.f3930a = br3Var;
    }

    private static boolean a(hr3 hr3Var) {
        return hr3Var.c() == 1;
    }

    @Override // com.google.android.gms.internal.ads.fs3
    public final <T> es3<T> d(Class<T> cls) {
        qr3 a7;
        yq3 d7;
        ws3<?, ?> a8;
        np3<?> np3Var;
        fr3 a9;
        ws3<?, ?> b02;
        np3<?> a10;
        gs3.g(cls);
        hr3 a11 = this.f3930a.a(cls);
        if (a11.a()) {
            if (aq3.class.isAssignableFrom(cls)) {
                b02 = gs3.b();
                a10 = qp3.b();
            } else {
                b02 = gs3.b0();
                a10 = qp3.a();
            }
            return or3.k(b02, a10, a11.zza());
        }
        if (aq3.class.isAssignableFrom(cls)) {
            boolean a12 = a(a11);
            a7 = rr3.b();
            d7 = yq3.e();
            a8 = gs3.b();
            np3Var = a12 ? qp3.b() : null;
            a9 = gr3.b();
        } else {
            boolean a13 = a(a11);
            a7 = rr3.a();
            d7 = yq3.d();
            if (a13) {
                a8 = gs3.b0();
                np3Var = qp3.a();
            } else {
                a8 = gs3.a();
                np3Var = null;
            }
            a9 = gr3.a();
        }
        return nr3.K(cls, a11, a7, d7, a8, np3Var, a9);
    }
}
