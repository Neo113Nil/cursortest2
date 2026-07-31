package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.yi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3122yi implements InterfaceC2895po {

    /* renamed from: a, reason: collision with root package name */
    public final Map f40288a;

    public C3122yi(@NonNull Map<String, ?> map) {
        this.f40288a = map;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2895po
    public final C2843no a(String str) {
        return this.f40288a.containsKey(str) ? new C2843no(this, false, String.format("Failed to activate AppMetrica with provided apiKey ApiKey %s has already been used by another reporter.", str)) : new C2843no(this, true, "");
    }
}
