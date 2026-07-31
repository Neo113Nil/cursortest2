package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class cg2 implements ij2<dg2> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3844a;

    /* renamed from: b, reason: collision with root package name */
    private final dc3 f3845b;

    public cg2(Context context, dc3 dc3Var) {
        this.f3844a = context;
        this.f3845b = dc3Var;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<dg2> a() {
        return this.f3845b.E(new Callable() { // from class: com.google.android.gms.internal.ads.bg2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String h7;
                String i7;
                String str;
                y2.t.q();
                yo d7 = y2.t.p().h().d();
                Bundle bundle = null;
                if (d7 != null && (!y2.t.p().h().L() || !y2.t.p().h().v())) {
                    if (d7.h()) {
                        d7.g();
                    }
                    oo a7 = d7.a();
                    if (a7 != null) {
                        h7 = a7.d();
                        str = a7.e();
                        i7 = a7.f();
                        if (h7 != null) {
                            y2.t.p().h().d0(h7);
                        }
                        if (i7 != null) {
                            y2.t.p().h().M(i7);
                        }
                    } else {
                        h7 = y2.t.p().h().h();
                        i7 = y2.t.p().h().i();
                        str = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (!y2.t.p().h().v()) {
                        if (i7 == null || TextUtils.isEmpty(i7)) {
                            i7 = "no_hash";
                        }
                        bundle2.putString("v_fp_vertical", i7);
                    }
                    if (h7 != null && !y2.t.p().h().L()) {
                        bundle2.putString("fingerprint", h7);
                        if (!h7.equals(str)) {
                            bundle2.putString("v_fp", str);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new dg2(bundle);
            }
        });
    }
}
