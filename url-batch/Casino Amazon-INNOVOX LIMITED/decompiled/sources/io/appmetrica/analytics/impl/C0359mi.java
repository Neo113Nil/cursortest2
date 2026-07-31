package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.mi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0359mi implements to {

    /* renamed from: a, reason: collision with root package name */
    public final Map f1380a;

    public C0359mi(Map<String, ?> map) {
        this.f1380a = map;
    }

    @Override // io.appmetrica.analytics.impl.to
    public final ro a(String str) {
        return this.f1380a.containsKey(str) ? new ro(this, false, String.format("Failed to activate AppMetrica with provided apiKey ApiKey %s has already been used by another reporter.", str)) : new ro(this, true, "");
    }
}
