package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collection;

/* renamed from: io.appmetrica.analytics.impl.ne, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2833ne implements InterfaceC2895po {

    /* renamed from: a, reason: collision with root package name */
    public final String f39499a;

    public C2833ne(@NonNull String str) {
        this.f39499a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2895po
    public final C2843no a(Collection<Object> collection) {
        if (!AbstractC2713io.a((Collection) collection)) {
            return new C2843no(this, true, "");
        }
        return new C2843no(this, false, this.f39499a + " is null or empty.");
    }
}
