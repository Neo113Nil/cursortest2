package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class O4 extends Pd {

    /* renamed from: f, reason: collision with root package name */
    public final Object f38048f;

    public O4(int i4, String str, Object obj, InterfaceC2895po interfaceC2895po, W2 w22) {
        super(i4, str, interfaceC2895po, w22);
        this.f38048f = obj;
    }

    @Override // io.appmetrica.analytics.impl.Pd, io.appmetrica.analytics.impl.InterfaceC2528bo
    public final void a(@NonNull C2501ao c2501ao) {
        if (f()) {
            W2 w22 = this.f38129d;
            int i4 = this.f38127b;
            C2555co a4 = w22.a(c2501ao, (C2555co) ((HashMap) c2501ao.f38685a.get(i4)).get(this.f38126a), this);
            if (a4 != null) {
                a(a4);
            }
        }
    }

    public abstract void a(@NonNull C2555co c2555co);

    @NonNull
    public final Object g() {
        return this.f38048f;
    }
}
