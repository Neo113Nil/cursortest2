package io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate;

import com.facebook.react.uimanager.ViewProps;

/* loaded from: classes3.dex */
public enum ApplicationState {
    UNKNOWN("unknown"),
    BACKGROUND("background"),
    VISIBLE(ViewProps.VISIBLE);


    /* renamed from: a, reason: collision with root package name */
    private final String f645a;

    ApplicationState(String str) {
        this.f645a = str;
    }

    public static ApplicationState fromString(String str) {
        ApplicationState applicationState = UNKNOWN;
        for (ApplicationState applicationState2 : values()) {
            if (applicationState2.f645a.equals(str)) {
                return applicationState2;
            }
        }
        return applicationState;
    }

    public String getStringValue() {
        return this.f645a;
    }
}
