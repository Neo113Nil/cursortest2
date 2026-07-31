package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* loaded from: classes.dex */
final class kn0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Context f7553f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ bp0 f7554g;

    kn0(ln0 ln0Var, Context context, bp0 bp0Var) {
        this.f7553f = context;
        this.f7554g = bp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f7554g.e(v2.a.b(this.f7553f));
        } catch (IOException | IllegalStateException | o3.g | o3.h e7) {
            this.f7554g.f(e7);
            io0.e("Exception while getting advertising Id info", e7);
        }
    }
}
