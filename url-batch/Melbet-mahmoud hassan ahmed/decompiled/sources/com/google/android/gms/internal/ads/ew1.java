package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class ew1 {

    /* renamed from: a, reason: collision with root package name */
    protected final String f4784a = w20.f13665b.e();

    /* renamed from: b, reason: collision with root package name */
    protected final Map<String, String> f4785b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    protected final Executor f4786c;

    /* renamed from: d, reason: collision with root package name */
    protected final oo0 f4787d;

    /* renamed from: e, reason: collision with root package name */
    protected final boolean f4788e;

    /* renamed from: f, reason: collision with root package name */
    private final ix2 f4789f;

    protected ew1(Executor executor, oo0 oo0Var, ix2 ix2Var) {
        this.f4786c = executor;
        this.f4787d = oo0Var;
        this.f4788e = ((Boolean) sw.c().b(m10.f8290r1)).booleanValue() ? ((Boolean) sw.c().b(m10.f8320v1)).booleanValue() : ((double) qw.e().nextFloat()) <= w20.f13664a.e().doubleValue();
        this.f4789f = ix2Var;
    }

    protected final String a(Map<String, String> map) {
        return this.f4789f.a(map);
    }

    public final void b(Map<String, String> map) {
        final String a7 = this.f4789f.a(map);
        if (this.f4788e) {
            this.f4786c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.dw1
                @Override // java.lang.Runnable
                public final void run() {
                    ew1 ew1Var = ew1.this;
                    ew1Var.f4787d.b(a7);
                }
            });
        }
        a3.r1.k(a7);
    }
}
