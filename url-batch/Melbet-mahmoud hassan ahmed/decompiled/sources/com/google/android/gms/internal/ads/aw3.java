package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class aw3 extends g.d {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<l20> f2994a;

    public aw3(l20 l20Var, byte[] bArr) {
        this.f2994a = new WeakReference<>(l20Var);
    }

    @Override // g.d
    public final void a(ComponentName componentName, g.b bVar) {
        l20 l20Var = this.f2994a.get();
        if (l20Var != null) {
            l20Var.c(bVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        l20 l20Var = this.f2994a.get();
        if (l20Var != null) {
            l20Var.d();
        }
    }
}
