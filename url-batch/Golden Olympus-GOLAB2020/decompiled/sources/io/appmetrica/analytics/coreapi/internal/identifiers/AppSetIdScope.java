package io.appmetrica.analytics.coreapi.internal.identifiers;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public enum AppSetIdScope {
    UNKNOWN(""),
    APP("app"),
    DEVELOPER("developer");


    /* renamed from: a, reason: collision with root package name */
    private final String f36948a;

    AppSetIdScope(String str) {
        this.f36948a = str;
    }

    @NotNull
    public final String getValue() {
        return this.f36948a;
    }
}
