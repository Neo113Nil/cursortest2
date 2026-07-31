package io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.L2;

/* loaded from: classes3.dex */
public enum ApplicationState {
    UNKNOWN("unknown"),
    BACKGROUND(L2.f37912g),
    VISIBLE("visible");


    /* renamed from: a, reason: collision with root package name */
    private final String f36973a;

    ApplicationState(String str) {
        this.f36973a = str;
    }

    @NonNull
    public static ApplicationState fromString(String str) {
        ApplicationState applicationState = UNKNOWN;
        for (ApplicationState applicationState2 : values()) {
            if (applicationState2.f36973a.equals(str)) {
                return applicationState2;
            }
        }
        return applicationState;
    }

    @NonNull
    public String getStringValue() {
        return this.f36973a;
    }
}
