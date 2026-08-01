package com.fortunequest.neontrack;

import U0.ViewOnClickListenerC0031a;
import X0.f;
import android.os.Bundle;
import g.AbstractActivityC0128i;
import java.util.Arrays;
import java.util.Locale;
import t0.p;
import v0.g;

/* loaded from: classes.dex */
public final class VictoryActivity extends AbstractActivityC0128i {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f2092z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final f f2093y = new f(new p(this, 2));

    @Override // g.AbstractActivityC0128i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f fVar = this.f2093y;
        setContentView(((g) fVar.a()).f4463a);
        int intExtra = getIntent().getIntExtra("extra_streak", 0);
        float floatExtra = getIntent().getFloatExtra("extra_multiplier", 1.0f);
        int intExtra2 = getIntent().getIntExtra("extra_level", 1);
        ((g) fVar.a()).f4466e.setText(getString(R.string.streak_label, Integer.valueOf(intExtra)));
        ((g) fVar.a()).d.setText(getString(R.string.multiplier_label, String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(floatExtra)}, 1))));
        ((g) fVar.a()).f4465c.setText(getString(R.string.level_label, Integer.valueOf(intExtra2)));
        ((g) fVar.a()).f4464b.setOnClickListener(new ViewOnClickListenerC0031a(6, this));
    }
}
