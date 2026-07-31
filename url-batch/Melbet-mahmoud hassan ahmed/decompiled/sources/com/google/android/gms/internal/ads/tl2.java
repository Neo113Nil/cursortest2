package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class tl2 implements ij2<ul2> {

    /* renamed from: a, reason: collision with root package name */
    private final tn0 f12260a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12261b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f12262c;

    /* renamed from: d, reason: collision with root package name */
    private final dc3 f12263d;

    /* renamed from: e, reason: collision with root package name */
    private final String f12264e;

    /* renamed from: f, reason: collision with root package name */
    private final jn0 f12265f;

    tl2(tn0 tn0Var, boolean z6, jn0 jn0Var, dc3 dc3Var, String str, ScheduledExecutorService scheduledExecutorService, byte[] bArr) {
        this.f12260a = tn0Var;
        this.f12261b = z6;
        this.f12265f = jn0Var;
        this.f12263d = dc3Var;
        this.f12264e = str;
        this.f12262c = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<ul2> a() {
        return (o30.f9490a.e().booleanValue() || this.f12261b) ? rb3.f(rb3.o(rb3.m(rb3.i(null), new e43() { // from class: com.google.android.gms.internal.ads.sl2
            @Override // com.google.android.gms.internal.ads.e43
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new ul2(str);
            }
        }, this.f12263d), o30.f9492c.e().longValue(), TimeUnit.MILLISECONDS, this.f12262c), Exception.class, new e43() { // from class: com.google.android.gms.internal.ads.rl2
            @Override // com.google.android.gms.internal.ads.e43
            public final Object apply(Object obj) {
                tl2.this.b((Exception) obj);
                return null;
            }
        }, this.f12263d) : rb3.i(null);
    }

    final /* synthetic */ ul2 b(Exception exc) {
        this.f12260a.s(exc, "TrustlessTokenSignal");
        return null;
    }
}
