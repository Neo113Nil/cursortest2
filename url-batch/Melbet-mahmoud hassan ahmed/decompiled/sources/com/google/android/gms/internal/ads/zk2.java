package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zk2 implements ij2<al2> {

    /* renamed from: a, reason: collision with root package name */
    final dc3 f15177a;

    /* renamed from: b, reason: collision with root package name */
    final String f15178b;

    /* renamed from: c, reason: collision with root package name */
    final hn0 f15179c;

    public zk2(hn0 hn0Var, dc3 dc3Var, String str, byte[] bArr) {
        this.f15179c = hn0Var;
        this.f15177a = dc3Var;
        this.f15178b = str;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<al2> a() {
        new bp0();
        final cc3 i7 = rb3.i(null);
        if (((Boolean) sw.c().b(m10.f8245l4)).booleanValue()) {
            i7 = rb3.i(null);
        }
        final cc3 i8 = rb3.i(null);
        return rb3.d(i7, i8).a(new Callable() { // from class: com.google.android.gms.internal.ads.yk2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new al2((String) cc3.this.get(), (String) i8.get());
            }
        }, wo0.f13894a);
    }
}
