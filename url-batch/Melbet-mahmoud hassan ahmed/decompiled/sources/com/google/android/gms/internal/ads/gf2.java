package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class gf2 implements ij2<hf2> {

    /* renamed from: a, reason: collision with root package name */
    private final dc3 f5596a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f5597b;

    public gf2(dc3 dc3Var, Context context) {
        this.f5596a = dc3Var;
        this.f5597b = context;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<hf2> a() {
        return this.f5596a.E(new Callable() { // from class: com.google.android.gms.internal.ads.ff2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return gf2.this.b();
            }
        });
    }

    final /* synthetic */ hf2 b() {
        double d7;
        Intent registerReceiver = this.f5597b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z6 = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            double intExtra2 = registerReceiver.getIntExtra("level", -1);
            double intExtra3 = registerReceiver.getIntExtra("scale", -1);
            Double.isNaN(intExtra2);
            Double.isNaN(intExtra3);
            d7 = intExtra2 / intExtra3;
            if (intExtra == 2 || intExtra == 5) {
                z6 = true;
            }
        } else {
            d7 = -1.0d;
        }
        return new hf2(d7, z6);
    }
}
