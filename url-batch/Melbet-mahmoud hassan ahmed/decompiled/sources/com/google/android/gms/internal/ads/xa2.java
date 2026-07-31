package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
public final class xa2 implements y2.f {

    /* renamed from: a, reason: collision with root package name */
    private y2.f f14107a;

    @Override // y2.f
    public final synchronized void a() {
        y2.f fVar = this.f14107a;
        if (fVar != null) {
            fVar.a();
        }
    }

    @Override // y2.f
    public final synchronized void b(View view) {
        y2.f fVar = this.f14107a;
        if (fVar != null) {
            fVar.b(view);
        }
    }

    @Override // y2.f
    public final synchronized void c() {
        y2.f fVar = this.f14107a;
        if (fVar != null) {
            fVar.c();
        }
    }

    public final synchronized void d(y2.f fVar) {
        this.f14107a = fVar;
    }
}
