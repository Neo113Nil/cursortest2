package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.bc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2516bc implements InterfaceC2873p2 {

    /* renamed from: a, reason: collision with root package name */
    public final H4 f38716a;

    public C2516bc(@NonNull H4 h4) {
        this.f38716a = h4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2873p2
    public final C2555co a(@NonNull C2501ao c2501ao, @NonNull C2555co c2555co) {
        int i4 = c2501ao.f38686b;
        int i5 = this.f38716a.f37603a;
        if (i4 == i5) {
            if (((C2555co) ((HashMap) c2501ao.f38685a.get(c2555co.f38802b)).get(new String(c2555co.f38801a))) != null) {
                ((HashMap) c2501ao.f38685a.get(c2555co.f38802b)).put(new String(c2555co.f38801a), c2555co);
                return c2555co;
            }
        } else if (i4 < i5) {
            ((HashMap) c2501ao.f38685a.get(c2555co.f38802b)).put(new String(c2555co.f38801a), c2555co);
            c2501ao.f38686b++;
        }
        return c2555co;
    }
}
