package com.anythink.basead.exoplayer.e;

import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    private static final Constructor<? extends e> f7320a;

    /* renamed from: b, reason: collision with root package name */
    private int f7321b;

    /* renamed from: c, reason: collision with root package name */
    private int f7322c;

    static {
        Constructor<? extends e> constructor;
        try {
            constructor = Class.forName("com.anythink.expressad.exoplayer.ext.flac.FlacExtractor").asSubclass(e.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException unused) {
            constructor = null;
        } catch (Exception e6) {
            throw new RuntimeException("Error instantiating FLAC extension", e6);
        }
        f7320a = constructor;
    }

    private synchronized c a(int i) {
        this.f7321b = i;
        return this;
    }

    private synchronized c b(int i) {
        this.f7322c = i;
        return this;
    }

    @Override // com.anythink.basead.exoplayer.e.h
    public final synchronized e[] a() {
        e[] eVarArr;
        Constructor<? extends e> constructor = f7320a;
        eVarArr = new e[constructor == null ? 2 : 3];
        eVarArr[0] = new com.anythink.basead.exoplayer.e.a.e(this.f7322c);
        eVarArr[1] = new com.anythink.basead.exoplayer.e.a.g(this.f7321b);
        if (constructor != null) {
            try {
                eVarArr[2] = constructor.newInstance(new Object[0]);
            } catch (Exception e6) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e6);
            }
        }
        return eVarArr;
    }
}
