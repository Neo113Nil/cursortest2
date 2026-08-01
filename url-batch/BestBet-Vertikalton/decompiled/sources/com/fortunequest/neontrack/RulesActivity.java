package com.fortunequest.neontrack;

import U0.ViewOnClickListenerC0031a;
import X0.f;
import android.os.Bundle;
import g.AbstractActivityC0128i;
import t0.p;

/* loaded from: classes.dex */
public final class RulesActivity extends AbstractActivityC0128i {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f2090z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final f f2091y = new f(new p(this, 1));

    @Override // g.AbstractActivityC0128i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f fVar = this.f2091y;
        setContentView(((v0.f) fVar.a()).f4461a);
        ((v0.f) fVar.a()).f4462b.setOnClickListener(new ViewOnClickListenerC0031a(5, this));
    }
}
