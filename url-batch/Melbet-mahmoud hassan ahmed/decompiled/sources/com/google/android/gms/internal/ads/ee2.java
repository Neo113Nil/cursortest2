package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ee2 implements ij2<ge2> {

    /* renamed from: a, reason: collision with root package name */
    private final dc3 f4575a;

    /* renamed from: b, reason: collision with root package name */
    private final rt1 f4576b;

    /* renamed from: c, reason: collision with root package name */
    private final cy1 f4577c;

    /* renamed from: d, reason: collision with root package name */
    private final he2 f4578d;

    public ee2(dc3 dc3Var, rt1 rt1Var, cy1 cy1Var, he2 he2Var) {
        this.f4575a = dc3Var;
        this.f4576b = rt1Var;
        this.f4577c = cy1Var;
        this.f4578d = he2Var;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<ge2> a() {
        if (b53.d((String) sw.c().b(m10.f8170c1)) || this.f4578d.b() || !this.f4577c.s()) {
            return rb3.i(new ge2(new Bundle(), null));
        }
        this.f4578d.a(true);
        return this.f4575a.E(new Callable() { // from class: com.google.android.gms.internal.ads.de2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ee2.this.b();
            }
        });
    }

    final /* synthetic */ ge2 b() {
        List<String> asList = Arrays.asList(((String) sw.c().b(m10.f8170c1)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                at2 b7 = this.f4576b.b(str, new JSONObject());
                b7.a();
                Bundle bundle2 = new Bundle();
                try {
                    qf0 i7 = b7.i();
                    if (i7 != null) {
                        bundle2.putString("sdk_version", i7.toString());
                    }
                } catch (ps2 unused) {
                }
                try {
                    qf0 h7 = b7.h();
                    if (h7 != null) {
                        bundle2.putString("adapter_version", h7.toString());
                    }
                } catch (ps2 unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (ps2 unused3) {
            }
        }
        return new ge2(bundle, null);
    }
}
