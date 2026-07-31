package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class j02 implements j12 {

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f6896f = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: a, reason: collision with root package name */
    private final jz1 f6897a;

    /* renamed from: b, reason: collision with root package name */
    private final dc3 f6898b;

    /* renamed from: c, reason: collision with root package name */
    private final ks2 f6899c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f6900d;

    /* renamed from: e, reason: collision with root package name */
    private final r32 f6901e;

    j02(ks2 ks2Var, jz1 jz1Var, dc3 dc3Var, ScheduledExecutorService scheduledExecutorService, r32 r32Var) {
        this.f6899c = ks2Var;
        this.f6897a = jz1Var;
        this.f6898b = dc3Var;
        this.f6900d = scheduledExecutorService;
        this.f6901e = r32Var;
    }

    @Override // com.google.android.gms.internal.ads.j12
    public final cc3<ds2> a(vi0 vi0Var) {
        cc3<ds2> n7 = rb3.n(this.f6897a.b(vi0Var), new xa3() { // from class: com.google.android.gms.internal.ads.g02
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return j02.this.c((InputStream) obj);
            }
        }, this.f6898b);
        if (((Boolean) sw.c().b(m10.V3)).booleanValue()) {
            n7 = rb3.g(rb3.o(n7, ((Integer) sw.c().b(m10.W3)).intValue(), TimeUnit.SECONDS, this.f6900d), TimeoutException.class, new xa3() { // from class: com.google.android.gms.internal.ads.h02
                @Override // com.google.android.gms.internal.ads.xa3
                public final cc3 c(Object obj) {
                    return rb3.h(new fz1(5));
                }
            }, wo0.f13899f);
        }
        rb3.r(n7, new i02(this), wo0.f13899f);
        return n7;
    }

    final /* synthetic */ cc3 c(InputStream inputStream) {
        return rb3.i(new ds2(new as2(this.f6899c), cs2.a(new InputStreamReader(inputStream))));
    }
}
