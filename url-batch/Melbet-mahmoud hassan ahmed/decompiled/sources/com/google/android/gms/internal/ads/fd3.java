package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.kr3;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
class fd3<PrimitiveT, KeyProtoT extends kr3> implements dd3<PrimitiveT> {

    /* renamed from: a, reason: collision with root package name */
    private final ld3<KeyProtoT> f5089a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<PrimitiveT> f5090b;

    public fd3(ld3<KeyProtoT> ld3Var, Class<PrimitiveT> cls) {
        if (!ld3Var.g().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", ld3Var.toString(), cls.getName()));
        }
        this.f5089a = ld3Var;
        this.f5090b = cls;
    }

    private final ed3<?, KeyProtoT> g() {
        return new ed3<>(this.f5089a.a());
    }

    private final PrimitiveT h(KeyProtoT keyprotot) {
        if (Void.class.equals(this.f5090b)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.f5089a.h(keyprotot);
        return (PrimitiveT) this.f5089a.e(keyprotot, this.f5090b);
    }

    @Override // com.google.android.gms.internal.ads.dd3
    public final kr3 a(uo3 uo3Var) {
        try {
            return g().a(uo3Var);
        } catch (mq3 e7) {
            String name = this.f5089a.a().b().getName();
            throw new GeneralSecurityException(name.length() != 0 ? "Failures parsing proto of type ".concat(name) : new String("Failures parsing proto of type "), e7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.dd3
    public final PrimitiveT b(kr3 kr3Var) {
        String name = this.f5089a.d().getName();
        String concat = name.length() != 0 ? "Expected proto of type ".concat(name) : new String("Expected proto of type ");
        if (this.f5089a.d().isInstance(kr3Var)) {
            return h(kr3Var);
        }
        throw new GeneralSecurityException(concat);
    }

    @Override // com.google.android.gms.internal.ads.dd3
    public final Class<PrimitiveT> c() {
        return this.f5090b;
    }

    @Override // com.google.android.gms.internal.ads.dd3
    public final String d() {
        return this.f5089a.f();
    }

    @Override // com.google.android.gms.internal.ads.dd3
    public final qk3 e(uo3 uo3Var) {
        try {
            KeyProtoT a7 = g().a(uo3Var);
            pk3 F = qk3.F();
            F.r(this.f5089a.f());
            F.s(a7.g());
            F.t(this.f5089a.j());
            return F.o();
        } catch (mq3 e7) {
            throw new GeneralSecurityException("Unexpected proto", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.dd3
    public final PrimitiveT f(uo3 uo3Var) {
        try {
            return h(this.f5089a.b(uo3Var));
        } catch (mq3 e7) {
            String name = this.f5089a.d().getName();
            throw new GeneralSecurityException(name.length() != 0 ? "Failures parsing proto of type ".concat(name) : new String("Failures parsing proto of type "), e7);
        }
    }
}
